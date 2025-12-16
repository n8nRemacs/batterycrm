package com.avito.android.inline_filters.dialog.select.adapter;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.lib.design.toggle.RadioButton;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalCheckedImage;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InlineFiltersDialogImageSelectItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/inline_filters/dialog/select/adapter/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/inline_filters/dialog/select/adapter/m;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f172082g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f172083b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RadioButton f172084c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Checkbox f172085d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f172086e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f172087f;

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f172088b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f172089c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Image f172090d;

        public a(View view, g gVar, Image image) {
            this.f172088b = view;
            this.f172089c = gVar;
            this.f172090d = image;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            int i22 = g.f172082g;
            this.f172089c.B80(this.f172090d);
            this.f172088b.removeOnLayoutChangeListener(this);
        }
    }

    public g(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f172083b = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.radio_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.RadioButton");
        }
        this.f172084c = (RadioButton) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.checkbox);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkbox");
        }
        this.f172085d = (Checkbox) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f172086e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.subtitle);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f172087f = (TextView) viewFindViewById5;
    }

    public final void B80(Image image) {
        SimpleDraweeView simpleDraweeView = this.f172083b;
        Uri uriD = C35829k2.c(image, simpleDraweeView, 1, 22).d();
        if (uriD == null) {
            simpleDraweeView.setActualImageResource(R.drawable.ic_image_select_stub);
            return;
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f(uriD);
        aVarA.c();
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void Kd(boolean z12) {
        D6.G(this.f172084c, !z12);
        D6.G(this.f172085d, z12);
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f172084c.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(16, aVar));
        this.f172085d.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(17, aVar));
        this.itemView.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(26, this, aVar));
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void gE(@Y61.l String str) {
        I5.a(this.f172087f, str, false);
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void l(@Y61.l Image image) {
        SimpleDraweeView simpleDraweeView = this.f172083b;
        if (simpleDraweeView.getWidth() > 0) {
            B80(image);
        } else {
            simpleDraweeView.addOnLayoutChangeListener(new a(simpleDraweeView, this, image));
        }
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void setChecked(boolean z12) {
        this.f172084c.setChecked(z12);
        this.f172085d.setChecked(z12);
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void setText(@Y61.k String str) {
        this.f172086e.setText(str);
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void MY(@Y61.l String str) {
    }

    @Override // com.avito.android.inline_filters.dialog.select.adapter.m
    public final void ZH(@Y61.k Y41.a<G0> aVar) {
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
