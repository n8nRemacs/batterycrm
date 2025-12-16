package com.avito.android.persistence.messenger;

import android.database.Cursor;
import com.avito.android.persistence.messenger.TransferStatus;
import com.avito.android.persistence.messenger.UserEntityType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: MessageUploadPartDao_Impl.java */
/* loaded from: classes15.dex */
class B2 implements Callable<List<C33136x2>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215151b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O2 f215152c;

    public B2(O2 o22, androidx.room.F0 f02) {
        this.f215152c = o22;
        this.f215151b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.N
    public final List<C33136x2> call() {
        Cursor cursorP = this.f215152c.f215264a.p(this.f215151b);
        try {
            int iB2 = V1.b.b(cursorP, "local_user_id");
            int iB3 = V1.b.b(cursorP, "channel_id");
            int iB4 = V1.b.b(cursorP, "local_message_id");
            int iB5 = V1.b.b(cursorP, "part_number");
            int iB6 = V1.b.b(cursorP, "total_number_of_parts");
            int iB7 = V1.b.b(cursorP, "path");
            int iB8 = V1.b.b(cursorP, "transfer_status");
            int iB9 = V1.b.b(cursorP, "hash");
            int iB10 = V1.b.b(cursorP, "e_tag");
            int iB11 = V1.b.b(cursorP, "local_user_type");
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                String string = cursorP.getString(iB2);
                String string2 = cursorP.getString(iB3);
                String string3 = cursorP.getString(iB4);
                long j12 = cursorP.getLong(iB5);
                long j13 = cursorP.getLong(iB6);
                String string4 = cursorP.getString(iB7);
                String string5 = cursorP.getString(iB8);
                int i12 = TransferStatus.a.f215308a;
                arrayList.add(new C33136x2(string, string2, string3, j12, j13, string4, TransferStatus.valueOf(string5), cursorP.isNull(iB9) ? null : cursorP.getString(iB9), cursorP.isNull(iB10) ? null : cursorP.getString(iB10), UserEntityType.a.a(cursorP.getString(iB11))));
            }
            return arrayList;
        } finally {
            cursorP.close();
        }
    }

    public final void finalize() {
        this.f215151b.d();
    }
}
