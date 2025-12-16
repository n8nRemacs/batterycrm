package com.avito.android.mortgage.verification_flow;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;
import s10.InterfaceC47958b;

/* compiled from: VerificationFlowScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class r extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f203944l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC47958b> f203945m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f203946n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f203947o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f203948p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f203949q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f203950r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC22204y1 interfaceC22204y1, InterfaceC43160i interfaceC43160i, Y41.a aVar, Y41.l lVar, Y41.l lVar2, Y41.a aVar2, Y41.l lVar3, int i12) {
        super(2);
        this.f203944l = interfaceC22204y1;
        this.f203945m = interfaceC43160i;
        this.f203946n = aVar;
        this.f203947o = lVar;
        this.f203948p = lVar2;
        this.f203949q = aVar2;
        this.f203950r = lVar3;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(1797569);
        Y41.l<DeepLink, G0> lVar = this.f203947o;
        Y41.l<DeepLink, G0> lVar2 = this.f203948p;
        t.a(this.f203944l, this.f203945m, this.f203946n, lVar, lVar2, this.f203949q, this.f203950r, a12, iA2);
        return G0.f406611a;
    }
}
