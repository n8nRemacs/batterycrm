package com.avito.android.mortgage.verification_flow;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VerificationFlowScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class s extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v.a f203951l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f203952m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f203953n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i12, Y41.a aVar, v.a aVar2) {
        super(2);
        this.f203951l = aVar2;
        this.f203952m = aVar;
        this.f203953n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f203953n | 1);
        v.a aVar = this.f203951l;
        t.d(iA2, this.f203952m, a12, aVar);
        return G0.f406611a;
    }
}
