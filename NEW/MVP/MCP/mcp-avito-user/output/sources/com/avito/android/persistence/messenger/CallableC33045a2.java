package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserEntityType;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: MessageMetaInfoDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.a2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33045a2 implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f215394b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f215395c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f215396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f215397e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ UserEntityType f215398f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C33132w2 f215399g;

    public CallableC33045a2(C33132w2 c33132w2, ArrayList arrayList, String str, String str2, String str3, UserEntityType userEntityType) {
        this.f215399g = c33132w2;
        this.f215394b = arrayList;
        this.f215395c = str;
        this.f215396d = str2;
        this.f215397e = str3;
        this.f215398f = userEntityType;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Void call() {
        String strL;
        C33132w2 c33132w2 = this.f215399g;
        androidx.room.O0 o02 = c33132w2.f215561f;
        MessengerDatabase_Impl messengerDatabase_Impl = c33132w2.f215556a;
        Z1.i iVarA = o02.a();
        ArrayList arrayList = this.f215394b;
        if (arrayList == null) {
            strL = null;
        } else {
            int i12 = R0.f215305a;
            strL = new com.google.gson.d().a().l(arrayList);
        }
        if (strL == null) {
            iVarA.B4(1);
        } else {
            iVarA.h4(1, strL);
        }
        iVarA.h4(2, this.f215395c);
        iVarA.h4(3, this.f215396d);
        iVarA.h4(4, this.f215397e);
        int i13 = UserEntityType.a.f215321a;
        iVarA.h4(5, this.f215398f.f215320b);
        try {
            messengerDatabase_Impl.c();
            try {
                iVarA.B3();
                messengerDatabase_Impl.s();
                return null;
            } finally {
                messengerDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }
}
