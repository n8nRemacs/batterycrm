package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserEntityType;
import java.util.concurrent.Callable;

/* compiled from: MessageMetaInfoDao_Impl.java */
/* loaded from: classes15.dex */
class Z1 implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f215388b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f215389c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f215390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f215391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ UserEntityType f215392f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C33132w2 f215393g;

    public Z1(C33132w2 c33132w2, String str, String str2, String str3, String str4, UserEntityType userEntityType) {
        this.f215393g = c33132w2;
        this.f215388b = str;
        this.f215389c = str2;
        this.f215390d = str3;
        this.f215391e = str4;
        this.f215392f = userEntityType;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Void call() {
        C33132w2 c33132w2 = this.f215393g;
        androidx.room.O0 o02 = c33132w2.f215560e;
        MessengerDatabase_Impl messengerDatabase_Impl = c33132w2.f215556a;
        Z1.i iVarA = o02.a();
        String str = this.f215388b;
        if (str == null) {
            iVarA.B4(1);
        } else {
            iVarA.h4(1, str);
        }
        iVarA.h4(2, this.f215389c);
        iVarA.h4(3, this.f215390d);
        iVarA.h4(4, this.f215391e);
        int i12 = UserEntityType.a.f215321a;
        iVarA.h4(5, this.f215392f.f215320b);
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
