package com.avito.android.service_fee_conditions.ui.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;
import qu0.InterfaceC47449a;
import qu0.InterfaceC47450b;

/* compiled from: ServiceFeeConditionsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class m extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ qu0.c f278571l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC47450b> f278572m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f278573n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC47449a, G0> f278574o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f278575p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v f278576q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(qu0.c cVar, InterfaceC43160i interfaceC43160i, Y41.a aVar, Y41.l lVar, Y41.l lVar2, v vVar, int i12) {
        super(2);
        this.f278571l = cVar;
        this.f278572m = interfaceC43160i;
        this.f278573n = aVar;
        this.f278574o = lVar;
        this.f278575p = lVar2;
        this.f278576q = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(65);
        Y41.a<G0> aVar = this.f278573n;
        Y41.l<InterfaceC47449a, G0> lVar = this.f278574o;
        n.a(this.f278571l, this.f278572m, aVar, lVar, this.f278575p, a12, iA2);
        return G0.f406611a;
    }
}
