package com.avito.android.cpt.activation;

import Pr.C14830a;
import Rh.C15041a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.cpt.activation.CptActivationFragment;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: CptActivationFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class e extends H implements Y41.l<Lr.c, G0> {
    @Override // Y41.l
    public final G0 invoke(Lr.c cVar) {
        Lr.c cVar2 = cVar;
        CptActivationFragment cptActivationFragment = (CptActivationFragment) this.receiver;
        CptActivationFragment.a aVar = CptActivationFragment.f126198B0;
        cptActivationFragment.getClass();
        if (cVar2.f10139b) {
            com.avito.android.progress_overlay.l lVar = cptActivationFragment.f126207u0;
            if (lVar == null) {
                lVar = null;
            }
            lVar.j();
            View view = cptActivationFragment.f126208v0;
            if (view == null) {
                view = null;
            }
            D6.H(view);
            ViewGroup viewGroup = cptActivationFragment.f126210x0;
            D6.w(viewGroup != null ? viewGroup : null);
        } else {
            Throwable th2 = cVar2.f10140c;
            if (th2 != null) {
                com.avito.android.progress_overlay.l lVar2 = cptActivationFragment.f126207u0;
                if (lVar2 == null) {
                    lVar2 = null;
                }
                lVar2.a(z.l(th2));
                ViewGroup viewGroup2 = cptActivationFragment.f126210x0;
                D6.w(viewGroup2 != null ? viewGroup2 : null);
            } else {
                com.avito.android.progress_overlay.l lVar3 = cptActivationFragment.f126207u0;
                if (lVar3 == null) {
                    lVar3 = null;
                }
                lVar3.j();
                View view2 = cptActivationFragment.f126208v0;
                if (view2 == null) {
                    view2 = null;
                }
                D6.w(view2);
                com.avito.konveyor.adapter.d dVar = cptActivationFragment.f126203q0;
                if (dVar == null) {
                    dVar = null;
                }
                dVar.l(cVar2.f10141d, null);
                ViewGroup viewGroup3 = cptActivationFragment.f126210x0;
                if (viewGroup3 == null) {
                    viewGroup3 = null;
                }
                D6.H(viewGroup3);
                Button button = cptActivationFragment.f126211y0;
                if (button == null) {
                    button = null;
                }
                ButtonAction buttonAction = cVar2.f10142e;
                Or.e.a(button, buttonAction != null ? new C14830a(buttonAction.getTitle(), null, buttonAction.getDeeplink(), buttonAction.getStyle(), buttonAction.isEnabled(), 2, null) : null);
                AttributedText attributedText = cVar2.f10144g;
                if (attributedText != null) {
                    attributedText.setOnDeepLinkClickListener(new C15041a(cptActivationFragment, 27));
                }
                TextView textView = cptActivationFragment.f126212z0;
                if (textView == null) {
                    textView = null;
                }
                com.avito.android.util.text.a aVar2 = cptActivationFragment.f126206t0;
                com.avito.android.util.text.j.a(textView, attributedText, aVar2 != null ? aVar2 : null);
            }
        }
        return G0.f406611a;
    }
}
