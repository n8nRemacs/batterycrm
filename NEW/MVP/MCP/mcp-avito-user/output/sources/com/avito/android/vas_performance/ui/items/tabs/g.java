package com.avito.android.vas_performance.ui.items.tabs;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TabsItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/tabs/g;", "Lcom/avito/android/vas_performance/ui/items/tabs/e;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<a> f321776b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e f321777c;

    @Inject
    public g() {
        io.reactivex.rxjava3.subjects.e<a> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f321776b = eVar;
        this.f321777c = eVar;
    }

    @Override // com.avito.android.vas_performance.ui.items.tabs.e
    @k
    /* renamed from: A0, reason: from getter */
    public final io.reactivex.rxjava3.subjects.e getF321777c() {
        return this.f321777c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        b bVar = (b) aVar;
        iVar.P0(bVar.f321769c, bVar.f321768b);
        iVar.ua(new f(bVar, this));
    }
}
