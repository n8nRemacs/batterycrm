package com.avito.android.select_districts.items.selectable;

import Y61.k;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectableDistrictsItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_districts/items/selectable/g;", "Lcom/avito/android/select_districts/items/selectable/e;", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f266971b;

    @Inject
    public g(@k d dVar) {
        this.f266971b = dVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        c cVar = (c) aVar;
        iVar.setTitle(cVar.f266967c);
        iVar.setChecked(cVar.f266968d);
        iVar.a(new f(this, cVar));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        c cVar = (c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof oq0.h) {
                obj = obj2;
            }
        }
        oq0.h hVar = (oq0.h) (obj instanceof oq0.h ? obj : null);
        if (hVar != null) {
            iVar.setChecked(hVar.f420231b);
            return;
        }
        iVar.setTitle(cVar.f266967c);
        iVar.setChecked(cVar.f266968d);
        iVar.a(new f(this, cVar));
    }
}
