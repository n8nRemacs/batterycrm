package com.avito.android.tariff_lf_publication.level.ui;

import UD0.c;
import androidx.compose.runtime.InterfaceC22204y1;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import wZ.C49580d;

/* compiled from: TariffLfPublicationLevelScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class y extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UD0.c f301015l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f301016m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(UD0.c cVar, InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f301015l = cVar;
        this.f301016m = interfaceC22204y1;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        Object next;
        C49580d c49580d;
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            UD0.c cVar = this.f301015l;
            Iterator<T> it = cVar.f16280d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((c.b) next).f16287c) {
                    break;
                }
            }
            c.b bVar = (c.b) next;
            String str = cVar.f16281e;
            if (str != null && bVar != null && (c49580d = cVar.f16282f) != null) {
                c.b.C1111c c1111c = bVar.f16291g;
                k.a(str, c1111c.f16301a, c1111c.f16302b, c49580d, (Y41.l) this.f301016m.getF42167b(), cVar.f16285i, null, a13, 4096);
            }
        }
        return G0.f406611a;
    }
}
