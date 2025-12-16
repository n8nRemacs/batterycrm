package com.avito.android.advert_details_items.description;

import Y61.k;
import Y61.l;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.ExpandablePanelLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsDescriptionView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/description/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/description/f;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ExpandablePanelLayout f84635b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f84636c;

    /* renamed from: d, reason: collision with root package name */
    public final int f84637d;

    public h(@k View view) {
        super(view);
        this.f84635b = (ExpandablePanelLayout) view.findViewById(R.id.description_root);
        this.f84636c = (TextView) view.findViewById(R.id.expandable_panel_expand_button);
        this.f84637d = C35835l0.d(R.attr.gray48, view.getContext());
    }

    @Override // com.avito.android.advert_details_items.description.f
    @l
    public final Parcelable d0() {
        return this.f84635b.onSaveInstanceState();
    }

    @Override // com.avito.android.advert_details_items.description.f
    public final void xJ(@l AdvertDetailsDescriptionItem advertDetailsDescriptionItem, @l d dVar) {
        View view;
        Parcelable parcelable;
        if (advertDetailsDescriptionItem != null) {
            boolean z12 = advertDetailsDescriptionItem.f84613l;
            TextView textView = this.f84636c;
            textView.setPaintFlags(z12 ? textView.getPaintFlags() | 8 : textView.getPaintFlags() & 8);
        }
        ExpandablePanelLayout expandablePanelLayout = this.f84635b;
        if (advertDetailsDescriptionItem != null && (parcelable = advertDetailsDescriptionItem.f84607f) != null) {
            expandablePanelLayout.onRestoreInstanceState(parcelable);
        }
        expandablePanelLayout.setCollapsedLineCount(advertDetailsDescriptionItem != null ? Integer.valueOf(advertDetailsDescriptionItem.f84608g) : null);
        expandablePanelLayout.setOnExpandListener(new g(dVar, this));
        if (advertDetailsDescriptionItem != null && advertDetailsDescriptionItem.f84606e && (view = expandablePanelLayout.f318588e) != null) {
            view.setVisibility(0);
        }
        ExpandablePanelLayout.b(expandablePanelLayout, advertDetailsDescriptionItem != null ? advertDetailsDescriptionItem.f84605d : null);
    }

    @Override // com.avito.android.advert_details_items.description.f
    public final void y1() {
        int i12 = this.f84637d;
        ExpandablePanelLayout expandablePanelLayout = this.f84635b;
        expandablePanelLayout.setTextColor(i12);
        expandablePanelLayout.a(false);
    }
}
