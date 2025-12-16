package org.mockito.internal.progress;

/* compiled from: ThreadSafeMockingProgress.java */
/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<c> f421701a = new a();

    /* compiled from: ThreadSafeMockingProgress.java */
    public class a extends ThreadLocal<c> {
        @Override // java.lang.ThreadLocal
        public final c initialValue() {
            return new e();
        }
    }

    public static final c a() {
        return f421701a.get();
    }
}
