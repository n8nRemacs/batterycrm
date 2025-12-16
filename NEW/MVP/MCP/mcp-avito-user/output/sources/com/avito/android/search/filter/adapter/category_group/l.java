package com.avito.android.search.filter.adapter.category_group;

import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.remote.model.category_parameters.DialogDisplaying;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.search.filter.converter.ParameterElement;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryGroupItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "selectedPosition", "Lcom/avito/android/search/filter/adapter/category_group/C;", "chipsItem", "Lkotlin/G0;", "invoke", "(ILcom/avito/android/search/filter/adapter/category_group/C;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class l extends N implements Y41.p<Integer, C, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.d f262069l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.v.b f262070m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p f262071n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ParameterElement.d dVar, ParameterElement.v.b bVar, p pVar) {
        super(2);
        this.f262069l = dVar;
        this.f262070m = bVar;
        this.f262071n = pVar;
    }

    @Override // Y41.p
    public final G0 invoke(Integer num, C c12) {
        DialogDisplaying dialogDisplaying;
        Boolean hideDialogSearch;
        int iIntValue = num.intValue();
        boolean zF2 = L.f(c12.f262041e, "more");
        p pVar = this.f262071n;
        ParameterElement.v.b bVar = this.f262070m;
        if (zF2) {
            String str = this.f262069l.f262741d;
            List<Cp0.e> list = bVar.f262862t;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            boolean zBooleanValue = false;
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                Cp0.e eVar = (Cp0.e) obj;
                arrayList.add(new SelectParameter.Value(eVar.f2697b, eVar.f2698c, null, null, null, null, false, null, null, null, ErrorCodes.PROTOCOL_EXCEPTION, null));
                i12 = i13;
            }
            SelectParameter.Displaying displaying = bVar.f262855r;
            if (displaying != null && (dialogDisplaying = displaying.getDialogDisplaying()) != null && (hideDialogSearch = dialogDisplaying.getHideDialogSearch()) != null) {
                zBooleanValue = hideDialogSearch.booleanValue();
            } else if (bVar.f262862t.size() < 11) {
                zBooleanValue = true;
            }
            pVar.f262084i.accept(new B("category_group_select_id", str, arrayList, zBooleanValue));
        } else {
            bVar.f262844g = bVar.f262862t.get(iIntValue);
            pVar.f262083h.accept(G0.f406611a);
            pVar.f262080e.accept(bVar);
        }
        return G0.f406611a;
    }
}
