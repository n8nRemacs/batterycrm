package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.TransferStatus;
import com.avito.android.persistence.messenger.UserEntityType;
import java.util.concurrent.Callable;

/* compiled from: MessageUploadPartDao_Impl.java */
/* loaded from: classes15.dex */
class N2 implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f215222b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransferStatus f215223c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f215224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f215225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f215226f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f215227g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ UserEntityType f215228h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ O2 f215229i;

    public N2(O2 o22, String str, TransferStatus transferStatus, String str2, String str3, String str4, long j12, UserEntityType userEntityType) {
        this.f215229i = o22;
        this.f215222b = str;
        this.f215223c = transferStatus;
        this.f215224d = str2;
        this.f215225e = str3;
        this.f215226f = str4;
        this.f215227g = j12;
        this.f215228h = userEntityType;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Void call() {
        O2 o22 = this.f215229i;
        androidx.room.O0 o02 = o22.f215268e;
        MessengerDatabase_Impl messengerDatabase_Impl = o22.f215264a;
        Z1.i iVarA = o02.a();
        iVarA.h4(1, this.f215222b);
        int i12 = TransferStatus.a.f215308a;
        iVarA.h4(2, this.f215223c.name());
        iVarA.h4(3, this.f215224d);
        iVarA.h4(4, this.f215225e);
        iVarA.h4(5, this.f215226f);
        iVarA.g1(6, this.f215227g);
        int i13 = UserEntityType.a.f215321a;
        iVarA.h4(7, this.f215228h.f215320b);
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
