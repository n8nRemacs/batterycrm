package com.avito.android.campaigns_sale;

import android.content.DialogInterface;
import com.avito.android.campaigns_sale.CampaignsSaleFragment;
import im.InterfaceC41424a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CampaignsSaleFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class j extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f113965l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CampaignsSaleFragment f113966m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DialogInterface dialogInterface, CampaignsSaleFragment campaignsSaleFragment) {
        super(0);
        this.f113965l = dialogInterface;
        this.f113966m = campaignsSaleFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f113965l.dismiss();
        CampaignsSaleFragment.a aVar = CampaignsSaleFragment.f113813B0;
        this.f113966m.q5().accept(InterfaceC41424a.m.f398729a);
        return G0.f406611a;
    }
}
