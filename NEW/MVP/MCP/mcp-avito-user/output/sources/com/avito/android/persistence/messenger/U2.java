package com.avito.android.persistence.messenger;

import java.util.concurrent.Callable;

/* compiled from: UserDao_Impl.java */
/* loaded from: classes15.dex */
class U2 implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Long f215311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f215312c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f215313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b3 f215314e;

    public U2(b3 b3Var, Long l12, Long l13, String str) {
        this.f215314e = b3Var;
        this.f215311b = l12;
        this.f215312c = l13;
        this.f215313d = str;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Void call() {
        b3 b3Var = this.f215314e;
        androidx.room.O0 o02 = b3Var.f215414c;
        MessengerDatabase_Impl messengerDatabase_Impl = b3Var.f215412a;
        Z1.i iVarA = o02.a();
        Long l12 = this.f215311b;
        if (l12 == null) {
            iVarA.B4(1);
        } else {
            iVarA.g1(1, l12.longValue());
        }
        Long l13 = this.f215312c;
        if (l13 == null) {
            iVarA.B4(2);
        } else {
            iVarA.g1(2, l13.longValue());
        }
        iVarA.h4(3, this.f215313d);
        try {
            messengerDatabase_Impl.c();
            try {
                iVarA.B3();
                messengerDatabase_Impl.s();
                o02.c(iVarA);
                return null;
            } finally {
                messengerDatabase_Impl.l();
            }
        } catch (Throwable th2) {
            o02.c(iVarA);
            throw th2;
        }
    }
}
