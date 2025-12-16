package com.avito.android.search.filter.adapter.location_group;

import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.remote.model.category_parameters.GroupMarkerParameter;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.search.filter.converter.ParameterElement;
import io.reactivex.rxjava3.internal.operators.observable.A1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LocationGroupItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/adapter/location_group/f;", "Lcom/avito/android/search/filter/adapter/location_group/d;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ParameterElement.q> f262510b = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public f() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        List<SelectParameter.Separator> separators;
        i iVar = (i) eVar;
        ParameterElement.q qVar = (ParameterElement.q) aVar;
        GroupMarkerParameter.Payload payload = qVar.f262815g;
        iVar.p8(payload != null ? payload.getTooltip() : null, qVar.f262812d);
        iVar.a(new e(this, qVar));
        iVar.S30(qVar.f262813e);
        if (payload == null || (separators = payload.getSeparators()) == null) {
            return;
        }
        iVar.Rf(separators);
    }

    @Override // com.avito.android.search.filter.adapter.location_group.d
    @Y61.k
    public final A1 l2() {
        com.jakewharton.rxrelay3.c<ParameterElement.q> cVar = this.f262510b;
        return l.l(cVar, cVar).C0(1000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b);
    }
}
