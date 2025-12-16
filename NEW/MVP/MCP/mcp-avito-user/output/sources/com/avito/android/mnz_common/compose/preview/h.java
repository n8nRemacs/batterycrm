package com.avito.android.mnz_common.compose.preview;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.mnz_common.compose.C32579b;
import com.avito.android.mnz_common.ui.compose.model.c;
import com.avito.android.mnz_common.ui.compose.model.e;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* compiled from: MnzFloatingFooterPreview.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class h extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f197935l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i12) {
        super(2);
        this.f197935l = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f197935l | 1);
        B bE2 = a12.E(1504089349);
        if (iA2 == 0 && bE2.c()) {
            bE2.f();
        } else {
            com.avito.android.mnz_common.ui.compose.model.a aVar = new com.avito.android.mnz_common.ui.compose.model.a("Продолжить", new NoMatchLink(), e.f197932l, null, 8, null);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.theme.re23.b.f63985c.getClass();
            e.b bVar = new e.b(com.akita.compose.theme.re23.e.f64482c8, null, com.akita.compose.theme.re23.b.f63984b.f63844F0, 2, null);
            C42784z0 c42784z0 = C42784z0.f406748b;
            C32579b.a(new com.avito.android.mnz_common.ui.compose.model.c(aVar, new c.a(bVar, new AttributedText("Текст выбранного контакта", c42784z0, 0, 4, null)), new AttributedText("Условия", c42784z0, 0, 4, null), new com.avito.android.mnz_common.ui.compose.model.a("Пропустить", new NoMatchLink(), f.f197933l, null, 8, null)), g.f197934l, null, null, false, false, bE2, 56, 60);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new h(iA2);
        }
        return G0.f406611a;
    }
}
