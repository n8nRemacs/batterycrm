package com.avito.android.safety.sessions.social_logout;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SessionsSocialLogoutView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/sessions/social_logout/w;", "Lcom/avito/android/safety/sessions/social_logout/v;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f258063a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f258064b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f258065c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Button f258066d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f258067e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final z<G0> f258068f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f258069g;

    /* compiled from: SessionsSocialLogoutView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c<G0> cVar = w.this.f258067e;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    public w(@Y61.k View view) {
        this.f258063a = view;
        View viewFindViewById = view.findViewById(R.id.sessions_social_logout_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f258064b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.sessions_social_logout_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f258065c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.sessions_social_logout_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById3;
        this.f258066d = button;
        com.jakewharton.rxrelay3.c<G0> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f258067e = cVar;
        View viewFindViewById4 = view.findViewById(R.id.sessions_social_logout_nav_bar);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        ((NavBar) viewFindViewById4).c(R.attr.ic_close24, new a());
        this.f258068f = C37722i.a(button);
        this.f258069g = new C41981q0(cVar);
    }

    public final void a(@Y61.k String str) {
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f258063a, com.avito.android.printable_text.b.f(str), null, null, null, null, 0, null, null, false, false, null, null, 4094);
    }
}
