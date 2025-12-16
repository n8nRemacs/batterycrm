package com.avito.android.tariff_lf_constructor.configure.category.items.content;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConfigureCategoryItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/category/items/content/f;", "Lcom/avito/android/tariff_lf_constructor/configure/category/items/content/d;", "<init>", "()V", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<String> f299403b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f299404c;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<String> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f299403b = cVar;
        this.f299404c = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.setTitle(aVar2.f299394d);
        hVar.n0(aVar2.f299396f);
        hVar.setEnabled(aVar2.f299395e);
        hVar.p3(new e(aVar2, this));
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.category.items.content.d
    @k
    /* renamed from: getCategoryId, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF299404c() {
        return this.f299404c;
    }
}
