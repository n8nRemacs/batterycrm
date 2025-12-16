package com.avito.android.beduin.common.component.image;

import Ui.InterfaceC15523b;
import Y61.k;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.j;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin.common.utils.B;
import com.avito.android.beduin.common.utils.H;
import com.avito.android.beduin.common.utils.u;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.n;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.y6;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinImageComponent.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/image/c;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/image/BeduinImageModel;", "Lcom/avito/android/beduin/common/component/image/a;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c extends com.avito.android.beduin.common.component.h<BeduinImageModel, com.avito.android.beduin.common.component.image.a> {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f101453e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final BeduinImageModel f101454f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f101455g;

    /* compiled from: BeduinImageComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/image/c$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.beduin.common.component.b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f101456a = Collections.singletonList("image");

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Class<? extends BeduinModel> f101457b = BeduinImageModel.class;

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return this.f101457b;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return this.f101456a;
        }
    }

    public c(@k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinImageModel beduinImageModel, boolean z12) {
        this.f101453e = interfaceC15523b;
        this.f101454f = beduinImageModel;
        this.f101455g = z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.drawable.Drawable u(android.content.Context r12, com.avito.android.beduin.common.component.image.BeduinImageModel r13) {
        /*
            com.avito.android.beduin.common.component.image.ImageStyle r0 = r13.getStyle()
            com.avito.android.beduin.common.component.model.icon.LocalIcon r1 = r13.getLocalImage()
            r2 = 0
            if (r0 == 0) goto L16
            com.avito.android.beduin.common.container.Corners r3 = r0.getCorners()
            if (r3 == 0) goto L16
            java.lang.Integer r3 = r3.g()
            goto L17
        L16:
            r3 = r2
        L17:
            r4 = 0
            if (r1 == 0) goto L85
            java.lang.String r1 = r1.getName()
            if (r1 != 0) goto L22
            goto L85
        L22:
            java.lang.String r5 = "developmentOfferGradient158x110"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L36
            r1 = 2130971309(0x7f040aad, float:1.7551353E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.avito.android.lib.design.gradient.a r1 = com.avito.android.beduin.common.component.image.g.b(r1, r12, r3)
            goto L86
        L36:
            java.lang.String r5 = "developmentMortgageGradient158x110"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L4a
            r1 = 2130971295(0x7f040a9f, float:1.7551324E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.avito.android.lib.design.gradient.a r1 = com.avito.android.beduin.common.component.image.g.b(r1, r12, r3)
            goto L86
        L4a:
            java.lang.Integer r5 = com.avito.android.lib.util.f.h(r1)
            if (r5 == 0) goto L76
            int r8 = r5.intValue()
            com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable r1 = new com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable
            com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable$a$a r5 = new com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable$a$a
            r11 = 0
            r9 = 0
            r10 = 4
            r6 = r5
            r7 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            if (r3 == 0) goto L67
            int r3 = r3.intValue()
            goto L68
        L67:
            r3 = r4
        L68:
            int r3 = com.avito.android.util.y6.b(r3)
            r5.f179264a = r3
            com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable$a r3 = r5.a()
            r1.<init>(r3)
            goto L86
        L76:
            java.lang.Integer r1 = com.avito.android.lib.util.f.i(r1)
            if (r1 == 0) goto L81
            com.avito.android.lib.design.gradient.a r1 = com.avito.android.beduin.common.component.image.g.b(r1, r12, r3)
            goto L82
        L81:
            r1 = r2
        L82:
            if (r1 == 0) goto L85
            goto L86
        L85:
            r1 = r2
        L86:
            if (r1 != 0) goto Lbd
            com.avito.android.beduin.common.component.model.icon.LocalIcon r13 = r13.getLocalImage()
            android.graphics.drawable.Drawable r13 = com.avito.android.beduin.common.utils.v.c(r12, r13, r2)
            if (r13 == 0) goto Lbe
            if (r0 == 0) goto L99
            java.lang.Integer r1 = r0.getCornerRadius()
            goto L9a
        L99:
            r1 = r2
        L9a:
            if (r1 != 0) goto Lad
            if (r0 == 0) goto La2
            com.avito.android.beduin.common.component.image.BorderStyle r2 = r0.getBorder()
        La2:
            if (r2 == 0) goto Lab
            com.avito.android.beduin.common.component.image.OverlayStyle r0 = r0.getOverlay()
            if (r0 != 0) goto Lab
            goto Lad
        Lab:
            r2 = r13
            goto Lbe
        Lad:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r12 = r12.getResources()
            r1 = 7
            android.graphics.Bitmap r13 = androidx.core.graphics.drawable.d.b(r4, r4, r1, r13)
            r0.<init>(r12, r13)
            r2 = r0
            goto Lbe
        Lbd:
            r2 = r1
        Lbe:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.beduin.common.component.image.c.u(android.content.Context, com.avito.android.beduin.common.component.image.BeduinImageModel):android.graphics.drawable.Drawable");
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f101454f;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        BeduinComponentTheme theme = this.f101454f.getTheme();
        com.avito.android.beduin.common.component.image.a aVar = new com.avito.android.beduin.common.component.image.a(theme != null ? new ContextThemeWrapper(viewGroup.getContext(), theme.f100608b) : viewGroup.getContext(), null, 0, 0, 14, null);
        aVar.setId(R.id.beduin_image);
        aVar.setLayoutParams(layoutParams);
        return aVar;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) {
        Image image;
        UniversalColor errorColor;
        Drawable drawableU;
        UniversalColor errorColor2;
        UniversalColor backgroundColor;
        com.avito.android.beduin.common.component.image.a aVar = (com.avito.android.beduin.common.component.image.a) view;
        aVar.getOverlay().clear();
        aVar.setController(null);
        BeduinImageModel beduinImageModel = this.f101454f;
        aVar.setTag(R.id.image, beduinImageModel.getId());
        ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
        layoutParams.width = y6.b(beduinImageModel.getSize().getWidth());
        layoutParams.height = y6.b(beduinImageModel.getSize().getHeight());
        aVar.setLayoutParams(layoutParams);
        ImageStyle style = beduinImageModel.getStyle();
        aVar.setBackground((style == null || (backgroundColor = style.getBackgroundColor()) == null) ? null : H.a(aVar.getContext(), backgroundColor));
        ImageStyle style2 = beduinImageModel.getStyle();
        aVar.setCornerRadii(style2 != null ? i.a(style2, true) : null);
        GW0.b bVar = new GW0.b(aVar.getResources());
        ImageStyle style3 = beduinImageModel.getStyle();
        Context context = aVar.getContext();
        if (style3 == null || (errorColor2 = style3.getErrorColor()) == null) {
            bVar.f6543h = null;
        } else {
            bVar.f6543h = H.a(context, errorColor2);
        }
        BeduinImageScaleType scaleType = beduinImageModel.getScaleType();
        if (scaleType == null) {
            scaleType = BeduinImageScaleType.FILL;
        }
        bVar.f6547l = scaleType.a();
        ImageRequest.a aVarA = C35949t5.a(aVar);
        u.a(aVarA, beduinImageModel.getStyle(), aVar.getContext());
        aVarA.f169500r = this.f101455g;
        UniversalImage universalImage = beduinImageModel.getUniversalImage();
        if (universalImage == null || (image = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(aVar.getContext()))) == null) {
            image = beduinImageModel.getImage();
        }
        if (image != null) {
            aVarA.d(n.a(image));
            if (beduinImageModel.getLocalImage() != null && (drawableU = u(aVar.getContext(), beduinImageModel)) != null) {
                BeduinImageScaleType scaleType2 = beduinImageModel.getLocalImage().getScaleType();
                if (scaleType2 == null) {
                    scaleType2 = BeduinImageScaleType.FILL;
                }
                ImageRequest.ScaleType scaleTypeB = scaleType2.b();
                aVarA.f169492j = drawableU;
                aVarA.f169493k = scaleTypeB;
            }
            ImageStyle style4 = beduinImageModel.getStyle();
            Size size = beduinImageModel.getSize();
            aVar.getOverlay().clear();
            aVarA.f169490h = new f(aVar, B.a(aVar, style4, size), style4, size);
        } else {
            B.a(aVar, beduinImageModel.getStyle(), beduinImageModel.getSize());
            g.a(aVar, beduinImageModel.getStyle(), beduinImageModel.getSize());
            Drawable drawableU2 = u(aVar.getContext(), beduinImageModel);
            if (drawableU2 == null) {
                ImageStyle style5 = beduinImageModel.getStyle();
                drawableU2 = (style5 == null || (errorColor = style5.getErrorColor()) == null) ? null : H.a(aVar.getContext(), errorColor);
                if (drawableU2 == null) {
                    drawableU2 = new ColorDrawable(C35835l0.d(R.attr.red, aVar.getContext()));
                }
            }
            LocalIcon localImage = beduinImageModel.getLocalImage();
            BeduinImageScaleType scaleType3 = localImage != null ? localImage.getScaleType() : null;
            if (scaleType3 == null) {
                scaleType3 = BeduinImageScaleType.FILL;
            }
            aVarA.f169484b = new ImageRequest.d.a(drawableU2, scaleType3.b());
        }
        aVar.setHierarchy(bVar.a());
        aVarA.c();
        j.a(aVar, beduinImageModel.getActions(), this.f101453e);
    }
}
