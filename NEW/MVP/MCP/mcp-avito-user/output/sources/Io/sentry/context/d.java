package io.sentry.context;

/* compiled from: ThreadLocalContextManager.java */
/* loaded from: classes8.dex */
public class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal<io.sentry.context.a> f405154a = new a();

    /* compiled from: ThreadLocalContextManager.java */
    public class a extends ThreadLocal<io.sentry.context.a> {
        @Override // java.lang.ThreadLocal
        public final io.sentry.context.a initialValue() {
            return new io.sentry.context.a();
        }
    }

    @Override // io.sentry.context.b
    public final io.sentry.context.a getContext() {
        return this.f405154a.get();
    }
}
