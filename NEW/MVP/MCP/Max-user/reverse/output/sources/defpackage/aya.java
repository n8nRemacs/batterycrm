package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class aya {
    public static final bwf g = new bwf(new nwa(24));
    public final String a;
    public final CharSequence b;
    public final int c;
    public final ozi d;
    public final Drawable e;
    public final Drawable f;

    public aya(String str, CharSequence charSequence, int i, ozi oziVar, Drawable drawable, Drawable drawable2) {
        this.a = str;
        this.b = charSequence;
        this.c = i;
        this.d = oziVar;
        this.e = drawable;
        this.f = drawable2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [ozi] */
    public static aya a(aya ayaVar, CharSequence charSequence, int i, xxa xxaVar, int i2) {
        String str = ayaVar.a;
        if ((i2 & 2) != 0) {
            charSequence = ayaVar.b;
        }
        CharSequence charSequence2 = charSequence;
        xxa xxaVar2 = xxaVar;
        if ((i2 & 8) != 0) {
            xxaVar2 = ayaVar.d;
        }
        Drawable drawable = ayaVar.e;
        Drawable drawable2 = ayaVar.f;
        ayaVar.getClass();
        return new aya(str, charSequence2, i, xxaVar2, drawable, drawable2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aya)) {
            return false;
        }
        aya ayaVar = (aya) obj;
        return fni.a(this.a, ayaVar.a) && fni.a(this.b, ayaVar.b) && this.c == ayaVar.c && fni.a(this.d, ayaVar.d) && fni.a(this.e, ayaVar.e) && fni.a(this.f, ayaVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + utb.k(this.c, u45.g(this.b, this.a.hashCode() * 31, 31), 31)) * 31;
        Drawable drawable = this.e;
        int iHashCode2 = (iHashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        Drawable drawable2 = this.f;
        return iHashCode2 + (drawable2 != null ? drawable2.hashCode() : 0);
    }

    public final String toString() {
        boolean zA = wqi.a();
        Drawable drawable = this.f;
        Drawable drawable2 = this.e;
        ozi oziVar = this.d;
        int i = this.c;
        String str = this.a;
        if (!zA) {
            StringBuilder sbN = az1.n("OneMeBaseTabItemModel(id='", str, "', title=*****, state=");
            sbN.append(vb9.k(i));
            sbN.append(", indicator=");
            sbN.append(oziVar);
            sbN.append(", startIcon=");
            sbN.append(drawable2);
            sbN.append(", endIcon=");
            sbN.append(drawable);
            sbN.append(")");
            return sbN.toString();
        }
        return "OneMeBaseTabItemModel(id='" + str + "', title=" + ((Object) this.b) + ", state=" + vb9.k(i) + ", indicator=" + oziVar + ", startIcon=" + drawable2 + ", endIcon=" + drawable + ")";
    }

    public /* synthetic */ aya(String str, int i, int i2, String str2) {
        this(str, str2, i, zxa.a, null, null);
    }
}
