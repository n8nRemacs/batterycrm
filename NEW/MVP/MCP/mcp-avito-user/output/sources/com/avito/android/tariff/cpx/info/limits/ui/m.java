package com.avito.android.tariff.cpx.info.limits.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;
import vB0.InterfaceC49191a;

/* compiled from: TariffCpxInfoLimitsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class m extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ vB0.c f296671l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<vB0.b> f296672m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC49191a, G0> f296673n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f296674o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f296675p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(vB0.c cVar, InterfaceC43160i interfaceC43160i, Y41.l lVar, Y41.l lVar2, v vVar, int i12) {
        super(2);
        this.f296671l = cVar;
        this.f296672m = interfaceC43160i;
        this.f296673n = lVar;
        this.f296674o = lVar2;
        this.f296675p = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(65);
        InterfaceC43160i<vB0.b> interfaceC43160i = this.f296672m;
        Y41.l<InterfaceC49191a, G0> lVar = this.f296673n;
        n.a(this.f296671l, interfaceC43160i, lVar, this.f296674o, a12, iA2);
        return G0.f406611a;
    }
}
