package com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.iac_analytics.public_module.analytics_models.MicAccessScenario;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import nJ.J;

/* compiled from: IacEnableBottomSheetFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ IacEnableBottomSheetFragment f227808l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(IacEnableBottomSheetFragment iacEnableBottomSheetFragment) {
        super(0);
        this.f227808l = iacEnableBottomSheetFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC28373a interfaceC28373a = this.f227808l.f227754l0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        interfaceC28373a.c(new J(true, MicAccessScenario.f164299l, null, null, null, null, 60, null));
        return G0.f406611a;
    }
}
