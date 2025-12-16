package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class yig extends b4a {
    public final long j;
    public final long k;

    public yig(String str, int i, int i2, int i3, long j, long j2, boolean z) {
        super(0L, j2 - j, Collections.singletonList(new z3a(i, str, i2, i3)), z);
        this.j = j;
        this.k = j2;
    }

    @Override // defpackage.ml0, defpackage.f2h
    public final long b() {
        return this.j;
    }

    @Override // defpackage.ml0
    public final long c() {
        return this.k;
    }

    @Override // defpackage.b4a, defpackage.ml0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yig.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        yig yigVar = (yig) obj;
        return this.j == yigVar.j && this.k == yigVar.k;
    }

    @Override // defpackage.b4a, defpackage.ml0
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        long j = this.j;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.k;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }
}
