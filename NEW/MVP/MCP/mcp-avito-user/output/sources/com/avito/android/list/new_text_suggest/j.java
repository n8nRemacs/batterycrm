package com.avito.android.list.new_text_suggest;

import Y61.l;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.p;
import com.avito.android.inline_filters.dialog.C;
import com.avito.android.remote.model.search.suggest.IconStyle;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: NewTextSuggestItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/list/new_text_suggest/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/list/new_text_suggest/i;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f181625h = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f181626b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f181627c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f181628d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final View f181629e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageView f181630f;

    /* renamed from: g, reason: collision with root package name */
    public final Resources f181631g;

    /* compiled from: NewTextSuggestItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f181632a;

        static {
            int[] iArr = new int[IconStyle.values().length];
            try {
                iArr[IconStyle.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f181632a = iArr;
        }
    }

    public j(@Y61.k View view) {
        super(view);
        this.f181626b = view;
        View viewFindViewById = view.findViewById(R.id.suggest_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f181627c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.suggest_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f181628d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.icon_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f181629e = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.imvIcon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f181630f = (ImageView) viewFindViewById4;
        this.f181631g = view.getResources();
        view.setBackground(new RippleDrawable(C35835l0.e(R.attr.warmGray4, view.getContext()), null, C43852a.a(view.getContext(), R.drawable.rect_mask_radius_3)));
    }

    @Override // com.avito.android.list.new_text_suggest.i
    public final void Aw(@Y61.k p pVar, @Y61.k IconStyle iconStyle, @l Integer num, @l Integer num2, @l Integer num3) throws Resources.NotFoundException {
        Drawable drawable;
        int i12 = a.f181632a[iconStyle.ordinal()];
        Resources resources = this.f181631g;
        View view = this.f181626b;
        if (i12 == 1) {
            Resources.Theme theme = view.getContext().getTheme();
            ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
            drawable = resources.getDrawable(R.drawable.gray_circle_shape, theme);
        } else {
            Resources.Theme theme2 = view.getContext().getTheme();
            ThreadLocal<TypedValue> threadLocal2 = androidx.core.content.res.i.f44673a;
            drawable = resources.getDrawable(R.drawable.gray_rectangle_shape, theme2);
        }
        IconStyle iconStyle2 = IconStyle.CIRCLE;
        View view2 = this.f181629e;
        if (iconStyle == iconStyle2) {
            view2.setBackground(null);
            view2.setBackgroundTintList(null);
        } else {
            view2.setBackground(C43852a.a(view.getContext(), R.drawable.rounded_background_r12));
        }
        ImageView imageView = this.f181630f;
        if (num != null) {
            imageView.getLayoutParams().width = D6.j(view, num.intValue());
        }
        if (num2 != null) {
            int iIntValue = num2.intValue();
            imageView.getLayoutParams().height = D6.j(view, iIntValue);
            m60(iIntValue);
        }
        imageView.requestLayout();
        D6.H(imageView);
        ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
        aVar.f(pVar.a(imageView));
        aVar.e(y6.b(num3 != null ? num3.intValue() : 0));
        aVar.f169490h = new k(this, drawable);
        aVar.c();
    }

    @Override // com.avito.android.list.new_text_suggest.i
    public final void V7() {
        ImageView imageView = this.f181630f;
        D6.w(imageView);
        imageView.setImageDrawable(null);
        imageView.setBackground(null);
        this.f181629e.setBackground(null);
    }

    @Override // com.avito.android.list.new_text_suggest.i
    public final void c(@Y61.k Y41.a<G0> aVar) {
        this.f181626b.setOnClickListener(new C(9, aVar));
    }

    @Override // com.avito.android.list.new_text_suggest.i
    public final void e(@Y61.k AttributedText attributedText) {
        com.avito.android.util.text.j.c(this.f181627c, attributedText, null);
    }

    @Override // com.avito.android.list.new_text_suggest.i
    public final void h(@l String str) {
        I5.a(this.f181628d, str, false);
    }

    @Override // com.avito.android.list.new_text_suggest.i
    public final void m60(int i12) {
        View view = this.f181629e;
        view.getLayoutParams().height = D6.j(this.f181626b, i12);
        view.requestLayout();
    }

    @Override // com.avito.android.list.new_text_suggest.i
    public final void oV(int i12) {
        D6.f(this.f181626b, 0, y6.b(i12), 0, y6.b(14), 5);
    }
}
