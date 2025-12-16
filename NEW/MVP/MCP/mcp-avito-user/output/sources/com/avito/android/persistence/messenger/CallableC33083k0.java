package com.avito.android.persistence.messenger;

import android.database.Cursor;
import com.avito.android.persistence.messenger.UserEntityType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: ChannelMetaInfoDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.k0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33083k0 implements Callable<List<Z>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C33087l0 f215503c;

    public CallableC33083k0(C33087l0 c33087l0, androidx.room.F0 f02) {
        this.f215503c = c33087l0;
        this.f215502b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.N
    public final List<Z> call() {
        Cursor cursorP = this.f215503c.f215506a.p(this.f215502b);
        try {
            int iB2 = V1.b.b(cursorP, "local_user_id");
            int iB3 = V1.b.b(cursorP, "channel_id");
            int iB4 = V1.b.b(cursorP, "last_synced_message_timestamp");
            int iB5 = V1.b.b(cursorP, "sellers_suggests_enabled");
            int iB6 = V1.b.b(cursorP, "deleted_locally_timestamp");
            int iB7 = V1.b.b(cursorP, "local_user_type");
            int iB8 = V1.b.b(cursorP, "local_user_account_id");
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                arrayList.add(new Z(cursorP.getString(iB2), cursorP.getString(iB3), cursorP.isNull(iB4) ? null : Long.valueOf(cursorP.getLong(iB4)), cursorP.getInt(iB5) != 0, cursorP.isNull(iB6) ? null : Long.valueOf(cursorP.getLong(iB6)), UserEntityType.a.a(cursorP.getString(iB7)), cursorP.getString(iB8)));
            }
            return arrayList;
        } finally {
            cursorP.close();
        }
    }

    public final void finalize() {
        this.f215502b.d();
    }
}
