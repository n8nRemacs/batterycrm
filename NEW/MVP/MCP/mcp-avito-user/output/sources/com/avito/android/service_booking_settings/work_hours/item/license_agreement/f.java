package com.avito.android.service_booking_settings.work_hours.item.license_agreement;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LicenseAgreementItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_settings/work_hours/item/license_agreement/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/service_booking_settings/work_hours/item/license_agreement/e;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f277975b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f277976c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final TextView f277977d;

    public f(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f277975b = view;
        this.f277976c = aVar;
        TextView textView = view instanceof TextView ? (TextView) view : null;
        this.f277977d = textView;
        if (textView == null) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.service_booking_settings.work_hours.item.license_agreement.e
    public final void r(@l AttributedText attributedText) {
        CharSequence charSequenceC;
        TextView textView = this.f277977d;
        if (textView != null) {
            if (attributedText != null) {
                charSequenceC = this.f277976c.c(this.f277975b.getContext(), attributedText);
            } else {
                charSequenceC = null;
            }
            I5.a(textView, charSequenceC, false);
        }
    }
}
