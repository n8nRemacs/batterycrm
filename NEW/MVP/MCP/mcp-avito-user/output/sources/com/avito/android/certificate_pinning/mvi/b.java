package com.avito.android.certificate_pinning.mvi;

import com.avito.android.certificate_pinning.NetworkState;
import com.avito.android.certificate_pinning.mvi.entity.UnsafeNetworkState;
import kotlin.Metadata;
import l41.o;

/* compiled from: UnsafeNetworkActor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/certificate_pinning/mvi/entity/UnsafeNetworkInternalAction;", "it", "Lcom/avito/android/certificate_pinning/NetworkState;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class b<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnsafeNetworkState f117799b;

    public b(UnsafeNetworkState unsafeNetworkState) {
        this.f117799b = unsafeNetworkState;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return a.a((NetworkState) obj, this.f117799b.f117817c, 1);
    }
}
