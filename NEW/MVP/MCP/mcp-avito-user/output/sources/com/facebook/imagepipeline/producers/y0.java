package com.facebook.imagepipeline.producers;

import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: ThreadHandoffProducerQueueImpl.java */
@Nullsafe
/* loaded from: classes15.dex */
public class y0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f340773a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f340774b;

    public y0(Executor executor) {
        executor.getClass();
        this.f340774b = executor;
        this.f340773a = new ArrayDeque();
    }
}
