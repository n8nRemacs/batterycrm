package defpackage;

/* loaded from: classes2.dex */
public final class m96 extends n96 {
    public final CharSequence a;
    public final String b;
    public final boolean c;

    public m96(CharSequence charSequence, String str, boolean z) {
        this.a = charSequence;
        this.b = str;
        this.c = z;
    }

    public static m96 b(m96 m96Var, CharSequence charSequence, boolean z, int i) {
        if ((i & 1) != 0) {
            charSequence = m96Var.a;
        }
        String str = m96Var.b;
        m96Var.getClass();
        return new m96(charSequence, str, z);
    }

    @Override // defpackage.n96
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m96)) {
            return false;
        }
        m96 m96Var = (m96) obj;
        return fni.a(this.a, m96Var.a) && fni.a(this.b, m96Var.b) && this.c == m96Var.c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.c) + u45.e((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Edit(name=");
        sb.append((Object) this.a);
        sb.append(", folderId=");
        sb.append(this.b);
        sb.append(", canSave=");
        return az1.k(sb, this.c, ")");
    }

    public /* synthetic */ m96(String str, CharSequence charSequence, int i) {
        this((i & 1) != 0 ? null : charSequence, str, false);
    }
}
