package com.avito.android.authorization.login;

import android.content.res.Resources;
import android.text.Editable;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.L5;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import qe.InterfaceC47389a;

/* compiled from: LoginView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/login/Q;", "Lqe/a;", "Lcom/avito/android/authorization/login/O;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Q implements InterfaceC47389a, O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f93991a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f93992b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f93993c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f93994d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f93995e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f93996f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Input f93997g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f93998h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Input f93999i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Button f94000j;

    /* compiled from: LoginView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ((Number) obj).intValue();
            Q.this.f93999i.requestFocus();
        }
    }

    /* compiled from: LoginView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c<G0> cVar = Q.this.f93992b;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    public Q(@Y61.k View view) {
        int i12 = 0;
        io.reactivex.rxjava3.disposables.c cVar = new io.reactivex.rxjava3.disposables.c();
        this.f93991a = cVar;
        this.f93992b = new com.jakewharton.rxrelay3.c<>();
        this.f93993c = new com.jakewharton.rxrelay3.c<>();
        View viewFindViewById = view.findViewById(R.id.login_content_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f93994d = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.login_nav_bar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        NavBar navBar = (NavBar) viewFindViewById2;
        navBar.c(R.attr.ic_close24, new b());
        com.avito.android.lib.design.text_view.a aVarB = navBar.b(com.avito.android.printable_text.b.c(R.string.forgot_password, new Serializable[0]));
        aVarB.setOnClickListener(new com.avito.android.advert.item.consultation.B(this, 23));
        Resources resources = aVarB.getResources();
        ThreadLocal<TypedValue> threadLocal = androidx.core.content.res.i.f44673a;
        aVarB.setTextColor(resources.getColor(R.color.gray54, null));
        navBar.setActions(aVarB);
        this.f93995e = (TextView) view.findViewById(R.id.login_subtitle);
        View viewFindViewById3 = view.findViewById(R.id.login_input_cc);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f93996f = (ComponentContainer) viewFindViewById3;
        Input input = (Input) view.findViewById(R.id.login_input);
        cVar.b(com.avito.android.lib.design.input.n.a(input, 5).t0(new a()));
        input.setInputType(33);
        this.f93997g = input;
        View viewFindViewById4 = view.findViewById(R.id.login_pw_input_cc);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f93998h = (ComponentContainer) viewFindViewById4;
        Input input2 = (Input) view.findViewById(R.id.login_pw_input);
        l0.a aVar = new l0.a();
        aVar.f406838b = true;
        CE0.a.a(input2, true, null, null);
        input2.setRightIconListener(new P(aVar, input2, i12));
        input2.setInputType(144);
        this.f93999i = input2;
        View viewFindViewById5 = view.findViewById(R.id.login_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f94000j = (Button) viewFindViewById5;
    }

    public final void a() {
        K2.d(this.f93994d, true);
    }

    public final void b() {
        ComponentContainer componentContainer = this.f93996f;
        componentContainer.q(componentContainer.f178848i);
    }

    public final void c() {
        ComponentContainer componentContainer = this.f93998h;
        componentContainer.q(componentContainer.f178848i);
    }

    public final void d() {
        Button button = this.f94000j;
        button.setLoading(false);
        button.setClickable(true);
        D6.k(this.f93997g);
        D6.k(this.f93999i);
    }

    public final void e(@Y61.l Boolean bool) {
        Editable editableM53getText;
        boolean zF2 = kotlin.jvm.internal.L.f(bool, Boolean.FALSE);
        Input input = this.f93997g;
        if (!zF2 && (bool != null || !D6.y(input) || (editableM53getText = input.m53getText()) == null || editableM53getText.length() != 0)) {
            input = this.f93999i;
        }
        input.v();
        input.q();
    }

    public final void f(@Y61.k String str) {
        ComponentContainer.n(this.f93996f, str, 2);
    }

    public final void g(@Y61.k String str) {
        ComponentContainer.n(this.f93998h, str, 2);
    }

    public final void h() {
        Button button = this.f94000j;
        button.setLoading(true);
        button.setClickable(false);
        D6.h(this.f93997g);
        D6.h(this.f93999i);
        b();
        c();
    }

    public final void i(@Y61.k String str) {
        L5.b(this.f93994d.getContext(), str, 1);
    }

    public final void j() {
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.auth_common_error, new Serializable[0]);
        f.c.f125255c.getClass();
        com.avito.android.component.toast.c.b(cVar, this.f93994d, printableTextC, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
    }
}
