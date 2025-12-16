package Tf;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.lib.design.gradient.AvitoLinearGradientDrawable;
import com.avito.android.lib.util.f;
import com.avito.android.remote.autoteka.model.KindOfDiscount;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SelectableProductView.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"LTf/d;", "Landroid/widget/LinearLayout;", "", "isSelected", "Lkotlin/G0;", "setSelectedState", "(Z)V", "a", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d extends LinearLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final int f15796k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f15797l;

    /* renamed from: m, reason: collision with root package name */
    public static final int f15798m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f15799n;

    /* renamed from: o, reason: collision with root package name */
    public static final int f15800o;

    /* renamed from: b, reason: collision with root package name */
    public final DockingBadgeContainer f15801b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f15802c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f15803d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f15804e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f15805f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f15806g;

    /* renamed from: h, reason: collision with root package name */
    public final View f15807h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15808i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public String f15809j;

    /* compiled from: SelectableProductView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"LTf/d$a;", "", "<init>", "()V", "", "BACKGROUND_SELECTED", "I", "BACKGROUND_UNSELECTED", "CORNER_RADIUS", "STROKE_COLOR", "STROKE_WIDTH", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SelectableProductView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15810a;

        static {
            int[] iArr = new int[KindOfDiscount.values().length];
            try {
                iArr[KindOfDiscount.DISCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KindOfDiscount.DYNAMIC_DISCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15810a = iArr;
        }
    }

    static {
        new a(null);
        f15796k = y6.b(16);
        f15797l = y6.b(2);
        f15798m = R.drawable.background_fullscreen_product_selected;
        f15799n = R.drawable.background_fullscreen_product_unselected;
        f15800o = R.color.black;
    }

    public d(@k Context context) {
        super(context);
        View.inflate(getContext(), R.layout.autoteka_selectable_product_item, this);
        this.f15801b = (DockingBadgeContainer) findViewById(R.id.autoteka_discount_docking_badge_container);
        this.f15802c = (TextView) findViewById(R.id.autoteka_title);
        this.f15803d = (TextView) findViewById(R.id.autoteka_subtitle);
        this.f15804e = (TextView) findViewById(R.id.autoteka_price);
        this.f15805f = (TextView) findViewById(R.id.autoteka_original_price);
        this.f15806g = (TextView) findViewById(R.id.autoteka_unit_price);
        this.f15807h = findViewById(R.id.autoteka_selectable_product_item_root);
    }

    public final void a() {
        Drawable layerDrawable;
        String str = this.f15809j;
        int i12 = f15799n;
        View view = this.f15807h;
        if (str == null) {
            if (this.f15808i) {
                view.setBackgroundResource(f15798m);
                return;
            } else {
                view.setBackgroundResource(i12);
                return;
            }
        }
        boolean z12 = this.f15808i;
        Integer numH = f.h(str);
        G0 g02 = null;
        int i13 = f15796k;
        if (numH != null) {
            AvitoLinearGradientDrawable.a.C5275a c5275a = new AvitoLinearGradientDrawable.a.C5275a(getContext(), numH.intValue(), 0, 4, null);
            c5275a.f179264a = i13;
            layerDrawable = new AvitoLinearGradientDrawable(c5275a.a());
        } else {
            layerDrawable = null;
        }
        if (layerDrawable != null) {
            if (z12) {
                GradientDrawable gradientDrawableE = com.avito.android.advert.item.delivery_suggests.l.e(0);
                gradientDrawableE.setCornerRadius(i13);
                gradientDrawableE.setStroke(f15797l, androidx.core.content.d.getColor(getContext(), f15800o));
                layerDrawable = new LayerDrawable(new Drawable[]{layerDrawable, gradientDrawableE});
            }
            view.setBackground(layerDrawable);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            view.setBackgroundResource(i12);
        }
    }

    public final void setSelectedState(boolean isSelected) {
        this.f15808i = isSelected;
        a();
    }
}
