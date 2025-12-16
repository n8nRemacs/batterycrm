package com.avito.android.publish.details.adapter.historical_suggest.new_suggest;

import Od0.InterfaceC14673a;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.details.InterfaceC33678b;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.util.V1;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HistoricalSuggestsNewPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/details/adapter/historical_suggest/new_suggest/g;", "Lcom/avito/android/publish/details/adapter/historical_suggest/new_suggest/d;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33678b f233267b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.details.a f233268c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14673a f233269d;

    @Inject
    public g(@Y61.k InterfaceC33678b interfaceC33678b, @Y61.k com.avito.android.details.a aVar, @Y61.k InterfaceC14673a interfaceC14673a) {
        this.f233267b = interfaceC33678b;
        this.f233268c = aVar;
        this.f233269d = interfaceC14673a;
    }

    public static final void k(g gVar, AddressParameter.Value value) {
        AddressParameter addressParameter;
        ParametersTree parametersTreeWa = gVar.f233268c.wa();
        if (parametersTreeWa == null || (addressParameter = (AddressParameter) parametersTreeWa.getFirstParameterOfType(AddressParameter.class)) == null) {
            return;
        }
        addressParameter.setValue(value);
        addressParameter.clearError();
        gVar.f233267b.l(null);
    }

    public final void O(@Y61.k i iVar, @Y61.k k kVar) {
        ParametersTree parametersTreeWa = this.f233268c.wa();
        boolean z12 = false;
        if (parametersTreeWa != null && parametersTreeWa.getCount() == 1) {
            z12 = true;
        }
        iVar.setVisibility(z12);
        iVar.Sh(new e(this));
        iVar.AH(new f(kVar, this));
        AddressParameter.Value value = kVar.f233279c;
        if (value != null) {
            iVar.xR(value);
        }
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        O((i) eVar, (k) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        k kVar = (k) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof V1) {
                obj = obj2;
            }
        }
        V1 v12 = (V1) (obj instanceof V1 ? obj : null);
        if (v12 == null) {
            O(iVar, kVar);
            return;
        }
        AddressParameter.Value value = v12.f318761a;
        if (value != null) {
            iVar.xR(value);
        }
    }
}
