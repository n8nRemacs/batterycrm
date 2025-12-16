package com.avito.android.multi_message_send.composable;

import F20.e;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.ui.unit.h;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LazyDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "androidx/compose/foundation/lazy/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class D extends kotlin.jvm.internal.N implements Y41.r<InterfaceC20793y, Integer, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f206472l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l f206473m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G20.f f206474n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(List list, Y41.l lVar, G20.f fVar) {
        super(4);
        this.f206472l = list;
        this.f206473m = lVar;
        this.f206474n = fVar;
    }

    @Override // Y41.r
    public final G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, androidx.compose.runtime.A a12, Integer num2) {
        int i12;
        InterfaceC20793y interfaceC20793y2 = interfaceC20793y;
        int iIntValue = num.intValue();
        androidx.compose.runtime.A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i12 = (a13.B(interfaceC20793y2) ? 4 : 2) | iIntValue2;
        } else {
            i12 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i12 |= a13.m(iIntValue) ? 32 : 16;
        }
        if (a13.p(i12 & 1, (i12 & 147) != 146)) {
            F20.e eVar = (F20.e) this.f206472l.get(iIntValue);
            a13.C(1687065669);
            if (eVar instanceof e.b) {
                a13.C(1687096668);
                W.a(a13, 0);
                a13.h();
            } else if (eVar instanceof e.a) {
                a13.C(1687221071);
                V.b((e.a) eVar, this.f206473m, this.f206474n.f6261d.f6228d, a13, 8);
                a13.h();
            } else if (eVar instanceof e.c) {
                a13.C(1687545486);
                a13.C(1024268986);
                if (iIntValue == 0) {
                    h.a aVar = androidx.compose.ui.unit.h.f42849c;
                    com.akita.compose.foundation.ui.g.a(4, null, a13, 6);
                }
                a13.h();
                a13.C(1024273050);
                if (iIntValue != 0) {
                    h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                    com.akita.compose.foundation.ui.g.a(8, null, a13, 6);
                }
                a13.h();
                a0.a(((e.c) eVar).f4521c, null, a13, 0);
                a13.h();
            } else {
                a13.C(1687901738);
                a13.h();
            }
            a13.h();
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
