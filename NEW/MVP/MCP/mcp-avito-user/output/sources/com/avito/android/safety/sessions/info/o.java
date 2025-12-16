package com.avito.android.safety.sessions.info;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.remote.model.text.AttributedText;
import com.jakewharton.rxbinding4.view.C37722i;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SessionsInfoView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/sessions/info/o;", "Lcom/avito/android/safety/sessions/info/n;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f257982a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f257983b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f257984c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f257985d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f257986e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<G0> f257987f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final z<G0> f257988g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f257989h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f257990i;

    /* compiled from: SessionsInfoView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            com.jakewharton.rxrelay3.c<G0> cVar = o.this.f257987f;
            G0 g02 = G0.f406611a;
            cVar.accept(g02);
            return g02;
        }
    }

    public o(@Y61.k View view) {
        this.f257982a = view.getContext();
        View viewFindViewById = view.findViewById(R.id.sessions_info_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f257983b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.sessions_info_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f257984c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.sessions_info_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f257985d = viewFindViewById3;
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f257986e = cVar;
        com.jakewharton.rxrelay3.c<G0> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f257987f = cVar2;
        View viewFindViewById4 = view.findViewById(R.id.sessions_info_nav_bar);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        ((NavBar) viewFindViewById4).c(R.attr.ic_close24, new a());
        this.f257988g = C37722i.a(viewFindViewById3);
        this.f257989h = new C41981q0(cVar);
        this.f257990i = new C41981q0(cVar2);
    }

    public final void a(@Y61.k AttributedText attributedText) {
        attributedText.setOnDeepLinkClickListener(new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.query_link.e(this, 21));
        com.avito.android.util.text.j.c(this.f257984c, attributedText, null);
    }
}
