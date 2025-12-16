package com.avito.android.wallet.page.topup.form.items;

import Y61.l;
import com.avito.android.wallet.page.topup.form.items.submit_button_item.c;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.avito.component.info_label.g;

/* compiled from: TopUpFormItemsComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/wallet/page/topup/form/items/a;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito_wallet-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.recycler.data_aware.b {
    @Inject
    public a() {
    }

    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@l TV0.a aVar, @l TV0.a aVar2) {
        Boolean boolValueOf = null;
        Boolean boolValueOf2 = !L.f(aVar != null ? Long.valueOf(aVar.getF322725b()) : null, aVar2 != null ? Long.valueOf(aVar2.getF322725b()) : null) ? Boolean.FALSE : null;
        if (boolValueOf2 == null) {
            boolValueOf2 = ((aVar instanceof g) && (aVar2 instanceof g)) ? Boolean.FALSE : null;
            if (boolValueOf2 == null) {
                boolValueOf2 = ((aVar instanceof com.avito.android.wallet.page.topup.form.items.input.a) && (aVar2 instanceof com.avito.android.wallet.page.topup.form.items.input.a)) ? Boolean.valueOf(!((com.avito.android.wallet.page.topup.form.items.input.a) aVar2).f328317d) : null;
                if (boolValueOf2 == null) {
                    if ((aVar instanceof c) && (aVar2 instanceof c)) {
                        boolValueOf = Boolean.valueOf(((c) aVar).f328341b == ((c) aVar2).f328341b);
                    }
                    if (boolValueOf != null) {
                        return boolValueOf.booleanValue();
                    }
                    return true;
                }
            }
        }
        return boolValueOf2.booleanValue();
    }
}
