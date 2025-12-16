package com.avito.android.inline_filters.dialog.metro;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import android.view.View;
import com.avito.android.inline_filters.dialog.B;
import com.avito.android.inline_filters.dialog.D;
import com.avito.android.inline_filters.dialog.E;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.remote.model.search.Filter;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MetroSelectFilterView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/metro/h;", "Lcom/avito/android/inline_filters/dialog/B;", "Lcom/avito/android/inline_filters/dialog/E;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements B, E {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final MetroResponseBody f171869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f171870b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.architecture_components.D<List<ParcelableEntity<String>>> f171871c = new com.avito.android.util.architecture_components.D<>();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.util.architecture_components.D<G0> f171872d = new com.avito.android.util.architecture_components.D<>();

    public h(@k View view, @k MetroSelectDialogFragment metroSelectDialogFragment, @l Filter filter, @l MetroResponseBody metroResponseBody, @l SearchParams searchParams) {
        this.f171869a = metroResponseBody;
        this.f171870b = new D(view);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Qd(@k Y41.a<G0> aVar) {
        this.f171870b.Qd(aVar);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Sd(@k Y41.a<G0> aVar) {
        this.f171870b.Sd(aVar);
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void Ud(boolean z12) {
        this.f171870b.Ud(z12);
    }

    @Override // com.avito.android.inline_filters.dialog.E
    @l
    public final Parcelable getState() {
        return null;
    }

    @Override // com.avito.android.inline_filters.dialog.B
    public final void setTitle(@k String str) {
        this.f171870b.setTitle(str);
    }
}
