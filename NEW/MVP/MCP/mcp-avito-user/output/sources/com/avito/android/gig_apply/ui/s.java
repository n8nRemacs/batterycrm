package com.avito.android.gig_apply.ui;

import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.view.C22977J;
import com.avito.android.R;
import com.avito.android.gig_apply.ui.common.GigSlotBanner;
import com.avito.android.gig_apply.ui.common.ListItemsWithShowMoreView;
import com.avito.android.gig_apply.ui.common.SlotPaymentInfoWidgetView;
import com.avito.android.gig_apply.ui.common.SlotProgressWidgetView;
import com.avito.android.gig_apply.ui.common.TextWithShowMoreView;
import com.avito.android.gig_apply.ui.common.TutorialsWidget;
import com.avito.android.gig_timer_widget.GigSlotTimerWidget;
import com.avito.android.lib.deprecated_design.badge_bar.ImageLoadableView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import pH.C46951A;

/* compiled from: GigSlotRenderer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_apply/ui/s;", "", "a", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class s {

    /* renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ int f160019a0 = 0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f160020A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f160021B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f160022C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f160023D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f160024E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final TextView f160025F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final ImageLoadableView f160026G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final GigSlotTimerWidget f160027H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final SlotProgressWidgetView f160028I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final SlotPaymentInfoWidgetView f160029J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final View f160030K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final View f160031L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final Button f160032M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final View f160033N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final View f160034O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f160035P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final SwipeRefreshLayout f160036Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final ScrollView f160037R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f160038S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final TextView f160039T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final TextView f160040U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final Button f160041V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public final Button f160042W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final GigSlotBanner f160043X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final TextView f160044Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f160045Z;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final GigSlotActivity f160046a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.gig_apply.mvi.A f160047b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C22977J f160048c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f160049d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f160050e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f160051f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f160052g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f160053h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f160054i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SimpleDraweeView f160055j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Button f160056k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Button f160057l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Button f160058m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f160059n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final TextView f160060o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final TextView f160061p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final TextView f160062q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final TextView f160063r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final TextView f160064s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final TextWithShowMoreView f160065t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final TutorialsWidget f160066u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final ListItemsWithShowMoreView f160067v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final ListItemsWithShowMoreView f160068w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final TextView f160069x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final TextView f160070y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final TextView f160071z;

    /* compiled from: GigSlotRenderer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/gig_apply/ui/s$a;", "", "<init>", "()V", "", "CONFIRM_CONTAINER_INITIAL_TRANSLATION", "I", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public s(@Y61.k View view, @Y61.k GigSlotActivity gigSlotActivity, @Y61.k com.avito.android.gig_apply.mvi.A a12, @Y61.k GigSlotOpenParams gigSlotOpenParams, @Y61.k C22977J c22977j, @Y61.k Y41.a aVar) {
        this.f160046a = gigSlotActivity;
        this.f160047b = a12;
        this.f160048c = c22977j;
        this.f160049d = aVar;
        ImageView imageView = (ImageView) view.findViewById(R.id.nav_bar_icon);
        this.f160050e = (TextView) view.findViewById(R.id.nav_bar_title);
        this.f160051f = (TextView) view.findViewById(R.id.nav_bar_date);
        this.f160052g = (TextView) view.findViewById(R.id.nav_bar_price);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.nav_bar_support);
        this.f160053h = (TextView) view.findViewById(R.id.screen_header_title);
        this.f160054i = (TextView) view.findViewById(R.id.screen_header_description);
        this.f160055j = (SimpleDraweeView) view.findViewById(R.id.header_icon);
        Button button = (Button) view.findViewById(R.id.gig_slot_primary_button);
        this.f160056k = button;
        Button button2 = (Button) view.findViewById(R.id.gig_slot_secondary_button);
        this.f160057l = button2;
        Button button3 = (Button) view.findViewById(R.id.gig_slot_requisites_button);
        this.f160058m = button3;
        this.f160059n = (TextView) view.findViewById(R.id.gig_slot_timer_title);
        this.f160060o = (TextView) view.findViewById(R.id.gig_slot_route_title);
        this.f160061p = (TextView) view.findViewById(R.id.gig_slot_address);
        TextView textView = (TextView) view.findViewById(R.id.gig_slot_show_on_map);
        this.f160062q = textView;
        this.f160063r = (TextView) view.findViewById(R.id.gig_slot_route);
        this.f160064s = (TextView) view.findViewById(R.id.gig_slot_route_detail);
        this.f160065t = (TextWithShowMoreView) view.findViewById(R.id.gig_slot_requirement);
        this.f160066u = (TutorialsWidget) view.findViewById(R.id.gig_slot_tutorials);
        this.f160067v = (ListItemsWithShowMoreView) view.findViewById(R.id.gig_slot_documents_container);
        this.f160068w = (ListItemsWithShowMoreView) view.findViewById(R.id.gig_slot_duties_container);
        this.f160069x = (TextView) view.findViewById(R.id.gig_slot_payment_title);
        this.f160070y = (TextView) view.findViewById(R.id.gig_slot_payment_footer);
        this.f160071z = (TextView) view.findViewById(R.id.gig_slot_payment_header);
        DescriptionParameterItem descriptionParameterItem = (DescriptionParameterItem) view.findViewById(R.id.gig_slot_shift_duration);
        this.f160020A = descriptionParameterItem;
        DescriptionParameterItem descriptionParameterItem2 = (DescriptionParameterItem) view.findViewById(R.id.gig_slot_price_per_hour);
        this.f160021B = descriptionParameterItem2;
        DescriptionParameterItem descriptionParameterItem3 = (DescriptionParameterItem) view.findViewById(R.id.gig_slot_avito_bonus);
        this.f160022C = descriptionParameterItem3;
        DescriptionParameterItem descriptionParameterItem4 = (DescriptionParameterItem) view.findViewById(R.id.gig_slot_total_price);
        this.f160023D = descriptionParameterItem4;
        DescriptionParameterItem descriptionParameterItem5 = (DescriptionParameterItem) view.findViewById(R.id.gig_slot_way_of_reception);
        this.f160024E = descriptionParameterItem5;
        this.f160025F = (TextView) view.findViewById(R.id.gig_slot_seller_name);
        this.f160026G = (ImageLoadableView) view.findViewById(R.id.gig_slot_seller_logo);
        TextView textView2 = (TextView) view.findViewById(R.id.gig_slot_slot_id);
        GigSlotTimerWidget gigSlotTimerWidget = (GigSlotTimerWidget) view.findViewById(R.id.gig_slot_timer_widget);
        this.f160027H = gigSlotTimerWidget;
        this.f160028I = (SlotProgressWidgetView) view.findViewById(R.id.gig_slot_progress_widget);
        this.f160029J = (SlotPaymentInfoWidgetView) view.findViewById(R.id.gig_slot_payment_info_widget);
        this.f160030K = view.findViewById(R.id.gig_slot_loading);
        this.f160031L = view.findViewById(R.id.gig_slot_content);
        Button button4 = (Button) view.findViewById(R.id.gig_slot_retry_button);
        this.f160032M = button4;
        this.f160033N = view.findViewById(R.id.gig_slot_loading_error_container);
        this.f160034O = view.findViewById(R.id.gig_slot_warning_container);
        this.f160035P = (ViewGroup) view.findViewById(R.id.gig_slot_warning_text_container);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.gig_slot_pull_to_refresh);
        this.f160036Q = swipeRefreshLayout;
        ScrollView scrollView = (ScrollView) view.findViewById(R.id.gig_scroll_view);
        this.f160037R = scrollView;
        this.f160038S = (ViewGroup) view.findViewById(R.id.gig_slot_confirm);
        this.f160039T = (TextView) view.findViewById(R.id.gig_slot_confirm_title);
        this.f160040U = (TextView) view.findViewById(R.id.gig_slot_confirm_description);
        Button button5 = (Button) view.findViewById(R.id.gig_slot_confirm_primary_button);
        this.f160041V = button5;
        Button button6 = (Button) view.findViewById(R.id.gig_slot_confirm_secondary_button);
        this.f160042W = button6;
        this.f160043X = (GigSlotBanner) view.findViewById(R.id.gig_slot_knowledge_banner);
        this.f160044Y = (TextView) view.findViewById(R.id.gig_slot_payments_title);
        this.f160045Z = (LinearLayout) view.findViewById(R.id.gig_slot_payments_container);
        imageView.setImageTintList(ColorStateList.valueOf(C35835l0.d(R.attr.black, gigSlotActivity)));
        descriptionParameterItem.setAppearance(C35835l0.j(R.attr.textM20, gigSlotActivity));
        descriptionParameterItem2.setAppearance(C35835l0.j(R.attr.textM20, gigSlotActivity));
        descriptionParameterItem3.setAppearance(C35835l0.j(R.attr.textM20, gigSlotActivity));
        descriptionParameterItem4.setAppearance(C35835l0.j(R.attr.textH40, gigSlotActivity));
        descriptionParameterItem5.setAppearance(C35835l0.j(R.attr.textM20, gigSlotActivity));
        I5.a(descriptionParameterItem3.getLeftTextView(), gigSlotActivity.getString(R.string.gig_slot_avito_bonus), false);
        I5.a(descriptionParameterItem5.getLeftTextView(), gigSlotActivity.getString(R.string.gig_slot_way_of_reception), false);
        I5.a(textView2, gigSlotActivity.getString(R.string.gig_slot_id_number, Long.valueOf(gigSlotOpenParams.f159882b)), false);
        com.avito.android.lib.design.button.b.a(button4, gigSlotActivity.getString(R.string.gig_slot_retry_title), false);
        com.akita.compose.theme.re23.e.f64437a.getClass();
        imageView2.setImageResource(com.akita.compose.theme.re23.e.f64354V1);
        imageView2.setColorFilter(C35835l0.d(R.attr.black, gigSlotActivity));
        imageView.setOnClickListener(new r(this, 3));
        button.setOnClickListener(new r(this, 5));
        button2.setOnClickListener(new r(this, 6));
        button3.setOnClickListener(new r(this, 7));
        imageView2.setOnClickListener(new r(this, 8));
        gigSlotTimerWidget.setOnFinishListener(new A(this));
        gigSlotTimerWidget.setOnMinutesLeftListener(new B(this));
        button4.setOnClickListener(new r(this, 9));
        swipeRefreshLayout.setOnRefreshListener(new com.avito.android.beduin.ui.screen.fragment.bottom_sheet.c(this, 22));
        scrollView.getViewTreeObserver().addOnScrollChangedListener(new U9.f(this, 4));
        button5.setOnClickListener(new r(this, 0));
        button6.setOnClickListener(new r(this, 1));
        textView.setOnClickListener(new r(this, 4));
    }

    public static void a(TextView textView) {
        SpannableString spannableString = new SpannableString(textView.getText());
        spannableString.setSpan(new ForegroundColorSpan(textView.getContext().getColor(R.color.green800)), 0, 1, 33);
        I5.a(textView, spannableString, false);
    }

    public final void b(DescriptionParameterItem descriptionParameterItem, C46951A c46951a) {
        if (c46951a != null) {
            descriptionParameterItem.getIcon().setImageResource(R.drawable.ic_question);
            descriptionParameterItem.getIcon().setImageTintList(ColorStateList.valueOf(C35835l0.d(R.attr.gray20, descriptionParameterItem.getContext())));
            descriptionParameterItem.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(17, this, c46951a));
        }
    }
}
