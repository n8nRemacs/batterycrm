package com.avito.android.vas_performance.ui.items.applied_services;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AppliedServiceItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AppliedServiceItem f321569l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f321570m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AppliedServiceItem appliedServiceItem, e eVar) {
        super(0);
        this.f321569l = appliedServiceItem;
        this.f321570m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        Action action = this.f321569l.f321554g;
        if (action != null && (deepLink = action.getDeepLink()) != null) {
            this.f321570m.f321573b.accept(deepLink);
        }
        return G0.f406611a;
    }
}
