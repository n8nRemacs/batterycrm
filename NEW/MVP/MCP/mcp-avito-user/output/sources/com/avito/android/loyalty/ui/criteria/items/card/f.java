package com.avito.android.loyalty.ui.criteria.items.card;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CardView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/items/card/f;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f extends com.avito.konveyor.adapter.b {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f183491k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f183492b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ConstraintLayout f183493c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f183494d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f183495e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f183496f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f183497g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ProgressBarRe23 f183498h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final View f183499i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f183500j;

    /* compiled from: CardView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/loyalty/ui/criteria/items/card/f$a;", "", "<init>", "()V", "", "DURATION_ARROW_ICON_ANIMATION", "J", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public f(@k View view, @k g gVar) {
        super(view);
        this.f183492b = gVar;
        View viewFindViewById = view.findViewById(R.id.content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        }
        this.f183493c = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.item_card_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f183494d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.item_card_score);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f183495e = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.item_card_description);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById4;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f183496f = textView;
        View viewFindViewById5 = view.findViewById(R.id.item_card_arrow);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f183497g = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.item_card_progress_line);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.progress_bar_re23.ProgressBarRe23");
        }
        this.f183498h = (ProgressBarRe23) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.item_card_badge);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f183499i = viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.item_card_badge_title);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f183500j = (TextView) viewFindViewById8;
    }
}
