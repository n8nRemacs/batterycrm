package com.avito.android.publish.details.historical_suggest;

import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.publish.analytics.events.AddressChoiceType;
import com.avito.android.publish.details.analytics.PublishDetailsFlowTracker;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: HistoricalSuggestViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;", "addressSuggestions", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class c<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametersTree f234644b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AddressParameter f234645c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f234646d;

    public c(ParametersTree parametersTree, AddressParameter addressParameter, e eVar) {
        this.f234644b = parametersTree;
        this.f234645c = addressParameter;
        this.f234646d = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        List list = (List) obj;
        if (list.isEmpty()) {
            return;
        }
        ParametersTree parametersTree = this.f234644b;
        int count = parametersTree.getCount();
        AddressParameter addressParameter = this.f234645c;
        e eVar = this.f234646d;
        if (count > 1 && addressParameter.getValue() == null) {
            AddressParameter.Value valueKe = e.ke(eVar, (AddressSuggestion) C42745f0.E(list));
            if (!L.f(addressParameter.getValue(), valueKe)) {
                addressParameter.setValue(valueKe);
                addressParameter.setError(null);
            }
        } else {
            if (parametersTree.getCount() != 1) {
                return;
            }
            String str = eVar.f234653N.f234842i;
            List listE0 = C42745f0.E0(list, 3);
            ArrayList arrayList = new ArrayList(C42745f0.q(listE0, 10));
            int i12 = 0;
            for (T t12 : listE0) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                AddressSuggestion addressSuggestion = (AddressSuggestion) t12;
                arrayList.add(new JO.c(String.valueOf(i12), addressSuggestion.getTitle(), addressSuggestion.getSubtitle(), e.ke(eVar, addressSuggestion)));
                i12 = i13;
            }
            JO.d dVar = new JO.d(null, str, null, arrayList, 1, null);
            Object value = addressParameter.getValue();
            List<JO.c> list2 = dVar.f8945e;
            if (value == null) {
                JO.c cVar = (JO.c) C42745f0.E(list2);
                dVar.f8944d = cVar;
                addressParameter.setValue(cVar != null ? cVar.f8941d : null);
            } else {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object obj2 = (T) it.next();
                    if (((JO.c) obj2).f8941d.equals(addressParameter.getValue())) {
                        obj = obj2;
                        break;
                    }
                }
                dVar.f8944d = (JO.c) obj;
            }
            eVar.f234654O.b(dVar);
        }
        AddressParameter.Value value2 = (AddressParameter.Value) addressParameter.getValue();
        if (value2 != null) {
            eVar.f234652M.n0(AddressChoiceType.f232211c, value2);
        }
        eVar.f234650K.B9(new PublishDetailsFlowTracker.FlowContext[0]);
    }
}
