package com.avito.android.tariff_cpt.info.ui.items.header;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff_cpt.info.ui.items.header.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CptInfoHeaderItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f298359l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f298360m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, g gVar) {
        super(0);
        this.f298359l = aVar;
        this.f298360m = gVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        a.C9112a c9112a = this.f298359l.f298344e;
        if (c9112a != null && (deepLink = c9112a.f298348c) != null) {
            this.f298360m.f298362b.invoke(deepLink);
        }
        return G0.f406611a;
    }
}
