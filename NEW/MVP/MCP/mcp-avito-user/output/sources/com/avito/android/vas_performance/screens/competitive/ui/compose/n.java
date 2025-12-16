package com.avito.android.vas_performance.screens.competitive.ui.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CompetitiveVasV2Screen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class n extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f320549l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f320550m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f320551n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f320552o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(int i12, int i13, Y41.a aVar, androidx.compose.ui.v vVar) {
        super(2);
        this.f320549l = i12;
        this.f320550m = aVar;
        this.f320551n = vVar;
        this.f320552o = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f320552o | 1);
        androidx.compose.ui.v vVar = this.f320551n;
        u.b(this.f320549l, iA2, this.f320550m, a12, vVar);
        return G0.f406611a;
    }
}
