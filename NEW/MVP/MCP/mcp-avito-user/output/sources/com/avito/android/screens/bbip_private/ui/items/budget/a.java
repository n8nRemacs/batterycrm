package com.avito.android.screens.bbip_private.ui.items.budget;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.skeleton.Skeleton;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.screens.bbip_private.ui.items.budget.BbipPrivateBudgetItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BbipPrivateBudgetContentBinder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget/a;", "Lcom/avito/android/lib/design/selector_card/f;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.lib.design.selector_card.f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public View f260653a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public DockingBadge f260654b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public TextView f260655c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public TextView f260656d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public StrikethroughTextView f260657e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public ShimmerLayout f260658f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public TextView f260659g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public TextView f260660h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public ShimmerLayout f260661i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public SimpleDraweeView f260662j;

    /* renamed from: k, reason: collision with root package name */
    public final int f260663k = y6.b(14);

    /* renamed from: l, reason: collision with root package name */
    public final int f260664l = y6.b(12);

    /* renamed from: m, reason: collision with root package name */
    public final int f260665m = y6.b(8);

    /* renamed from: n, reason: collision with root package name */
    public final int f260666n = y6.b(20);

    /* renamed from: o, reason: collision with root package name */
    public final int f260667o = y6.b(24);

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public Integer f260668p;

    @Override // com.avito.android.lib.design.selector_card.f
    public final void a(@Y61.k View view) {
        this.f260653a = view.findViewById(R.id.bbip_private_budget_content_container);
        this.f260654b = (DockingBadge) view.findViewById(R.id.bbip_private_budget_content_discount_badge);
        this.f260655c = (TextView) view.findViewById(R.id.bbip_private_budget_content_price);
        this.f260656d = (TextView) view.findViewById(R.id.bbip_private_budget_custom_icon_view);
        this.f260657e = (StrikethroughTextView) view.findViewById(R.id.bbip_private_budget_content_budget);
        this.f260658f = (ShimmerLayout) view.findViewById(R.id.bbip_private_budget_content_price_shimmer);
        this.f260659g = (TextView) view.findViewById(R.id.bbip_private_budget_content_forecast_title);
        this.f260660h = (TextView) view.findViewById(R.id.bbip_private_budget_content_forecast);
        this.f260661i = (ShimmerLayout) view.findViewById(R.id.bbip_private_budget_content_forecast_shimmer);
        this.f260662j = (SimpleDraweeView) view.findViewById(R.id.bbip_private_budget_content_image);
        Skeleton skeleton = (Skeleton) view.findViewById(R.id.bbip_private_budget_content_price_skeleton);
        if (skeleton != null) {
            skeleton.setCardBackgroundColor(C35835l0.d(R.attr.warmGray12, view.getContext()));
        }
        Skeleton skeleton2 = (Skeleton) view.findViewById(R.id.bbip_private_budget_content_forecast_skeleton);
        if (skeleton2 != null) {
            skeleton2.setCardBackgroundColor(C35835l0.d(R.attr.warmGray12, view.getContext()));
        }
        this.f260668p = Integer.valueOf(C35835l0.j(R.attr.textS20, view.getContext()));
    }

    @Override // com.avito.android.lib.design.selector_card.f
    public final void b(@Y61.k com.avito.android.lib.design.selector_card.r rVar) {
        BbipPrivateBudgetItem.Budget budget = (BbipPrivateBudgetItem.Budget) rVar;
        View view = this.f260653a;
        int i12 = this.f260667o;
        String str = budget.f260642h;
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), str == null ? 0 : i12, view.getPaddingRight(), view.getPaddingBottom());
        }
        String str2 = budget.f260640f;
        String str3 = budget.f260638d;
        if (str3 == null) {
            DockingBadge dockingBadge = this.f260654b;
            if (dockingBadge != null) {
                D6.w(dockingBadge);
            }
            TextView textView = this.f260655c;
            if (textView != null) {
                D6.w(textView);
            }
            TextView textView2 = this.f260656d;
            if (textView2 != null) {
                D6.w(textView2);
            }
            StrikethroughTextView strikethroughTextView = this.f260657e;
            if (strikethroughTextView != null) {
                D6.w(strikethroughTextView);
            }
            ShimmerLayout shimmerLayout = this.f260658f;
            if (shimmerLayout != null) {
                D6.H(shimmerLayout);
            }
            ShimmerLayout shimmerLayout2 = this.f260658f;
            if (shimmerLayout2 != null) {
                shimmerLayout2.c();
            }
        } else {
            if (str == null) {
                DockingBadge dockingBadge2 = this.f260654b;
                if (dockingBadge2 != null) {
                    D6.w(dockingBadge2);
                }
            } else {
                DockingBadge dockingBadge3 = this.f260654b;
                if (dockingBadge3 != null) {
                    dockingBadge3.setText(str);
                }
                DockingBadge dockingBadge4 = this.f260654b;
                if (dockingBadge4 != null) {
                    D6.H(dockingBadge4);
                }
            }
            ShimmerLayout shimmerLayout3 = this.f260658f;
            if (shimmerLayout3 != null) {
                shimmerLayout3.d();
            }
            ShimmerLayout shimmerLayout4 = this.f260658f;
            if (shimmerLayout4 != null) {
                D6.w(shimmerLayout4);
            }
            TextView textView3 = this.f260655c;
            if (textView3 != null) {
                I5.a(textView3, str3, false);
            }
            TextView textView4 = this.f260656d;
            if (textView4 != null) {
                com.avito.android.util.text.j.a(textView4, budget.f260646l, null);
                Integer num = this.f260668p;
                if (num != null) {
                    textView4.setTextAppearance(num.intValue());
                }
            }
            StrikethroughTextView strikethroughTextView2 = this.f260657e;
            if (strikethroughTextView2 != null) {
                I5.a(strikethroughTextView2, str2, false);
            }
        }
        if (str == null || str.length() == 0) {
            i12 = this.f260666n;
        }
        TextView textView5 = this.f260655c;
        if (textView5 != null) {
            D6.c(textView5, null, Integer.valueOf(i12), null, null, 13);
        }
        int i13 = (str3 == null || str3.length() == 0) ? this.f260663k : (str2 == null || str2.length() == 0) ? this.f260665m : this.f260664l;
        TextView textView6 = this.f260659g;
        if (textView6 != null) {
            D6.c(textView6, null, Integer.valueOf(i13), null, null, 13);
        }
        TextView textView7 = this.f260659g;
        if (textView7 != null) {
            com.avito.android.util.text.j.c(textView7, budget.f260648n, null);
        }
        String str4 = budget.f260647m;
        if (str4 == null) {
            TextView textView8 = this.f260660h;
            if (textView8 != null) {
                D6.w(textView8);
            }
            ShimmerLayout shimmerLayout5 = this.f260661i;
            if (shimmerLayout5 != null) {
                D6.H(shimmerLayout5);
            }
            ShimmerLayout shimmerLayout6 = this.f260661i;
            if (shimmerLayout6 != null) {
                shimmerLayout6.c();
            }
        } else {
            TextView textView9 = this.f260660h;
            if (textView9 != null) {
                textView9.setText(str4);
            }
            ShimmerLayout shimmerLayout7 = this.f260661i;
            if (shimmerLayout7 != null) {
                shimmerLayout7.d();
            }
            ShimmerLayout shimmerLayout8 = this.f260661i;
            if (shimmerLayout8 != null) {
                D6.w(shimmerLayout8);
            }
            TextView textView10 = this.f260660h;
            if (textView10 != null) {
                D6.H(textView10);
            }
        }
        SimpleDraweeView simpleDraweeView = this.f260662j;
        if (simpleDraweeView != null) {
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(budget.f260645k, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))), null, null, null, 14);
        }
    }
}
