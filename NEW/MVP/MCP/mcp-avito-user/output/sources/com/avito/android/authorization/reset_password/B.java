package com.avito.android.authorization.reset_password;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ResetPasswordView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/reset_password/B;", "Lcom/avito/android/authorization/reset_password/A;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class B implements A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f94098a = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f94099b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Input f94100c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f94101d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f94102e;

    /* compiled from: ResetPasswordView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c<G0> cVar = B.this.f94098a;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    public B(@Y61.k View view) {
        View viewFindViewById = view.findViewById(R.id.reset_password_content_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f94099b = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.reset_password_nav_bar);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        ((NavBar) viewFindViewById2).c(R.attr.ic_close24, new a());
        View viewFindViewById3 = view.findViewById(R.id.reset_password_login_input);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById3;
        input.setInputType(33);
        this.f94100c = input;
        View viewFindViewById4 = view.findViewById(R.id.reset_password_login_input_cc);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f94101d = (ComponentContainer) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.reset_password_button);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f94102e = (Button) viewFindViewById5;
    }

    public final void a() {
        Input input = this.f94100c;
        D6.k(input);
        Button button = this.f94102e;
        button.setClickable(true);
        button.setLoading(false);
        input.v();
        input.q();
    }

    public final void b(@Y61.k String str) {
        Input.t(this.f94100c, str, false, 6);
    }

    public final void c(@Y61.k String str) {
        ComponentContainer.n(this.f94101d, str, 2);
    }
}
