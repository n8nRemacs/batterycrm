package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class tff {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final ArrayList h;
    public final boolean i;
    public final int j;

    public tff(rff rffVar) {
        this.a = rffVar.a;
        this.b = rffVar.b;
        this.c = rffVar.c;
        this.d = rffVar.d;
        this.e = rffVar.e;
        this.f = rffVar.f;
        this.g = rffVar.h;
        this.h = rffVar.g;
        this.i = rffVar.i;
        this.j = rffVar.j;
    }

    public static tff a(tm9 tm9Var) {
        int iM = efi.m(tm9Var);
        if (iM == 0) {
            return null;
        }
        rff rffVar = new rff();
        for (int i = 0; i < iM; i++) {
            String strW0 = tm9Var.w0();
            strW0.getClass();
            switch (strW0) {
                case "updateTime":
                    rffVar.f = efi.l(tm9Var, 0L);
                    break;
                case "id":
                    rffVar.a = tm9Var.t0();
                    break;
                case "link":
                    rffVar.h = efi.o(tm9Var);
                    break;
                case "name":
                    rffVar.b = efi.o(tm9Var);
                    break;
                case "draft":
                    rffVar.i = efi.g(tm9Var);
                    break;
                case "createTime":
                    rffVar.e = efi.l(tm9Var, 0L);
                    break;
                case "authorId":
                    rffVar.d = efi.l(tm9Var, 0L);
                    break;
                case "stickers":
                    int iF = efi.f(tm9Var);
                    ArrayList arrayList = new ArrayList(iF);
                    for (int i2 = 0; i2 < iF; i2++) {
                        arrayList.add(Long.valueOf(tm9Var.t0()));
                    }
                    rffVar.g = arrayList;
                    break;
                case "iconUrl":
                    rffVar.c = efi.o(tm9Var);
                    break;
                case "installCount":
                    rffVar.j = efi.k(tm9Var, 0);
                    break;
                default:
                    tm9Var.v();
                    break;
            }
        }
        return new tff(rffVar);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("StickerSet{id=", this.a, ", name='", this.b);
        sbN.append("', iconUrl='");
        sbN.append(this.c);
        sbN.append("', authorId=");
        sbN.append(this.d);
        az1.r(this.e, ", createTime=", ", updateTime=", sbN);
        hf3.e(this.f, ", link='", this.g, sbN);
        sbN.append("', stickers=");
        sbN.append(this.h);
        sbN.append(", draft=");
        sbN.append(this.i);
        sbN.append(", installCount=");
        sbN.append(this.j);
        sbN.append("}");
        return sbN.toString();
    }
}
