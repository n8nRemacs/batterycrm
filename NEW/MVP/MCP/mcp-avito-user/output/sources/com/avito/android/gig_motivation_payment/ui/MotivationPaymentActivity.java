package com.avito.android.gig_motivation_payment.ui;

import Cd.C13243a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.compose.j;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.gig_motivation_payment.ui.e;
import com.avito.android.util.C35961v3;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: MotivationPaymentActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/gig_motivation_payment/ui/MotivationPaymentActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MotivationPaymentActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public e.a f160111m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final O0 f160112n = new O0(m0.f406844a.b(com.avito.android.gig_motivation_payment.ui.e.class), new c(), new b(new e()), new d());

    /* renamed from: o, reason: collision with root package name */
    @k
    public final Object f160113o = C35961v3.a(this);

    /* compiled from: MotivationPaymentActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<A, Integer, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, r.c(-644847503, new com.avito.android.gig_motivation_payment.ui.c(MotivationPaymentActivity.this), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f160115l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar) {
            super(0);
            this.f160115l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f160115l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<S0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return MotivationPaymentActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<AbstractC50339a> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return MotivationPaymentActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: MotivationPaymentActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/gig_motivation_payment/ui/e;", "invoke", "()Lcom/avito/android/gig_motivation_payment/ui/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<com.avito.android.gig_motivation_payment.ui.e> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.gig_motivation_payment.ui.e invoke() {
            e.a aVar = MotivationPaymentActivity.this.f160111m;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.create();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        com.avito.android.gig_motivation_payment.di.a.a().a((MotivationPaymentOpenParams) this.f160113o.getValue(), (com.avito.android.gig_motivation_payment.di.c) C29972i.a(C29972i.b(this), Object.class), cv.c.a(this)).a(this);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        j.a(this, new C22096n(-353084500, new a(), true));
    }
}
