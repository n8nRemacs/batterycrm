package defpackage;

import android.text.Layout;

/* loaded from: classes2.dex */
public final class mk9 implements qk9 {
    public final Layout a;
    public final Layout b;
    public final long c;
    public final CharSequence d;
    public final String e;

    public mk9(Layout layout, Layout layout2, long j, CharSequence charSequence, String str) {
        this.a = layout;
        this.b = layout2;
        this.c = j;
        this.d = charSequence;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk9)) {
            return false;
        }
        mk9 mk9Var = (mk9) obj;
        return fni.a(this.a, mk9Var.a) && fni.a(this.b, mk9Var.b) && this.c == mk9Var.c && fni.a(this.d, mk9Var.d) && fni.a(this.e, mk9Var.e);
    }

    public final int hashCode() {
        int iG = u45.g(this.d, a9h.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31);
        String str = this.e;
        return iG + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Contact(contactTitleLayout=");
        sb.append(this.a);
        sb.append(", contactNameLayout=");
        sb.append(this.b);
        sb.append(", contactId=");
        sb.append(this.c);
        sb.append(", nameForAbbreviation=");
        sb.append((Object) this.d);
        return ctd.j(sb, ", url=", this.e, ")");
    }
}
