package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class e62 implements g62 {
    public final String X;
    public final s5g Y;
    public final int Z;
    public final int a;
    public final List b;
    public final boolean c;
    public final la5 d;
    public final String o;
    public final long s0;
    public final int t0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [s5g] */
    public e62(int i, List list, boolean z, la5 la5Var, String str, String str2, r5g r5gVar, long j, int i2) {
        this(i, list, z, la5Var, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? null : str2, (i2 & 64) != 0 ? la5Var.b : r5gVar, la5Var.c, j);
    }

    public static e62 l(e62 e62Var, boolean z) {
        return new e62(e62Var.a, e62Var.b, z, e62Var.d, e62Var.o, e62Var.X, e62Var.Y, e62Var.Z, e62Var.s0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e62.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        e62 e62Var = (e62) obj;
        return this.a == e62Var.a && this.c == e62Var.c && this.d == e62Var.d && fni.a(this.o, e62Var.o) && fni.a(this.X, e62Var.X) && fni.a(this.Y, e62Var.Y) && this.Z == e62Var.Z && this.s0 == e62Var.s0 && this.t0 == e62Var.t0;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.s0;
    }

    @Override // defpackage.g62
    public final s5g getName() {
        return this.Y;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + a9h.b(this.a * 31, 31, this.c)) * 31;
        String str = this.o;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.X;
        return a9h.a((xc0.d((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.Y) + this.Z) * 31, 31, this.s0) + this.t0;
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        boolean z;
        if ((t98Var instanceof e62) && this.c != (z = ((e62) t98Var).c)) {
            return new d62(z);
        }
        return null;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.t0;
    }

    @Override // defpackage.g62
    public final boolean s() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmojiGroup(groupIndex=");
        sb.append(this.a);
        sb.append(", emojis=");
        sb.append(this.b);
        sb.append(", selected=");
        sb.append(this.c);
        sb.append(", category=");
        sb.append(this.d);
        sb.append(", iconUrl=");
        ho7.r(sb, this.o, ", iconLottieUrl=", this.X, ", name=");
        sb.append(this.Y);
        sb.append(", iconRes=");
        sb.append(this.Z);
        sb.append(", clearCategoryAvailable=false, itemId=");
        return ho7.k(sb, this.s0, ")");
    }

    public e62(int i, List list, boolean z, la5 la5Var, String str, String str2, s5g s5gVar, int i2, long j) {
        this.a = i;
        this.b = list;
        this.c = z;
        this.d = la5Var;
        this.o = str;
        this.X = str2;
        this.Y = s5gVar;
        this.Z = i2;
        this.s0 = j;
        this.t0 = w5b.q;
    }
}
