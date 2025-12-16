package com.akita.compose.component.button;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Button.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class o extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f60809l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f60810m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f60811n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.graphics.painter.e f60812o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(float f12, t tVar, boolean z12, androidx.compose.ui.graphics.painter.e eVar) {
        super(2);
        this.f60809l = f12;
        this.f60810m = tVar;
        this.f60811n = z12;
        this.f60812o = eVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            float f12 = this.f60809l;
            com.akita.compose.foundation.ui.e.b(56, 0, ((T) this.f60810m.d(this.f60811n, a13).getF42167b()).f39331a, a13, Float.isNaN(f12) ? v.f42878y1 : C20588k2.o(v.f42878y1, f12), this.f60812o, null);
        }
        return G0.f406611a;
    }
}
