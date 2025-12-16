package com.avito.android.authorization.upgrade_password;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.password_tip.PasswordTipInput;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.observable.W;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: UpgradePasswordView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/upgrade_password/E;", "Lcom/avito/android/authorization/upgrade_password/D;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class E implements D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f94749a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f94750b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f94751c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Button f94752d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final PasswordTipInput f94753e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ScrollView f94754f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f94755g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final W f94756h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f94757i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f94758j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxbinding4.a f94759k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G0> f94760l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.C f94761m;

    /* compiled from: UpgradePasswordView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c<G0> cVar = E.this.f94750b;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    /* compiled from: UpgradePasswordView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "test", "(Lkotlin/G0;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.r {
        public b() {
        }

        @Override // l41.r
        public final boolean test(Object obj) {
            return E.this.f94753e.b();
        }
    }

    public E(@Y61.k View view, @Y61.k ActivityC22955m activityC22955m) {
        this.f94749a = view;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f94750b = cVar;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f94751c = cVar2;
        View viewFindViewById = view.findViewById(R.id.upgrade_password_nav_bar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        NavBar navBar = (NavBar) viewFindViewById;
        navBar.c(R.attr.ic_close24, new a());
        com.avito.android.lib.design.text_view.a aVarB = navBar.b(com.avito.android.printable_text.b.c(R.string.upgrade_password_try_later, new Serializable[0]));
        aVarB.setOnClickListener(new com.avito.android.advert.item.consultation.B(this, 24));
        Resources resources = aVarB.getResources();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        aVarB.setTextColor(resources.getColor(R.color.gray54, null));
        navBar.setActions(aVarB);
        View viewFindViewById2 = view.findViewById(R.id.upgrade_password_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById2;
        this.f94752d = button;
        View viewFindViewById3 = view.findViewById(R.id.upgrade_password_input);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.password_tip.PasswordTipInput");
        }
        PasswordTipInput passwordTipInput = (PasswordTipInput) viewFindViewById3;
        this.f94753e = passwordTipInput;
        View viewFindViewById4 = view.findViewById(R.id.upgrade_password_scroll_view);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ScrollView");
        }
        this.f94754f = (ScrollView) viewFindViewById4;
        this.f94755g = (TextView) view.findViewById(R.id.upgrade_password_subtitle);
        this.f94756h = C37722i.a(button).i0(passwordTipInput.getDoneCallbacks()).N(new b());
        this.f94757i = new C41981q0(cVar2);
        this.f94758j = new C41981q0(cVar);
        this.f94759k = passwordTipInput.getTextChanges();
        this.f94760l = passwordTipInput.getOnFocused();
        this.f94761m = K2.h(activityC22955m);
    }

    @Override // com.avito.android.keyboard_visibility.b
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final io.reactivex.rxjava3.internal.operators.observable.C getF94761m() {
        return this.f94761m;
    }

    public final void b() {
        K2.d(this.f94749a, true);
    }

    public final void c() {
        this.f94754f.post(new com.avito.android.app.coldstart.d(this, 6));
    }

    public final void d(@Y61.k ApiError apiError, @Y61.k String str) {
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f94749a, com.avito.android.printable_text.b.f(str), null, null, null, new f.c(apiError), 0, null, null, false, false, null, null, 4078);
    }

    public final void e(@Y61.k String str) {
        PasswordTipInput passwordTipInput = this.f94753e;
        passwordTipInput.d(str);
        passwordTipInput.e();
    }

    public final void f() {
        D6.h(this.f94753e);
        Button button = this.f94752d;
        button.setClickable(false);
        button.setLoading(true);
    }
}
