package com.avito.android.vas_performance.screens.competitive.ui.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: CompetitiveVasV2Screen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class m extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ JL0.c f320543l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<JL0.b> f320544m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f320545n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<JL0.a, G0> f320546o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f320547p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f320548q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(JL0.c cVar, InterfaceC43160i interfaceC43160i, Y41.a aVar, Y41.l lVar, Y41.l lVar2, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f320543l = cVar;
        this.f320544m = interfaceC43160i;
        this.f320545n = aVar;
        this.f320546o = lVar;
        this.f320547p = lVar2;
        this.f320548q = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(65);
        Y41.a<G0> aVar = this.f320545n;
        Y41.l<JL0.a, G0> lVar = this.f320546o;
        u.a(this.f320543l, this.f320544m, aVar, lVar, this.f320547p, a12, iA2);
        return G0.f406611a;
    }
}
