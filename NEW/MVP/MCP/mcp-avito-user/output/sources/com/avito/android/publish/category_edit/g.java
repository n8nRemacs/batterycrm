package com.avito.android.publish.category_edit;

import com.avito.android.publish.category_edit.k;
import com.avito.android.remote.model.WizardParameter;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;

/* compiled from: CategoryEditSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* synthetic */ class g extends H implements Y41.l<String, G0> {
    @Override // Y41.l
    public final G0 invoke(String str) {
        Object next;
        String str2 = str;
        k kVar = (k) this.receiver;
        WizardParameter wizardParameter = kVar.f232396O;
        if (wizardParameter != null) {
            Iterator<T> it = wizardParameter.getChildren().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((WizardParameter) next).getNavigation().toString(), str2)) {
                    break;
                }
            }
            WizardParameter wizardParameter2 = (WizardParameter) next;
            if (wizardParameter2 != null) {
                if (wizardParameter2.getHasChildren()) {
                    kVar.f232396O = wizardParameter2;
                    kVar.le(wizardParameter2, CategoriesListMove.f232321c);
                } else {
                    kVar.f232395N.setValue(new k.a.d(wizardParameter2));
                }
            }
        }
        return G0.f406611a;
    }
}
