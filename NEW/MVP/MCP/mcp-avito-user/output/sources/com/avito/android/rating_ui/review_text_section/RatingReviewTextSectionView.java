package com.avito.android.rating_ui.review_text_section;

import Au.ViewOnClickListenerC13080b;
import Bh0.RunnableC13149a;
import Ch0.C13305a;
import Ch0.c;
import PK0.n;
import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.akita.view.foundation.util.f;
import com.avito.android.R;
import com.avito.android.lib.design.text_view.d;
import com.avito.android.lib.design.text_view.e;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import j.InterfaceC42156l;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RatingReviewTextSectionView.kt */
@s0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0010J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u001b\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/rating_ui/review_text_section/RatingReviewTextSectionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "title", "Lkotlin/G0;", "setTitle", "(Ljava/lang/String;)V", "", "color", "setTextsColor", "(I)V", "setExpandViewsColor", "Lkotlin/Function0;", "listener", "setOnExpandClickListener", "(LY41/a;)V", "a", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RatingReviewTextSectionView extends ConstraintLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final int f250126i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f250127j;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f250128b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f250129c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f250130d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f250131e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Group f250132f;

    /* renamed from: g, reason: collision with root package name */
    public int f250133g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public SpannableStringBuilder f250134h;

    /* compiled from: RatingReviewTextSectionView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/rating_ui/review_text_section/RatingReviewTextSectionView$a;", "", "<init>", "()V", "", "DEFAULT_COLLAPSED_LINES_COUNT", "I", "REVIEW_TEXT_SECTION_HIGHLIGHTER_CORNER_RADIUS", "REVIEW_TEXT_SECTION_HIGHLIGHTER_PADDING", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f250126i = f.a(3);
        f250127j = f.a(4);
    }

    @j
    public RatingReviewTextSectionView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void g() {
        TextView textView = this.f250129c;
        textView.setMaxLines(Integer.MAX_VALUE);
        textView.setEllipsize(null);
        D6.w(this.f250132f);
        SpannableStringBuilder spannableStringBuilder = this.f250134h;
        if (spannableStringBuilder != null) {
            for (c cVar : (c[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c.class)) {
                Iterator it = cVar.f2636e.iterator();
                while (it.hasNext()) {
                    ((C13305a) it.next()).f2623g = true;
                }
            }
            textView.setText(spannableStringBuilder);
        }
    }

    public final void h(CharSequence charSequence, boolean z12, boolean z13) {
        this.f250133g = 4;
        TextView textView = this.f250129c;
        textView.setMaxLines(3);
        I5.a(textView, charSequence, false);
        textView.post(new RunnableC13149a(0, this, z12, z13));
    }

    public final void setExpandViewsColor(@InterfaceC42156l int color) {
        this.f250130d.setTextColor(color);
        this.f250131e.setColorFilter(color);
    }

    public final void setOnExpandClickListener(@k Y41.a<G0> listener) {
        Iterator it = C42745f0.U(this.f250130d, this.f250131e).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new ViewOnClickListenerC13080b(2, this, listener));
        }
    }

    public final void setTextsColor(@InterfaceC42156l int color) {
        this.f250128b.setTextColor(color);
        this.f250129c.setTextColor(color);
    }

    public final void setTitle(@l String title) {
        I5.a(this.f250128b, title, false);
    }

    public RatingReviewTextSectionView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f250133g = 6;
        LayoutInflater.from(context).inflate(R.layout.review_text_section, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.review_text_section_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f250128b = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.review_text_section_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        this.f250129c = textView;
        View viewFindViewById3 = findViewById(R.id.review_text_section_expand);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f250130d = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.review_text_section_expand_arrow);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f250131e = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.review_text_section_expand_group);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.Group");
        }
        this.f250132f = (Group) viewFindViewById5;
        d dVar = d.f180938a;
        int iJ2 = C35835l0.j(R.attr.textM10, context);
        dVar.getClass();
        e.a(textView, n.a(d.a(iJ2, context), null, null, null, null, null, null, null, Integer.valueOf(y6.f(9)), null, 6143));
    }
}
