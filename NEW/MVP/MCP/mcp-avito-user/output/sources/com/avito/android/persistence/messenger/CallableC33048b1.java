package com.avito.android.persistence.messenger;

import android.database.Cursor;
import com.avito.android.persistence.messenger.IsReadStatus;
import com.avito.android.persistence.messenger.UserEntityType;
import com.huawei.hms.adapter.internal.CommonCode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: MessageDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.b1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33048b1 implements Callable<List<O1>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N1 f215405c;

    public CallableC33048b1(N1 n12, androidx.room.F0 f02) {
        this.f215405c = n12;
        this.f215404b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.N
    public final List<O1> call() throws Throwable {
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        int iB15;
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
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215405c.f215213a;
        messengerDatabase_Impl.c();
        try {
            try {
                Cursor cursorB = V1.c.b(messengerDatabase_Impl, this.f215404b, false);
                try {
                    iB2 = V1.b.b(cursorB, "local_id");
                    iB3 = V1.b.b(cursorB, "channel_id");
                    iB4 = V1.b.b(cursorB, "remote_id");
                    iB5 = V1.b.b(cursorB, "created");
                    iB6 = V1.b.b(cursorB, "type");
                    iB7 = V1.b.b(cursorB, "user_id");
                    iB8 = V1.b.b(cursorB, "from_id");
                    iB9 = V1.b.b(cursorB, CommonCode.MapKey.JSON_BODY);
                    iB10 = V1.b.b(cursorB, "is_read");
                    iB11 = V1.b.b(cursorB, "is_spam");
                    iB12 = V1.b.b(cursorB, "is_failed");
                    iB13 = V1.b.b(cursorB, "read_timestamp");
                    iB14 = V1.b.b(cursorB, "preview_text");
                    iB15 = V1.b.b(cursorB, "is_supported");
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    int iB16 = V1.b.b(cursorB, "is_complete");
                    int iB17 = V1.b.b(cursorB, "is_read_status");
                    int iB18 = V1.b.b(cursorB, "read_locally_timestamp");
                    int iB19 = V1.b.b(cursorB, "qm_id");
                    int iB20 = V1.b.b(cursorB, "qm_from_id");
                    int iB21 = V1.b.b(cursorB, "qm_type");
                    int iB22 = V1.b.b(cursorB, "qm_json_body");
                    int iB23 = V1.b.b(cursorB, "qm_created");
                    int iB24 = V1.b.b(cursorB, "is_qm_body_complete");
                    int iB25 = V1.b.b(cursorB, "qm_chunk_index");
                    int iB26 = V1.b.b(cursorB, "x_hash");
                    int iB27 = V1.b.b(cursorB, "user_type");
                    int iB28 = V1.b.b(cursorB, "user_account_id");
                    int iB29 = V1.b.b(cursorB, "column_send_timestamp");
                    int i23 = iB15;
                    ArrayList arrayList = new ArrayList(cursorB.getCount());
                    while (cursorB.moveToNext()) {
                        String string6 = cursorB.getString(iB2);
                        String string7 = cursorB.getString(iB3);
                        String string8 = cursorB.isNull(iB4) ? null : cursorB.getString(iB4);
                        long j12 = cursorB.getLong(iB5);
                        String string9 = cursorB.getString(iB6);
                        String string10 = cursorB.getString(iB7);
                        String string11 = cursorB.getString(iB8);
                        String string12 = cursorB.getString(iB9);
                        boolean z12 = true;
                        boolean z13 = cursorB.getInt(iB10) != 0;
                        boolean z14 = cursorB.getInt(iB11) != 0;
                        boolean z15 = cursorB.getInt(iB12) != 0;
                        Long lValueOf4 = cursorB.isNull(iB13) ? null : Long.valueOf(cursorB.getLong(iB13));
                        String string13 = cursorB.isNull(iB14) ? null : cursorB.getString(iB14);
                        int i24 = i23;
                        int i25 = iB2;
                        boolean z16 = cursorB.getInt(i24) != 0;
                        int i26 = iB16;
                        boolean z17 = cursorB.getInt(i26) != 0;
                        int i27 = iB17;
                        String string14 = cursorB.getString(i27);
                        int i28 = IsReadStatus.a.f215179a;
                        IsReadStatus isReadStatusValueOf = IsReadStatus.valueOf(string14);
                        int i29 = iB18;
                        if (cursorB.isNull(i29)) {
                            iB18 = i29;
                            i12 = iB19;
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(cursorB.getLong(i29));
                            iB18 = i29;
                            i12 = iB19;
                        }
                        if (cursorB.isNull(i12)) {
                            iB19 = i12;
                            i13 = iB20;
                            string = null;
                        } else {
                            string = cursorB.getString(i12);
                            iB19 = i12;
                            i13 = iB20;
                        }
                        if (cursorB.isNull(i13)) {
                            iB20 = i13;
                            i14 = iB21;
                            string2 = null;
                        } else {
                            string2 = cursorB.getString(i13);
                            iB20 = i13;
                            i14 = iB21;
                        }
                        if (cursorB.isNull(i14)) {
                            iB21 = i14;
                            i15 = iB22;
                            string3 = null;
                        } else {
                            string3 = cursorB.getString(i14);
                            iB21 = i14;
                            i15 = iB22;
                        }
                        if (cursorB.isNull(i15)) {
                            iB22 = i15;
                            i16 = iB23;
                            string4 = null;
                        } else {
                            string4 = cursorB.getString(i15);
                            iB22 = i15;
                            i16 = iB23;
                        }
                        if (cursorB.isNull(i16)) {
                            iB23 = i16;
                            i17 = iB24;
                            lValueOf2 = null;
                        } else {
                            lValueOf2 = Long.valueOf(cursorB.getLong(i16));
                            iB23 = i16;
                            i17 = iB24;
                        }
                        Integer numValueOf2 = cursorB.isNull(i17) ? null : Integer.valueOf(cursorB.getInt(i17));
                        if (numValueOf2 == null) {
                            iB24 = i17;
                            i18 = iB25;
                            boolValueOf = null;
                        } else {
                            if (numValueOf2.intValue() == 0) {
                                z12 = false;
                            }
                            boolValueOf = Boolean.valueOf(z12);
                            iB24 = i17;
                            i18 = iB25;
                        }
                        if (cursorB.isNull(i18)) {
                            iB25 = i18;
                            i19 = iB26;
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(cursorB.getInt(i18));
                            iB25 = i18;
                            i19 = iB26;
                        }
                        if (cursorB.isNull(i19)) {
                            iB26 = i19;
                            i22 = iB27;
                            string5 = null;
                        } else {
                            string5 = cursorB.getString(i19);
                            iB26 = i19;
                            i22 = iB27;
                        }
                        UserEntityType userEntityTypeA = UserEntityType.a.a(cursorB.getString(i22));
                        iB27 = i22;
                        int i32 = iB28;
                        String string15 = cursorB.getString(i32);
                        iB28 = i32;
                        int i33 = iB29;
                        if (cursorB.isNull(i33)) {
                            iB29 = i33;
                            lValueOf3 = null;
                        } else {
                            lValueOf3 = Long.valueOf(cursorB.getLong(i33));
                            iB29 = i33;
                        }
                        arrayList.add(new O1(string6, string7, string8, j12, string9, string10, string11, string12, z13, z14, z15, lValueOf4, string13, z16, z17, isReadStatusValueOf, lValueOf, string, string2, string3, string4, lValueOf2, boolValueOf, numValueOf, string5, userEntityTypeA, string15, lValueOf3));
                        iB2 = i25;
                        i23 = i24;
                        iB16 = i26;
                        iB17 = i27;
                    }
                    messengerDatabase_Impl.s();
                    cursorB.close();
                    messengerDatabase_Impl.l();
                    return arrayList;
                } catch (Throwable th3) {
                    th = th3;
                    cursorB.close();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                messengerDatabase_Impl.l();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            messengerDatabase_Impl.l();
            throw th;
        }
    }

    public final void finalize() {
        this.f215404b.d();
    }
}
