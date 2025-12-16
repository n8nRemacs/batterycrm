package defpackage;

/* loaded from: classes2.dex */
public final class o6g {
    public final int a;
    public final int b;
    public final int c;

    public o6g(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6g)) {
            return false;
        }
        o6g o6gVar = (o6g) obj;
        return this.a == o6gVar.a && this.b == o6gVar.b && this.c == o6gVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + xrf.k(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return ho7.j(wy1.k("TextsUiModel(titleRes=", this.a, ", descriptionRes=", this.b, ", buttonRes="), this.c, ")");
    }
}
