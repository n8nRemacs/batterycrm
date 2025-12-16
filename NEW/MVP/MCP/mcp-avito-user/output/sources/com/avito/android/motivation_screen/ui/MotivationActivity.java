package com.avito.android.motivation_screen.ui;

import Cd.C13243a;
import android.os.Bundle;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.motivation_screen.models.MotivationParams;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35961v3;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import v20.AbstractC49151b;
import v20.C49152c;
import z1.AbstractC50339a;

/* compiled from: MotivationActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/motivation_screen/ui/MotivationActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "Lv20/c;", VoiceInfo.STATE, "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MotivationActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public static final a f206395p = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.motivation_screen.mvi.r f206396m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f206397n = new O0(m0.f406844a.b(com.avito.android.motivation_screen.mvi.q.class), new f(), new e(new h()), new g());

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Object f206398o = C35961v3.a(this);

    /* compiled from: MotivationActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/motivation_screen/ui/MotivationActivity$a;", "", "<init>", "()V", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MotivationActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
        public b() {
            super(2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                a aVar = MotivationActivity.f206395p;
                MotivationActivity motivationActivity = MotivationActivity.this;
                InterfaceC22204y1 interfaceC22204y1B = C22126m3.b(motivationActivity.a2().getState(), a13);
                if (((C49152c) interfaceC22204y1B.getF42167b()).f440415l) {
                    a13.C(-956660008);
                    x.a(new C32851f(motivationActivity), a13, 0);
                    a13.h();
                } else if (((C49152c) interfaceC22204y1B.getF42167b()).f440416m) {
                    a13.C(-956655107);
                    o.a(motivationActivity.getString(R.string.job_motivation_screen_error_title), motivationActivity.getString(R.string.job_motivation_screen_error_description), motivationActivity.getString(R.string.job_motivation_screen_error_button), new C32852g(motivationActivity), new C32853h(motivationActivity), a13, 0);
                    a13.h();
                } else {
                    a13.C(408942172);
                    F.a((C49152c) interfaceC22204y1B.getF42167b(), new i(motivationActivity), new j(motivationActivity), a13, 8);
                    a13.h();
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MotivationActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends kotlin.jvm.internal.H implements Y41.l<AbstractC49151b, G0> {
        @Override // Y41.l
        public final G0 invoke(AbstractC49151b abstractC49151b) {
            MotivationActivity motivationActivity = (MotivationActivity) this.receiver;
            a aVar = MotivationActivity.f206395p;
            motivationActivity.getClass();
            if (L.f(abstractC49151b, AbstractC49151b.a.f440403a)) {
                motivationActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: MotivationActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv20/c;", "it", "Lkotlin/G0;", "invoke", "(Lv20/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<C49152c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f206400l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(C49152c c49152c) {
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f206401l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f206401l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f206401l);
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
            return MotivationActivity.this.getF42820b();
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
            return MotivationActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: MotivationActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/motivation_screen/mvi/q;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/motivation_screen/mvi/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<com.avito.android.motivation_screen.mvi.q> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.motivation_screen.mvi.q invoke() {
            com.avito.android.motivation_screen.mvi.r rVar = MotivationActivity.this.f206396m;
            if (rVar == null) {
                rVar = null;
            }
            return (com.avito.android.motivation_screen.mvi.q) rVar.get();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.motivation_screen.di.a.a().a(((MotivationParams) this.f206398o.getValue()).f206336b, (com.avito.android.motivation_screen.di.c) C29972i.a(C29972i.b(this), com.avito.android.motivation_screen.di.c.class), cv.c.a(this)).a(this);
    }

    public final com.avito.android.motivation_screen.mvi.q a2() {
        return (com.avito.android.motivation_screen.mvi.q) this.f206397n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        androidx.view.compose.j.a(this, new C22096n(1434582890, new b(), true));
        com.avito.android.arch.mvi.android.f.a(a2(), this, Lifecycle.State.f46681d, new c(1, this, MotivationActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/motivation_screen/models/MotivationOneTimeEvent;)V", 0), d.f206400l);
    }
}
