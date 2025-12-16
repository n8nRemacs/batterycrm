package com.avito.android.di.module;

import com.avito.android.enabler.RemoteFeature;
import kotlin.Metadata;

/* compiled from: AnalyticFeaturesModule.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/enabler/RemoteFeature;", "", "feature", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/enabler/RemoteFeature;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class S extends kotlin.jvm.internal.N implements Y41.l<RemoteFeature<Object>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.error_reporting.app_state.J f144122l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(com.avito.android.error_reporting.app_state.J j12) {
        super(1);
        this.f144122l = j12;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(RemoteFeature<Object> remoteFeature) {
        RemoteFeature<Object> remoteFeature2 = remoteFeature;
        this.f144122l.a(remoteFeature2.getF3108c(), !kotlin.jvm.internal.L.f(remoteFeature2.getOriginalValue(), remoteFeature2.getValue()), remoteFeature2.getValue());
        return kotlin.G0.f406611a;
    }
}
