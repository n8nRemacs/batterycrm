package com.avito.android.extended_profile_universal_widget_edit;

import android.app.Application;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSelectionCreateIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/b;", "Lcom/avito/android/extended_profile_universal_widget_edit/a;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f153659a;

    @Inject
    public b(@Y61.k Application application) {
        this.f153659a = application;
    }

    @Override // com.avito.android.extended_profile_universal_widget_edit.a
    @Y61.k
    public final Intent a(@Y61.k UniversalWidgetEditArguments universalWidgetEditArguments) {
        ExtendedProfileUniversalWidgetActivity.f153646m.getClass();
        Intent intentPutExtra = new Intent(this.f153659a, (Class<?>) ExtendedProfileUniversalWidgetActivity.class).putExtra("extended_profile.universal_widget.edit_section_args", universalWidgetEditArguments).putExtra("extended_profile.universal_widget.screen_name", "extended_profile.universal_widget.edit_section_screen");
        intentPutExtra.setFlags(603979776);
        return intentPutExtra;
    }

    @Override // com.avito.android.extended_profile_universal_widget_edit.a
    @Y61.k
    public final Intent b(@Y61.k UniversalWidgetCreateArguments universalWidgetCreateArguments) {
        ExtendedProfileUniversalWidgetActivity.f153646m.getClass();
        Intent intentPutExtra = new Intent(this.f153659a, (Class<?>) ExtendedProfileUniversalWidgetActivity.class).putExtra("extended_profile.universal_widget.create_args", universalWidgetCreateArguments).putExtra("extended_profile.universal_widget.screen_name", "extended_profile.universal_widget.create_screen");
        intentPutExtra.setFlags(603979776);
        return intentPutExtra;
    }
}
