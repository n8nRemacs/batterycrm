package com.avito.android.advert.item.compatibility.v2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.models.SparePartsV2Response;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: GarageCompatibilityV2View.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/compatibility/v2/n;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/compatibility/v2/l;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class n extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f74380k = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f74381b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ConstraintLayout f74382c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f74383d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f74384e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f74385f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f74386g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ImageView f74387h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f74388i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Context f74389j;

    /* compiled from: GarageCompatibilityV2View.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f74390a;

        static {
            int[] iArr = new int[SparePartsV2Response.StatusType.values().length];
            try {
                iArr[SparePartsV2Response.StatusType.NO_CAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SparePartsV2Response.StatusType.COMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SparePartsV2Response.StatusType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SparePartsV2Response.StatusType.NO_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f74390a = iArr;
        }
    }

    /* compiled from: GarageCompatibilityV2View.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f74391l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DeepLink f74392m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super DeepLink, G0> lVar, DeepLink deepLink) {
            super(1);
            this.f74391l = lVar;
            this.f74392m = deepLink;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            this.f74391l.invoke(this.f74392m);
            return G0.f406611a;
        }
    }

    /* compiled from: GarageCompatibilityV2View.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f74393l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ DeepLink f74394m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super DeepLink, G0> lVar, DeepLink deepLink) {
            super(1);
            this.f74393l = lVar;
            this.f74394m = deepLink;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            this.f74393l.invoke(this.f74394m);
            return G0.f406611a;
        }
    }

    public n(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.loading);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f74381b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.content);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f74382c = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.left_image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f74383d = (SimpleDraweeView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.left_image_corner);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f74384e = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.title);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74385f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.subtitle);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f74386g = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.right_image);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f74387h = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.right_image_hitbox);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f74388i = (FrameLayout) viewFindViewById8;
        this.f74389j = view.getContext();
    }

    @Override // com.avito.android.advert.item.compatibility.v2.l
    public final void C0() {
        D6.w(this.f74381b);
        D6.H(this.f74382c);
    }

    @Override // com.avito.android.advert.item.compatibility.v2.l
    public final void c0() {
        D6.H(this.f74381b);
        D6.w(this.f74382c);
    }

    @Override // com.avito.android.advert.item.compatibility.v2.l
    public final void hide() {
        D6.w(this.f74381b);
        D6.w(this.f74382c);
    }

    @Override // com.avito.android.advert.item.compatibility.v2.l
    public final void ti(@Y61.k SparePartsV2Response.GarageCompatibility garageCompatibility, @Y61.k Y41.l<? super DeepLink, G0> lVar) {
        G0 g02;
        Integer numValueOf;
        G0 g03;
        Integer numValueOf2;
        G0 g04;
        Drawable drawableH;
        Image imageDependsOnThemeOrDefault;
        I5.a(this.f74385f, garageCompatibility.getTitle(), false);
        I5.a(this.f74386g, garageCompatibility.getSubtitle(), false);
        SimpleDraweeView simpleDraweeView = this.f74383d;
        v.b(simpleDraweeView, R.dimen.garage_compatibility_item_v2_image_corner_radius);
        UniversalImage image = garageCompatibility.getImage();
        Context context = this.f74389j;
        if (image == null || (imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(image, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))) == null) {
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
        SparePartsV2Response.StatusType status = garageCompatibility.getStatus();
        int i12 = status == null ? -1 : a.f74390a[status.ordinal()];
        if (i12 == -1) {
            numValueOf = null;
        } else if (i12 == 1) {
            numValueOf = Integer.valueOf(R.attr.ic_arrowRight16);
        } else {
            if (i12 != 2 && i12 != 3 && i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = Integer.valueOf(R.attr.ic_chatOutline16);
        }
        ImageView imageView = this.f74387h;
        if (numValueOf == null || (drawableH = C35835l0.h(numValueOf.intValue(), context)) == null) {
            g03 = null;
        } else {
            imageView.setImageDrawable(drawableH);
            g03 = G0.f406611a;
        }
        if (g03 == null) {
            D6.w(imageView);
        }
        SparePartsV2Response.StatusType status2 = garageCompatibility.getStatus();
        int i13 = status2 == null ? -1 : a.f74390a[status2.ordinal()];
        if (i13 == -1 || i13 == 1) {
            numValueOf2 = null;
        } else if (i13 == 2) {
            numValueOf2 = Integer.valueOf(R.drawable.ic_garage_compatibility_check);
        } else if (i13 != 3) {
            if (i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf2 = null;
        } else {
            numValueOf2 = Integer.valueOf(R.drawable.ic_garage_compatibility_exclamation);
        }
        ImageView imageView2 = this.f74384e;
        if (numValueOf2 != null) {
            imageView2.setImageResource(numValueOf2.intValue());
            g04 = G0.f406611a;
        } else {
            g04 = null;
        }
        if (g04 == null) {
            D6.w(imageView2);
        }
        Drawable drawableH2 = garageCompatibility.getBlockAction() != null ? C35835l0.h(android.R.attr.selectableItemBackground, context) : null;
        ConstraintLayout constraintLayout = this.f74382c;
        constraintLayout.setBackground(drawableH2);
        DeepLink blockAction = garageCompatibility.getBlockAction();
        constraintLayout.setOnClickListener(blockAction != null ? new m(0, new b(lVar, blockAction)) : null);
        Drawable drawableH3 = garageCompatibility.getRightIconAction() != null ? C35835l0.h(android.R.attr.selectableItemBackground, context) : null;
        FrameLayout frameLayout = this.f74388i;
        frameLayout.setBackground(drawableH3);
        DeepLink rightIconAction = garageCompatibility.getRightIconAction();
        frameLayout.setOnClickListener(rightIconAction != null ? new m(1, new c(lVar, rightIconAction)) : null);
        frameLayout.setFocusable(garageCompatibility.getRightIconAction() != null);
        frameLayout.setClickable(garageCompatibility.getRightIconAction() != null);
    }
}
