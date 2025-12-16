package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserEntityType;
import java.util.concurrent.Callable;

/* compiled from: MessageUploadPartDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.z2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33144z2 implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f215583b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f215584c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f215585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UserEntityType f215586e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ O2 f215587f;

    public CallableC33144z2(O2 o22, String str, String str2, String str3, UserEntityType userEntityType) {
        this.f215587f = o22;
        this.f215583b = str;
        this.f215584c = str2;
        this.f215585d = str3;
        this.f215586e = userEntityType;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Void call() {
        O2 o22 = this.f215587f;
        androidx.room.O0 o02 = o22.f215269f;
        MessengerDatabase_Impl messengerDatabase_Impl = o22.f215264a;
        Z1.i iVarA = o02.a();
        iVarA.h4(1, this.f215583b);
        iVarA.h4(2, this.f215584c);
        iVarA.h4(3, this.f215585d);
        int i12 = UserEntityType.a.f215321a;
        iVarA.h4(4, this.f215586e.f215320b);
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
