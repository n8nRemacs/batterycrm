package com.avito.android.persistence.messenger;

import android.database.Cursor;
import com.avito.android.persistence.messenger.TransferStatus;
import com.avito.android.persistence.messenger.UserEntityType;
import com.huawei.hms.adapter.internal.CommonCode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: MessageMetaInfoDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.k2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33085k2 implements Callable<List<Q1>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215504b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C33132w2 f215505c;

    public CallableC33085k2(C33132w2 c33132w2, androidx.room.F0 f02) {
        this.f215505c = c33132w2;
        this.f215504b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.N
    public final List<Q1> call() {
        List<FileChunkMetaInfo> listA;
        int i12;
        String string;
        Cursor cursorP = this.f215505c.f215556a.p(this.f215504b);
        try {
            int iB2 = V1.b.b(cursorP, "local_user_id");
            int iB3 = V1.b.b(cursorP, "channel_id");
            int iB4 = V1.b.b(cursorP, "local_message_id");
            int iB5 = V1.b.b(cursorP, "path");
            int iB6 = V1.b.b(cursorP, "internal_path");
            int iB7 = V1.b.b(cursorP, "progress");
            int iB8 = V1.b.b(cursorP, "transfer_status");
            int iB9 = V1.b.b(cursorP, "file_id");
            int iB10 = V1.b.b(cursorP, "video_id");
            int iB11 = V1.b.b(cursorP, "duration");
            int iB12 = V1.b.b(cursorP, "upload_session_id");
            int iB13 = V1.b.b(cursorP, "size_in_bytes");
            int iB14 = V1.b.b(cursorP, "chunk_count");
            int iB15 = V1.b.b(cursorP, "original_file_name");
            int iB16 = V1.b.b(cursorP, CommonCode.MapKey.HAS_RESOLUTION);
            int iB17 = V1.b.b(cursorP, "extension");
            int iB18 = V1.b.b(cursorP, "compression_failed");
            int iB19 = V1.b.b(cursorP, "file_hash");
            int iB20 = V1.b.b(cursorP, "recorded_video_internal_path");
            int iB21 = V1.b.b(cursorP, "local_user_type");
            int iB22 = V1.b.b(cursorP, "local_user_account_id");
            int iB23 = V1.b.b(cursorP, "local_file_chunks");
            int iB24 = V1.b.b(cursorP, "local_voice_error");
            int i13 = iB15;
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                String string2 = cursorP.getString(iB2);
                String string3 = cursorP.getString(iB3);
                String string4 = cursorP.getString(iB4);
                String string5 = cursorP.isNull(iB5) ? null : cursorP.getString(iB5);
                String string6 = cursorP.isNull(iB6) ? null : cursorP.getString(iB6);
                long j12 = cursorP.getLong(iB7);
                String string7 = cursorP.getString(iB8);
                int i14 = TransferStatus.a.f215308a;
                TransferStatus transferStatusValueOf = TransferStatus.valueOf(string7);
                String string8 = cursorP.isNull(iB9) ? null : cursorP.getString(iB9);
                String string9 = cursorP.isNull(iB10) ? null : cursorP.getString(iB10);
                long j13 = cursorP.getLong(iB11);
                String string10 = cursorP.isNull(iB12) ? null : cursorP.getString(iB12);
                long j14 = cursorP.getLong(iB13);
                long j15 = cursorP.getLong(iB14);
                int i15 = i13;
                String string11 = cursorP.isNull(i15) ? null : cursorP.getString(i15);
                int i16 = iB16;
                int i17 = iB2;
                String string12 = cursorP.isNull(i16) ? null : cursorP.getString(i16);
                int i18 = iB17;
                String string13 = cursorP.isNull(i18) ? null : cursorP.getString(i18);
                int i19 = iB18;
                boolean z12 = cursorP.getInt(i19) != 0;
                int i22 = iB19;
                String string14 = cursorP.isNull(i22) ? null : cursorP.getString(i22);
                int i23 = iB20;
                String string15 = cursorP.isNull(i23) ? null : cursorP.getString(i23);
                int i24 = iB21;
                UserEntityType userEntityTypeA = UserEntityType.a.a(cursorP.getString(i24));
                int i25 = iB22;
                String string16 = cursorP.getString(i25);
                iB22 = i25;
                int i26 = iB23;
                String string17 = cursorP.isNull(i26) ? null : cursorP.getString(i26);
                if (string17 == null) {
                    iB23 = i26;
                    i12 = iB24;
                    listA = null;
                } else {
                    listA = R0.a(string17);
                    iB23 = i26;
                    i12 = iB24;
                }
                if (cursorP.isNull(i12)) {
                    iB24 = i12;
                    string = null;
                } else {
                    string = cursorP.getString(i12);
                    iB24 = i12;
                }
                arrayList.add(new Q1(string2, string3, string4, string5, string6, j12, transferStatusValueOf, string8, string9, j13, string10, j14, j15, string11, string12, string13, z12, string14, string15, userEntityTypeA, string16, listA, string));
                iB2 = i17;
                iB16 = i16;
                iB17 = i18;
                iB18 = i19;
                iB19 = i22;
                iB20 = i23;
                iB21 = i24;
                i13 = i15;
            }
            return arrayList;
        } finally {
            cursorP.close();
        }
    }

    public final void finalize() {
        this.f215504b.d();
    }
}
