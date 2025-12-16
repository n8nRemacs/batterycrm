package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* loaded from: classes2.dex */
public final class lq9 {
    public final lrd a;
    public final l03 b;
    public ky9 c;
    public m73 d;
    public final kq9 e;
    public final kq9 f;
    public final kq9 g;
    public final hq9 h;
    public final hq9 i;
    public final bi j;
    public final bi k;
    public final bi l;
    public final hq9 m;
    public final hq9 n;
    public final hq9 o;
    public final hq9 p;
    public final hq9 q;
    public final hq9 r;
    public final hq9 s;
    public final hq9 t;
    public final hq9 u;
    public final hq9 v;
    public final hq9 w;

    public lq9(OneMeRoomDatabase oneMeRoomDatabase) {
        this.a = oneMeRoomDatabase;
        this.b = new l03(this, oneMeRoomDatabase, 1);
        this.e = new kq9(this, oneMeRoomDatabase, 0);
        int i = 1;
        new kq9(this, oneMeRoomDatabase, i);
        new am4(oneMeRoomDatabase, i);
        int i2 = 2;
        this.f = new kq9(this, oneMeRoomDatabase, i2);
        new am4(oneMeRoomDatabase, i2);
        this.g = new kq9(this, oneMeRoomDatabase, 3);
        this.h = new hq9(oneMeRoomDatabase, 12);
        this.i = new hq9(oneMeRoomDatabase, 13);
        this.j = new bi(oneMeRoomDatabase, 27);
        this.k = new bi(oneMeRoomDatabase, 28);
        this.l = new bi(oneMeRoomDatabase, 29);
        this.m = new hq9(oneMeRoomDatabase, 0);
        this.n = new hq9(oneMeRoomDatabase, 1);
        this.o = new hq9(oneMeRoomDatabase, 2);
        this.p = new hq9(oneMeRoomDatabase, 3);
        this.q = new hq9(oneMeRoomDatabase, 4);
        this.r = new hq9(oneMeRoomDatabase, 5);
        this.s = new hq9(oneMeRoomDatabase, 6);
        this.t = new hq9(oneMeRoomDatabase, 7);
        this.u = new hq9(oneMeRoomDatabase, 8);
        this.v = new hq9(oneMeRoomDatabase, 9);
        this.w = new hq9(oneMeRoomDatabase, 10);
        new hq9(oneMeRoomDatabase, 11);
    }

    public static ml9 g(lq9 lq9Var, gj9 gj9Var, ml9 ml9Var, long j, Long l, Long l2, int i) {
        String str = gj9Var.g;
        Long l3 = (i & 8) != 0 ? null : l;
        Long l4 = (i & 16) == 0 ? l2 : null;
        String str2 = ml9Var.h;
        String str3 = ((str2 != null && str2.length() != 0) || str == null || str.length() == 0) ? str2 : str;
        long j2 = ml9Var.l;
        if (j2 == 0) {
            j2 = gj9Var.q;
        }
        long j3 = j2;
        int i2 = ml9Var.k;
        if (i2 == 0) {
            i2 = gj9Var.p;
        }
        int i3 = i2;
        long j4 = ml9Var.n;
        if (j4 == 0) {
            j4 = gj9Var.s;
        }
        long j5 = j4;
        String str4 = ml9Var.p;
        if (str4 == null) {
            str4 = gj9Var.u;
        }
        String str5 = str4;
        String str6 = ml9Var.o;
        if (str6 == null) {
            str6 = gj9Var.t;
        }
        String str7 = str6;
        String str8 = ml9Var.q;
        if (str8 == null) {
            str8 = gj9Var.v;
        }
        String str9 = str8;
        int i4 = ml9Var.r;
        if (i4 == 0) {
            i4 = gj9Var.J;
        }
        int i5 = i4;
        xl9 xl9Var = ml9Var.j;
        if (xl9Var == null) {
            xl9Var = gj9Var.F;
        }
        return ml9.a(ml9Var, gj9Var.a, l3 != null ? l3.longValue() : ml9Var.b, j, l4 != null ? l4.longValue() : ml9Var.g, str3, xl9Var, i3, j3, gj9Var.r && ml9Var.m, j5, str7, str5, str9, i5, 33292596);
    }

    public static ArrayList j(lq9 lq9Var, long j) throws Throwable {
        dsd dsdVar;
        boolean z;
        boolean z2;
        int i;
        byte[] blob;
        lq9Var.getClass();
        dsd dsdVarC = dsd.c(3, "SELECT * FROM messages WHERE chat_id = ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL ORDER BY delayed_attrs_time_to_fire ASC LIMIT ?");
        vb9.h(dsdVarC, 1, j, lq9Var);
        dsdVarC.k(2, 10);
        dsdVarC.k(3, 1L);
        lrd lrdVar = lq9Var.a;
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
            int iC13 = s7j.c(cursorN, "attaches");
            int iC14 = s7j.c(cursorN, "media_type");
            dsdVar = dsdVarC;
            try {
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
                while (cursorN.moveToNext()) {
                    long j2 = cursorN.getLong(iC);
                    long j3 = cursorN.getLong(iC2);
                    long j4 = cursorN.getLong(iC3);
                    long j5 = cursorN.getLong(iC4);
                    long j6 = cursorN.getLong(iC5);
                    long j7 = cursorN.getLong(iC6);
                    Boolean boolValueOf = null;
                    String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                    int i3 = cursorN.getInt(iC8);
                    lq9Var.b().getClass();
                    xi9 xi9VarB = ky9.b(i3);
                    int i4 = cursorN.getInt(iC9);
                    lq9Var.b().getClass();
                    jm9 jm9VarD = ky9.d(i4);
                    long j8 = cursorN.getLong(iC10);
                    String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                    String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                    byte[] blob2 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                    lq9Var.b().getClass();
                    jdc jdcVarA = ky9.a(blob2);
                    int i5 = i2;
                    int i6 = cursorN.getInt(i5);
                    i2 = i5;
                    int i7 = iC15;
                    if (cursorN.getInt(i7) != 0) {
                        z2 = false;
                        z = true;
                    } else {
                        z = false;
                        z2 = false;
                    }
                    iC15 = i7;
                    int i8 = iC16;
                    int i9 = cursorN.getInt(i8);
                    iC16 = i8;
                    int i10 = iC17;
                    boolean z3 = z2;
                    long j9 = cursorN.getLong(i10);
                    int i11 = iC18;
                    boolean z4 = cursorN.getInt(i11) != 0 ? true : z3;
                    iC18 = i11;
                    int i12 = iC19;
                    long j10 = cursorN.getLong(i12);
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
                    lq9Var.a().getClass();
                    int iA = m73.a(numValueOf);
                    iC23 = i16;
                    int i17 = iC24;
                    long j11 = cursorN.getLong(i17);
                    iC24 = i17;
                    int i18 = iC25;
                    long j12 = cursorN.getLong(i18);
                    iC25 = i18;
                    int i19 = iC26;
                    int i20 = cursorN.getInt(i19);
                    lq9Var.b().getClass();
                    int iE = ky9.e(i20);
                    iC26 = i19;
                    int i21 = iC27;
                    long j13 = cursorN.getLong(i21);
                    iC27 = i21;
                    int i22 = iC28;
                    int i23 = cursorN.getInt(i22);
                    iC28 = i22;
                    int i24 = iC29;
                    int i25 = cursorN.getInt(i24);
                    iC29 = i24;
                    int i26 = iC30;
                    long j14 = cursorN.getLong(i26);
                    iC30 = i26;
                    int i27 = iC31;
                    int i28 = cursorN.getInt(i27);
                    iC31 = i27;
                    int i29 = iC32;
                    long j15 = cursorN.getLong(i29);
                    iC32 = i29;
                    int i30 = iC33;
                    byte[] blob3 = cursorN.isNull(i30) ? null : cursorN.getBlob(i30);
                    lq9Var.b().getClass();
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
                    int i32 = iC13;
                    xl9 xl9VarF = lq9Var.b().f(blob);
                    int i33 = iC35;
                    Long lValueOf = cursorN.isNull(i33) ? null : Long.valueOf(cursorN.getLong(i33));
                    int i34 = iC36;
                    Integer numValueOf2 = cursorN.isNull(i34) ? null : Integer.valueOf(cursorN.getInt(i34));
                    if (numValueOf2 != null) {
                        if (numValueOf2.intValue() != 0) {
                            z3 = true;
                        }
                        boolValueOf = Boolean.valueOf(z3);
                    }
                    iC35 = i33;
                    int i35 = iC37;
                    iC37 = i35;
                    arrayList.add(new gj9(j2, j3, j4, j5, j6, j7, string, xi9VarB, jm9VarD, j8, string2, string3, jdcVarA, i6, z, i9, j9, z4, j10, string4, string5, string6, iA, j11, j12, iE, j13, i23, i25, j14, i28, j15, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(i35)));
                    iC36 = i34;
                    iC13 = i32;
                    iC17 = i10;
                    iC34 = i;
                }
                cursorN.close();
                dsdVar.y();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorN.close();
                dsdVar.y();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dsdVar = dsdVarC;
        }
    }

    public static ArrayList o(lq9 lq9Var, long j, long j2, long j3, jm9 jm9Var) throws Throwable {
        dsd dsdVar;
        int i;
        boolean z;
        int i2;
        byte[] blob;
        List list = xi9.b;
        List list2 = xi9.b;
        dsd dsdVarC = dsd.c(5, "SELECT * FROM messages WHERE chat_id = ? AND sender = ? AND time <= ? AND delivery_status = ? AND inserted_from_msg_link = 0 AND status <> ?");
        dsdVarC.k(1, j);
        dsdVarC.k(2, j2);
        vb9.h(dsdVarC, 3, j3, lq9Var);
        long j4 = 20;
        vb9.h(dsdVarC, 4, j4, lq9Var);
        long j5 = jm9Var.a;
        dsdVarC.k(5, j5);
        lrd lrdVar = lq9Var.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            int iC = s7j.c(cursorN, "id");
            int iC2 = s7j.c(cursorN, "server_id");
            int iC3 = s7j.c(cursorN, "time");
            dsdVar = dsdVarC;
            try {
                int iC4 = s7j.c(cursorN, "update_time");
                int iC5 = s7j.c(cursorN, "sender");
                int iC6 = s7j.c(cursorN, "cid");
                int iC7 = s7j.c(cursorN, "text");
                int iC8 = s7j.c(cursorN, "delivery_status");
                int iC9 = s7j.c(cursorN, "status");
                int iC10 = s7j.c(cursorN, "time_local");
                int iC11 = s7j.c(cursorN, NegotiationErrorStat.KEY_ERROR);
                int iC12 = s7j.c(cursorN, "localized_error");
                int iC13 = s7j.c(cursorN, "attaches");
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
                int i3 = iC14;
                ArrayList arrayList = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    long j6 = cursorN.getLong(iC);
                    long j7 = cursorN.getLong(iC2);
                    long j8 = cursorN.getLong(iC3);
                    long j9 = cursorN.getLong(iC4);
                    long j10 = cursorN.getLong(iC5);
                    long j11 = cursorN.getLong(iC6);
                    Boolean boolValueOf = null;
                    String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                    int i4 = cursorN.getInt(iC8);
                    lq9Var.b().getClass();
                    xi9 xi9VarB = ky9.b(i4);
                    int i5 = cursorN.getInt(iC9);
                    lq9Var.b().getClass();
                    jm9 jm9VarD = ky9.d(i5);
                    long j12 = cursorN.getLong(iC10);
                    String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                    String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                    byte[] blob2 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                    lq9Var.b().getClass();
                    jdc jdcVarA = ky9.a(blob2);
                    int i6 = i3;
                    int i7 = cursorN.getInt(i6);
                    int i8 = iC13;
                    int i9 = iC15;
                    boolean z2 = false;
                    if (cursorN.getInt(i9) != 0) {
                        iC15 = i9;
                        i = iC16;
                        z = false;
                        z2 = true;
                    } else {
                        iC15 = i9;
                        i = iC16;
                        z = false;
                    }
                    int i10 = cursorN.getInt(i);
                    int i11 = i;
                    int i12 = iC17;
                    long j13 = cursorN.getLong(i12);
                    iC17 = i12;
                    int i13 = iC18;
                    boolean z3 = cursorN.getInt(i13) != 0 ? true : z;
                    iC18 = i13;
                    int i14 = iC19;
                    long j14 = cursorN.getLong(i14);
                    iC19 = i14;
                    int i15 = iC20;
                    String string4 = cursorN.isNull(i15) ? null : cursorN.getString(i15);
                    iC20 = i15;
                    int i16 = iC21;
                    String string5 = cursorN.isNull(i16) ? null : cursorN.getString(i16);
                    iC21 = i16;
                    int i17 = iC22;
                    String string6 = cursorN.isNull(i17) ? null : cursorN.getString(i17);
                    iC22 = i17;
                    int i18 = iC23;
                    Integer numValueOf = cursorN.isNull(i18) ? null : Integer.valueOf(cursorN.getInt(i18));
                    lq9Var.a().getClass();
                    int iA = m73.a(numValueOf);
                    iC23 = i18;
                    int i19 = iC24;
                    long j15 = cursorN.getLong(i19);
                    iC24 = i19;
                    int i20 = iC25;
                    long j16 = cursorN.getLong(i20);
                    iC25 = i20;
                    int i21 = iC26;
                    int i22 = cursorN.getInt(i21);
                    lq9Var.b().getClass();
                    int iE = ky9.e(i22);
                    iC26 = i21;
                    int i23 = iC27;
                    long j17 = cursorN.getLong(i23);
                    iC27 = i23;
                    int i24 = iC28;
                    int i25 = cursorN.getInt(i24);
                    iC28 = i24;
                    int i26 = iC29;
                    int i27 = cursorN.getInt(i26);
                    iC29 = i26;
                    int i28 = iC30;
                    long j18 = cursorN.getLong(i28);
                    iC30 = i28;
                    int i29 = iC31;
                    int i30 = cursorN.getInt(i29);
                    iC31 = i29;
                    int i31 = iC32;
                    long j19 = cursorN.getLong(i31);
                    iC32 = i31;
                    int i32 = iC33;
                    byte[] blob3 = cursorN.isNull(i32) ? null : cursorN.getBlob(i32);
                    lq9Var.b().getClass();
                    List listC = ky9.c(blob3);
                    iC33 = i32;
                    int i33 = iC34;
                    if (cursorN.isNull(i33)) {
                        i2 = i33;
                        blob = null;
                    } else {
                        i2 = i33;
                        blob = cursorN.getBlob(i33);
                    }
                    xl9 xl9VarF = lq9Var.b().f(blob);
                    int i34 = iC35;
                    Long lValueOf = cursorN.isNull(i34) ? null : Long.valueOf(cursorN.getLong(i34));
                    int i35 = iC36;
                    Integer numValueOf2 = cursorN.isNull(i35) ? null : Integer.valueOf(cursorN.getInt(i35));
                    if (numValueOf2 != null) {
                        if (numValueOf2.intValue() != 0) {
                            z = true;
                        }
                        boolValueOf = Boolean.valueOf(z);
                    }
                    iC35 = i34;
                    int i36 = iC37;
                    iC37 = i36;
                    arrayList.add(new gj9(j6, j7, j8, j9, j10, j11, string, xi9VarB, jm9VarD, j12, string2, string3, jdcVarA, i7, z2, i10, j13, z3, j14, string4, string5, string6, iA, j15, j16, iE, j17, i25, i27, j18, i30, j19, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(i36)));
                    iC36 = i35;
                    iC13 = i8;
                    iC16 = i11;
                    i3 = i6;
                    iC34 = i2;
                }
                cursorN.close();
                dsdVar.y();
                lrdVar.b();
                hq9 hq9Var = lq9Var.h;
                vk6 vk6VarA = hq9Var.a();
                lq9Var.b().getClass();
                vk6VarA.k(1, 30);
                vk6VarA.k(2, j);
                vk6VarA.k(3, j2);
                vk6VarA.k(4, j3);
                lq9Var.b().getClass();
                vk6VarA.k(5, j4);
                lq9Var.b().getClass();
                vk6VarA.k(6, j5);
                try {
                    lrdVar.c();
                    try {
                        int iW = vk6VarA.w();
                        lrdVar.q();
                        hq9Var.r(vk6VarA);
                        if (arrayList.size() != iW) {
                            wqi.q(lq9.class.getName(), ho7.g("updateDeliveryStatusWithMessages: ", iW, arrayList.size(), " != "), new Object[0]);
                        }
                        return arrayList;
                    } finally {
                        lrdVar.k();
                    }
                } catch (Throwable th) {
                    hq9Var.r(vk6VarA);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursorN.close();
                dsdVar.y();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            dsdVar = dsdVarC;
        }
    }

    public final synchronized m73 a() {
        try {
            if (this.d == null) {
                this.d = (m73) this.a.l.get(m73.class);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.d;
    }

    public final synchronized ky9 b() {
        try {
            if (this.c == null) {
                this.c = (ky9) this.a.l.get(ky9.class);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public final gj9 c(long j, long j2) throws Throwable {
        dsd dsdVar;
        dsd dsdVarC = dsd.c(2, "SELECT * FROM messages WHERE chat_id = ? AND server_id = ?");
        dsdVarC.k(1, j);
        dsdVarC.k(2, j2);
        lrd lrdVar = this.a;
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
            int iC13 = s7j.c(cursorN, "attaches");
            dsdVar = dsdVarC;
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
                gj9 gj9Var = null;
                Boolean boolValueOf = null;
                if (cursorN.moveToFirst()) {
                    long j3 = cursorN.getLong(iC);
                    long j4 = cursorN.getLong(iC2);
                    long j5 = cursorN.getLong(iC3);
                    long j6 = cursorN.getLong(iC4);
                    long j7 = cursorN.getLong(iC5);
                    long j8 = cursorN.getLong(iC6);
                    String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                    int i = cursorN.getInt(iC8);
                    b().getClass();
                    xi9 xi9VarB = ky9.b(i);
                    int i2 = cursorN.getInt(iC9);
                    b().getClass();
                    jm9 jm9VarD = ky9.d(i2);
                    long j9 = cursorN.getLong(iC10);
                    String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                    String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                    byte[] blob = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                    b().getClass();
                    jdc jdcVarA = ky9.a(blob);
                    int i3 = cursorN.getInt(iC14);
                    boolean z = cursorN.getInt(iC15) != 0;
                    int i4 = cursorN.getInt(iC16);
                    long j10 = cursorN.getLong(iC17);
                    boolean z2 = cursorN.getInt(iC18) != 0;
                    long j11 = cursorN.getLong(iC19);
                    String string4 = cursorN.isNull(iC20) ? null : cursorN.getString(iC20);
                    String string5 = cursorN.isNull(iC21) ? null : cursorN.getString(iC21);
                    String string6 = cursorN.isNull(iC22) ? null : cursorN.getString(iC22);
                    Integer numValueOf = cursorN.isNull(iC23) ? null : Integer.valueOf(cursorN.getInt(iC23));
                    a().getClass();
                    int iA = m73.a(numValueOf);
                    long j12 = cursorN.getLong(iC24);
                    long j13 = cursorN.getLong(iC25);
                    int i5 = cursorN.getInt(iC26);
                    b().getClass();
                    int iE = ky9.e(i5);
                    long j14 = cursorN.getLong(iC27);
                    int i6 = cursorN.getInt(iC28);
                    int i7 = cursorN.getInt(iC29);
                    long j15 = cursorN.getLong(iC30);
                    int i8 = cursorN.getInt(iC31);
                    long j16 = cursorN.getLong(iC32);
                    byte[] blob2 = cursorN.isNull(iC33) ? null : cursorN.getBlob(iC33);
                    b().getClass();
                    List listC = ky9.c(blob2);
                    xl9 xl9VarF = b().f(cursorN.isNull(iC34) ? null : cursorN.getBlob(iC34));
                    Long lValueOf = cursorN.isNull(iC35) ? null : Long.valueOf(cursorN.getLong(iC35));
                    Integer numValueOf2 = cursorN.isNull(iC36) ? null : Integer.valueOf(cursorN.getInt(iC36));
                    if (numValueOf2 != null) {
                        boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                    }
                    gj9Var = new gj9(j3, j4, j5, j6, j7, j8, string, xi9VarB, jm9VarD, j9, string2, string3, jdcVarA, i3, z, i4, j10, z2, j11, string4, string5, string6, iA, j12, j13, iE, j14, i6, i7, j15, i8, j16, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(iC37));
                }
                cursorN.close();
                dsdVar.y();
                return gj9Var;
            } catch (Throwable th) {
                th = th;
                cursorN.close();
                dsdVar.y();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dsdVar = dsdVarC;
        }
    }

    public final gj9 d(long j) throws Throwable {
        dsd dsdVar;
        int iC;
        int iC2;
        int iC3;
        int iC4;
        int iC5;
        int iC6;
        int iC7;
        int iC8;
        int iC9;
        int iC10;
        int iC11;
        int iC12;
        int iC13;
        dsd dsdVarC = dsd.c(1, "SELECT * FROM messages WHERE id = ?");
        dsdVarC.k(1, j);
        lrd lrdVar = this.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            iC = s7j.c(cursorN, "id");
            iC2 = s7j.c(cursorN, "server_id");
            iC3 = s7j.c(cursorN, "time");
            iC4 = s7j.c(cursorN, "update_time");
            iC5 = s7j.c(cursorN, "sender");
            iC6 = s7j.c(cursorN, "cid");
            iC7 = s7j.c(cursorN, "text");
            iC8 = s7j.c(cursorN, "delivery_status");
            iC9 = s7j.c(cursorN, "status");
            iC10 = s7j.c(cursorN, "time_local");
            iC11 = s7j.c(cursorN, NegotiationErrorStat.KEY_ERROR);
            iC12 = s7j.c(cursorN, "localized_error");
            iC13 = s7j.c(cursorN, "attaches");
            dsdVar = dsdVarC;
        } catch (Throwable th) {
            th = th;
            dsdVar = dsdVarC;
        }
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
            gj9 gj9Var = null;
            Boolean boolValueOf = null;
            if (cursorN.moveToFirst()) {
                long j2 = cursorN.getLong(iC);
                long j3 = cursorN.getLong(iC2);
                long j4 = cursorN.getLong(iC3);
                long j5 = cursorN.getLong(iC4);
                long j6 = cursorN.getLong(iC5);
                long j7 = cursorN.getLong(iC6);
                String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                int i = cursorN.getInt(iC8);
                b().getClass();
                xi9 xi9VarB = ky9.b(i);
                int i2 = cursorN.getInt(iC9);
                b().getClass();
                jm9 jm9VarD = ky9.d(i2);
                long j8 = cursorN.getLong(iC10);
                String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                byte[] blob = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                b().getClass();
                jdc jdcVarA = ky9.a(blob);
                int i3 = cursorN.getInt(iC14);
                boolean z = cursorN.getInt(iC15) != 0;
                int i4 = cursorN.getInt(iC16);
                long j9 = cursorN.getLong(iC17);
                boolean z2 = cursorN.getInt(iC18) != 0;
                long j10 = cursorN.getLong(iC19);
                String string4 = cursorN.isNull(iC20) ? null : cursorN.getString(iC20);
                String string5 = cursorN.isNull(iC21) ? null : cursorN.getString(iC21);
                String string6 = cursorN.isNull(iC22) ? null : cursorN.getString(iC22);
                Integer numValueOf = cursorN.isNull(iC23) ? null : Integer.valueOf(cursorN.getInt(iC23));
                a().getClass();
                int iA = m73.a(numValueOf);
                long j11 = cursorN.getLong(iC24);
                long j12 = cursorN.getLong(iC25);
                int i5 = cursorN.getInt(iC26);
                b().getClass();
                int iE = ky9.e(i5);
                long j13 = cursorN.getLong(iC27);
                int i6 = cursorN.getInt(iC28);
                int i7 = cursorN.getInt(iC29);
                long j14 = cursorN.getLong(iC30);
                int i8 = cursorN.getInt(iC31);
                long j15 = cursorN.getLong(iC32);
                byte[] blob2 = cursorN.isNull(iC33) ? null : cursorN.getBlob(iC33);
                b().getClass();
                List listC = ky9.c(blob2);
                xl9 xl9VarF = b().f(cursorN.isNull(iC34) ? null : cursorN.getBlob(iC34));
                Long lValueOf = cursorN.isNull(iC35) ? null : Long.valueOf(cursorN.getLong(iC35));
                Integer numValueOf2 = cursorN.isNull(iC36) ? null : Integer.valueOf(cursorN.getInt(iC36));
                if (numValueOf2 != null) {
                    boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                }
                gj9Var = new gj9(j2, j3, j4, j5, j6, j7, string, xi9VarB, jm9VarD, j8, string2, string3, jdcVarA, i3, z, i4, j9, z2, j10, string4, string5, string6, iA, j11, j12, iE, j13, i6, i7, j14, i8, j15, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(iC37));
            }
            cursorN.close();
            dsdVar.y();
            return gj9Var;
        } catch (Throwable th2) {
            th = th2;
            cursorN.close();
            dsdVar.y();
            throw th;
        }
    }

    public final ArrayList e(long j, long j2, boolean z, long j3) throws Throwable {
        dsd dsdVar;
        int iC;
        int iC2;
        int iC3;
        int iC4;
        int iC5;
        int iC6;
        int iC7;
        int iC8;
        int iC9;
        int iC10;
        int iC11;
        int iC12;
        int iC13;
        int i;
        byte[] blob;
        Boolean boolValueOf;
        dsd dsdVar2;
        int i2;
        byte[] blob2;
        Boolean boolValueOf2;
        lrd lrdVar = this.a;
        if (!z) {
            dsd dsdVarC = dsd.c(5, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time ASC, time_local ASC LIMIT ?");
            dsdVarC.k(1, j);
            dsdVarC.k(2, j2);
            vb9.h(dsdVarC, 3, j3, this);
            dsdVarC.k(4, 10);
            dsdVarC.k(5, 40);
            lrdVar.b();
            Cursor cursorN = lrdVar.n(dsdVarC);
            try {
                iC = s7j.c(cursorN, "id");
                iC2 = s7j.c(cursorN, "server_id");
                iC3 = s7j.c(cursorN, "time");
                iC4 = s7j.c(cursorN, "update_time");
                iC5 = s7j.c(cursorN, "sender");
                iC6 = s7j.c(cursorN, "cid");
                iC7 = s7j.c(cursorN, "text");
                iC8 = s7j.c(cursorN, "delivery_status");
                iC9 = s7j.c(cursorN, "status");
                iC10 = s7j.c(cursorN, "time_local");
                iC11 = s7j.c(cursorN, NegotiationErrorStat.KEY_ERROR);
                iC12 = s7j.c(cursorN, "localized_error");
                iC13 = s7j.c(cursorN, "attaches");
                dsdVar = dsdVarC;
            } catch (Throwable th) {
                th = th;
                dsdVar = dsdVarC;
            }
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
                int i3 = iC14;
                ArrayList arrayList = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    long j4 = cursorN.getLong(iC);
                    long j5 = cursorN.getLong(iC2);
                    long j6 = cursorN.getLong(iC3);
                    long j7 = cursorN.getLong(iC4);
                    long j8 = cursorN.getLong(iC5);
                    long j9 = cursorN.getLong(iC6);
                    String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                    int i4 = cursorN.getInt(iC8);
                    b().getClass();
                    xi9 xi9VarB = ky9.b(i4);
                    int i5 = cursorN.getInt(iC9);
                    b().getClass();
                    jm9 jm9VarD = ky9.d(i5);
                    long j10 = cursorN.getLong(iC10);
                    String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                    String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                    byte[] blob3 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                    b().getClass();
                    jdc jdcVarA = ky9.a(blob3);
                    int i6 = i3;
                    int i7 = cursorN.getInt(i6);
                    int i8 = iC7;
                    int i9 = iC15;
                    boolean z2 = cursorN.getInt(i9) != 0;
                    iC15 = i9;
                    int i10 = iC16;
                    int i11 = cursorN.getInt(i10);
                    iC16 = i10;
                    int i12 = iC17;
                    long j11 = cursorN.getLong(i12);
                    iC17 = i12;
                    int i13 = iC18;
                    boolean z3 = cursorN.getInt(i13) != 0;
                    iC18 = i13;
                    int i14 = iC19;
                    long j12 = cursorN.getLong(i14);
                    iC19 = i14;
                    int i15 = iC20;
                    String string4 = cursorN.isNull(i15) ? null : cursorN.getString(i15);
                    iC20 = i15;
                    int i16 = iC21;
                    String string5 = cursorN.isNull(i16) ? null : cursorN.getString(i16);
                    iC21 = i16;
                    int i17 = iC22;
                    String string6 = cursorN.isNull(i17) ? null : cursorN.getString(i17);
                    iC22 = i17;
                    int i18 = iC23;
                    Integer numValueOf = cursorN.isNull(i18) ? null : Integer.valueOf(cursorN.getInt(i18));
                    a().getClass();
                    int iA = m73.a(numValueOf);
                    iC23 = i18;
                    int i19 = iC24;
                    long j13 = cursorN.getLong(i19);
                    iC24 = i19;
                    int i20 = iC25;
                    long j14 = cursorN.getLong(i20);
                    iC25 = i20;
                    int i21 = iC26;
                    int i22 = cursorN.getInt(i21);
                    b().getClass();
                    int iE = ky9.e(i22);
                    iC26 = i21;
                    int i23 = iC27;
                    long j15 = cursorN.getLong(i23);
                    iC27 = i23;
                    int i24 = iC28;
                    int i25 = cursorN.getInt(i24);
                    iC28 = i24;
                    int i26 = iC29;
                    int i27 = cursorN.getInt(i26);
                    iC29 = i26;
                    int i28 = iC30;
                    long j16 = cursorN.getLong(i28);
                    iC30 = i28;
                    int i29 = iC31;
                    int i30 = cursorN.getInt(i29);
                    iC31 = i29;
                    int i31 = iC32;
                    long j17 = cursorN.getLong(i31);
                    iC32 = i31;
                    int i32 = iC33;
                    byte[] blob4 = cursorN.isNull(i32) ? null : cursorN.getBlob(i32);
                    b().getClass();
                    List listC = ky9.c(blob4);
                    iC33 = i32;
                    int i33 = iC34;
                    if (cursorN.isNull(i33)) {
                        i = i33;
                        blob = null;
                    } else {
                        i = i33;
                        blob = cursorN.getBlob(i33);
                    }
                    xl9 xl9VarF = b().f(blob);
                    int i34 = iC35;
                    Long lValueOf = cursorN.isNull(i34) ? null : Long.valueOf(cursorN.getLong(i34));
                    int i35 = iC36;
                    Integer numValueOf2 = cursorN.isNull(i35) ? null : Integer.valueOf(cursorN.getInt(i35));
                    if (numValueOf2 == null) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                    }
                    iC35 = i34;
                    int i36 = iC37;
                    iC37 = i36;
                    arrayList.add(new gj9(j4, j5, j6, j7, j8, j9, string, xi9VarB, jm9VarD, j10, string2, string3, jdcVarA, i7, z2, i11, j11, z3, j12, string4, string5, string6, iA, j13, j14, iE, j15, i25, i27, j16, i30, j17, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(i36)));
                    iC36 = i35;
                    iC7 = i8;
                    i3 = i6;
                    iC34 = i;
                }
                cursorN.close();
                dsdVar.y();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                cursorN.close();
                dsdVar.y();
                throw th;
            }
        }
        dsd dsdVarC2 = dsd.c(5, "SELECT * FROM messages WHERE chat_id = ? AND time >= ? AND time <= ? AND inserted_from_msg_link = 0 AND status <> ? AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL ORDER BY time DESC, time_local DESC LIMIT ?");
        dsdVarC2.k(1, j);
        dsdVarC2.k(2, j2);
        vb9.h(dsdVarC2, 3, j3, this);
        dsdVarC2.k(4, 10);
        dsdVarC2.k(5, 40);
        lrdVar.b();
        Cursor cursorN2 = lrdVar.n(dsdVarC2);
        try {
            int iC38 = s7j.c(cursorN2, "id");
            int iC39 = s7j.c(cursorN2, "server_id");
            int iC40 = s7j.c(cursorN2, "time");
            int iC41 = s7j.c(cursorN2, "update_time");
            int iC42 = s7j.c(cursorN2, "sender");
            int iC43 = s7j.c(cursorN2, "cid");
            int iC44 = s7j.c(cursorN2, "text");
            int iC45 = s7j.c(cursorN2, "delivery_status");
            int iC46 = s7j.c(cursorN2, "status");
            int iC47 = s7j.c(cursorN2, "time_local");
            int iC48 = s7j.c(cursorN2, NegotiationErrorStat.KEY_ERROR);
            int iC49 = s7j.c(cursorN2, "localized_error");
            int iC50 = s7j.c(cursorN2, "attaches");
            dsdVar2 = dsdVarC2;
            try {
                int iC51 = s7j.c(cursorN2, "media_type");
                int iC52 = s7j.c(cursorN2, "detect_share");
                int iC53 = s7j.c(cursorN2, "msg_link_type");
                int iC54 = s7j.c(cursorN2, "msg_link_id");
                int iC55 = s7j.c(cursorN2, "inserted_from_msg_link");
                int iC56 = s7j.c(cursorN2, "msg_link_chat_id");
                int iC57 = s7j.c(cursorN2, "msg_link_chat_name");
                int iC58 = s7j.c(cursorN2, "msg_link_chat_link");
                int iC59 = s7j.c(cursorN2, "msg_link_chat_icon_url");
                int iC60 = s7j.c(cursorN2, "msg_link_chat_access_type");
                int iC61 = s7j.c(cursorN2, "msg_link_out_chat_id");
                int iC62 = s7j.c(cursorN2, "msg_link_out_msg_id");
                int iC63 = s7j.c(cursorN2, "type");
                int iC64 = s7j.c(cursorN2, "chat_id");
                int iC65 = s7j.c(cursorN2, "channel_views");
                int iC66 = s7j.c(cursorN2, "channel_forwards");
                int iC67 = s7j.c(cursorN2, "view_time");
                int iC68 = s7j.c(cursorN2, "options");
                int iC69 = s7j.c(cursorN2, "live_until");
                int iC70 = s7j.c(cursorN2, "elements");
                int iC71 = s7j.c(cursorN2, "reactions");
                int iC72 = s7j.c(cursorN2, "delayed_attrs_time_to_fire");
                int iC73 = s7j.c(cursorN2, "delayed_attrs_notify_sender");
                int iC74 = s7j.c(cursorN2, "reactions_update_time");
                int i37 = iC51;
                ArrayList arrayList2 = new ArrayList(cursorN2.getCount());
                while (cursorN2.moveToNext()) {
                    long j18 = cursorN2.getLong(iC38);
                    long j19 = cursorN2.getLong(iC39);
                    long j20 = cursorN2.getLong(iC40);
                    long j21 = cursorN2.getLong(iC41);
                    long j22 = cursorN2.getLong(iC42);
                    long j23 = cursorN2.getLong(iC43);
                    String string7 = cursorN2.isNull(iC44) ? null : cursorN2.getString(iC44);
                    int i38 = cursorN2.getInt(iC45);
                    b().getClass();
                    xi9 xi9VarB2 = ky9.b(i38);
                    int i39 = cursorN2.getInt(iC46);
                    b().getClass();
                    jm9 jm9VarD2 = ky9.d(i39);
                    long j24 = cursorN2.getLong(iC47);
                    String string8 = cursorN2.isNull(iC48) ? null : cursorN2.getString(iC48);
                    String string9 = cursorN2.isNull(iC49) ? null : cursorN2.getString(iC49);
                    byte[] blob5 = cursorN2.isNull(iC50) ? null : cursorN2.getBlob(iC50);
                    b().getClass();
                    jdc jdcVarA2 = ky9.a(blob5);
                    int i40 = i37;
                    int i41 = cursorN2.getInt(i40);
                    int i42 = iC38;
                    int i43 = iC52;
                    boolean z4 = cursorN2.getInt(i43) != 0;
                    iC52 = i43;
                    int i44 = iC53;
                    int i45 = cursorN2.getInt(i44);
                    iC53 = i44;
                    int i46 = iC54;
                    long j25 = cursorN2.getLong(i46);
                    iC54 = i46;
                    int i47 = iC55;
                    boolean z5 = cursorN2.getInt(i47) != 0;
                    iC55 = i47;
                    int i48 = iC56;
                    long j26 = cursorN2.getLong(i48);
                    iC56 = i48;
                    int i49 = iC57;
                    String string10 = cursorN2.isNull(i49) ? null : cursorN2.getString(i49);
                    iC57 = i49;
                    int i50 = iC58;
                    String string11 = cursorN2.isNull(i50) ? null : cursorN2.getString(i50);
                    iC58 = i50;
                    int i51 = iC59;
                    String string12 = cursorN2.isNull(i51) ? null : cursorN2.getString(i51);
                    iC59 = i51;
                    int i52 = iC60;
                    Integer numValueOf3 = cursorN2.isNull(i52) ? null : Integer.valueOf(cursorN2.getInt(i52));
                    a().getClass();
                    int iA2 = m73.a(numValueOf3);
                    iC60 = i52;
                    int i53 = iC61;
                    long j27 = cursorN2.getLong(i53);
                    iC61 = i53;
                    int i54 = iC62;
                    long j28 = cursorN2.getLong(i54);
                    iC62 = i54;
                    int i55 = iC63;
                    int i56 = cursorN2.getInt(i55);
                    b().getClass();
                    int iE2 = ky9.e(i56);
                    iC63 = i55;
                    int i57 = iC64;
                    long j29 = cursorN2.getLong(i57);
                    iC64 = i57;
                    int i58 = iC65;
                    int i59 = cursorN2.getInt(i58);
                    iC65 = i58;
                    int i60 = iC66;
                    int i61 = cursorN2.getInt(i60);
                    iC66 = i60;
                    int i62 = iC67;
                    long j30 = cursorN2.getLong(i62);
                    iC67 = i62;
                    int i63 = iC68;
                    int i64 = cursorN2.getInt(i63);
                    iC68 = i63;
                    int i65 = iC69;
                    long j31 = cursorN2.getLong(i65);
                    iC69 = i65;
                    int i66 = iC70;
                    byte[] blob6 = cursorN2.isNull(i66) ? null : cursorN2.getBlob(i66);
                    b().getClass();
                    List listC2 = ky9.c(blob6);
                    iC70 = i66;
                    int i67 = iC71;
                    if (cursorN2.isNull(i67)) {
                        i2 = i67;
                        blob2 = null;
                    } else {
                        i2 = i67;
                        blob2 = cursorN2.getBlob(i67);
                    }
                    int i68 = iC39;
                    xl9 xl9VarF2 = b().f(blob2);
                    int i69 = iC72;
                    Long lValueOf2 = cursorN2.isNull(i69) ? null : Long.valueOf(cursorN2.getLong(i69));
                    int i70 = iC73;
                    Integer numValueOf4 = cursorN2.isNull(i70) ? null : Integer.valueOf(cursorN2.getInt(i70));
                    if (numValueOf4 == null) {
                        boolValueOf2 = null;
                    } else {
                        boolValueOf2 = Boolean.valueOf(numValueOf4.intValue() != 0);
                    }
                    iC72 = i69;
                    int i71 = iC74;
                    iC74 = i71;
                    arrayList2.add(new gj9(j18, j19, j20, j21, j22, j23, string7, xi9VarB2, jm9VarD2, j24, string8, string9, jdcVarA2, i41, z4, i45, j25, z5, j26, string10, string11, string12, iA2, j27, j28, iE2, j29, i59, i61, j30, i64, j31, listC2, xl9VarF2, lValueOf2, boolValueOf2, cursorN2.getLong(i71)));
                    iC73 = i70;
                    iC39 = i68;
                    iC38 = i42;
                    iC71 = i2;
                    i37 = i40;
                }
                cursorN2.close();
                dsdVar2.y();
                return arrayList2;
            } catch (Throwable th3) {
                th = th3;
                cursorN2.close();
                dsdVar2.y();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            dsdVar2 = dsdVarC2;
        }
    }

    public final long f(gj9 gj9Var) {
        lrd lrdVar = this.a;
        lrdVar.b();
        lrdVar.c();
        try {
            long jC = this.b.C(gj9Var);
            lrdVar.q();
            return jC;
        } finally {
            lrdVar.k();
        }
    }

    public final gj9 h(long j, long j2) throws Throwable {
        dsd dsdVar;
        dsd dsdVarC = dsd.c(2, "SELECT * FROM messages WHERE chat_id = ? AND cid = ?");
        dsdVarC.k(1, j);
        dsdVarC.k(2, j2);
        lrd lrdVar = this.a;
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
            int iC13 = s7j.c(cursorN, "attaches");
            dsdVar = dsdVarC;
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
                gj9 gj9Var = null;
                Boolean boolValueOf = null;
                if (cursorN.moveToFirst()) {
                    long j3 = cursorN.getLong(iC);
                    long j4 = cursorN.getLong(iC2);
                    long j5 = cursorN.getLong(iC3);
                    long j6 = cursorN.getLong(iC4);
                    long j7 = cursorN.getLong(iC5);
                    long j8 = cursorN.getLong(iC6);
                    String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                    int i = cursorN.getInt(iC8);
                    b().getClass();
                    xi9 xi9VarB = ky9.b(i);
                    int i2 = cursorN.getInt(iC9);
                    b().getClass();
                    jm9 jm9VarD = ky9.d(i2);
                    long j9 = cursorN.getLong(iC10);
                    String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                    String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                    byte[] blob = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                    b().getClass();
                    jdc jdcVarA = ky9.a(blob);
                    int i3 = cursorN.getInt(iC14);
                    boolean z = cursorN.getInt(iC15) != 0;
                    int i4 = cursorN.getInt(iC16);
                    long j10 = cursorN.getLong(iC17);
                    boolean z2 = cursorN.getInt(iC18) != 0;
                    long j11 = cursorN.getLong(iC19);
                    String string4 = cursorN.isNull(iC20) ? null : cursorN.getString(iC20);
                    String string5 = cursorN.isNull(iC21) ? null : cursorN.getString(iC21);
                    String string6 = cursorN.isNull(iC22) ? null : cursorN.getString(iC22);
                    Integer numValueOf = cursorN.isNull(iC23) ? null : Integer.valueOf(cursorN.getInt(iC23));
                    a().getClass();
                    int iA = m73.a(numValueOf);
                    long j12 = cursorN.getLong(iC24);
                    long j13 = cursorN.getLong(iC25);
                    int i5 = cursorN.getInt(iC26);
                    b().getClass();
                    int iE = ky9.e(i5);
                    long j14 = cursorN.getLong(iC27);
                    int i6 = cursorN.getInt(iC28);
                    int i7 = cursorN.getInt(iC29);
                    long j15 = cursorN.getLong(iC30);
                    int i8 = cursorN.getInt(iC31);
                    long j16 = cursorN.getLong(iC32);
                    byte[] blob2 = cursorN.isNull(iC33) ? null : cursorN.getBlob(iC33);
                    b().getClass();
                    List listC = ky9.c(blob2);
                    xl9 xl9VarF = b().f(cursorN.isNull(iC34) ? null : cursorN.getBlob(iC34));
                    Long lValueOf = cursorN.isNull(iC35) ? null : Long.valueOf(cursorN.getLong(iC35));
                    Integer numValueOf2 = cursorN.isNull(iC36) ? null : Integer.valueOf(cursorN.getInt(iC36));
                    if (numValueOf2 != null) {
                        boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                    }
                    gj9Var = new gj9(j3, j4, j5, j6, j7, j8, string, xi9VarB, jm9VarD, j9, string2, string3, jdcVarA, i3, z, i4, j10, z2, j11, string4, string5, string6, iA, j12, j13, iE, j14, i6, i7, j15, i8, j16, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(iC37));
                }
                cursorN.close();
                dsdVar.y();
                return gj9Var;
            } catch (Throwable th) {
                th = th;
                cursorN.close();
                dsdVar.y();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dsdVar = dsdVarC;
        }
    }

    public final Long i(long j, long j2) {
        dsd dsdVarC = dsd.c(2, "SELECT id FROM messages WHERE chat_id = ? AND server_id = ?");
        dsdVarC.k(1, j);
        dsdVarC.k(2, j2);
        lrd lrdVar = this.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            Long lValueOf = null;
            if (cursorN.moveToFirst() && !cursorN.isNull(0)) {
                lValueOf = Long.valueOf(cursorN.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorN.close();
            dsdVarC.y();
        }
    }

    public final long k(long j) {
        dsd dsdVarC = dsd.c(1, "SELECT time FROM messages WHERE id = ?");
        dsdVarC.k(1, j);
        lrd lrdVar = this.a;
        lrdVar.b();
        Cursor cursorN = lrdVar.n(dsdVarC);
        try {
            return cursorN.moveToFirst() ? cursorN.getLong(0) : 0L;
        } finally {
            cursorN.close();
            dsdVarC.y();
        }
    }

    public final int l(ml9 ml9Var) {
        lrd lrdVar = this.a;
        lrdVar.b();
        lrdVar.c();
        try {
            int iA = this.e.A(ml9Var);
            lrdVar.q();
            return iA;
        } finally {
            lrdVar.k();
        }
    }

    public final int m(wsg wsgVar) {
        lrd lrdVar = this.a;
        lrdVar.b();
        lrdVar.c();
        try {
            int iA = this.f.A(wsgVar);
            lrdVar.q();
            return iA;
        } finally {
            lrdVar.k();
        }
    }

    public final void n(long j, xi9 xi9Var) {
        lrd lrdVar = this.a;
        lrdVar.b();
        bi biVar = this.j;
        vk6 vk6VarA = biVar.a();
        b().getClass();
        vk6VarA.k(1, xi9Var.a);
        vk6VarA.k(2, j);
        try {
            lrdVar.c();
            try {
                vk6VarA.w();
                lrdVar.q();
            } finally {
                lrdVar.k();
            }
        } finally {
            biVar.r(vk6VarA);
        }
    }

    public final void p(long j, List list, jm9 jm9Var) {
        lrd lrdVar = this.a;
        lrdVar.b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE messages SET status = ? WHERE chat_id = ? AND id in (");
        lc4.a(sb, list.size());
        sb.append(")");
        vk6 vk6VarD = lrdVar.d(sb.toString());
        b().getClass();
        vk6VarD.k(1, jm9Var.a);
        vk6VarD.k(2, j);
        Iterator it = list.iterator();
        int i = 3;
        while (it.hasNext()) {
            Long l = (Long) it.next();
            if (l == null) {
                vk6VarD.S(i);
            } else {
                vk6VarD.k(i, l.longValue());
            }
            i++;
        }
        lrdVar.c();
        try {
            vk6VarD.w();
            lrdVar.q();
        } finally {
            lrdVar.k();
        }
    }

    public final void q(long j, xl9 xl9Var, long j2) {
        lrd lrdVar = this.a;
        lrdVar.b();
        hq9 hq9Var = this.q;
        vk6 vk6VarA = hq9Var.a();
        b().getClass();
        byte[] bArrG = ky9.g(xl9Var);
        if (bArrG == null) {
            vk6VarA.S(1);
        } else {
            vk6VarA.D(1, bArrG);
        }
        vk6VarA.k(2, j2);
        vk6VarA.k(3, j);
        try {
            lrdVar.c();
            try {
                vk6VarA.w();
                lrdVar.q();
            } finally {
                lrdVar.k();
            }
        } finally {
            hq9Var.r(vk6VarA);
        }
    }
}
