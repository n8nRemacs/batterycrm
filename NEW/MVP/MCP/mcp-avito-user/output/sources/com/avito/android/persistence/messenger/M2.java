package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.TransferStatus;
import com.avito.android.persistence.messenger.UserEntityType;
import java.util.concurrent.Callable;

/* compiled from: MessageUploadPartDao_Impl.java */
/* loaded from: classes15.dex */
class M2 implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferStatus f215190b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f215191c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f215192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f215193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f215194f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ UserEntityType f215195g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ O2 f215196h;

    public M2(O2 o22, TransferStatus transferStatus, String str, String str2, String str3, long j12, UserEntityType userEntityType) {
        this.f215196h = o22;
        this.f215190b = transferStatus;
        this.f215191c = str;
        this.f215192d = str2;
        this.f215193e = str3;
        this.f215194f = j12;
        this.f215195g = userEntityType;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Void call() {
        O2 o22 = this.f215196h;
        androidx.room.O0 o02 = o22.f215267d;
        MessengerDatabase_Impl messengerDatabase_Impl = o22.f215264a;
        Z1.i iVarA = o02.a();
        int i12 = TransferStatus.a.f215308a;
        iVarA.h4(1, this.f215190b.name());
        iVarA.h4(2, this.f215191c);
        iVarA.h4(3, this.f215192d);
        iVarA.h4(4, this.f215193e);
        iVarA.g1(5, this.f215194f);
        int i13 = UserEntityType.a.f215321a;
        iVarA.h4(6, this.f215195g.f215320b);
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
