package com.avito.android.vas_performance.ui.visual_legacy;

import HL0.b;
import androidx.recyclerview.widget.C23424o;
import androidx.view.C23038g0;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Action;
import com.avito.android.util.P2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.H;
import kotlin.sequences.C43033p;

/* compiled from: VisualVasViewModelImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class s extends H implements Y41.l<P2<? super HL0.b>, G0> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final G0 invoke(P2<? super HL0.b> p22) {
        DeepLink helpDeepLink;
        PrintableText printableTextC;
        String title;
        String emptyActionTitle;
        P2<? super HL0.b> p23 = p22;
        p pVar = (p) this.receiver;
        int i12 = p.f322128w0;
        pVar.getClass();
        boolean z12 = p23 instanceof P2.b;
        C23038g0<P2<?>> c23038g0 = pVar.f322139S;
        TL0.d dVar = pVar.f322134N;
        if (z12) {
            dVar.h();
            dVar.f();
            HL0.b bVar = (HL0.b) ((P2.b) p23).f318720a;
            b.a helpAction = bVar.getHelpAction();
            if (helpAction == null || (helpDeepLink = helpAction.getUri()) == null) {
                helpDeepLink = bVar.getHelpDeepLink();
            }
            pVar.f322156j0 = helpDeepLink;
            if (helpDeepLink == null) {
                printableTextC = null;
            } else {
                b.a helpAction2 = bVar.getHelpAction();
                printableTextC = (helpAction2 == null || (title = helpAction2.getTitle()) == null) ? com.avito.android.printable_text.b.c(R.string.visual_vas_help_button, new Serializable[0]) : com.avito.android.printable_text.b.f(title);
            }
            Action action = bVar.getAction();
            if ((action == null || (emptyActionTitle = action.getTitle()) == null) && (emptyActionTitle = bVar.getEmptyActionTitle()) == null) {
                emptyActionTitle = "";
            }
            pVar.f322153g0 = emptyActionTitle;
            String selectedActionTitle = bVar.getSelectedActionTitle();
            pVar.f322154h0 = selectedActionTitle != null ? selectedActionTitle : "";
            ArrayList arrayListA = pVar.f322132L.a(bVar);
            pVar.f322150d0 = arrayListA;
            pVar.f322141U.postValue(new com.avito.android.vas_performance.ui.recycler.i(arrayListA, C23424o.a(new com.avito.android.vas_performance.ui.recycler.h(pVar.f322151e0, arrayListA), true), printableTextC));
            pVar.f322151e0 = arrayListA;
            pVar.f322146Z.setValue(Boolean.valueOf(bVar.getBblFooter() != null));
            pVar.f322159m0 = bVar.getBblFooter();
            pVar.f322145Y.setValue(bVar.getBblFooter());
            Action action2 = bVar.getAction();
            pVar.f322157k0 = action2 != null ? action2.getDeepLink() : null;
            String checkoutContext = bVar.getCheckoutContext();
            if (checkoutContext != null) {
                pVar.f322155i0 = checkoutContext;
            }
            List<? extends com.avito.conveyor_item.a> listD = C43033p.D(C43033p.i(C43033p.i(new C42770s0(pVar.f322150d0), q.f322169l), r.f322170b));
            pVar.f322152f0 = listD;
            boolean zIsEmpty = listD.isEmpty();
            pVar.f322142V.setValue(new com.avito.android.vas_performance.ui.a(!zIsEmpty ? pVar.f322154h0 : pVar.f322153g0, true ^ zIsEmpty));
            c23038g0.postValue(p23);
            dVar.g();
        } else if (p23 instanceof P2.a) {
            ApiError apiError = ((P2.a) p23).f318719a;
            dVar.i(apiError);
            dVar.f();
            c23038g0.postValue(p23);
            dVar.j(apiError);
        } else {
            c23038g0.postValue(p23);
        }
        return G0.f406611a;
    }
}
