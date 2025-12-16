package com.avito.android.historical_suggests.suggest;

import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: HistoricalSuggestsView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/historical_suggests/suggest/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/historical_suggests/suggest/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class m extends N implements Y41.a<n> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f162121l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k kVar) {
        super(0);
        this.f162121l = kVar;
    }

    @Override // Y41.a
    public final n invoke() {
        return this.f162121l.getViewModelProvider$_avito_historical_suggests_impl().get();
    }
}
