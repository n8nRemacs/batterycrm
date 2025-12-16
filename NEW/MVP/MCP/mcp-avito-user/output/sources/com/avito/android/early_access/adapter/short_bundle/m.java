package com.avito.android.early_access.adapter.short_bundle;

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

/* compiled from: EarlyAccessShortBundle.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class m extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f145214l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i12) {
        super(2);
        this.f145214l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f145214l | 1);
        B bE2 = a12.E(-1839280536);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            List listU = C42745f0.U(new EarlyAccessShortBundleItem(null, "", true, "7 дней", "399 ₽", "-37%", "633 ₽", "Кто ищет срочно", 1, null), new EarlyAccessShortBundleItem(null, "", false, "14 дней", "599 ₽", "-53%", "1 266 ₽", "Больше выбора", 1, null));
            l lVar = l.f145213l;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            v vVarT = C20588k2.t(v.f42878y1, 375);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63987e.getClass();
            com.akita.compose.theme.re23.semantic.b.f65954b.c().getClass();
            n.b(48, lVar, bE2, R1.k(0.0f, 16, 1, androidx.compose.foundation.A.b(vVarT, X2.b.f18125d.c(bE2), Y0.f39346a)), listU);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new m(iA2);
        }
        return G0.f406611a;
    }
}
