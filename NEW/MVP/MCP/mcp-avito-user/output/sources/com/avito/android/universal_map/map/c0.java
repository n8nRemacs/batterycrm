package com.avito.android.universal_map.map;

import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: UniversalPointsViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", "loadingState", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class c0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f304920b;

    public c0(g0 g0Var) {
        this.f304920b = g0Var;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2<G0> p22 = (P2) obj;
        boolean z12 = p22 instanceof P2.a;
        g0 g0Var = this.f304920b;
        if (z12) {
            g0Var.f305202e0.postValue(p22);
        } else if (p22 instanceof P2.b) {
            g0Var.f305202e0.postValue(new P2.b(G0.f406611a));
        } else if (p22.equals(P2.c.f318721a)) {
            g0Var.f305202e0.postValue(p22);
        }
    }
}
