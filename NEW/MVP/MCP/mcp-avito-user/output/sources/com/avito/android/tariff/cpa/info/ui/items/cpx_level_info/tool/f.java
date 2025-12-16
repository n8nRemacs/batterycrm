package com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tool;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CpxLevelInfoToolItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/cpx_level_info/tool/f;", "Lcom/avito/android/tariff/cpa/info/ui/items/cpx_level_info/tool/d;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f294872b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super DeepLink, G0> lVar) {
        this.f294872b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.setTitle(aVar2.f294860c);
        hVar.g(aVar2.f294861d);
        hVar.i(aVar2.f294862e);
        hVar.N0(aVar2.f294864g);
        DeepLink deepLink = aVar2.f294863f;
        hVar.c(deepLink != null ? new e(this, deepLink) : null);
    }
}
