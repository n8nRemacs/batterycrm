package com.avito.android.location_picker.providers;

import android.content.res.Resources;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LocationPickerResourceProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/providers/A;", "Lcom/avito/android/location_picker/providers/z;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class A implements z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f182435a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f182436b;

    /* renamed from: c, reason: collision with root package name */
    public final int f182437c;

    /* renamed from: d, reason: collision with root package name */
    public final int f182438d;

    @Inject
    public A(@Y61.k Resources resources, @com.avito.android.location_picker.di.x boolean z12) throws Resources.NotFoundException {
        this.f182435a = resources.getString(R.string.lp_choose_radius_btn_no_adverts);
        this.f182436b = resources.getString(z12 ? R.string.lp_choose_radius_btn_show : R.string.lp_choose_radius_btn_without_update);
        this.f182437c = resources.getDimensionPixelSize(R.dimen.find_me_button_margin_above_radius_list);
        resources.getDimensionPixelSize(R.dimen.location_picker_radius_padding);
        this.f182438d = resources.getDimensionPixelSize(R.dimen.location_picker_radius_offset);
    }

    @Override // com.avito.android.location_picker.providers.z
    /* renamed from: a, reason: from getter */
    public final int getF182438d() {
        return this.f182438d;
    }

    @Override // com.avito.android.location_picker.providers.z
    /* renamed from: b, reason: from getter */
    public final int getF182437c() {
        return this.f182437c;
    }

    @Override // com.avito.android.location_picker.providers.z
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getF182435a() {
        return this.f182435a;
    }

    @Override // com.avito.android.location_picker.providers.z
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getF182436b() {
        return this.f182436b;
    }
}
