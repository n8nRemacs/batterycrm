package com.avito.android.motivation_screen.ui;

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
final class C extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C49152c f206374l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ N f206375m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C(C49152c c49152c, Y41.l<? super DeepLink, G0> lVar) {
        super(2);
        this.f206374l = c49152c;
        this.f206375m = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            float f12 = 24;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.a aVar3 = com.akita.compose.theme.re23.b.f63984b;
            com.akita.compose.foundation.ui.n.a(com.akita.compose.foundation.modifier.d.a(aVar, new com.akita.compose.foundation.modifier.e(0.0f, 4, f12, aVar3.f63941m, 1, null), new com.akita.compose.foundation.modifier.e(0.0f, 1, 3, aVar3.f63938l.a(0.05f), 1, null), f12), androidx.compose.foundation.shape.o.c(f12, f12, 0.0f, 0.0f, 12), 0.0f, aVar3.f63851H1, null, androidx.compose.runtime.internal.r.c(1806983138, new B(this.f206374l, this.f206375m), a13), a13, 1572864, 52);
        }
        return G0.f406611a;
    }
}
