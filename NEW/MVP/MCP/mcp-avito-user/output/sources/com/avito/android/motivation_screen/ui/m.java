package com.avito.android.motivation_screen.ui;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.ui.unit.h;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MotivationErrorScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class m extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f206435l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f206436m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(String str, Y41.a<G0> aVar) {
        super(2);
        this.f206435l = str;
        this.f206436m = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            float f12 = 10;
            androidx.compose.ui.v vVarM = R1.m(C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f), f12, 0.0f, f12, 16, 2);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.button.m.c(this.f206435l, this.f206436m, com.akita.compose.theme.re23.b.c(a13).X1(), vVarM, null, null, null, false, false, null, a13, 512, 1008);
        }
        return G0.f406611a;
    }
}
