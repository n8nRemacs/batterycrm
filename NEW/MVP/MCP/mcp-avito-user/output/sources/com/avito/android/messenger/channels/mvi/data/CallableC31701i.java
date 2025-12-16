package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.persistence.messenger.UserEntityType;
import java.util.concurrent.Callable;
import kotlin.G0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.messenger.channels.mvi.data.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class CallableC31701i implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f187228b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C31704l f187229c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f187230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f187231e;

    public /* synthetic */ CallableC31701i(C31704l c31704l, MessengerUserHashInfo messengerUserHashInfo, String str, int i12) {
        this.f187228b = i12;
        this.f187229c = c31704l;
        this.f187230d = messengerUserHashInfo;
        this.f187231e = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f187228b) {
            case 0:
                MessengerUserHashInfo messengerUserHashInfo = this.f187230d;
                UserEntityType userEntityTypeG = com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c);
                this.f187229c.f187236a.e(messengerUserHashInfo.f430682d, this.f187231e, null, userEntityTypeG, messengerUserHashInfo.f430680b);
                break;
            default:
                MessengerUserHashInfo messengerUserHashInfo2 = this.f187230d;
                UserEntityType userEntityTypeG2 = com.avito.android.messenger.util.i.g(messengerUserHashInfo2.f430681c);
                Long lValueOf = Long.valueOf(System.currentTimeMillis());
                this.f187229c.f187236a.e(messengerUserHashInfo2.f430682d, this.f187231e, lValueOf, userEntityTypeG2, messengerUserHashInfo2.f430680b);
                break;
        }
        return G0.f406611a;
    }
}
