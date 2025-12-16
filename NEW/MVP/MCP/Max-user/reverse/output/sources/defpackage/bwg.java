package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes2.dex */
public final class bwg implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dsd b;
    public final /* synthetic */ ewg c;

    public /* synthetic */ bwg(ewg ewgVar, dsd dsdVar, int i) {
        this.a = i;
        this.c = ewgVar;
        this.b = dsdVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        cug cugVar;
        svg svgVar;
        Integer num;
        svg svgVar2;
        int i;
        switch (this.a) {
            case 0:
                Cursor cursorN = this.c.a.n(this.b);
                try {
                    int iC = s7j.c(cursorN, "attach_local_id");
                    int iC2 = s7j.c(cursorN, "prepared_path");
                    int iC3 = s7j.c(cursorN, "file_name");
                    int iC4 = s7j.c(cursorN, "upload_url");
                    int iC5 = s7j.c(cursorN, "upload_progress");
                    int iC6 = s7j.c(cursorN, "total_bytes");
                    int iC7 = s7j.c(cursorN, "upload_status");
                    int iC8 = s7j.c(cursorN, "created_time");
                    int iC9 = s7j.c(cursorN, ClientCookie.PATH_ATTR);
                    int iC10 = s7j.c(cursorN, "last_modified");
                    int iC11 = s7j.c(cursorN, "upload_type");
                    int iC12 = s7j.c(cursorN, "photo_token");
                    int iC13 = s7j.c(cursorN, "attach_id");
                    if (cursorN.moveToFirst()) {
                        ey2 ey2Var = new ey2(4, false);
                        if (cursorN.isNull(iC9)) {
                            ey2Var.c = null;
                        } else {
                            ey2Var.c = cursorN.getString(iC9);
                        }
                        ey2Var.b = cursorN.getLong(iC10);
                        ey2Var.d = coi.d(cursorN.isNull(iC11) ? null : Integer.valueOf(cursorN.getInt(iC11)));
                        if (cursorN.isNull(iC12) && cursorN.isNull(iC13)) {
                            svgVar = null;
                        } else {
                            svgVar = new svg();
                            if (cursorN.isNull(iC12)) {
                                svgVar.a = null;
                            } else {
                                svgVar.a = cursorN.getString(iC12);
                            }
                            svgVar.b = cursorN.getLong(iC13);
                        }
                        cug cugVar2 = new cug();
                        if (cursorN.isNull(iC)) {
                            cugVar2.b = null;
                        } else {
                            cugVar2.b = cursorN.getString(iC);
                        }
                        if (cursorN.isNull(iC2)) {
                            cugVar2.c = null;
                        } else {
                            cugVar2.c = cursorN.getString(iC2);
                        }
                        if (cursorN.isNull(iC3)) {
                            cugVar2.d = null;
                        } else {
                            cugVar2.d = cursorN.getString(iC3);
                        }
                        if (cursorN.isNull(iC4)) {
                            num = null;
                            cugVar2.e = null;
                        } else {
                            num = null;
                            cugVar2.e = cursorN.getString(iC4);
                        }
                        cugVar2.f = cursorN.getFloat(iC5);
                        cugVar2.g = cursorN.getLong(iC6);
                        cugVar2.h = coi.c(cursorN.isNull(iC7) ? num : Integer.valueOf(cursorN.getInt(iC7)));
                        cugVar2.j = cursorN.getLong(iC8);
                        cugVar2.a = ey2Var;
                        cugVar2.i = svgVar;
                        cugVar = cugVar2;
                    } else {
                        cugVar = null;
                    }
                    return cugVar;
                } finally {
                }
            case 1:
                Cursor cursorN2 = this.c.a.n(this.b);
                try {
                    int iC14 = s7j.c(cursorN2, "attach_local_id");
                    int iC15 = s7j.c(cursorN2, "prepared_path");
                    int iC16 = s7j.c(cursorN2, "file_name");
                    int iC17 = s7j.c(cursorN2, "upload_url");
                    int iC18 = s7j.c(cursorN2, "upload_progress");
                    int iC19 = s7j.c(cursorN2, "total_bytes");
                    int iC20 = s7j.c(cursorN2, "upload_status");
                    int iC21 = s7j.c(cursorN2, "created_time");
                    int iC22 = s7j.c(cursorN2, ClientCookie.PATH_ATTR);
                    int iC23 = s7j.c(cursorN2, "last_modified");
                    int iC24 = s7j.c(cursorN2, "upload_type");
                    int iC25 = s7j.c(cursorN2, "photo_token");
                    int iC26 = s7j.c(cursorN2, "attach_id");
                    ArrayList arrayList = new ArrayList(cursorN2.getCount());
                    while (cursorN2.moveToNext()) {
                        ArrayList arrayList2 = arrayList;
                        int i2 = iC21;
                        ey2 ey2Var2 = new ey2(4, false);
                        Integer numValueOf = null;
                        if (cursorN2.isNull(iC22)) {
                            ey2Var2.c = null;
                        } else {
                            ey2Var2.c = cursorN2.getString(iC22);
                        }
                        int i3 = iC22;
                        ey2Var2.b = cursorN2.getLong(iC23);
                        ey2Var2.d = coi.d(cursorN2.isNull(iC24) ? null : Integer.valueOf(cursorN2.getInt(iC24)));
                        if (cursorN2.isNull(iC25) && cursorN2.isNull(iC26)) {
                            i = iC23;
                            svgVar2 = null;
                        } else {
                            svgVar2 = new svg();
                            if (cursorN2.isNull(iC25)) {
                                svgVar2.a = null;
                            } else {
                                svgVar2.a = cursorN2.getString(iC25);
                            }
                            i = iC23;
                            svgVar2.b = cursorN2.getLong(iC26);
                        }
                        cug cugVar3 = new cug();
                        if (cursorN2.isNull(iC14)) {
                            cugVar3.b = null;
                        } else {
                            cugVar3.b = cursorN2.getString(iC14);
                        }
                        if (cursorN2.isNull(iC15)) {
                            cugVar3.c = null;
                        } else {
                            cugVar3.c = cursorN2.getString(iC15);
                        }
                        if (cursorN2.isNull(iC16)) {
                            cugVar3.d = null;
                        } else {
                            cugVar3.d = cursorN2.getString(iC16);
                        }
                        if (cursorN2.isNull(iC17)) {
                            cugVar3.e = null;
                        } else {
                            cugVar3.e = cursorN2.getString(iC17);
                        }
                        cugVar3.f = cursorN2.getFloat(iC18);
                        int i4 = iC15;
                        int i5 = iC16;
                        cugVar3.g = cursorN2.getLong(iC19);
                        if (!cursorN2.isNull(iC20)) {
                            numValueOf = Integer.valueOf(cursorN2.getInt(iC20));
                        }
                        cugVar3.h = coi.c(numValueOf);
                        int i6 = iC17;
                        cugVar3.j = cursorN2.getLong(i2);
                        cugVar3.a = ey2Var2;
                        cugVar3.i = svgVar2;
                        arrayList2.add(cugVar3);
                        iC21 = i2;
                        iC15 = i4;
                        iC17 = i6;
                        iC22 = i3;
                        iC23 = i;
                        iC16 = i5;
                        arrayList = arrayList2;
                    }
                    return arrayList;
                } finally {
                }
            default:
                Cursor cursorN3 = this.c.a.n(this.b);
                try {
                    vvg vvgVarC = null;
                    Integer numValueOf2 = null;
                    if (cursorN3.moveToFirst()) {
                        if (!cursorN3.isNull(0)) {
                            numValueOf2 = Integer.valueOf(cursorN3.getInt(0));
                        }
                        vvgVarC = coi.c(numValueOf2);
                    }
                    return vvgVarC;
                } finally {
                    cursorN3.close();
                }
        }
    }

    public final void finalize() {
        switch (this.a) {
            case 0:
                this.b.y();
                break;
            case 1:
                this.b.y();
                break;
            default:
                this.b.y();
                break;
        }
    }
}
