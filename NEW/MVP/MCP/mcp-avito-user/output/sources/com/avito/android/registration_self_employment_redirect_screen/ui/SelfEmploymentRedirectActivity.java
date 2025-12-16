package com.avito.android.registration_self_employment_redirect_screen.ui;

import Cd.C13243a;
import VU.b;
import Xi0.C17014a;
import Yi0.C18268a;
import aj0.AbstractC19901b;
import aj0.d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.nav_bar.a;
import com.avito.android.registration_self_employment_redirect_screen.models.ButtonAction;
import com.avito.android.registration_self_employment_redirect_screen.mvi.p;
import com.avito.android.registration_self_employment_redirect_screen.mvi.q;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35835l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: SelfEmploymentRedirectActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/registration_self_employment_redirect_screen/ui/SelfEmploymentRedirectActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SelfEmploymentRedirectActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final a f252782r = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f252783m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public q f252784n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final O0 f252785o = new O0(m0.f406844a.b(p.class), new j(), new i(new l()), new k());

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public C17014a f252786p;

    /* renamed from: q, reason: collision with root package name */
    public SelfEmploymentRedirectRenderer f252787q;

    /* compiled from: SelfEmploymentRedirectActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/registration_self_employment_redirect_screen/ui/SelfEmploymentRedirectActivity$a;", "", "<init>", "()V", "_avito_gig_registration-self-employment-redirect-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SelfEmploymentRedirectActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[ButtonAction.Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ButtonAction.Type type = ButtonAction.Type.f252737b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: SelfEmploymentRedirectActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/registration_self_employment_redirect_screen/models/ButtonAction;", "action", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/registration_self_employment_redirect_screen/models/ButtonAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<ButtonAction, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ButtonAction buttonAction) {
            C17014a c17014a;
            ButtonAction buttonAction2 = buttonAction;
            a aVar = SelfEmploymentRedirectActivity.f252782r;
            SelfEmploymentRedirectActivity selfEmploymentRedirectActivity = SelfEmploymentRedirectActivity.this;
            selfEmploymentRedirectActivity.a2().accept(new AbstractC19901b.a(buttonAction2));
            int iOrdinal = buttonAction2.f252735b.ordinal();
            if (iOrdinal == 0) {
                C17014a c17014a2 = selfEmploymentRedirectActivity.f252786p;
                c17014a = c17014a2 != null ? c17014a2 : null;
                c17014a.f19042a.c(new C18268a(c17014a.f19043b.a(), c17014a.f19045d.getF253025a(), c17014a.f19044c.now()));
            } else if (iOrdinal == 1) {
                C17014a c17014a3 = selfEmploymentRedirectActivity.f252786p;
                c17014a = c17014a3 != null ? c17014a3 : null;
                c17014a.f19042a.c(new Yi0.c(c17014a.f19043b.a(), c17014a.f19045d.getF253025a(), c17014a.f19044c.now()));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelfEmploymentRedirectActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SelfEmploymentRedirectActivity.f252782r;
            SelfEmploymentRedirectActivity selfEmploymentRedirectActivity = SelfEmploymentRedirectActivity.this;
            selfEmploymentRedirectActivity.a2().accept(AbstractC19901b.c.f21128a);
            C17014a c17014a = selfEmploymentRedirectActivity.f252786p;
            if (c17014a == null) {
                c17014a = null;
            }
            c17014a.f19042a.c(new Yi0.b(c17014a.f19043b.a(), c17014a.f19045d.getF253025a(), c17014a.f19044c.now()));
            return G0.f406611a;
        }
    }

    /* compiled from: SelfEmploymentRedirectActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<DeepLink, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = SelfEmploymentRedirectActivity.f252782r;
            SelfEmploymentRedirectActivity.this.a2().accept(new AbstractC19901b.d(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: SelfEmploymentRedirectActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class f extends H implements Y41.l<aj0.d, G0> {
        @Override // Y41.l
        public final G0 invoke(aj0.d dVar) {
            SelfEmploymentRedirectActivity selfEmploymentRedirectActivity = (SelfEmploymentRedirectActivity) this.receiver;
            a aVar = SelfEmploymentRedirectActivity.f252782r;
            selfEmploymentRedirectActivity.getClass();
            if (dVar instanceof d.a) {
                selfEmploymentRedirectActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelfEmploymentRedirectActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Laj0/e;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Laj0/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<aj0.e, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(aj0.e eVar) {
            boolean z12;
            int i12;
            aj0.e eVar2 = eVar;
            SelfEmploymentRedirectRenderer selfEmploymentRedirectRenderer = SelfEmploymentRedirectActivity.this.f252787q;
            if (selfEmploymentRedirectRenderer == null) {
                selfEmploymentRedirectRenderer = null;
            }
            selfEmploymentRedirectRenderer.f252805i.setText(eVar2.f21139a);
            selfEmploymentRedirectRenderer.f252806j.setText(eVar2.f21140b);
            selfEmploymentRedirectRenderer.f252798b.l(eVar2.f21141c, null);
            NavBar navBar = selfEmploymentRedirectRenderer.f252803g;
            Drawable drawableH = C35835l0.h(R.attr.ic_callCenter24, navBar.getContext());
            navBar.setState(com.avito.android.lib.design.nav_bar.a.a(eVar2.f21144f, null, null, null, null, eVar2.f21145g ? C42745f0.V(drawableH != null ? new a.C5289a(drawableH, null, null, 0, 0, 0, 62, null) : null) : null, new com.avito.android.registration_self_employment_redirect_screen.ui.f(eVar2, selfEmploymentRedirectRenderer), 31));
            List<ButtonAction> list = eVar2.f21142d;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                ConstraintLayout constraintLayout = selfEmploymentRedirectRenderer.f252797a;
                if (!zHasNext) {
                    Iterator it2 = C42745f0.q0(arrayList).iterator();
                    Button button = null;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Button button2 = (Button) it2.next();
                        int dimension = (int) constraintLayout.getResources().getDimension(R.dimen.self_employment_button_margin_horizontal);
                        int dimension2 = (int) constraintLayout.getResources().getDimension(R.dimen.self_employment_button_margin_bottom_to_parent);
                        int dimension3 = (int) constraintLayout.getResources().getDimension(R.dimen.self_employment_button_margin_bottom_to_button);
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        dVar.g(constraintLayout);
                        int i13 = dimension2;
                        dVar.j(button2.getId(), 6, 0, 6, dimension);
                        dVar.j(button2.getId(), 7, 0, 7, dimension);
                        int id2 = button2.getId();
                        int id3 = button != null ? button.getId() : 0;
                        int i14 = button == null ? 4 : 3;
                        if (button != null) {
                            i13 = dimension3;
                        }
                        dVar.j(id2, 4, id3, i14, i13);
                        dVar.c(constraintLayout);
                        button = button2;
                    }
                    if (!arrayList.isEmpty()) {
                        Button button3 = (Button) C42745f0.E(arrayList);
                        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                        dVar2.g(constraintLayout);
                        dVar2.i(selfEmploymentRedirectRenderer.f252804h.getId(), 4, button3.getId(), 3);
                        dVar2.c(constraintLayout);
                    }
                    ArrayList arrayList2 = selfEmploymentRedirectRenderer.f252809m;
                    arrayList2.addAll(arrayList);
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        boolean zHasNext2 = it3.hasNext();
                        z12 = eVar2.f21146h;
                        int i15 = 8;
                        if (!zHasNext2) {
                            break;
                        }
                        View view = (View) it3.next();
                        if (z12) {
                            i15 = 0;
                        }
                        view.setVisibility(i15);
                    }
                    selfEmploymentRedirectRenderer.f252807k.setVisibility(eVar2.f21148j ? 0 : 8);
                    selfEmploymentRedirectRenderer.f252808l.setVisibility(eVar2.f21147i ? 0 : 8);
                    if (z12) {
                        C17014a c17014a = selfEmploymentRedirectRenderer.f252802f;
                        c17014a.f19042a.c(new Yi0.d(c17014a.f19043b.a(), c17014a.f19045d.getF253025a(), c17014a.f19044c.now()));
                    }
                    return G0.f406611a;
                }
                ButtonAction buttonAction = (ButtonAction) it.next();
                int iOrdinal = buttonAction.f252735b.ordinal();
                if (iOrdinal == 0) {
                    i12 = R.attr.buttonPrimaryLarge;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i12 = R.attr.buttonSecondaryLarge;
                }
                Button button4 = new Button(constraintLayout.getContext(), null, 0, 0, 14, null);
                button4.setId(View.generateViewId());
                button4.setText(buttonAction.f252734a);
                b.a aVar = VU.b.f17147t;
                Context context = constraintLayout.getContext();
                int iJ2 = C35835l0.j(i12, constraintLayout.getContext());
                aVar.getClass();
                button4.setStyle(b.a.c(iJ2, context));
                button4.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                button4.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(18, selfEmploymentRedirectRenderer, buttonAction));
                constraintLayout.addView(button4, button4.getLayoutParams());
                arrayList.add(button4);
            }
        }
    }

    /* compiled from: SelfEmploymentRedirectActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = SelfEmploymentRedirectActivity.f252782r;
            SelfEmploymentRedirectActivity.this.a2().accept(AbstractC19901b.C1504b.f21127a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f252793l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f252793l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f252793l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return SelfEmploymentRedirectActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return SelfEmploymentRedirectActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: SelfEmploymentRedirectActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/registration_self_employment_redirect_screen/mvi/p;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/registration_self_employment_redirect_screen/mvi/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<p> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final p invoke() {
            q qVar = SelfEmploymentRedirectActivity.this.f252784n;
            if (qVar == null) {
                qVar = null;
            }
            return (p) qVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.gig_registration_self_employment_redirect_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.registration_self_employment_redirect_screen.di.a.a().a(new h(), (com.avito.android.registration_self_employment_redirect_screen.di.d) C29972i.a(C29972i.b(this), com.avito.android.registration_self_employment_redirect_screen.di.d.class), cv.c.a(this)).a(this);
    }

    public final p a2() {
        return (p) this.f252785o.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.self_employment_root);
        com.avito.konveyor.adapter.d dVar = this.f252783m;
        com.avito.konveyor.adapter.d dVar2 = dVar != null ? dVar : null;
        c cVar = new c();
        d dVar3 = new d();
        e eVar = new e();
        C17014a c17014a = this.f252786p;
        this.f252787q = new SelfEmploymentRedirectRenderer(constraintLayout, dVar2, cVar, dVar3, eVar, c17014a != null ? c17014a : null);
        com.avito.android.arch.mvi.android.f.a(a2(), this, Lifecycle.State.f46681d, new f(1, this, SelfEmploymentRedirectActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/registration_self_employment_redirect_screen/models/SelfEmploymentRedirectOneTimeEvent;)V", 0), new g());
    }
}
