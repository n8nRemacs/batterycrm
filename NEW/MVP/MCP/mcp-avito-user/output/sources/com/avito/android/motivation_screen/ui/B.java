package com.avito.android.motivation_screen.ui;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import v20.C49152c;

/* compiled from: MotivationScreen.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class B extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C49152c f206372l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f206373m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public B(C49152c c49152c, Y41.l<? super DeepLink, G0> lVar) {
        super(2);
        this.f206372l = c49152c;
        this.f206373m = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r15v7, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v20.d dVar = this.f206372l.f440414k;
            if (dVar != null) {
                v.a aVar = androidx.compose.ui.v.f42878y1;
                float f12 = 10;
                h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
                androidx.compose.ui.v vVarD = C20588k2.d(R1.m(R1.k(f12, 0.0f, 2, aVar), 0.0f, f12, 0.0f, 16, 5), 1.0f);
                com.akita.compose.theme.re23.b.f63983a.getClass();
                com.akita.compose.component.button.m.c(dVar.f440418a, new A(this.f206373m, dVar), com.akita.compose.theme.re23.b.c(a13).X1(), vVarD, null, null, null, false, false, null, a13, 3584, 1008);
            }
        }
        return G0.f406611a;
    }
}
