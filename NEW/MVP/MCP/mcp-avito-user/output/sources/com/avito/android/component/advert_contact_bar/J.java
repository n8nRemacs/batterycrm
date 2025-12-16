package com.avito.android.component.advert_contact_bar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert_core.contactbar.C28266e;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.gig_timer_widget.GigApplyButtonTimerView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.remote.model.SellerInfoAdvantage;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35852n1;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.jakewharton.rxbinding4.view.C37722i;
import hw.InterfaceC41177b;
import io.reactivex.rxjava3.internal.operators.observable.U;
import j.InterfaceC42150f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import sK0.C48065c;

/* compiled from: AdvertDetailsRedesignContactBar.kt */
@InterfaceC41177b
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/J;", "Lcom/avito/android/component/advert_contact_bar/ContactBar;", "Lcom/avito/android/component/advert_contact_bar/T;", "a", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class J implements ContactBar, T {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public final SimpleDraweeView f125137A;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f125138a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f125139b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f125140c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f125141d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final TextView f125142e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final TextView f125143f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final LinearLayout f125144g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final TextView f125145h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final TextView f125146i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final View f125147j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final RatingBar f125148k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final TextView f125149l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final TextView f125150m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final TextView f125151n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final ImageView f125152o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final TextView f125153p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final ViewGroup f125154q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f125155r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final ArrayList f125156s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final a f125157t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final ArrayList f125158u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public View f125159v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public View f125160w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final ru.avito.component.serp.job.b f125161x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f125162y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public final TextView f125163z;

    /* compiled from: AdvertDetailsRedesignContactBar.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/J$a;", "", "<init>", "()V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f125164a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f125165b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f125166c;
    }

    /* compiled from: AdvertDetailsRedesignContactBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ContactBar.Button.Width.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ContactBar.Button.Width width = ContactBar.Button.Width.f125097b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ContactBar.ContainerClickType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ContactBar.ContainerClickType containerClickType = ContactBar.ContainerClickType.f125101b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ContactBar.ContainerClickType containerClickType2 = ContactBar.ContainerClickType.f125101b;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[ContactBar.Button.Action.Type.values().length];
            try {
                iArr3[1] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                ContactBar.Button.Action.Type type = ContactBar.Button.Action.Type.f125058b;
                iArr3[0] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: AdvertDetailsRedesignContactBar.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/component/advert_contact_bar/b;", "invoke", "()Lcom/avito/android/component/advert_contact_bar/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<C29555b> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f125167l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final C29555b invoke() {
            return new C29555b(false);
        }
    }

    public J(@Y61.k View view, boolean z12, boolean z13) {
        this.f125138a = view;
        this.f125139b = z12;
        this.f125140c = z13;
        Context context = view.getContext();
        this.f125141d = context;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f125142e = (TextView) view.findViewById(R.id.online_status);
        this.f125143f = (TextView) view.findViewById(R.id.seller_name);
        this.f125144g = (LinearLayout) view.findViewById(R.id.seller_info_container);
        this.f125145h = (TextView) view.findViewById(R.id.contact_bar_status);
        this.f125146i = (TextView) view.findViewById(R.id.contact_bar_status_bottom);
        this.f125147j = view.findViewById(R.id.rating_container);
        this.f125148k = (RatingBar) view.findViewById(R.id.rating);
        this.f125149l = (TextView) view.findViewById(R.id.rating_text);
        this.f125150m = (TextView) view.findViewById(R.id.rating_number);
        this.f125151n = (TextView) view.findViewById(R.id.contacts_title);
        this.f125152o = (ImageView) view.findViewById(R.id.seller_type_icon);
        this.f125153p = (TextView) view.findViewById(R.id.seller_type_text);
        this.f125154q = (ViewGroup) view.findViewById(R.id.seller_type_container);
        this.f125156s = new ArrayList();
        this.f125157t = new a();
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.advantages_container);
        this.f125161x = linearLayout != null ? new ru.avito.component.serp.job.b(layoutInflaterFrom, linearLayout) : null;
        this.f125162y = C42727D.c(c.f125167l);
        this.f125163z = (TextView) view.findViewById(R.id.contact_bar_rkn_disclaimer);
        this.f125137A = (SimpleDraweeView) view.findViewById(R.id.avatar);
        ArrayList arrayList = new ArrayList();
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.contact_bar_buttons_container);
        if (linearLayout2 != null) {
            arrayList.add(linearLayout2);
        }
        LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.contact_bar_buttons_container2);
        if (linearLayout3 != null) {
            arrayList.add(linearLayout3);
        }
        this.f125158u = arrayList;
    }

    public static LinearLayout.LayoutParams d(ContactBar.a aVar) {
        return new LinearLayout.LayoutParams(0, aVar.f125130a ? y6.b(44) : -2, 1.0f);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void S2(@Y61.l String str, @Y61.l Float f12) {
        this.f125157t.f125164a = (f12 == null && str == null) ? false : true;
        D6.G(this.f125147j, (f12 == null && str == null) ? false : true);
        RatingBar ratingBar = this.f125148k;
        if (ratingBar != null) {
            ratingBar.setFloatingRatingIsEnabled(true);
        }
        if (ratingBar != null) {
            ratingBar.setRating(f12 != null ? f12.floatValue() : 0.0f);
        }
        D6.G(ratingBar, ((f12 == null || (f12.floatValue() > 0.0f ? 1 : (f12.floatValue() == 0.0f ? 0 : -1)) <= 0) ? null : f12) != null);
        TextView textView = this.f125149l;
        if (textView != null) {
            I5.a(textView, str, false);
        }
        boolean z12 = ((f12 == null || (f12.floatValue() > 0.0f ? 1 : (f12.floatValue() == 0.0f ? 0 : -1)) <= 0) ? null : f12) != null;
        TextView textView2 = this.f125150m;
        D6.G(textView2, z12);
        if (textView2 != null) {
            textView2.setText(f12 != null ? C35852n1.a(f12.floatValue()) : null);
        }
        f();
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void T2(boolean z12) {
        Iterator it = this.f125156s.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setClickable(!z12);
        }
        float f12 = z12 ? 0.0f : 1.0f;
        View view = this.f125138a;
        view.setAlpha(f12);
        view.setVisibility(z12 ? 8 : 0);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void W6(boolean z12, boolean z13, boolean z14) {
        Iterator it = this.f125156s.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setClickable(!z12);
        }
        this.f125138a.animate().alpha(z12 ? 0.0f : 1.0f).setDuration(z13 ? 0L : 200L).withStartAction(new com.avito.android.app.coldstart.d(this, 16)).withEndAction(new D.b(6, this, z12)).start();
    }

    @Override // com.avito.android.component.advert_contact_bar.T
    public final void a() {
        View view = this.f125138a;
        LinearLayout linearLayout = view instanceof LinearLayout ? (LinearLayout) view : null;
        if (linearLayout != null) {
            int childCount = linearLayout.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                linearLayout.getChildAt(i12).setVisibility(8);
            }
        }
    }

    @Override // com.avito.android.component.advert_contact_bar.T
    public final void b() {
        Iterator it = this.f125158u.iterator();
        while (it.hasNext()) {
            D6.w((LinearLayout) it.next());
        }
    }

    public final View c(ContactBar.Button button, ContactBar.a aVar, C28266e.h hVar) throws Resources.NotFoundException {
        Long l12;
        if (!(button instanceof ContactBar.Button.Action)) {
            if (button instanceof ContactBar.Button.Target) {
                return e(new L(1, hVar, ContactBar.c.class, "onTargetButtonClick", "onTargetButtonClick(Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;)V", 0), (ContactBar.Button.Target) button);
            }
            if (button instanceof ContactBar.Button.Custom.DeliveryCombinedButtons) {
                throw new IllegalArgumentException("contactBar doesn't support custom button");
            }
            throw new NoWhenBranchMatchedException();
        }
        ContactBar.Button.Action action = (ContactBar.Button.Action) button;
        boolean z12 = aVar.f125130a && aVar.f125131b;
        K k12 = new K(1, hVar, ContactBar.c.class, "onActionButtonClick", "onActionButtonClick(Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Action;)V", 0);
        String str = action.f125050n;
        Context context = this.f125141d;
        if (str != null && this.f125140c) {
            C29555b c29555b = (C29555b) this.f125162y.getValue();
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, "avitoRe23"));
            c29555b.getClass();
            return C29555b.a(action, k12, dVar, null);
        }
        ArrayList arrayList = this.f125156s;
        boolean z13 = this.f125139b;
        String str2 = action.f125038b;
        boolean z14 = action.f125047k;
        boolean z15 = action.f125046j;
        ContactBar.Button.Action.Type type = action.f125043g;
        if (z13) {
            View viewInflate = LayoutInflater.from(new androidx.appcompat.view.d(context, action.f125044h ? R.style.Theme_DesignSystem_Re23 : R.style.Theme_DesignSystem_LookAndFeel)).inflate(R.layout.advert_details_contact_bar_action_button_restyle, (ViewGroup) null);
            Button button2 = (Button) viewInflate.findViewById(R.id.action_button);
            View viewFindViewById = viewInflate.findViewById(R.id.online_point);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            if (z15) {
                button2.setAppearanceFromAttr(R.attr.buttonPrimaryLarge);
                button2.setEnabled(false);
            } else if (z14) {
                ContactBar.Button.Action.Type type2 = ContactBar.Button.Action.Type.f125058b;
                boolean z16 = action.f125054r;
                if (type == type2 && z16) {
                    button2.setAppearanceFromAttr(R.attr.buttonSecondaryMedium);
                } else if (type == type2) {
                    button2.setAppearanceFromAttr(R.attr.buttonAccentLarge);
                    this.f125159v = viewInflate;
                } else {
                    ContactBar.Button.Action.Type type3 = ContactBar.Button.Action.Type.f125059c;
                    if (type == type3 && z16) {
                        button2.setAppearanceFromAttr(R.attr.buttonPrimaryMedium);
                    } else if (type == type3) {
                        button2.setAppearanceFromAttr(R.attr.buttonPrimaryLarge);
                        this.f125160w = viewInflate;
                    } else if (type == ContactBar.Button.Action.Type.f125063g) {
                        button2.setAppearanceFromAttr(R.attr.buttonSecondaryLarge);
                    } else {
                        button2.setAppearanceFromAttr(R.attr.buttonPrimaryLarge);
                    }
                }
            } else {
                button2.setAppearance(R.style.ButtonAdvertActionGray);
            }
            viewFindViewById.setVisibility((z12 && type == ContactBar.Button.Action.Type.f125059c) ? 0 : 8);
            button2.setText(str2);
            com.avito.android.lib.util.v.a(button2, D6.i(12, r5));
            button2.setOnClickListener(new ViewOnClickListenerC29554a(action, k12, 7));
            arrayList.add(viewInflate);
            return viewInflate;
        }
        ContactBar.Button.Action.Type type4 = ContactBar.Button.Action.Type.f125066j;
        View viewInflate2 = LayoutInflater.from(context).inflate(type == type4 ? R.layout.advert_details_contact_bar_button_purple : R.layout.advert_details_contact_bar_button_redesign, (ViewGroup) null);
        View viewFindViewById2 = viewInflate2.findViewById(R.id.button_container);
        if (viewFindViewById2 == null) {
            viewFindViewById2 = viewInflate2;
        }
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.button_text);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.online_point);
        textView.setText(str2);
        if (action.f125048l) {
            S.b(viewFindViewById2, textView);
        } else if (z15) {
            S.a(viewFindViewById2, textView);
        } else if (!z14 || type == ContactBar.Button.Action.Type.f125068l) {
            S.b(viewFindViewById2, textView);
        } else if (type == ContactBar.Button.Action.Type.f125063g) {
            S.c(viewFindViewById2, textView, true);
        } else if (type == ContactBar.Button.Action.Type.f125058b) {
            D6.D(viewFindViewById2, R.drawable.bg_btn_flat_rds_green_redesign);
        } else if (type == type4 && (l12 = action.f125053q) != null) {
            long jLongValue = l12.longValue();
            View viewFindViewById5 = viewFindViewById2.findViewById(R.id.button_timer_text);
            if (viewFindViewById5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.gig_timer_widget.GigApplyButtonTimerView");
            }
            GigApplyButtonTimerView gigApplyButtonTimerView = (GigApplyButtonTimerView) viewFindViewById5;
            gigApplyButtonTimerView.setTimer(jLongValue);
            gigApplyButtonTimerView.setColor(context.getColor(R.color.common_constant_white_alpha_70));
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC29554a(k12, action, 6));
        if (viewFindViewById4 != null) {
            viewFindViewById4.setVisibility((z12 && type == ContactBar.Button.Action.Type.f125059c) ? 0 : 8);
        }
        arrayList.add(viewFindViewById2);
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            this.f125159v = viewInflate2;
        } else if (iOrdinal == 1) {
            this.f125160w = viewInflate2;
        }
        return viewInflate2;
    }

    public final Button e(Y41.l lVar, ContactBar.Button.Target target) {
        Button buttonD = S.d(target, new androidx.appcompat.view.d(this.f125141d, com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, target.f125078f)), R.layout.advert_details_contact_bar_target_button_redesign, new M(1, lVar, Y41.l.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0));
        com.avito.android.lib.util.v.a(buttonD, D6.i(12, r0));
        return buttonD;
    }

    public final void f() {
        a aVar = this.f125157t;
        aVar.getClass();
        Resources resources = this.f125141d.getResources();
        int dimensionPixelSize = aVar.f125166c ? 0 : aVar.f125164a ? resources.getDimensionPixelSize(R.dimen.restyle_action_button_with_rating_top_margin) : aVar.f125165b ? resources.getDimensionPixelSize(R.dimen.restyle_action_button_with_text_margin) : resources.getDimensionPixelSize(R.dimen.restyle_action_button_top_margin);
        LinearLayout linearLayout = (LinearLayout) C42745f0.G(this.f125158u);
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, dimensionPixelSize, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            linearLayout.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void fb(@Y61.l String str) {
        TextView textView = this.f125146i;
        if (textView != null) {
            I5.a(textView, str, false);
        }
        D6.w(this.f125142e);
        D6.w(this.f125143f);
        D6.w(this.f125145h);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void gb(@Y61.l String str, @Y61.l String str2, @Y61.l UniversalColor universalColor) {
        D6.G(this.f125154q, true ^ (str == null || str.length() == 0));
        TextView textView = this.f125153p;
        if (textView != null) {
            I5.a(textView, str, false);
        }
        Integer numA = str2 != null ? com.avito.android.lib.util.q.a(str2) : null;
        Context context = this.f125141d;
        Drawable drawableN = numA != null ? C35835l0.n(context, numA.intValue(), C48065c.b(context, universalColor, R.attr.blue)) : null;
        ImageView imageView = this.f125152o;
        if (imageView != null) {
            C35821j2.a(imageView, drawableN);
        }
        if (textView == null || textView.getVisibility() != 0) {
            return;
        }
        androidx.core.view.P.b(textView, new O(textView, this));
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void hb(@Y61.l Y41.l<? super Integer, G0> lVar) {
        this.f125155r = lVar;
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void hide() {
        D6.g(this.f125138a);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> ib(@Y61.k List<? extends ContactBar.ContainerClickType> list) {
        Object objA;
        List<? extends ContactBar.ContainerClickType> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            int iOrdinal = ((ContactBar.ContainerClickType) it.next()).ordinal();
            if (iOrdinal == 0) {
                LinearLayout linearLayout = this.f125144g;
                objA = linearLayout != null ? C37722i.a(linearLayout) : U.f403867b;
            } else if (iOrdinal == 1) {
                View view = this.f125147j;
                objA = view != null ? C37722i.a(view) : U.f403867b;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                TextView textView = this.f125145h;
                objA = textView != null ? C37722i.a(textView) : U.f403867b;
            }
            arrayList.add(objA);
        }
        return io.reactivex.rxjava3.core.z.X(arrayList).T(io.reactivex.rxjava3.internal.functions.a.f401991a, Integer.MAX_VALUE);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void jb() {
        D6.w(this.f125142e);
        D6.w(this.f125143f);
        D6.w(this.f125145h);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void kb(@InterfaceC42150f int i12) {
        TextView textView = this.f125149l;
        if (textView != null) {
            textView.setTextColor(C35835l0.d(i12, this.f125141d));
        }
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void lb(@Y61.l List<SellerInfoAdvantage> list) {
        ru.avito.component.serp.job.b bVar = this.f125161x;
        if (bVar != null) {
            bVar.a(R.attr.textM2, list);
        }
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void mb(@Y61.k List list, @Y61.k ContactBar.a aVar, @Y61.k C28266e.h hVar) {
        ArrayList arrayList = this.f125156s;
        arrayList.clear();
        C29555b c29555b = (C29555b) this.f125162y.getValue();
        ArrayList arrayList2 = this.f125158u;
        c29555b.b(list, hVar, arrayList2, this.f125141d, arrayList);
        this.f125157t.f125166c = aVar.f125132c;
        f();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ContactBar.Button.Target) {
                arrayList3.add(obj);
            }
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            ContactBar.Button.Target target = (ContactBar.Button.Target) it.next();
            LinearLayout linearLayout = (LinearLayout) C42745f0.K(1, arrayList2);
            if (linearLayout == null) {
                return;
            }
            linearLayout.addView(e(new N(1, hVar, ContactBar.c.class, "onTargetButtonClick", "onTargetButtonClick(Lcom/avito/android/component/advert_contact_bar/ContactBar$Button$Target;)V", 0), target), d(aVar));
            D6.H(linearLayout);
        }
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    @Y61.l
    public final io.reactivex.rxjava3.core.z<G0> nb(boolean z12) {
        View view;
        if (!z12 || (view = this.f125147j) == null) {
            return null;
        }
        return C37722i.a(view);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void ob(@Y61.l String str) {
        TextView textView = this.f125163z;
        if (textView != null) {
            I5.a(textView, str, false);
        }
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void pb() {
        D6.H(this.f125142e);
        D6.H(this.f125143f);
        D6.H(this.f125145h);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void qb(@Y61.k List list, @Y61.k ContactBar.a aVar, @Y61.k C28266e.h hVar, @Y61.k List list2, @Y61.l ContactBar.b bVar) {
        ArrayList arrayList = this.f125158u;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LinearLayout linearLayout = (LinearLayout) it.next();
            linearLayout.removeAllViews();
            linearLayout.setVisibility(8);
        }
        this.f125156s.clear();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!(((ContactBar.Button) obj) instanceof ContactBar.Button.Custom)) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            ContactBar.Button button = (ContactBar.Button) it2.next();
            LinearLayout linearLayout2 = (LinearLayout) C42745f0.K(i12, arrayList);
            if (linearLayout2 == null) {
                break;
            }
            int iOrdinal = button.getF125082j().ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    if (linearLayout2.getChildCount() != 0) {
                        linearLayout2.addView(new Space(linearLayout2.getContext()), new LinearLayout.LayoutParams(linearLayout2.getContext().getResources().getDimensionPixelSize(R.dimen.contact_button_inner_padding), -2, 0.0f));
                        i12++;
                        linearLayout2.addView(c(button, aVar, hVar), d(aVar));
                        linearLayout2.setVisibility(0);
                    } else {
                        linearLayout2.addView(c(button, aVar, hVar), d(aVar));
                        linearLayout2.setVisibility(0);
                    }
                }
            } else if (linearLayout2.getChildCount() != 0) {
                int i13 = i12 + 1;
                LinearLayout linearLayout3 = (LinearLayout) C42745f0.K(i13, arrayList);
                if (linearLayout3 == null) {
                    i12 = i13;
                } else {
                    i12 += 2;
                    linearLayout3.addView(c(button, aVar, hVar), d(aVar));
                    linearLayout3.setVisibility(0);
                }
            } else {
                linearLayout2.addView(c(button, aVar, hVar), d(aVar));
                linearLayout2.setVisibility(0);
                i12++;
            }
        }
        this.f125157t.f125166c = aVar.f125132c;
        f();
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void rb(@Y61.l com.avito.android.image_loader.a aVar) {
        SimpleDraweeView simpleDraweeView;
        if (aVar == null || (simpleDraweeView = this.f125137A) == null) {
            return;
        }
        C35949t5.c(simpleDraweeView, aVar, null, null, null, 14);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void sb(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, boolean z12, boolean z13, boolean z14) {
        Context context = this.f125141d;
        TextView textView = this.f125146i;
        TextView textView2 = this.f125145h;
        TextView textView3 = this.f125143f;
        TextView textView4 = this.f125142e;
        if (z13 && str3 != null && str3.length() != 0) {
            if (textView != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append((Object) str);
                sb2.append(' ');
                sb2.append(str3 != null ? str3.toLowerCase(Locale.ROOT) : "");
                SpannableString spannableString = new SpannableString(sb2.toString());
                spannableString.setSpan(new ForegroundColorSpan(z12 ? C35835l0.d(R.attr.green800, context) : C35835l0.d(R.attr.gray54, context)), str.length(), spannableString.length(), 33);
                I5.a(textView, spannableString, false);
            }
            D6.w(textView4);
            D6.w(textView3);
            D6.w(textView2);
            return;
        }
        if (z14 && str3 != null && str3.length() != 0) {
            if (textView3 != null) {
                I5.a(textView3, str, false);
            }
            TextView textView5 = this.f125153p;
            if (textView5 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append((Object) str2);
                sb3.append(", ");
                sb3.append(str3 != null ? str3.toLowerCase(Locale.ROOT) : null);
                SpannableString spannableString2 = new SpannableString(sb3.toString());
                if (z12) {
                    spannableString2.setSpan(new ForegroundColorSpan(C35835l0.d(R.attr.green800, context)), spannableString2.length() - (str3 != null ? str3.length() : 0), spannableString2.length(), 33);
                }
                I5.a(textView5, spannableString2, false);
                return;
            }
            return;
        }
        if (z13) {
            D6.w(textView);
            D6.w(textView4);
            D6.w(textView3);
            D6.w(textView2);
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append((CharSequence) str);
        if (z12) {
            sb4.append(" ");
        }
        if (textView3 != null) {
            I5.a(textView3, sb4, false);
        }
        this.f125157t.f125165b = (z12 || str3 == null || str3.length() == 0) ? false : true;
        f();
        if (z12) {
            D6.w(textView2);
            D6.H(textView4);
        } else {
            if (textView2 != null) {
                I5.a(textView2, str3, false);
            }
            D6.w(textView4);
        }
        sb4.setLength(0);
        D6.w(textView);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void show() {
        D6.H(this.f125138a);
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final int va() {
        View view = (View) C42745f0.S(this.f125156s);
        if (view == null) {
            return 0;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return view.getHeight() + iArr[1];
    }

    @Override // com.avito.android.component.advert_contact_bar.ContactBar
    public final void w(@Y61.l AttributedText attributedText) {
        TextView textView = this.f125151n;
        if (textView != null) {
            com.avito.android.util.text.j.a(textView, attributedText, null);
        }
    }
}
