package com.avito.android.tariff.cpx.info.sf.menu;

import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.tariff.cpx.info.sf.menu.TariffCpxInfoSfMenuDialogFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import zB0.C50434c;
import zB0.InterfaceC50432a;

/* compiled from: TariffCpxInfoSfMenuDialogFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C50434c.a f296766l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f296767m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C50434c.a aVar, InterfaceC22204y1 interfaceC22204y1) {
        super(0);
        this.f296766l = aVar;
        this.f296767m = interfaceC22204y1;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink = this.f296766l.f443951c;
        if (deepLink != null) {
            TariffCpxInfoSfMenuDialogFragment.a aVar = TariffCpxInfoSfMenuDialogFragment.f296742o0;
            ((Y41.l) this.f296767m.getF42167b()).invoke(new InterfaceC50432a.C12946a(deepLink));
        }
        return G0.f406611a;
    }
}
