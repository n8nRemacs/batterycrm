package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

/* loaded from: classes2.dex */
public final class jq9 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dsd b;
    public final /* synthetic */ lq9 c;

    public /* synthetic */ jq9(lq9 lq9Var, dsd dsdVar, int i) {
        this.a = i;
        this.c = lq9Var;
        this.b = dsdVar;
    }

    private final Object a() throws Throwable {
        dsd dsdVar;
        int i;
        boolean z;
        boolean z2;
        int i2;
        byte[] blob;
        lq9 lq9Var = this.c;
        lrd lrdVar = lq9Var.a;
        dsd dsdVar2 = this.b;
        Cursor cursorN = lrdVar.n(dsdVar2);
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
            dsdVar = dsdVar2;
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
                int i3 = iC14;
                ArrayList arrayList = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    long j = cursorN.getLong(iC);
                    long j2 = cursorN.getLong(iC2);
                    long j3 = cursorN.getLong(iC3);
                    long j4 = cursorN.getLong(iC4);
                    long j5 = cursorN.getLong(iC5);
                    long j6 = cursorN.getLong(iC6);
                    Boolean boolValueOf = null;
                    String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                    int i4 = cursorN.getInt(iC8);
                    lq9Var.b().getClass();
                    xi9 xi9VarB = ky9.b(i4);
                    int i5 = cursorN.getInt(iC9);
                    lq9Var.b().getClass();
                    jm9 jm9VarD = ky9.d(i5);
                    long j7 = cursorN.getLong(iC10);
                    String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                    String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                    byte[] blob2 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                    lq9Var.b().getClass();
                    jdc jdcVarA = ky9.a(blob2);
                    int i6 = i3;
                    int i7 = cursorN.getInt(i6);
                    int i8 = iC13;
                    int i9 = iC15;
                    boolean z3 = false;
                    if (cursorN.getInt(i9) != 0) {
                        iC15 = i9;
                        i = iC16;
                        z = false;
                        z3 = true;
                        z2 = true;
                    } else {
                        iC15 = i9;
                        i = iC16;
                        z = false;
                        z2 = true;
                    }
                    int i10 = cursorN.getInt(i);
                    int i11 = i;
                    int i12 = iC17;
                    boolean z4 = z2;
                    long j8 = cursorN.getLong(i12);
                    int i13 = iC18;
                    boolean z5 = cursorN.getInt(i13) != 0 ? z4 : z;
                    iC18 = i13;
                    int i14 = iC19;
                    long j9 = cursorN.getLong(i14);
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
                    long j10 = cursorN.getLong(i19);
                    iC24 = i19;
                    int i20 = iC25;
                    long j11 = cursorN.getLong(i20);
                    iC25 = i20;
                    int i21 = iC26;
                    int i22 = cursorN.getInt(i21);
                    lq9Var.b().getClass();
                    int iE = ky9.e(i22);
                    iC26 = i21;
                    int i23 = iC27;
                    long j12 = cursorN.getLong(i23);
                    iC27 = i23;
                    int i24 = iC28;
                    int i25 = cursorN.getInt(i24);
                    iC28 = i24;
                    int i26 = iC29;
                    int i27 = cursorN.getInt(i26);
                    iC29 = i26;
                    int i28 = iC30;
                    long j13 = cursorN.getLong(i28);
                    iC30 = i28;
                    int i29 = iC31;
                    int i30 = cursorN.getInt(i29);
                    iC31 = i29;
                    int i31 = iC32;
                    long j14 = cursorN.getLong(i31);
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
                            z = z4;
                        }
                        boolValueOf = Boolean.valueOf(z);
                    }
                    iC35 = i34;
                    int i36 = iC37;
                    iC37 = i36;
                    arrayList.add(new gj9(j, j2, j3, j4, j5, j6, string, xi9VarB, jm9VarD, j7, string2, string3, jdcVarA, i7, z3, i10, j8, z5, j9, string4, string5, string6, iA, j10, j11, iE, j12, i25, i27, j13, i30, j14, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(i36)));
                    iC36 = i35;
                    iC13 = i8;
                    iC16 = i11;
                    iC17 = i12;
                    i3 = i6;
                    iC34 = i2;
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
            dsdVar = dsdVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r42v0, types: [gj9] */
    private final Object b() throws Throwable {
        dsd dsdVar;
        lq9 lq9Var = this.c;
        lrd lrdVar = lq9Var.a;
        dsd dsdVar2 = this.b;
        Cursor cursorN = lrdVar.n(dsdVar2);
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
            dsdVar = dsdVar2;
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
                Boolean boolValueOf = null;
                if (cursorN.moveToFirst()) {
                    long j = cursorN.getLong(iC);
                    long j2 = cursorN.getLong(iC2);
                    long j3 = cursorN.getLong(iC3);
                    long j4 = cursorN.getLong(iC4);
                    long j5 = cursorN.getLong(iC5);
                    long j6 = cursorN.getLong(iC6);
                    String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                    int i = cursorN.getInt(iC8);
                    lq9Var.b().getClass();
                    xi9 xi9VarB = ky9.b(i);
                    int i2 = cursorN.getInt(iC9);
                    lq9Var.b().getClass();
                    jm9 jm9VarD = ky9.d(i2);
                    long j7 = cursorN.getLong(iC10);
                    String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                    String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                    byte[] blob = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                    lq9Var.b().getClass();
                    jdc jdcVarA = ky9.a(blob);
                    int i3 = cursorN.getInt(iC14);
                    boolean z = cursorN.getInt(iC15) != 0;
                    int i4 = cursorN.getInt(iC16);
                    long j8 = cursorN.getLong(iC17);
                    boolean z2 = cursorN.getInt(iC18) != 0;
                    long j9 = cursorN.getLong(iC19);
                    String string4 = cursorN.isNull(iC20) ? null : cursorN.getString(iC20);
                    String string5 = cursorN.isNull(iC21) ? null : cursorN.getString(iC21);
                    String string6 = cursorN.isNull(iC22) ? null : cursorN.getString(iC22);
                    Integer numValueOf = cursorN.isNull(iC23) ? null : Integer.valueOf(cursorN.getInt(iC23));
                    lq9Var.a().getClass();
                    int iA = m73.a(numValueOf);
                    long j10 = cursorN.getLong(iC24);
                    long j11 = cursorN.getLong(iC25);
                    int i5 = cursorN.getInt(iC26);
                    lq9Var.b().getClass();
                    int iE = ky9.e(i5);
                    long j12 = cursorN.getLong(iC27);
                    int i6 = cursorN.getInt(iC28);
                    int i7 = cursorN.getInt(iC29);
                    long j13 = cursorN.getLong(iC30);
                    int i8 = cursorN.getInt(iC31);
                    long j14 = cursorN.getLong(iC32);
                    byte[] blob2 = cursorN.isNull(iC33) ? null : cursorN.getBlob(iC33);
                    lq9Var.b().getClass();
                    List listC = ky9.c(blob2);
                    xl9 xl9VarF = lq9Var.b().f(cursorN.isNull(iC34) ? null : cursorN.getBlob(iC34));
                    Long lValueOf = cursorN.isNull(iC35) ? null : Long.valueOf(cursorN.getLong(iC35));
                    Integer numValueOf2 = cursorN.isNull(iC36) ? null : Integer.valueOf(cursorN.getInt(iC36));
                    if (numValueOf2 != null) {
                        boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                    }
                    boolValueOf = new gj9(j, j2, j3, j4, j5, j6, string, xi9VarB, jm9VarD, j7, string2, string3, jdcVarA, i3, z, i4, j8, z2, j9, string4, string5, string6, iA, j10, j11, iE, j12, i6, i7, j13, i8, j14, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(iC37));
                }
                cursorN.close();
                dsdVar.y();
                return boolValueOf;
            } catch (Throwable th) {
                th = th;
                cursorN.close();
                dsdVar.y();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dsdVar = dsdVar2;
        }
    }

    private final Object c() throws Throwable {
        dsd dsdVar;
        int i;
        boolean z;
        boolean z2;
        int i2;
        byte[] blob;
        lq9 lq9Var = this.c;
        lrd lrdVar = lq9Var.a;
        dsd dsdVar2 = this.b;
        Cursor cursorN = lrdVar.n(dsdVar2);
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
            dsdVar = dsdVar2;
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
                int i3 = iC14;
                ArrayList arrayList = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    long j = cursorN.getLong(iC);
                    long j2 = cursorN.getLong(iC2);
                    long j3 = cursorN.getLong(iC3);
                    long j4 = cursorN.getLong(iC4);
                    long j5 = cursorN.getLong(iC5);
                    long j6 = cursorN.getLong(iC6);
                    Boolean boolValueOf = null;
                    String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                    int i4 = cursorN.getInt(iC8);
                    lq9Var.b().getClass();
                    xi9 xi9VarB = ky9.b(i4);
                    int i5 = cursorN.getInt(iC9);
                    lq9Var.b().getClass();
                    jm9 jm9VarD = ky9.d(i5);
                    long j7 = cursorN.getLong(iC10);
                    String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                    String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                    byte[] blob2 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                    lq9Var.b().getClass();
                    jdc jdcVarA = ky9.a(blob2);
                    int i6 = i3;
                    int i7 = cursorN.getInt(i6);
                    int i8 = iC13;
                    int i9 = iC15;
                    boolean z3 = false;
                    if (cursorN.getInt(i9) != 0) {
                        iC15 = i9;
                        i = iC16;
                        z = false;
                        z3 = true;
                        z2 = true;
                    } else {
                        iC15 = i9;
                        i = iC16;
                        z = false;
                        z2 = true;
                    }
                    int i10 = cursorN.getInt(i);
                    int i11 = i;
                    int i12 = iC17;
                    boolean z4 = z2;
                    long j8 = cursorN.getLong(i12);
                    int i13 = iC18;
                    boolean z5 = cursorN.getInt(i13) != 0 ? z4 : z;
                    iC18 = i13;
                    int i14 = iC19;
                    long j9 = cursorN.getLong(i14);
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
                    long j10 = cursorN.getLong(i19);
                    iC24 = i19;
                    int i20 = iC25;
                    long j11 = cursorN.getLong(i20);
                    iC25 = i20;
                    int i21 = iC26;
                    int i22 = cursorN.getInt(i21);
                    lq9Var.b().getClass();
                    int iE = ky9.e(i22);
                    iC26 = i21;
                    int i23 = iC27;
                    long j12 = cursorN.getLong(i23);
                    iC27 = i23;
                    int i24 = iC28;
                    int i25 = cursorN.getInt(i24);
                    iC28 = i24;
                    int i26 = iC29;
                    int i27 = cursorN.getInt(i26);
                    iC29 = i26;
                    int i28 = iC30;
                    long j13 = cursorN.getLong(i28);
                    iC30 = i28;
                    int i29 = iC31;
                    int i30 = cursorN.getInt(i29);
                    iC31 = i29;
                    int i31 = iC32;
                    long j14 = cursorN.getLong(i31);
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
                            z = z4;
                        }
                        boolValueOf = Boolean.valueOf(z);
                    }
                    iC35 = i34;
                    int i36 = iC37;
                    iC37 = i36;
                    arrayList.add(new gj9(j, j2, j3, j4, j5, j6, string, xi9VarB, jm9VarD, j7, string2, string3, jdcVarA, i7, z3, i10, j8, z5, j9, string4, string5, string6, iA, j10, j11, iE, j12, i25, i27, j13, i30, j14, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(i36)));
                    iC36 = i35;
                    iC13 = i8;
                    iC16 = i11;
                    iC17 = i12;
                    i3 = i6;
                    iC34 = i2;
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
            dsdVar = dsdVar2;
        }
    }

    private final Object d() throws Throwable {
        dsd dsdVar;
        int i;
        boolean z;
        boolean z2;
        int i2;
        byte[] blob;
        lq9 lq9Var = this.c;
        lrd lrdVar = lq9Var.a;
        dsd dsdVar2 = this.b;
        Cursor cursorN = lrdVar.n(dsdVar2);
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
            dsdVar = dsdVar2;
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
                int i3 = iC14;
                ArrayList arrayList = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    long j = cursorN.getLong(iC);
                    long j2 = cursorN.getLong(iC2);
                    long j3 = cursorN.getLong(iC3);
                    long j4 = cursorN.getLong(iC4);
                    long j5 = cursorN.getLong(iC5);
                    long j6 = cursorN.getLong(iC6);
                    Boolean boolValueOf = null;
                    String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                    int i4 = cursorN.getInt(iC8);
                    lq9Var.b().getClass();
                    xi9 xi9VarB = ky9.b(i4);
                    int i5 = cursorN.getInt(iC9);
                    lq9Var.b().getClass();
                    jm9 jm9VarD = ky9.d(i5);
                    long j7 = cursorN.getLong(iC10);
                    String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                    String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                    byte[] blob2 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                    lq9Var.b().getClass();
                    jdc jdcVarA = ky9.a(blob2);
                    int i6 = i3;
                    int i7 = cursorN.getInt(i6);
                    int i8 = iC13;
                    int i9 = iC15;
                    boolean z3 = false;
                    if (cursorN.getInt(i9) != 0) {
                        iC15 = i9;
                        i = iC16;
                        z = false;
                        z3 = true;
                        z2 = true;
                    } else {
                        iC15 = i9;
                        i = iC16;
                        z = false;
                        z2 = true;
                    }
                    int i10 = cursorN.getInt(i);
                    int i11 = i;
                    int i12 = iC17;
                    boolean z4 = z2;
                    long j8 = cursorN.getLong(i12);
                    int i13 = iC18;
                    boolean z5 = cursorN.getInt(i13) != 0 ? z4 : z;
                    iC18 = i13;
                    int i14 = iC19;
                    long j9 = cursorN.getLong(i14);
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
                    long j10 = cursorN.getLong(i19);
                    iC24 = i19;
                    int i20 = iC25;
                    long j11 = cursorN.getLong(i20);
                    iC25 = i20;
                    int i21 = iC26;
                    int i22 = cursorN.getInt(i21);
                    lq9Var.b().getClass();
                    int iE = ky9.e(i22);
                    iC26 = i21;
                    int i23 = iC27;
                    long j12 = cursorN.getLong(i23);
                    iC27 = i23;
                    int i24 = iC28;
                    int i25 = cursorN.getInt(i24);
                    iC28 = i24;
                    int i26 = iC29;
                    int i27 = cursorN.getInt(i26);
                    iC29 = i26;
                    int i28 = iC30;
                    long j13 = cursorN.getLong(i28);
                    iC30 = i28;
                    int i29 = iC31;
                    int i30 = cursorN.getInt(i29);
                    iC31 = i29;
                    int i31 = iC32;
                    long j14 = cursorN.getLong(i31);
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
                            z = z4;
                        }
                        boolValueOf = Boolean.valueOf(z);
                    }
                    iC35 = i34;
                    int i36 = iC37;
                    iC37 = i36;
                    arrayList.add(new gj9(j, j2, j3, j4, j5, j6, string, xi9VarB, jm9VarD, j7, string2, string3, jdcVarA, i7, z3, i10, j8, z5, j9, string4, string5, string6, iA, j10, j11, iE, j12, i25, i27, j13, i30, j14, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(i36)));
                    iC36 = i35;
                    iC13 = i8;
                    iC16 = i11;
                    iC17 = i12;
                    i3 = i6;
                    iC34 = i2;
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
            dsdVar = dsdVar2;
        }
    }

    private final Object e() throws Throwable {
        dsd dsdVar;
        int i;
        boolean z;
        boolean z2;
        int i2;
        byte[] blob;
        lq9 lq9Var = this.c;
        lrd lrdVar = lq9Var.a;
        dsd dsdVar2 = this.b;
        Cursor cursorN = lrdVar.n(dsdVar2);
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
            dsdVar = dsdVar2;
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
                int i3 = iC14;
                ArrayList arrayList = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    long j = cursorN.getLong(iC);
                    long j2 = cursorN.getLong(iC2);
                    long j3 = cursorN.getLong(iC3);
                    long j4 = cursorN.getLong(iC4);
                    long j5 = cursorN.getLong(iC5);
                    long j6 = cursorN.getLong(iC6);
                    Boolean boolValueOf = null;
                    String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                    int i4 = cursorN.getInt(iC8);
                    lq9Var.b().getClass();
                    xi9 xi9VarB = ky9.b(i4);
                    int i5 = cursorN.getInt(iC9);
                    lq9Var.b().getClass();
                    jm9 jm9VarD = ky9.d(i5);
                    long j7 = cursorN.getLong(iC10);
                    String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                    String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                    byte[] blob2 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                    lq9Var.b().getClass();
                    jdc jdcVarA = ky9.a(blob2);
                    int i6 = i3;
                    int i7 = cursorN.getInt(i6);
                    int i8 = iC13;
                    int i9 = iC15;
                    boolean z3 = false;
                    if (cursorN.getInt(i9) != 0) {
                        iC15 = i9;
                        i = iC16;
                        z = false;
                        z3 = true;
                        z2 = true;
                    } else {
                        iC15 = i9;
                        i = iC16;
                        z = false;
                        z2 = true;
                    }
                    int i10 = cursorN.getInt(i);
                    int i11 = i;
                    int i12 = iC17;
                    boolean z4 = z2;
                    long j8 = cursorN.getLong(i12);
                    int i13 = iC18;
                    boolean z5 = cursorN.getInt(i13) != 0 ? z4 : z;
                    iC18 = i13;
                    int i14 = iC19;
                    long j9 = cursorN.getLong(i14);
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
                    long j10 = cursorN.getLong(i19);
                    iC24 = i19;
                    int i20 = iC25;
                    long j11 = cursorN.getLong(i20);
                    iC25 = i20;
                    int i21 = iC26;
                    int i22 = cursorN.getInt(i21);
                    lq9Var.b().getClass();
                    int iE = ky9.e(i22);
                    iC26 = i21;
                    int i23 = iC27;
                    long j12 = cursorN.getLong(i23);
                    iC27 = i23;
                    int i24 = iC28;
                    int i25 = cursorN.getInt(i24);
                    iC28 = i24;
                    int i26 = iC29;
                    int i27 = cursorN.getInt(i26);
                    iC29 = i26;
                    int i28 = iC30;
                    long j13 = cursorN.getLong(i28);
                    iC30 = i28;
                    int i29 = iC31;
                    int i30 = cursorN.getInt(i29);
                    iC31 = i29;
                    int i31 = iC32;
                    long j14 = cursorN.getLong(i31);
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
                            z = z4;
                        }
                        boolValueOf = Boolean.valueOf(z);
                    }
                    iC35 = i34;
                    int i36 = iC37;
                    iC37 = i36;
                    arrayList.add(new gj9(j, j2, j3, j4, j5, j6, string, xi9VarB, jm9VarD, j7, string2, string3, jdcVarA, i7, z3, i10, j8, z5, j9, string4, string5, string6, iA, j10, j11, iE, j12, i25, i27, j13, i30, j14, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(i36)));
                    iC36 = i35;
                    iC13 = i8;
                    iC16 = i11;
                    iC17 = i12;
                    i3 = i6;
                    iC34 = i2;
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
            dsdVar = dsdVar2;
        }
    }

    private final Object f() throws Throwable {
        dsd dsdVar;
        int i;
        boolean z;
        boolean z2;
        int i2;
        byte[] blob;
        lq9 lq9Var = this.c;
        lrd lrdVar = lq9Var.a;
        dsd dsdVar2 = this.b;
        Cursor cursorN = lrdVar.n(dsdVar2);
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
            dsdVar = dsdVar2;
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
                int i3 = iC14;
                ArrayList arrayList = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    long j = cursorN.getLong(iC);
                    long j2 = cursorN.getLong(iC2);
                    long j3 = cursorN.getLong(iC3);
                    long j4 = cursorN.getLong(iC4);
                    long j5 = cursorN.getLong(iC5);
                    long j6 = cursorN.getLong(iC6);
                    Boolean boolValueOf = null;
                    String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                    int i4 = cursorN.getInt(iC8);
                    lq9Var.b().getClass();
                    xi9 xi9VarB = ky9.b(i4);
                    int i5 = cursorN.getInt(iC9);
                    lq9Var.b().getClass();
                    jm9 jm9VarD = ky9.d(i5);
                    long j7 = cursorN.getLong(iC10);
                    String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                    String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                    byte[] blob2 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                    lq9Var.b().getClass();
                    jdc jdcVarA = ky9.a(blob2);
                    int i6 = i3;
                    int i7 = cursorN.getInt(i6);
                    int i8 = iC13;
                    int i9 = iC15;
                    boolean z3 = false;
                    if (cursorN.getInt(i9) != 0) {
                        iC15 = i9;
                        i = iC16;
                        z = false;
                        z3 = true;
                        z2 = true;
                    } else {
                        iC15 = i9;
                        i = iC16;
                        z = false;
                        z2 = true;
                    }
                    int i10 = cursorN.getInt(i);
                    int i11 = i;
                    int i12 = iC17;
                    boolean z4 = z2;
                    long j8 = cursorN.getLong(i12);
                    int i13 = iC18;
                    boolean z5 = cursorN.getInt(i13) != 0 ? z4 : z;
                    iC18 = i13;
                    int i14 = iC19;
                    long j9 = cursorN.getLong(i14);
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
                    long j10 = cursorN.getLong(i19);
                    iC24 = i19;
                    int i20 = iC25;
                    long j11 = cursorN.getLong(i20);
                    iC25 = i20;
                    int i21 = iC26;
                    int i22 = cursorN.getInt(i21);
                    lq9Var.b().getClass();
                    int iE = ky9.e(i22);
                    iC26 = i21;
                    int i23 = iC27;
                    long j12 = cursorN.getLong(i23);
                    iC27 = i23;
                    int i24 = iC28;
                    int i25 = cursorN.getInt(i24);
                    iC28 = i24;
                    int i26 = iC29;
                    int i27 = cursorN.getInt(i26);
                    iC29 = i26;
                    int i28 = iC30;
                    long j13 = cursorN.getLong(i28);
                    iC30 = i28;
                    int i29 = iC31;
                    int i30 = cursorN.getInt(i29);
                    iC31 = i29;
                    int i31 = iC32;
                    long j14 = cursorN.getLong(i31);
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
                            z = z4;
                        }
                        boolValueOf = Boolean.valueOf(z);
                    }
                    iC35 = i34;
                    int i36 = iC37;
                    iC37 = i36;
                    arrayList.add(new gj9(j, j2, j3, j4, j5, j6, string, xi9VarB, jm9VarD, j7, string2, string3, jdcVarA, i7, z3, i10, j8, z5, j9, string4, string5, string6, iA, j10, j11, iE, j12, i25, i27, j13, i30, j14, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(i36)));
                    iC36 = i35;
                    iC13 = i8;
                    iC16 = i11;
                    iC17 = i12;
                    i3 = i6;
                    iC34 = i2;
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
            dsdVar = dsdVar2;
        }
    }

    private final Object g() throws Throwable {
        dsd dsdVar;
        int i;
        boolean z;
        boolean z2;
        int i2;
        byte[] blob;
        lq9 lq9Var = this.c;
        lrd lrdVar = lq9Var.a;
        dsd dsdVar2 = this.b;
        Cursor cursorN = lrdVar.n(dsdVar2);
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
            dsdVar = dsdVar2;
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
                int i3 = iC14;
                ArrayList arrayList = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    long j = cursorN.getLong(iC);
                    long j2 = cursorN.getLong(iC2);
                    long j3 = cursorN.getLong(iC3);
                    long j4 = cursorN.getLong(iC4);
                    long j5 = cursorN.getLong(iC5);
                    long j6 = cursorN.getLong(iC6);
                    Boolean boolValueOf = null;
                    String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                    int i4 = cursorN.getInt(iC8);
                    lq9Var.b().getClass();
                    xi9 xi9VarB = ky9.b(i4);
                    int i5 = cursorN.getInt(iC9);
                    lq9Var.b().getClass();
                    jm9 jm9VarD = ky9.d(i5);
                    long j7 = cursorN.getLong(iC10);
                    String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                    String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                    byte[] blob2 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                    lq9Var.b().getClass();
                    jdc jdcVarA = ky9.a(blob2);
                    int i6 = i3;
                    int i7 = cursorN.getInt(i6);
                    int i8 = iC13;
                    int i9 = iC15;
                    boolean z3 = false;
                    if (cursorN.getInt(i9) != 0) {
                        iC15 = i9;
                        i = iC16;
                        z = false;
                        z3 = true;
                        z2 = true;
                    } else {
                        iC15 = i9;
                        i = iC16;
                        z = false;
                        z2 = true;
                    }
                    int i10 = cursorN.getInt(i);
                    int i11 = i;
                    int i12 = iC17;
                    boolean z4 = z2;
                    long j8 = cursorN.getLong(i12);
                    int i13 = iC18;
                    boolean z5 = cursorN.getInt(i13) != 0 ? z4 : z;
                    iC18 = i13;
                    int i14 = iC19;
                    long j9 = cursorN.getLong(i14);
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
                    long j10 = cursorN.getLong(i19);
                    iC24 = i19;
                    int i20 = iC25;
                    long j11 = cursorN.getLong(i20);
                    iC25 = i20;
                    int i21 = iC26;
                    int i22 = cursorN.getInt(i21);
                    lq9Var.b().getClass();
                    int iE = ky9.e(i22);
                    iC26 = i21;
                    int i23 = iC27;
                    long j12 = cursorN.getLong(i23);
                    iC27 = i23;
                    int i24 = iC28;
                    int i25 = cursorN.getInt(i24);
                    iC28 = i24;
                    int i26 = iC29;
                    int i27 = cursorN.getInt(i26);
                    iC29 = i26;
                    int i28 = iC30;
                    long j13 = cursorN.getLong(i28);
                    iC30 = i28;
                    int i29 = iC31;
                    int i30 = cursorN.getInt(i29);
                    iC31 = i29;
                    int i31 = iC32;
                    long j14 = cursorN.getLong(i31);
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
                            z = z4;
                        }
                        boolValueOf = Boolean.valueOf(z);
                    }
                    iC35 = i34;
                    int i36 = iC37;
                    iC37 = i36;
                    arrayList.add(new gj9(j, j2, j3, j4, j5, j6, string, xi9VarB, jm9VarD, j7, string2, string3, jdcVarA, i7, z3, i10, j8, z5, j9, string4, string5, string6, iA, j10, j11, iE, j12, i25, i27, j13, i30, j14, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(i36)));
                    iC36 = i35;
                    iC13 = i8;
                    iC16 = i11;
                    iC17 = i12;
                    i3 = i6;
                    iC34 = i2;
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
            dsdVar = dsdVar2;
        }
    }

    private final Object h() throws Throwable {
        dsd dsdVar;
        int i;
        boolean z;
        boolean z2;
        int i2;
        byte[] blob;
        lq9 lq9Var = this.c;
        lrd lrdVar = lq9Var.a;
        dsd dsdVar2 = this.b;
        Cursor cursorN = lrdVar.n(dsdVar2);
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
            dsdVar = dsdVar2;
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
                int i3 = iC14;
                ArrayList arrayList = new ArrayList(cursorN.getCount());
                while (cursorN.moveToNext()) {
                    long j = cursorN.getLong(iC);
                    long j2 = cursorN.getLong(iC2);
                    long j3 = cursorN.getLong(iC3);
                    long j4 = cursorN.getLong(iC4);
                    long j5 = cursorN.getLong(iC5);
                    long j6 = cursorN.getLong(iC6);
                    Boolean boolValueOf = null;
                    String string = cursorN.isNull(iC7) ? null : cursorN.getString(iC7);
                    int i4 = cursorN.getInt(iC8);
                    lq9Var.b().getClass();
                    xi9 xi9VarB = ky9.b(i4);
                    int i5 = cursorN.getInt(iC9);
                    lq9Var.b().getClass();
                    jm9 jm9VarD = ky9.d(i5);
                    long j7 = cursorN.getLong(iC10);
                    String string2 = cursorN.isNull(iC11) ? null : cursorN.getString(iC11);
                    String string3 = cursorN.isNull(iC12) ? null : cursorN.getString(iC12);
                    byte[] blob2 = cursorN.isNull(iC13) ? null : cursorN.getBlob(iC13);
                    lq9Var.b().getClass();
                    jdc jdcVarA = ky9.a(blob2);
                    int i6 = i3;
                    int i7 = cursorN.getInt(i6);
                    int i8 = iC13;
                    int i9 = iC15;
                    boolean z3 = false;
                    if (cursorN.getInt(i9) != 0) {
                        iC15 = i9;
                        i = iC16;
                        z = false;
                        z3 = true;
                        z2 = true;
                    } else {
                        iC15 = i9;
                        i = iC16;
                        z = false;
                        z2 = true;
                    }
                    int i10 = cursorN.getInt(i);
                    int i11 = i;
                    int i12 = iC17;
                    boolean z4 = z2;
                    long j8 = cursorN.getLong(i12);
                    int i13 = iC18;
                    boolean z5 = cursorN.getInt(i13) != 0 ? z4 : z;
                    iC18 = i13;
                    int i14 = iC19;
                    long j9 = cursorN.getLong(i14);
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
                    long j10 = cursorN.getLong(i19);
                    iC24 = i19;
                    int i20 = iC25;
                    long j11 = cursorN.getLong(i20);
                    iC25 = i20;
                    int i21 = iC26;
                    int i22 = cursorN.getInt(i21);
                    lq9Var.b().getClass();
                    int iE = ky9.e(i22);
                    iC26 = i21;
                    int i23 = iC27;
                    long j12 = cursorN.getLong(i23);
                    iC27 = i23;
                    int i24 = iC28;
                    int i25 = cursorN.getInt(i24);
                    iC28 = i24;
                    int i26 = iC29;
                    int i27 = cursorN.getInt(i26);
                    iC29 = i26;
                    int i28 = iC30;
                    long j13 = cursorN.getLong(i28);
                    iC30 = i28;
                    int i29 = iC31;
                    int i30 = cursorN.getInt(i29);
                    iC31 = i29;
                    int i31 = iC32;
                    long j14 = cursorN.getLong(i31);
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
                            z = z4;
                        }
                        boolValueOf = Boolean.valueOf(z);
                    }
                    iC35 = i34;
                    int i36 = iC37;
                    iC37 = i36;
                    arrayList.add(new gj9(j, j2, j3, j4, j5, j6, string, xi9VarB, jm9VarD, j7, string2, string3, jdcVarA, i7, z3, i10, j8, z5, j9, string4, string5, string6, iA, j10, j11, iE, j12, i25, i27, j13, i30, j14, listC, xl9VarF, lValueOf, boolValueOf, cursorN.getLong(i36)));
                    iC36 = i35;
                    iC13 = i8;
                    iC16 = i11;
                    iC17 = i12;
                    i3 = i6;
                    iC34 = i2;
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
            dsdVar = dsdVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r42v0, types: [gj9] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        dsd dsdVar;
        Cursor cursorN;
        dsd dsdVar2;
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
        boolean z;
        boolean z2;
        int i2;
        byte[] blob;
        switch (this.a) {
            case 0:
                lq9 lq9Var = this.c;
                lrd lrdVar = lq9Var.a;
                dsd dsdVar3 = this.b;
                Cursor cursorN2 = lrdVar.n(dsdVar3);
                try {
                    int iC14 = s7j.c(cursorN2, "id");
                    int iC15 = s7j.c(cursorN2, "server_id");
                    int iC16 = s7j.c(cursorN2, "time");
                    int iC17 = s7j.c(cursorN2, "update_time");
                    int iC18 = s7j.c(cursorN2, "sender");
                    int iC19 = s7j.c(cursorN2, "cid");
                    int iC20 = s7j.c(cursorN2, "text");
                    int iC21 = s7j.c(cursorN2, "delivery_status");
                    int iC22 = s7j.c(cursorN2, "status");
                    int iC23 = s7j.c(cursorN2, "time_local");
                    int iC24 = s7j.c(cursorN2, NegotiationErrorStat.KEY_ERROR);
                    int iC25 = s7j.c(cursorN2, "localized_error");
                    int iC26 = s7j.c(cursorN2, "attaches");
                    int iC27 = s7j.c(cursorN2, "media_type");
                    dsdVar = dsdVar3;
                    try {
                        int iC28 = s7j.c(cursorN2, "detect_share");
                        int iC29 = s7j.c(cursorN2, "msg_link_type");
                        int iC30 = s7j.c(cursorN2, "msg_link_id");
                        int iC31 = s7j.c(cursorN2, "inserted_from_msg_link");
                        int iC32 = s7j.c(cursorN2, "msg_link_chat_id");
                        int iC33 = s7j.c(cursorN2, "msg_link_chat_name");
                        int iC34 = s7j.c(cursorN2, "msg_link_chat_link");
                        int iC35 = s7j.c(cursorN2, "msg_link_chat_icon_url");
                        int iC36 = s7j.c(cursorN2, "msg_link_chat_access_type");
                        int iC37 = s7j.c(cursorN2, "msg_link_out_chat_id");
                        int iC38 = s7j.c(cursorN2, "msg_link_out_msg_id");
                        int iC39 = s7j.c(cursorN2, "type");
                        int iC40 = s7j.c(cursorN2, "chat_id");
                        int iC41 = s7j.c(cursorN2, "channel_views");
                        int iC42 = s7j.c(cursorN2, "channel_forwards");
                        int iC43 = s7j.c(cursorN2, "view_time");
                        int iC44 = s7j.c(cursorN2, "options");
                        int iC45 = s7j.c(cursorN2, "live_until");
                        int iC46 = s7j.c(cursorN2, "elements");
                        int iC47 = s7j.c(cursorN2, "reactions");
                        int iC48 = s7j.c(cursorN2, "delayed_attrs_time_to_fire");
                        int iC49 = s7j.c(cursorN2, "delayed_attrs_notify_sender");
                        int iC50 = s7j.c(cursorN2, "reactions_update_time");
                        Boolean boolValueOf = null;
                        if (cursorN2.moveToFirst()) {
                            long j = cursorN2.getLong(iC14);
                            long j2 = cursorN2.getLong(iC15);
                            long j3 = cursorN2.getLong(iC16);
                            long j4 = cursorN2.getLong(iC17);
                            long j5 = cursorN2.getLong(iC18);
                            long j6 = cursorN2.getLong(iC19);
                            String string = cursorN2.isNull(iC20) ? null : cursorN2.getString(iC20);
                            int i3 = cursorN2.getInt(iC21);
                            lq9Var.b().getClass();
                            xi9 xi9VarB = ky9.b(i3);
                            int i4 = cursorN2.getInt(iC22);
                            lq9Var.b().getClass();
                            jm9 jm9VarD = ky9.d(i4);
                            long j7 = cursorN2.getLong(iC23);
                            String string2 = cursorN2.isNull(iC24) ? null : cursorN2.getString(iC24);
                            String string3 = cursorN2.isNull(iC25) ? null : cursorN2.getString(iC25);
                            byte[] blob2 = cursorN2.isNull(iC26) ? null : cursorN2.getBlob(iC26);
                            lq9Var.b().getClass();
                            jdc jdcVarA = ky9.a(blob2);
                            int i5 = cursorN2.getInt(iC27);
                            boolean z3 = cursorN2.getInt(iC28) != 0;
                            int i6 = cursorN2.getInt(iC29);
                            long j8 = cursorN2.getLong(iC30);
                            boolean z4 = cursorN2.getInt(iC31) != 0;
                            long j9 = cursorN2.getLong(iC32);
                            String string4 = cursorN2.isNull(iC33) ? null : cursorN2.getString(iC33);
                            String string5 = cursorN2.isNull(iC34) ? null : cursorN2.getString(iC34);
                            String string6 = cursorN2.isNull(iC35) ? null : cursorN2.getString(iC35);
                            Integer numValueOf = cursorN2.isNull(iC36) ? null : Integer.valueOf(cursorN2.getInt(iC36));
                            lq9Var.a().getClass();
                            int iA = m73.a(numValueOf);
                            long j10 = cursorN2.getLong(iC37);
                            long j11 = cursorN2.getLong(iC38);
                            int i7 = cursorN2.getInt(iC39);
                            lq9Var.b().getClass();
                            int iE = ky9.e(i7);
                            long j12 = cursorN2.getLong(iC40);
                            int i8 = cursorN2.getInt(iC41);
                            int i9 = cursorN2.getInt(iC42);
                            long j13 = cursorN2.getLong(iC43);
                            int i10 = cursorN2.getInt(iC44);
                            long j14 = cursorN2.getLong(iC45);
                            byte[] blob3 = cursorN2.isNull(iC46) ? null : cursorN2.getBlob(iC46);
                            lq9Var.b().getClass();
                            List listC = ky9.c(blob3);
                            xl9 xl9VarF = lq9Var.b().f(cursorN2.isNull(iC47) ? null : cursorN2.getBlob(iC47));
                            Long lValueOf = cursorN2.isNull(iC48) ? null : Long.valueOf(cursorN2.getLong(iC48));
                            Integer numValueOf2 = cursorN2.isNull(iC49) ? null : Integer.valueOf(cursorN2.getInt(iC49));
                            if (numValueOf2 != null) {
                                boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                            }
                            boolValueOf = new gj9(j, j2, j3, j4, j5, j6, string, xi9VarB, jm9VarD, j7, string2, string3, jdcVarA, i5, z3, i6, j8, z4, j9, string4, string5, string6, iA, j10, j11, iE, j12, i8, i9, j13, i10, j14, listC, xl9VarF, lValueOf, boolValueOf, cursorN2.getLong(iC50));
                        }
                        cursorN2.close();
                        dsdVar.y();
                        return boolValueOf;
                    } catch (Throwable th) {
                        th = th;
                        cursorN2.close();
                        dsdVar.y();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dsdVar = dsdVar3;
                }
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return c();
            case 4:
                return d();
            case 5:
                return e();
            case 6:
                return f();
            case 7:
                return g();
            case 8:
                return h();
            case 9:
                cursorN = this.c.a.n(this.b);
                try {
                    ArrayList arrayList = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        arrayList.add(cursorN.isNull(0) ? null : Long.valueOf(cursorN.getLong(0)));
                    }
                    return arrayList;
                } finally {
                }
            case 10:
                cursorN = this.c.a.n(this.b);
                try {
                    Long lValueOf2 = null;
                    if (cursorN.moveToFirst() && !cursorN.isNull(0)) {
                        lValueOf2 = Long.valueOf(cursorN.getLong(0));
                    }
                    return lValueOf2;
                } finally {
                }
            case 11:
                cursorN = this.c.a.n(this.b);
                try {
                    ArrayList arrayList2 = new ArrayList(cursorN.getCount());
                    while (cursorN.moveToNext()) {
                        arrayList2.add(cursorN.isNull(0) ? null : Long.valueOf(cursorN.getLong(0)));
                    }
                    return arrayList2;
                } finally {
                }
            default:
                lq9 lq9Var2 = this.c;
                lrd lrdVar2 = lq9Var2.a;
                dsd dsdVar4 = this.b;
                Cursor cursorN3 = lrdVar2.n(dsdVar4);
                try {
                    iC = s7j.c(cursorN3, "id");
                    iC2 = s7j.c(cursorN3, "server_id");
                    iC3 = s7j.c(cursorN3, "time");
                    iC4 = s7j.c(cursorN3, "update_time");
                    iC5 = s7j.c(cursorN3, "sender");
                    iC6 = s7j.c(cursorN3, "cid");
                    iC7 = s7j.c(cursorN3, "text");
                    iC8 = s7j.c(cursorN3, "delivery_status");
                    iC9 = s7j.c(cursorN3, "status");
                    iC10 = s7j.c(cursorN3, "time_local");
                    iC11 = s7j.c(cursorN3, NegotiationErrorStat.KEY_ERROR);
                    iC12 = s7j.c(cursorN3, "localized_error");
                    iC13 = s7j.c(cursorN3, "attaches");
                    dsdVar2 = dsdVar4;
                } catch (Throwable th3) {
                    th = th3;
                    dsdVar2 = dsdVar4;
                }
                try {
                    int iC51 = s7j.c(cursorN3, "media_type");
                    int iC52 = s7j.c(cursorN3, "detect_share");
                    int iC53 = s7j.c(cursorN3, "msg_link_type");
                    int iC54 = s7j.c(cursorN3, "msg_link_id");
                    int iC55 = s7j.c(cursorN3, "inserted_from_msg_link");
                    int iC56 = s7j.c(cursorN3, "msg_link_chat_id");
                    int iC57 = s7j.c(cursorN3, "msg_link_chat_name");
                    int iC58 = s7j.c(cursorN3, "msg_link_chat_link");
                    int iC59 = s7j.c(cursorN3, "msg_link_chat_icon_url");
                    int iC60 = s7j.c(cursorN3, "msg_link_chat_access_type");
                    int iC61 = s7j.c(cursorN3, "msg_link_out_chat_id");
                    int iC62 = s7j.c(cursorN3, "msg_link_out_msg_id");
                    int iC63 = s7j.c(cursorN3, "type");
                    int iC64 = s7j.c(cursorN3, "chat_id");
                    int iC65 = s7j.c(cursorN3, "channel_views");
                    int iC66 = s7j.c(cursorN3, "channel_forwards");
                    int iC67 = s7j.c(cursorN3, "view_time");
                    int iC68 = s7j.c(cursorN3, "options");
                    int iC69 = s7j.c(cursorN3, "live_until");
                    int iC70 = s7j.c(cursorN3, "elements");
                    int iC71 = s7j.c(cursorN3, "reactions");
                    int iC72 = s7j.c(cursorN3, "delayed_attrs_time_to_fire");
                    int iC73 = s7j.c(cursorN3, "delayed_attrs_notify_sender");
                    int iC74 = s7j.c(cursorN3, "reactions_update_time");
                    int i11 = iC51;
                    ArrayList arrayList3 = new ArrayList(cursorN3.getCount());
                    while (cursorN3.moveToNext()) {
                        long j15 = cursorN3.getLong(iC);
                        long j16 = cursorN3.getLong(iC2);
                        long j17 = cursorN3.getLong(iC3);
                        long j18 = cursorN3.getLong(iC4);
                        long j19 = cursorN3.getLong(iC5);
                        long j20 = cursorN3.getLong(iC6);
                        Boolean boolValueOf2 = null;
                        String string7 = cursorN3.isNull(iC7) ? null : cursorN3.getString(iC7);
                        int i12 = cursorN3.getInt(iC8);
                        lq9Var2.b().getClass();
                        xi9 xi9VarB2 = ky9.b(i12);
                        int i13 = cursorN3.getInt(iC9);
                        lq9Var2.b().getClass();
                        jm9 jm9VarD2 = ky9.d(i13);
                        long j21 = cursorN3.getLong(iC10);
                        String string8 = cursorN3.isNull(iC11) ? null : cursorN3.getString(iC11);
                        String string9 = cursorN3.isNull(iC12) ? null : cursorN3.getString(iC12);
                        byte[] blob4 = cursorN3.isNull(iC13) ? null : cursorN3.getBlob(iC13);
                        lq9Var2.b().getClass();
                        jdc jdcVarA2 = ky9.a(blob4);
                        int i14 = i11;
                        int i15 = cursorN3.getInt(i14);
                        int i16 = iC13;
                        int i17 = iC52;
                        boolean z5 = false;
                        if (cursorN3.getInt(i17) != 0) {
                            iC52 = i17;
                            i = iC53;
                            z = false;
                            z5 = true;
                            z2 = true;
                        } else {
                            iC52 = i17;
                            i = iC53;
                            z = false;
                            z2 = true;
                        }
                        int i18 = cursorN3.getInt(i);
                        int i19 = i;
                        int i20 = iC54;
                        boolean z6 = z2;
                        long j22 = cursorN3.getLong(i20);
                        int i21 = iC55;
                        boolean z7 = cursorN3.getInt(i21) != 0 ? z6 : z;
                        iC55 = i21;
                        int i22 = iC56;
                        long j23 = cursorN3.getLong(i22);
                        iC56 = i22;
                        int i23 = iC57;
                        String string10 = cursorN3.isNull(i23) ? null : cursorN3.getString(i23);
                        iC57 = i23;
                        int i24 = iC58;
                        String string11 = cursorN3.isNull(i24) ? null : cursorN3.getString(i24);
                        iC58 = i24;
                        int i25 = iC59;
                        String string12 = cursorN3.isNull(i25) ? null : cursorN3.getString(i25);
                        iC59 = i25;
                        int i26 = iC60;
                        Integer numValueOf3 = cursorN3.isNull(i26) ? null : Integer.valueOf(cursorN3.getInt(i26));
                        lq9Var2.a().getClass();
                        int iA2 = m73.a(numValueOf3);
                        iC60 = i26;
                        int i27 = iC61;
                        long j24 = cursorN3.getLong(i27);
                        iC61 = i27;
                        int i28 = iC62;
                        long j25 = cursorN3.getLong(i28);
                        iC62 = i28;
                        int i29 = iC63;
                        int i30 = cursorN3.getInt(i29);
                        lq9Var2.b().getClass();
                        int iE2 = ky9.e(i30);
                        iC63 = i29;
                        int i31 = iC64;
                        long j26 = cursorN3.getLong(i31);
                        iC64 = i31;
                        int i32 = iC65;
                        int i33 = cursorN3.getInt(i32);
                        iC65 = i32;
                        int i34 = iC66;
                        int i35 = cursorN3.getInt(i34);
                        iC66 = i34;
                        int i36 = iC67;
                        long j27 = cursorN3.getLong(i36);
                        iC67 = i36;
                        int i37 = iC68;
                        int i38 = cursorN3.getInt(i37);
                        iC68 = i37;
                        int i39 = iC69;
                        long j28 = cursorN3.getLong(i39);
                        iC69 = i39;
                        int i40 = iC70;
                        byte[] blob5 = cursorN3.isNull(i40) ? null : cursorN3.getBlob(i40);
                        lq9Var2.b().getClass();
                        List listC2 = ky9.c(blob5);
                        iC70 = i40;
                        int i41 = iC71;
                        if (cursorN3.isNull(i41)) {
                            i2 = i41;
                            blob = null;
                        } else {
                            i2 = i41;
                            blob = cursorN3.getBlob(i41);
                        }
                        xl9 xl9VarF2 = lq9Var2.b().f(blob);
                        int i42 = iC72;
                        Long lValueOf3 = cursorN3.isNull(i42) ? null : Long.valueOf(cursorN3.getLong(i42));
                        int i43 = iC73;
                        Integer numValueOf4 = cursorN3.isNull(i43) ? null : Integer.valueOf(cursorN3.getInt(i43));
                        if (numValueOf4 != null) {
                            if (numValueOf4.intValue() != 0) {
                                z = z6;
                            }
                            boolValueOf2 = Boolean.valueOf(z);
                        }
                        iC72 = i42;
                        int i44 = iC74;
                        iC74 = i44;
                        arrayList3.add(new gj9(j15, j16, j17, j18, j19, j20, string7, xi9VarB2, jm9VarD2, j21, string8, string9, jdcVarA2, i15, z5, i18, j22, z7, j23, string10, string11, string12, iA2, j24, j25, iE2, j26, i33, i35, j27, i38, j28, listC2, xl9VarF2, lValueOf3, boolValueOf2, cursorN3.getLong(i44)));
                        iC73 = i43;
                        iC13 = i16;
                        iC53 = i19;
                        iC54 = i20;
                        i11 = i14;
                        iC71 = i2;
                    }
                    cursorN3.close();
                    dsdVar2.y();
                    return arrayList3;
                } catch (Throwable th4) {
                    th = th4;
                    cursorN3.close();
                    dsdVar2.y();
                    throw th;
                }
        }
    }
}
