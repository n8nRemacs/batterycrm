package com.avito.android.mortgage.person_form.list.items.action_banner;

import E00.b;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ActionBannerPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ActionBannerItem f200573l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f200574m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ActionBannerItem actionBannerItem, d dVar) {
        super(0);
        this.f200573l = actionBannerItem;
        this.f200574m = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f200573l.f200567f;
        if (deepLink != null) {
            this.f200574m.f200575b.invoke(new b.C13464a(deepLink));
        }
        return G0.f406611a;
    }
}
