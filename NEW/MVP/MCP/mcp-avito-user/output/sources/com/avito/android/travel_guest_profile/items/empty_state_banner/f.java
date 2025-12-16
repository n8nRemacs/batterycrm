package com.avito.android.travel_guest_profile.items.empty_state_banner;

import QE0.a;
import Y41.l;
import Y61.k;
import com.avito.android.R;
import com.avito.android.arch.mvi.utils.c;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: EmptyStateBannerItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_guest_profile/items/empty_state_banner/f;", "LTV0/d;", "Lcom/avito/android/travel_guest_profile/items/empty_state_banner/h;", "Lcom/avito/android/travel_guest_profile/items/empty_state_banner/d;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements TV0.d<h, d> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<QE0.a, G0> f302056b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super QE0.a, G0> lVar) {
        this.f302056b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String string;
        h hVar = (h) eVar;
        d dVar = (d) aVar;
        this.f302056b.invoke(new a.d(dVar.f302050c));
        com.avito.android.arch.mvi.utils.c<AttributedText, PrintableText> cVar = dVar.f302051d;
        boolean z12 = cVar instanceof c.C2712c;
        Banner banner = hVar.f302059c;
        if (z12) {
            string = ((PrintableText) ((c.C2712c) cVar).f92028b).k0(banner.getContext());
        } else {
            if (!(cVar instanceof c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            CharSequence charSequenceC = hVar.f302058b.c(banner.getContext(), (AttributedText) ((c.b) cVar).f92027b);
            string = charSequenceC != null ? charSequenceC.toString() : null;
        }
        banner.setState(new TU.a(string, null, R.layout.travel_guest_profile_empty_state_banner_content, 2, null));
        j.a(hVar.f302060d, dVar.f302052e, null);
        a aVar2 = dVar.f302053f;
        PrintableText printableText = aVar2 != null ? aVar2.f302041a : null;
        e eVar2 = new e(this, dVar);
        Button button = hVar.f302061e;
        String strG = printableText != null ? com.avito.android.printable_text.b.g(printableText, button.getResources()) : null;
        if (strG == null || strG.length() == 0) {
            D6.w(button);
        } else {
            D6.H(button);
            button.setState(new UU.a(strG, null, false, false, false, eVar2, null, null, null, false, 990, null));
        }
    }
}
