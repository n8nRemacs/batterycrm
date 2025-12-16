package com.avito.android.esia_redirect_screen.ui;

import Cd.C13243a;
import Gz.C13934a;
import Iz.AbstractC14176a;
import Iz.d;
import Y41.l;
import Y61.k;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.esia_redirect_screen.buttons_list.EsiaRedirectButtonsBaseItem;
import com.avito.android.esia_redirect_screen.buttons_list.link_item.EsiaRedirectButtonsLinkItem;
import com.avito.android.esia_redirect_screen.buttons_list.primary_item.EsiaRedirectButtonsPrimaryItem;
import com.avito.android.esia_redirect_screen.buttons_list.secondary_item.EsiaRedirectButtonsSecondaryItem;
import com.avito.android.esia_redirect_screen.mvi.q;
import com.avito.android.esia_redirect_screen.mvi.r;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.nav_bar.a;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35835l0;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: EsiaRedirectActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/esia_redirect_screen/ui/EsiaRedirectActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_gig_esia-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EsiaRedirectActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f148095s = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public r f148096m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f148097n = new O0(m0.f406844a.b(q.class), new h(), new g(new j()), new i());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f148098o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f148099p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public C13934a f148100q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.esia_redirect_screen.ui.h f148101r;

    /* compiled from: EsiaRedirectActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            int i12 = EsiaRedirectActivity.f148095s;
            EsiaRedirectActivity esiaRedirectActivity = EsiaRedirectActivity.this;
            esiaRedirectActivity.a2().accept(AbstractC14176a.d.f8669a);
            C13934a c13934a = esiaRedirectActivity.f148100q;
            if (c13934a == null) {
                c13934a = null;
            }
            c13934a.f6898a.c(new Hz.c(c13934a.f6899b.a(), c13934a.f6901d.getF253025a(), c13934a.f6900c.now()));
            return G0.f406611a;
        }
    }

    /* compiled from: EsiaRedirectActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<DeepLink, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            int i12 = EsiaRedirectActivity.f148095s;
            EsiaRedirectActivity.this.a2().accept(new AbstractC14176a.c(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: EsiaRedirectActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements l<Iz.d, G0> {
        @Override // Y41.l
        public final G0 invoke(Iz.d dVar) {
            EsiaRedirectActivity esiaRedirectActivity = (EsiaRedirectActivity) this.receiver;
            int i12 = EsiaRedirectActivity.f148095s;
            esiaRedirectActivity.getClass();
            if (dVar instanceof d.a) {
                esiaRedirectActivity.setResult(-1);
                esiaRedirectActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EsiaRedirectActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIz/e;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LIz/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<Iz.e, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Iz.e eVar) {
            boolean z12;
            Iz.e eVar2 = eVar;
            com.avito.android.esia_redirect_screen.ui.h hVar = EsiaRedirectActivity.this.f148101r;
            if (hVar == null) {
                hVar = null;
            }
            Iterator<T> it = hVar.f148120f.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                z12 = eVar2.f8688f;
                int i12 = 8;
                if (!zHasNext) {
                    break;
                }
                RecyclerView recyclerView = (RecyclerView) it.next();
                if (z12) {
                    i12 = 0;
                }
                recyclerView.setVisibility(i12);
            }
            Iterator<T> it2 = hVar.f148121g.iterator();
            while (it2.hasNext()) {
                ((Spinner) it2.next()).setVisibility(eVar2.f8689g ? 0 : 8);
            }
            Iterator<T> it3 = hVar.f148122h.iterator();
            while (it3.hasNext()) {
                ((ContentPlaceholder) it3.next()).setVisibility(eVar2.f8690h ? 0 : 8);
            }
            Iterator<T> it4 = hVar.f148123i.iterator();
            while (it4.hasNext()) {
                ((ContentPlaceholder) it4.next()).setVisibility(eVar2.f8691i ? 0 : 8);
            }
            NavBar navBar = hVar.f148119e;
            Drawable drawableH = C35835l0.h(R.attr.ic_callCenter24, navBar.getContext());
            navBar.setState(com.avito.android.lib.design.nav_bar.a.a(eVar2.f8686d, null, null, null, null, eVar2.f8687e ? C42745f0.V(drawableH != null ? new a.C5289a(drawableH, null, null, 0, 0, 0, 62, null) : null) : null, new com.avito.android.esia_redirect_screen.ui.g(eVar2, hVar), 31));
            hVar.f148116b.l(eVar2.f8683a, null);
            hVar.f148117c.l(eVar2.f8684b, null);
            if (z12) {
                C13934a c13934a = hVar.f148118d;
                c13934a.f6898a.c(new Hz.e(c13934a.f6899b.a(), c13934a.f6901d.getF253025a(), c13934a.f6900c.now()));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EsiaRedirectActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/esia_redirect_screen/buttons_list/EsiaRedirectButtonsBaseItem;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/esia_redirect_screen/buttons_list/EsiaRedirectButtonsBaseItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<EsiaRedirectButtonsBaseItem, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(EsiaRedirectButtonsBaseItem esiaRedirectButtonsBaseItem) {
            C13934a c13934a;
            EsiaRedirectButtonsBaseItem esiaRedirectButtonsBaseItem2 = esiaRedirectButtonsBaseItem;
            int i12 = EsiaRedirectActivity.f148095s;
            EsiaRedirectActivity esiaRedirectActivity = EsiaRedirectActivity.this;
            esiaRedirectActivity.a2().accept(new AbstractC14176a.b(esiaRedirectButtonsBaseItem2.getF147960d()));
            if (esiaRedirectButtonsBaseItem2 instanceof EsiaRedirectButtonsPrimaryItem) {
                C13934a c13934a2 = esiaRedirectActivity.f148100q;
                c13934a = c13934a2 != null ? c13934a2 : null;
                c13934a.f6898a.c(new Hz.b(c13934a.f6899b.a(), c13934a.f6901d.getF253025a(), c13934a.f6900c.now()));
            } else if (esiaRedirectButtonsBaseItem2 instanceof EsiaRedirectButtonsSecondaryItem) {
                C13934a c13934a3 = esiaRedirectActivity.f148100q;
                c13934a = c13934a3 != null ? c13934a3 : null;
                c13934a.f6898a.c(new Hz.d(c13934a.f6899b.a(), c13934a.f6901d.getF253025a(), c13934a.f6900c.now()));
            } else if (esiaRedirectButtonsBaseItem2 instanceof EsiaRedirectButtonsLinkItem) {
                C13934a c13934a4 = esiaRedirectActivity.f148100q;
                c13934a = c13934a4 != null ? c13934a4 : null;
                c13934a.f6898a.c(new Hz.a(c13934a.f6899b.a(), c13934a.f6901d.getF253025a(), c13934a.f6900c.now()));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EsiaRedirectActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            int i12 = EsiaRedirectActivity.f148095s;
            EsiaRedirectActivity.this.a2().accept(AbstractC14176a.C0497a.f8666a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f148107l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f148107l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f148107l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return EsiaRedirectActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return EsiaRedirectActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: EsiaRedirectActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/esia_redirect_screen/mvi/q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/esia_redirect_screen/mvi/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<q> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final q invoke() {
            r rVar = EsiaRedirectActivity.this.f148096m;
            if (rVar == null) {
                rVar = null;
            }
            return (q) rVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.esia_redirect_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.esia_redirect_screen.di.i.a().a(new e(), new f(), (com.avito.android.esia_redirect_screen.di.l) C29972i.a(C29972i.b(this), com.avito.android.esia_redirect_screen.di.l.class), cv.c.a(this)).a(this);
    }

    public final q a2() {
        return (q) this.f148097n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        View viewFindViewById = findViewById(R.id.esia_redirect_root);
        com.avito.konveyor.adapter.d dVar = this.f148098o;
        com.avito.konveyor.adapter.d dVar2 = dVar != null ? dVar : null;
        com.avito.konveyor.adapter.d dVar3 = this.f148099p;
        com.avito.konveyor.adapter.d dVar4 = dVar3 != null ? dVar3 : null;
        C13934a c13934a = this.f148100q;
        this.f148101r = new com.avito.android.esia_redirect_screen.ui.h(viewFindViewById, new a(), new b(), dVar2, dVar4, c13934a != null ? c13934a : null);
        com.avito.android.arch.mvi.android.f.a(a2(), this, Lifecycle.State.f46681d, new c(1, this, EsiaRedirectActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/esia_redirect_screen/models/EsiaRedirectOneTimeEvent;)V", 0), new d());
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        a2().accept(AbstractC14176a.d.f8669a);
    }
}
