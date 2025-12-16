package com.avito.android.inline_filters.dialog.calendar.deeplink;

import androidx.fragment.app.DialogFragment;
import com.avito.android.inline_filters.calendar.deeplink.FiltersCalendarPickerDeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FiltersCalendarPickerDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/fragment/app/DialogFragment;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class a extends N implements Y41.a<DialogFragment> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f171198l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FiltersCalendarPickerDeepLink f171199m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, FiltersCalendarPickerDeepLink filtersCalendarPickerDeepLink) {
        super(0);
        this.f171198l = bVar;
        this.f171199m = filtersCalendarPickerDeepLink;
    }

    @Override // Y41.a
    public final DialogFragment invoke() {
        EN.a aVar = this.f171198l.f171200g;
        FiltersCalendarPickerDeepLink filtersCalendarPickerDeepLink = this.f171199m;
        return aVar.a(filtersCalendarPickerDeepLink.f171065b, filtersCalendarPickerDeepLink.f171066c);
    }
}
