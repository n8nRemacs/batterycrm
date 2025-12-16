package com.avito.android.messenger.channels.mvi.data;

import java.util.concurrent.Callable;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class Q implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f187188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V f187189c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f187190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f187191e;

    public /* synthetic */ Q(V v12, MessengerUserHashInfo messengerUserHashInfo, String str, int i12) {
        this.f187188b = i12;
        this.f187189c = v12;
        this.f187190d = messengerUserHashInfo;
        this.f187191e = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f187188b) {
            case 0:
                MessengerUserHashInfo messengerUserHashInfo = this.f187190d;
                return Integer.valueOf(this.f187189c.f187198a.e(messengerUserHashInfo.f430682d, this.f187191e, com.avito.android.messenger.util.i.g(messengerUserHashInfo.f430681c)));
            default:
                MessengerUserHashInfo messengerUserHashInfo2 = this.f187190d;
                return Integer.valueOf(this.f187189c.f187198a.d(messengerUserHashInfo2.f430682d, this.f187191e, com.avito.android.messenger.util.i.g(messengerUserHashInfo2.f430681c)));
        }
    }
}
