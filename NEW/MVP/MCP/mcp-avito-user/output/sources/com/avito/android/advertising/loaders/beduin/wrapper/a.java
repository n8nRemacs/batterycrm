package com.avito.android.advertising.loaders.beduin.wrapper;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.avito.android.advertising.CommercialItem;
import com.avito.android.advertising.loaders.beduin.H;
import com.avito.beduin.v2.render.android_view.AbstractC36333c;
import com.avito.konveyor.exception.ItemNotSupportedException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: CommercialWrapperComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/beduin/wrapper/a;", "Lcom/avito/beduin/v2/render/android_view/c;", "Lcom/avito/android/advertising/loaders/beduin/wrapper/d;", "Landroid/view/ViewGroup;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends AbstractC36333c<d, ViewGroup> {

    /* renamed from: m, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f88170m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final H f88171n;

    /* renamed from: o, reason: collision with root package name */
    @l
    public b f88172o;

    public a(@k com.avito.konveyor.a aVar, @k H h12) {
        super(null, 1, null);
        this.f88170m = aVar;
        this.f88171n = h12;
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final void l(View view, com.avito.beduin.v2.theme.k kVar, d dVar) throws ItemNotSupportedException {
        ViewGroup viewGroup = (ViewGroup) view;
        H.c cVar = this.f88171n.get(dVar.f88181a);
        if (!(cVar instanceof H.c.C2608c)) {
            viewGroup.removeAllViews();
            return;
        }
        b bVar = this.f88172o;
        if (bVar == null) {
            bVar = new b(viewGroup, this.f88170m);
            this.f88172o = bVar;
        }
        CommercialItem commercialItem = ((H.c.C2608c) cVar).f88086a;
        CommercialItem commercialItem2 = bVar.f88176d;
        com.avito.konveyor.adapter.b bVar2 = bVar.f88177e;
        if (commercialItem2 == null || bVar2 == null) {
            bVar.a(commercialItem);
            return;
        }
        if (commercialItem.equals(commercialItem2)) {
            return;
        }
        if (commercialItem2.getClass() != commercialItem.getClass() || !L.f(commercialItem2.getF84108c(), commercialItem.getF84108c())) {
            bVar.a(commercialItem);
        } else {
            bVar.f88174b.O5(bVar2, commercialItem, 0);
            bVar.f88176d = commercialItem;
        }
    }

    @Override // com.avito.beduin.v2.render.android_view.AbstractC36333c
    public final View n(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        return linearLayout;
    }
}
