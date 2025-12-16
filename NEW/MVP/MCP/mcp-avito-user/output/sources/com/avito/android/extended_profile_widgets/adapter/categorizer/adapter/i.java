package com.avito.android.extended_profile_widgets.adapter.categorizer.adapter;

import Y61.k;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CategorizerSnippetItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/categorizer/adapter/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/extended_profile_widgets/adapter/categorizer/adapter/h;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f154328f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f154329b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ViewGroup f154330c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f154331d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f154332e;

    public i(@k View view) {
        super(view);
        this.f154329b = view;
        View viewFindViewById = view.findViewById(R.id.extended_profile_categorizer_snippet_item_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f154330c = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_categorizer_snippet_item_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f154331d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.extended_profile_categorizer_snippet_item_image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f154332e = (SimpleDraweeView) viewFindViewById3;
    }

    @Override // com.avito.android.extended_profile_widgets.adapter.categorizer.adapter.h
    public final void WI(@k CategorizerSnippetItem categorizerSnippetItem, @k Y41.a<G0> aVar) {
        Integer numA;
        Image imageQ;
        I5.a(this.f154331d, categorizerSnippetItem.f154317c, false);
        View view = this.f154329b;
        UniversalImage universalImage = categorizerSnippetItem.f154320f;
        if (universalImage != null && (imageQ = com.avito.android.actions_sheet.a.q(view, universalImage)) != null) {
            C35949t5.c(this.f154332e, com.avito.android.image_loader.b.b(imageQ), null, null, null, 14);
            this.f154332e.getHierarchy().n(new j());
        }
        String str = categorizerSnippetItem.f154319e;
        if (str != null && (numA = com.avito.android.lib.util.e.a(str)) != null) {
            this.f154330c.setBackgroundTintList(ColorStateList.valueOf(C35835l0.d(numA.intValue(), view.getContext())));
        }
        view.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.development_tooltip_table.h(29, aVar));
    }
}
