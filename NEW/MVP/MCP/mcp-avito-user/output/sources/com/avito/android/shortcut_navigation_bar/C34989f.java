package com.avito.android.shortcut_navigation_bar;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import com.avito.android.util.C35821j2;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InlineActionsBar.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/f;", "Lcom/avito/android/shortcut_navigation_bar/c;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.shortcut_navigation_bar.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34989f implements InterfaceC34986c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f283387a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f283388b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ImageView f283389c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f283390d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Spinner f283391e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f283392f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ImageView f283393g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f283394h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Spinner f283395i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f283396j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f283397k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<String> f283398l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f283399m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f283400n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f283401o;

    /* compiled from: InlineActionsBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.shortcut_navigation_bar.f$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[InlineAction.Predefined.State.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InlineAction.Predefined.State state = InlineAction.Predefined.State.f283118b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InlineAction.Predefined.State state2 = InlineAction.Predefined.State.f283118b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InlineAction.Predefined.Type.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                InlineAction.Predefined.Type type = InlineAction.Predefined.Type.f283123b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Inject
    public C34989f(@Y61.k View view) {
        View viewFindViewById = view.findViewById(R.id.bottom_block);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f283387a = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.left_block);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f283388b = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.icon_left);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f283389c = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.title_left);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f283390d = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.icon_left_spinner);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f283391e = (Spinner) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.right_block);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f283392f = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.icon_right);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f283393g = (ImageView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.title_right);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f283394h = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.icon_right_spinner);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.spinner.Spinner");
        }
        this.f283395i = (Spinner) viewFindViewById9;
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f283396j = cVar;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f283397k = cVar2;
        com.jakewharton.rxrelay3.c<String> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f283398l = cVar3;
        this.f283399m = new C41981q0(cVar);
        this.f283400n = new C41981q0(cVar2);
        this.f283401o = new C41981q0(cVar3);
        D6.c(viewFindViewById2, null, null, null, com.avito.android.advert.item.delivery_suggests.l.n(view, R.dimen.actions_horizontal_block_button_padding_bottom), 7);
        D6.c(viewFindViewById6, null, null, null, com.avito.android.advert.item.delivery_suggests.l.n(view, R.dimen.actions_horizontal_block_button_padding_bottom), 7);
    }

    public final void a(InlineAction inlineAction) {
        Integer numA;
        Integer numA2;
        if (inlineAction == null || !(inlineAction instanceof InlineAction.Predefined)) {
            return;
        }
        InlineAction.Predefined predefined = (InlineAction.Predefined) inlineAction;
        int iOrdinal = predefined.f283117h.ordinal();
        TextView textView = this.f283390d;
        Spinner spinner = this.f283391e;
        Drawable drawableH = null;
        ImageView imageView = this.f283389c;
        if (iOrdinal == 0) {
            D6.w(spinner);
            String str = predefined.f283112c;
            if (str != null && (numA = com.avito.android.lib.util.q.a(str)) != null) {
                drawableH = C35835l0.h(numA.intValue(), imageView.getContext());
            }
            C35821j2.a(imageView, drawableH);
            I5.a(textView, predefined.f283114e, false);
        } else if (iOrdinal == 1) {
            D6.w(spinner);
            String str2 = predefined.f283111b;
            if (str2 != null && (numA2 = com.avito.android.lib.util.q.a(str2)) != null) {
                drawableH = C35835l0.h(numA2.intValue(), imageView.getContext());
            }
            C35821j2.a(imageView, drawableH);
            I5.a(textView, predefined.f283113d, false);
        } else if (iOrdinal == 2) {
            D6.H(spinner);
            D6.w(imageView);
        }
        int iOrdinal2 = predefined.f283116g.ordinal();
        View view = this.f283388b;
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                view.setOnClickListener(new ViewOnClickListenerC34987d(inlineAction, this, 3));
            }
        } else if (predefined.f283115f != null) {
            view.setOnClickListener(new ViewOnClickListenerC34987d(inlineAction, this, 2));
        } else {
            view.setOnClickListener(new ViewOnClickListenerC34988e(this, 0));
        }
        D6.H(view);
    }

    public final void b(InlineAction inlineAction) {
        Integer numA;
        Integer numA2;
        if (inlineAction == null || !(inlineAction instanceof InlineAction.Predefined)) {
            return;
        }
        InlineAction.Predefined predefined = (InlineAction.Predefined) inlineAction;
        int iOrdinal = predefined.f283117h.ordinal();
        TextView textView = this.f283394h;
        ImageView imageView = this.f283389c;
        ImageView imageView2 = this.f283393g;
        Spinner spinner = this.f283395i;
        Drawable drawableH = null;
        if (iOrdinal == 0) {
            D6.w(spinner);
            String str = predefined.f283112c;
            if (str != null && (numA = com.avito.android.lib.util.q.a(str)) != null) {
                drawableH = C35835l0.h(numA.intValue(), imageView.getContext());
            }
            C35821j2.a(imageView2, drawableH);
            I5.a(textView, predefined.f283114e, false);
        } else if (iOrdinal == 1) {
            D6.w(spinner);
            String str2 = predefined.f283111b;
            if (str2 != null && (numA2 = com.avito.android.lib.util.q.a(str2)) != null) {
                drawableH = C35835l0.h(numA2.intValue(), imageView.getContext());
            }
            C35821j2.a(imageView2, drawableH);
            I5.a(textView, predefined.f283113d, false);
        } else if (iOrdinal == 2) {
            D6.H(spinner);
            D6.w(imageView2);
        }
        int iOrdinal2 = predefined.f283116g.ordinal();
        View view = this.f283392f;
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                view.setOnClickListener(new ViewOnClickListenerC34987d(inlineAction, this, 5));
            }
        } else if (predefined.f283115f != null) {
            view.setOnClickListener(new ViewOnClickListenerC34987d(inlineAction, this, 4));
        } else {
            view.setOnClickListener(new ViewOnClickListenerC34988e(this, 1));
        }
        D6.H(view);
    }
}
