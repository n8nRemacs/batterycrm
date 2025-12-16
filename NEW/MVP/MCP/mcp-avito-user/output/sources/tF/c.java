package Tf;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.remote.autoteka.model.KindOfDiscount;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ProductView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTf/c;", "Landroid/widget/LinearLayout;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c extends LinearLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f15787i = 0;

    /* renamed from: b, reason: collision with root package name */
    public final DockingBadgeContainer f15788b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f15789c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f15790d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f15791e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f15792f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f15793g;

    /* renamed from: h, reason: collision with root package name */
    public final View f15794h;

    /* compiled from: ProductView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15795a;

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
            f15795a = iArr;
        }
    }

    public c(@k Context context) {
        super(context);
        View.inflate(getContext(), R.layout.autoteka_product_item, this);
        this.f15788b = (DockingBadgeContainer) findViewById(R.id.autoteka_discount_docking_badge_container);
        this.f15789c = (TextView) findViewById(R.id.autoteka_title);
        this.f15790d = (TextView) findViewById(R.id.autoteka_subtitle);
        this.f15791e = (TextView) findViewById(R.id.autoteka_price);
        this.f15792f = (TextView) findViewById(R.id.autoteka_original_price);
        this.f15793g = (TextView) findViewById(R.id.autoteka_unit_price);
        this.f15794h = findViewById(R.id.autoteka_product_item_root);
    }
}
