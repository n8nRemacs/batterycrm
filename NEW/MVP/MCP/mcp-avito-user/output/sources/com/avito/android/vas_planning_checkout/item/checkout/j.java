package com.avito.android.vas_planning_checkout.item.checkout;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.badge_bar.BadgeView;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35872q;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PlanCheckoutView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_planning_checkout/item/checkout/j;", "Lcom/avito/android/vas_planning_checkout/item/checkout/h;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_DEPRECATED_UI_COMPONENT"})
/* loaded from: classes5.dex */
public final class j extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f322937k = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f322938b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f322939c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f322940d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f322941e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f322942f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SimpleDraweeView f322943g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ImageButton f322944h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f322945i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final BadgeView f322946j;

    /* compiled from: PlanCheckoutView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/vas_planning_checkout/item/checkout/j$a;", "", "<init>", "()V", "", "ACTIVE_ITEM_ALPHA", "F", "INACTIVE_ITEM_ALPHA", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f322938b = view;
        this.f322939c = aVar;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f322940d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.price);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f322941e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.old_price);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f322942f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
        }
        this.f322943g = (SimpleDraweeView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.icon_cross);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        this.f322944h = (ImageButton) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.back_to_basket_button);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f322945i = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.badge);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.deprecated_design.badge_bar.BadgeView");
        }
        this.f322946j = (BadgeView) viewFindViewById7;
    }

    public final void B80(float f12) {
        C35872q c35872q = C35872q.f318976a;
        c35872q.getClass();
        this.f322940d.setAlpha(f12);
        c35872q.getClass();
        this.f322941e.setAlpha(f12);
        c35872q.getClass();
        this.f322942f.setAlpha(f12);
        c35872q.getClass();
        this.f322943g.setAlpha(f12);
    }

    @Override // com.avito.android.vas_planning_checkout.item.checkout.h
    public final void Eg(@k Y41.a<G0> aVar) {
        this.f322945i.setOnClickListener(new i(1, aVar));
    }

    @Override // com.avito.android.vas_planning_checkout.item.checkout.h
    public final void I1(@l String str) {
        this.f322946j.setText(str);
    }

    @Override // com.avito.android.vas_planning_checkout.item.checkout.h
    public final void XQ(@k Y41.a<G0> aVar) {
        this.f322944h.setOnClickListener(new i(0, aVar));
    }

    @Override // com.avito.android.vas_planning_checkout.item.checkout.h
    public final void YA(boolean z12) {
        TextView textView = this.f322945i;
        ImageButton imageButton = this.f322944h;
        if (!z12) {
            D6.w(imageButton);
            D6.w(textView);
        } else {
            B80(0.3f);
            D6.w(imageButton);
            D6.H(textView);
        }
    }

    @Override // com.avito.android.vas_planning_checkout.item.checkout.h
    public final void Z0(@l AttributedText attributedText) {
        I5.a(this.f322942f, this.f322939c.c(this.f322938b.getContext(), attributedText), false);
    }

    @Override // com.avito.android.vas_planning_checkout.item.checkout.h
    public final void av(boolean z12) {
        TextView textView = this.f322945i;
        ImageButton imageButton = this.f322944h;
        if (!z12) {
            D6.w(imageButton);
            D6.w(textView);
        } else {
            B80(1.0f);
            D6.H(imageButton);
            D6.w(textView);
        }
    }

    @Override // com.avito.android.vas_planning_checkout.item.checkout.h
    public final void e(@k AttributedText attributedText) {
        I5.a(this.f322940d, this.f322939c.c(this.f322938b.getContext(), attributedText), false);
    }

    @Override // com.avito.android.vas_planning_checkout.item.checkout.h
    public final void m4(int i12) {
        D6.f(this.f322938b, 0, 0, 0, i12, 7);
    }

    @Override // com.avito.android.vas_planning_checkout.item.checkout.h
    public final void p(@l String str) {
        I5.a(this.f322941e, str, false);
    }

    @Override // com.avito.android.vas_planning_checkout.item.checkout.h
    public final void x(@k com.avito.android.image_loader.k kVar) {
        C35949t5.c(this.f322943g, kVar, null, null, null, 14);
    }
}
