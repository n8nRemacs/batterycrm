package com.avito.android.screens.bbip_private.ui.items.budget_widget;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.docking_badge.DockingBadge;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.strikethrough.StrikethroughTextView;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.screens.bbip_private.ui.items.budget_widget.BbipPrivateBudgetWidgetItem;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BbipPrivateBudgetWidgetContentBinder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget_widget/a;", "Lcom/avito/android/lib/design/selector_card/f;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.lib.design.selector_card.f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public View f260757a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public DockingBadge f260758b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public TextView f260759c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Button f260760d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public StrikethroughTextView f260761e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public ShimmerLayout f260762f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public TextView f260763g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public TextView f260764h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public TextView f260765i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public ShimmerLayout f260766j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public SimpleDraweeView f260767k;

    /* renamed from: l, reason: collision with root package name */
    public final int f260768l = y6.b(14);

    @Override // com.avito.android.lib.design.selector_card.f
    public final void a(@Y61.k View view) {
        this.f260757a = view.findViewById(R.id.bbip_private_budget_content_container);
        this.f260758b = (DockingBadge) view.findViewById(R.id.bbip_private_budget_content_discount_badge);
        this.f260759c = (TextView) view.findViewById(R.id.bbip_private_budget_content_price);
        this.f260760d = (Button) view.findViewById(R.id.bbip_private_budget_custom_button);
        this.f260761e = (StrikethroughTextView) view.findViewById(R.id.bbip_private_budget_content_budget);
        this.f260762f = (ShimmerLayout) view.findViewById(R.id.bbip_private_budget_content_price_shimmer);
        this.f260763g = (TextView) view.findViewById(R.id.bbip_private_budget_content_forecast_title);
        this.f260764h = (TextView) view.findViewById(R.id.bbip_private_budget_content_contacts_forecast);
        this.f260765i = (TextView) view.findViewById(R.id.bbip_private_budget_content_views_forecast);
        this.f260766j = (ShimmerLayout) view.findViewById(R.id.bbip_private_budget_content_forecast_shimmer);
        this.f260767k = (SimpleDraweeView) view.findViewById(R.id.bbip_private_budget_content_image);
    }

    @Override // com.avito.android.lib.design.selector_card.f
    public final void b(@Y61.k com.avito.android.lib.design.selector_card.r rVar) {
        BbipPrivateBudgetWidgetItem.Budget budget = (BbipPrivateBudgetWidgetItem.Budget) rVar;
        View view = this.f260757a;
        String str = budget.f260745h;
        if (view != null) {
            view.setPadding(view.getPaddingLeft(), str == null ? 0 : this.f260768l, view.getPaddingRight(), view.getPaddingBottom());
        }
        String str2 = budget.f260741d;
        if (str2 == null) {
            DockingBadge dockingBadge = this.f260758b;
            if (dockingBadge != null) {
                D6.w(dockingBadge);
            }
            TextView textView = this.f260759c;
            if (textView != null) {
                D6.w(textView);
            }
            Button button = this.f260760d;
            if (button != null) {
                D6.w(button);
            }
            StrikethroughTextView strikethroughTextView = this.f260761e;
            if (strikethroughTextView != null) {
                D6.w(strikethroughTextView);
            }
            ShimmerLayout shimmerLayout = this.f260762f;
            if (shimmerLayout != null) {
                D6.H(shimmerLayout);
            }
            ShimmerLayout shimmerLayout2 = this.f260762f;
            if (shimmerLayout2 != null) {
                shimmerLayout2.c();
            }
        } else {
            if (str == null) {
                DockingBadge dockingBadge2 = this.f260758b;
                if (dockingBadge2 != null) {
                    D6.w(dockingBadge2);
                }
            } else {
                DockingBadge dockingBadge3 = this.f260758b;
                if (dockingBadge3 != null) {
                    dockingBadge3.setText(str);
                }
                DockingBadge dockingBadge4 = this.f260758b;
                if (dockingBadge4 != null) {
                    D6.H(dockingBadge4);
                }
            }
            ShimmerLayout shimmerLayout3 = this.f260762f;
            if (shimmerLayout3 != null) {
                shimmerLayout3.d();
            }
            ShimmerLayout shimmerLayout4 = this.f260762f;
            if (shimmerLayout4 != null) {
                D6.w(shimmerLayout4);
            }
            TextView textView2 = this.f260759c;
            if (textView2 != null) {
                I5.a(textView2, str2, false);
            }
            Button button2 = this.f260760d;
            if (button2 != null) {
                FV.a aVar = FV.a.f4720a;
                Context context = button2.getContext();
                aVar.getClass();
                CharSequence charSequenceB = FV.a.b(R.attr.textIconEdit, context);
                if (budget.f260749l == null) {
                    charSequenceB = null;
                }
                com.avito.android.lib.design.button.b.a(button2, charSequenceB, false);
            }
            StrikethroughTextView strikethroughTextView2 = this.f260761e;
            if (strikethroughTextView2 != null) {
                I5.a(strikethroughTextView2, budget.f260743f, false);
            }
        }
        TextView textView3 = this.f260763g;
        if (textView3 != null) {
            com.avito.android.util.text.j.c(textView3, budget.f260752o, null);
        }
        TextView textView4 = this.f260764h;
        String str3 = budget.f260750m;
        if (textView4 != null) {
            I5.a(textView4, str3, false);
        }
        TextView textView5 = this.f260765i;
        String str4 = budget.f260751n;
        if (textView5 != null) {
            I5.a(textView5, str4, false);
        }
        if (str3 == null || str4 == null) {
            ShimmerLayout shimmerLayout5 = this.f260766j;
            if (shimmerLayout5 != null) {
                D6.H(shimmerLayout5);
            }
            ShimmerLayout shimmerLayout6 = this.f260766j;
            if (shimmerLayout6 != null) {
                shimmerLayout6.c();
            }
        } else {
            ShimmerLayout shimmerLayout7 = this.f260766j;
            if (shimmerLayout7 != null) {
                shimmerLayout7.d();
            }
            ShimmerLayout shimmerLayout8 = this.f260766j;
            if (shimmerLayout8 != null) {
                D6.w(shimmerLayout8);
            }
        }
        SimpleDraweeView simpleDraweeView = this.f260767k;
        if (simpleDraweeView != null) {
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(budget.f260748k, com.avito.android.lib.util.darkTheme.c.b(simpleDraweeView.getContext()))), null, null, null, 14);
        }
    }
}
