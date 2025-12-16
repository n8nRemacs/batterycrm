package com.avito.android.services_transportation_widget.dialog;

import Av0.C13085a;
import Y61.k;
import android.app.Activity;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.location.r;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.services_transportation_widget.location_sheet.ServiceTransportationLocationSheet;
import com.avito.android.util.I5;
import com.avito.android.util.R0;
import com.avito.android.util.text.j;
import java.lang.ref.WeakReference;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceTransportationWidgetDialogResolver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/services_transportation_widget/dialog/f;", "Lcom/avito/android/services_transportation_widget/dialog/a;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final r f280503a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final WeakReference<Activity> f280504b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f280505c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final R0 f280506d;

    @Inject
    public f(@k r rVar, @k WeakReference<Activity> weakReference, @k com.avito.android.util.text.a aVar, @k R0 r02) {
        this.f280503a = rVar;
        this.f280504b = weakReference;
        this.f280505c = aVar;
        this.f280506d = r02;
    }

    @Override // com.avito.android.services_transportation_widget.dialog.a
    public final void a(@k ServiceTransportationWidget.Field field, @k com.avito.android.offlinization.ui.a aVar) {
        ServiceTransportationWidget.DisclaimerField.DisclaimerSheet disclaimerSheet;
        Activity activity;
        FragmentManager supportFragmentManager;
        boolean z12 = field instanceof ServiceTransportationWidget.LocationField;
        WeakReference<Activity> weakReference = this.f280504b;
        if (z12) {
            ServiceTransportationWidget.LocationField locationField = (ServiceTransportationWidget.LocationField) field;
            Activity activity2 = weakReference.get();
            ActivityC22955m activityC22955m = activity2 instanceof ActivityC22955m ? (ActivityC22955m) activity2 : null;
            if (activityC22955m == null || (supportFragmentManager = activityC22955m.getSupportFragmentManager()) == null) {
                return;
            }
            String hint = locationField.getHint();
            String str = hint == null ? "" : hint;
            String displayTitle = locationField.getDisplayTitle();
            ServiceTransportationLocationSheet serviceTransportationLocationSheet = new com.avito.android.services_transportation_widget.location_sheet.b(str, displayTitle == null ? "" : displayTitle, this.f280503a, supportFragmentManager, new c(aVar, locationField), d.f280500l).f280675d;
            if ((serviceTransportationLocationSheet == null || !serviceTransportationLocationSheet.isAdded()) && serviceTransportationLocationSheet != null) {
                serviceTransportationLocationSheet.show(supportFragmentManager, "tag.suggest_location_dialog_fragment");
                return;
            }
            return;
        }
        if (field instanceof ServiceTransportationWidget.SelectField) {
            ServiceTransportationWidget.SelectField selectField = (ServiceTransportationWidget.SelectField) field;
            List<ServiceTransportationWidget.SelectField.SelectValue> values = selectField.getValues();
            if (values == null || (activity = weakReference.get()) == null) {
                return;
            }
            String hint2 = selectField.getHint();
            com.avito.android.lib.util.g.a(new com.avito.android.services_transportation_widget.select_sheet.d(activity, hint2 != null ? hint2 : "", values, new e(aVar, selectField)));
            return;
        }
        if (field instanceof ServiceTransportationWidget.DisclaimerField) {
            ServiceTransportationWidget.DisclaimerField disclaimerField = (ServiceTransportationWidget.DisclaimerField) field;
            Activity activity3 = weakReference.get();
            if (activity3 == null || (disclaimerSheet = disclaimerField.getDisclaimerSheet()) == null) {
                return;
            }
            i iVar = new i(AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, activity3, Integer.valueOf(R.style.Theme_DesignSystem_Re23)), this.f280505c);
            String title = disclaimerSheet.getTitle();
            AttributedText description = disclaimerSheet.getDescription();
            String buttonTitle = disclaimerSheet.getButtonTitle();
            I5.a(iVar.f280511F, title, false);
            j.a(iVar.f280512G, description, iVar.f280510E);
            com.avito.android.lib.design.button.b.a(iVar.f280513H, buttonTitle, false);
            com.avito.android.lib.util.g.a(iVar);
            return;
        }
        if (!(field instanceof ServiceTransportationWidget.CardSelectField)) {
            if (field instanceof ServiceTransportationWidget.SwitchGroupField ? true : field instanceof ServiceTransportationWidget.EmptyPriceField) {
                return;
            }
            boolean z13 = field instanceof ServiceTransportationWidget.PriceField;
            return;
        }
        ServiceTransportationWidget.CardSelectField cardSelectField = (ServiceTransportationWidget.CardSelectField) field;
        List<ServiceTransportationWidget.CardSelectField.CardSelectValue> values2 = cardSelectField.getValues();
        Activity activity4 = weakReference.get();
        if (activity4 == null) {
            return;
        }
        com.avito.android.services_transportation_widget.cargo_capacity_sheet.e eVar = new com.avito.android.services_transportation_widget.cargo_capacity_sheet.e(this.f280506d, new C13085a(), values2, cardSelectField.getSelectedValue(), new b(aVar, cardSelectField));
        String hint3 = cardSelectField.getHint();
        com.avito.android.lib.util.g.a(new com.avito.android.services_transportation_widget.cargo_capacity_sheet.j(activity4, hint3 != null ? hint3 : "", cardSelectField.getSelectButtonTitle(), eVar));
    }
}
