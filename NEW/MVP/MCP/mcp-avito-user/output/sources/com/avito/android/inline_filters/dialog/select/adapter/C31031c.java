package com.avito.android.inline_filters.dialog.select.adapter;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalCheckedImage;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35949t5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFiltersDialogBrandspaceItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/c;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/inline_filters/dialog/select/adapter/m;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.inline_filters.dialog.select.adapter.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31031c extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f172073e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f172074b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f172075c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f172076d;

    public C31031c(@Y61.k View view) {
        super(view);
        this.f172074b = view;
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f172075c = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f172076d = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void MY(@Y61.l String str) {
        if (str != null) {
            ImageRequest.a aVarA = C35949t5.a(this.f172075c);
            aVarA.f(Uri.parse(str));
            aVarA.c();
        }
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f172074b.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(15, aVar));
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void setText(@Y61.k String str) {
        this.f172076d.setText(str);
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void Kd(boolean z12) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void ZH(@Y61.k Y41.a<G0> aVar) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void gE(@Y61.l String str) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void l(@Y61.l Image image) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void setChecked(boolean z12) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void setIcon(@Y61.l Drawable drawable) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void UV(@Y61.l UniversalCheckedImage universalCheckedImage, @Y61.l String str) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void rF(@Y61.l Boolean bool, @Y61.l UniversalImage universalImage) {
    }
}
