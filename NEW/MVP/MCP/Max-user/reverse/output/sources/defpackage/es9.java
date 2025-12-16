package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final /* synthetic */ class es9 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ es9(k18 k18Var, vu9 vu9Var) {
        this.a = 1;
        this.c = k18Var;
        this.b = vu9Var;
    }

    private final Object a() {
        int i;
        hk3 ik3Var;
        qja qjaVar = (qja) this.b;
        uia uiaVar = (uia) this.c;
        tia tiaVar = (tia) qjaVar.a().j.getValue();
        tiaVar.getClass();
        int i2 = uiaVar.o;
        final int i3 = 1;
        if (i2 == 5) {
            wqi.c("tia", "Handle FAVORITE_STICKER_SET update", new Object[0]);
            tiaVar.a(uiaVar);
            final vr5 vr5Var = (vr5) tiaVar.a.get();
            final long j = uiaVar.c;
            final List listSingletonList = uiaVar.d;
            bu buVar = uiaVar.X;
            final int i4 = uiaVar.Y;
            bwf bwfVar = vr5Var.d;
            zl3 zl3Var = vr5Var.Z;
            wqi.c("vr5", "onNotifAssetsUpdate: id=%d, updateType=%s, position=%d", Long.valueOf(j), buVar.a, Integer.valueOf(i4));
            int iOrdinal = buVar.ordinal();
            if (iOrdinal == 1) {
                qk3 qk3VarH = new ik3(vr5Var.a(), 2, new t00(j, 4)).h((j0e) bwfVar.getValue());
                qu1 qu1Var = new qu1(new gu3() { // from class: pr5
                    @Override // defpackage.gu3
                    public final void accept(Object obj) {
                        int i5 = i3;
                        long j2 = j;
                        vr5 vr5Var2 = vr5Var;
                        Throwable th = (Throwable) obj;
                        switch (i5) {
                            case 0:
                                Locale locale = Locale.ENGLISH;
                                wqi.e("vr5", "onNotifUpdated: failed for id: " + j2, th);
                                vr5Var2.g();
                                break;
                            default:
                                Locale locale2 = Locale.ENGLISH;
                                wqi.e("vr5", a9h.d(j2, "onNotifAdded: failed to add sticker set ", " to cache"), th);
                                vr5Var2.g();
                                break;
                        }
                    }
                }, 0, new qr5(j, 0));
                qk3VarH.f(qu1Var);
                zl3Var.a(qu1Var);
            } else if (iOrdinal == 2) {
                if (jqi.f(listSingletonList)) {
                    listSingletonList = Collections.singletonList(Long.valueOf(j));
                }
                qk3 qk3VarH2 = new ik3(vr5Var.a(), 2, new oh2(7, listSingletonList)).h((j0e) bwfVar.getValue());
                final int i5 = 0;
                qu1 qu1Var2 = new qu1(new gu3() { // from class: nr5
                    @Override // defpackage.gu3
                    public final void accept(Object obj) {
                        int i6 = i5;
                        List list = listSingletonList;
                        vr5 vr5Var2 = vr5Var;
                        Throwable th = (Throwable) obj;
                        switch (i6) {
                            case 0:
                                wqi.e("vr5", String.format(Locale.ENGLISH, "onNotifRemoved: failed to remove sticker sets %s from cache", list), th);
                                vr5Var2.g();
                                break;
                            default:
                                wqi.e("vr5", String.format(Locale.ENGLISH, "onListUpdated: failed to store sticker sets=%s", list), th);
                                vr5Var2.g();
                                break;
                        }
                    }
                }, 0, new mr5(0, listSingletonList));
                qk3VarH2.f(qu1Var2);
                zl3Var.a(qu1Var2);
            } else if (iOrdinal == 3) {
                qk3 qk3VarH3 = new ik3(vr5Var.a(), 2, new ir5(i4, 1, j)).h((j0e) bwfVar.getValue());
                final int i6 = 0;
                qu1 qu1Var3 = new qu1(new lr5(vr5Var, j, i4, 0), 0, new p6() { // from class: ur5
                    @Override // defpackage.p6
                    public final void run() {
                        int i7 = i6;
                        int i8 = i4;
                        long j2 = j;
                        switch (i7) {
                            case 0:
                                wqi.c("vr5", "onNotifMoved: success move id=%d to position=%d", Long.valueOf(j2), Integer.valueOf(i8));
                                break;
                            default:
                                wqi.c("ps5", "onNotifMoved: success move id=%d to position=%d", Long.valueOf(j2), Integer.valueOf(i8));
                                break;
                        }
                    }
                });
                qk3VarH3.f(qu1Var3);
                zl3Var.a(qu1Var3);
            } else if (iOrdinal == 4) {
                wqi.c("vr5", "onNotifUpdated: id=%d", Long.valueOf(j));
                final int i7 = 0;
                u2f u2fVarM = new hs8(new m2f(vr5Var.a(), new er5(4), 0), new kk3(3, ((igf) vr5Var.b.getValue()).d(Collections.singletonList(Long.valueOf(j))))).m((j0e) bwfVar.getValue());
                qu1 qu1Var4 = new qu1(new or5(vr5Var, i7), 2, new gu3() { // from class: pr5
                    @Override // defpackage.gu3
                    public final void accept(Object obj) {
                        int i52 = i7;
                        long j2 = j;
                        vr5 vr5Var2 = vr5Var;
                        Throwable th = (Throwable) obj;
                        switch (i52) {
                            case 0:
                                Locale locale = Locale.ENGLISH;
                                wqi.e("vr5", "onNotifUpdated: failed for id: " + j2, th);
                                vr5Var2.g();
                                break;
                            default:
                                Locale locale2 = Locale.ENGLISH;
                                wqi.e("vr5", a9h.d(j2, "onNotifAdded: failed to add sticker set ", " to cache"), th);
                                vr5Var2.g();
                                break;
                        }
                    }
                });
                u2fVarM.k(qu1Var4);
                zl3Var.a(qu1Var4);
            } else if (iOrdinal != 5) {
                wqi.e("vr5", "onNotifAssetsUpdate: unknown asset type", null);
            } else {
                wqi.c("vr5", "onListUpdated: ids=%s", listSingletonList);
                qk3 qk3VarH4 = new ik3(vr5Var.a(), 2, new oh2(8, listSingletonList)).h((j0e) vr5Var.c.getValue());
                qu1 qu1Var5 = new qu1(new gu3() { // from class: nr5
                    @Override // defpackage.gu3
                    public final void accept(Object obj) {
                        int i62 = i3;
                        List list = listSingletonList;
                        vr5 vr5Var2 = vr5Var;
                        Throwable th = (Throwable) obj;
                        switch (i62) {
                            case 0:
                                wqi.e("vr5", String.format(Locale.ENGLISH, "onNotifRemoved: failed to remove sticker sets %s from cache", list), th);
                                vr5Var2.g();
                                break;
                            default:
                                wqi.e("vr5", String.format(Locale.ENGLISH, "onListUpdated: failed to store sticker sets=%s", list), th);
                                vr5Var2.g();
                                break;
                        }
                    }
                }, 0, new mr5(1, listSingletonList));
                qk3VarH4.f(qu1Var5);
                zl3Var.a(qu1Var5);
            }
        } else if (i2 == 4) {
            wqi.c("tia", "Handle FAVORITE_STICKER update", new Object[0]);
            tiaVar.a(uiaVar);
            final ps5 ps5Var = (ps5) tiaVar.b.get();
            final long j2 = uiaVar.c;
            final List listSingletonList2 = uiaVar.d;
            bu buVar2 = uiaVar.X;
            final int i8 = uiaVar.Y;
            zl3 zl3Var2 = ps5Var.Z;
            kz4 kz4Var = ps5Var.c;
            kz4 kz4Var2 = ps5Var.a;
            wqi.c("ps5", "onNotifAssetsUpdate: id=%d, ids=%s, updateType=%s, position=%d", Long.valueOf(j2), listSingletonList2, buVar2.a, Integer.valueOf(i8));
            int iOrdinal2 = buVar2.ordinal();
            if (iOrdinal2 == 1) {
                final int i9 = 0;
                qk3 qk3VarH5 = new ik3(((kr5) kz4Var2.get()).a(), 2, new dr5(0, j2, true)).h((j0e) kz4Var.get());
                qu1 qu1Var6 = new qu1(new gu3() { // from class: ls5
                    @Override // defpackage.gu3
                    public final void accept(Object obj) {
                        int i10 = i9;
                        long j3 = j2;
                        ps5 ps5Var2 = ps5Var;
                        Throwable th = (Throwable) obj;
                        switch (i10) {
                            case 0:
                                Locale locale = Locale.ENGLISH;
                                wqi.e("ps5", a9h.d(j3, "onNotifAdded: failed to add sticker ", " to cache"), th);
                                ps5Var2.f();
                                break;
                            default:
                                Locale locale2 = Locale.ENGLISH;
                                wqi.e("ps5", "onNotifUpdated: failed for id: " + j3, th);
                                ps5Var2.f();
                                break;
                        }
                    }
                }, 0, new qr5(j2, 3));
                qk3VarH5.f(qu1Var6);
                zl3Var2.a(qu1Var6);
            } else if (iOrdinal2 != 2) {
                int i10 = 3;
                if (iOrdinal2 == 3) {
                    qk3 qk3VarH6 = new ik3(((kr5) kz4Var2.get()).a(), 2, new ir5(i8, 0, j2)).h((j0e) kz4Var.get());
                    final int i11 = 1;
                    qu1 qu1Var7 = new qu1(new lr5(ps5Var, j2, i8, 1), 0, new p6() { // from class: ur5
                        @Override // defpackage.p6
                        public final void run() {
                            int i72 = i11;
                            int i82 = i8;
                            long j22 = j2;
                            switch (i72) {
                                case 0:
                                    wqi.c("vr5", "onNotifMoved: success move id=%d to position=%d", Long.valueOf(j22), Integer.valueOf(i82));
                                    break;
                                default:
                                    wqi.c("ps5", "onNotifMoved: success move id=%d to position=%d", Long.valueOf(j22), Integer.valueOf(i82));
                                    break;
                            }
                        }
                    });
                    qk3VarH6.f(qu1Var7);
                    zl3Var2.a(qu1Var7);
                } else if (iOrdinal2 == 4) {
                    wqi.c("ps5", "onNotifUpdated: id=%d", Long.valueOf(j2));
                    u2f u2fVarM2 = new hs8(new m2f(((kr5) kz4Var2.get()).a(), new er5(2), 0), new kk3(3, new wk3(5, new bs5(ps5Var, j2, 1)))).m((j0e) kz4Var.get());
                    final int i12 = 1;
                    qu1 qu1Var8 = new qu1(new ms5(ps5Var, 0), 2, new gu3() { // from class: ls5
                        @Override // defpackage.gu3
                        public final void accept(Object obj) {
                            int i102 = i12;
                            long j3 = j2;
                            ps5 ps5Var2 = ps5Var;
                            Throwable th = (Throwable) obj;
                            switch (i102) {
                                case 0:
                                    Locale locale = Locale.ENGLISH;
                                    wqi.e("ps5", a9h.d(j3, "onNotifAdded: failed to add sticker ", " to cache"), th);
                                    ps5Var2.f();
                                    break;
                                default:
                                    Locale locale2 = Locale.ENGLISH;
                                    wqi.e("ps5", "onNotifUpdated: failed for id: " + j3, th);
                                    ps5Var2.f();
                                    break;
                            }
                        }
                    });
                    u2fVarM2.k(qu1Var8);
                    zl3Var2.a(qu1Var8);
                } else if (iOrdinal2 != 5) {
                    wqi.e("ps5", "onNotifAssetsUpdate: unknown asset type", null);
                } else {
                    wqi.c("ps5", "onListUpdated: ids=%s", listSingletonList2);
                    qk3 qk3VarH7 = new ik3(((kr5) kz4Var2.get()).a(), 2, new oh2(i10, listSingletonList2)).h((j0e) kz4Var.get());
                    final int i13 = 1;
                    qu1 qu1Var9 = new qu1(new gu3() { // from class: ks5
                        @Override // defpackage.gu3
                        public final void accept(Object obj) {
                            int i14 = i13;
                            List list = listSingletonList2;
                            ps5 ps5Var2 = ps5Var;
                            Throwable th = (Throwable) obj;
                            switch (i14) {
                                case 0:
                                    wqi.e("ps5", String.format(Locale.ENGLISH, "onNotifRemoved: failed to remove stickers %s from cache", list), th);
                                    ps5Var2.f();
                                    break;
                                default:
                                    wqi.e("ps5", String.format(Locale.ENGLISH, "onListUpdated: failed to store stickers %s", list), th);
                                    ps5Var2.f();
                                    break;
                            }
                        }
                    }, 0, new mr5(4, listSingletonList2));
                    qk3VarH7.f(qu1Var9);
                    zl3Var2.a(qu1Var9);
                }
            } else {
                if (jqi.f(listSingletonList2)) {
                    listSingletonList2 = Collections.singletonList(Long.valueOf(j2));
                }
                qk3 qk3VarH8 = new ik3(((kr5) kz4Var2.get()).a(), 2, new oh2(5, listSingletonList2)).h((j0e) kz4Var.get());
                final int i14 = 0;
                qu1 qu1Var10 = new qu1(new gu3() { // from class: ks5
                    @Override // defpackage.gu3
                    public final void accept(Object obj) {
                        int i142 = i14;
                        List list = listSingletonList2;
                        ps5 ps5Var2 = ps5Var;
                        Throwable th = (Throwable) obj;
                        switch (i142) {
                            case 0:
                                wqi.e("ps5", String.format(Locale.ENGLISH, "onNotifRemoved: failed to remove stickers %s from cache", list), th);
                                ps5Var2.f();
                                break;
                            default:
                                wqi.e("ps5", String.format(Locale.ENGLISH, "onListUpdated: failed to store stickers %s", list), th);
                                ps5Var2.f();
                                break;
                        }
                    }
                }, 0, new mr5(5, listSingletonList2));
                qk3VarH8.f(qu1Var10);
                zl3Var2.a(qu1Var10);
            }
        } else if (i2 == 3) {
            wqi.c("tia", "Handle STICKER_SET update", new Object[0]);
            if (uiaVar.X == bu.UPDATED) {
                ((hwa) tiaVar.d.get()).b(3, Collections.singletonList(Long.valueOf(uiaVar.c)));
            } else {
                Locale locale = Locale.ENGLISH;
                wqi.e("tia", "Unhandled sticker set update type: " + uiaVar, null);
            }
        } else {
            int i15 = 6;
            if (i2 == 6) {
                wqi.c("tia", "Handle RECENT update", new Object[0]);
                kdd kddVar = (kdd) tiaVar.e.get();
                ArrayList arrayList = uiaVar.s0;
                List list = uiaVar.t0;
                bu buVar3 = uiaVar.X;
                skh skhVar = kddVar.f;
                bwf bwfVar2 = kddVar.c;
                List listI = hd5.a;
                List listN = arrayList == null ? listI : po8.n(arrayList, (m4e) kddVar.e.getValue());
                if (list != null) {
                    listI = po8.i(list);
                }
                ArrayList arrayList2 = new ArrayList(listN);
                arrayList2.addAll(listI);
                if (!arrayList2.isEmpty()) {
                    Collections.reverse(arrayList2);
                    int iOrdinal3 = buVar3.ordinal();
                    if (iOrdinal3 == 1) {
                        ddd dddVarB = kddVar.b();
                        qk3 qk3VarH9 = new ik3(dddVarB.a.w(), 2, new cdd(dddVarB, arrayList2, 1)).h((j0e) bwfVar2.getValue());
                        qu1 qu1Var11 = new qu1(jbe.y0, 0, new yl4(6));
                        qk3VarH9.f(qu1Var11);
                        skhVar.a(qu1Var11);
                    } else if (iOrdinal3 != 2) {
                        wqi.f("kdd", "Unhandled notif assets update: %s", buVar3);
                    } else {
                        if (listN.isEmpty()) {
                            ik3Var = nk3.a;
                            i = 0;
                        } else {
                            i = 0;
                            ik3Var = new ik3(kddVar.b().c(listN), 0, new kk3(1, new v64(kddVar, i15, listN)));
                        }
                        qk3 qk3VarH10 = ik3Var.h((j0e) bwfVar2.getValue());
                        qu1 qu1Var12 = new qu1(mni.x0, i, new yl4(7));
                        qk3VarH10.f(qu1Var12);
                        skhVar.a(qu1Var12);
                    }
                }
            } else {
                Locale locale2 = Locale.ENGLISH;
                wqi.e("tia", "Unhandled notif assets update: " + uiaVar, null);
            }
        }
        return qqg.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0497  */
    @Override // defpackage.cm6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es9.invoke():java.lang.Object");
    }

    public /* synthetic */ es9(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
