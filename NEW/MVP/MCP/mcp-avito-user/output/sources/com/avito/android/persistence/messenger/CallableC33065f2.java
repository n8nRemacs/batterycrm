package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.TransferStatus;
import com.avito.android.persistence.messenger.UserEntityType;
import java.util.concurrent.Callable;

/* compiled from: MessageMetaInfoDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.f2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33065f2 implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferStatus f215468b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f215469c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f215470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f215471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f215472f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ UserEntityType f215473g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C33132w2 f215474h;

    public CallableC33065f2(C33132w2 c33132w2, TransferStatus transferStatus, String str, String str2, String str3, String str4, UserEntityType userEntityType) {
        this.f215474h = c33132w2;
        this.f215468b = transferStatus;
        this.f215469c = str;
        this.f215470d = str2;
        this.f215471e = str3;
        this.f215472f = str4;
        this.f215473g = userEntityType;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Void call() {
        C33132w2 c33132w2 = this.f215474h;
        androidx.room.O0 o02 = c33132w2.f215565j;
        MessengerDatabase_Impl messengerDatabase_Impl = c33132w2.f215556a;
        Z1.i iVarA = o02.a();
        iVarA.g1(1, 0L);
        int i12 = TransferStatus.a.f215308a;
        iVarA.h4(2, this.f215468b.name());
        iVarA.h4(3, this.f215469c);
        iVarA.h4(4, this.f215470d);
        iVarA.h4(5, this.f215471e);
        iVarA.h4(6, this.f215472f);
        int i13 = UserEntityType.a.f215321a;
        iVarA.h4(7, this.f215473g.f215320b);
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
