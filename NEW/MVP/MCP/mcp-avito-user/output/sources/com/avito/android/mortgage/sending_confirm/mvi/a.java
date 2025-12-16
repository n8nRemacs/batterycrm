package com.avito.android.mortgage.sending_confirm.mvi;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage.api.model.CheckboxMeta;
import com.avito.android.mortgage.sending_confirm.mvi.entity.SendingConfirmInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import m10.C43861c;
import m10.InterfaceC43859a;

/* compiled from: SendingConfirmActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/sending_confirm/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lm10/a;", "Lcom/avito/android/mortgage/sending_confirm/mvi/entity/SendingConfirmInternalAction;", "Lm10/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC43859a, SendingConfirmInternalAction, C43861c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.mortgage.sending_confirm.mvi.domain.a f203550a;

    @Inject
    public a(@k com.avito.android.mortgage.sending_confirm.mvi.domain.a aVar) {
        this.f203550a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SendingConfirmInternalAction> b(InterfaceC43859a interfaceC43859a, C43861c c43861c) {
        InterfaceC43859a interfaceC43859a2 = interfaceC43859a;
        C43861c c43861c2 = c43861c;
        if (interfaceC43859a2 instanceof InterfaceC43859a.C11812a) {
            return new C43210w(new SendingConfirmInternalAction.CheckClick(((InterfaceC43859a.C11812a) interfaceC43859a2).f414257a));
        }
        if (!(interfaceC43859a2 instanceof InterfaceC43859a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, CheckboxMeta> map = c43861c2.f414266e;
        for (Map.Entry<String, CheckboxMeta> entry : map.entrySet()) {
            CheckboxMeta value = entry.getValue();
            if (value.getIsRequired() && !value.getIsChecked()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return arrayList.isEmpty() ? this.f203550a.a(map) : new C43210w(new SendingConfirmInternalAction.SetErrorOnCheckboxes(arrayList));
    }
}
