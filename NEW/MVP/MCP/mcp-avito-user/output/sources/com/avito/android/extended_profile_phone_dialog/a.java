package com.avito.android.extended_profile_phone_dialog;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.ExtendedProfilePhone;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileDisclaimerPhoneDialog.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_phone_dialog/a;", "Lcom/avito/android/lib/design/bottom_sheet/d;", "_avito_extended-profile-phone-dialog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends com.avito.android.lib.design.bottom_sheet.d {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f151551J = 0;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f151552E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f151553F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final TextView f151554G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final TextView f151555H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final Button f151556I;

    public a(@Y61.k Context context, @Y61.k InterfaceC28373a interfaceC28373a) {
        super(context, 0, 2, null);
        this.f151552E = interfaceC28373a;
        D(R.layout.extended_profile_disclaimer_phone_dialog, true);
        com.avito.android.lib.design.bottom_sheet.d.I(this, true);
        com.avito.android.lib.design.bottom_sheet.d.M(this, null, false, true, 7);
        setCancelable(true);
        this.f151553F = (LinearLayout) findViewById(R.id.extended_profile_disclaimer_phones_container);
        this.f151554G = (TextView) findViewById(R.id.extended_profile_disclaimer_phones_title);
        this.f151555H = (TextView) findViewById(R.id.extended_profile_disclaimer_phones_description);
        this.f151556I = (Button) findViewById(R.id.extended_profile_disclaimer_phones_primary_button);
    }

    public final void V(Button button, ExtendedProfilePhone extendedProfilePhone, FA.a aVar, Y41.l<? super DeepLink, G0> lVar) {
        com.avito.android.lib.design.button.b.a(button, extendedProfilePhone != null ? getContext().getString(R.string.anonymous_phone_dialog_button_text, extendedProfilePhone.getFormattedPhone()) : null, false);
        if (extendedProfilePhone != null) {
            button.setOnClickListener(new com.avito.android.advert_core.advert.f(lVar, extendedProfilePhone, aVar, this));
        }
    }
}
