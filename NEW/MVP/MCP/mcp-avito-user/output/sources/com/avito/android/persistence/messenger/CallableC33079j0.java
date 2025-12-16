package com.avito.android.persistence.messenger;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: ChannelMetaInfoDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.j0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33079j0 implements Callable<List<Boolean>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215496b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C33087l0 f215497c;

    public CallableC33079j0(C33087l0 c33087l0, androidx.room.F0 f02) {
        this.f215497c = c33087l0;
        this.f215496b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.N
    public final List<Boolean> call() {
        Cursor cursorP = this.f215497c.f215506a.p(this.f215496b);
        try {
            ArrayList arrayList = new ArrayList(cursorP.getCount());
            while (cursorP.moveToNext()) {
                boolean z12 = false;
                if (cursorP.getInt(0) != 0) {
                    z12 = true;
                }
                arrayList.add(Boolean.valueOf(z12));
            }
            return arrayList;
        } finally {
            cursorP.close();
        }
    }

    public final void finalize() {
        this.f215496b.d();
    }
}
