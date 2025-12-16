package com.avito.android.free_delivery.ui.re23.components;

import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.text.C20981p1;
import androidx.compose.runtime.A;
import androidx.compose.ui.text.input.C;
import androidx.compose.ui.text.input.O;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.component.input.u;
import com.akita.compose.component.input.v;
import java.text.DecimalFormat;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FreeDeliveryInputSlider.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class h extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DecimalFormat f158876l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f158877m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f158878n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f158879o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.input.transformation.k f158880p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(DecimalFormat decimalFormat, int i12, float f12, Y41.l lVar, com.akita.compose.component.input.transformation.k kVar) {
        super(2);
        this.f158876l = decimalFormat;
        this.f158877m = i12;
        this.f158878n = f12;
        this.f158879o = lVar;
        this.f158880p = kVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        String string;
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            DecimalFormat decimalFormat = this.f158876l;
            try {
                string = decimalFormat.format(Integer.valueOf(this.f158877m));
            } catch (Exception unused) {
                string = decimalFormat.toString();
            }
            com.akita.compose.theme.re23.b.f63983a.getClass();
            v f66387b = com.akita.compose.theme.re23.b.l(a13).getF66387b();
            C.f42345b.getClass();
            C20981p1 c20981p1 = new C20981p1(0, (Boolean) null, C.f42348e, 0, (O) null, (Boolean) null, (z0.f) null, 123, (C42822w) null);
            v.a aVar = androidx.compose.ui.v.f42878y1;
            float f12 = this.f158878n / 2;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            u.b(string, f66387b, this.f158879o, R1.m(aVar, 0.0f, 0.0f, 0.0f, f12, 7), null, false, null, false, c20981p1, null, this.f158880p, 0, false, 0, null, null, null, null, a13, 100663296, 0, 260848);
        }
        return G0.f406611a;
    }
}
