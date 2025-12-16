package com.avito.android.verification.verification_input_inn;

import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.util.D6;
import com.avito.android.verification.verification_input_inn.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import xM0.C49864d;

/* compiled from: VerificationInputInnView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class s extends H implements Y41.l<l, G0> {
    public final void f(@Y61.k l lVar) {
        p pVar = (p) this.receiver;
        pVar.getClass();
        boolean z12 = lVar instanceof l.a;
        C49864d c49864d = pVar.f325640f;
        if (z12) {
            C49864d.c(c49864d, r.f325644l);
            return;
        }
        boolean z13 = lVar instanceof l.b;
        Button button = pVar.f325639e;
        if (!z13) {
            if (L.f(lVar, l.c.f325629a)) {
                C49864d.d(c49864d);
                D6.w(button);
                return;
            }
            return;
        }
        k kVar = ((l.b) lVar).f325628a;
        button.setText(kVar.f325624a);
        button.setOnClickListener(new o(0, pVar, kVar));
        Y41.a<G0> aVar = pVar.f325636b;
        boolean z14 = kVar.f325626c;
        NavBar navBar = pVar.f325638d;
        if (z14) {
            navBar.c(R.attr.ic_close24, aVar);
        } else {
            navBar.c(R.attr.ic_arrowBack24, aVar);
        }
        c49864d.b();
        D6.H(button);
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(l lVar) {
        f(lVar);
        return G0.f406611a;
    }
}
