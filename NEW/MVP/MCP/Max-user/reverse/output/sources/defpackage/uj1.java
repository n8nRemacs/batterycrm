package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class uj1 implements t98 {
    public final s5g a;
    public final s5g b;
    public final int c = yza.v;
    public final long d = BuildConfig.MAX_TIME_TO_UPLOAD;

    public uj1(n5g n5gVar, r5g r5gVar) {
        this.a = n5gVar;
        this.b = r5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj1)) {
            return false;
        }
        uj1 uj1Var = (uj1) obj;
        uj1Var.getClass();
        return fni.a(this.a, uj1Var.a);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.d;
    }

    public final int hashCode() {
        int iK = xrf.k(0, az1.v(4) * 31, 31);
        s5g s5gVar = this.a;
        return iK + (s5gVar != null ? s5gVar.hashCode() : 0);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.c;
    }

    public final String toString() {
        return "CallPresettingsChangeNameItem(sectionItemType=" + ctd.v(4) + ", itemSection=0, errorMessage=" + this.a + ", text=" + this.b + ")";
    }
}
