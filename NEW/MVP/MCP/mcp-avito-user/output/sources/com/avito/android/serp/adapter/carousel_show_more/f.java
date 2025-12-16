package com.avito.android.serp.adapter.carousel_show_more;

import Y41.l;
import com.avito.android.remote.model.inset.AdditionalItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import rn0.InterfaceC47691c;

/* compiled from: CarouselShowMoreItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f269147l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdditionalItem.ShowMore f269148m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ CarouselShowMoreItem f269149n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f269150o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, AdditionalItem.ShowMore showMore, CarouselShowMoreItem carouselShowMoreItem, String str) {
        super(0);
        this.f269147l = gVar;
        this.f269148m = showMore;
        this.f269149n = carouselShowMoreItem;
        this.f269150o = str;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC47691c.a.a(this.f269147l.f269151b.get(), this.f269148m.getDeeplink(), null, 14);
        l<? super String, G0> lVar = this.f269149n.f269142g;
        if (lVar != null) {
            lVar.invoke(this.f269150o);
        }
        return G0.f406611a;
    }
}
