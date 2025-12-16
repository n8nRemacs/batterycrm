package com.avito.android.bbl.screens.limit_increase.ui.compose;

import Eh.InterfaceC13485a;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LimitIncreaseScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class o extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f99903l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f99904m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Eh.c f99905n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f99906o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f99907p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f99908q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC13485a, G0> f99909r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(androidx.compose.ui.v vVar, com.akita.compose.component.toast_bar.u uVar, Eh.c cVar, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, Y41.l lVar, Y41.l lVar2) {
        super(2);
        this.f99903l = vVar;
        this.f99904m = uVar;
        this.f99905n = cVar;
        this.f99906o = interfaceC22204y1;
        this.f99907p = interfaceC22204y12;
        this.f99908q = lVar;
        this.f99909r = lVar2;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            androidx.compose.ui.v vVarD0 = this.f99903l.d0(C20588k2.f28682c);
            InterfaceC22204y1 interfaceC22204y1 = this.f99906o;
            InterfaceC22204y1 interfaceC22204y12 = this.f99907p;
            Eh.c cVar = this.f99905n;
            com.akita.compose.component.scaffold.g.a(vVarD0, androidx.compose.runtime.internal.r.c(694120628, new h(cVar, interfaceC22204y1, interfaceC22204y12), a13), androidx.compose.runtime.internal.r.c(-1653116235, new k(cVar, this.f99908q, this.f99909r), a13), this.f99904m, null, null, null, androidx.compose.runtime.internal.r.c(51939197, new n(cVar, interfaceC22204y1), a13), a13, 12583344, 112);
        }
        return G0.f406611a;
    }
}
