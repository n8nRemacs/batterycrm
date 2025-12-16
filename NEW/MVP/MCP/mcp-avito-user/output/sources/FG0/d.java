package fG0;

import Ip0.C14142a;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.L;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.point.Point;
import com.avito.android.search_bar.utils.UdfToolbarColors;
import com.avito.android.search_bar.utils.UdfToolbarStyle;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.V0;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: UdfToolbarSearchView.kt */
@s0
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002:\u0001CJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u0017J\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0004\b+\u0010\u0017J\u0017\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0014H\u0002¢\u0006\u0004\b-\u0010\u0017J\u0017\u0010/\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0014H\u0002¢\u0006\u0004\b/\u0010\u0017J\u0017\u00101\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u001eH\u0002¢\u0006\u0004\b1\u0010!J\u0017\u00104\u001a\u00020\u00052\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0014H\u0002¢\u0006\u0004\b7\u0010\u0017J\u0017\u00109\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u0014H\u0002¢\u0006\u0004\b9\u0010\u0017J\u0017\u0010<\u001a\u00020\u00052\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0014H\u0002¢\u0006\u0004\b>\u0010\u0017J\u0017\u0010?\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0014H\u0002¢\u0006\u0004\b?\u0010\u0017J\u0017\u0010@\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u0014H\u0002¢\u0006\u0004\b@\u0010\u0017J\u0017\u0010B\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u0014H\u0002¢\u0006\u0004\bB\u0010\u0017¨\u0006D"}, d2 = {"LfG0/d;", "Landroid/widget/FrameLayout;", "LfG0/c;", "LIp0/a;", "newState", "Lkotlin/G0;", "setState", "(LIp0/a;)V", "Lcom/avito/android/search_bar/utils/UdfToolbarStyle;", "newStyle", "setStyle", "(Lcom/avito/android/search_bar/utils/UdfToolbarStyle;)V", "LIp0/a$a$a$a;", "searchInputHint", "setSearchInputHint", "(LIp0/a$a$a$a;)V", "", "isShowSavedIcon", "setFilterIconChangeCounterVisibility", "(Z)V", "Lcom/avito/android/search_bar/utils/UdfToolbarStyle$Color;", "color", "setToolbarBackgroundColor", "(Lcom/avito/android/search_bar/utils/UdfToolbarStyle$Color;)V", "searchInputTextColor", "setSearchInputTextColor", "hintAndLeftIconColor", "setSearchInputHintAndLeftIconColor", "searchInputBackgroundColor", "setSearchInputBackgroundColor", "", "searchInputAlpha", "setSearchInputAlpha", "(F)V", "Lcom/avito/android/search_bar/utils/UdfToolbarStyle$SearchInputHeightType;", "searchInputHeight", "setSearchInputHeight", "(Lcom/avito/android/search_bar/utils/UdfToolbarStyle$SearchInputHeightType;)V", "Lcom/avito/android/search_bar/utils/UdfToolbarStyle$SearchInputRightMargin;", "searchInputRightMargin", "setSearchInputRightMargin", "(Lcom/avito/android/search_bar/utils/UdfToolbarStyle$SearchInputRightMargin;)V", "iconColor", "setCartIconColor", "iconBackgroundColor", "setCartIconBackgroundColor", "iconRippleColor", "setCartIconRippleColor", "iconAlpha", "setCartIconAlpha", "Lcom/avito/android/search_bar/utils/UdfToolbarStyle$CartIconRightMargin;", "cartIconRightMargin", "setCartIconRightMargin", "(Lcom/avito/android/search_bar/utils/UdfToolbarStyle$CartIconRightMargin;)V", "iconPointBackgroundColor", "setCartIconPointBackgroundColor", "iconIndicatorColor", "setCartIconPointIndicatorColor", "Lcom/avito/android/search_bar/utils/UdfToolbarStyle$BottomPaddingType;", "bottomPaddingType", "setBottomPadding", "(Lcom/avito/android/search_bar/utils/UdfToolbarStyle$BottomPaddingType;)V", "setFilterIconColor", "setFilterIconRippleColor", "setFilterIconPointBackgroundColor", "iconPointIndicatorColor", "setFilterIconPointIndicatorColor", "a", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends FrameLayout implements c {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f395791k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final L f395792b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public C14142a f395793c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public UdfToolbarStyle f395794d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ConstraintLayout f395795e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Input f395796f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final FrameLayout f395797g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ImageView f395798h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final FrameLayout f395799i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final View f395800j;

    /* compiled from: UdfToolbarSearchView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LfG0/d$a;", "", "<init>", "()V", "", "CLARIFY_MENU_ICON_TYPE", "Ljava/lang/String;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UdfToolbarSearchView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[UdfToolbarStyle.SearchInputHeightType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                UdfToolbarStyle.SearchInputHeightType searchInputHeightType = UdfToolbarStyle.SearchInputHeightType.f264073b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[UdfToolbarStyle.SearchInputRightMargin.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                UdfToolbarStyle.SearchInputRightMargin searchInputRightMargin = UdfToolbarStyle.SearchInputRightMargin.f264077b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[UdfToolbarStyle.CartIconRightMargin.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                UdfToolbarStyle.CartIconRightMargin cartIconRightMargin = UdfToolbarStyle.CartIconRightMargin.f264065b;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr4 = new int[UdfToolbarStyle.BottomPaddingType.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                UdfToolbarStyle.BottomPaddingType bottomPaddingType = UdfToolbarStyle.BottomPaddingType.f264061b;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        new a(null);
    }

    public d(Context context, AttributeSet attributeSet, int i12, L l12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f395792b = l12;
        LayoutInflater.from(new ContextThemeWrapper(context, R.style.Theme_DesignSystem_Re23)).inflate(R.layout.udf_search_bar, this);
        View viewFindViewById = findViewById(R.id.toolbar_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f395795e = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.input_field_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById2;
        this.f395796f = input;
        View viewFindViewById3 = findViewById(R.id.filter_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.f395797g = (FrameLayout) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.filter_icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f395798h = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.cart_icon_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById5;
        this.f395799i = frameLayout;
        View viewFindViewById6 = findViewById(R.id.filters_badge_counter);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f395800j = viewFindViewById6;
        View viewFindViewById7 = frameLayout.findViewById(R.id.cart_counter);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        Badge badge = (Badge) viewFindViewById7;
        badge.setTranslationX(context.getResources().getDimensionPixelSize(R.dimen.cart_counter_translationX_with_search_promo_banner));
        badge.setTranslationY(context.getResources().getDimensionPixelSize(R.dimen.cart_counter_translationY_with_search_promo_banner));
        View viewFindViewById8 = frameLayout.findViewById(R.id.cart_point);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.point.Point");
        }
        Point point = (Point) viewFindViewById8;
        point.setTranslationX(context.getResources().getDimensionPixelSize(R.dimen.cart_point_translationX_with_search_promo_banner));
        point.setTranslationY(context.getResources().getDimensionPixelSize(R.dimen.cart_point_translationY_with_search_promo_banner));
        View viewFindViewById9 = findViewById(R.id.cart_button);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        D6.c((ImageView) viewFindViewById9, Integer.valueOf(y6.b(9)), null, null, null, 14);
        View viewFindViewById10 = findViewById(R.id.design_input_left_container);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        Drawable drawableH = C35835l0.h(R.attr.ic_search20, viewFindViewById10.getContext());
        input.k(y6.b(22) + (drawableH != null ? drawableH.getIntrinsicWidth() : y6.b(24)), input.f179335g);
        D6.f(viewFindViewById10, y6.b(16), 0, y6.b(6), 0, 10);
        input.setLeftIcon(C35835l0.h(R.attr.ic_search20, input.getContext()));
        View viewFindViewById11 = input.findViewById(R.id.design_input_left_icon);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        D6.f(viewFindViewById11, 0, y6.b(3), 0, 0, 13);
    }

    private final void setBottomPadding(UdfToolbarStyle.BottomPaddingType bottomPaddingType) throws Resources.NotFoundException {
        int dimensionPixelSize;
        int iOrdinal = bottomPaddingType.ordinal();
        if (iOrdinal == 0) {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.redesign_23_search_view_padding_bottom_visible_inlines);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.redesign_23_search_view_padding_bottom_hidden_inlines);
        }
        D6.f(this.f395795e, 0, 0, 0, dimensionPixelSize, 7);
    }

    private final void setCartIconAlpha(float iconAlpha) {
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a.f176528a.getClass();
        View viewFindViewById = findViewById(R.id.cart_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ((ImageView) viewFindViewById).setAlpha(iconAlpha);
    }

    private final void setCartIconBackgroundColor(UdfToolbarStyle.Color iconBackgroundColor) {
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a aVar = com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a.f176528a;
        GradientDrawable gradientDrawableE = com.avito.android.advert.item.delivery_suggests.l.e(0);
        gradientDrawableE.setColor(fG0.b.a(iconBackgroundColor, getContext()));
        gradientDrawableE.setCornerRadius(getContext().getResources().getDimensionPixelSize(R.dimen.cart_container_corner_radius));
        G0 g02 = G0.f406611a;
        a.AbstractC5229a.c cVar = new a.AbstractC5229a.c(gradientDrawableE);
        aVar.getClass();
        View viewFindViewById = findViewById(R.id.cart_icon_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        viewGroup.setClipToPadding(false);
        viewGroup.setBackground(cVar.f176530a);
    }

    private final void setCartIconColor(UdfToolbarStyle.Color iconColor) {
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a aVar = com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a.f176528a;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(fG0.b.a(iconColor, getContext()));
        aVar.getClass();
        View viewFindViewById = findViewById(R.id.cart_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ((ImageView) viewFindViewById).setImageTintList(colorStateListValueOf);
    }

    private final void setCartIconPointBackgroundColor(UdfToolbarStyle.Color iconPointBackgroundColor) {
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a aVar = com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a.f176528a;
        int iA2 = fG0.b.a(iconPointBackgroundColor, getContext());
        aVar.getClass();
        View viewFindViewById = findViewById(R.id.cart_point);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.point.Point");
        }
        ((Point) viewFindViewById).setStrokeColor(iA2);
    }

    private final void setCartIconPointIndicatorColor(UdfToolbarStyle.Color iconIndicatorColor) throws Resources.NotFoundException {
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a aVar = com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a.f176528a;
        int iA2 = fG0.b.a(iconIndicatorColor, getContext());
        aVar.getClass();
        View viewFindViewById = findViewById(R.id.cart_counter);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.badge.Badge");
        }
        Badge badge = (Badge) viewFindViewById;
        badge.setAppearance(R.style.Re23_Badge_CartIconAvitoBlack);
        badge.setBackgroundColor(iA2);
        View viewFindViewById2 = findViewById(R.id.cart_point);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.point.Point");
        }
        ((Point) viewFindViewById2).setColor(iA2);
    }

    private final void setCartIconRightMargin(UdfToolbarStyle.CartIconRightMargin cartIconRightMargin) throws Resources.NotFoundException {
        int dimensionPixelSize;
        int iOrdinal = cartIconRightMargin.ordinal();
        if (iOrdinal == 0) {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.cart_default_right_margin);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.cart_search_promo_header_right_margin);
        }
        D6.c(this.f395799i, null, null, Integer.valueOf(dimensionPixelSize), null, 11);
    }

    private final void setCartIconRippleColor(UdfToolbarStyle.Color iconRippleColor) {
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a aVar = com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.a.f176528a;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(fG0.b.a(iconRippleColor, getContext()));
        aVar.getClass();
        View viewFindViewById = findViewById(R.id.cart_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ((ImageView) viewFindViewById).setBackground(V0.c(colorStateListValueOf));
    }

    private final void setFilterIconChangeCounterVisibility(boolean isShowSavedIcon) {
        D6.G(this.f395800j, isShowSavedIcon);
    }

    private final void setFilterIconColor(UdfToolbarStyle.Color iconColor) {
        this.f395798h.setImageTintList(ColorStateList.valueOf(fG0.b.a(iconColor, getContext())));
    }

    private final void setFilterIconPointBackgroundColor(UdfToolbarStyle.Color iconPointBackgroundColor) {
        View view = this.f395800j;
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawableE = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawableE == null) {
            gradientDrawableE = com.avito.android.advert.item.delivery_suggests.l.e(1);
        }
        gradientDrawableE.setStroke(y6.b(2), fG0.b.a(iconPointBackgroundColor, getContext()));
        view.setBackground(gradientDrawableE);
    }

    private final void setFilterIconPointIndicatorColor(UdfToolbarStyle.Color iconPointIndicatorColor) {
        View view = this.f395800j;
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawableE = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawableE == null) {
            gradientDrawableE = com.avito.android.advert.item.delivery_suggests.l.e(1);
        }
        gradientDrawableE.setColor(ColorStateList.valueOf(fG0.b.a(iconPointIndicatorColor, getContext())));
        view.setBackground(gradientDrawableE);
    }

    private final void setFilterIconRippleColor(UdfToolbarStyle.Color iconRippleColor) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(fG0.b.a(iconRippleColor, getContext()));
        float[] fArr = new float[8];
        for (int i12 = 0; i12 < 8; i12++) {
            fArr[i12] = y6.b(18);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        shapeDrawable.getPaint().setColor(C35835l0.d(R.attr.black, getRootView().getContext()));
        this.f395797g.setBackground(new RippleDrawable(colorStateListValueOf, null, shapeDrawable));
    }

    private final void setSearchInputAlpha(float searchInputAlpha) {
        this.f395796f.setAlpha(searchInputAlpha);
    }

    private final void setSearchInputBackgroundColor(UdfToolbarStyle.Color searchInputBackgroundColor) {
        GradientDrawable gradientDrawableE = com.avito.android.advert.item.delivery_suggests.l.e(0);
        gradientDrawableE.setColor(fG0.b.a(searchInputBackgroundColor, getContext()));
        gradientDrawableE.setCornerRadius(getContext().getResources().getDimensionPixelSize(R.dimen.input_corner_radius));
        this.f395796f.setEditTextBackground(gradientDrawableE);
    }

    private final void setSearchInputHeight(UdfToolbarStyle.SearchInputHeightType searchInputHeight) throws Resources.NotFoundException {
        int dimensionPixelSize;
        ViewGroup.LayoutParams layoutParams = this.f395796f.getLayoutParams();
        int iOrdinal = searchInputHeight.ordinal();
        if (iOrdinal == 0) {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.search_container_default_height);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.search_container_search_promo_header_height);
        }
        layoutParams.height = dimensionPixelSize;
    }

    private final void setSearchInputHint(C14142a.AbstractC0488a.C0489a.AbstractC0490a searchInputHint) {
        String string;
        boolean z12 = searchInputHint instanceof C14142a.AbstractC0488a.C0489a.AbstractC0490a.b;
        Input input = this.f395796f;
        if (z12) {
            string = input.getContext().getString(R.string.search);
        } else {
            if (!(searchInputHint instanceof C14142a.AbstractC0488a.C0489a.AbstractC0490a.C0491a)) {
                throw new NoWhenBranchMatchedException();
            }
            string = ((C14142a.AbstractC0488a.C0489a.AbstractC0490a.C0491a) searchInputHint).f8554a;
        }
        input.setHint(string);
    }

    private final void setSearchInputHintAndLeftIconColor(UdfToolbarStyle.Color hintAndLeftIconColor) {
        int iA2 = fG0.b.a(hintAndLeftIconColor, getContext());
        Input input = this.f395796f;
        input.setHintTextColor(iA2);
        input.setLeftIconColor(fG0.b.a(hintAndLeftIconColor, getContext()));
    }

    private final void setSearchInputRightMargin(UdfToolbarStyle.SearchInputRightMargin searchInputRightMargin) throws Resources.NotFoundException {
        int dimensionPixelSize;
        int iOrdinal = searchInputRightMargin.ordinal();
        if (iOrdinal == 0) {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.search_container_default_right_margin);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.search_container_search_promo_header_right_margin);
        }
        D6.c(this.f395796f, null, null, Integer.valueOf(dimensionPixelSize), null, 11);
    }

    private final void setSearchInputTextColor(UdfToolbarStyle.Color searchInputTextColor) {
        this.f395796f.setTextColor(fG0.b.a(searchInputTextColor, getContext()));
    }

    private final void setToolbarBackgroundColor(UdfToolbarStyle.Color color) {
        this.f395795e.setBackgroundColor(fG0.b.a(color, getContext()));
    }

    public final void a(@k UdfToolbarColors udfToolbarColors) throws Resources.NotFoundException {
        UdfToolbarColors.Point point;
        UdfToolbarStyle.Color color;
        UdfToolbarColors.Point point2;
        UdfToolbarStyle.Color color2;
        UdfToolbarStyle.Color color3;
        UdfToolbarStyle.Color color4;
        UdfToolbarStyle.Color color5;
        UdfToolbarColors.Point point3;
        UdfToolbarStyle.Color color6;
        UdfToolbarColors.Point point4;
        UdfToolbarStyle.Color color7;
        UdfToolbarStyle.Color color8;
        UdfToolbarStyle.Color color9;
        UdfToolbarStyle.Color color10;
        UdfToolbarStyle.Color color11;
        UdfToolbarStyle.Color color12;
        UdfToolbarStyle.Color color13 = udfToolbarColors.f264030b;
        if (color13 != null) {
            setToolbarBackgroundColor(color13);
        }
        UdfToolbarColors.SearchInput searchInput = udfToolbarColors.f264032d;
        if (searchInput != null && (color12 = searchInput.f264048b) != null) {
            setSearchInputTextColor(color12);
        }
        if (searchInput != null && (color11 = searchInput.f264050d) != null) {
            setSearchInputBackgroundColor(color11);
        }
        if (searchInput != null && (color10 = searchInput.f264049c) != null) {
            setSearchInputHintAndLeftIconColor(color10);
        }
        UdfToolbarColors.FilterIcon filterIcon = udfToolbarColors.f264033e;
        if (filterIcon != null && (color9 = filterIcon.f264040b) != null) {
            setFilterIconColor(color9);
        }
        if (filterIcon != null && (color8 = filterIcon.f264041c) != null) {
            setFilterIconRippleColor(color8);
        }
        if (filterIcon != null && (point4 = filterIcon.f264042d) != null && (color7 = point4.f264046b) != null) {
            setFilterIconPointBackgroundColor(color7);
        }
        if (filterIcon != null && (point3 = filterIcon.f264042d) != null && (color6 = point3.f264047c) != null) {
            setFilterIconPointIndicatorColor(color6);
        }
        UdfToolbarColors.CartIcon cartIcon = udfToolbarColors.f264034f;
        if (cartIcon != null && (color5 = cartIcon.f264036b) != null) {
            setCartIconColor(color5);
        }
        if (cartIcon != null && (color4 = cartIcon.f264037c) != null) {
            setCartIconBackgroundColor(color4);
        }
        if (cartIcon != null && (color3 = cartIcon.f264038d) != null) {
            setCartIconRippleColor(color3);
        }
        if (cartIcon != null && (point2 = cartIcon.f264039e) != null && (color2 = point2.f264046b) != null) {
            setCartIconPointBackgroundColor(color2);
        }
        if (cartIcon == null || (point = cartIcon.f264039e) == null || (color = point.f264047c) == null) {
            return;
        }
        setCartIconPointIndicatorColor(color);
    }

    @Override // LV.b
    public void setState(@k C14142a newState) {
        C14142a c14142a = this.f395793c;
        if (new com.avito.android.lib.util.c(newState, c14142a).f181333c) {
            return;
        }
        this.f395793c = newState;
        C14142a.AbstractC0488a abstractC0488a = c14142a != null ? c14142a.f8550a : null;
        C14142a.AbstractC0488a abstractC0488a2 = newState.f8550a;
        if (!new com.avito.android.lib.util.c(abstractC0488a2, abstractC0488a).f181333c) {
            boolean z12 = abstractC0488a2 instanceof C14142a.AbstractC0488a.C0489a;
            Input input = this.f395796f;
            if (z12) {
                setSearchInputHint(((C14142a.AbstractC0488a.C0489a) abstractC0488a2).f8553a);
                D6.H(input);
            } else if (abstractC0488a2 == null) {
                D6.w(input);
            }
        }
        C14142a.b bVar = c14142a != null ? c14142a.f8551b : null;
        C14142a.b bVar2 = newState.f8551b;
        if (!new com.avito.android.lib.util.c(bVar2, bVar).f181333c) {
            ImageView imageView = this.f395798h;
            FrameLayout frameLayout = this.f395797g;
            if (bVar2 == null) {
                D6.w(frameLayout);
                D6.w(imageView);
            } else {
                Boolean boolValueOf = Boolean.valueOf(bVar2.f8556a);
                if (!new com.avito.android.lib.util.c(boolValueOf, bVar != null ? Boolean.valueOf(bVar.f8556a) : null).f181333c) {
                    setFilterIconChangeCounterVisibility(boolValueOf.booleanValue());
                }
                D6.H(frameLayout);
                D6.H(imageView);
            }
        }
        InterfaceC31171n interfaceC31171n = c14142a != null ? c14142a.f8552c : null;
        InterfaceC31171n interfaceC31171n2 = newState.f8552c;
        if (new com.avito.android.lib.util.c(interfaceC31171n2, interfaceC31171n).f181333c) {
            return;
        }
        if (interfaceC31171n2 == null) {
            interfaceC31171n2 = InterfaceC31171n.b.f176507a;
        }
        com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.d.a(this.f395792b, this.f395799i, interfaceC31171n2, com.avito.android.lib.beduin_v2.repository.cart_total_quantity.utils.b.f176531l);
        boolean zF2 = kotlin.jvm.internal.L.f(interfaceC31171n2, InterfaceC31171n.b.f176507a);
        FrameLayout frameLayout2 = this.f395799i;
        if (zF2) {
            D6.w(frameLayout2);
        } else {
            D6.H(frameLayout2);
        }
    }

    @Override // LV.d
    public void setStyle(@k UdfToolbarStyle newStyle) throws Resources.NotFoundException {
        UdfToolbarStyle udfToolbarStyle = this.f395794d;
        if (new com.avito.android.lib.util.c(newStyle, udfToolbarStyle).f181333c) {
            return;
        }
        this.f395794d = newStyle;
        UdfToolbarStyle.Color color = udfToolbarStyle != null ? udfToolbarStyle.f264054a : null;
        UdfToolbarStyle.Color color2 = newStyle.f264054a;
        if (!new com.avito.android.lib.util.c(color2, color).f181333c && color2 != null) {
            setToolbarBackgroundColor(color2);
        }
        new com.avito.android.lib.util.c(newStyle.f264055b, udfToolbarStyle != null ? udfToolbarStyle.f264055b : null);
        UdfToolbarStyle.e eVar = udfToolbarStyle != null ? udfToolbarStyle.f264056c : null;
        UdfToolbarStyle.e eVar2 = newStyle.f264056c;
        if (!new com.avito.android.lib.util.c(eVar2, eVar).f181333c && eVar2 != null) {
            UdfToolbarStyle.Color color3 = eVar2 != null ? eVar2.f264095a : null;
            if (!new com.avito.android.lib.util.c(color3, eVar != null ? eVar.f264095a : null).f181333c && color3 != null) {
                setSearchInputTextColor(color3);
            }
            UdfToolbarStyle.Color color4 = eVar2 != null ? eVar2.f264096b : null;
            if (!new com.avito.android.lib.util.c(color4, eVar != null ? eVar.f264096b : null).f181333c && color4 != null) {
                setSearchInputHintAndLeftIconColor(color4);
            }
            UdfToolbarStyle.Color color5 = eVar2 != null ? eVar2.f264097c : null;
            if (!new com.avito.android.lib.util.c(color5, eVar != null ? eVar.f264097c : null).f181333c && color5 != null) {
                setSearchInputBackgroundColor(color5);
            }
            Float fValueOf = eVar2 != null ? Float.valueOf(eVar2.f264098d) : null;
            if (!new com.avito.android.lib.util.c(fValueOf, eVar != null ? Float.valueOf(eVar.f264098d) : null).f181333c && fValueOf != null) {
                setSearchInputAlpha(fValueOf.floatValue());
            }
            UdfToolbarStyle.SearchInputHeightType searchInputHeightType = eVar2 != null ? eVar2.f264099e : null;
            if (!new com.avito.android.lib.util.c(searchInputHeightType, eVar != null ? eVar.f264099e : null).f181333c && searchInputHeightType != null) {
                setSearchInputHeight(searchInputHeightType);
            }
            UdfToolbarStyle.SearchInputRightMargin searchInputRightMargin = eVar2 != null ? eVar2.f264100f : null;
            if (!new com.avito.android.lib.util.c(searchInputRightMargin, eVar != null ? eVar.f264100f : null).f181333c && searchInputRightMargin != null) {
                setSearchInputRightMargin(searchInputRightMargin);
            }
        }
        UdfToolbarStyle.b bVar = udfToolbarStyle != null ? udfToolbarStyle.f264057d : null;
        UdfToolbarStyle.b bVar2 = newStyle.f264057d;
        if (!new com.avito.android.lib.util.c(bVar2, bVar).f181333c && bVar2 != null) {
            UdfToolbarStyle.Color color6 = bVar2 != null ? bVar2.f264087a : null;
            if (!new com.avito.android.lib.util.c(color6, bVar != null ? bVar.f264087a : null).f181333c && color6 != null) {
                setFilterIconColor(color6);
            }
            UdfToolbarStyle.Color color7 = bVar2 != null ? bVar2.f264088b : null;
            if (!new com.avito.android.lib.util.c(color7, bVar != null ? bVar.f264088b : null).f181333c && color7 != null) {
                setFilterIconRippleColor(color7);
            }
            UdfToolbarStyle.d dVar = bVar2 != null ? bVar2.f264089c : null;
            UdfToolbarStyle.d dVar2 = bVar != null ? bVar.f264089c : null;
            if (!new com.avito.android.lib.util.c(dVar, dVar2).f181333c && dVar != null) {
                UdfToolbarStyle.Color color8 = dVar != null ? dVar.f264093a : null;
                if (!new com.avito.android.lib.util.c(color8, dVar2 != null ? dVar2.f264093a : null).f181333c && color8 != null) {
                    setFilterIconPointBackgroundColor(color8);
                }
                UdfToolbarStyle.Color color9 = dVar != null ? dVar.f264094b : null;
                if (!new com.avito.android.lib.util.c(color9, dVar2 != null ? dVar2.f264094b : null).f181333c && color9 != null) {
                    setFilterIconPointIndicatorColor(color9);
                }
            }
        }
        UdfToolbarStyle.a aVar = udfToolbarStyle != null ? udfToolbarStyle.f264058e : null;
        UdfToolbarStyle.a aVar2 = newStyle.f264058e;
        if (!new com.avito.android.lib.util.c(aVar2, aVar).f181333c && aVar2 != null) {
            UdfToolbarStyle.Color color10 = aVar2 != null ? aVar2.f264081a : null;
            if (!new com.avito.android.lib.util.c(color10, aVar != null ? aVar.f264081a : null).f181333c && color10 != null) {
                setCartIconColor(color10);
            }
            UdfToolbarStyle.Color color11 = aVar2 != null ? aVar2.f264082b : null;
            if (!new com.avito.android.lib.util.c(color11, aVar != null ? aVar.f264082b : null).f181333c && color11 != null) {
                setCartIconBackgroundColor(color11);
            }
            UdfToolbarStyle.Color color12 = aVar2 != null ? aVar2.f264083c : null;
            if (!new com.avito.android.lib.util.c(color12, aVar != null ? aVar.f264083c : null).f181333c && color12 != null) {
                setCartIconRippleColor(color12);
            }
            Float fValueOf2 = aVar2 != null ? Float.valueOf(aVar2.f264084d) : null;
            if (!new com.avito.android.lib.util.c(fValueOf2, aVar != null ? Float.valueOf(aVar.f264084d) : null).f181333c && fValueOf2 != null) {
                setCartIconAlpha(fValueOf2.floatValue());
            }
            UdfToolbarStyle.CartIconRightMargin cartIconRightMargin = aVar2 != null ? aVar2.f264086f : null;
            if (!new com.avito.android.lib.util.c(cartIconRightMargin, aVar != null ? aVar.f264086f : null).f181333c && cartIconRightMargin != null) {
                setCartIconRightMargin(cartIconRightMargin);
            }
            UdfToolbarStyle.d dVar3 = aVar2 != null ? aVar2.f264085e : null;
            UdfToolbarStyle.d dVar4 = aVar != null ? aVar.f264085e : null;
            if (!new com.avito.android.lib.util.c(dVar3, dVar4).f181333c && dVar3 != null) {
                UdfToolbarStyle.Color color13 = dVar3 != null ? dVar3.f264093a : null;
                if (!new com.avito.android.lib.util.c(color13, dVar4 != null ? dVar4.f264093a : null).f181333c && color13 != null) {
                    setCartIconPointBackgroundColor(color13);
                }
                UdfToolbarStyle.Color color14 = dVar3 != null ? dVar3.f264094b : null;
                if (!new com.avito.android.lib.util.c(color14, dVar4 != null ? dVar4.f264094b : null).f181333c && color14 != null) {
                    setCartIconPointIndicatorColor(color14);
                }
            }
        }
        new com.avito.android.lib.util.c(newStyle.f264059f, udfToolbarStyle != null ? udfToolbarStyle.f264059f : null);
        UdfToolbarStyle.BottomPaddingType bottomPaddingType = udfToolbarStyle != null ? udfToolbarStyle.f264060g : null;
        UdfToolbarStyle.BottomPaddingType bottomPaddingType2 = newStyle.f264060g;
        if (new com.avito.android.lib.util.c(bottomPaddingType2, bottomPaddingType).f181333c || bottomPaddingType2 == null) {
            return;
        }
        setBottomPadding(bottomPaddingType2);
    }
}
