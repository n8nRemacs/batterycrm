package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.ChannelIsReadStatus;
import com.avito.android.persistence.messenger.UserEntityType;
import java.util.concurrent.Callable;

/* compiled from: ChannelDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33050c implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ChannelIsReadStatus f215415b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f215416c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UserEntityType f215417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f215418e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ X f215419f;

    public CallableC33050c(X x12, ChannelIsReadStatus channelIsReadStatus, String str, UserEntityType userEntityType, String str2) {
        this.f215419f = x12;
        this.f215415b = channelIsReadStatus;
        this.f215416c = str;
        this.f215417d = userEntityType;
        this.f215418e = str2;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Void call() {
        X x12 = this.f215419f;
        androidx.room.O0 o02 = x12.f215339f;
        MessengerDatabase_Impl messengerDatabase_Impl = x12.f215334a;
        Z1.i iVarA = o02.a();
        int i12 = ChannelIsReadStatus.a.f215155a;
        iVarA.h4(1, this.f215415b.name());
        iVarA.h4(2, this.f215416c);
        int i13 = UserEntityType.a.f215321a;
        iVarA.h4(3, this.f215417d.f215320b);
        iVarA.h4(4, this.f215418e);
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
