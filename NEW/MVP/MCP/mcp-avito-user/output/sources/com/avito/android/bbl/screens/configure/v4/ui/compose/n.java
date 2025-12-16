package com.avito.android.bbl.screens.configure.v4.ui.compose;

import Bh.C13148c;
import Bh.InterfaceC13146a;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BblConfigureV4Screen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class n extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f99575l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C13148c f99576m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f99577n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f99578o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC13146a, G0> f99579p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(v vVar, C13148c c13148c, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12, Y41.l lVar) {
        super(2);
        this.f99575l = vVar;
        this.f99576m = c13148c;
        this.f99577n = interfaceC22204y1;
        this.f99578o = interfaceC22204y12;
        this.f99579p = lVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v vVarA = C22501m2.a(this.f99575l.d0(C20588k2.f28682c), "BblConfigureV4RootTestTag");
            InterfaceC22204y1 interfaceC22204y1 = this.f99577n;
            InterfaceC22204y1 interfaceC22204y12 = this.f99578o;
            C13148c c13148c = this.f99576m;
            com.akita.compose.component.scaffold.g.a(vVarA, androidx.compose.runtime.internal.r.c(-1864493108, new g(c13148c, interfaceC22204y1, interfaceC22204y12), a13), androidx.compose.runtime.internal.r.c(-1614391829, new i(c13148c, this.f99579p), a13), null, null, null, null, androidx.compose.runtime.internal.r.c(-297280989, new m(c13148c, interfaceC22204y1, interfaceC22204y12), a13), a13, 12583344, 120);
        }
        return G0.f406611a;
    }
}
