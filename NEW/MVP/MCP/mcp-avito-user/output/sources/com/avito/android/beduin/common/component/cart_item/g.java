package com.avito.android.beduin.common.component.cart_item;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.beduin.common.component.cart_item.RightIcons;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.utils.v;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.lib.design.toggle.State;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.facebook.drawee.drawable.s;
import com.facebook.drawee.generic.RoundingParams;
import j.U;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinCartItemLayout.kt */
@hw.g
@s0
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0007¢\u0006\u0004\b\u0016\u0010\u000bJ\u001b\u0010\u0019\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0007¢\u0006\u0004\b\u0019\u0010\u000bJ\u0017\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\u00042\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00040\u001e¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040#¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040#¢\u0006\u0004\b)\u0010%J\u001b\u0010*\u001a\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040#¢\u0006\u0004\b*\u0010%R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00103\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/R\u001d\u00107\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010-\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/avito/android/beduin/common/component/cart_item/g;", "Landroid/widget/FrameLayout;", "Landroid/graphics/drawable/Drawable;", "overlay", "Lkotlin/G0;", "setImageHierarchy", "(Landroid/graphics/drawable/Drawable;)V", "", "Landroid/widget/ImageView;", "icons", "setRightIconsView", "(Ljava/util/List;)V", "Lcom/avito/android/beduin/common/component/cart_item/BeduinCartItemModel$State;", VoiceInfo.STATE, "setState", "(Lcom/avito/android/beduin/common/component/cart_item/BeduinCartItemModel$State;)V", "Lcom/avito/android/remote/model/Image;", "image", "setImage", "(Lcom/avito/android/remote/model/Image;)V", "Landroid/view/View;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "setChildrenViews", "Lcom/avito/android/beduin/common/component/cart_item/RightIcons;", "rightIcons", "setRightIcons", "", "isFavorite", "setFavoriteNewState", "(Ljava/lang/Boolean;)V", "Lkotlin/Function1;", "Lcom/avito/android/lib/design/toggle/State;", "listener", "setOnCheckboxTapListener", "(LY41/l;)V", "Lkotlin/Function0;", "setOnBodyTapListener", "(LY41/a;)V", "Landroid/view/View$OnTouchListener;", "setOnBodyTouchListener", "(Landroid/view/View$OnTouchListener;)V", "setOnMoreButtonTapListener", "setFavoriteTapActionListener", "Landroid/graphics/drawable/ColorDrawable;", "i", "Lkotlin/C;", "getOverlayForLightImage", "()Landroid/graphics/drawable/ColorDrawable;", "overlayForLightImage", "j", "getOverlayForDisabledImage", "overlayForDisabledImage", "k", "getPlaceholderImageResourceId", "()Landroid/graphics/drawable/Drawable;", "placeholderImageResourceId", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes11.dex */
public final class g extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f100904l = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Checkbox f100905b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f100906c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f100907d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f100908e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f100909f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f100910g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f100911h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Object f100912i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Object f100913j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Object f100914k;

    /* compiled from: BeduinCartItemLayout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100915a;

        static {
            int[] iArr = new int[BeduinCartItemModel.State.values().length];
            try {
                iArr[BeduinCartItemModel.State.CHECKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinCartItemModel.State.UNCHECKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinCartItemModel.State.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f100915a = iArr;
        }
    }

    public g(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f100912i = C42727D.b(lazyThreadSafetyMode, new i(context));
        this.f100913j = C42727D.b(lazyThreadSafetyMode, new h(context));
        this.f100914k = C42727D.b(lazyThreadSafetyMode, new j(context));
        LayoutInflater.from(context).inflate(R.layout.beduin_component_cart_item_re23, (ViewGroup) this, true);
        this.f100905b = (Checkbox) findViewById(R.id.beduin_cart_item_checkbox);
        this.f100906c = (SimpleDraweeView) findViewById(R.id.beduin_cart_item_image);
        this.f100907d = (LinearLayout) findViewById(R.id.beduin_cart_item_content);
        this.f100908e = (FrameLayout) findViewById(R.id.beduin_cart_item_checkbox_container);
        this.f100909f = (LinearLayout) findViewById(R.id.beduin_cart_item_content_container);
        this.f100910g = (FrameLayout) findViewById(R.id.beduin_cart_item_more_container);
        this.f100911h = (LinearLayout) findViewById(R.id.beduin_cart_right_icons_container);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    private final ColorDrawable getOverlayForDisabledImage() {
        return (ColorDrawable) this.f100913j.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    private final ColorDrawable getOverlayForLightImage() {
        return (ColorDrawable) this.f100912i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    private final Drawable getPlaceholderImageResourceId() {
        return (Drawable) this.f100914k.getValue();
    }

    private final void setImageHierarchy(Drawable overlay) {
        RoundingParams roundingParamsB = RoundingParams.b(getResources().getDimension(R.dimen.cart_item_image_corner_radius));
        roundingParamsB.f340154d = C35835l0.d(R.attr.white, getContext());
        roundingParamsB.f340151a = RoundingParams.RoundingMethod.f340158b;
        GW0.b bVar = new GW0.b(getResources());
        Drawable placeholderImageResourceId = getPlaceholderImageResourceId();
        if (placeholderImageResourceId != null) {
            s.c cVar = s.c.f340137i;
            bVar.f6539d = placeholderImageResourceId;
            s.a aVar = (s.a) cVar;
            bVar.f6540e = aVar;
            bVar.f6543h = placeholderImageResourceId;
            bVar.f6544i = aVar;
        }
        bVar.f6552q = roundingParamsB;
        bVar.f6547l = (s.a) s.c.f340137i;
        if (overlay != null) {
            bVar.f6550o = Arrays.asList(overlay);
        }
        this.f100906c.setHierarchy(bVar.a());
    }

    private final void setRightIconsView(List<? extends ImageView> icons) {
        boolean zIsEmpty = icons.isEmpty();
        LinearLayout linearLayout = this.f100911h;
        if (zIsEmpty) {
            linearLayout.removeAllViews();
            linearLayout.setVisibility(8);
            return;
        }
        this.f100910g.setVisibility(8);
        linearLayout.setVisibility(0);
        linearLayout.removeAllViews();
        Iterator<T> it = icons.iterator();
        while (it.hasNext()) {
            linearLayout.addView((ImageView) it.next());
        }
    }

    public final void a(@U int i12, @U int i13) {
        D6.f(this.f100908e, i12, 0, 0, 0, 14);
        D6.f(this.f100910g, 0, 0, i13, 0, 11);
        D6.f(this.f100911h, 0, 0, i13, 0, 11);
    }

    public final void setChildrenViews(@Y61.k List<? extends View> children) {
        LinearLayout linearLayout = this.f100907d;
        linearLayout.removeAllViews();
        Iterator<T> it = children.iterator();
        while (it.hasNext()) {
            linearLayout.addView((View) it.next());
        }
    }

    public final void setFavoriteNewState(@Y61.l Boolean isFavorite) {
        ImageView imageView = (ImageView) this.f100911h.findViewWithTag("favorite");
        if (isFavorite != null) {
            if (isFavorite.booleanValue()) {
                imageView.setImageResource(R.drawable.ic_fav_20_selected_redesign);
            } else {
                imageView.setImageResource(R.drawable.ic_fav_20_redesign);
            }
        }
    }

    public final void setFavoriteTapActionListener(@Y61.k Y41.a<G0> listener) {
        ((ImageView) this.f100911h.findViewWithTag("favorite")).setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(20, listener));
    }

    public final void setImage(@Y61.k Image image) {
        SimpleDraweeView simpleDraweeView = this.f100906c;
        Uri uriD = C35829k2.c(image, simpleDraweeView, 2, 22).d();
        if (uriD == null) {
            C35949t5.a(simpleDraweeView).b();
            return;
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f(uriD);
        aVarA.c();
    }

    public final void setOnBodyTapListener(@Y61.k Y41.a<G0> listener) {
        this.f100909f.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(21, listener));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setOnBodyTouchListener(@Y61.l View.OnTouchListener listener) {
        this.f100909f.setOnTouchListener(listener);
    }

    public final void setOnCheckboxTapListener(@Y61.k Y41.l<? super State, G0> listener) {
        this.f100908e.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(19, this, listener));
    }

    public final void setOnMoreButtonTapListener(@Y61.k Y41.a<G0> listener) {
        this.f100910g.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(18, listener));
    }

    public final void setRightIcons(@Y61.k List<? extends RightIcons> rightIcons) {
        List<? extends RightIcons> list = rightIcons;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (RightIcons rightIcons2 : list) {
            ImageView imageView = new ImageView(getContext());
            imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            D6.c(imageView, null, null, null, Integer.valueOf(y6.b(4)), 7);
            imageView.setPadding(y6.b(4), y6.b(4), y6.b(4), y6.b(4));
            if (rightIcons2 instanceof RightIcons.Favorite) {
                if (((RightIcons.Favorite) rightIcons2).getIsFavorite()) {
                    imageView.setImageResource(R.drawable.ic_fav_20_selected_redesign);
                } else {
                    imageView.setImageResource(R.drawable.ic_fav_20_redesign);
                }
                imageView.setTag("favorite");
            } else if (rightIcons2 instanceof RightIcons.Default) {
                Drawable drawableC = v.c(imageView.getContext(), ((RightIcons.Default) rightIcons2).getIcon(), null);
                if (drawableC != null) {
                    imageView.setImageDrawable(drawableC);
                }
                imageView.setTag("default");
            }
            arrayList.add(imageView);
        }
        setRightIconsView(arrayList);
    }

    public final void setState(@Y61.k BeduinCartItemModel.State state) {
        int i12 = a.f100915a[state.ordinal()];
        LinearLayout linearLayout = this.f100909f;
        FrameLayout frameLayout = this.f100908e;
        Checkbox checkbox = this.f100905b;
        if (i12 == 1) {
            checkbox.setChecked(true);
            D6.k(frameLayout);
            D6.k(linearLayout);
            setImageHierarchy(getOverlayForLightImage());
            return;
        }
        if (i12 == 2) {
            checkbox.setChecked(false);
            D6.k(frameLayout);
            D6.k(linearLayout);
            setImageHierarchy(getOverlayForLightImage());
            return;
        }
        if (i12 != 3) {
            return;
        }
        checkbox.setChecked(false);
        D6.h(frameLayout);
        D6.h(linearLayout);
        setImageHierarchy(getOverlayForDisabledImage());
    }
}
