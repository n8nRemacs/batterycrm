package com.avito.android.campaigns_sale;

import com.avito.android.R;
import com.avito.android.campaigns_sale.CampaignsSaleFragment;
import com.avito.android.campaigns_sale.mvi.entity.CampaignsSaleState;
import com.avito.android.campaigns_sale.mvi.entity.a;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.google.android.material.appbar.MaterialToolbar;
import im.InterfaceC41424a;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CampaignsSaleFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleFragment f113962l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleState f113963m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC41424a, G0> f113964n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(CampaignsSaleFragment campaignsSaleFragment, CampaignsSaleState campaignsSaleState, Y41.l<? super InterfaceC41424a, G0> lVar) {
        super(0);
        this.f113962l = campaignsSaleFragment;
        this.f113963m = campaignsSaleState;
        this.f113964n = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Y41.l<InterfaceC41424a, G0> lVar = this.f113964n;
        C29300g c29300g = new C29300g(lVar);
        h hVar = new h(lVar);
        CampaignsSaleFragment.a aVar = CampaignsSaleFragment.f113813B0;
        CampaignsSaleFragment campaignsSaleFragment = this.f113962l;
        CampaignsSaleState campaignsSaleState = this.f113963m;
        if (campaignsSaleState.f114188b instanceof a.b) {
            z zVar = campaignsSaleFragment.f113826y0;
            C42670a.d((zVar != null ? zVar : null).f114470r);
        } else {
            CampaignsSaleState.b bVar = campaignsSaleState.f114189c;
            if (bVar != null) {
                z zVar2 = campaignsSaleFragment.f113826y0;
                if (zVar2 == null) {
                    zVar2 = null;
                }
                zVar2.getClass();
                zVar2.f114470r.c(null, new A(bVar, c29300g));
            } else {
                CampaignsSaleState.d dVar = campaignsSaleState.f114190d;
                if (dVar != null) {
                    z zVar3 = campaignsSaleFragment.f113826y0;
                    z zVar4 = zVar3 != null ? zVar3 : null;
                    D6.w(zVar4.f114462j);
                    String string = zVar4.f114455c.getString(R.string.campaigns_sale_items_amount_exceeded_toolbar_title);
                    MaterialToolbar materialToolbar = zVar4.f114456d;
                    materialToolbar.setTitle(string);
                    materialToolbar.setTitleCentered(true);
                    zVar4.f114467o.setText(dVar.f114222a);
                    zVar4.f114468p.setText(dVar.f114223b);
                    SimpleDraweeView simpleDraweeView = zVar4.f114466n;
                    C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(dVar.f114224c, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))), null, null, null, 14);
                    zVar4.f114469q.setOnClickListener(new com.avito.android.calltracking.item.m(1, hVar));
                    D6.H(zVar4.f114465m);
                } else {
                    z zVar5 = campaignsSaleFragment.f113826y0;
                    (zVar5 != null ? zVar5 : null).f114470r.b();
                }
            }
        }
        return G0.f406611a;
    }
}
