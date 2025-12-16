package defpackage;

import android.text.SpannableStringBuilder;

/* loaded from: classes.dex */
public final class t08 {
    public static final t08 f = new t08(null, null, false, false, uxg.d);
    public final zi1 a;
    public final CharSequence b;
    public final boolean c;
    public final boolean d;
    public final uxg e;

    public t08(zi1 zi1Var, SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2, uxg uxgVar) {
        this.a = zi1Var;
        this.b = spannableStringBuilder;
        this.c = z;
        this.d = z2;
        this.e = uxgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t08)) {
            return false;
        }
        t08 t08Var = (t08) obj;
        return fni.a(this.a, t08Var.a) && fni.a(this.b, t08Var.b) && this.c == t08Var.c && this.d == t08Var.d && this.e == t08Var.e;
    }

    public final int hashCode() {
        zi1 zi1Var = this.a;
        int iHashCode = (zi1Var == null ? 0 : zi1Var.hashCode()) * 31;
        CharSequence charSequence = this.b;
        return this.e.hashCode() + a9h.b(a9h.b((iHashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LabelSpeakerState(participantId=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", isPinned=");
        az1.t(", isTalking=", ", action=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
