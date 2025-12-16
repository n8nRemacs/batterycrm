package com.avito.android.vas_performance.ui.items.visual_vas_item_legacy;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: VisualVasItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/visual_vas_item_legacy/f;", "Lcom/avito/android/vas_performance/ui/items/visual_vas_item_legacy/d;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<a> f321840b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e f321841c;

    @Inject
    public f() {
        io.reactivex.rxjava3.subjects.e<a> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f321840b = eVar;
        this.f321841c = eVar;
    }

    @Override // com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.d
    @k
    /* renamed from: N1, reason: from getter */
    public final io.reactivex.rxjava3.subjects.e getF321841c() {
        return this.f321841c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.Z8(com.avito.android.image_loader.b.b(aVar2.f321821g));
        hVar.L(aVar2.f321819e);
        hVar.Z0(aVar2.f321820f);
        hVar.aa(aVar2.f321822h);
        hVar.setSelected(aVar2.f321824j);
        hVar.setTitle(aVar2.f321817c);
        hVar.g(aVar2.f321818d);
        hVar.q30(aVar2.f321825k, aVar2.f321826l);
        hVar.c(new e(this, aVar2));
    }
}
