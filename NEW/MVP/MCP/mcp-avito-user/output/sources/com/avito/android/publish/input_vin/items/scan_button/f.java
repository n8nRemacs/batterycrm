package com.avito.android.publish.input_vin.items.scan_button;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ScanVinButtonItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f236588l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f236589m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, c cVar) {
        super(0);
        this.f236588l = gVar;
        this.f236589m = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f236588l.f236591c.accept(this.f236589m);
        return G0.f406611a;
    }
}
