package com.avito.android.payment_list.ui;

import Cd.C13243a;
import E60.a;
import E60.c;
import Y41.l;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.payment_list.mvi.r;
import com.avito.android.payment_list.mvi.s;
import com.avito.android.payment_list.ui.list.load_more_item.PaymentLoadMoreItem;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: PaymentListActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/payment_list/ui/PaymentListActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PaymentListActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final a f215010r = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public s f215011m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f215012n = new O0(m0.f406844a.b(r.class), new i(), new h(new k()), new j());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f215013o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public RecyclerView.l f215014p;

    /* renamed from: q, reason: collision with root package name */
    public com.avito.android.payment_list.ui.f f215015q;

    /* compiled from: PaymentListActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/payment_list/ui/PaymentListActivity$a;", "", "<init>", "()V", "_avito_gig_payment-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PaymentListActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = PaymentListActivity.f215010r;
            PaymentListActivity.this.a2().accept(a.b.f3769a);
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentListActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = PaymentListActivity.f215010r;
            PaymentListActivity.this.a2().accept(a.d.f3771a);
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentListActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = PaymentListActivity.f215010r;
            PaymentListActivity.this.a2().accept(a.c.f3770a);
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentListActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements l<E60.c, G0> {
        @Override // Y41.l
        public final G0 invoke(E60.c cVar) {
            E60.c cVar2 = cVar;
            PaymentListActivity paymentListActivity = (PaymentListActivity) this.receiver;
            a aVar = PaymentListActivity.f215010r;
            paymentListActivity.getClass();
            if (cVar2 instanceof c.a) {
                paymentListActivity.finish();
            } else if (cVar2 instanceof c.b) {
                com.avito.android.payment_list.ui.f fVar = paymentListActivity.f215015q;
                if (fVar == null) {
                    fVar = null;
                }
                fVar.getClass();
                com.avito.android.component.toast.c cVar3 = com.avito.android.component.toast.c.f125244a;
                PrintableText printableTextC = com.avito.android.printable_text.b.c(R.string.payment_list_load_more_error, new Serializable[0]);
                f.c cVar4 = new f.c(new IllegalStateException("loadMore error"));
                ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
                View view = fVar.f215027a;
                com.avito.android.component.toast.c.b(cVar3, view, printableTextC, null, Collections.singletonList(new c.a.C3719a(view.getResources().getString(R.string.payment_list_error_button_text), false, null, fVar.f215029c, 6, null)), null, cVar4, 0, toastBarPosition, null, false, false, null, null, 4010);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentListActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LE60/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LE60/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements l<E60.d, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(E60.d dVar) {
            E60.d dVar2 = dVar;
            com.avito.android.payment_list.ui.f fVar = PaymentListActivity.this.f215015q;
            if (fVar == null) {
                fVar = null;
            }
            fVar.getClass();
            int i12 = dVar2.f3785c ? 0 : 8;
            RecyclerView recyclerView = fVar.f215030d;
            recyclerView.setVisibility(i12);
            fVar.f215031e.setVisibility(dVar2.f3784b ? 0 : 8);
            Iterator<T> it = fVar.f215034h.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(dVar2.f3786d ? 0 : 8);
            }
            boolean z12 = dVar2.f3787e;
            fVar.f215032f = !z12 && dVar2.f3788f;
            fVar.f215033g.setRefreshing(false);
            List<com.avito.conveyor_item.a> list = dVar2.f3783a;
            ArrayList arrayList = new ArrayList(list);
            C42745f0.l0(com.avito.android.payment_list.ui.g.f215036l, arrayList);
            if (z12) {
                arrayList.add(new PaymentLoadMoreItem(list.toString()));
            }
            fVar.f215028b.l(arrayList, null);
            recyclerView.c0();
            return G0.f406611a;
        }
    }

    /* compiled from: PaymentListActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements l<DeepLink, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = PaymentListActivity.f215010r;
            PaymentListActivity.this.a2().accept(new a.C0216a(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f215021l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f215021l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f215021l);
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
            return PaymentListActivity.this.getF42820b();
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
            return PaymentListActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: PaymentListActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/payment_list/mvi/r;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/payment_list/mvi/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<r> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final r invoke() {
            s sVar = PaymentListActivity.this.f215011m;
            if (sVar == null) {
                sVar = null;
            }
            return (r) sVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.payment_list_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.payment_list.di.a.a().a(new g(), (com.avito.android.payment_list.di.c) C29972i.a(C29972i.b(this), com.avito.android.payment_list.di.c.class), cv.c.a(this)).a(this);
    }

    public final r a2() {
        return (r) this.f215012n.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        View viewFindViewById = findViewById(R.id.swipe_refresh_layout);
        com.avito.konveyor.adapter.d dVar = this.f215013o;
        com.avito.konveyor.adapter.d dVar2 = dVar != null ? dVar : null;
        RecyclerView.l lVar = this.f215014p;
        this.f215015q = new com.avito.android.payment_list.ui.f(viewFindViewById, dVar2, new b(), new c(), new d(), lVar != null ? lVar : null);
        com.avito.android.arch.mvi.android.f.b(this, a2(), new e(1, this, PaymentListActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/payment_list/models/PaymentListOneTimeEvent;)V", 0), new f());
    }
}
