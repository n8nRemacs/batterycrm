package com.avito.android.beduin.common.component.top_toolbar;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.r;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinTopToolbarItem.kt */
@s0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001!J-\u0010\t\u001a\u00020\b2\u001e\u0010\u0007\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b \u0010\u0016¨\u0006\""}, d2 = {"Lcom/avito/android/beduin/common/component/top_toolbar/h;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Lej/a;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "rightItems", "Lkotlin/G0;", "setRightItems", "(Ljava/util/List;)V", "", "text", "setTitle", "(Ljava/lang/CharSequence;)V", "", "maxLines", "setMaxLines", "(Ljava/lang/Integer;)V", "Landroid/view/View$OnClickListener;", "listener", "setRightIconClickedListener", "(Landroid/view/View$OnClickListener;)V", "setLeftIconClickedListener", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "setIconPadding", "(I)V", "topMargin", "setIconTopMargin", "", "setRightText", "(Ljava/lang/String;)V", "setRightTextClickListener", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h extends ConstraintLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f102820h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f102821b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f102822c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f102823d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f102824e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final RecyclerView f102825f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.navigation_bar.b f102826g;

    /* compiled from: BeduinTopToolbarItem.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/beduin/common/component/top_toolbar/h$a;", "", "a", "b", "c", "d", "Lcom/avito/android/beduin/common/component/top_toolbar/h$a$a;", "Lcom/avito/android/beduin/common/component/top_toolbar/h$a$b;", "Lcom/avito/android/beduin/common/component/top_toolbar/h$a$c;", "Lcom/avito/android/beduin/common/component/top_toolbar/h$a$d;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f102827a;

        /* renamed from: b, reason: collision with root package name */
        public final int f102828b;

        /* renamed from: c, reason: collision with root package name */
        public final int f102829c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Integer f102830d;

        /* renamed from: e, reason: collision with root package name */
        public final int f102831e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f102832f;

        /* renamed from: g, reason: collision with root package name */
        public final int f102833g;

        /* renamed from: h, reason: collision with root package name */
        public final int f102834h;

        /* renamed from: i, reason: collision with root package name */
        public final int f102835i;

        /* renamed from: j, reason: collision with root package name */
        public final int f102836j;

        /* renamed from: k, reason: collision with root package name */
        public final int f102837k;

        /* compiled from: BeduinTopToolbarItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/top_toolbar/h$a$a;", "Lcom/avito/android/beduin/common/component/top_toolbar/h$a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.beduin.common.component.top_toolbar.h$a$a, reason: collision with other inner class name */
        public static final /* data */ class C3083a extends a {

            /* renamed from: l, reason: collision with root package name */
            public final boolean f102838l;

            public C3083a(boolean z12) {
                super(8, z12 ? 0 : 8, R.drawable.design_icon_close_ripple, null, R.drawable.design_icon_close_ripple_right_cross, true, 0, 0, R.attr.textHeadingLarge, 8388611, y6.b(8), 8, null);
                this.f102838l = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3083a) && this.f102838l == ((C3083a) obj).f102838l;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f102838l);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("AvitoLarge(hasCloseButton="), this.f102838l, ')');
            }
        }

        /* compiled from: BeduinTopToolbarItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/top_toolbar/h$a$b;", "Lcom/avito/android/beduin/common/component/top_toolbar/h$a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* renamed from: l, reason: collision with root package name */
            public final boolean f102839l;

            public b(boolean z12) {
                super(8, z12 ? 0 : 8, R.drawable.design_icon_close_ripple, null, R.drawable.design_icon_close_ripple, false, y6.b(2), y6.b(3), R.attr.textH3, 8388611, 0, 8, null);
                this.f102839l = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f102839l == ((b) obj).f102839l;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f102839l);
            }

            @k
            public final String toString() {
                return r.x(new StringBuilder("AvitoLookAndFeelLarge(hasCloseButton="), this.f102839l, ')');
            }
        }

        /* compiled from: BeduinTopToolbarItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/top_toolbar/h$a$c;", "Lcom/avito/android/beduin/common/component/top_toolbar/h$a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* renamed from: l, reason: collision with root package name */
            public final boolean f102840l;

            /* renamed from: m, reason: collision with root package name */
            public final boolean f102841m;

            public c(boolean z12, boolean z13) {
                super(z12 ? 0 : 4, 4, z13 ? R.drawable.common_ic_arrow_back_24 : R.drawable.design_icon_close_ripple, z13 ? Integer.valueOf(R.color.common_black) : null, R.drawable.design_icon_close_ripple, false, y6.b(2), 0, R.attr.textH5, 17, 0, null);
                this.f102840l = z12;
                this.f102841m = z13;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f102840l == cVar.f102840l && this.f102841m == cVar.f102841m;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f102841m) + (Boolean.hashCode(this.f102840l) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AvitoLookAndFeelSmall(hasCloseButton=");
                sb2.append(this.f102840l);
                sb2.append(", isBackIcon=");
                return r.x(sb2, this.f102841m, ')');
            }
        }

        /* compiled from: BeduinTopToolbarItem.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/top_toolbar/h$a$d;", "Lcom/avito/android/beduin/common/component/top_toolbar/h$a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* renamed from: l, reason: collision with root package name */
            public final boolean f102842l;

            /* renamed from: m, reason: collision with root package name */
            public final boolean f102843m;

            public d(boolean z12, boolean z13) {
                super(z12 ? 0 : 4, 4, z13 ? R.drawable.common_ic_arrow_back_24 : R.drawable.design_icon_close_ripple, z13 ? Integer.valueOf(R.color.common_black) : null, R.drawable.design_icon_close_ripple_right_cross, true, 0, 0, R.attr.textHeadingSmall, 17, 0, null);
                this.f102842l = z12;
                this.f102843m = z13;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.f102842l == dVar.f102842l && this.f102843m == dVar.f102843m;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f102843m) + (Boolean.hashCode(this.f102842l) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AvitoSmall(hasCloseButton=");
                sb2.append(this.f102842l);
                sb2.append(", isBackIcon=");
                return r.x(sb2, this.f102843m, ')');
            }
        }

        public /* synthetic */ a(int i12, int i13, int i14, Integer num, int i15, boolean z12, int i16, int i17, int i18, int i19, int i22, int i23, C42822w c42822w) {
            this(i12, i13, i14, (i23 & 8) != 0 ? null : num, i15, z12, i16, i17, i18, i19, i22, null);
        }

        public a(int i12, int i13, int i14, Integer num, int i15, boolean z12, int i16, int i17, int i18, int i19, int i22, C42822w c42822w) {
            this.f102827a = i12;
            this.f102828b = i13;
            this.f102829c = i14;
            this.f102830d = num;
            this.f102831e = i15;
            this.f102832f = z12;
            this.f102833g = i16;
            this.f102834h = i17;
            this.f102835i = i18;
            this.f102836j = i19;
            this.f102837k = i22;
        }
    }

    /* compiled from: BeduinTopToolbarItem.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f102845m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
            super(0);
            this.f102845m = list;
        }

        @Override // Y41.a
        public final G0 invoke() {
            boolean zA2 = O2.a(this.f102845m);
            h hVar = h.this;
            ImageView imageView = hVar.f102822c;
            Integer numValueOf = Integer.valueOf(D6.I(imageView));
            if (imageView.getVisibility() == 8) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            ImageView imageView2 = hVar.f102823d;
            Integer numValueOf2 = imageView2.getVisibility() != 8 ? Integer.valueOf(D6.I(imageView2)) : null;
            int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
            if (zA2) {
                int I12 = D6.I(hVar.f102825f);
                int iB2 = y6.b(8);
                int iB3 = y6.b(8);
                if (I12 > iIntValue) {
                    iB2 += I12 - iIntValue;
                } else {
                    iB3 += iIntValue - I12;
                }
                D6.c(hVar.f102821b, Integer.valueOf(iB2), null, Integer.valueOf(iB3), null, 10);
            } else {
                D6.c(hVar.f102821b, Integer.valueOf(iIntValue > 0 ? y6.b(8) : y6.b(0)), null, Integer.valueOf(iIntValue2 > 0 ? y6.b(8) : y6.b(0)), null, 10);
            }
            return G0.f406611a;
        }
    }

    public h(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        com.avito.android.beduin.common.navigation_bar.b bVar = new com.avito.android.beduin.common.navigation_bar.b();
        bVar.f103435l = false;
        this.f102826g = bVar;
        LayoutInflater.from(context).inflate(R.layout.top_toolbar, (ViewGroup) this, true);
        this.f102821b = (TextView) findViewById(R.id.bottom_sheet_title);
        this.f102822c = (ImageView) findViewById(R.id.bottom_sheet_left_close_button);
        this.f102823d = (ImageView) findViewById(R.id.bottom_sheet_right_close_button);
        this.f102824e = (TextView) findViewById(R.id.bottom_sheet_right_text);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.right_items_list_recycler);
        this.f102825f = recyclerView;
        recyclerView.setItemAnimator(null);
        com.avito.android.beduin_shared.model.utils.h.a(recyclerView, bVar, new LinearLayoutManager(0, false));
    }

    public final void g(@k a aVar) {
        int i12 = aVar.f102827a;
        ImageView imageView = this.f102822c;
        imageView.setVisibility(i12);
        int i13 = aVar.f102828b;
        ImageView imageView2 = this.f102823d;
        imageView2.setVisibility(i13);
        int i14 = aVar.f102829c;
        Integer num = aVar.f102830d;
        int i15 = aVar.f102831e;
        if (aVar.f102832f) {
            imageView.setImageDrawable(null);
            imageView2.setImageDrawable(null);
            imageView2.setBackground(androidx.core.content.d.getDrawable(getContext(), i15));
            Drawable drawable = androidx.core.content.d.getDrawable(getContext(), i14);
            if (num != null) {
                ColorStateList colorStateList = androidx.core.content.d.getColorStateList(getContext(), num.intValue());
                if (drawable != null) {
                    drawable.setTintList(colorStateList);
                }
            }
            imageView.setBackground(drawable);
        } else {
            imageView.setBackground(null);
            imageView2.setBackground(null);
            imageView2.setImageResource(i15);
            Drawable drawable2 = androidx.core.content.d.getDrawable(getContext(), i14);
            if (num != null) {
                ColorStateList colorStateList2 = androidx.core.content.d.getColorStateList(getContext(), num.intValue());
                if (drawable2 != null) {
                    drawable2.setTintList(colorStateList2);
                }
            }
            imageView.setImageDrawable(drawable2);
        }
        setIconPadding(aVar.f102833g);
        setIconTopMargin(aVar.f102834h);
        int iJ2 = C35835l0.j(aVar.f102835i, getContext());
        TextView textView = this.f102821b;
        textView.setTextAppearance(iJ2);
        textView.setGravity(aVar.f102836j);
        D6.c(this.f102821b, null, Integer.valueOf(aVar.f102837k), null, null, 13);
    }

    public final void setIconPadding(int padding) {
        this.f102822c.setPadding(padding, padding, padding, padding);
        this.f102823d.setPadding(padding, padding, padding, padding);
    }

    public final void setIconTopMargin(int topMargin) {
        D6.c(this.f102822c, null, Integer.valueOf(topMargin), null, null, 13);
        D6.c(this.f102823d, null, Integer.valueOf(topMargin), null, null, 13);
    }

    public final void setLeftIconClickedListener(@l View.OnClickListener listener) {
        this.f102822c.setOnClickListener(listener);
    }

    public final void setMaxLines(@l Integer maxLines) {
        TextView textView = this.f102821b;
        if (maxLines == null || maxLines.intValue() < 1) {
            textView.setMaxLines(Integer.MAX_VALUE);
            textView.setEllipsize(null);
        } else {
            textView.setMaxLines(maxLines.intValue());
            textView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public final void setRightIconClickedListener(@l View.OnClickListener listener) {
        this.f102823d.setOnClickListener(listener);
    }

    public final void setRightItems(@l List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> rightItems) {
        this.f102826g.l(rightItems, new g(this, rightItems, 1));
    }

    public final void setRightText(@l String text) {
        I5.a(this.f102824e, text, false);
    }

    public final void setRightTextClickListener(@l View.OnClickListener listener) {
        this.f102824e.setOnClickListener(listener);
    }

    public final void setTitle(@l CharSequence text) {
        this.f102821b.setText(text);
    }
}
