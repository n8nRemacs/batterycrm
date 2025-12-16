package com.avito.android.persistence.messenger;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* compiled from: MessageDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.r1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33111r1 implements Callable<Integer> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.room.F0 f215540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N1 f215541c;

    public CallableC33111r1(N1 n12, androidx.room.F0 f02) {
        this.f215541c = n12;
        this.f215540b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.N
    public final Integer call() {
        Cursor cursorP = this.f215541c.f215213a.p(this.f215540b);
        try {
            int iValueOf = cursorP.moveToFirst() ? Integer.valueOf(cursorP.getInt(0)) : 0;
            cursorP.close();
            return iValueOf;
        } catch (Throwable th2) {
            cursorP.close();
            throw th2;
        }
    }

    public final void finalize() {
        this.f215540b.d();
    }
}
