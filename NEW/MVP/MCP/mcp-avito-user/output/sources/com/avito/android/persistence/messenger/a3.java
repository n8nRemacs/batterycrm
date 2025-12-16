package com.avito.android.persistence.messenger;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: UserDao_Impl.java */
/* loaded from: classes15.dex */
class a3 implements Callable<List<String>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b3 f215401c;

    public a3(b3 b3Var, androidx.room.F0 f02) {
        this.f215401c = b3Var;
        this.f215400b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.N
    public final List<String> call() {
        Cursor cursorP = this.f215401c.f215412a.p(this.f215400b);
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
        this.f215400b.d();
    }
}
