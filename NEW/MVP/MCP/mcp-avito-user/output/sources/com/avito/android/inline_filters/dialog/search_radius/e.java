package com.avito.android.inline_filters.dialog.search_radius;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.avito.android.inline_filters.dialog.B;
import com.avito.android.inline_filters.dialog.D;
import com.avito.android.inline_filters.dialog.E;
import com.avito.android.location_picker.analytics.LocationPickerScreenOpenEvent;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.SearchParams;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LocationPickerFilterView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/search_radius/e;", "Lcom/avito/android/inline_filters/dialog/B;", "Lcom/avito/android/inline_filters/dialog/E;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements B, E {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D f171997a;

    public e(@k View view, @k Fragment fragment, @l SearchParams searchParams, @l Radius radius, @l LocationPickerScreenOpenEvent.EventSource eventSource, @l String str) {
        this.f171997a = new D(view);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Qd(@k Y41.a<G0> aVar) {
        this.f171997a.Qd(aVar);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Rd(boolean z12) {
        this.f171997a.Rd(z12);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Sd(@k Y41.a<G0> aVar) {
        this.f171997a.Sd(aVar);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Ud(boolean z12) {
        this.f171997a.Ud(z12);
    }

    @Override // com.avito.android.inline_filters.dialog.E
    @l
    /* renamed from: getState */
    public final Parcelable getF171936c() {
        return null;
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void setTitle(@k String str) {
        this.f171997a.setTitle(str);
    }

    public /* synthetic */ e(View view, Fragment fragment, SearchParams searchParams, Radius radius, LocationPickerScreenOpenEvent.EventSource eventSource, String str, int i12, C42822w c42822w) {
        this(view, fragment, searchParams, radius, eventSource, (i12 & 32) != 0 ? null : str);
    }
}
