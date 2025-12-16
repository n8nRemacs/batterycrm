package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserEntityType;
import java.util.concurrent.Callable;

/* compiled from: ChannelDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33058e implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f215445b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UserEntityType f215446c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f215447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ X f215448e;

    public CallableC33058e(X x12, String str, UserEntityType userEntityType, String str2) {
        this.f215448e = x12;
        this.f215445b = str;
        this.f215446c = userEntityType;
        this.f215447d = str2;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Void call() {
        X x12 = this.f215448e;
        androidx.room.O0 o02 = x12.f215341h;
        MessengerDatabase_Impl messengerDatabase_Impl = x12.f215334a;
        Z1.i iVarA = o02.a();
        iVarA.h4(1, this.f215445b);
        int i12 = UserEntityType.a.f215321a;
        iVarA.h4(2, this.f215446c.f215320b);
        iVarA.h4(3, this.f215447d);
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
