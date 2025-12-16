package com.avito.android.user_advert.advert.items.machinery_rental_banner;

import com.avito.android.remote.model.text.AttributedText;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MachineryRentalBannerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f309590l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super(0);
        this.f309590l = jVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        j jVar = this.f309590l;
        Iterator it = jVar.f309594e.iterator();
        while (it.hasNext()) {
            ((AttributedText) it.next()).setOnDeepLinkClickListener(null);
        }
        jVar.f309594e.clear();
        return G0.f406611a;
    }
}
