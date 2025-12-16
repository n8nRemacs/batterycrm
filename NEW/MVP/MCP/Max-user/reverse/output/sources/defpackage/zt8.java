package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zt8 implements au8 {
    public final CharSequence a;
    public final ArrayList b;
    public final boolean c;

    public zt8(CharSequence charSequence, ArrayList arrayList, boolean z) {
        this.a = charSequence;
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt8)) {
            return false;
        }
        zt8 zt8Var = (zt8) obj;
        return fni.a(this.a, zt8Var.a) && this.b.equals(zt8Var.b) && this.c == zt8Var.c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + ((charSequence == null ? 0 : charSequence.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendMedia(caption=");
        sb.append((Object) this.a);
        sb.append(", media=");
        sb.append(this.b);
        sb.append(", sendAsFile=");
        return az1.k(sb, this.c, ")");
    }
}
