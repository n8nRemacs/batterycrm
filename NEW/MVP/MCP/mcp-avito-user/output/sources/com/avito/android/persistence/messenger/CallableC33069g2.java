package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserEntityType;
import java.util.concurrent.Callable;

/* compiled from: MessageMetaInfoDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.g2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class CallableC33069g2 implements Callable<Void> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f215475b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f215476c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f215477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f215478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f215479f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f215480g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ UserEntityType f215481h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C33132w2 f215482i;

    public CallableC33069g2(C33132w2 c33132w2, String str, String str2, String str3, String str4, String str5, String str6, UserEntityType userEntityType) {
        this.f215482i = c33132w2;
        this.f215475b = str;
        this.f215476c = str2;
        this.f215477d = str3;
        this.f215478e = str4;
        this.f215479f = str5;
        this.f215480g = str6;
        this.f215481h = userEntityType;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final Void call() {
        C33132w2 c33132w2 = this.f215482i;
        androidx.room.O0 o02 = c33132w2.f215566k;
        MessengerDatabase_Impl messengerDatabase_Impl = c33132w2.f215556a;
        Z1.i iVarA = o02.a();
        String str = this.f215475b;
        if (str == null) {
            iVarA.B4(1);
        } else {
            iVarA.h4(1, str);
        }
        String str2 = this.f215476c;
        if (str2 == null) {
            iVarA.B4(2);
        } else {
            iVarA.h4(2, str2);
        }
        String str3 = this.f215477d;
        if (str3 == null) {
            iVarA.B4(3);
        } else {
            iVarA.h4(3, str3);
        }
        iVarA.h4(4, this.f215478e);
        iVarA.h4(5, this.f215479f);
        iVarA.h4(6, this.f215480g);
        int i12 = UserEntityType.a.f215321a;
        iVarA.h4(7, this.f215481h.f215320b);
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
