package com.avito.android.developments_advice;

import Cd.C13243a;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.developments_advice.c;
import com.avito.android.developments_advice.remote.model.CallInterval;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.phone_confirmation.P;
import com.avito.android.remote.model.ConsultationFormData;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import com.avito.android.util.K2;
import com.avito.android.util.L4;
import com.avito.android.util.O2;
import com.google.android.material.snackbar.Snackbar;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import mw.C44146c;
import mw.InterfaceC44144a;
import mw.InterfaceC44145b;
import z1.AbstractC50339a;

/* compiled from: ConsultationFormActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/developments_advice/ConsultationFormActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/developments_advice/c$a;", "<init>", "()V", "a", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ConsultationFormActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b, c.a {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f135957t = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public P f135958m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f135959n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public r f135960o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f135961p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public L4 f135962q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final O0 f135963r = new O0(m0.f406844a.b(q.class), new e(), new d(new g()), new f());

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public j f135964s;

    /* compiled from: ConsultationFormActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_advice/ConsultationFormActivity$a;", "", "<init>", "()V", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: ConsultationFormActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC44145b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC44145b interfaceC44145b) {
            InterfaceC44145b interfaceC44145b2 = interfaceC44145b;
            ConsultationFormActivity consultationFormActivity = (ConsultationFormActivity) this.receiver;
            int i12 = ConsultationFormActivity.f135957t;
            consultationFormActivity.getClass();
            if (interfaceC44145b2 instanceof InterfaceC44145b.g) {
                j jVar = consultationFormActivity.f135964s;
                if (jVar != null) {
                    String str = ((InterfaceC44145b.g) interfaceC44145b2).f414814a;
                    if (str == null) {
                        Input.f179303W.getClass();
                        jVar.f136111j.setState(Input.f179305b0);
                    } else {
                        jVar.f136110i.m(str, ComponentContainer.Condition.f178858c);
                    }
                }
            } else if (interfaceC44145b2 instanceof InterfaceC44145b.f) {
                j jVar2 = consultationFormActivity.f135964s;
                if (jVar2 != null) {
                    String str2 = ((InterfaceC44145b.f) interfaceC44145b2).f414813a;
                    if (str2 == null) {
                        Input.f179303W.getClass();
                        jVar2.f136109h.setState(Input.f179305b0);
                    } else {
                        jVar2.f136108g.m(str2, ComponentContainer.Condition.f178858c);
                    }
                }
            } else if (interfaceC44145b2 instanceof InterfaceC44145b.h) {
                j jVar3 = consultationFormActivity.f135964s;
                if (jVar3 != null) {
                    String str3 = ((InterfaceC44145b.h) interfaceC44145b2).f414815a;
                    if (str3 == null) {
                        Input.f179303W.getClass();
                        jVar3.f136107f.setState(Input.f179305b0);
                    } else {
                        jVar3.f136106e.m(str3, ComponentContainer.Condition.f178858c);
                    }
                }
            } else if (interfaceC44145b2 instanceof InterfaceC44145b.i) {
                j jVar4 = consultationFormActivity.f135964s;
                if (jVar4 != null) {
                    Snackbar.j(jVar4.f136104c, ((InterfaceC44145b.i) interfaceC44145b2).f414816a, -1).l();
                }
            } else if (interfaceC44145b2 instanceof InterfaceC44145b.d) {
                DeepLink deepLink = ((InterfaceC44145b.d) interfaceC44145b2).f414811a;
                com.avito.android.deeplink_handler.handler.composite.a aVar = consultationFormActivity.f135959n;
                if (aVar == null) {
                    aVar = null;
                }
                b.a.a(aVar, deepLink, null, null, 6);
            } else if (interfaceC44145b2 instanceof InterfaceC44145b.e) {
                InterfaceC44145b.e eVar = (InterfaceC44145b.e) interfaceC44145b2;
                P p12 = consultationFormActivity.f135958m;
                if (p12 == null) {
                    p12 = null;
                }
                consultationFormActivity.startActivityForResult(p12.a(eVar.f414812a, null, false, true), 0);
            } else if (interfaceC44145b2 instanceof InterfaceC44145b.a) {
                K2.c(consultationFormActivity);
                consultationFormActivity.finish();
            } else if (interfaceC44145b2 instanceof InterfaceC44145b.C11849b) {
                K2.c(consultationFormActivity);
                Intent intent = new Intent();
                intent.putExtra("extra_success_result", true);
                G0 g02 = G0.f406611a;
                consultationFormActivity.setResult(-1, intent);
                DeepLink deepLink2 = ((InterfaceC44145b.C11849b) interfaceC44145b2).f414809a;
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = consultationFormActivity.f135959n;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, deepLink2, null, null, 6);
                consultationFormActivity.finish();
            } else if (interfaceC44145b2 instanceof InterfaceC44145b.c) {
                String string = ((InterfaceC44145b.c) interfaceC44145b2).f414810a;
                if (string == null) {
                    string = consultationFormActivity.getString(R.string.consultation_success_toast);
                }
                Intent intent2 = new Intent();
                intent2.putExtra("extra_message", string);
                intent2.putExtra("extra_success_result", true);
                G0 g03 = G0.f406611a;
                consultationFormActivity.setResult(-1, intent2);
                K2.c(consultationFormActivity);
                consultationFormActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ConsultationFormActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmw/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lmw/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<C44146c, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C44146c c44146c) {
            Object next;
            j jVar;
            j jVar2;
            int i12 = 0;
            C44146c c44146c2 = c44146c;
            int i13 = ConsultationFormActivity.f135957t;
            ConsultationFormActivity consultationFormActivity = ConsultationFormActivity.this;
            boolean z12 = c44146c2.f414819b;
            ConsultationFormData consultationFormData = c44146c2.f414820c;
            if (z12) {
                if (consultationFormData != null && (jVar = consultationFormActivity.f135964s) != null) {
                    jVar.a(consultationFormData);
                }
                j jVar3 = consultationFormActivity.f135964s;
                if (jVar3 != null) {
                    String str = c44146c2.f414821d;
                    if (str != null) {
                        Input.t(jVar3.f136109h, str, false, 6);
                    }
                    String str2 = c44146c2.f414822e;
                    if (str2 != null) {
                        Input.t(jVar3.f136111j, str2, false, 6);
                    }
                    List<CallInterval> list = c44146c2.f414826i;
                    if (list == null) {
                        list = C42784z0.f406748b;
                    }
                    jVar3.f136119r = list;
                    boolean zA2 = O2.a(list);
                    ComponentContainer componentContainer = jVar3.f136112k;
                    if (zA2) {
                        Iterator<T> it = jVar3.f136119r.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            if (((CallInterval) next).f136192b) {
                                break;
                            }
                        }
                        if (next == null) {
                            ((CallInterval) C42745f0.E(jVar3.f136119r)).f136192b = true;
                        }
                        for (CallInterval callInterval : jVar3.f136119r) {
                            if (callInterval.f136192b) {
                                String strA = k.a(callInterval);
                                Input input = jVar3.f136113l;
                                Input.t(input, strA, false, 6);
                                input.setOnClickListener(new com.avito.android.developments_advice.d(jVar3, i12));
                                D6.H(componentContainer);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    D6.w(componentContainer);
                }
                j jVar4 = consultationFormActivity.f135964s;
                if (jVar4 != null) {
                    jVar4.f136121t = c44146c2.f414823f;
                }
                if (c44146c2.f414827j) {
                    if (jVar4 != null) {
                        jVar4.f136114m.setLoading(true);
                    }
                } else if (jVar4 != null) {
                    jVar4.f136114m.setLoading(false);
                }
            } else if (consultationFormData != null && (jVar2 = consultationFormActivity.f135964s) != null) {
                jVar2.a(consultationFormData);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f135966l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f135966l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f135966l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return ConsultationFormActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return ConsultationFormActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ConsultationFormActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/developments_advice/q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/developments_advice/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<q> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final q invoke() {
            r rVar = ConsultationFormActivity.this.f135960o;
            if (rVar == null) {
                rVar = null;
            }
            return (q) rVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_consultation_form;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        ConsultationFormData consultationFormData;
        String str5;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        String stringExtra = getIntent().getStringExtra("advert_id");
        if (stringExtra != null) {
            str = stringExtra;
        } else if (bundle != null) {
            stringExtra = bundle.getString("advert_id");
            str = stringExtra;
        } else {
            str = null;
        }
        String stringExtra2 = getIntent().getStringExtra("development_id");
        if (stringExtra2 != null) {
            str2 = stringExtra2;
        } else if (bundle != null) {
            stringExtra2 = bundle.getString("development_id");
            str2 = stringExtra2;
        } else {
            str2 = null;
        }
        String stringExtra3 = getIntent().getStringExtra("developer_id");
        if (stringExtra3 != null) {
            str3 = stringExtra3;
        } else if (bundle != null) {
            stringExtra3 = bundle.getString("developer_id");
            str3 = stringExtra3;
        } else {
            str3 = null;
        }
        String stringExtra4 = getIntent().getStringExtra("development_offer_id");
        if (stringExtra4 != null) {
            str4 = stringExtra4;
        } else if (bundle != null) {
            stringExtra4 = bundle.getString("development_offer_id");
            str4 = stringExtra4;
        } else {
            str4 = null;
        }
        ConsultationFormData consultationFormData2 = (ConsultationFormData) getIntent().getParcelableExtra("form");
        if (consultationFormData2 != null) {
            consultationFormData = consultationFormData2;
        } else if (bundle != null) {
            consultationFormData2 = (ConsultationFormData) bundle.getParcelable("form");
            consultationFormData = consultationFormData2;
        } else {
            consultationFormData = null;
        }
        String stringExtra5 = getIntent().getStringExtra("request_type");
        if (stringExtra5 != null) {
            str5 = stringExtra5;
        } else if (bundle != null) {
            stringExtra5 = bundle.getString("request_type");
            str5 = stringExtra5;
        } else {
            str5 = null;
        }
        Intent intent = getIntent();
        boolean z12 = false;
        if (bundle != null && bundle.getBoolean("choose_callback_time")) {
            z12 = true;
        }
        boolean booleanExtra = intent.getBooleanExtra("choose_callback_time", z12);
        String stringExtra6 = getIntent().getStringExtra("x_hash");
        com.avito.android.developments_advice.di.k.a().a((com.avito.android.developments_advice.di.f) C29972i.a(C29972i.b(this), com.avito.android.developments_advice.di.f.class), cv.c.a(this), com.avito.android.analytics.screens.s.a(this), consultationFormData, str, str2, str3, str4, str5, Boolean.valueOf(booleanExtra), stringExtra6 == null ? bundle != null ? bundle.getString("x_hash") : null : stringExtra6, getIntent().getStringExtra("mcid")).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f135961p;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final q a2() {
        return (q) this.f135963r.getValue();
    }

    public final void b2(@Y61.k DeepLink deepLink) {
        a2().accept(new InterfaceC44144a.c(deepLink));
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        if (i12 == 0) {
            a2().accept(new InterfaceC44144a.C11848a(i13));
        } else {
            super.onActivityResult(i12, i13, intent);
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f135961p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewK1 = K1();
        L4 l42 = this.f135962q;
        if (l42 == null) {
            l42 = null;
        }
        this.f135964s = new j(viewK1, this, l42);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f135961p;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2, a2(), new b(1, this, ConsultationFormActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/developments_advice/mvi/entity/DevelopmentsAdviceOneTimeEvent;)V", 0), new c());
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f135961p;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C44146c value = a2().getState().getValue();
        bundle.putParcelable("form", value.f414820c);
        Boolean bool = value.f414828k;
        bundle.putBoolean("choose_callback_time", bool != null ? bool.booleanValue() : false);
    }
}
