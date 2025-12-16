package com.avito.android.replace_main.widget.compose;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.graphics.Y0;
import androidx.compose.ui.v;
import com.akita.compose.foundation.ui.n;
import com.avito.android.replace_main.onboarding.widget.ReplaceMainItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ReplaceMainWidgetPreview.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class k extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f254685l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i12) {
        super(2);
        this.f254685l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f254685l | 1);
        ReplaceMainItem.ReplaceMain replaceMain = l.f254686a;
        B bE2 = a12.E(877922010);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            v.a aVar = v.f42878y1;
            com.akita.compose.theme.re23.b.f63983a.getClass();
            v vVarB = androidx.compose.foundation.A.b(aVar, com.akita.compose.theme.re23.b.f63984b.f63851H1.c(bE2), Y0.f39346a);
            c.f254669a.getClass();
            n.a(vVarB, null, 0.0f, null, null, c.f254670b, bE2, 1572864, 62);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new k(iA2);
        }
        return G0.f406611a;
    }
}
