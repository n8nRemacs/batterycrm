package com.avito.android.persistence.messenger;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: ChannelMetaInfoDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.b0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33047b0 implements Callable<List<String>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C33087l0 f215403c;

    public CallableC33047b0(C33087l0 c33087l0, androidx.room.F0 f02) {
        this.f215403c = c33087l0;
        this.f215402b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.N
    public final List<String> call() {
        Cursor cursorP = this.f215403c.f215506a.p(this.f215402b);
        try {
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                arrayList.add(cursorP.getString(0));
            }
            return arrayList;
        } finally {
            cursorP.close();
        }
    }

    public final void finalize() {
        this.f215402b.d();
    }
}
