package com.avito.android.rating.user_contacts;

import Cd.C13243a;
import Rg0.C15040a;
import Sg0.InterfaceC15184a;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.akita.view.component.pull_to_refresh.PullToRefresh;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.rating.UserContactsScreen;
import com.avito.android.rating.user_contacts.mvi.entity.a;
import com.avito.android.rating.user_contacts.mvi.entity.b;
import com.avito.android.util.P5;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import z1.AbstractC50339a;

/* compiled from: UserContactsActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating/user_contacts/UserContactsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class UserContactsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public static final a f247653z = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public q f247654m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f247655n = new O0(m0.f406844a.b(p.class), new g(), new f(new i()), new h());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.responsive.j f247656o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.responsive.e f247657p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f247658q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f247659r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public m f247660s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f247661t;

    /* renamed from: u, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f247662u;

    /* renamed from: v, reason: collision with root package name */
    public RecyclerView f247663v;

    /* renamed from: w, reason: collision with root package name */
    public ViewGroup f247664w;

    /* renamed from: x, reason: collision with root package name */
    public C42670a f247665x;

    /* renamed from: y, reason: collision with root package name */
    public PullToRefresh f247666y;

    /* compiled from: UserContactsActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/rating/user_contacts/UserContactsActivity$a;", "", "<init>", "()V", "", "ERROR_TOAST_DURATION", "I", "", "KEY_CONTEXT", "Ljava/lang/String;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UserContactsActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC15184a, G0> {
        public final void f(@Y61.k InterfaceC15184a interfaceC15184a) {
            UserContactsActivity userContactsActivity = (UserContactsActivity) this.receiver;
            a aVar = UserContactsActivity.f247653z;
            userContactsActivity.getClass();
            if (interfaceC15184a instanceof InterfaceC15184a.C1029a) {
                return;
            }
            if (!(interfaceC15184a instanceof InterfaceC15184a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC15184a.b bVar = (InterfaceC15184a.b) interfaceC15184a;
            c.a.C3719a c3719a = bVar.f15110c != null ? new c.a.C3719a(userContactsActivity.getString(R.string.user_contacts_error_toast_button), true, null, new com.avito.android.rating.user_contacts.h(userContactsActivity, bVar), 4, null) : null;
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            RecyclerView recyclerView = userContactsActivity.f247663v;
            if (recyclerView == null) {
                recyclerView = null;
            }
            com.avito.android.component.toast.c.b(cVar, recyclerView, bVar.f15109b, null, c3719a != null ? Collections.singletonList(c3719a) : null, null, new f.c(bVar.f15108a), 5000, null, null, false, false, new com.avito.android.rating.user_contacts.b(0, bVar, userContactsActivity), null, 3018);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC15184a interfaceC15184a) {
            f(interfaceC15184a);
            return G0.f406611a;
        }
    }

    /* compiled from: UserContactsActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<com.avito.android.rating.user_contacts.mvi.entity.b, G0> {
        public final void f(@Y61.k com.avito.android.rating.user_contacts.mvi.entity.b bVar) {
            UserContactsActivity userContactsActivity = (UserContactsActivity) this.receiver;
            PullToRefresh pullToRefresh = userContactsActivity.f247666y;
            if (pullToRefresh == null) {
                pullToRefresh = null;
            }
            b.InterfaceC7440b interfaceC7440b = bVar.f247811c;
            pullToRefresh.setState(new com.akita.view.component.pull_to_refresh.state.a(interfaceC7440b instanceof b.InterfaceC7440b.C7441b, false, new com.avito.android.rating.user_contacts.f(userContactsActivity)));
            if (interfaceC7440b instanceof b.InterfaceC7440b.a) {
                C42670a c42670a = userContactsActivity.f247665x;
                if (c42670a == null) {
                    c42670a = null;
                }
                C42670a.d(c42670a);
                RecyclerView recyclerView = userContactsActivity.f247663v;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                recyclerView.setVisibility(8);
                ViewGroup viewGroup = userContactsActivity.f247664w;
                (viewGroup != null ? viewGroup : null).setVisibility(8);
                return;
            }
            if (bVar.f247812d) {
                C42670a c42670a2 = userContactsActivity.f247665x;
                if (c42670a2 == null) {
                    c42670a2 = null;
                }
                c42670a2.c(null, new com.avito.android.rating.user_contacts.g(userContactsActivity));
                RecyclerView recyclerView2 = userContactsActivity.f247663v;
                if (recyclerView2 == null) {
                    recyclerView2 = null;
                }
                recyclerView2.setVisibility(8);
                ViewGroup viewGroup2 = userContactsActivity.f247664w;
                (viewGroup2 != null ? viewGroup2 : null).setVisibility(8);
                return;
            }
            List<com.avito.conveyor_item.a> list = bVar.f247810b;
            if (list.isEmpty()) {
                C42670a c42670a3 = userContactsActivity.f247665x;
                if (c42670a3 == null) {
                    c42670a3 = null;
                }
                c42670a3.b();
                RecyclerView recyclerView3 = userContactsActivity.f247663v;
                if (recyclerView3 == null) {
                    recyclerView3 = null;
                }
                recyclerView3.setVisibility(8);
                ViewGroup viewGroup3 = userContactsActivity.f247664w;
                (viewGroup3 != null ? viewGroup3 : null).setVisibility(0);
                return;
            }
            C42670a c42670a4 = userContactsActivity.f247665x;
            if (c42670a4 == null) {
                c42670a4 = null;
            }
            c42670a4.b();
            RecyclerView recyclerView4 = userContactsActivity.f247663v;
            if (recyclerView4 == null) {
                recyclerView4 = null;
            }
            recyclerView4.setVisibility(0);
            ViewGroup viewGroup4 = userContactsActivity.f247664w;
            if (viewGroup4 == null) {
                viewGroup4 = null;
            }
            viewGroup4.setVisibility(8);
            UV0.c cVar = new UV0.c(list);
            com.avito.android.recycler.responsive.e eVar = userContactsActivity.f247657p;
            if (eVar == null) {
                eVar = null;
            }
            eVar.c(cVar);
            m mVar = userContactsActivity.f247660s;
            if (mVar == null) {
                mVar = null;
            }
            mVar.b(cVar);
            com.avito.android.recycler.responsive.j jVar = userContactsActivity.f247656o;
            (jVar != null ? jVar : null).notifyDataSetChanged();
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(com.avito.android.rating.user_contacts.mvi.entity.b bVar) {
            f(bVar);
            return G0.f406611a;
        }
    }

    /* compiled from: UserContactsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/rating/user_contacts/mvi/entity/a;", "action", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/rating/user_contacts/mvi/entity/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<com.avito.android.rating.user_contacts.mvi.entity.a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.rating.user_contacts.mvi.entity.a aVar) {
            a aVar2 = UserContactsActivity.f247653z;
            UserContactsActivity.this.a2().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: UserContactsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = UserContactsActivity.f247653z;
            UserContactsActivity.this.a2().accept(a.d.f247805a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f247669l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f247669l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f247669l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return UserContactsActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return UserContactsActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: UserContactsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/rating/user_contacts/p;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/rating/user_contacts/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<p> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final p invoke() {
            q qVar = UserContactsActivity.this.f247654m;
            if (qVar == null) {
                qVar = null;
            }
            return (p) qVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.user_contacts;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("context");
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.rating.user_contacts.di.a.a().a((com.avito.android.rating.user_contacts.di.d) C29972i.a(C29972i.b(this), com.avito.android.rating.user_contacts.di.d.class), cv.c.a(this), bundle != null, getResources(), stringExtra, new C28478k(UserContactsScreen.f246406d, s.a(this), null, 4, null), new d(), new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f247662u;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f247662u;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, Q1());
    }

    public final p a2() {
        return (p) this.f247655n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) throws Resources.NotFoundException {
        String stringExtra;
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f247662u;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewFindViewById = findViewById(android.R.id.content);
        this.f247663v = (RecyclerView) findViewById(R.id.recycler);
        this.f247664w = (ViewGroup) findViewById(R.id.empty_state);
        this.f247666y = (PullToRefresh) findViewById(R.id.user_contacts_refresh);
        this.f247665x = new C42670a((ViewGroup) findViewById(R.id.content_container), new com.avito.android.rating.user_contacts.c(this), 0, 4, null);
        RecyclerView recyclerView = this.f247663v;
        M81.c cVar = new M81.c(viewFindViewById, recyclerView == null ? null : recyclerView, false, 4, null);
        cVar.g5(R.drawable.ic_back_24, null);
        C43175k.K(new C43197r1(new com.avito.android.rating.user_contacts.d(this, null), y.a(P5.g(cVar.f10415d))), C22981N.a(getLifecycle()));
        int integer = getResources().getInteger(R.integer.user_contacts_column_count);
        viewFindViewById.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(integer);
        gridLayoutManager.f53667M = new com.avito.android.rating.user_contacts.e(this, integer);
        RecyclerView recyclerView2 = this.f247663v;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView3 = this.f247663v;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        com.avito.konveyor.a aVar = this.f247658q;
        if (aVar == null) {
            aVar = null;
        }
        recyclerView3.l(new com.avito.android.rating.user_contacts.a(integer, getResources().getDimensionPixelOffset(R.dimen.user_contact_item_padding_horizontal), aVar), -1);
        RecyclerView recyclerView4 = this.f247663v;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        com.avito.android.recycler.responsive.j jVar = this.f247656o;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView4.setAdapter(jVar);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f247662u;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        RecyclerView recyclerView5 = this.f247663v;
        if (recyclerView5 == null) {
            recyclerView5 = null;
        }
        screenPerformanceTracker2.b(recyclerView5);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f247662u;
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null, a2(), new b(1, this, UserContactsActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsOneTimeEvent;)V", 0), new c(1, this, UserContactsActivity.class, "render", "render(Lcom/avito/android/rating/user_contacts/mvi/entity/UserContactsState;)V", 0));
        if (bundle == null && (stringExtra = getIntent().getStringExtra("context")) != null) {
            InterfaceC28373a interfaceC28373a = this.f247661t;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            interfaceC28373a.c(new C15040a(stringExtra));
        }
        ScreenPerformanceTracker screenPerformanceTracker4 = this.f247662u;
        (screenPerformanceTracker4 != null ? screenPerformanceTracker4 : null).d();
    }
}
