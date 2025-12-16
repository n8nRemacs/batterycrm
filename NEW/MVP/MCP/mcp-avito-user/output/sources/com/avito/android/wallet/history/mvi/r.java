package com.avito.android.wallet.history.mvi;

import androidx.compose.runtime.C22066f2;
import com.avito.android.wallet.history.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: WalletHistoryScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class r extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a.C10157a f327720l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<GO0.a, G0> f327721m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f327722n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(a.C10157a c10157a, Y41.l<? super GO0.a, G0> lVar, int i12) {
        super(2);
        this.f327720l = c10157a;
        this.f327721m = lVar;
        this.f327722n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f327722n | 1);
        G.c(this.f327720l, this.f327721m, a12, iA2);
        return G0.f406611a;
    }
}
