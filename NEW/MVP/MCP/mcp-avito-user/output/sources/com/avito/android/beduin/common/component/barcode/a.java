package com.avito.android.beduin.common.component.barcode;

import Ui.InterfaceC15523b;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.beduin.common.component.h;
import com.avito.android.beduin.common.component.j;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.Corners;
import com.avito.android.beduin.common.utils.H;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalColorKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinBarcodeComponent.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/barcode/a;", "Lcom/avito/android/beduin/common/component/h;", "Lcom/avito/android/beduin/common/component/barcode/BeduinBarcodeModel;", "Landroid/widget/ImageView;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a extends h<BeduinBarcodeModel, ImageView> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final C3025a f100757h = new C3025a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final List<String> f100758i = Collections.singletonList("barcode");

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final Class<BeduinBarcodeModel> f100759j = BeduinBarcodeModel.class;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Pg.c f100760e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC15523b<BeduinAction> f100761f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final BeduinBarcodeModel f100762g;

    /* compiled from: BeduinBarcodeComponent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/barcode/a$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.barcode.a$a, reason: collision with other inner class name */
    public static final class C3025a implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ C3025a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<BeduinBarcodeModel> S() {
            return a.f100759j;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return a.f100758i;
        }

        public C3025a() {
        }
    }

    public a(@k Pg.c cVar, @k InterfaceC15523b<BeduinAction> interfaceC15523b, @k BeduinBarcodeModel beduinBarcodeModel) {
        this.f100760e = cVar;
        this.f100761f = interfaceC15523b;
        this.f100762g = beduinBarcodeModel;
    }

    @Override // ej.AbstractC40112a
    public final BeduinModel S() {
        return this.f100762g;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final View p(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        ImageView imageView = new ImageView(viewGroup.getContext());
        imageView.setId(R.id.beduin_barcode);
        imageView.setLayoutParams(layoutParams);
        imageView.setTag(R.id.beduin_barcode_parent_width, Integer.valueOf(viewGroup.getMeasuredWidth()));
        return imageView;
    }

    @Override // com.avito.android.beduin.common.component.h
    public final void q(View view) throws NumberFormatException {
        UniversalColor universalColorUniversalColorOf;
        Corners corners;
        ImageView imageView = (ImageView) view;
        imageView.setBackground(null);
        imageView.setOnClickListener(null);
        int i12 = Integer.parseInt(imageView.getTag(R.id.beduin_barcode_parent_width).toString());
        BeduinBarcodeModel beduinBarcodeModel = this.f100762g;
        Integer width = beduinBarcodeModel.getWidth();
        int iB2 = (width == null || width.intValue() <= 0 || y6.b(width.intValue()) > i12) ? -1 : y6.b(width.intValue());
        int iB3 = y6.b(beduinBarcodeModel.getHeight());
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = iB2;
        layoutParams.height = iB3;
        imageView.setLayoutParams(layoutParams);
        int iD2 = C35835l0.d(R.attr.constantWhite, imageView.getContext());
        BeduinContainerBackground background = beduinBarcodeModel.getBackground();
        if (background == null || (universalColorUniversalColorOf = background.getColor()) == null) {
            universalColorUniversalColorOf = UniversalColorKt.universalColorOf((String) null, iD2, iD2);
        }
        imageView.setBackground(H.a(imageView.getContext(), universalColorUniversalColorOf));
        BeduinContainerIndent padding = beduinBarcodeModel.getPadding();
        imageView.setPadding(padding != null ? y6.b(padding.getLeftIndent()) : 0, padding != null ? y6.b(padding.getTopIndent()) : 0, padding != null ? y6.b(padding.getRightIndent()) : 0, padding != null ? y6.b(padding.getBottomIndent()) : 0);
        BeduinContainerBackground background2 = beduinBarcodeModel.getBackground();
        v.a(imageView, (background2 == null || (corners = background2.getCorners()) == null) ? 0.0f : Wh.d.a(corners)[0]);
        j.a(imageView, beduinBarcodeModel.getOnTapActions(), this.f100761f);
        D6.l(true, imageView, new b(imageView, padding, this));
    }
}
