package com.avito.android.beduin.common.component.ratio_image;

import Ui.InterfaceC15523b;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.image.BeduinImageScaleType;
import com.avito.android.beduin.common.component.image.ImageStyle;
import com.avito.android.beduin.common.component.j;
import com.avito.android.beduin.common.utils.B;
import com.avito.android.beduin.common.utils.H;
import com.avito.android.beduin.common.utils.J;
import com.avito.android.beduin.common.utils.s;
import com.avito.android.beduin.common.utils.u;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.n;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: BeduinRatioImageComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/ratio_image/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/ratio_image/BeduinRatioImageModel;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinRatioImageModel, SimpleDraweeView> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f102263e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinRatioImageModel f102264f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f102265g = true;

    /* compiled from: BeduinRatioImageComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/ratio_image/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.ratio_image.a$a, reason: collision with other inner class name */
    public static final class C3063a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f102266a = Collections.singletonList("ratioImage");

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Class<? extends BeduinModel> f102267b = BeduinRatioImageModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return this.f102267b;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return this.f102266a;
        }
    }

    public a(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinRatioImageModel beduinRatioImageModel) {
        this.f102263e = interfaceC15523b;
        this.f102264f = beduinRatioImageModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f102264f;
    }

    @Override // ej.AbstractC40112a
    /* renamed from: k, reason: from getter */
    public final boolean getF102207l() {
        return this.f102265g;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(viewGroup.getContext());
        simpleDraweeView.setId(View.generateViewId());
        if (layoutParams.width == -2) {
            layoutParams.width = -1;
        }
        layoutParams.height = -2;
        simpleDraweeView.setLayoutParams(layoutParams);
        return simpleDraweeView;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        Image image;
        UniversalColor errorColor;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view;
        BeduinRatioImageModel beduinRatioImageModel = this.f102264f;
        simpleDraweeView.setTag(R.id.image, beduinRatioImageModel.getId());
        simpleDraweeView.setAspectRatio(beduinRatioImageModel.getRatio());
        if (beduinRatioImageModel.getMargin() != null) {
            J.b(simpleDraweeView, beduinRatioImageModel.getMargin());
        } else if (this.f395326d) {
            D6.b(simpleDraweeView, Integer.valueOf(this.f395324b), 0, Integer.valueOf(this.f395325c), 0);
        } else {
            D6.b(simpleDraweeView, 0, 0, 0, 0);
        }
        GW0.b bVar = new GW0.b(simpleDraweeView.getResources());
        UniversalImage universalImage = beduinRatioImageModel.getUniversalImage();
        if (universalImage == null || (image = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))) == null) {
            image = beduinRatioImageModel.getImage();
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(n.a(image));
        u.a(aVarA, beduinRatioImageModel.getStyle(), simpleDraweeView.getContext());
        aVarA.f169500r = false;
        B.b(simpleDraweeView, beduinRatioImageModel.getStyle(), aVarA);
        ImageStyle style = beduinRatioImageModel.getStyle();
        Context context = simpleDraweeView.getContext();
        if (style == null || (errorColor = style.getErrorColor()) == null) {
            bVar.f6543h = null;
        } else {
            bVar.f6543h = H.a(context, errorColor);
        }
        s.a(bVar, beduinRatioImageModel.getStyle(), simpleDraweeView.getContext());
        BeduinImageScaleType scaleType = beduinRatioImageModel.getScaleType();
        if (scaleType == null) {
            scaleType = BeduinImageScaleType.FILL;
        }
        bVar.f6547l = scaleType.a();
        simpleDraweeView.setHierarchy(bVar.a());
        aVarA.c();
        j.a(simpleDraweeView, beduinRatioImageModel.getActions(), this.f102263e);
    }
}
