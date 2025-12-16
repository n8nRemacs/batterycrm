package com.avito.android.publish.category_edit;

import com.avito.android.remote.model.WizardParameter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CategoryEditSheet.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CategoryEditSheet f232385l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CategoryEditSheet categoryEditSheet) {
        super(0);
        this.f232385l = categoryEditSheet;
    }

    @Override // Y41.a
    public final G0 invoke() {
        WizardParameter parent;
        k kVar = this.f232385l.f232327g0;
        if (kVar == null) {
            kVar = null;
        }
        WizardParameter wizardParameter = kVar.f232396O;
        if (wizardParameter != null && (parent = wizardParameter.getParent()) != null) {
            kVar.f232396O = parent;
            kVar.le(parent, CategoriesListMove.f232322d);
        }
        return G0.f406611a;
    }
}
