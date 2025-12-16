package com.avito.beduin.v2.avito.component.items_controller;

import com.avito.beduin.v2.engine.component.I;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: ItemsRendererState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/items_controller/k;", "Lcom/avito/beduin/v2/engine/component/I;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements I {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0.h<I> f334564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f334565b;

    public k(l0.h<I> hVar, I i12) {
        this.f334564a = hVar;
        this.f334565b = i12;
    }

    @Override // com.avito.beduin.v2.engine.component.I
    public final void a() {
        l0.h<I> hVar = this.f334564a;
        I i12 = hVar.f406842b;
        if (i12 != null) {
            i12.a();
        }
        hVar.f406842b = null;
        this.f334565b.a();
    }
}
