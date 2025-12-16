package com.avito.android.bbl.screens.configure.v2.ui.items.cards;

import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.lazy.grid.X;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectorCardGrid.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/X;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/grid/X;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class x extends N implements Y41.q<X, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C22096n f99449l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ D f99450m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f99451n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C22096n c22096n, D d12, int i12) {
        super(3);
        this.f99449l = c22096n;
        this.f99450m = d12;
        this.f99451n = i12;
    }

    @Override // Y41.q
    public final G0 invoke(X x12, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            Integer numValueOf = Integer.valueOf(this.f99451n);
            v.a aVar = androidx.compose.ui.v.f42878y1;
            D d12 = this.f99450m;
            float f12 = d12.getF99407e() != null ? 8 : 0;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            this.f99449l.invoke(d12, numValueOf, R1.m(aVar, 0.0f, f12, 0.0f, 0.0f, 13), a13, 0);
        }
        return G0.f406611a;
    }
}
