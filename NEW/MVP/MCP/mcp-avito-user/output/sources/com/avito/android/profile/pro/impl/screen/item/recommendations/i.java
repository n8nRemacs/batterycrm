package com.avito.android.profile.pro.impl.screen.item.recommendations;

import D90.a;
import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.pro.impl.screen.item.recommendations.ProfileProRecommendationsItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProRecommendationsView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ProfileProRecommendationsItem.Item f223432l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f223433m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ProfileProRecommendationsItem.Item item, j jVar) {
        super(0);
        this.f223432l = item;
        this.f223433m = jVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        for (DeepLink deepLink : (Iterable) this.f223432l.f223412g) {
            l<? super D90.a, G0> lVar = this.f223433m.f223438f;
            if (lVar != null) {
                lVar.invoke(new a.h(deepLink));
            }
        }
        return G0.f406611a;
    }
}
