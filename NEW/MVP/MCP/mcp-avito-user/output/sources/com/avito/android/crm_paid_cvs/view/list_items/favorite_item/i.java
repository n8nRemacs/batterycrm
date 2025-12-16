package com.avito.android.crm_paid_cvs.view.list_items.favorite_item;

import com.avito.android.crm_paid_cvs.dto.CvItem;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FavoriteItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f130893l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CvItem f130894m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ DeepLink f130895n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, CvItem cvItem, DeepLink deepLink) {
        super(0);
        this.f130893l = lVar;
        this.f130894m = cvItem;
        this.f130895n = deepLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        l lVar = this.f130893l;
        lVar.f130904f.c(new bt.j(lVar.f130905g, this.f130894m.f130326b, lVar.f130906h));
        lVar.f130903e.invoke(this.f130895n);
        return G0.f406611a;
    }
}
