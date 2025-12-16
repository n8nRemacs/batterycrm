package com.avito.android.beduin.common.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.avito.android.beduin.common.component.image.BeduinLinearGradient;
import com.avito.android.beduin.common.component.image.BorderStyle;
import com.avito.android.beduin.common.component.image.ImageStyle;
import com.avito.android.beduin.common.component.image.OverlayStyle;
import com.avito.android.beduin.common.component.image.Size;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: SimpleDraweeViews.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class B {

    /* compiled from: SimpleDraweeViews.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/beduin/common/utils/B$a", "Lcom/avito/android/image_loader/o;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.avito.android.image_loader.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OverlayStyle f103508b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ SimpleDraweeView f103509c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ImageStyle f103510d;

        public a(OverlayStyle overlayStyle, SimpleDraweeView simpleDraweeView, ImageStyle imageStyle) {
            this.f103508b = overlayStyle;
            this.f103509c = simpleDraweeView;
            this.f103510d = imageStyle;
        }

        @Override // com.avito.android.image_loader.o, com.avito.android.image_loader.i
        public final void H(int i12, int i13) {
            ArrayList arrayList = new ArrayList();
            OverlayStyle overlayStyle = this.f103508b;
            UniversalColor color = overlayStyle.getColor();
            ImageStyle imageStyle = this.f103510d;
            SimpleDraweeView simpleDraweeView = this.f103509c;
            if (color != null) {
                simpleDraweeView.getContext();
                int iA2 = C48063a.f437606a.a(simpleDraweeView.getContext(), color);
                float[] fArrA = com.avito.android.beduin.common.component.image.i.a(imageStyle, false);
                PaintDrawable paintDrawable = new PaintDrawable(iA2);
                paintDrawable.setCornerRadii(fArrA);
                arrayList.add(paintDrawable);
            }
            BeduinLinearGradient linearGradient = overlayStyle.getLinearGradient();
            if (linearGradient != null) {
                Context context = simpleDraweeView.getContext();
                float[] fArrA2 = com.avito.android.beduin.common.component.image.i.a(imageStyle, false);
                A a12 = new A(linearGradient, context);
                PaintDrawable paintDrawable2 = new PaintDrawable();
                paintDrawable2.setShape(new RectShape());
                paintDrawable2.setShaderFactory(a12);
                if (fArrA2 != null) {
                    paintDrawable2.setCornerRadii(fArrA2);
                }
                arrayList.add(paintDrawable2);
            }
            GW0.a hierarchy = simpleDraweeView.getHierarchy();
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            hierarchy.p(arrayList != null ? new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0])) : null);
        }
    }

    @Y61.k
    public static final GradientDrawable a(@Y61.k com.avito.android.beduin.common.component.image.a aVar, @Y61.l ImageStyle imageStyle, @Y61.k Size size) {
        BorderStyle border;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setBounds(0, 0, y6.b(size.getWidth()), y6.b(size.getHeight()));
        gradientDrawable.setCornerRadii(imageStyle != null ? com.avito.android.beduin.common.component.image.i.a(imageStyle, false) : null);
        if (imageStyle != null && (border = imageStyle.getBorder()) != null) {
            gradientDrawable.setStroke(y6.b(border.getWidth()), C48063a.f437606a.a(aVar.getContext(), border.getColor()));
        }
        aVar.getOverlay().add(gradientDrawable);
        return gradientDrawable;
    }

    public static final void b(@Y61.k SimpleDraweeView simpleDraweeView, @Y61.l ImageStyle imageStyle, @Y61.k ImageRequest.a aVar) {
        OverlayStyle overlay;
        if (imageStyle != null && (overlay = imageStyle.getOverlay()) != null) {
            aVar.f169490h = new a(overlay, simpleDraweeView, imageStyle);
        } else {
            simpleDraweeView.getHierarchy().p(null);
            G0 g02 = G0.f406611a;
        }
    }
}
