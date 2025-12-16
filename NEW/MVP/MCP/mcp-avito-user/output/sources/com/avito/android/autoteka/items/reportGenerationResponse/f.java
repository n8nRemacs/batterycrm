package com.avito.android.autoteka.items.reportGenerationResponse;

import Rf.InterfaceC15035a;
import Y41.l;
import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ReportGenerationResponsePresenterImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/autoteka/items/reportGenerationResponse/f;", "LTV0/d;", "Lcom/avito/android/autoteka/items/reportGenerationResponse/h;", "Lcom/avito/android/autoteka/items/reportGenerationResponse/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements TV0.d<h, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15035a, G0> f96997b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super InterfaceC15035a, G0> lVar) {
        this.f96997b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        hVar.w6();
        hVar.b(cVar.f96990c);
        hVar.l7(new d(this), cVar.f96991d);
        hVar.lk(cVar.f96993f, new e(this));
    }
}
