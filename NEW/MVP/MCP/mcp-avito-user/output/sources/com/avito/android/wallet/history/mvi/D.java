package com.avito.android.wallet.history.mvi;

import GO0.b;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WalletHistoryScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class D extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b.d f327538l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<GO0.a, G0> f327539m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f327540n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f327541o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(b.d dVar, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f327538l = dVar;
        this.f327539m = lVar;
        this.f327540n = vVar;
        this.f327541o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f327541o | 1);
        androidx.compose.ui.v vVar = this.f327540n;
        G.g(this.f327538l, this.f327539m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
