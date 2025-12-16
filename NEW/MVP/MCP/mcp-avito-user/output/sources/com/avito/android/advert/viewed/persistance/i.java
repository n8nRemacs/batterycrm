package com.avito.android.advert.viewed.persistance;

import android.database.Cursor;
import androidx.room.F0;
import j.N;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: ViewedAdvertsDao_Impl.java */
/* loaded from: classes10.dex */
class i implements Callable<List<a>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0 f81048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f81049c;

    public i(c cVar, F0 f02) {
        this.f81049c = cVar;
        this.f81048b = f02;
    }

    @Override // java.util.concurrent.Callable
    @N
    public final List<a> call() {
        Cursor cursorP = this.f81049c.f81036a.p(this.f81048b);
        try {
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                arrayList.add(new a(cursorP.getString(0), cursorP.getLong(1)));
            }
            return arrayList;
        } finally {
            cursorP.close();
        }
    }

    public final void finalize() {
        this.f81048b.d();
    }
}
