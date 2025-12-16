package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

/* loaded from: classes2.dex */
public final class y0b implements g37 {
    public final long b;
    public final c47 c;
    public final k18 d;
    public final k18 e;
    public boolean f;
    public final ov5 g = new ov5(14);

    public y0b(k18 k18Var, k18 k18Var2, long j, c47 c47Var) {
        this.b = j;
        this.c = c47Var;
        this.d = k18Var;
        this.e = k18Var2;
    }

    @Override // defpackage.g37
    public final boolean a() {
        return false;
    }

    @Override // defpackage.g37
    public final void b() {
        this.f = true;
    }

    @Override // defpackage.g37
    public final Comparator c() {
        return new ov5(15);
    }

    @Override // defpackage.g37
    public final d93 d(long j) {
        return k4j.f(j, j());
    }

    @Override // defpackage.g37
    public final Comparator e() {
        return this.g;
    }

    @Override // defpackage.g37
    public final d93 f(long j) {
        return k4j.e(j, j());
    }

    @Override // defpackage.g37
    public final long g() throws Throwable {
        dsd dsdVar;
        ss4 ss4Var;
        int i;
        byte[] blob;
        if (!this.f) {
            return 0L;
        }
        bsd bsdVar = ((gx9) this.e.getValue()).a;
        lq9 lq9VarD = bsdVar.d();
        lq9VarD.getClass();
        dsd dsdVarC = dsd.c(3, "SELECT * FROM messages WHERE chat_id = ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire DESC LIMIT ?");
        vb9.h(dsdVarC, 1, this.b, lq9VarD);
        dsdVarC.k(2, 10);
        dsdVarC.k(3, 1L);
        lrd lrdVar = lq9VarD.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            int iC = s7j.c(cursorN, "id");
            int iC2 = s7j.c(cursorN, "server_id");
            int iC3 = s7j.c(cursorN, "time");
            int iC4 = s7j.c(cursorN, "update_time");
            int iC5 = s7j.c(cursorN, "sender");
            int iC6 = s7j.c(cursorN, "cid");
            int iC7 = s7j.c(cursorN, "text");
            int iC8 = s7j.c(cursorN, "delivery_status");
            int iC9 = s7j.c(cursorN, "status");
            int iC10 = s7j.c(cursorN, "time_local");
            int iC11 = s7j.c(cursorN, NegotiationErrorStat.KEY_ERROR);
            int iC12 = s7j.c(cursorN, "localized_error");
            dsdVar = dsdVarC;
            try {
                int iC13 = s7j.c(cursorN, "attaches");
                try {
                    int iC14 = s7j.c(cursorN, "media_type");
                    int iC15 = s7j.c(cursorN, "detect_share");
                    int iC16 = s7j.c(cursorN, "msg_link_type");
                    int iC17 = s7j.c(cursorN, "msg_link_id");
                    int iC18 = s7j.c(cursorN, "inserted_from_msg_link");
                    int iC19 = s7j.c(cursorN, "msg_link_chat_id");
                    int iC20 = s7j.c(cursorN, "msg_link_chat_name");
                    int iC21 = s7j.c(cursorN, "msg_link_chat_link");
                    int iC22 = s7j.c(cursorN, "msg_link_chat_icon_url");
                    int iC23 = s7j.c(cursorN, "msg_link_chat_access_type");
                    int iC24 = s7j.c(cursorN, "msg_link_out_chat_id");
                    int iC25 = s7j.c(cursorN, "msg_link_out_msg_id");
                    int iC26 = s7j.c(cursorN, "type");
                    int iC27 = s7j.c(cursorN, "chat_id");
                    int iC28 = s7j.c(cursorN, "channel_views");
                    int iC29 = s7j.c(cursorN, "channel_forwards");
                    int iC30 = s7j.c(cursorN, "view_time");
                    int iC31 = s7j.c(cursorN, "options");
                    int iC32 = s7j.c(cursorN, "live_until");
                    int iC33 = s7j.c(cursorN, "elements");
                    int iC34 = s7j.c(cursorN, "reactions");
                    int iC35 = s7j.c(cursorN, "delayed_attrs_time_to_fire");
                    int iC36 = s7j.c(cursorN, "delayed_attrs_notify_sender");
                    int iC37 = s7j.c(cursorN, "reactions_update_time");
                    int i2 = iC14;
                    ArrayList arrayList = new ArrayList(cursorN.getCount());
                    while (true) {
                        Boolean boolValueOf = null;
                        if (!cursorN.moveToNext()) {
                            break;
                        }
                        long j = cursorN.getLong(iC);
                        long j2 = cursorN.getLong(iC2);
                        long j3 = cursorN.getLong(iC3);
                        long j4 = cursorN.getLong(iC4);
                        long j5 = cursorN.getLong(iC5);
                        long j6 = cursorN.getLong(iC6);
                        String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                        int i3 = cursorN.getInt(iC8);
                        lq9VarD.b().getClass();
                        xi9 xi9VarB = ky9.b(i3);
                        int i4 = cursorN.getInt(iC9);
                        lq9VarD.b().getClass();
                        jm9 jm9VarD = ky9.d(i4);
                        long j7 = cursorN.getLong(iC10);
                        String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                        String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                        byte[] blob2 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                        lq9VarD.b().getClass();
                        jdc jdcVarA = ky9.a(blob2);
                        int i5 = i2;
                        int i6 = cursorN.getInt(i5);
                        i2 = i5;
                        int i7 = iC15;
                        boolean z = cursorN.getInt(i7) != 0;
                        iC15 = i7;
                        int i8 = iC16;
                        int i9 = cursorN.getInt(i8);
                        iC16 = i8;
                        int i10 = iC17;
                        long j8 = cursorN.getLong(i10);
                        iC17 = i10;
                        int i11 = iC18;
                        boolean z2 = cursorN.getInt(i11) != 0;
                        iC18 = i11;
                        int i12 = iC19;
                        long j9 = cursorN.getLong(i12);
                        iC19 = i12;
                        int i13 = iC20;
                        String string4 = cursorN.isNull(i13) ? null : cursorN.getString(i13);
                        iC20 = i13;
                        int i14 = iC21;
                        String string5 = cursorN.isNull(i14) ? null : cursorN.getString(i14);
                        iC21 = i14;
                        int i15 = iC22;
                        String string6 = cursorN.isNull(i15) ? null : cursorN.getString(i15);
                        iC22 = i15;
                        int i16 = iC23;
                        Integer numValueOf = cursorN.isNull(i16) ? null : Integer.valueOf(cursorN.getInt(i16));
                        lq9VarD.a().getClass();
                        int iA = m73.a(numValueOf);
                        iC23 = i16;
                        int i17 = iC24;
                        long j10 = cursorN.getLong(i17);
                        iC24 = i17;
                        int i18 = iC25;
                        long j11 = cursorN.getLong(i18);
                        iC25 = i18;
                        int i19 = iC26;
                        int i20 = cursorN.getInt(i19);
                        lq9VarD.b().getClass();
                        int iE = ky9.e(i20);
                        iC26 = i19;
                        int i21 = iC27;
                        long j12 = cursorN.getLong(i21);
                        iC27 = i21;
                        int i22 = iC28;
                        int i23 = cursorN.getInt(i22);
                        iC28 = i22;
                        int i24 = iC29;
                        int i25 = cursorN.getInt(i24);
                        iC29 = i24;
                        int i26 = iC30;
                        long j13 = cursorN.getLong(i26);
                        iC30 = i26;
                        int i27 = iC31;
                        int i28 = cursorN.getInt(i27);
                        iC31 = i27;
                        int i29 = iC32;
                        long j14 = cursorN.getLong(i29);
                        iC32 = i29;
                        int i30 = iC33;
                        byte[] blob3 = cursorN.isNull(i30) ? null : cursorN.getBlob(i30);
                        lq9VarD.b().getClass();
                        List listC = ky9.c(blob3);
                        iC33 = i30;
                        int i31 = iC34;
                        if (cursorN.isNull(i31)) {
                            i = i31;
                            blob = null;
                        } else {
                            i = i31;
                            blob = cursorN.getBlob(i31);
                        }
                        int i32 = iC12;
                        xl9 xl9VarF = lq9VarD.b().f(blob);
                        int i33 = iC35;
                        Long lValueOf = cursorN.isNull(i33) ? null : Long.valueOf(cursorN.getLong(i33));
                        int i34 = iC36;
                        Integer numValueOf2 = cursorN.isNull(i34) ? null : Integer.valueOf(cursorN.getInt(i34));
                        if (numValueOf2 != null) {
                            boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                        }
                        iC35 = i33;
                        int i35 = iC37;
                        iC37 = i35;
                        arrayList.add(new gj9(j, j2, j3, j4, j5, j6, string, xi9VarB, jm9VarD, j7, string2, string3, jdcVarA, i6, z, i9, j8, z2, j9, string4, string5, string6, iA, j10, j11, iE, j12, i23, i25, j13, i28, j14, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(i35)));
                        iC36 = i34;
                        iC12 = i32;
                        iC34 = i;
                    }
                    cursorN.close();
                    dsdVar.y();
                    gj9 gj9Var = (gj9) ue3.I(arrayList);
                    si9 si9VarB = gj9Var != null ? bsdVar.b(gj9Var) : null;
                    if (si9VarB == null || (ss4Var = si9VarB.Q0) == null) {
                        return 0L;
                    }
                    if (this.c.C(ss4Var.a)) {
                        return si9VarB.a;
                    }
                    return 0L;
                } catch (Throwable th) {
                    th = th;
                    cursorN.close();
                    dsdVar.y();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            dsdVar = dsdVarC;
        }
    }

    @Override // defpackage.g37
    public final long h() {
        ss4 ss4Var;
        bsd bsdVar = ((gx9) this.e.getValue()).a;
        gj9 gj9Var = (gj9) ue3.I(lq9.j(bsdVar.d(), this.b));
        si9 si9VarB = gj9Var != null ? bsdVar.b(gj9Var) : null;
        if (si9VarB == null || (ss4Var = si9VarB.Q0) == null || !this.c.C(ss4Var.a)) {
            return 0L;
        }
        return si9VarB.a;
    }

    @Override // defpackage.g37
    public final long i() {
        return 0L;
    }

    @Override // defpackage.g37
    public final List j() {
        return ((pb2) svi.g(bd5.a, new x0b(this, null))).b.n.d(rs4.DELAYED);
    }
}
