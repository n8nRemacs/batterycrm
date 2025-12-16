package com.avito.android.early_access.adapter.description;

import Y41.p;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.graphics.f1;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.X;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.font.Z;
import androidx.compose.ui.text.font.e0;
import androidx.compose.ui.text.style.j;
import androidx.compose.ui.text.style.n;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import z0.f;

/* compiled from: EarlyAccessDescriptionPreview.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class d extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f145134l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i12) {
        super(2);
        this.f145134l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f145134l | 1);
        B bE2 = a12.E(2064966);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            C22602e.b bVar = new C22602e.b(0, 1, null);
            bVar.f("Или");
            bVar.c((char) 160);
            bVar.f("бесплатно после");
            e0.f42240c.getClass();
            int iL2 = bVar.l(new androidx.compose.ui.text.e0(0L, 0L, e0.f42250m, (Z) null, (C22605a0) null, (E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (n) null, (f) null, 0L, (j) null, (f1) null, (X) null, (androidx.compose.ui.graphics.drawscope.j) null, 65531, (C42822w) null));
            try {
                bVar.f("11:00");
                G0 g02 = G0.f406611a;
                bVar.h(iL2);
                C22602e c22602eM = bVar.m();
                v.a aVar = v.f42878y1;
                com.akita.compose.theme.re23.b.f63983a.getClass();
                h.a aVar2 = h.f42849c;
                c.a(c22602eM, R1.i(androidx.compose.foundation.A.b(aVar, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(bE2), Y0.f39346a), 12), bE2, 0);
            } catch (Throwable th2) {
                bVar.h(iL2);
                throw th2;
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(iA2);
        }
        return G0.f406611a;
    }
}
