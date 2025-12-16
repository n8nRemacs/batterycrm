package com.avito.android.feeds_global;

import Y41.p;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.ui.text.style.s;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.foundation.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: FeedsViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class k extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f157925l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str) {
        super(2);
        this.f157925l = str;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            float f12 = 16;
            v vVarD = C20588k2.d(R1.l(v.f42878y1, f12, 28, f12, 4), 1.0f);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            r rVar = com.akita.compose.theme.re23.b.f63988f.f65233d;
            com.akita.compose.theme.re23.b.f63987e.getClass();
            com.akita.compose.theme.re23.semantic.b.f65954b.getText().getClass();
            long jC2 = X2.h.f18556d.c(a13);
            s.f42720b.getClass();
            com.akita.compose.foundation.ui.p.b(this.f157925l, rVar, vVarD, false, jC2, null, 1, s.f42722d, false, null, a13, 14155776, 808);
        }
        return G0.f406611a;
    }
}
