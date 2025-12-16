package com.avito.android.vas_performance.ui.items.applied_services;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.K;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.B;
import com.avito.android.remote.model.Action;
import com.avito.android.vas_performance.ui.items.applied_services.AppliedServiceItem;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AppliedServiceItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/applied_services/e;", "LTV0/d;", "Lcom/avito/android/vas_performance/ui/items/applied_services/g;", "Lcom/avito/android/vas_performance/ui/items/applied_services/AppliedServiceItem;", "Lcom/avito/android/deep_linking/K;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@B
/* loaded from: classes5.dex */
public final class e implements TV0.d<g, AppliedServiceItem>, K {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<DeepLink> f321573b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f321574c;

    @Inject
    public e() {
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f321573b = cVar;
        this.f321574c = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        DeepLink deepLink;
        g gVar = (g) eVar;
        AppliedServiceItem appliedServiceItem = (AppliedServiceItem) aVar;
        gVar.setTitle(appliedServiceItem.f321550c);
        gVar.h(appliedServiceItem.f321551d);
        gVar.x(com.avito.android.image_loader.b.b(appliedServiceItem.f321552e));
        AppliedServiceItem.State state = AppliedServiceItem.State.f321560e;
        AppliedServiceItem.State state2 = appliedServiceItem.f321555h;
        gVar.yJ(state2 == state ? R.attr.red600 : R.attr.gray48);
        ArrayList arrayList = null;
        Action action = appliedServiceItem.f321554g;
        gVar.oI(action != null ? action.getImage() : null, state2 == AppliedServiceItem.State.f321559d ? Integer.valueOf(R.attr.gray36) : null, new c(appliedServiceItem, this));
        Action action2 = appliedServiceItem.f321556i;
        gVar.E9(action2 != null ? action2.getTitle() : null);
        if (action2 != null && (deepLink = action2.getDeepLink()) != null) {
            gVar.wF(new d(this, deepLink));
        }
        List<com.avito.android.vas_performance.ui.items.stickers.a> list = appliedServiceItem.f321557j;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (L.f(((com.avito.android.vas_performance.ui.items.stickers.a) obj).f321724d, Boolean.TRUE)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        gVar.UK(arrayList, list);
    }

    @Override // com.avito.android.deep_linking.K
    @k
    public final z<DeepLink> k() {
        return this.f321574c;
    }
}
