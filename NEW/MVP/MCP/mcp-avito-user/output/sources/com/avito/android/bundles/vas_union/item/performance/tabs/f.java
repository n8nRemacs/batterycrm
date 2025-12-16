package com.avito.android.bundles.vas_union.item.performance.tabs;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PerformanceTabsItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bundles/vas_union/item/performance/tabs/f;", "Lcom/avito/android/bundles/vas_union/item/performance/tabs/d;", "<init>", "()V", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<com.avito.android.bundles.vas_union.item.tabs.a> f108631b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e f108632c;

    @Inject
    public f() {
        io.reactivex.rxjava3.subjects.e<com.avito.android.bundles.vas_union.item.tabs.a> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f108631b = eVar;
        this.f108632c = eVar;
    }

    @Override // com.avito.android.bundles.vas_union.item.performance.tabs.d
    @k
    /* renamed from: A0, reason: from getter */
    public final io.reactivex.rxjava3.subjects.e getF108632c() {
        return this.f108632c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.P0(aVar2.f108624c, aVar2.f108623b);
        hVar.ua(new e(aVar2, this));
    }
}
