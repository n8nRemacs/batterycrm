package com.avito.android.early_access.adapter.selectable_price;

import Y41.p;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessLongPricePricesPreview.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class g extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f145177l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i12) {
        super(2);
        this.f145177l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f145177l | 1);
        B bE2 = a12.E(-318769982);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            List listU = C42745f0.U(new EarlyAccessSelectablePriceItem(null, "", true, "1 объявление", "129 ₽", null, null, null, 1, null), new EarlyAccessSelectablePriceItem(null, "", false, "3 объявления", "289 ₽", "387 ₽", "-25%", "96*₽ за*каждое", 1, null), new EarlyAccessSelectablePriceItem(null, "", false, "5 объявлений", "399 ₽", "645*₽", "-38%", "79*₽ за*каждое", 1, null));
            v.a aVar = v.f42878y1;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63987e.getClass();
            com.akita.compose.theme.re23.semantic.b.f65954b.c().getClass();
            v vVarD = C20588k2.d(androidx.compose.foundation.A.b(aVar, X2.b.f18125d.c(bE2), Y0.f39346a), 1.0f);
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            e.b(48, f.f145176l, bE2, R1.k(10, 0.0f, 2, vVarD), listU);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(iA2);
        }
        return G0.f406611a;
    }
}
