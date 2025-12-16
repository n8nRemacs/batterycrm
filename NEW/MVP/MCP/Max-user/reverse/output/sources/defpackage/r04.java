package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class r04 implements Serializable {
    public final int X;
    public final boolean Y;
    public final gx3 a;
    public final String b;
    public final String c;
    public final c8c d;
    public final List o;

    public r04(gx3 gx3Var, String str, String str2, c8c c8cVar, ArrayList arrayList, int i, boolean z) {
        this.a = gx3Var;
        this.b = str;
        this.c = str2;
        this.d = c8cVar;
        this.o = arrayList;
        this.X = i;
        this.Y = z;
    }

    public static r04 a(tm9 tm9Var) {
        int iM = efi.m(tm9Var);
        ArrayList arrayList = null;
        int iS0 = 0;
        boolean zP0 = false;
        gx3 gx3VarG = null;
        String strW0 = null;
        String strW02 = null;
        c8c c8cVarA = null;
        for (int i = 0; i < iM; i++) {
            String strW03 = tm9Var.w0();
            strW03.getClass();
            switch (strW03) {
                case "summary":
                    strW0 = tm9Var.w0();
                    break;
                case "restricted":
                    zP0 = tm9Var.p0();
                    break;
                case "presence":
                    c8cVarA = c8c.a(tm9Var);
                    break;
                case "friends":
                    int iF = efi.f(tm9Var);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < iF; i2++) {
                        arrayList2.add(Long.valueOf(tm9Var.t0()));
                    }
                    arrayList = arrayList2;
                    break;
                case "feedback":
                    strW02 = tm9Var.w0();
                    break;
                case "friendsCount":
                    iS0 = tm9Var.s0();
                    break;
                case "contact":
                    gx3VarG = gx3.g(tm9Var);
                    break;
                default:
                    tm9Var.v();
                    break;
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return new r04(gx3VarG, strW0, strW02, c8cVarA, arrayList, iS0, zP0);
    }

    public final String toString() {
        return "{contact=" + this.a + ", summary='" + l8g.f(this.b) + "', feedback='" + l8g.f(this.c) + "', friends=" + zdi.a(this.o) + ", friendsCount=" + this.X + ", restricted=" + this.Y + "}";
    }
}
