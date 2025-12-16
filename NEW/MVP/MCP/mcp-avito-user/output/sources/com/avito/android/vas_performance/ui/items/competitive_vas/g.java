package com.avito.android.vas_performance.ui.items.competitive_vas;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CompetitiveVasItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/competitive_vas/g;", "Lcom/avito/android/vas_performance/ui/items/competitive_vas/e;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<c> f321632b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e f321633c;

    @Inject
    public g() {
        io.reactivex.rxjava3.subjects.e<c> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f321632b = eVar;
        this.f321633c = eVar;
    }

    @Override // com.avito.android.vas_performance.ui.items.competitive_vas.e
    @k
    /* renamed from: K3, reason: from getter */
    public final io.reactivex.rxjava3.subjects.e getF321633c() {
        return this.f321633c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.List] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        d dVar = (d) aVar;
        iVar.U1(dVar.f321622c);
        iVar.n0(dVar.f321623d);
        iVar.T4(dVar.f321624e);
        iVar.h(dVar.f321625f);
        iVar.x(com.avito.android.image_loader.b.b(dVar.f321626g));
        iVar.DD(dVar.f321628i);
        Image image = dVar.f321627h;
        iVar.x1(image != null ? com.avito.android.image_loader.b.b(image) : null);
        iVar.X1(new f(this));
        iVar.mP(dVar.f321629j);
        iVar.JD(dVar.f321630k);
    }
}
