package com.avito.android.extended_profile_universal_widget_edit.create.adapter.section;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalWidgetCreateSectionItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/create/adapter/section/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/adapter/section/g;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f153691e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f153692b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f153693c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f153694d;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.extended_profile_universal_widget_create_section_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f153692b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_universal_widget_create_section_preview);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f153693c = (SimpleDraweeView) viewFindViewById2;
        this.f153694d = view.findViewById(R.id.extended_profile_universal_widget_create_section_item_root);
    }

    @Override // com.avito.android.extended_profile_universal_widget_edit.create.adapter.section.g
    public final void AY(@k UniversalWidgetCreateSectionItem universalWidgetCreateSectionItem, @k Y41.a<G0> aVar) {
        I5.a(this.f153692b, universalWidgetCreateSectionItem.f153678c, false);
        boolean zA2 = com.avito.android.lib.util.darkTheme.c.a(this.f153693c.getContext());
        Image image = universalWidgetCreateSectionItem.f153679d;
        Image image2 = universalWidgetCreateSectionItem.f153680e;
        if (!zA2 ? image == null : image2 != null) {
            image = image2;
        }
        C35949t5.c(this.f153693c, com.avito.android.image_loader.b.b(image), null, null, null, 14);
        this.f153694d.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(21, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f153694d.setOnClickListener(null);
    }
}
