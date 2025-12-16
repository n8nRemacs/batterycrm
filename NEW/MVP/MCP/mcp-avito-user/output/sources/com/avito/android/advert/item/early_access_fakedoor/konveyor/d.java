package com.avito.android.advert.item.early_access_fakedoor.konveyor;

import com.avito.android.advert.item.AdvertDetailsFragment;
import com.avito.android.advert.item.Z0;
import com.avito.android.early_access_advert.EarlyAccessAdvertBottomSheet;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessAdvertPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f75304l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ EarlyAccessAdvertItem f75305m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, EarlyAccessAdvertItem earlyAccessAdvertItem) {
        super(0);
        this.f75304l = eVar;
        this.f75305m = earlyAccessAdvertItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f75304l;
        eVar.f75307c.d(eVar.f75306b);
        Z0 z02 = eVar.f75308d;
        if (z02 != null) {
            EarlyAccessAdvertBottomSheet earlyAccessAdvertBottomSheetA = z02.f72318w.a(z02.f72297b, this.f75305m.f75299g);
            AdvertDetailsFragment advertDetailsFragment = z02.f72298c;
            com.avito.android.lib.util.g.b(earlyAccessAdvertBottomSheetA, advertDetailsFragment.requireContext(), advertDetailsFragment.getChildFragmentManager(), "EarlyAccessAdvert");
        }
        return G0.f406611a;
    }
}
