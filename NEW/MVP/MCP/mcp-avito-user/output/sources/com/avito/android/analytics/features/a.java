package com.avito.android.analytics.features;

import Y41.l;
import Y61.k;
import com.avito.android.InterfaceC36170z0;
import com.avito.android.enabler.AnalyticFeature;
import com.avito.android.enabler.AnalyticFeatures;
import com.avito.android.enabler.RemoteFeature;
import com.avito.android.enabler.TogglesStorage;
import com.jakewharton.rxrelay3.d;
import com.jakewharton.rxrelay3.e;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AvitoAnalyticFeaturesDecorator.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/features/a;", "Lcom/avito/android/z0;", "Lcom/avito/android/enabler/AnalyticFeatures;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class a implements InterfaceC36170z0, AnalyticFeatures {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final TogglesStorage f90169a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d<RemoteFeature<Object>> f90170b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final z<RemoteFeature<Object>> f90171c;

    /* compiled from: AvitoAnalyticFeaturesDecorator.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/enabler/RemoteFeature;", "", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/enabler/RemoteFeature;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.analytics.features.a$a, reason: collision with other inner class name */
    public static final class C2672a extends N implements l<RemoteFeature<Object>, G0> {
        public C2672a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(RemoteFeature<Object> remoteFeature) {
            a.this.f90170b.accept(remoteFeature);
            return G0.f406611a;
        }
    }

    public a(@k TogglesStorage togglesStorage) {
        this.f90169a = togglesStorage;
        d dVarM0 = e.N0().M0();
        this.f90170b = dVarM0;
        this.f90171c = dVarM0;
    }

    @Override // com.avito.android.InterfaceC36170z0
    @k
    public final DE0.a<Object> decorate(@k DE0.a<? extends Object> aVar) {
        return aVar instanceof RemoteFeature ? new AnalyticFeature((RemoteFeature) aVar, new C2672a()) : aVar;
    }

    @Override // com.avito.android.enabler.AnalyticFeatures
    public final boolean getHasCacheForCurrentVersion() {
        return this.f90169a.getHasCacheForCurrentVersion();
    }

    @Override // com.avito.android.enabler.AnalyticFeatures
    @k
    public final z<RemoteFeature<Object>> getTouchedFeatures() {
        return this.f90171c;
    }
}
