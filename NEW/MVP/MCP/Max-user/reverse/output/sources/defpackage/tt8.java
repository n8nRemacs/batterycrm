package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class tt8 implements au8 {
    public final CharSequence a;
    public final ArrayList b;
    public final boolean c;

    public tt8(CharSequence charSequence, ArrayList arrayList, boolean z) {
        this.a = charSequence;
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt8)) {
            return false;
        }
        tt8 tt8Var = (tt8) obj;
        return fni.a(this.a, tt8Var.a) && this.b.equals(tt8Var.b) && this.c == tt8Var.c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + ((charSequence == null ? 0 : charSequence.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinishEditMessage(text=");
        sb.append((Object) this.a);
        sb.append(", media=");
        sb.append(this.b);
        sb.append(", mediaChanged=");
        return az1.k(sb, this.c, ")");
    }
}
