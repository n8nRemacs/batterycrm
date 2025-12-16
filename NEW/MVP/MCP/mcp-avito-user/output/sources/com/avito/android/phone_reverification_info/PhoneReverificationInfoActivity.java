package com.avito.android.phone_reverification_info;

import Cd.C13243a;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.inline_filters.dialog.select.ViewOnClickListenerC31042l;
import com.avito.android.lib.design.button.Button;
import com.avito.android.phone_reverification_info.PhoneReverificationInfo;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import nI0.InterfaceC44261b;
import x70.C49782a;
import y70.InterfaceC50077b;
import z1.AbstractC50339a;

/* compiled from: PhoneReverificationInfoActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/phone_reverification_info/PhoneReverificationInfoActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PhoneReverificationInfoActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f216041v = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public l f216042m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final O0 f216043n = new O0(m0.f406844a.b(k.class), new d(), new c(new f()), new e());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f216044o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public InterfaceC44261b f216045p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f216046q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.h f216047r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public C49782a f216048s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public Button f216049t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public Button f216050u;

    /* compiled from: PhoneReverificationInfoActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<InterfaceC50077b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC50077b interfaceC50077b) {
            InterfaceC50077b interfaceC50077b2 = interfaceC50077b;
            PhoneReverificationInfoActivity phoneReverificationInfoActivity = (PhoneReverificationInfoActivity) this.receiver;
            int i12 = PhoneReverificationInfoActivity.f216041v;
            phoneReverificationInfoActivity.getClass();
            if (interfaceC50077b2 instanceof InterfaceC50077b.a) {
                phoneReverificationInfoActivity.setResult(0);
                phoneReverificationInfoActivity.finish();
            } else if (interfaceC50077b2 instanceof InterfaceC50077b.c) {
                Intent intent = new Intent();
                intent.putExtra("extra_phone_reverification_result", ((InterfaceC50077b.c) interfaceC50077b2).f442947a);
                G0 g02 = G0.f406611a;
                phoneReverificationInfoActivity.setResult(-1, intent);
                phoneReverificationInfoActivity.finish();
            } else if (L.f(interfaceC50077b2, InterfaceC50077b.C12888b.f442946a)) {
                InterfaceC44261b interfaceC44261b = phoneReverificationInfoActivity.f216045p;
                if (interfaceC44261b == null) {
                    interfaceC44261b = null;
                }
                phoneReverificationInfoActivity.startActivity(InterfaceC44261b.a.a(interfaceC44261b, null, null, null, null, 23).addFlags(268468224));
                phoneReverificationInfoActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: PhoneReverificationInfoActivity.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly70/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Ly70/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<y70.c, G0> {
        public b() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.List] */
        @Override // Y41.l
        public final G0 invoke(y70.c cVar) {
            Button button;
            y70.c cVar2 = cVar;
            int i12 = PhoneReverificationInfoActivity.f216041v;
            PhoneReverificationInfoActivity phoneReverificationInfoActivity = PhoneReverificationInfoActivity.this;
            com.avito.android.phone_reverification_info.a aVar = new com.avito.android.phone_reverification_info.a(1, (k) phoneReverificationInfoActivity.f216043n.getValue(), k.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            PhoneReverificationInfo phoneReverificationInfo = cVar2.f442950b;
            if (phoneReverificationInfo instanceof PhoneReverificationInfo.Allow) {
                D6.H(phoneReverificationInfoActivity.f216049t);
                D6.w(phoneReverificationInfoActivity.f216050u);
                button = phoneReverificationInfoActivity.f216049t;
            } else if (phoneReverificationInfo instanceof PhoneReverificationInfo.Disallow) {
                D6.w(phoneReverificationInfoActivity.f216049t);
                D6.H(phoneReverificationInfoActivity.f216050u);
                button = phoneReverificationInfoActivity.f216050u;
            } else {
                if (phoneReverificationInfo != null) {
                    throw new NoWhenBranchMatchedException();
                }
                button = null;
            }
            if (button != null) {
                button.setOnClickListener(new ViewOnClickListenerC31042l(12, aVar));
                button.setLoading(cVar2.f442952d);
                com.avito.konveyor.adapter.h hVar = phoneReverificationInfoActivity.f216047r;
                if (hVar == null) {
                    hVar = null;
                }
                hVar.f338510e = new UV0.c(cVar2.f442951c);
                com.avito.konveyor.adapter.j jVar = phoneReverificationInfoActivity.f216046q;
                (jVar != null ? jVar : null).notifyDataSetChanged();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f216052l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f216052l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f216052l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<S0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return PhoneReverificationInfoActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<AbstractC50339a> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return PhoneReverificationInfoActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: PhoneReverificationInfoActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/phone_reverification_info/k;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/phone_reverification_info/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<k> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final k invoke() {
            l lVar = PhoneReverificationInfoActivity.this.f216042m;
            if (lVar == null) {
                lVar = null;
            }
            return (k) lVar.get();
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Intent intent = getIntent();
        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("phone_reverification_info_extra", PhoneReverificationInfo.class) : intent.getParcelableExtra("phone_reverification_info_extra");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("phone_reverification_info_extra was not passed");
        }
        com.avito.android.phone_reverification_info.di.a.a().a(this, (PhoneReverificationInfo) parcelableExtra, getF42820b(), (com.avito.android.phone_reverification_info.di.c) C29972i.a(C29972i.b(this), com.avito.android.phone_reverification_info.di.c.class), s.a(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f216044o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f216044o;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        setContentView(R.layout.phone_reverification_info_activity);
        this.f216049t = (Button) findViewById(R.id.phone_reverification_info_continue_button);
        this.f216050u = (Button) findViewById(R.id.phone_reverification_info_logout_button);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.phone_reverification_recycler_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        com.avito.konveyor.adapter.j jVar = this.f216046q;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
        C49782a c49782a = this.f216048s;
        if (c49782a == null) {
            c49782a = null;
        }
        recyclerView.l(c49782a, -1);
        toolbar.setNavigationOnClickListener(new com.avito.android.order.feature.c(this, 15));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f216044o;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.f(this, screenPerformanceTracker2, (k) this.f216043n.getValue(), new a(1, this, PhoneReverificationInfoActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/phone_reverification_info/mvi/entity/PhoneReverificationInfoOneTimeEvent;)V", 0), new b());
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f216044o;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f216050u = null;
        this.f216049t = null;
    }
}
