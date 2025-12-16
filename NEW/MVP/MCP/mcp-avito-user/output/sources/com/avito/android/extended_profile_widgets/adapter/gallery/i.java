package com.avito.android.extended_profile_widgets.adapter.gallery;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.tns_gallery.r;
import com.avito.android.tns_gallery.t;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GalleryItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/gallery/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/gallery/h;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f154406b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final t f154407c;

    public i(@k Activity activity, @k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.extended_gallery_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154406b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_gallery_images);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        Resources resources = recyclerView.getResources();
        int iB2 = kotlin.math.b.b(resources.getDimension(R.dimen.extended_profile_gallery_base_height));
        int iB3 = kotlin.math.b.b(resources.getDimension(R.dimen.extended_profile_gallery_space_between_items));
        int iB4 = kotlin.math.b.b(resources.getDimension(R.dimen.extended_profile_widget_horizontal_margin));
        this.f154407c = new t(recyclerView, activity, new r(Integer.valueOf(iB2), Integer.valueOf(kotlin.math.b.b(resources.getDimension(R.dimen.extended_profile_widget_horizontal_margin))), Integer.valueOf(iB4), Integer.valueOf(iB3), 0, 0, 48, null));
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.gallery.h
    public final void GO(@l String str) {
        I5.a(this.f154406b, str, false);
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.gallery.h
    @k
    /* renamed from: Z2, reason: from getter */
    public final t getF154407c() {
        return this.f154407c;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f154407c.d();
    }
}
