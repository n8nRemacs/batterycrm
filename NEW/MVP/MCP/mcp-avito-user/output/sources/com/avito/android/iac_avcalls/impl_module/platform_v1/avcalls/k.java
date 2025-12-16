package com.avito.android.iac_avcalls.impl_module.platform_v1.avcalls;

import kotlin.Metadata;

/* compiled from: AvCallsExternalSignalingTransportImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f164555b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f164556c;

    public k(String str, int i12) {
        this.f164555b = str;
        this.f164556c = i12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("AvCallsPlatform", "ExternalSignalingTransport: Socket request started: method=" + this.f164555b + ", requestIndex=" + this.f164556c, null);
    }
}
