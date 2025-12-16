package com.avito.android.authorization.change_password;

import android.view.View;
import android.widget.ScrollView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.password_tip.PasswordTipInput;
import com.avito.android.util.K2;
import io.reactivex.rxjava3.internal.operators.observable.C;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChangeResettedPasswordView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/change_password/s;", "Lcom/avito/android/authorization/change_password/p;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s implements p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ScrollView f93376a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f93377b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Button f93378c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PasswordTipInput f93379d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C f93380e;

    public s(@Y61.k View view, @Y61.k ChangeResettedPasswordActivity changeResettedPasswordActivity) {
        View viewFindViewById = view.findViewById(R.id.change_password_scroll_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ScrollView");
        }
        this.f93376a = (ScrollView) viewFindViewById;
        this.f93377b = new com.jakewharton.rxrelay3.c<>();
        View viewFindViewById2 = view.findViewById(R.id.change_password_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f93378c = (Button) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.change_password_input);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.password_tip.PasswordTipInput");
        }
        this.f93379d = (PasswordTipInput) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.change_password_nav_bar);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        ((NavBar) viewFindViewById4).c(R.attr.ic_close24, new q(this));
        this.f93380e = K2.h(changeResettedPasswordActivity);
    }

    @Override // com.avito.android.keyboard_visibility.b
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final C getF93380e() {
        return this.f93380e;
    }

    public final void b() {
        this.f93376a.post(new com.avito.android.app.coldstart.d(this, 5));
    }
}
