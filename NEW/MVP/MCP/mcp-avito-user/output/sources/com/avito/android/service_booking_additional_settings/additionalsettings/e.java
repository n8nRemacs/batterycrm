package com.avito.android.service_booking_additional_settings.additionalsettings;

import Os0.InterfaceC14732a;
import android.net.Uri;
import android.view.View;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.service_booking_additional_settings.additionalsettings.ServiceBookingAdditionalSettingsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f274947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f274948c;

    public /* synthetic */ e(Object obj, int i12) {
        this.f274947b = i12;
        this.f274948c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f274947b) {
            case 0:
                ((ServiceBookingAdditionalSettingsFragment.d) ((f) this.f274948c).f274950b).invoke(new InterfaceC14732a.g(new WebViewLink.OnlyAvitoDomain(Uri.parse("https://support.avito.ru/articles/2796"), null, null, 6, null)));
                break;
            case 1:
                ((f) this.f274948c).f274950b.invoke(InterfaceC14732a.b.f12632a);
                break;
            default:
                ((Y41.l) this.f274948c).invoke(InterfaceC14732a.C0814a.f12631a);
                break;
        }
    }
}
