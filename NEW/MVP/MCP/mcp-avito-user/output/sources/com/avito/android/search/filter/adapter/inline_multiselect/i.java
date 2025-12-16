package com.avito.android.search.filter.adapter.inline_multiselect;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.Badge;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.search.filter.InterfaceC34566e0;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.converter.ParameterElement;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InlineMultiselectItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/inline_multiselect/i;", "Lcom/avito/android/search/filter/adapter/inline_multiselect/d;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final InterfaceC34566e0.b f262373b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement.s> f262374c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l41.g<DeepLink> f262375d;

    @Inject
    public i(@Y61.k InterfaceC34581l interfaceC34581l, @Y61.l InterfaceC34566e0.b bVar) {
        this.f262373b = bVar;
        this.f262374c = interfaceC34581l.getF263717k();
        this.f262375d = interfaceC34581l.getF263723q();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        boolean z12;
        G0 g02;
        k kVar = (k) eVar;
        ParameterElement.s sVar = (ParameterElement.s) aVar;
        List<Cp0.e> list = sVar.f262819e;
        String str = sVar.f262817c;
        Badge badge = sVar.f262830p;
        if (badge != null) {
            kVar.B6(str, badge);
        } else {
            List<Cp0.e> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                z12 = false;
                kVar.K0(str, z12);
            } else {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    if (!((Cp0.e) it.next()).f2705j) {
                        z12 = true;
                        break;
                    }
                }
                z12 = false;
                kVar.K0(str, z12);
            }
        }
        kVar.Jx(new e(this, sVar), list);
        if (sVar.f262827m != null) {
            kVar.Vr(new f(this, sVar), true);
        } else {
            kVar.Vr(null, false);
        }
        MultiselectParameter.FilterHint filterHint = sVar.f262828n;
        if (filterHint != null) {
            kVar.fn(filterHint.getTitle(), new g(filterHint, this));
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            kVar.fn(null, h.f262372l);
        }
    }
}
