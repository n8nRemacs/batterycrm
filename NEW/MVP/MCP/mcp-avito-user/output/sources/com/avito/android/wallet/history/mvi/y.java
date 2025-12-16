package com.avito.android.wallet.history.mvi;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WalletHistoryScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class y extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<GO0.a, G0> f327734l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f327735m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i12, Y41.l lVar) {
        super(2);
        this.f327734l = lVar;
        this.f327735m = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f327735m | 1);
        G.e(this.f327734l, a12, iA2);
        return G0.f406611a;
    }
}
