package com.avito.android.social_management;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SocialManagementView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social_management/Q;", "Lcom/avito/android/social_management/P;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Q implements P {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final M81.c f284463a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_overlay.l f284464b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f284465c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final View f284466d;

    public Q(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.j jVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        View viewFindViewById = view.findViewById(R.id.social_management_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        M81.c cVar = new M81.c(view, recyclerView, false, 4, null);
        cVar.f10415d.setTitle(R.string.social_networks);
        cVar.g5(R.drawable.ic_close_24_blue, null);
        this.f284463a = cVar;
        View viewFindViewById2 = view.findViewById(R.id.content_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f284464b = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById2, R.id.social_management_recycler, interfaceC28373a, 0, 0, 24, null);
        View viewFindViewById3 = view.findViewById(R.id.progress);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f284465c = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.content_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f284466d = viewFindViewById4;
        recyclerView.setAdapter(jVar);
        RecyclerView.j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f53829c = 250L;
        }
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.l(new S(), -1);
    }

    public final void a() {
        this.f284464b.j();
        D6.w(this.f284465c);
    }

    public final void b(@Y61.k String str) {
        this.f284464b.a(str);
    }

    public final void c(@Y61.k String str, @Y61.l Throwable th2) {
        f.c cVarB;
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        PrintableText printableTextF = com.avito.android.printable_text.b.f(str);
        if (th2 != null) {
            cVarB = new f.c(th2);
        } else {
            f.c.f125255c.getClass();
            cVarB = f.c.a.b();
        }
        com.avito.android.component.toast.c.b(cVar, this.f284466d, printableTextF, null, null, null, cVarB, 0, null, null, false, false, null, null, 4078);
    }

    public final void d() {
        this.f284464b.j();
        D6.H(this.f284465c);
    }

    public final void e(@Y61.k PrintableText printableText) {
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f284466d, printableText, null, null, null, null, 0, ToastBarPosition.f181047e, null, false, false, null, null, 4030);
    }
}
