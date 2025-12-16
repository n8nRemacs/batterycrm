package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class cf1 {
    public static final List k = ve3.j(pe1.a, re1.a, se1.a);
    public static final cf1 l = new cf1(null, null, null, new ze1(new r5g("")), new n5g(b0b.l), hd5.a, null, true, null, jfb.a);
    public final mc0 a;
    public final CharSequence b;
    public final CharSequence c;
    public final bf1 d;
    public final s5g e;
    public final List f;
    public final xe1 g;
    public final boolean h;
    public final Long i;
    public final ofb j;

    public cf1(mc0 mc0Var, CharSequence charSequence, CharSequence charSequence2, bf1 bf1Var, s5g s5gVar, List list, xe1 xe1Var, boolean z, Long l2, ofb ofbVar) {
        this.a = mc0Var;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = bf1Var;
        this.e = s5gVar;
        this.f = list;
        this.g = xe1Var;
        this.h = z;
        this.i = l2;
        this.j = ofbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.CharSequence] */
    public static cf1 a(cf1 cf1Var, mc0 mc0Var, String str, String str2, bf1 bf1Var, s5g s5gVar, List list, xe1 xe1Var, boolean z, Long l2, ofb ofbVar, int i) {
        cf1Var.getClass();
        if ((i & 2) != 0) {
            mc0Var = cf1Var.a;
        }
        mc0 mc0Var2 = mc0Var;
        String str3 = str;
        if ((i & 4) != 0) {
            str3 = cf1Var.b;
        }
        String str4 = str3;
        String str5 = (i & 8) != 0 ? cf1Var.c : str2;
        bf1 bf1Var2 = (i & 16) != 0 ? cf1Var.d : bf1Var;
        xe1 xe1Var2 = (i & 128) != 0 ? cf1Var.g : xe1Var;
        boolean z2 = (i & 256) != 0 ? cf1Var.h : z;
        Long l3 = (i & 512) != 0 ? cf1Var.i : l2;
        ofb ofbVar2 = (i & 1024) != 0 ? cf1Var.j : ofbVar;
        cf1Var.getClass();
        return new cf1(mc0Var2, str4, str5, bf1Var2, s5gVar, list, xe1Var2, z2, l3, ofbVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf1)) {
            return false;
        }
        cf1 cf1Var = (cf1) obj;
        cf1Var.getClass();
        return fni.a(this.a, cf1Var.a) && fni.a(this.b, cf1Var.b) && fni.a(this.c, cf1Var.c) && fni.a(this.d, cf1Var.d) && fni.a(this.e, cf1Var.e) && fni.a(this.f, cf1Var.f) && fni.a(this.g, cf1Var.g) && this.h == cf1Var.h && fni.a(this.i, cf1Var.i) && fni.a(this.j, cf1Var.j);
    }

    public final int hashCode() {
        mc0 mc0Var = this.a;
        int iHashCode = (mc0Var == null ? 0 : mc0Var.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        int iL = xrf.l(this.f, xc0.d((this.d.hashCode() + ((iHashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31)) * 31, 31, this.e), 31);
        xe1 xe1Var = this.g;
        int iB = a9h.b((iL + (xe1Var == null ? 0 : xe1Var.hashCode())) * 31, 31, this.h);
        Long l2 = this.i;
        return this.j.hashCode() + ((iB + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "CallLinkInfo(icon=null, avatarAbbreviationModel=" + this.a + ", callLink=" + ((Object) this.b) + ", callName=" + ((Object) this.c) + ", linkInfo=" + this.d + ", title=" + this.e + ", action=" + this.f + ", button=" + this.g + ", isNew=" + this.h + ", serverChatId=" + this.i + ", actionRightToolbar=" + this.j + ")";
    }
}
