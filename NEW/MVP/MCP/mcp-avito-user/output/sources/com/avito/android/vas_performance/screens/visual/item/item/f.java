package com.avito.android.vas_performance.screens.visual.item.item;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VisualVasItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/item/item/f;", "Lcom/avito/android/vas_performance/screens/visual/item/item/d;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<a, G0> f321073b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super a, G0> lVar) {
        this.f321073b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.Z8(com.avito.android.image_loader.b.b(aVar2.f321054g));
        hVar.L(aVar2.f321052e);
        hVar.Z0(aVar2.f321053f);
        hVar.aa(aVar2.f321055h);
        hVar.setSelected(aVar2.f321057j);
        hVar.setTitle(aVar2.f321050c);
        hVar.g(aVar2.f321051d);
        hVar.zi(aVar2.f321058k);
        hVar.c(new e(this, aVar2));
    }
}
