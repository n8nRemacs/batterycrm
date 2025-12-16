package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.TransferStatus;
import com.avito.android.persistence.messenger.UserEntityType;
import java.util.concurrent.Callable;

/* compiled from: MessageMetaInfoDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.d2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33057d2 implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferStatus f215436b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f215437c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f215438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f215439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ UserEntityType f215440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C33132w2 f215441g;

    public CallableC33057d2(C33132w2 c33132w2, TransferStatus transferStatus, String str, String str2, String str3, UserEntityType userEntityType) {
        this.f215441g = c33132w2;
        this.f215436b = transferStatus;
        this.f215437c = str;
        this.f215438d = str2;
        this.f215439e = str3;
        this.f215440f = userEntityType;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Void call() {
        C33132w2 c33132w2 = this.f215441g;
        androidx.room.O0 o02 = c33132w2.f215563h;
        MessengerDatabase_Impl messengerDatabase_Impl = c33132w2.f215556a;
        Z1.i iVarA = o02.a();
        iVarA.g1(1, 0L);
        int i12 = TransferStatus.a.f215308a;
        iVarA.h4(2, this.f215436b.name());
        iVarA.B4(3);
        iVarA.B4(4);
        iVarA.h4(5, this.f215437c);
        iVarA.h4(6, this.f215438d);
        iVarA.h4(7, this.f215439e);
        int i13 = UserEntityType.a.f215321a;
        iVarA.h4(8, this.f215440f.f215320b);
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
