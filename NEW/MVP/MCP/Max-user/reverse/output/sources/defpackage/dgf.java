package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class dgf implements t98 {
    public final int X;
    public final boolean Y;
    public final boolean Z;
    public final long a;
    public final s5g b;
    public final String c;
    public final Integer d;
    public final List o;
    public final int s0;
    public final long t0;

    public dgf(long j, s5g s5gVar, String str, Integer num, List list, int i, boolean z, boolean z2) {
        this.a = j;
        this.b = s5gVar;
        this.c = str;
        this.d = num;
        this.o = list;
        this.X = i;
        this.Y = z;
        this.Z = z2;
        this.s0 = i == 5 ? uab.l : uab.k;
        this.t0 = j >= 0 ? -j : j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
    public static dgf l(dgf dgfVar, ArrayList arrayList, boolean z, boolean z2, int i) {
        long j = dgfVar.a;
        s5g s5gVar = dgfVar.b;
        String str = dgfVar.c;
        Integer num = dgfVar.d;
        ArrayList arrayList2 = arrayList;
        if ((i & 16) != 0) {
            arrayList2 = dgfVar.o;
        }
        ArrayList arrayList3 = arrayList2;
        int i2 = dgfVar.X;
        if ((i & 64) != 0) {
            z = dgfVar.Y;
        }
        boolean z3 = z;
        if ((i & 128) != 0) {
            z2 = dgfVar.Z;
        }
        dgfVar.getClass();
        return new dgf(j, s5gVar, str, num, arrayList3, i2, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dgf)) {
            return false;
        }
        dgf dgfVar = (dgf) obj;
        return this.a == dgfVar.a && fni.a(this.b, dgfVar.b) && fni.a(this.c, dgfVar.c) && fni.a(this.d, dgfVar.d) && fni.a(this.o, dgfVar.o) && this.X == dgfVar.X && this.Y == dgfVar.Y && this.Z == dgfVar.Z;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.t0;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return this.t0 == t98Var.getItemId();
    }

    public final int hashCode() {
        int iD = xc0.d(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.d;
        return Boolean.hashCode(this.Z) + a9h.b(utb.k(this.X, xrf.l(this.o, (iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31), 31), 31, this.Y);
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        if (!(t98Var instanceof dgf)) {
            return null;
        }
        dgf dgfVar = (dgf) t98Var;
        boolean z = dgfVar.Y;
        if (this.Y != z) {
            return new agf(z);
        }
        int i = dgfVar.X;
        if (this.X != i) {
            return new bgf(i);
        }
        return null;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.s0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerSetModel(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        sb.append(this.c);
        sb.append(", iconRes=");
        sb.append(this.d);
        sb.append(", stickers=");
        sb.append(this.o);
        sb.append(", type=");
        sb.append(ctd.q(this.X));
        hf3.f(", selected=", ", favorite=", sb, this.Y, this.Z);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ dgf(long j, s5g s5gVar, String str, Integer num, List list, int i, boolean z, boolean z2, int i2) {
        this(j, s5gVar, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : num, list, i, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? false : z2);
    }
}
