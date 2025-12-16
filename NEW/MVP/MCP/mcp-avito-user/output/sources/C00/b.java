package C00;

import C00.c;
import TV0.e;
import TV0.f;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.util.O2;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: PersonFormItemPayloadPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u0003*\b\b\u0002\u0010\u0006*\u00020\u00052\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LC00/b;", "LC00/c;", "V", "Lcom/avito/android/mortgage/person_form/list/items/PersonFormItem;", "I", "", "P", "LTV0/f;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class b<V extends c, I extends PersonFormItem, P> implements f<V, I> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.f
    public final void g2(e eVar, TV0.a aVar, int i12, List list) {
        com.avito.android.mortgage.person_form.list.payloads.a aVar2;
        c cVar = (c) eVar;
        PersonFormItem personFormItem = (PersonFormItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list2 = (List) obj;
        if (list2 != null) {
            Object obj3 = null;
            for (Object obj4 : list2) {
                if (obj4 instanceof com.avito.android.mortgage.person_form.list.payloads.a) {
                    obj3 = obj4;
                }
            }
            if (!(obj3 instanceof com.avito.android.mortgage.person_form.list.payloads.a)) {
                obj3 = null;
            }
            aVar2 = (com.avito.android.mortgage.person_form.list.payloads.a) obj3;
        } else {
            aVar2 = null;
        }
        if (list2 != null) {
            List<? extends P> list3 = null;
            for (Object obj5 : list2) {
                if (obj5 instanceof List) {
                    list3 = obj5;
                }
            }
            list = list3 instanceof List ? list3 : null;
        }
        if (aVar2 != null) {
            cVar.setEnabled(aVar2.f200850a);
        }
        if (O2.a(list)) {
            k(cVar, personFormItem, i12, list == null ? C42784z0.f406748b : list);
        }
        if (aVar2 == null) {
            List<? extends P> list4 = list;
            if (list4 == null || list4.isEmpty()) {
                O5(cVar, personFormItem, i12);
            }
        }
    }

    public void k(@k V v12, @k I i12, int i13, @k List<? extends P> list) {
    }
}
