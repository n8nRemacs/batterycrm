package com.avito.android.extended_profile_phone_dialog;

import Ca1.ViewOnClickListenerC13236c;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.ExtendedProfilePhone;
import com.avito.android.remote.model.ExtendedProfilePhoneDisclaimer;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.S;
import com.avito.android.util.y6;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ExtendedProfilePhoneDialogFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_phone_dialog/d;", "Lcom/avito/android/extended_profile_phone_dialog/c;", "_avito_extended-profile-phone-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ClipboardManager f151561a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final S f151562b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f151563c;

    @Inject
    public d(@Y61.k ClipboardManager clipboardManager, @Y61.k S s5, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f151561a = clipboardManager;
        this.f151562b = s5;
        this.f151563c = interfaceC28373a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.app.Dialog, com.avito.android.extended_profile_phone_dialog.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.avito.android.lib.design.bottom_sheet.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.app.Dialog, com.avito.android.extended_profile_phone_dialog.a] */
    @Override // com.avito.android.extended_profile_phone_dialog.c
    @Y61.k
    public final com.avito.android.lib.design.bottom_sheet.d a(@Y61.k f fVar, @Y61.l FA.a aVar, @Y61.k Context context, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        ?? bVar;
        List<ExtendedProfilePhone> list = fVar.f151599a;
        ExtendedProfilePhoneDisclaimer extendedProfilePhoneDisclaimer = fVar.f151600b;
        if (extendedProfilePhoneDisclaimer != null) {
            bVar = new a(context, this.f151563c);
            I5.a(bVar.f151554G, extendedProfilePhoneDisclaimer.getTitle(), false);
            I5.a(bVar.f151555H, extendedProfilePhoneDisclaimer.getDescription(), false);
            bVar.V(bVar.f151556I, (ExtendedProfilePhone) C42745f0.G(list), aVar, lVar);
            for (ExtendedProfilePhone extendedProfilePhone : C42745f0.w(list, 1)) {
                Button button = new Button(bVar.getContext(), null, R.attr.buttonBeigeLarge, 0, 8, null);
                bVar.V(button, extendedProfilePhone, aVar, lVar);
                bVar.f151553F.addView(button);
                D6.c(button, null, Integer.valueOf(y6.b(16)), null, null, 13);
            }
            if (aVar != null) {
                bVar.f151552E.c(new FA.c(aVar.f4581a, aVar.f4582b, aVar.f4583c, aVar.f4584d));
            }
        } else {
            bVar = new b(context, this.f151561a, this.f151562b);
            for (ExtendedProfilePhone extendedProfilePhone2 : list) {
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(bVar.getContext());
                LinearLayout linearLayout = bVar.f151560G;
                View viewInflate = layoutInflaterFrom.inflate(R.layout.extended_profile_phone_item, (ViewGroup) linearLayout, false);
                View viewFindViewById = viewInflate.findViewById(R.id.extended_profile_phone_number);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                I5.a((TextView) viewFindViewById, extendedProfilePhone2.getFormattedPhone(), false);
                View viewFindViewById2 = viewInflate.findViewById(R.id.extended_profile_phone_description);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                I5.a((TextView) viewFindViewById2, extendedProfilePhone2.getDescription(), false);
                View viewFindViewById3 = viewInflate.findViewById(R.id.extended_profile_phone_text_container);
                if (viewFindViewById3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
                }
                ((LinearLayout) viewFindViewById3).setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.f(29, bVar, extendedProfilePhone2));
                View viewFindViewById4 = viewInflate.findViewById(R.id.extended_profile_phone_call_button);
                if (viewFindViewById4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
                }
                ((Button) viewFindViewById4).setOnClickListener(new ViewOnClickListenerC13236c(lVar, extendedProfilePhone2, (b) bVar));
                linearLayout.addView(viewInflate);
            }
        }
        return bVar;
    }
}
