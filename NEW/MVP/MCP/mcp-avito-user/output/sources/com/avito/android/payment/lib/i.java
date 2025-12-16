package com.avito.android.payment.lib;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.payment.lib.G;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: PaymentMethodsView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class i extends H implements Y41.l<G, G0> {
    @Override // Y41.l
    public final G0 invoke(G g12) {
        G g13 = g12;
        C33021f c33021f = (C33021f) this.receiver;
        c33021f.getClass();
        boolean z12 = g13 instanceof G.c;
        LinearLayout linearLayout = c33021f.f214661h;
        FrameLayout frameLayout = c33021f.f214664k;
        LinearLayout linearLayout2 = c33021f.f214662i;
        if (z12) {
            c33021f.f214655b.c(new UV0.c(((G.c) g13).f214532a));
            RecyclerView recyclerView = c33021f.f214667n;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            recyclerView.post(new com.avito.android.inline_filters.dialog.group.item.double_input.e(c33021f, 16));
            D6.H(linearLayout2);
            D6.w(frameLayout);
            D6.w(linearLayout);
        } else if (g13 instanceof G.b) {
            D6.w(linearLayout2);
            D6.H(frameLayout);
            D6.w(linearLayout);
        } else if (g13 instanceof G.a) {
            D6.w(linearLayout2);
            D6.w(frameLayout);
            D6.H(linearLayout);
            c33021f.f214663j.setText(((G.a) g13).f214530a);
        }
        return G0.f406611a;
    }
}
