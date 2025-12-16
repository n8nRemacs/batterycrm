package com.avito.android.serp.adapter;

import kotlin.Metadata;

/* compiled from: SerpSpanProvider.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/J;", "Lcom/avito/android/serp/adapter/Y0;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class J implements Y0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h1 f268507a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public UV0.a<? extends i1> f268508b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public com.avito.android.ui.adapter.f f268509c;

    public J(@Y61.k h1 h1Var) {
        this.f268507a = h1Var;
    }

    @Override // com.avito.android.serp.adapter.Y0
    public final void c(@Y61.k UV0.a<? extends i1> aVar) {
        this.f268508b = aVar;
    }

    @Override // com.avito.android.serp.adapter.g1
    public final int d(int i12) {
        UV0.a<? extends i1> aVar = this.f268508b;
        if (aVar == null) {
            throw new IllegalStateException("Data source should be provided");
        }
        com.avito.android.ui.adapter.f fVar = this.f268509c;
        if (fVar == null) {
            throw new IllegalStateException("Appending Listener should be provided");
        }
        if (i12 < 0 || i12 >= aVar.getCount()) {
            return 1;
        }
        i1 item = aVar.getItem(i12);
        if (fVar.gk()) {
            h1 h1Var = this.f268507a;
            if (h1Var.d(i12) == h1Var.getF268504a() - 1) {
                return ((Z0) this).f268596d;
            }
        }
        return Math.min(((Z0) this).f268596d, h(item));
    }

    @Override // com.avito.android.serp.adapter.Y0
    public final void f(@Y61.l com.avito.android.ui.adapter.f fVar) {
        this.f268509c = fVar;
    }

    public abstract int h(@Y61.k i1 i1Var);
}
