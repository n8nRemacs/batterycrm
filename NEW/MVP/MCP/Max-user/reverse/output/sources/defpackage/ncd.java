package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ncd implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dsd b;
    public final /* synthetic */ ocd c;

    public /* synthetic */ ncd(ocd ocdVar, dsd dsdVar, int i) {
        this.a = i;
        this.c = ocdVar;
        this.b = dsdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        n7 n7Var;
        kce kceVar;
        v32 v32Var;
        n7 n7Var2;
        kce kceVar2;
        v32 v32Var2;
        Cursor cursorN;
        n7 n7Var3;
        kce kceVar3;
        v32 v32Var3;
        n7 n7Var4;
        kce kceVar4;
        v32 v32Var4;
        n7 n7Var5;
        kce kceVar5;
        v32 v32Var5;
        kce kceVar6;
        switch (this.a) {
            case 0:
                Cursor cursorN2 = this.c.a.n(this.b);
                try {
                    int iC = s7j.c(cursorN2, "id");
                    int iC2 = s7j.c(cursorN2, "recent_type");
                    int iC3 = s7j.c(cursorN2, "recent_time");
                    int iC4 = s7j.c(cursorN2, "server_id");
                    int iC5 = s7j.c(cursorN2, "sticker_id");
                    int iC6 = s7j.c(cursorN2, "emoji");
                    int iC7 = s7j.c(cursorN2, "gif");
                    int iC8 = s7j.c(cursorN2, "gif_id");
                    Integer numValueOf = null;
                    if (cursorN2.moveToFirst()) {
                        if (cursorN2.isNull(iC5)) {
                            n7Var = null;
                        } else {
                            n7Var = new n7();
                            n7Var.a = cursorN2.getLong(iC5);
                        }
                        if (cursorN2.isNull(iC6)) {
                            kceVar = null;
                        } else {
                            kceVar = new kce(17);
                            if (cursorN2.isNull(iC6)) {
                                kceVar.b = null;
                            } else {
                                kceVar.b = cursorN2.getString(iC6);
                            }
                        }
                        if (cursorN2.isNull(iC7) && cursorN2.isNull(iC8)) {
                            v32Var = null;
                        } else {
                            v32Var = new v32(9, false);
                            if (cursorN2.isNull(iC7)) {
                                v32Var.c = null;
                            } else {
                                v32Var.c = cursorN2.getBlob(iC7);
                            }
                            v32Var.b = cursorN2.getLong(iC8);
                        }
                        pcd pcdVar = new pcd();
                        pcdVar.a = cursorN2.getLong(iC);
                        if (!cursorN2.isNull(iC2)) {
                            numValueOf = Integer.valueOf(cursorN2.getInt(iC2));
                        }
                        pcdVar.b = v7j.b(numValueOf);
                        pcdVar.c = cursorN2.getLong(iC3);
                        pcdVar.d = cursorN2.getLong(iC4);
                        pcdVar.e = n7Var;
                        pcdVar.f = kceVar;
                        pcdVar.g = v32Var;
                        numValueOf = pcdVar;
                    }
                    cursorN2.close();
                    return numValueOf;
                } finally {
                    cursorN2.close();
                }
            case 1:
                Cursor cursorN3 = this.c.a.n(this.b);
                try {
                    int iC9 = s7j.c(cursorN3, "id");
                    int iC10 = s7j.c(cursorN3, "recent_type");
                    int iC11 = s7j.c(cursorN3, "recent_time");
                    int iC12 = s7j.c(cursorN3, "server_id");
                    int iC13 = s7j.c(cursorN3, "sticker_id");
                    int iC14 = s7j.c(cursorN3, "emoji");
                    int iC15 = s7j.c(cursorN3, "gif");
                    int iC16 = s7j.c(cursorN3, "gif_id");
                    Integer numValueOf2 = null;
                    if (cursorN3.moveToFirst()) {
                        if (cursorN3.isNull(iC13)) {
                            n7Var2 = null;
                        } else {
                            n7Var2 = new n7();
                            n7Var2.a = cursorN3.getLong(iC13);
                        }
                        if (cursorN3.isNull(iC14)) {
                            kceVar2 = null;
                        } else {
                            kceVar2 = new kce(17);
                            if (cursorN3.isNull(iC14)) {
                                kceVar2.b = null;
                            } else {
                                kceVar2.b = cursorN3.getString(iC14);
                            }
                        }
                        if (cursorN3.isNull(iC15) && cursorN3.isNull(iC16)) {
                            v32Var2 = null;
                        } else {
                            v32Var2 = new v32(9, false);
                            if (cursorN3.isNull(iC15)) {
                                v32Var2.c = null;
                            } else {
                                v32Var2.c = cursorN3.getBlob(iC15);
                            }
                            v32Var2.b = cursorN3.getLong(iC16);
                        }
                        pcd pcdVar2 = new pcd();
                        pcdVar2.a = cursorN3.getLong(iC9);
                        if (!cursorN3.isNull(iC10)) {
                            numValueOf2 = Integer.valueOf(cursorN3.getInt(iC10));
                        }
                        pcdVar2.b = v7j.b(numValueOf2);
                        pcdVar2.c = cursorN3.getLong(iC11);
                        pcdVar2.d = cursorN3.getLong(iC12);
                        pcdVar2.e = n7Var2;
                        pcdVar2.f = kceVar2;
                        pcdVar2.g = v32Var2;
                        numValueOf2 = pcdVar2;
                    }
                    cursorN3.close();
                    return numValueOf2;
                } finally {
                    cursorN3.close();
                }
            case 2:
                cursorN = this.c.a.n(this.b);
                try {
                    int iC17 = s7j.c(cursorN, "id");
                    int iC18 = s7j.c(cursorN, "recent_type");
                    int iC19 = s7j.c(cursorN, "recent_time");
                    int iC20 = s7j.c(cursorN, "server_id");
                    int iC21 = s7j.c(cursorN, "sticker_id");
                    int iC22 = s7j.c(cursorN, "emoji");
                    int iC23 = s7j.c(cursorN, "gif");
                    int iC24 = s7j.c(cursorN, "gif_id");
                    Integer numValueOf3 = null;
                    if (cursorN.moveToFirst()) {
                        if (cursorN.isNull(iC21)) {
                            n7Var3 = null;
                        } else {
                            n7Var3 = new n7();
                            n7Var3.a = cursorN.getLong(iC21);
                        }
                        if (cursorN.isNull(iC22)) {
                            kceVar3 = null;
                        } else {
                            kceVar3 = new kce(17);
                            if (cursorN.isNull(iC22)) {
                                kceVar3.b = null;
                            } else {
                                kceVar3.b = cursorN.getString(iC22);
                            }
                        }
                        if (cursorN.isNull(iC23) && cursorN.isNull(iC24)) {
                            v32Var3 = null;
                        } else {
                            v32Var3 = new v32(9, false);
                            if (cursorN.isNull(iC23)) {
                                v32Var3.c = null;
                            } else {
                                v32Var3.c = cursorN.getBlob(iC23);
                            }
                            v32Var3.b = cursorN.getLong(iC24);
                        }
                        pcd pcdVar3 = new pcd();
                        pcdVar3.a = cursorN.getLong(iC17);
                        if (!cursorN.isNull(iC18)) {
                            numValueOf3 = Integer.valueOf(cursorN.getInt(iC18));
                        }
                        pcdVar3.b = v7j.b(numValueOf3);
                        pcdVar3.c = cursorN.getLong(iC19);
                        pcdVar3.d = cursorN.getLong(iC20);
                        pcdVar3.e = n7Var3;
                        pcdVar3.f = kceVar3;
                        pcdVar3.g = v32Var3;
                        numValueOf3 = pcdVar3;
                    }
                    cursorN.close();
                    return numValueOf3;
                } finally {
                    cursorN.close();
                }
            case 3:
                Cursor cursorN4 = this.c.a.n(this.b);
                try {
                    int iC25 = s7j.c(cursorN4, "id");
                    int iC26 = s7j.c(cursorN4, "recent_type");
                    int iC27 = s7j.c(cursorN4, "recent_time");
                    int iC28 = s7j.c(cursorN4, "server_id");
                    int iC29 = s7j.c(cursorN4, "sticker_id");
                    int iC30 = s7j.c(cursorN4, "emoji");
                    int iC31 = s7j.c(cursorN4, "gif");
                    int iC32 = s7j.c(cursorN4, "gif_id");
                    Integer numValueOf4 = null;
                    if (cursorN4.moveToFirst()) {
                        if (cursorN4.isNull(iC29)) {
                            n7Var4 = null;
                        } else {
                            n7Var4 = new n7();
                            n7Var4.a = cursorN4.getLong(iC29);
                        }
                        if (cursorN4.isNull(iC30)) {
                            kceVar4 = null;
                        } else {
                            kceVar4 = new kce(17);
                            if (cursorN4.isNull(iC30)) {
                                kceVar4.b = null;
                            } else {
                                kceVar4.b = cursorN4.getString(iC30);
                            }
                        }
                        if (cursorN4.isNull(iC31) && cursorN4.isNull(iC32)) {
                            v32Var4 = null;
                        } else {
                            v32Var4 = new v32(9, false);
                            if (cursorN4.isNull(iC31)) {
                                v32Var4.c = null;
                            } else {
                                v32Var4.c = cursorN4.getBlob(iC31);
                            }
                            v32Var4.b = cursorN4.getLong(iC32);
                        }
                        pcd pcdVar4 = new pcd();
                        pcdVar4.a = cursorN4.getLong(iC25);
                        if (!cursorN4.isNull(iC26)) {
                            numValueOf4 = Integer.valueOf(cursorN4.getInt(iC26));
                        }
                        pcdVar4.b = v7j.b(numValueOf4);
                        pcdVar4.c = cursorN4.getLong(iC27);
                        pcdVar4.d = cursorN4.getLong(iC28);
                        pcdVar4.e = n7Var4;
                        pcdVar4.f = kceVar4;
                        pcdVar4.g = v32Var4;
                        numValueOf4 = pcdVar4;
                    }
                    cursorN4.close();
                    return numValueOf4;
                } finally {
                }
            default:
                cursorN = this.c.a.n(this.b);
                try {
                    int iC33 = s7j.c(cursorN, "id");
                    int iC34 = s7j.c(cursorN, "recent_type");
                    int iC35 = s7j.c(cursorN, "recent_time");
                    int iC36 = s7j.c(cursorN, "server_id");
                    int iC37 = s7j.c(cursorN, "sticker_id");
                    int iC38 = s7j.c(cursorN, "emoji");
                    int iC39 = s7j.c(cursorN, "gif");
                    int iC40 = s7j.c(cursorN, "gif_id");
                    ArrayList arrayList = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        if (cursorN.isNull(iC37)) {
                            n7Var5 = null;
                        } else {
                            n7Var5 = new n7();
                            n7Var5.a = cursorN.getLong(iC37);
                        }
                        if (cursorN.isNull(iC38)) {
                            kceVar5 = null;
                        } else {
                            kceVar5 = new kce(17);
                            if (cursorN.isNull(iC38)) {
                                kceVar5.b = null;
                            } else {
                                kceVar5.b = cursorN.getString(iC38);
                            }
                        }
                        if (cursorN.isNull(iC39) && cursorN.isNull(iC40)) {
                            v32Var5 = null;
                            kceVar6 = kceVar5;
                        } else {
                            v32Var5 = new v32(9, false);
                            if (cursorN.isNull(iC39)) {
                                v32Var5.c = null;
                            } else {
                                v32Var5.c = cursorN.getBlob(iC39);
                            }
                            kceVar6 = kceVar5;
                            v32Var5.b = cursorN.getLong(iC40);
                        }
                        pcd pcdVar5 = new pcd();
                        int i = iC37;
                        int i2 = iC38;
                        pcdVar5.a = cursorN.getLong(iC33);
                        pcdVar5.b = v7j.b(cursorN.isNull(iC34) ? null : Integer.valueOf(cursorN.getInt(iC34)));
                        pcdVar5.c = cursorN.getLong(iC35);
                        pcdVar5.d = cursorN.getLong(iC36);
                        pcdVar5.e = n7Var5;
                        pcdVar5.f = kceVar6;
                        pcdVar5.g = v32Var5;
                        arrayList.add(pcdVar5);
                        iC37 = i;
                        iC38 = i2;
                    }
                    cursorN.close();
                    return arrayList;
                } finally {
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
            case 2:
                this.b.y();
                break;
            case 3:
                this.b.y();
                break;
            default:
                this.b.y();
                break;
        }
    }
}
