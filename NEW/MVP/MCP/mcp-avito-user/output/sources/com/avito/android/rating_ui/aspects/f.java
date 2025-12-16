package com.avito.android.rating_ui.aspects;

import Y41.l;
import Y61.k;
import com.avito.android.rating_ui.aspects.a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sh0.InterfaceC48180a;
import sh0.InterfaceC48182c;

/* compiled from: RatingAspectsItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/aspects/f;", "Lcom/avito/android/rating_ui/aspects/e;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<Long, G0> f249873b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f249874c;

    @Inject
    public f(@k @InterfaceC48182c Y41.a aVar, @InterfaceC48180a @k l lVar) {
        this.f249873b = lVar;
        this.f249874c = aVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((h) eVar, (a) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof d) {
                obj = obj2;
            }
        }
        d dVar = (d) (obj instanceof d ? obj : null);
        if (dVar != null) {
            hVar.Cq(dVar.f249871a, dVar.f249872b);
        } else {
            k(hVar, aVar2);
        }
    }

    public final void k(@k h hVar, @k a aVar) {
        hVar.Cq(aVar.f249857d, aVar.f249860g);
        a.b bVar = aVar.f249858e;
        if (bVar != null && aVar.f249859f) {
            hVar.ZX(bVar);
            this.f249874c.invoke();
        }
        hVar.So(this.f249873b);
    }
}
