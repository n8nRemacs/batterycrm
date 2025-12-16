package com.avito.android.enabler;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.util.C;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.functions.a;
import kotlin.G0;
import kotlin.Metadata;
import l41.g;

/* compiled from: RemoteFeaturesTouchMonitor.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001a\u0010\t\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\b2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\b2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R(\u0010\t\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/enabler/RemoteFeaturesTouchMonitor;", "", "Lcom/avito/android/enabler/AnalyticFeatures;", "analyticFeatures", "Lcom/avito/android/analytics/a;", "analytics", "Lkotlin/Function1;", "Lcom/avito/android/enabler/RemoteFeature;", "Lkotlin/G0;", "touchedFeaturesListener", "Lcom/avito/android/util/a5;", "schedulers", "Lcom/avito/android/util/C;", "buildInfo", "<init>", "(Lcom/avito/android/enabler/AnalyticFeatures;Lcom/avito/android/analytics/a;LY41/l;Lcom/avito/android/util/a5;Lcom/avito/android/util/C;)V", "feature", "reportTouchedFeatureValue", "(Lcom/avito/android/enabler/RemoteFeature;)V", "reportTouchedFeatureCacheState", "start", "()V", "Lcom/avito/android/enabler/AnalyticFeatures;", "Lcom/avito/android/analytics/a;", "LY41/l;", "Lcom/avito/android/util/a5;", "Lcom/avito/android/util/C;", "Lio/reactivex/rxjava3/disposables/c;", "disposable", "Lio/reactivex/rxjava3/disposables/c;", "_common_features-enabler_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RemoteFeaturesTouchMonitor {

    @k
    private final AnalyticFeatures analyticFeatures;

    @k
    private final InterfaceC28373a analytics;

    @k
    private final C buildInfo;

    @k
    private final c disposable = new c();

    @k
    private final InterfaceC35745a5 schedulers;

    @l
    private final Y41.l<RemoteFeature<Object>, G0> touchedFeaturesListener;

    /* JADX WARN: Multi-variable type inference failed */
    public RemoteFeaturesTouchMonitor(@k AnalyticFeatures analyticFeatures, @k InterfaceC28373a interfaceC28373a, @l Y41.l<? super RemoteFeature<Object>, G0> lVar, @k InterfaceC35745a5 interfaceC35745a5, @k C c12) {
        this.analyticFeatures = analyticFeatures;
        this.analytics = interfaceC28373a;
        this.touchedFeaturesListener = lVar;
        this.schedulers = interfaceC35745a5;
        this.buildInfo = c12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportTouchedFeatureCacheState(RemoteFeature<?> feature) {
        this.analytics.c(new y.a(MonitorsKt.basePrefix(this.buildInfo) + ".cache." + feature.getF3108c() + '.' + (this.analyticFeatures.getHasCacheForCurrentVersion() ? "hit" : "miss"), 0L, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportTouchedFeatureValue(RemoteFeature<?> feature) {
        String strInvoke = feature.invoke();
        if (strInvoke instanceof Boolean) {
            strInvoke = ((Boolean) strInvoke).booleanValue() ? "enabled" : BeduinCartItemModel.DISABLED_STRING;
        }
        this.analytics.c(new y.a(MonitorsKt.basePrefix(this.buildInfo) + ".toggles." + feature.getF3108c() + '.' + strInvoke, 0L, 2, null));
    }

    public final void start() {
        this.disposable.e();
        this.disposable.b(this.analyticFeatures.getTouchedFeatures().K(new g() { // from class: com.avito.android.enabler.RemoteFeaturesTouchMonitor.start.1
            @Override // l41.g
            public final void accept(@k RemoteFeature<Object> remoteFeature) {
                RemoteFeaturesTouchMonitor.this.reportTouchedFeatureValue(remoteFeature);
                RemoteFeaturesTouchMonitor.this.reportTouchedFeatureCacheState(remoteFeature);
                Y41.l lVar = RemoteFeaturesTouchMonitor.this.touchedFeaturesListener;
                if (lVar != null) {
                    lVar.invoke(remoteFeature);
                }
            }
        }).x0(this.schedulers.a()).v0(new g() { // from class: com.avito.android.enabler.RemoteFeaturesTouchMonitor.start.2
            @Override // l41.g
            public final void accept(@k RemoteFeature<Object> remoteFeature) {
            }
        }, new g() { // from class: com.avito.android.enabler.RemoteFeaturesTouchMonitor.start.3
            @Override // l41.g
            public final void accept(@k Throwable th2) {
                V2.f318762a.a("DEFAULT_TAG", "RemoteFeaturesTouchMonitor ERROR", th2);
            }
        }, a.f401993c));
    }
}
