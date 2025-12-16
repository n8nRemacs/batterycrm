package com.avito.android.advert.item.branding_advantages.block;

import Y61.l;
import android.view.View;
import com.avito.android.util.ExpandablePanelLayout;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BrandingAdvantagesBlockItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/branding_advantages/block/g;", "Lcom/avito/android/util/ExpandablePanelLayout$b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends ExpandablePanelLayout.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f74188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f74189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f74190c;

    public g(h hVar, Y41.a<G0> aVar, Y41.a<G0> aVar2) {
        this.f74188a = hVar;
        this.f74189b = aVar;
        this.f74190c = aVar2;
    }

    @Override // com.avito.android.util.ExpandablePanelLayout.b, com.avito.android.util.ExpandablePanelLayout.a
    public final void c() {
        this.f74190c.invoke();
    }

    @Override // com.avito.android.util.ExpandablePanelLayout.b, com.avito.android.util.ExpandablePanelLayout.a
    public final void d(@l View view) {
        if (view != null) {
            view.setVisibility(8);
        }
        this.f74188a.f74197h.invalidate();
        ((d) this.f74189b).invoke();
    }
}
