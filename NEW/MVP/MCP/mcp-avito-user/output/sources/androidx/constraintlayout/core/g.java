package androidx.constraintlayout.core;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
final class g {

    /* compiled from: Pools.java */
    public interface a<T> {
    }

    /* compiled from: Pools.java */
    public static class b<T> implements a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Object[] f43228a = new Object[256];

        /* renamed from: b, reason: collision with root package name */
        public int f43229b;

        public final boolean a(androidx.constraintlayout.core.b bVar) {
            int i12 = this.f43229b;
            Object[] objArr = this.f43228a;
            if (i12 >= objArr.length) {
                return false;
            }
            objArr[i12] = bVar;
            this.f43229b = i12 + 1;
            return true;
        }
    }
}
