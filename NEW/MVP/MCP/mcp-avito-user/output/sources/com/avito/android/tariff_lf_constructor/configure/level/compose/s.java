package com.avito.android.tariff_lf_constructor.configure.level.compose;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import androidx.compose.ui.unit.h;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import mD0.C43950b;
import mD0.C43952d;

/* compiled from: LazyDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "androidx/compose/foundation/lazy/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class s extends N implements Y41.r<InterfaceC20793y, Integer, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f299790l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l f299791m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C43952d f299792n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(List list, Y41.l lVar, C43952d c43952d) {
        super(4);
        this.f299790l = list;
        this.f299791m = lVar;
        this.f299792n = c43952d;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, java.util.List] */
    @Override // Y41.r
    public final G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, A a12, Integer num2) {
        int i12;
        androidx.compose.ui.v vVarK;
        InterfaceC20793y interfaceC20793y2 = interfaceC20793y;
        int iIntValue = num.intValue();
        A a13 = a12;
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
            C43950b c43950b = (C43950b) this.f299790l.get(iIntValue);
            a13.C(-1133531525);
            C43952d c43952d = this.f299792n;
            if (iIntValue == 0) {
                androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                float f12 = 20;
                vVarK = androidx.compose.ui.draw.k.a(R1.k(10, 0.0f, 2, vVarD), androidx.compose.foundation.shape.o.c(f12, f12, 0.0f, 0.0f, 12));
            } else if (iIntValue == C42745f0.J(c43952d.f414431f)) {
                androidx.compose.ui.v vVarD2 = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                float f13 = 20;
                vVarK = androidx.compose.ui.draw.k.a(R1.k(10, 0.0f, 2, vVarD2), androidx.compose.foundation.shape.o.c(0.0f, 0.0f, f13, f13, 3));
            } else {
                androidx.compose.ui.v vVarD3 = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
                h.a aVar3 = androidx.compose.ui.unit.h.f42849c;
                vVarK = R1.k(10, 0.0f, 2, vVarD3);
            }
            i.a(c43950b, this.f299791m, vVarK, a13, 8);
            a13.C(1210393471);
            if (iIntValue < C42745f0.J(c43952d.f414431f)) {
                com.akita.compose.foundation.ui.g.a(2, null, a13, 6);
            }
            a13.h();
            a13.h();
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
