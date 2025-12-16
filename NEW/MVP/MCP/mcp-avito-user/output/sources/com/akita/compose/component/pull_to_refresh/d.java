package com.akita.compose.component.pull_to_refresh;

import androidx.compose.ui.graphics.InterfaceC22276o0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;

/* compiled from: PullToRefresh.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/o0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/graphics/o0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.l<InterfaceC22276o0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f62419l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f62420m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, l lVar) {
        super(1);
        this.f62419l = jVar;
        this.f62420m = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(InterfaceC22276o0 interfaceC22276o0) {
        InterfaceC22276o0 interfaceC22276o02 = interfaceC22276o0;
        j jVar = this.f62419l;
        interfaceC22276o02.j(s.f(jVar.a(), 0.0f, 1.0f));
        interfaceC22276o02.k(s.f(jVar.a(), 0.0f, 1.0f));
        float f12 = 2;
        interfaceC22276o02.g(((jVar.a() * interfaceC22276o02.y0(this.f62420m.f62475a)) / f12) - (Float.intBitsToFloat((int) (interfaceC22276o02.i() & 4294967295L)) / f12));
        return G0.f406611a;
    }
}
