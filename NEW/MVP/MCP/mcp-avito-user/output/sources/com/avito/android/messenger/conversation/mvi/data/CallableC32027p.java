package com.avito.android.messenger.conversation.mvi.data;

import com.avito.android.persistence.messenger.TransferStatus;
import com.avito.android.persistence.messenger.UserEntityType;
import java.util.concurrent.Callable;
import kotlin.G0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.messenger.conversation.mvi.data.p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class CallableC32027p implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f190489b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f190490c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f190492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f190493f;

    public /* synthetic */ CallableC32027p(d0 d0Var, MessengerUserHashInfo messengerUserHashInfo, String str, String str2, int i12) {
        this.f190489b = i12;
        this.f190490c = d0Var;
        this.f190491d = messengerUserHashInfo;
        this.f190492e = str;
        this.f190493f = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f190489b) {
            case 0:
                MessengerUserHashInfo messengerUserHashInfo = this.f190491d;
                UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
                this.f190490c.f190454a.z(userEntityTypeG, messengerUserHashInfo.f430682d, this.f190492e, this.f190493f);
                return G0.f406611a;
            case 1:
                MessengerUserHashInfo messengerUserHashInfo2 = this.f190491d;
                UserEntityType userEntityTypeG2 = com.avito.android.messenger.util.i.g(messengerUserHashInfo2.f430681c);
                TransferStatus transferStatus = TransferStatus.IN_PROGRESS;
                this.f190490c.f190455b.e(transferStatus, userEntityTypeG2, messengerUserHashInfo2.f430682d, this.f190492e, this.f190493f, messengerUserHashInfo2.f430680b);
                return G0.f406611a;
            default:
                MessengerUserHashInfo messengerUserHashInfo3 = this.f190491d;
                UserEntityType userEntityTypeG3 = com.avito.android.messenger.util.i.g(messengerUserHashInfo3.f430681c);
                return Integer.valueOf(this.f190490c.f190454a.i(userEntityTypeG3, messengerUserHashInfo3.f430682d, this.f190492e, this.f190493f));
        }
    }
}
