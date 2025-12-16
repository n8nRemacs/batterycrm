package com.avito.android.user_advert.advert;

import KV.a;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.design.tooltip.state.TooltipState;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lru/avito/component/appbar/ActionMenu;", "it", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.user_advert.advert.q0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35447q0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35435m0 f310582b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MyAdvertDetailsItem f310583c;

    public C35447q0(C35435m0 c35435m0, MyAdvertDetailsItem myAdvertDetailsItem) {
        this.f310582b = c35435m0;
        this.f310583c = myAdvertDetailsItem;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C35436m1 c35436m1;
        C35435m0 c35435m0 = this.f310582b;
        if (c35435m0.f310456Z.a()) {
            return;
        }
        c35435m0.f310456Z.b();
        MyAdvertDetails.CopyAdvertTooltip copyAdvertTooltip = this.f310583c.f309121U0;
        if (copyAdvertTooltip == null || (c35436m1 = c35435m0.f310463d0) == null) {
            return;
        }
        String title = copyAdvertTooltip.getTitle();
        String body = copyAdvertTooltip.getBody();
        String buttonText = copyAdvertTooltip.getButtonText();
        com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(c35436m1.f310558m, 0, 0, 6, null);
        a.C0572a c0572a = KV.a.f9464v;
        ContextThemeWrapper contextThemeWrapperB = AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, c35436m1.f310546a.getContext(), Integer.valueOf(R.style.Theme_DesignSystem_Re23));
        c0572a.getClass();
        kVar.c(KV.a.a(a.C0572a.b(R.style.Re23_Tooltip_Default, contextThemeWrapperB), C35436m1.f310544u, 0, 0, 2097150));
        r.a aVar = new r.a(new i.b(new b.a()));
        aVar.j(C35436m1.f310545v);
        C35445p1 c35445p1 = new C35445p1(kVar);
        View viewFindViewById = c35436m1.f310565t.findViewById(R.id.overflowActionButton);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        kVar.b(new TooltipState(aVar, false, null, title, body, buttonText, c35445p1, null, null, null, false, null, viewFindViewById, null, 12166, null));
    }
}
