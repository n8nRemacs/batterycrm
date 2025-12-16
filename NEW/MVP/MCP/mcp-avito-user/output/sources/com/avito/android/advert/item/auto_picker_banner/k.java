package com.avito.android.advert.item.auto_picker_banner;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.C22763c;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: AutoPickerBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/auto_picker_banner/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/auto_picker_banner/j;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f72991b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f72992c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f72993d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f72994e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Button f72995f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f72996g;

    /* compiled from: Views.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/util/I6", "Landroid/view/View$OnLayoutChangeListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f72997b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f72998c;

        public a(View view, k kVar) {
            this.f72997b = view;
            this.f72998c = kVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(@Y61.l View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            Y41.a<G0> aVar = this.f72998c.f72996g;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f72997b.removeOnLayoutChangeListener(this);
        }
    }

    public k(@Y61.k View view) {
        super(view);
        this.f72991b = (ViewGroup) view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f72992c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f72993d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.auto_picker_logo);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f72994e = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.banner_action);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f72995f = (Button) viewFindViewById4;
        View view2 = this.itemView;
        view2.addOnLayoutChangeListener(new a(view2, this));
    }

    @Override // com.avito.android.advert.item.auto_picker_banner.j
    public final void FE(@Y61.l Y41.a<G0> aVar) {
        D6.a(aVar, this.f72995f);
    }

    @Override // com.avito.android.advert.item.auto_picker_banner.j
    public final void L1() {
        D6.w(this.f72995f);
    }

    @Override // com.avito.android.advert.item.auto_picker_banner.j
    public final void M10(@Y61.k String str, @Y61.l String str2) throws Resources.NotFoundException {
        Button button = this.f72995f;
        D6.H(button);
        button.setText(str);
        if (str2 != null) {
            button.setAppearance(C35835l0.j(com.avito.android.lib.util.f.d(str2), new androidx.appcompat.view.d(this.itemView.getContext(), R.style.Theme_DesignSystem_Re23)));
        }
    }

    @Override // com.avito.android.advert.item.auto_picker_banner.j
    public final void b(@Y61.l String str) {
        I5.a(this.f72992c, str, false);
    }

    @Override // com.avito.android.advert.item.auto_picker_banner.j
    public final void bv(@Y61.k Y41.a<G0> aVar) {
        this.f72996g = aVar;
    }

    @Override // com.avito.android.advert.item.auto_picker_banner.j
    public final void j(@Y61.l String str) {
        I5.a(this.f72993d, str, false);
    }

    @Override // com.avito.android.advert.item.auto_picker_banner.j
    public final void v(@Y61.l UniversalColor universalColor) {
        ViewGroup viewGroup;
        Drawable background;
        if (universalColor == null || (background = (viewGroup = this.f72991b).getBackground()) == null) {
            return;
        }
        Drawable drawableMutate = background.mutate();
        drawableMutate.setColorFilter(C22763c.a(C48063a.f437606a.a(viewGroup.getContext(), universalColor), BlendModeCompat.f44706c));
        viewGroup.setBackground(drawableMutate);
    }

    @Override // com.avito.android.advert.item.auto_picker_banner.j
    public final void zy(@Y61.l Image image) {
        SimpleDraweeView simpleDraweeView = this.f72994e;
        Uri uriD = C35829k2.c(image, simpleDraweeView, 1, 22).d();
        if (uriD == null) {
            D6.w(simpleDraweeView);
            return;
        }
        D6.H(simpleDraweeView);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f(uriD);
        aVarA.c();
    }
}
