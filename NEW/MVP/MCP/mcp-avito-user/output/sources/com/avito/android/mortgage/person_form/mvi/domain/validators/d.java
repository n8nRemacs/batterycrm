package com.avito.android.mortgage.person_form.mvi.domain.validators;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.mortgage.api.model.items.form.SuggestFormContentItemValue;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageFormValidator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/mvi/domain/validators/d;", "Lcom/avito/android/mortgage/person_form/mvi/domain/validators/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements c {
    @Inject
    public d() {
    }

    @Override // com.avito.android.mortgage.person_form.mvi.domain.validators.c
    @k
    public final ArrayList a(@k List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean isHidden = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            LZ.c cVar = (LZ.c) next;
            com.avito.android.mortgage.api.model.items.form.d dVar = cVar.f9996b;
            if (!(dVar instanceof SuggestFormContentItemValue)) {
                isHidden = dVar.getIsHidden();
            } else if (((SuggestFormContentItemValue) dVar).getIsHidden() || ((SuggestFormContentItemValue) dVar).getIsDisclosed()) {
                isHidden = true;
            }
            if (!isHidden && !cVar.f9996b.isValid()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new a(((LZ.c) it2.next()).f9996b.getName(), com.avito.android.printable_text.b.c(R.string.empty_field_error, new Serializable[0])));
        }
        return arrayList2;
    }
}
