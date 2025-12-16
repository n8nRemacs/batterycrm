package ru.avito.component.serp;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.avito.android.R;
import com.avito.android.remote.model.price_list.PriceList;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import hw.InterfaceC41177b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PriceListCardView.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/avito/component/serp/PriceListCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/avito/android/remote/model/price_list/PriceList;", "priceList", "Lkotlin/G0;", "setPriceList", "(Lcom/avito/android/remote/model/price_list/PriceList;)V", "a", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class PriceListCardView extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f430446b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f430447c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Group f430448d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f430449e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f430450f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Group f430451g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f430452h;

    /* compiled from: PriceListCardView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/avito/component/serp/PriceListCardView$a;", "", "<init>", "()V", "", "ONE_SECTION_COUNT", "I", "TWO_SECTION_COUNT", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @j
    public PriceListCardView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setPriceList(@l PriceList priceList) {
        List<PriceList.Value> values;
        String price;
        if (priceList == null || ((values = priceList.getValues()) != null && values.isEmpty())) {
            D6.w(this);
            return;
        }
        D6.G(this, true);
        List<PriceList.Value> values2 = priceList.getValues();
        int size = values2 != null ? values2.size() : 0;
        TextView textView = this.f430447c;
        TextView textView2 = this.f430446b;
        Group group = this.f430448d;
        Group group2 = this.f430451g;
        if (size == 1) {
            List<PriceList.Value> values3 = priceList.getValues();
            PriceList.Value value = values3 != null ? (PriceList.Value) C42745f0.E(values3) : null;
            String title = value != null ? value.getTitle() : null;
            price = value != null ? value.getPrice() : null;
            D6.G(group, true);
            I5.a(textView2, title, false);
            I5.a(textView, price, false);
            D6.w(group2);
        } else if (size >= 2) {
            List<PriceList.Value> values4 = priceList.getValues();
            PriceList.Value value2 = values4 != null ? (PriceList.Value) C42745f0.E(values4) : null;
            List<PriceList.Value> values5 = priceList.getValues();
            PriceList.Value value3 = values5 != null ? values5.get(1) : null;
            String title2 = value2 != null ? value2.getTitle() : null;
            String price2 = value2 != null ? value2.getPrice() : null;
            D6.G(group, true);
            I5.a(textView2, title2, false);
            I5.a(textView, price2, false);
            String title3 = value3 != null ? value3.getTitle() : null;
            price = value3 != null ? value3.getPrice() : null;
            D6.G(group2, true);
            I5.a(this.f430449e, title3, false);
            I5.a(this.f430450f, price, false);
        }
        I5.a(this.f430452h, priceList.getCountHint(), false);
    }

    public PriceListCardView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LayoutInflater.from(getContext()).inflate(R.layout.advert_price_list_card_view, (ViewGroup) this, true);
        setLayoutParams(new ConstraintLayout.b(-1, -2));
        View viewFindViewById = findViewById(R.id.first_section_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f430446b = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.first_section_price);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f430447c = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.first_section_group);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Group");
        }
        this.f430448d = (Group) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.second_section_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f430449e = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.second_section_price);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f430450f = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.second_section_group);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Group");
        }
        this.f430451g = (Group) viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.price_count_hint);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f430452h = (TextView) viewFindViewById7;
    }
}
