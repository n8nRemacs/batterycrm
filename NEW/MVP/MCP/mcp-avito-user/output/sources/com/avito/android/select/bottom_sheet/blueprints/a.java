package com.avito.android.select.bottom_sheet.blueprints;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.list_item.BaseListItem;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.lib.design.toggle.RadioButton;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CheckableImageItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/a;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/select/bottom_sheet/blueprints/q;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends com.avito.konveyor.adapter.b implements q {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f265034g = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f265035b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RadioButton f265036c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Checkbox f265037d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f265038e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f265039f;

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.select.bottom_sheet.blueprints.a$a, reason: collision with other inner class name */
    public static final class ViewOnLayoutChangeListenerC7914a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f265040b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f265041c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Image f265042d;

        public ViewOnLayoutChangeListenerC7914a(View view, a aVar, Image image) {
            this.f265040b = view;
            this.f265041c = aVar;
            this.f265042d = image;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            int i22 = a.f265034g;
            this.f265041c.B80(this.f265042d);
            this.f265040b.removeOnLayoutChangeListener(this);
        }
    }

    public a(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f265035b = (SimpleDraweeView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.radio_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.RadioButton");
        }
        this.f265036c = (RadioButton) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.checkbox);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkbox");
        }
        this.f265037d = (Checkbox) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f265038e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.subtitle);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f265039f = (TextView) viewFindViewById5;
    }

    public final void B80(Image image) {
        SimpleDraweeView simpleDraweeView = this.f265035b;
        Uri uriD = C35829k2.c(image, simpleDraweeView, 1, 22).d();
        if (uriD == null) {
            simpleDraweeView.setActualImageResource(R.drawable.ic_image_select_stub);
            return;
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f(uriD);
        aVarA.c();
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void Kd(boolean z12) {
        D6.G(this.f265036c, !z12);
        D6.G(this.f265037d, z12);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f265036c.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(16, aVar));
        this.f265037d.setOnClickListener(new com.avito.android.profile_settings_extended.adapter.phones.l(17, aVar));
        this.itemView.setOnClickListener(new com.avito.android.search.filter.adapter.select.m(this, aVar));
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void c3(boolean z12) {
        this.f265036c.setEnabled(z12);
        this.f265037d.setEnabled(z12);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void f(@Y61.l String str) {
        I5.a(this.f265039f, str, false);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void l(@Y61.l Image image) {
        SimpleDraweeView simpleDraweeView = this.f265035b;
        if (simpleDraweeView.getWidth() > 0) {
            B80(image);
        } else {
            simpleDraweeView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC7914a(simpleDraweeView, this, image));
        }
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setChecked(boolean z12) {
        this.f265036c.setChecked(z12);
        this.f265037d.setChecked(z12);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setTitle(@Y61.k String str) {
        this.f265038e.setText(str);
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void p0() {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void HC(boolean z12) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void iw(@Y61.l BaseListItem.Alignment alignment) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void l00(@Y61.k String str) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void s(@Y61.k String str) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void setImage(int i12) {
    }

    @Override // com.avito.android.select.bottom_sheet.blueprints.q
    public final void gA(@Y61.l UniversalImage universalImage, @Y61.l Size size) {
    }
}
