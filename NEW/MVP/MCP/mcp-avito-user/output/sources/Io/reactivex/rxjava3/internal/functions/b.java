package io.reactivex.rxjava3.internal.functions;

import java.util.Objects;
import l41.d;

/* compiled from: ObjectHelper.java */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final d<Object, Object> f402016a = new a();

    /* compiled from: ObjectHelper.java */
    public static final class a implements d<Object, Object> {
        @Override // l41.d
        public final boolean a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }
    }

    public b() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(int i12, String str) {
        if (i12 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i12);
    }
}
