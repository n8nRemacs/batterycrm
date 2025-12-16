package com.avito.android.select.sectioned_multiselect.Items.section_item;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.search.filter.adapter.select.m;
import com.avito.android.select.bottom_sheet.blueprints.q;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SectionImageItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/Items/section_item/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/select/bottom_sheet/blueprints/q;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends com.avito.konveyor.adapter.b implements q {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f266334j = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ConstraintLayout f266335b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SimpleDraweeView f266336c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Checkbox f266337d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f266338e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f266339f;

    /* renamed from: g, reason: collision with root package name */
    public final int f266340g;

    /* renamed from: h, reason: collision with root package name */
    public final int f266341h;

    /* renamed from: i, reason: collision with root package name */
    public final int f266342i;

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f266343b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f266344c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Image f266345d;

        public a(View view, h hVar, Image image) {
            this.f266343b = view;
            this.f266344c = hVar;
            this.f266345d = image;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            int i22 = h.f266334j;
            this.f266344c.B80(this.f266345d);
            this.f266343b.removeOnLayoutChangeListener(this);
        }
    }

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.image_select_item_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f266335b = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f266336c = (SimpleDraweeView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.checkbox);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkbox");
        }
        this.f266337d = (Checkbox) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f266338e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.subtitle);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f266339f = (TextView) viewFindViewById5;
        this.f266340g = view.getResources().getColor(R.color.common_black);
        this.f266341h = view.getResources().getColor(R.color.common_gray_54);
        this.f266342i = view.getResources().getColor(R.color.common_warm_gray_24);
    }

    public final void B80(Image image) {
        SimpleDraweeView simpleDraweeView = this.f266336c;
        Uri uriD = C35829k2.c(image, simpleDraweeView, 1, 22).d();
        if (uriD == null) {
            C35949t5.a(simpleDraweeView).b();
            simpleDraweeView.setActualImageResource(R.drawable.ic_image_select_stub);
        } else {
            C35949t5.a(simpleDraweeView).b();
            ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
            aVarA.f(uriD);
            aVarA.c();
        }
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void Kd(boolean z12) {
        D6.G(this.f266337d, z12);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void a(@k Y41.a<G0> aVar) {
        this.f266337d.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(21, aVar));
        this.itemView.setOnClickListener(new m(this, aVar));
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void c3(boolean z12) {
        this.f266337d.setEnabled(z12);
        this.f266335b.setEnabled(z12);
        TextView textView = this.f266339f;
        TextView textView2 = this.f266338e;
        if (z12) {
            textView2.setTextColor(this.f266340g);
            textView.setTextColor(this.f266341h);
        } else {
            int i12 = this.f266342i;
            textView2.setTextColor(i12);
            textView.setTextColor(i12);
        }
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void f(@l String str) {
        I5.a(this.f266339f, str, false);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void l(@l Image image) {
        SimpleDraweeView simpleDraweeView = this.f266336c;
        if (simpleDraweeView.getWidth() > 0) {
            B80(image);
        } else {
            simpleDraweeView.addOnLayoutChangeListener(new a(simpleDraweeView, this, image));
        }
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setChecked(boolean z12) {
        this.f266337d.setChecked(z12);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setTitle(@k String str) {
        this.f266338e.setText(str);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void p0() {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void HC(boolean z12) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void iw(@l BaseListItem.Alignment alignment) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void l00(@k String str) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void s(@k String str) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setImage(int i12) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void gA(@l UniversalImage universalImage, @l Size size) {
    }
}
