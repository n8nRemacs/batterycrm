package com.avito.android.safedeal.universal_delivery_type;

import Cd.C13243a;
import Hr.InterfaceC14024a;
import Un0.C15542c;
import Un0.InterfaceC15540a;
import Un0.InterfaceC15541b;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC23487e;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.K;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.delivery.DeliveryFlowPaymentStatus;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.map_core.beduin.BeduinDeliveryMethodSelectTabAction;
import com.avito.android.remote.model.universalDeliveryType.UniversalDeliveryTypeContent;
import gj.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: UniversalDeliveryTypeActivity.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\b\u0012\u0004\u0012\u00020\u00070\u0006:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/UniversalDeliveryTypeActivity;", "Lcom/avito/android/ui/activity/a;", "Lgj/i;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/safedeal/universal_delivery_type/di/j;", "Lcom/avito/android/universal_map/n;", "Lcom/avito/android/K;", "Lcom/avito/android/safedeal/universal_delivery_type/di/g;", "<init>", "()V", "a", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UniversalDeliveryTypeActivity extends com.avito.android.ui.activity.a implements gj.i, InterfaceC28477j.b, com.avito.android.safedeal.universal_delivery_type.di.j, com.avito.android.universal_map.n, K<com.avito.android.safedeal.universal_delivery_type.di.g> {

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public static final a f256401C = new a(null);

    /* renamed from: A, reason: collision with root package name */
    @Inject
    public com.avito.android.universal_map.i f256402A;

    /* renamed from: B, reason: collision with root package name */
    public com.avito.android.safedeal.universal_delivery_type.di.g f256403B;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Object f256404m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public p f256405n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final O0 f256406o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public InterfaceC14024a f256407p;

    /* renamed from: q, reason: collision with root package name */
    public View f256408q;

    /* renamed from: r, reason: collision with root package name */
    public Toolbar f256409r;

    /* renamed from: s, reason: collision with root package name */
    public AppCompatTextView f256410s;

    /* renamed from: t, reason: collision with root package name */
    public ViewPager2 f256411t;

    /* renamed from: u, reason: collision with root package name */
    public com.avito.android.safedeal.universal_delivery_type.b f256412u;

    /* renamed from: v, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f256413v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public com.avito.android.safedeal.universal_delivery_type.tabs_view.f f256414w;

    /* renamed from: x, reason: collision with root package name */
    @Inject
    public l f256415x;

    /* renamed from: y, reason: collision with root package name */
    @Inject
    public gj.n f256416y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final Object f256417z;

    /* compiled from: UniversalDeliveryTypeActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/UniversalDeliveryTypeActivity$a;", "", "<init>", "()V", "", "DELIVERY_COURIER_TAB_ID", "Ljava/lang/String;", "EXTRA_PARAMS", "NATIVE_SCREEN_FORM_ID", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UniversalDeliveryTypeActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f256418a;

        static {
            int[] iArr = new int[UniversalDeliveryTypeContent.TabsStyle.values().length];
            try {
                iArr[UniversalDeliveryTypeContent.TabsStyle.CHIPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UniversalDeliveryTypeContent.TabsStyle.SEGMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f256418a = iArr;
        }
    }

    /* compiled from: UniversalDeliveryTypeActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lgj/k;", "invoke", "()Lgj/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<gj.k> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final gj.k invoke() {
            UniversalDeliveryTypeActivity universalDeliveryTypeActivity = UniversalDeliveryTypeActivity.this;
            gj.n nVar = universalDeliveryTypeActivity.f256416y;
            if (nVar == null) {
                nVar = null;
            }
            return nVar.a(universalDeliveryTypeActivity, universalDeliveryTypeActivity, universalDeliveryTypeActivity, null);
        }
    }

    /* compiled from: UniversalDeliveryTypeActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<InterfaceC15541b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC15541b interfaceC15541b) {
            InterfaceC15541b interfaceC15541b2 = interfaceC15541b;
            UniversalDeliveryTypeActivity universalDeliveryTypeActivity = (UniversalDeliveryTypeActivity) this.receiver;
            a aVar = UniversalDeliveryTypeActivity.f256401C;
            universalDeliveryTypeActivity.getClass();
            if (interfaceC15541b2 instanceof InterfaceC15541b.c) {
                universalDeliveryTypeActivity.c2(((InterfaceC15541b.c) interfaceC15541b2).f16592a);
            } else if (interfaceC15541b2 instanceof InterfaceC15541b.a) {
                universalDeliveryTypeActivity.setResult(-1);
                universalDeliveryTypeActivity.finish();
            } else if (interfaceC15541b2 instanceof InterfaceC15541b.C1144b) {
                universalDeliveryTypeActivity.c2(((InterfaceC15541b.C1144b) interfaceC15541b2).f16591a.getTabId());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalDeliveryTypeActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<C15542c, G0> {
        /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(Un0.C15542c r8) {
            /*
                Method dump skipped, instructions count: 295
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.safedeal.universal_delivery_type.UniversalDeliveryTypeActivity.e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: UniversalDeliveryTypeActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/safedeal/universal_delivery_type/UniversalDeliveryTypeParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends N implements Y41.a<UniversalDeliveryTypeParams> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final UniversalDeliveryTypeParams invoke() {
            Bundle extras = UniversalDeliveryTypeActivity.this.getIntent().getExtras();
            if (extras != null) {
                UniversalDeliveryTypeParams universalDeliveryTypeParams = (UniversalDeliveryTypeParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("extra_params", UniversalDeliveryTypeParams.class) : extras.getParcelable("extra_params"));
                if (universalDeliveryTypeParams != null) {
                    return universalDeliveryTypeParams;
                }
            }
            throw new IllegalStateException("Need extra parameters");
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/n", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f256421l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f256421l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f256421l);
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/g", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return UniversalDeliveryTypeActivity.this.getF42820b();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/h", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return UniversalDeliveryTypeActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: UniversalDeliveryTypeActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/safedeal/universal_delivery_type/o;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/safedeal/universal_delivery_type/o;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<o> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final o invoke() {
            p pVar = UniversalDeliveryTypeActivity.this.f256405n;
            if (pVar == null) {
                pVar = null;
            }
            return (o) pVar.get();
        }
    }

    public UniversalDeliveryTypeActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f256404m = C42727D.b(lazyThreadSafetyMode, new f());
        this.f256406o = new O0(m0.f406844a.b(o.class), new h(), new g(new j()), new i());
        this.f256417z = C42727D.b(lazyThreadSafetyMode, new c());
    }

    public static void a2(UniversalDeliveryTypeActivity universalDeliveryTypeActivity) {
        super.onBackPressed();
    }

    @Override // gj.i
    @Y61.l
    public final RecyclerView B0(@Y61.k String str) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.safedeal.universal_delivery_type.di.g gVarA = com.avito.android.safedeal.universal_delivery_type.di.a.a().a(s.a(this), (UniversalDeliveryTypeParams) this.f256404m.getValue(), this, (com.avito.android.safedeal.universal_delivery_type.di.i) C29972i.a(C29972i.b(this), com.avito.android.safedeal.universal_delivery_type.di.i.class), cv.c.a(this), (com.avito.android.universal_map.j) C29972i.a(C29972i.b(this), com.avito.android.universal_map.j.class));
        this.f256403B = gVarA;
        gVarA.vh(this);
        l lVar = this.f256415x;
        if (lVar == null) {
            lVar = null;
        }
        lVar.a(fA2.b());
        l lVar2 = this.f256415x;
        (lVar2 != null ? lVar2 : null).k(Q1(), this);
    }

    public final o b2() {
        return (o) this.f256406o.getValue();
    }

    @Override // gj.i
    @Y61.l
    public final View b3(@Y61.k String str) {
        return null;
    }

    @Override // gj.i
    @Y61.k
    public final gj.o c1() {
        View view = this.f256408q;
        if (view == null) {
            view = null;
        }
        o.a aVar = new o.a(view, ToastBarPosition.f181047e);
        Toolbar toolbar = this.f256409r;
        return new gj.o(aVar, new o.a(toolbar != null ? toolbar : null, ToastBarPosition.f181045c));
    }

    public final void c2(String str) {
        com.avito.android.safedeal.universal_delivery_type.b bVar = this.f256412u;
        if (bVar == null) {
            bVar = null;
        }
        Iterator<? extends UniversalDeliveryTypeContent.Tab> it = bVar.f256437m.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (L.f(it.next().getTabType(), str)) {
                break;
            } else {
                i12++;
            }
        }
        Integer numValueOf = Integer.valueOf(i12);
        if (i12 == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            com.avito.android.safedeal.universal_delivery_type.tabs_view.f fVar = this.f256414w;
            if (fVar != null) {
                fVar.c(iIntValue);
            }
            ViewPager2 viewPager2 = this.f256411t;
            (viewPager2 != null ? viewPager2 : null).setCurrentItem(iIntValue);
            invalidateOptionsMenu();
        }
    }

    @Override // com.avito.android.universal_map.n
    public final void d() {
        l lVar = this.f256415x;
        if (lVar == null) {
            lVar = null;
        }
        lVar.j();
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.di.j
    @Y61.k
    public final l getPerformanceTracker() {
        l lVar = this.f256415x;
        if (lVar != null) {
            return lVar;
        }
        return null;
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.di.j
    public final void l1(@Y61.k BeduinDeliveryMethodSelectTabAction beduinDeliveryMethodSelectTabAction) {
        b2().accept(new InterfaceC15540a.C1143a(beduinDeliveryMethodSelectTabAction));
    }

    @Override // gj.i
    @Y61.k
    public final String m0() {
        return "main";
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (xv.f.a(intent) == DeliveryFlowPaymentStatus.f134746b) {
            setResult(i13, intent);
            finish();
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        Object next;
        Iterator<T> it = getSupportFragmentManager().P().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Fragment fragment = (Fragment) next;
            if (fragment.isResumed() && fragment.isVisible()) {
                break;
            }
        }
        InterfaceC23487e interfaceC23487e = (Fragment) next;
        if (interfaceC23487e instanceof com.avito.android.safedeal.universal_delivery_type.e ? ((com.avito.android.safedeal.universal_delivery_type.e) interfaceC23487e).i0() : false) {
            return;
        }
        super.onBackPressed();
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        l lVar = this.f256415x;
        if (lVar == null) {
            lVar = null;
        }
        lVar.e();
        l lVar2 = this.f256415x;
        if (lVar2 == null) {
            lVar2 = null;
        }
        lVar2.c();
        l lVar3 = this.f256415x;
        if (lVar3 == null) {
            lVar3 = null;
        }
        lVar3.l();
        l lVar4 = this.f256415x;
        if (lVar4 == null) {
            lVar4 = null;
        }
        lVar4.h();
        l lVar5 = this.f256415x;
        if (lVar5 == null) {
            lVar5 = null;
        }
        lVar5.i();
        setContentView(R.layout.activity_universal_delivery_type);
        this.f256408q = findViewById(R.id.universal_delivery_type_root);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.f256409r = toolbar;
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new com.avito.android.review_gallery.g(this, 3));
        this.f256410s = (AppCompatTextView) findViewById(R.id.delivery_type_tabs_toolbar_title);
        ((gj.k) this.f256417z.getValue()).l(b2().f256741N);
        com.avito.android.progress_overlay.l lVar6 = new com.avito.android.progress_overlay.l((ViewGroup) findViewById(R.id.overlay_container), R.id.content, null, 0, 0, 28, null);
        this.f256413v = lVar6;
        lVar6.f231600j = new com.avito.android.safedeal.universal_delivery_type.f(this);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.delivery_type_pager);
        this.f256411t = viewPager2;
        viewPager2.setUserInputEnabled(false);
        com.avito.android.universal_map.i iVar = this.f256402A;
        if (iVar == null) {
            iVar = null;
        }
        InterfaceC14024a interfaceC14024a = this.f256407p;
        if (interfaceC14024a == null) {
            interfaceC14024a = null;
        }
        com.avito.android.safedeal.universal_delivery_type.b bVar = new com.avito.android.safedeal.universal_delivery_type.b(this, iVar, interfaceC14024a);
        this.f256412u = bVar;
        ViewPager2 viewPager22 = this.f256411t;
        if (viewPager22 == null) {
            viewPager22 = null;
        }
        viewPager22.setAdapter(bVar);
        ViewPager2 viewPager23 = this.f256411t;
        if (viewPager23 == null) {
            viewPager23 = null;
        }
        viewPager23.e(new com.avito.android.safedeal.universal_delivery_type.g(this));
        l lVar7 = this.f256415x;
        (lVar7 != null ? lVar7 : null).d();
        b2().f256741N.getF103564j().c("DeliveryMethodTabsScreenId");
        com.avito.android.arch.mvi.android.f.a(b2(), this, Lifecycle.State.f46682e, new d(1, this, UniversalDeliveryTypeActivity.class, "handleEvent", "handleEvent(Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeOneTimeEvent;)V", 0), new e(1, this, UniversalDeliveryTypeActivity.class, "render", "render(Lcom/avito/android/safedeal/universal_delivery_type/mvi/entity/UniversalDeliveryTypeState;)V", 0));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(@Y61.k Menu menu) {
        getMenuInflater().inflate(R.menu.universal_delivery_type, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.avito.android.ui.activity.a, android.app.Activity
    public final boolean onOptionsItemSelected(@Y61.k MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.search) {
            return super.onOptionsItemSelected(menuItem);
        }
        List<Fragment> listP = getSupportFragmentManager().P();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (((Fragment) obj).isResumed()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC23487e interfaceC23487e = (Fragment) it.next();
            if (interfaceC23487e instanceof com.avito.android.safedeal.universal_delivery_type.d) {
                ((com.avito.android.safedeal.universal_delivery_type.d) interfaceC23487e).a();
            } else if (interfaceC23487e instanceof com.avito.android.universal_map.m) {
                ((com.avito.android.universal_map.m) interfaceC23487e).k2(menuItem);
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(@Y61.k Menu menu) {
        MenuItem menuItemFindItem = menu.findItem(R.id.search);
        com.avito.android.safedeal.universal_delivery_type.b bVar = this.f256412u;
        if (bVar == null) {
            bVar = null;
        }
        List<? extends UniversalDeliveryTypeContent.Tab> list = bVar.f256437m;
        ViewPager2 viewPager2 = this.f256411t;
        menuItemFindItem.setVisible(((UniversalDeliveryTypeContent.Tab) C42745f0.K((viewPager2 != null ? viewPager2 : null).getCurrentItem(), list)) instanceof UniversalDeliveryTypeContent.Tab.PvzOnUniversalMap);
        return true;
    }

    @Override // com.avito.android.universal_map.n
    public final void r(@Y61.k String str, @Y61.k ScreenPerformanceTracker.LoadingType loadingType, @Y61.k J j12, @Y61.l Integer num) {
        if (j12 instanceof J.b) {
            l lVar = this.f256415x;
            (lVar != null ? lVar : null).f();
        } else if (j12 instanceof J.a) {
            l lVar2 = this.f256415x;
            (lVar2 != null ? lVar2 : null).getClass();
        }
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        com.avito.android.safedeal.universal_delivery_type.di.g gVar = this.f256403B;
        if (gVar != null) {
            return gVar;
        }
        return null;
    }

    @Override // com.avito.android.safedeal.universal_delivery_type.di.j
    public final long t1() {
        return this.f304537b;
    }

    @Override // com.avito.android.universal_map.n
    public final void e() {
    }

    @Override // com.avito.android.universal_map.n
    public final void s(@Y61.k String str, @Y61.k ScreenPerformanceTracker.LoadingType loadingType) {
    }
}
