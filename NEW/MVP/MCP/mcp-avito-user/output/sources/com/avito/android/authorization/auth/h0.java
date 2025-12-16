package com.avito.android.authorization.auth;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AuthView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auth/h0;", "Lcom/avito/android/authorization/auth/g0;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f93023a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f93024b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.lib.design.bottom_sheet.d f93025c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f93026d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f93027e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f93028f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f93029g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f93030h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Button f93031i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Button f93032j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f93033k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f93034l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f93035m;

    /* renamed from: n, reason: collision with root package name */
    public AttributedText f93036n;

    /* compiled from: AuthView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/lib/design/toast_bar/i;", "invoke", "()Lcom/avito/android/lib/design/toast_bar/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.lib.design.toast_bar.i> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f93038m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ApiError f93039n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Throwable f93040o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ApiError apiError, Throwable th2) {
            super(0);
            this.f93038m = str;
            this.f93039n = apiError;
            this.f93040o = th2;
        }

        @Override // Y41.a
        public final com.avito.android.lib.design.toast_bar.i invoke() {
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            View view = h0.this.f93023a;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(this.f93038m);
            f.c.f125255c.getClass();
            return com.avito.android.component.toast.c.b(cVar, view, printableTextF, null, null, null, f.c.a.a(this.f93039n, this.f93040o), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
        }
    }

    public h0(@Y61.k View view, @Y61.k View view2, @Y61.l com.avito.android.lib.design.bottom_sheet.d dVar, @Y61.k FrameLayout frameLayout) {
        this.f93023a = view;
        this.f93024b = view2;
        this.f93025c = dVar;
        this.f93026d = frameLayout;
        this.f93027e = LayoutInflater.from(view.getContext());
        View viewFindViewById = view.findViewById(R.id.social_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f93028f = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.shimmer_social_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f93029g = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.auth_progress);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f93030h = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.login);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f93031i = (Button) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.registration);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f93032j = (Button) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.auth_user_agreement);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById6;
        this.f93033k = textView;
        this.f93034l = new com.jakewharton.rxrelay3.c<>();
        this.f93035m = new com.jakewharton.rxrelay3.c<>();
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.authorization.auth.g0
    public final void a(@Y61.k String str, @Y61.k com.avito.android.social.button.f fVar, @Y61.k Y41.a<G0> aVar) {
        Drawable drawable;
        LayoutInflater layoutInflater = this.f93027e;
        ViewGroup viewGroup = this.f93028f;
        ImageButton imageButton = (ImageButton) layoutInflater.inflate(R.layout.auth_social_button, viewGroup, false);
        imageButton.setBackgroundResource(fVar.f284326a);
        View view = this.f93023a;
        int i12 = fVar.f284327b;
        Integer num = fVar.f284328c;
        if (num == null) {
            drawable = view.getContext().getDrawable(i12);
        } else {
            Drawable drawable2 = view.getContext().getDrawable(i12);
            if (drawable2 != null) {
                drawable2.setTintMode(PorterDuff.Mode.SRC_ATOP);
                drawable2.mutate().setTint(androidx.core.content.d.getColor(view.getContext(), num.intValue()));
                drawable = drawable2;
            } else {
                drawable = null;
            }
        }
        imageButton.setImageDrawable(drawable);
        imageButton.setTag(str);
        viewGroup.addView(imageButton);
        imageButton.setOnClickListener(new com.avito.android.advertising.ui.buzzoola.premium.a(5, aVar));
    }

    @Override // com.avito.android.authorization.auth.g0
    public final void b() {
        this.f93028f.removeAllViewsInLayout();
        this.f93029g.removeAllViewsInLayout();
    }

    @Override // com.avito.android.authorization.auth.g0
    public final void c(@Y61.l ApiError apiError, @Y61.k String str, @Y61.l Throwable th2) {
        D6.w(this.f93030h);
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f93025c;
        if (dVar != null) {
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
            f.c.f125255c.getClass();
            if (com.avito.android.component.toast.c.d(cVar, dVar, printableTextF, null, f.c.a.a(apiError, th2), 0, ToastBarPosition.f181046d, 942) != null) {
                return;
            }
        }
        new a(str, apiError, th2);
    }

    @Override // com.avito.android.authorization.auth.g0
    public final void d(boolean z12) {
        D6.G(this.f93029g, z12);
        D6.G(this.f93028f, !z12);
    }

    @Override // com.avito.android.authorization.auth.g0
    public final void e() {
        this.f93029g.addView(this.f93027e.inflate(R.layout.auth_social_skeleton, this.f93028f, false));
    }

    public final void f() {
        D6.h(this.f93028f);
    }

    public final void g() {
        D6.k(this.f93028f);
    }

    public final void h() {
        D6.w(this.f93030h);
    }

    public final void i() {
        D6.H(this.f93030h);
    }
}
