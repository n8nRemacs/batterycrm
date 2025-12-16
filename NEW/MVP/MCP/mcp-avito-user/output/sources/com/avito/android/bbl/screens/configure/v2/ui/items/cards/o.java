package com.avito.android.bbl.screens.configure.v2.ui.items.cards;

import androidx.compose.foundation.layout.C20585k;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.docking_badge.m;
import com.avito.android.bbl.screens.configure.v2.ui.items.cards.C28729a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;

/* compiled from: BblSelectorCardPreview.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class o extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f99437l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(int i12) {
        super(2);
        this.f99437l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f99437l | 1);
        androidx.compose.runtime.B bE2 = a12.E(1018772647);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            bE2.C(187761125);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            if (objT == A.a.f37868b) {
                C42784z0 c42784z0 = C42784z0.f406748b;
                AttributedText attributedText = new AttributedText("В каждый пакет входит семь однодневных услуг, увеличивающих просмотры. Они сильнее, чем одна недельная", c42784z0, 0, 4, null);
                AttributedText attributedText2 = new AttributedText("Самый популярный вариант", c42784z0, 0, 4, null);
                wZ.l lVar = new wZ.l(new Image(P0.c()), null);
                objT = C42745f0.U(new C28729a(attributedText, false, false, lVar, new C28729a.C2994a("Badge", m.b.f61556b, m.c.f61559b, p.f99438l), 1L, null, 66, null), new C28729a(attributedText2, true, false, lVar, null, 2L, null, 80, null), new C28729a(attributedText2, false, true, null, null, 3L, null, 90, null), new C28729a(attributedText, false, true, null, null, 4L, null, 90, null), new C28729a(attributedText, false, true, null, null, 5L, null, 90, null), new C28729a(attributedText2, false, true, null, null, 6L, null, 90, null), new C28729a(attributedText, false, false, null, null, 7L, null, 90, null));
                bE2.H(objT);
            }
            bE2.X(false);
            androidx.compose.runtime.snapshots.D d12 = new androidx.compose.runtime.snapshots.D();
            d12.addAll((List) objT);
            C20585k c20585k = C20585k.f28659a;
            h.a aVar = androidx.compose.ui.unit.h.f42849c;
            c20585k.getClass();
            C.a(d12, null, C20585k.g(12), C20585k.g(11), R1.a(10), null, null, androidx.compose.runtime.internal.r.c(-1042404227, new n(d12), bE2), bE2, 100887552, 198);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new o(iA2);
        }
        return G0.f406611a;
    }
}
