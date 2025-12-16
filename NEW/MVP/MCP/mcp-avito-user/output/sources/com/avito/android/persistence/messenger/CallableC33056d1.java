package com.avito.android.persistence.messenger;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: MessageDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.d1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33056d1 implements Callable<List<String>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N1 f215435c;

    public CallableC33056d1(N1 n12, androidx.room.F0 f02) {
        this.f215435c = n12;
        this.f215434b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final List<String> call() {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215435c.f215213a;
        messengerDatabase_Impl.c();
        try {
            Cursor cursorB = V1.c.b(messengerDatabase_Impl, this.f215434b, false);
            try {
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    arrayList.add(cursorB.getString(0));
                }
                messengerDatabase_Impl.s();
                cursorB.close();
                return arrayList;
            } catch (Throwable th2) {
                cursorB.close();
                throw th2;
            }
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    public final void finalize() {
        this.f215434b.d();
    }
}
