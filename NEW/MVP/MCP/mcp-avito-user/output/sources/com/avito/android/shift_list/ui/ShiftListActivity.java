package com.avito.android.shift_list.ui;

import Cd.C13243a;
import Vv0.AbstractC15720a;
import Vv0.c;
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
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MainScreenLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.shift_list.mvi.r;
import com.avito.android.shift_list.mvi.s;
import com.avito.android.shift_list.ui.list.load_more_item.ShiftListLoadMoreItem;
import java.util.ArrayList;
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

/* compiled from: ShiftListActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/shift_list/ui/ShiftListActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShiftListActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final a f281080s = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f281081m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public s f281082n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final O0 f281083o = new O0(m0.f406844a.b(r.class), new i(), new h(new k()), new j());

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f281084p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public RecyclerView.l f281085q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.shift_list.ui.f f281086r;

    /* compiled from: ShiftListActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/shift_list/ui/ShiftListActivity$a;", "", "<init>", "()V", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ShiftListActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = ShiftListActivity.f281080s;
            ShiftListActivity.this.a2().accept(AbstractC15720a.b.f17479a);
            return G0.f406611a;
        }
    }

    /* compiled from: ShiftListActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = ShiftListActivity.f281080s;
            ShiftListActivity.this.a2().accept(AbstractC15720a.d.f17481a);
            return G0.f406611a;
        }
    }

    /* compiled from: ShiftListActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = ShiftListActivity.f281080s;
            ShiftListActivity.this.a2().accept(AbstractC15720a.c.f17480a);
            return G0.f406611a;
        }
    }

    /* compiled from: ShiftListActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements l<Vv0.c, G0> {
        @Override // Y41.l
        public final G0 invoke(Vv0.c cVar) {
            ShiftListActivity shiftListActivity = (ShiftListActivity) this.receiver;
            a aVar = ShiftListActivity.f281080s;
            shiftListActivity.getClass();
            if (cVar instanceof c.a) {
                shiftListActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ShiftListActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LVv0/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LVv0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements l<Vv0.d, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Vv0.d dVar) {
            Vv0.d dVar2 = dVar;
            com.avito.android.shift_list.ui.f fVar = ShiftListActivity.this.f281086r;
            if (fVar == null) {
                fVar = null;
            }
            fVar.getClass();
            boolean z12 = false;
            int i12 = dVar2.f17496d ? 0 : 8;
            RecyclerView recyclerView = fVar.f281100c;
            recyclerView.setVisibility(i12);
            fVar.f281101d.setVisibility(dVar2.f17495c ? 0 : 8);
            Iterator<T> it = fVar.f281105h.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(dVar2.f17497e ? 0 : 8);
            }
            fVar.f281104g.setRefreshing(false);
            List<com.avito.conveyor_item.a> list = dVar2.f17494b;
            ArrayList arrayList = new ArrayList(list);
            C42745f0.l0(com.avito.android.shift_list.ui.g.f281108l, arrayList);
            boolean z13 = dVar2.f17498f;
            if (z13) {
                arrayList.add(new ShiftListLoadMoreItem(list.toString()));
            }
            fVar.f281098a.l(arrayList, null);
            if (!z13 && dVar2.f17499g) {
                z12 = true;
            }
            fVar.f281103f = z12;
            recyclerView.c0();
            return G0.f406611a;
        }
    }

    /* compiled from: ShiftListActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements l<DeepLink, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = ShiftListActivity.f281080s;
            ShiftListActivity.this.a2().accept(new AbstractC15720a.C1212a(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f281092l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Y41.a aVar) {
            super(0);
            this.f281092l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f281092l);
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
            return ShiftListActivity.this.getF42820b();
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
            return ShiftListActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: ShiftListActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/shift_list/mvi/r;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/shift_list/mvi/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<r> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final r invoke() {
            s sVar = ShiftListActivity.this.f281082n;
            if (sVar == null) {
                sVar = null;
            }
            return (r) sVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.job_shift_list_activity;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.shift_list.di.a.a().a(new g(), (com.avito.android.shift_list.di.c) C29972i.a(C29972i.b(this), com.avito.android.shift_list.di.c.class), cv.c.a(this)).a(this);
    }

    public final r a2() {
        return (r) this.f281083o.getValue();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        if (!isTaskRoot()) {
            super.onBackPressed();
            return;
        }
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f281081m;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, new MainScreenLink(null, null, false, 7, null), null, null, 6);
        finish();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        View viewFindViewById = findViewById(R.id.swipe_refresh_layout);
        com.avito.konveyor.adapter.d dVar = this.f281084p;
        com.avito.konveyor.adapter.d dVar2 = dVar != null ? dVar : null;
        RecyclerView.l lVar = this.f281085q;
        this.f281086r = new com.avito.android.shift_list.ui.f(viewFindViewById, dVar2, new b(), new c(), new d(), lVar != null ? lVar : null);
        com.avito.android.arch.mvi.android.f.b(this, a2(), new e(1, this, ShiftListActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/shift_list/models/ShiftListOneTimeEvent;)V", 0), new f());
    }
}
