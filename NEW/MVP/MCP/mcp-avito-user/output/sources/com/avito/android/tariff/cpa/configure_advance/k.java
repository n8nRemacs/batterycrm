package com.avito.android.tariff.cpa.configure_advance;

import androidx.fragment.app.ActivityC22955m;
import com.avito.android.lib.design.modal.a;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConfigureAdvanceFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/tariff/cpa/configure_advance/ui/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/tariff/cpa/configure_advance/ui/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class k extends N implements Y41.l<com.avito.android.tariff.cpa.configure_advance.ui.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ConfigureAdvanceFragment f294365l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ConfigureAdvanceFragment configureAdvanceFragment) {
        super(1);
        this.f294365l = configureAdvanceFragment;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.tariff.cpa.configure_advance.ui.a aVar) {
        com.avito.android.tariff.cpa.configure_advance.ui.a aVar2 = aVar;
        ConfigureAdvanceFragment configureAdvanceFragment = this.f294365l;
        ActivityC22955m activityC22955mL1 = configureAdvanceFragment.l1();
        if (activityC22955mL1 != null) {
            K2.c(activityC22955mL1);
        }
        com.avito.android.lib.util.g.a(a.C5284a.c(com.avito.android.lib.design.modal.a.f179704d, configureAdvanceFragment.requireContext(), new j(aVar2, configureAdvanceFragment)));
        return G0.f406611a;
    }
}
