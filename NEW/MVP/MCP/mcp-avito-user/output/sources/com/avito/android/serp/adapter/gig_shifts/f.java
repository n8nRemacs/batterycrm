package com.avito.android.serp.adapter.gig_shifts;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.widget_analytics.Analytics;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: GigShiftsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f270114l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f270115m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ GigShiftsItem f270116n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, int i12, GigShiftsItem gigShiftsItem) {
        super(1);
        this.f270114l = hVar;
        this.f270115m = i12;
        this.f270116n = gigShiftsItem;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        Analytics analytics = this.f270116n.f270100d;
        h.k(this.f270114l, deepLink, this.f270115m, analytics);
        return G0.f406611a;
    }
}
