package io.ktor.util.pipeline;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.m0;

/* compiled from: StackWalkingFailedFrame.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/util/pipeline/p;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lio/ktor/util/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class p implements CoroutineStackFrame, Continuation<?> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final p f400535b = new p();

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Y61.l
    public final CoroutineStackFrame getCallerFrame() {
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @Y61.k
    /* renamed from: getContext */
    public final CoroutineContext getF411960f() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Y61.l
    public final StackTraceElement getStackTraceElement() {
        return new StackTraceElement(((InterfaceC42819t) m0.f406844a.b(o.class)).f().getName(), "failedToCaptureStackFrame", "StackWalkingFailed.kt", 8);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@Y61.k Object obj) {
        o.f400534a.getClass();
        throw new IllegalStateException("Failed to capture stack frame. This is usually happens when a coroutine is running so the frame stack is changing quickly and the coroutine debug agent is unable to capture it concurrently. You may retry running your test to see this particular trace.");
    }
}
