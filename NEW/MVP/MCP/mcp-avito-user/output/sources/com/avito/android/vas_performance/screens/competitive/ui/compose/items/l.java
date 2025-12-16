package com.avito.android.vas_performance.screens.competitive.ui.compose.items;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CompetitiveVasV2InfoAction.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class l extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DeepLink f320519l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f320520m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Y41.l lVar, DeepLink deepLink) {
        super(0);
        this.f320519l = deepLink;
        this.f320520m = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f320519l;
        if (deepLink != null) {
            this.f320520m.invoke(deepLink);
        }
        return G0.f406611a;
    }
}
