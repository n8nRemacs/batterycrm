package com.avito.android.persistence.messenger;

import android.database.Cursor;
import com.avito.android.persistence.messenger.IsReadStatus;
import com.avito.android.persistence.messenger.UserEntityType;
import com.huawei.hms.adapter.internal.CommonCode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: MessageDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.f1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33064f1 implements Callable<List<O1>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215466b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N1 f215467c;

    public CallableC33064f1(N1 n12, androidx.room.F0 f02) {
        this.f215467c = n12;
        this.f215466b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.N
    public final List<O1> call() {
        Long lValueOf;
        int i12;
        String string;
        int i13;
        String string2;
        int i14;
        String string3;
        int i15;
        String string4;
        int i16;
        Long lValueOf2;
        int i17;
        Boolean boolValueOf;
        int i18;
        Integer numValueOf;
        int i19;
        String string5;
        int i22;
        Long lValueOf3;
        Cursor cursorP = this.f215467c.f215213a.p(this.f215466b);
        try {
            int iB2 = V1.b.b(cursorP, "local_id");
            int iB3 = V1.b.b(cursorP, "channel_id");
            int iB4 = V1.b.b(cursorP, "remote_id");
            int iB5 = V1.b.b(cursorP, "created");
            int iB6 = V1.b.b(cursorP, "type");
            int iB7 = V1.b.b(cursorP, "user_id");
            int iB8 = V1.b.b(cursorP, "from_id");
            int iB9 = V1.b.b(cursorP, CommonCode.MapKey.JSON_BODY);
            int iB10 = V1.b.b(cursorP, "is_read");
            int iB11 = V1.b.b(cursorP, "is_spam");
            int iB12 = V1.b.b(cursorP, "is_failed");
            int iB13 = V1.b.b(cursorP, "read_timestamp");
            int iB14 = V1.b.b(cursorP, "preview_text");
            int iB15 = V1.b.b(cursorP, "is_supported");
            int iB16 = V1.b.b(cursorP, "is_complete");
            int iB17 = V1.b.b(cursorP, "is_read_status");
            int iB18 = V1.b.b(cursorP, "read_locally_timestamp");
            int iB19 = V1.b.b(cursorP, "qm_id");
            int iB20 = V1.b.b(cursorP, "qm_from_id");
            int iB21 = V1.b.b(cursorP, "qm_type");
            int iB22 = V1.b.b(cursorP, "qm_json_body");
            int iB23 = V1.b.b(cursorP, "qm_created");
            int iB24 = V1.b.b(cursorP, "is_qm_body_complete");
            int iB25 = V1.b.b(cursorP, "qm_chunk_index");
            int iB26 = V1.b.b(cursorP, "x_hash");
            int iB27 = V1.b.b(cursorP, "user_type");
            int iB28 = V1.b.b(cursorP, "user_account_id");
            int iB29 = V1.b.b(cursorP, "column_send_timestamp");
            int i23 = iB15;
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                String string6 = cursorP.getString(iB2);
                String string7 = cursorP.getString(iB3);
                String string8 = cursorP.isNull(iB4) ? null : cursorP.getString(iB4);
                long j12 = cursorP.getLong(iB5);
                String string9 = cursorP.getString(iB6);
                String string10 = cursorP.getString(iB7);
                String string11 = cursorP.getString(iB8);
                String string12 = cursorP.getString(iB9);
                boolean z12 = cursorP.getInt(iB10) != 0;
                boolean z13 = cursorP.getInt(iB11) != 0;
                boolean z14 = cursorP.getInt(iB12) != 0;
                Long lValueOf4 = cursorP.isNull(iB13) ? null : Long.valueOf(cursorP.getLong(iB13));
                String string13 = cursorP.isNull(iB14) ? null : cursorP.getString(iB14);
                int i24 = i23;
                int i25 = iB2;
                int i26 = iB16;
                boolean z15 = cursorP.getInt(i24) != 0;
                boolean z16 = cursorP.getInt(i26) != 0;
                int i27 = iB17;
                String string14 = cursorP.getString(i27);
                int i28 = IsReadStatus.a.f215179a;
                IsReadStatus isReadStatusValueOf = IsReadStatus.valueOf(string14);
                int i29 = iB18;
                if (cursorP.isNull(i29)) {
                    iB18 = i29;
                    i12 = iB19;
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(cursorP.getLong(i29));
                    iB18 = i29;
                    i12 = iB19;
                }
                if (cursorP.isNull(i12)) {
                    iB19 = i12;
                    i13 = iB20;
                    string = null;
                } else {
                    string = cursorP.getString(i12);
                    iB19 = i12;
                    i13 = iB20;
                }
                if (cursorP.isNull(i13)) {
                    iB20 = i13;
                    i14 = iB21;
                    string2 = null;
                } else {
                    string2 = cursorP.getString(i13);
                    iB20 = i13;
                    i14 = iB21;
                }
                if (cursorP.isNull(i14)) {
                    iB21 = i14;
                    i15 = iB22;
                    string3 = null;
                } else {
                    string3 = cursorP.getString(i14);
                    iB21 = i14;
                    i15 = iB22;
                }
                if (cursorP.isNull(i15)) {
                    iB22 = i15;
                    i16 = iB23;
                    string4 = null;
                } else {
                    string4 = cursorP.getString(i15);
                    iB22 = i15;
                    i16 = iB23;
                }
                if (cursorP.isNull(i16)) {
                    iB23 = i16;
                    i17 = iB24;
                    lValueOf2 = null;
                } else {
                    lValueOf2 = Long.valueOf(cursorP.getLong(i16));
                    iB23 = i16;
                    i17 = iB24;
                }
                Integer numValueOf2 = cursorP.isNull(i17) ? null : Integer.valueOf(cursorP.getInt(i17));
                if (numValueOf2 == null) {
                    iB24 = i17;
                    i18 = iB25;
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                    iB24 = i17;
                    i18 = iB25;
                }
                if (cursorP.isNull(i18)) {
                    iB25 = i18;
                    i19 = iB26;
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(cursorP.getInt(i18));
                    iB25 = i18;
                    i19 = iB26;
                }
                if (cursorP.isNull(i19)) {
                    iB26 = i19;
                    i22 = iB27;
                    string5 = null;
                } else {
                    string5 = cursorP.getString(i19);
                    iB26 = i19;
                    i22 = iB27;
                }
                UserEntityType userEntityTypeA = UserEntityType.a.a(cursorP.getString(i22));
                iB27 = i22;
                int i32 = iB28;
                String string15 = cursorP.getString(i32);
                iB28 = i32;
                int i33 = iB29;
                if (cursorP.isNull(i33)) {
                    iB29 = i33;
                    lValueOf3 = null;
                } else {
                    lValueOf3 = Long.valueOf(cursorP.getLong(i33));
                    iB29 = i33;
                }
                arrayList.add(new O1(string6, string7, string8, j12, string9, string10, string11, string12, z12, z13, z14, lValueOf4, string13, z15, z16, isReadStatusValueOf, lValueOf, string, string2, string3, string4, lValueOf2, boolValueOf, numValueOf, string5, userEntityTypeA, string15, lValueOf3));
                iB16 = i26;
                iB2 = i25;
                i23 = i24;
                iB17 = i27;
            }
            return arrayList;
        } finally {
            cursorP.close();
        }
    }

    public final void finalize() {
        this.f215466b.d();
    }
}
