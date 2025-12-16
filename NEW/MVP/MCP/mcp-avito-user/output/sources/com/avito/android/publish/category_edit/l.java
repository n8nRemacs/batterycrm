package com.avito.android.publish.category_edit;

import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.category_edit.k;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.WizardParameter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryEditViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/WizardParameter;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/WizardParameter;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class l extends N implements Y41.l<WizardParameter, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k f232404l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(k kVar) {
        super(1);
        this.f232404l = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(WizardParameter wizardParameter) {
        WizardParameter wizardParameter2 = wizardParameter;
        k kVar = this.f232404l;
        kVar.f232396O = wizardParameter2;
        Navigation navigation2 = kVar.f232391J;
        WizardParameter wizardParameterFindNodeByNavigation = wizardParameter2.findNodeByNavigation(navigation2);
        if (wizardParameterFindNodeByNavigation != null) {
            kVar.f232396O = wizardParameterFindNodeByNavigation.getParent();
        }
        WizardParameter wizardParameter3 = kVar.f232396O;
        if (wizardParameter3 == null) {
            InterfaceC33535v.a.b(kVar.f232393L, "CategoryEdit: empty loaded navigation " + navigation2, null, 6);
            kVar.f232395N.setValue(new k.a.b(null, 1, null));
        } else {
            kVar.le(wizardParameter3, CategoriesListMove.f232320b);
        }
        return G0.f406611a;
    }
}
