package com.avito.android.persistence.messenger;

import android.database.Cursor;
import com.avito.android.persistence.messenger.UserEntityType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: UserDao_Impl.java */
/* loaded from: classes15.dex */
class W2 implements Callable<List<c3>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b3 f215333c;

    public W2(b3 b3Var, androidx.room.F0 f02) {
        this.f215333c = b3Var;
        this.f215332b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.N
    public final List<c3> call() {
        Cursor cursorP = this.f215333c.f215412a.p(this.f215332b);
        try {
            int iB2 = V1.b.b(cursorP, "local_user_id");
            int iB3 = V1.b.b(cursorP, "user_id");
            int iB4 = V1.b.b(cursorP, "channel_id");
            int iB5 = V1.b.b(cursorP, "name");
            int iB6 = V1.b.b(cursorP, "label");
            int iB7 = V1.b.b(cursorP, "last_action_time");
            int iB8 = V1.b.b(cursorP, "time_diff");
            int iB9 = V1.b.b(cursorP, "json_public_profile");
            int iB10 = V1.b.b(cursorP, "local_user_type");
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                arrayList.add(new c3(cursorP.getString(iB2), cursorP.getString(iB3), cursorP.getString(iB4), cursorP.isNull(iB5) ? null : cursorP.getString(iB5), cursorP.isNull(iB6) ? null : cursorP.getString(iB6), cursorP.isNull(iB7) ? null : Long.valueOf(cursorP.getLong(iB7)), cursorP.isNull(iB8) ? null : Long.valueOf(cursorP.getLong(iB8)), cursorP.isNull(iB9) ? null : cursorP.getString(iB9), UserEntityType.a.a(cursorP.getString(iB10))));
            }
            return arrayList;
        } finally {
            cursorP.close();
        }
    }

    public final void finalize() {
        this.f215332b.d();
    }
}
