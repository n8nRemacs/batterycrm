package com.avito.android.certificate_pinning.domain;

import com.avito.android.certificate_pinning.NetworkState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.G;
import kotlin.Metadata;
import l41.o;

/* compiled from: UnsafeNetworkInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/certificate_pinning/NetworkState;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/O;", "apply", "(Lcom/avito/android/certificate_pinning/NetworkState;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class d<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f117784b;

    public d(e eVar) {
        this.f117784b = eVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        NetworkState networkState = (NetworkState) obj;
        long j12 = networkState.f117751b;
        return (j12 == 1 || j12 == 3) ? I.q(networkState) : new G(new VH0.c(this.f117784b, 13)).r(new c(networkState)).u(new com.avito.android.analytics.clickstream.I(11));
    }
}
