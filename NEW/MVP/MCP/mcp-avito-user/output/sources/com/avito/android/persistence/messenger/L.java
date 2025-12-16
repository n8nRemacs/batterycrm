package com.avito.android.persistence.messenger;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: ChannelDao_Impl.java */
/* loaded from: classes15.dex */
class L implements Callable<List<String>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X f215185c;

    public L(X x12, androidx.room.F0 f02) {
        this.f215185c = x12;
        this.f215184b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.N
    public final List<String> call() {
        Cursor cursorP = this.f215185c.f215334a.p(this.f215184b);
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
        this.f215184b.d();
    }
}
