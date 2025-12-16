package com.avito.android.profile_phones.phones_list;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.iac_analytics.public_module.analytics_models.CallsPopupType;
import com.avito.android.iac_analytics.public_module.analytics_models.IacEnablingScenario;
import kotlin.G0;
import kotlin.Metadata;
import nJ.C44276k;

/* compiled from: PhonesListFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class F extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PhonesListFragment f227343l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(PhonesListFragment phonesListFragment) {
        super(0);
        this.f227343l = phonesListFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC28373a interfaceC28373a = this.f227343l.f227382B0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        interfaceC28373a.c(new C44276k(CallsPopupType.f164278c, IacEnablingScenario.f164281b, null, 4, null));
        return G0.f406611a;
    }
}
