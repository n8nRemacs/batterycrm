package com.avito.android.persistence.messenger;

import android.database.Cursor;
import com.avito.android.persistence.messenger.UserEntityType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: DraftDao_Impl.java */
/* loaded from: classes15.dex */
class K0 implements Callable<List<P0>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O0 f215181c;

    public K0(O0 o02, androidx.room.F0 f02) {
        this.f215181c = o02;
        this.f215180b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.N
    public final List<P0> call() {
        Cursor cursorP = this.f215181c.f215232a.p(this.f215180b);
        try {
            int iB2 = V1.b.b(cursorP, "local_user_id");
            int iB3 = V1.b.b(cursorP, "channel_id");
            int iB4 = V1.b.b(cursorP, "interlocutor_id");
            int iB5 = V1.b.b(cursorP, "text");
            int iB6 = V1.b.b(cursorP, "local_user_type");
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                arrayList.add(new P0(cursorP.getString(iB2), cursorP.getString(iB3), cursorP.getString(iB4), cursorP.getString(iB5), UserEntityType.a.a(cursorP.getString(iB6))));
            }
            return arrayList;
        } finally {
            cursorP.close();
        }
    }

    public final void finalize() {
        this.f215180b.d();
    }
}
