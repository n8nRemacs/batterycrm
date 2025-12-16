package com.avito.android.messenger.conversation.mvi.data;

import com.avito.android.persistence.messenger.IsReadStatus;
import com.avito.android.persistence.messenger.UserEntityType;
import java.util.concurrent.Callable;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.messenger.conversation.mvi.data.o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class CallableC32026o implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f190484b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f190485c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f190487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f190488f;

    public /* synthetic */ CallableC32026o(d0 d0Var, MessengerUserHashInfo messengerUserHashInfo, String str, long j12, int i12) {
        this.f190484b = i12;
        this.f190485c = d0Var;
        this.f190486d = messengerUserHashInfo;
        this.f190487e = str;
        this.f190488f = j12;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f190484b) {
            case 0:
                MessengerUserHashInfo messengerUserHashInfo = this.f190486d;
                UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
                IsReadStatus isReadStatus = IsReadStatus.IS_READ;
                return Integer.valueOf(this.f190485c.f190454a.b(messengerUserHashInfo.f430682d, this.f190487e, this.f190488f, isReadStatus, userEntityTypeG));
            case 1:
                MessengerUserHashInfo messengerUserHashInfo2 = this.f190486d;
                UserEntityType userEntityTypeG2 = com.avito.android.messenger.util.i.g(messengerUserHashInfo2.f430681c);
                IsReadStatus isReadStatus2 = IsReadStatus.IS_READ;
                return Integer.valueOf(this.f190485c.f190454a.o(messengerUserHashInfo2.f430682d, this.f190487e, this.f190488f, isReadStatus2, userEntityTypeG2));
            default:
                MessengerUserHashInfo messengerUserHashInfo3 = this.f190486d;
                UserEntityType userEntityTypeG3 = com.avito.android.messenger.util.i.g(messengerUserHashInfo3.f430681c);
                return Integer.valueOf(this.f190485c.f190454a.g(messengerUserHashInfo3.f430682d, this.f190487e, IsReadStatus.IS_NOT_READ, IsReadStatus.IS_READ_LOCALLY, Long.valueOf(this.f190488f), userEntityTypeG3));
        }
    }
}
