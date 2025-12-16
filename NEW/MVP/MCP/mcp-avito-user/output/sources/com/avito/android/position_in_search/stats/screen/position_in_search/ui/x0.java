package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import androidx.compose.foundation.layout.InterfaceC20611q1;
import c90.InterfaceC26960a;
import c90.c;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SearchPositionCompetitors.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/q1;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/q1;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class x0 extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20611q1, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c.C2034c f221742l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f221743m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.painter.e f221744n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC26960a, G0> f221745o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x0(c.C2034c c2034c, float f12, androidx.compose.ui.graphics.painter.e eVar, Y41.l<? super InterfaceC26960a, G0> lVar) {
        super(3);
        this.f221742l = c2034c;
        this.f221743m = f12;
        this.f221744n = eVar;
        this.f221745o = lVar;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20611q1 interfaceC20611q1, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            Iterator it = this.f221742l.f57726c.iterator();
            while (it.hasNext()) {
                z0.b((c.C2034c.a) it.next(), this.f221743m, this.f221744n, this.f221745o, a13, 520);
            }
        }
        return G0.f406611a;
    }
}
