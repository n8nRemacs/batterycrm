package com.avito.android.service_booking_day_settings.daysettings;

import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.service_booking_day_settings.daysettings.mvi.entity.DaySettingsState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DaySettingsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements Y41.l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DaySettingsState f276869l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DaySettingsState daySettingsState) {
        super(1);
        this.f276869l = daySettingsState;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        contentPlaceholder2.setImageDrawable(null);
        contentPlaceholder2.setTitle(contentPlaceholder2.getContext().getString(R.string.sb_day_settings_default_error_title));
        contentPlaceholder2.setSubtitle(this.f276869l.f276967d);
        contentPlaceholder2.setButtonTitle(contentPlaceholder2.getContext().getString(R.string.error_layout_refresh));
        return G0.f406611a;
    }
}
