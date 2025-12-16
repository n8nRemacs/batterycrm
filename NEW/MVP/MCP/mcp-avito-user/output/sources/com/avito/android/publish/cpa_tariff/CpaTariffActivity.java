package com.avito.android.publish.cpa_tariff;

import Cd.C13243a;
import Kd0.InterfaceC14303a;
import Kd0.c;
import Y41.p;
import Y61.k;
import android.os.Bundle;
import android.widget.Toast;
import androidx.compose.runtime.internal.P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.publish.cpa_tariff.mvi.l;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: CpaTariffActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/cpa_tariff/CpaTariffActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CpaTariffActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f232420p = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public l f232421m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f232422n = new O0(m0.f406844a.b(com.avito.android.publish.cpa_tariff.mvi.k.class), new f(), new e(new i()), new g());

    /* renamed from: o, reason: collision with root package name */
    @k
    public final InterfaceC42726C f232423o = C42727D.c(new h());

    /* compiled from: CpaTariffActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "name", "phone", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<String, String, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, String str2) {
            int i12 = CpaTariffActivity.f232420p;
            ((com.avito.android.publish.cpa_tariff.mvi.k) CpaTariffActivity.this.f232422n.getValue()).accept(new InterfaceC14303a.b(str, str2));
            return G0.f406611a;
        }
    }

    /* compiled from: CpaTariffActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            int i12 = CpaTariffActivity.f232420p;
            ((com.avito.android.publish.cpa_tariff.mvi.k) CpaTariffActivity.this.f232422n.getValue()).accept(InterfaceC14303a.C0581a.f9541a);
            return G0.f406611a;
        }
    }

    /* compiled from: CpaTariffActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<Kd0.c, G0> {
        @Override // Y41.l
        public final G0 invoke(Kd0.c cVar) {
            Kd0.c cVar2 = cVar;
            CpaTariffActivity cpaTariffActivity = (CpaTariffActivity) this.receiver;
            int i12 = CpaTariffActivity.f232420p;
            cpaTariffActivity.getClass();
            if (cVar2 instanceof c.a) {
                cpaTariffActivity.finish();
            } else if (cVar2 instanceof c.b) {
                Toast.makeText(cpaTariffActivity, cpaTariffActivity.getString(R.string.cpa_tariff_success_toast), 1).show();
                cpaTariffActivity.finish();
            } else if (cVar2 instanceof c.C0583c) {
                com.avito.android.publish.cpa_tariff.c cVar3 = (com.avito.android.publish.cpa_tariff.c) cpaTariffActivity.f232423o.getValue();
                cVar3.getClass();
                com.avito.android.component.toast.c cVar4 = com.avito.android.component.toast.c.f125244a;
                ApiError apiError = ((c.C0583c) cVar2).f9556a;
                com.avito.android.component.toast.c.b(cVar4, cVar3.f232431a, com.avito.android.printable_text.b.f(apiError.getF244063c()), null, null, null, new f.c(apiError), 0, null, null, false, false, null, null, 4078);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CpaTariffActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<Kd0.d, G0> {
        @Override // Y41.l
        public final G0 invoke(Kd0.d dVar) {
            Kd0.d dVar2 = dVar;
            com.avito.android.publish.cpa_tariff.c cVar = (com.avito.android.publish.cpa_tariff.c) this.receiver;
            com.avito.android.publish.cpa_tariff.c.a(cVar.f232433c, dVar2.f9559a);
            com.avito.android.publish.cpa_tariff.c.a(cVar.f232434d, dVar2.f9560b);
            cVar.f232435e.setLoading(dVar2.f9561c);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f232426l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f232426l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f232426l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return CpaTariffActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return CpaTariffActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: CpaTariffActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/publish/cpa_tariff/c;", "invoke", "()Lcom/avito/android/publish/cpa_tariff/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<com.avito.android.publish.cpa_tariff.c> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.publish.cpa_tariff.c invoke() {
            return new com.avito.android.publish.cpa_tariff.c(CpaTariffActivity.this.K1());
        }
    }

    /* compiled from: CpaTariffActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/publish/cpa_tariff/mvi/k;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/publish/cpa_tariff/mvi/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<com.avito.android.publish.cpa_tariff.mvi.k> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.publish.cpa_tariff.mvi.k invoke() {
            l lVar = CpaTariffActivity.this.f232421m;
            if (lVar == null) {
                lVar = null;
            }
            return (com.avito.android.publish.cpa_tariff.mvi.k) lVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_cpa_tariff;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.publish.cpa_tariff.di.d.a().a((com.avito.android.publish.cpa_tariff.di.b) C29972i.a(C29972i.b(this), com.avito.android.publish.cpa_tariff.di.b.class), getIntent().getIntExtra("category_id", 0)).a(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC42726C interfaceC42726C = this.f232423o;
        com.avito.android.publish.cpa_tariff.c cVar = (com.avito.android.publish.cpa_tariff.c) interfaceC42726C.getValue();
        a aVar = new a();
        b bVar = new b();
        cVar.getClass();
        cVar.f232435e.setOnClickListener(new com.avito.android.profile.pro.impl.screen.item.recommendations.h(16, aVar, cVar));
        cVar.f232432b.setClickListener(new com.avito.android.publish.cpa_tariff.d(bVar));
        com.avito.android.arch.mvi.android.f.a((com.avito.android.publish.cpa_tariff.mvi.k) this.f232422n.getValue(), this, Lifecycle.State.f46682e, new c(1, this, CpaTariffActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/publish/cpa_tariff/mvi/entities/CpaTariffOneTimeEvent;)V", 0), new d(1, (com.avito.android.publish.cpa_tariff.c) interfaceC42726C.getValue(), com.avito.android.publish.cpa_tariff.c.class, "renderState", "renderState(Lcom/avito/android/publish/cpa_tariff/mvi/entities/CpaTariffState;)V", 0));
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        com.avito.android.publish.cpa_tariff.c cVar = (com.avito.android.publish.cpa_tariff.c) this.f232423o.getValue();
        cVar.f232435e.setOnClickListener(null);
        cVar.f232432b.setClickListener(null);
        super.onDestroy();
    }
}
