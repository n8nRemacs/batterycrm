package com.avito.android.extended_profile_selection_create.select.adapter.advert;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.generic.RoundingParams;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SelectionAdvertItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_selection_create/select/adapter/advert/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_selection_create/select/adapter/advert/g;", "_avito_extended-profile-selection-create_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f152055j = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f152056b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f152057c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f152058d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f152059e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f152060f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f152061g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final View f152062h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final com.avito.android.date_time_formatter.c f152063i;

    public h(@k View view, @k com.avito.android.server_time.h hVar, @k Locale locale) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.selection_advert_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f152056b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.selection_advert_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f152057c = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.selection_advert_price);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f152058d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.selection_advert_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f152059e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.selection_advert_date);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f152060f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.selection_advert_checkbox);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f152061g = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.selection_advert_selected_line);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f152062h = viewFindViewById7;
        this.f152063i = new com.avito.android.date_time_formatter.c(hVar, new com.avito.android.date_time_formatter.g(view.getContext().getResources(), 1), locale);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f152056b.setOnClickListener(null);
    }

    @Override // com.avito.android.extended_profile_selection_create.select.adapter.advert.g
    public final void setSelected(boolean z12) {
        this.f152061g.setVisibility(z12 ? 0 : 8);
        this.f152062h.setVisibility(z12 ? 0 : 8);
        int iB2 = z12 ? y6.b(10) : y6.b(0);
        SimpleDraweeView simpleDraweeView = this.f152057c;
        simpleDraweeView.setPadding(iB2, iB2, iB2, iB2);
        simpleDraweeView.getHierarchy().s(RoundingParams.b(z12 ? y6.b(24) : y6.a(16.0f)));
    }

    @Override // com.avito.android.extended_profile_selection_create.select.adapter.advert.g
    public final void u80(@k SelectionAdvertItem selectionAdvertItem, @k Y41.a<G0> aVar) {
        Image image = selectionAdvertItem.f152039e;
        C35949t5.c(this.f152057c, image != null ? com.avito.android.image_loader.b.b(image) : null, null, null, null, 14);
        I5.a(this.f152058d, selectionAdvertItem.f152042h, false);
        I5.a(this.f152059e, selectionAdvertItem.f152040f, false);
        long j12 = selectionAdvertItem.f152041g;
        I5.a(this.f152060f, j12 > 0 ? this.f152063i.a(Long.valueOf(j12), TimeUnit.SECONDS) : null, false);
        this.f152056b.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(12, aVar));
    }
}
