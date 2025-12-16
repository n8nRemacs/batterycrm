package com.avito.android.advert.item.compatibility.v4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.advert.item.spare_parts.data.CompatibilityV4Info;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.q;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: GarageCompatibilityV4View.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v4/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/compatibility/v4/l;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f74560b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f74561c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f74562d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f74563e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f74564f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f74565g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ImageView f74566h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f74567i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Button f74568j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Context f74569k;

    public n(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.loading);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f74560b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f74561c = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.banner);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f74562d = (ConstraintLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.left_image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f74563e = (SimpleDraweeView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74564f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.subtitle);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74565g = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.right_image);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f74566h = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.disclaimer);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74567i = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.button_primary);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f74568j = (Button) viewFindViewById9;
        this.f74569k = view.getContext();
    }

    @Override // com.avito.android.advert.item.compatibility.v4.l
    public final void C0() {
        D6.w(this.f74560b);
        D6.H(this.f74561c);
    }

    @Override // com.avito.android.advert.item.compatibility.v4.l
    public final void c0() {
        D6.H(this.f74560b);
        D6.w(this.f74561c);
    }

    @Override // com.avito.android.advert.item.compatibility.v4.l
    public final void hide() {
        D6.w(this.f74560b);
        D6.w(this.f74561c);
    }

    @Override // com.avito.android.advert.item.compatibility.v4.l
    public final void lm(@Y61.k CompatibilityV4Info compatibilityV4Info, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        G0 g02;
        Integer numA;
        Image imageDependsOnThemeOrDefault;
        I5.a(this.f74564f, compatibilityV4Info.f80423b, false);
        I5.a(this.f74565g, compatibilityV4Info.f80424c, false);
        I5.a(this.f74567i, compatibilityV4Info.f80429h, false);
        SimpleDraweeView simpleDraweeView = this.f74563e;
        v.b(simpleDraweeView, R.dimen.garage_compatibility_item_v4_image_corner_radius);
        Drawable drawableL = null;
        Button button = this.f74568j;
        CompatibilityV4Info.GarageCompatibilityButton garageCompatibilityButton = compatibilityV4Info.f80428g;
        if (garageCompatibilityButton != null) {
            com.avito.android.lib.design.button.b.a(button, garageCompatibilityButton.f80430b, false);
            DeepLink deepLink = garageCompatibilityButton.f80431c;
            D6.a(deepLink != null ? new m(lVar, deepLink) : null, button);
        } else {
            D6.w(button);
        }
        Context context = this.f74569k;
        UniversalImage universalImage = compatibilityV4Info.f80425d;
        if (universalImage == null || (imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))) == null) {
            g02 = null;
        } else {
            ImageRequest.a aVar = new ImageRequest.a(new DM.a(simpleDraweeView));
            Drawable drawableA = C43852a.a(context, R.drawable.ic_garage_compatibility_placeholder);
            ImageRequest.ScaleType scaleType = ImageRequest.ScaleType.f169473d;
            aVar.f169492j = drawableA;
            aVar.f169493k = scaleType;
            aVar.d(com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault));
            aVar.f169486d = true;
            aVar.c();
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            simpleDraweeView.setImageResource(R.drawable.ic_garage_compatibility_placeholder);
            D6.H(simpleDraweeView);
        }
        DeepLink deepLink2 = compatibilityV4Info.f80427f;
        Drawable drawableH = deepLink2 != null ? C35835l0.h(android.R.attr.selectableItemBackground, context) : null;
        ConstraintLayout constraintLayout = this.f74562d;
        constraintLayout.setForeground(drawableH);
        D6.a(deepLink2 != null ? new m(lVar, deepLink2) : null, constraintLayout);
        v.b(constraintLayout, R.dimen.garage_compatibility_item_v4_corner_radius);
        String str = compatibilityV4Info.f80426e;
        if (str != null && (numA = q.a(str)) != null) {
            drawableL = C35835l0.l(C35835l0.h(numA.intValue(), context), C35835l0.d(R.attr.black, context));
        }
        this.f74566h.setImageDrawable(drawableL);
    }
}
