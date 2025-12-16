package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserEntityType;
import java.util.concurrent.Callable;

/* compiled from: MessageMetaInfoDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.h2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33073h2 implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f215483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f215484c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f215485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f215486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f215487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f215488g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f215489h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f215490i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f215491j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ UserEntityType f215492k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33132w2 f215493l;

    public CallableC33073h2(C33132w2 c33132w2, String str, long j12, long j13, String str2, String str3, int i12, String str4, String str5, String str6, UserEntityType userEntityType) {
        this.f215493l = c33132w2;
        this.f215483b = str;
        this.f215484c = j12;
        this.f215485d = j13;
        this.f215486e = str2;
        this.f215487f = str3;
        this.f215488g = i12;
        this.f215489h = str4;
        this.f215490i = str5;
        this.f215491j = str6;
        this.f215492k = userEntityType;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Void call() {
        C33132w2 c33132w2 = this.f215493l;
        androidx.room.O0 o02 = c33132w2.f215567l;
        MessengerDatabase_Impl messengerDatabase_Impl = c33132w2.f215556a;
        Z1.i iVarA = o02.a();
        iVarA.h4(1, this.f215483b);
        iVarA.g1(2, this.f215484c);
        iVarA.g1(3, this.f215485d);
        String str = this.f215486e;
        if (str == null) {
            iVarA.B4(4);
        } else {
            iVarA.h4(4, str);
        }
        String str2 = this.f215487f;
        if (str2 == null) {
            iVarA.B4(5);
        } else {
            iVarA.h4(5, str2);
        }
        iVarA.g1(6, this.f215488g);
        iVarA.h4(7, this.f215489h);
        iVarA.h4(8, this.f215490i);
        iVarA.h4(9, this.f215491j);
        int i12 = UserEntityType.a.f215321a;
        iVarA.h4(10, this.f215492k.f215320b);
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
