package com.avito.android.vas_performance.ui.items.vas;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PerformanceVasItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/vas/f;", "Lcom/avito/android/vas_performance/ui/items/vas/d;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<c> f321805b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e f321806c;

    @Inject
    public f() {
        io.reactivex.rxjava3.subjects.e<c> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f321805b = eVar;
        this.f321806c = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        hVar.setTitle(cVar.f321795c);
        hVar.L(cVar.f321796d);
        hVar.Z0(cVar.f321797e);
        hVar.x(com.avito.android.image_loader.b.b(cVar.f321798f));
        Image image = cVar.f321799g;
        hVar.x1(image != null ? com.avito.android.image_loader.b.b(image) : null);
        hVar.c(new e(this, cVar));
    }

    @Override // com.avito.android.vas_performance.ui.items.vas.d
    @k
    /* renamed from: b2, reason: from getter */
    public final io.reactivex.rxjava3.subjects.e getF321806c() {
        return this.f321806c;
    }
}
