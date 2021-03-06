package io.reflectoring.sqs.internal;

import io.reflectoring.sqs.api.SqsMessageHandler;

import java.util.concurrent.atomic.AtomicInteger;

class TestMessageHandler implements SqsMessageHandler<TestMessage> {

    private AtomicInteger counter = new AtomicInteger();

    @Override
    public void handle(TestMessage message) {
        counter.incrementAndGet();
    }

    @Override
    public Class<TestMessage> messageType() {
        return TestMessage.class;
    }

    int getCount() {
        return counter.get();
    }
}
