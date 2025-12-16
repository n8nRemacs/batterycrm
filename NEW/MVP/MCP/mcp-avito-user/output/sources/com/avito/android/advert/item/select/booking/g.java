package com.avito.android.advert.item.select.booking;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.auto_select.AutoSelectButton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectBookingView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l<DeepLink, G0> f79379l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AutoSelectButton f79380m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f79381n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f79382o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(l<? super DeepLink, G0> lVar, AutoSelectButton autoSelectButton, h hVar, String str) {
        super(0);
        this.f79379l = lVar;
        this.f79380m = autoSelectButton;
        this.f79381n = hVar;
        this.f79382o = str;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ((c) this.f79379l).invoke(this.f79380m.getDeepLink());
        this.f79381n.f79384c.c1(this.f79382o);
        return G0.f406611a;
    }
}
