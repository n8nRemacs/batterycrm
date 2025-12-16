package com.avito.android.early_access.adapter.bundle;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessBundlePreview.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class j extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f145120l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i12) {
        super(2);
        this.f145120l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) throws Throwable {
        num.intValue();
        int iA2 = C22066f2.a(this.f145120l | 1);
        B bE2 = a12.E(1024370704);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            EarlyAccessSelectableBundleItem earlyAccessSelectableBundleItem = new EarlyAccessSelectableBundleItem(null, "", false, "7 дней", "399 ₽", "633*₽", "-37%", "Если нужно быстро заехать", false, false, 769, null);
            i iVar = i.f145119l;
            v.a aVar = v.f42878y1;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63987e.getClass();
            com.akita.compose.theme.re23.semantic.b.f65954b.c().getClass();
            h.a(earlyAccessSelectableBundleItem, iVar, androidx.compose.foundation.A.b(aVar, X2.b.f18125d.c(bE2), Y0.f39346a), bE2, 48);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new j(iA2);
        }
        return G0.f406611a;
    }
}
