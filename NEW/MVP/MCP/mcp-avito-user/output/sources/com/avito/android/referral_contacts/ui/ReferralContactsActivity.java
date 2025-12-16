package com.avito.android.referral_contacts.ui;

import Cd.C13243a;
import Ui0.C15525a;
import Ui0.C15527c;
import Ui0.InterfaceC15526b;
import Ui0.d;
import Ui0.e;
import Y41.l;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.referral_contacts.ReferralContactsPerfScreen;
import com.avito.android.referral_contacts.contacts_list.ContactItem;
import com.avito.android.referral_contacts.mvi.q;
import com.avito.android.referral_contacts.mvi.r;
import com.avito.android.util.D6;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import z1.AbstractC50339a;

/* compiled from: ReferralContactsActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/referral_contacts/ui/ReferralContactsActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ReferralContactsActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final a f252574r = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public r f252575m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f252576n = new O0(m0.f406844a.b(q.class), new i(), new h(new k()), new j());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f252577o;

    /* renamed from: p, reason: collision with root package name */
    public com.avito.android.referral_contacts.ui.f f252578p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f252579q;

    /* compiled from: ReferralContactsActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/referral_contacts/ui/ReferralContactsActivity$a;", "", "<init>", "()V", "_avito_referral-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ReferralContactsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements l<DeepLink, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = ReferralContactsActivity.f252574r;
            ReferralContactsActivity.this.a2().accept(new d.a(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: ReferralContactsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = ReferralContactsActivity.f252574r;
            ReferralContactsActivity.this.a2().accept(d.c.f16565a);
            return G0.f406611a;
        }
    }

    /* compiled from: ReferralContactsActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements l<String, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = ReferralContactsActivity.f252574r;
            ReferralContactsActivity.this.a2().accept(new d.e(str));
            return G0.f406611a;
        }
    }

    /* compiled from: ReferralContactsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = ReferralContactsActivity.f252574r;
            ReferralContactsActivity.this.a2().accept(d.C1138d.f16566a);
            return G0.f406611a;
        }
    }

    /* compiled from: ReferralContactsActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements l<Ui0.e, G0> {
        @Override // Y41.l
        public final G0 invoke(Ui0.e eVar) {
            ReferralContactsActivity referralContactsActivity = (ReferralContactsActivity) this.receiver;
            a aVar = ReferralContactsActivity.f252574r;
            referralContactsActivity.getClass();
            if (eVar instanceof e.a) {
                referralContactsActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ReferralContactsActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends H implements l<Ui0.f, G0> {
        @Override // Y41.l
        public final G0 invoke(Ui0.f fVar) {
            String str;
            String str2;
            Ui0.f fVar2 = fVar;
            com.avito.android.referral_contacts.ui.f fVar3 = (com.avito.android.referral_contacts.ui.f) this.receiver;
            fVar3.getClass();
            InterfaceC15526b.a aVar = InterfaceC15526b.a.f16558a;
            InterfaceC15526b interfaceC15526b = fVar2.f16576i;
            boolean zF2 = L.f(interfaceC15526b, aVar);
            ShimmerLayout shimmerLayout = fVar3.f252595f;
            ViewGroup viewGroup = fVar3.f252597h;
            RecyclerView recyclerView = fVar3.f252593d;
            PrintableText printableTextF = null;
            ContentPlaceholder contentPlaceholder = fVar3.f252596g;
            Button button = fVar3.f252594e;
            if (zF2) {
                D6.w(shimmerLayout);
                shimmerLayout.d();
                C15527c c15527c = fVar2.f16577j;
                PrintableText printableTextF2 = (c15527c == null || (str2 = c15527c.f16561a) == null) ? null : com.avito.android.printable_text.b.f(str2);
                if (c15527c != null && (str = c15527c.f16562b) != null) {
                    printableTextF = com.avito.android.printable_text.b.f(str);
                }
                PrintableText printableText = printableTextF;
                if (printableTextF2 == null) {
                    printableTextF2 = com.avito.android.printable_text.b.c(R.string.referral_contacts_error_title, new Serializable[0]);
                }
                contentPlaceholder.setState(new WU.a(Integer.valueOf(R.drawable.img_unknown_error_216_160), printableTextF2, printableText, com.avito.android.printable_text.b.c(R.string.referral_contacts_error_button_text, new Serializable[0]), new com.avito.android.position_in_search.stats.screen.old_position_in_search.view.widget.toolbar.a(fVar3, 26)));
                D6.H(contentPlaceholder);
                D6.w(button);
                D6.w(recyclerView);
                D6.w(viewGroup);
            } else {
                boolean zF3 = L.f(interfaceC15526b, InterfaceC15526b.C1137b.f16559a);
                Input input = fVar3.f252592c;
                if (zF3) {
                    D6.H(input);
                    D6.H(recyclerView);
                    D6.w(shimmerLayout);
                    shimmerLayout.d();
                    button.setLoading(false);
                    D6.w(contentPlaceholder);
                    D6.H(viewGroup);
                    C15525a c15525a = fVar2.f16575h;
                    fVar3.f252598i = c15525a.f16557b;
                    List<ContactItem> list = fVar2.f16569b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        ContactItem contactItem = (ContactItem) obj;
                        String str3 = contactItem.f252397b;
                        String str4 = fVar2.f16570c;
                        if (C43066x.q(str3, str4, true) || C43066x.q(contactItem.f252398c, str4, true)) {
                            arrayList.add(obj);
                        }
                    }
                    fVar3.f252590a.l(arrayList, null);
                    button.setText(c15525a.f16556a);
                    input.setHint(fVar2.f16574g);
                } else if (L.f(interfaceC15526b, InterfaceC15526b.c.f16560a)) {
                    D6.H(shimmerLayout);
                    shimmerLayout.c();
                    D6.w(input);
                    D6.w(recyclerView);
                    button.setLoading(true);
                    D6.w(contentPlaceholder);
                    D6.H(viewGroup);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f252584l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f252584l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f252584l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return ReferralContactsActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return ReferralContactsActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ReferralContactsActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/referral_contacts/mvi/q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/referral_contacts/mvi/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<q> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final q invoke() {
            r rVar = ReferralContactsActivity.this.f252575m;
            if (rVar == null) {
                rVar = null;
            }
            return (q) rVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.referral_contacts_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.referral_contacts.di.a.a().a(getResources(), (com.avito.android.referral_contacts.di.c) C29972i.a(C29972i.b(this), com.avito.android.referral_contacts.di.c.class), cv.c.a(this), new C28478k(ReferralContactsPerfScreen.f252374d, s.a(this), null, 4, null)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f252579q;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final q a2() {
        return (q) this.f252576n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f252579q;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.referral_contacts_root);
        com.avito.konveyor.adapter.d dVar = this.f252577o;
        this.f252578p = new com.avito.android.referral_contacts.ui.f(frameLayout, dVar != null ? dVar : null, new b(), new c(), new d(), new e());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f252579q;
        ScreenPerformanceTracker screenPerformanceTracker3 = screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null;
        q qVarA2 = a2();
        f fVar = new f(1, this, ReferralContactsActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/referral_contacts/models/ReferralContactsOneTimeEvent;)V", 0);
        com.avito.android.referral_contacts.ui.f fVar2 = this.f252578p;
        com.avito.android.analytics.screens.mvi.a.c(this, screenPerformanceTracker3, qVarA2, fVar, new g(1, fVar2 == null ? null : fVar2, com.avito.android.referral_contacts.ui.f.class, "render", "render(Lcom/avito/android/referral_contacts/models/ReferralContactsUiState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker4 = this.f252579q;
        (screenPerformanceTracker4 != null ? screenPerformanceTracker4 : null).d();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onResume() {
        super.onResume();
        a2().accept(d.b.f16564a);
    }
}
