package io.sentry.jvmti;

import java.util.HashSet;
import java.util.WeakHashMap;

/* compiled from: FrameCache.java */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f405207a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<WeakHashMap<Throwable, io.sentry.jvmti.a[]>> f405208b = new a();

    /* compiled from: FrameCache.java */
    public static class a extends ThreadLocal<WeakHashMap<Throwable, io.sentry.jvmti.a[]>> {
        @Override // java.lang.ThreadLocal
        public final WeakHashMap<Throwable, io.sentry.jvmti.a[]> initialValue() {
            return new WeakHashMap<>();
        }
    }
}
