package com.avito.android.rating_ui.sort;

import Hh0.InterfaceC13993a;
import Y41.l;
import Y61.k;
import com.avito.android.rating_ui.sort.a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: RatingSortItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/sort/e;", "Lcom/avito/android/rating_ui/sort/d;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<String, G0> f250447b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<String, G0> f250448c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y41.a<G0> f250449d;

    @Inject
    public e(@Hh0.d @k Y41.a aVar, @Hh0.b @k l lVar, @InterfaceC13993a @k l lVar2) {
        this.f250447b = lVar;
        this.f250448c = lVar2;
        this.f250449d = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        a aVar2 = (a) aVar;
        List<a.AbstractC7507a> list = aVar2.f250430c;
        gVar.JV(list, aVar2.f250431d);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof a.AbstractC7507a.b) {
                arrayList.add(obj);
            }
        }
        a.AbstractC7507a.b bVar = (a.AbstractC7507a.b) C42745f0.G(arrayList);
        if ((bVar != null ? bVar.f250439e : null) != null && bVar.f250440f) {
            gVar.Jv(bVar.f250439e);
            this.f250449d.invoke();
        }
        gVar.l10(this.f250447b);
        gVar.N10(this.f250448c);
    }
}
