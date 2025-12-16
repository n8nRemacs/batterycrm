package com.avito.android.persistence.messenger;

import android.database.Cursor;
import com.avito.android.persistence.messenger.UserEntityType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: ChannelTagDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.t0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33118t0 implements Callable<List<C33091m0>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215548b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C33122u0 f215549c;

    public CallableC33118t0(C33122u0 c33122u0, androidx.room.F0 f02) {
        this.f215549c = c33122u0;
        this.f215548b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.N
    public final List<C33091m0> call() {
        Cursor cursorP = this.f215549c.f215550a.p(this.f215548b);
        try {
            int iB2 = V1.b.b(cursorP, "local_user_id");
            int iB3 = V1.b.b(cursorP, "channel_id");
            int iB4 = V1.b.b(cursorP, "tag");
            int iB5 = V1.b.b(cursorP, "local_user_type");
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                arrayList.add(new C33091m0(UserEntityType.a.a(cursorP.getString(iB5)), cursorP.getString(iB2), cursorP.getString(iB3), cursorP.getString(iB4)));
            }
            return arrayList;
        } finally {
            cursorP.close();
        }
    }

    public final void finalize() {
        this.f215548b.d();
    }
}
