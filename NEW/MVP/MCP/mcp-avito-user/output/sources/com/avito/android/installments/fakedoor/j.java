package com.avito.android.installments.fakedoor;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InstallmentsFakedoorScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class j extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SN.d f172556l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<TN.a, G0> f172557m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v.a f172558n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SN.d dVar, Y41.l lVar, v.a aVar, int i12) {
        super(2);
        this.f172556l = dVar;
        this.f172557m = lVar;
        this.f172558n = aVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1);
        v.a aVar = this.f172558n;
        g.f(this.f172556l, this.f172557m, aVar, a12, iA2);
        return G0.f406611a;
    }
}
