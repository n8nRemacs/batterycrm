package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
abstract class zzmi<T, B> {
    public abstract int a(T t12);

    public abstract zzmh b();

    public abstract zzmh c(Object obj, Object obj2);

    public abstract void d(int i12, int i13, Object obj);

    public abstract void e(int i12, long j12, Object obj);

    public abstract void f(B b12, int i12, zzhu zzhuVar);

    public abstract void g(B b12, int i12, T t12);

    public abstract void h(T t12, zzne zzneVar);

    public final boolean i(B b12, zzlk zzlkVar) throws zzjq {
        int iZzd = zzlkVar.zzd();
        int i12 = iZzd >>> 3;
        int i13 = iZzd & 7;
        if (i13 == 0) {
            k(i12, zzlkVar.zzl(), b12);
            return true;
        }
        if (i13 == 1) {
            e(i12, zzlkVar.zzk(), b12);
            return true;
        }
        if (i13 == 2) {
            f(b12, i12, zzlkVar.zzp());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return false;
            }
            if (i13 != 5) {
                throw zzjq.a();
            }
            d(i12, zzlkVar.zzf(), b12);
            return true;
        }
        zzmh zzmhVarB = b();
        int i14 = (i12 << 3) | 4;
        while (zzlkVar.zzc() != Integer.MAX_VALUE && i(zzmhVarB, zzlkVar)) {
        }
        if (i14 != zzlkVar.zzd()) {
            throw new zzjq("Protocol message end-group tag did not match expected tag.");
        }
        g(b12, i12, q(zzmhVarB));
        return true;
    }

    public abstract int j(T t12);

    public abstract void k(int i12, long j12, Object obj);

    public abstract void l(T t12, zzne zzneVar);

    public abstract void m(Object obj, B b12);

    public abstract zzmh n(Object obj);

    public abstract void o(Object obj, T t12);

    public abstract zzmh p(Object obj);

    public abstract zzmh q(Object obj);

    public abstract void r(Object obj);
}
