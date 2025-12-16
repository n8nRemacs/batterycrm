package com.avito.android.persistence.messenger;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: ChannelDao_Impl.java */
/* loaded from: classes15.dex */
class F implements Callable<List<Long>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X f215167c;

    public F(X x12, androidx.room.F0 f02) {
        this.f215167c = x12;
        this.f215166b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final List<Long> call() {
        Cursor cursorP = this.f215167c.f215334a.p(this.f215166b);
        try {
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                arrayList.add(Long.valueOf(cursorP.getLong(0)));
            }
            return arrayList;
        } finally {
            cursorP.close();
        }
    }

    public final void finalize() {
        this.f215166b.d();
    }
}
