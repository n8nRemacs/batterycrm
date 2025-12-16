package com.avito.android.serp.adapter.developments_catalog.advert_grid;

import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.serp.adapter.rich_snippets.realty.DevelopmentItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DevelopmentItemGridPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f269827l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DevelopmentItem f269828m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, DevelopmentItem developmentItem) {
        super(0);
        this.f269827l = kVar;
        this.f269828m = developmentItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        k kVar = this.f269827l;
        DevelopmentItem developmentItem = this.f269828m;
        b.a.a(kVar.f269829b, developmentItem.f270902k, null, null, 6);
        Y41.l<? super String, G0> lVar = developmentItem.f270911t;
        if (lVar != null) {
            lVar.invoke(developmentItem.f270894c);
        }
        return G0.f406611a;
    }
}
