package com.avito.android.iac_dialer_ui.pub.call_screen.active_fallback_modal;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIActiveFallbackModal.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class k extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166955l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166956m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f166957n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i12, Y41.a aVar, Y41.a aVar2) {
        super(2);
        this.f166955l = aVar;
        this.f166956m = aVar2;
        this.f166957n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f166957n | 1);
        t.b(this.f166955l, this.f166956m, a12, iA2);
        return G0.f406611a;
    }
}
