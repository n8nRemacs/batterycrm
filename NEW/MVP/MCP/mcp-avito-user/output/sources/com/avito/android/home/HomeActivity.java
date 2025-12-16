package com.avito.android.home;

import Zd.InterfaceC19542a;
import ak.C19902a;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.P;
import com.avito.android.analytics.event.Q;
import com.avito.android.analytics.event.S;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.bottom_navigation.C28885g;
import com.avito.android.bottom_navigation.C28899v;
import com.avito.android.bottom_navigation.U;
import com.avito.android.bottom_navigation.V;
import com.avito.android.bottom_navigation.space.BottomNavigationSpace;
import com.avito.android.di.C29972i;
import com.avito.android.home.bottom_navigation.BottomNavigationFragment;
import com.avito.android.home.bottom_navigation.BottomNavigationOpenParams;
import com.avito.android.home.bottom_navigation.BottomNavigationScreenParams;
import com.avito.android.home.bottom_navigation.C30759a;
import com.avito.android.home.bottom_navigation.C30761c;
import com.avito.android.util.C35967w2;
import com.avito.android.util.V2;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AbstractC37097d;
import com.google.android.play.core.appupdate.C37094a;
import com.google.android.play.core.appupdate.C37096c;
import com.google.android.play.core.appupdate.InterfaceC37095b;
import iR.C41336a;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import uc.InterfaceC49026a;
import vz.InterfaceC49400a;
import xI.C49842a;

/* compiled from: HomeActivity.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/home/HomeActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/home/bottom_navigation/n;", "Lcom/avito/android/bottom_navigation/V;", "Lcom/avito/android/bottom_navigation/B;", "Lcom/avito/android/bottom_navigation/space/o;", "Lcom/avito/android/analytics/screens/j$a;", "Lvz/f;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"DS_TCH_BDGT_ARCHITECTURE [Forbidden]", "DS_TCH_BDGT_ARCHITECTURE [Deprecated]", "NonComposeScreen"})
/* loaded from: classes13.dex */
public final class HomeActivity extends com.avito.android.ui.activity.a implements com.avito.android.home.bottom_navigation.n, V, com.avito.android.bottom_navigation.B, com.avito.android.bottom_navigation.space.o, InterfaceC28477j.a, vz.f {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f162176x = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f162177m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public AK0.l f162178n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f162179o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.version_conflict.i f162180p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public C30761c f162181q;

    /* renamed from: r, reason: collision with root package name */
    @Inject
    public InterfaceC49026a f162182r;

    /* renamed from: s, reason: collision with root package name */
    @Inject
    public BI.a f162183s;

    /* renamed from: t, reason: collision with root package name */
    @Inject
    public InterfaceC19542a f162184t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public C30758b f162185u;

    /* renamed from: v, reason: collision with root package name */
    public long f162186v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f162187w = C42727D.c(new a());

    /* compiled from: HomeActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/home/bottom_navigation/a;", "invoke", "()Lcom/avito/android/home/bottom_navigation/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<C30759a> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final C30759a invoke() {
            HomeActivity homeActivity = HomeActivity.this;
            C30761c c30761c = homeActivity.f162181q;
            if (c30761c == null) {
                c30761c = null;
            }
            return new C30759a(homeActivity, c30761c);
        }
    }

    /* compiled from: HomeActivity.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/play/core/appupdate/a;", "kotlin.jvm.PlatformType", "appUpdateInfo", "Lkotlin/G0;", "invoke", "(Lcom/google/android/play/core/appupdate/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<C37094a, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC37095b f162190m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC37095b interfaceC37095b) {
            super(1);
            this.f162190m = interfaceC37095b;
        }

        @Override // Y41.l
        public final G0 invoke(C37094a c37094a) {
            C37094a c37094a2 = c37094a;
            int i12 = c37094a2.f358005a;
            HomeActivity homeActivity = HomeActivity.this;
            if (i12 == 2) {
                boolean z12 = c37094a2.a(AbstractC37097d.c(0).a()) != null;
                InterfaceC37095b interfaceC37095b = this.f162190m;
                if (z12) {
                    InterfaceC28373a interfaceC28373a = homeActivity.f162177m;
                    if (interfaceC28373a == null) {
                        interfaceC28373a = null;
                    }
                    interfaceC28373a.c(new S());
                    try {
                        interfaceC37095b.b(c37094a2, 0, homeActivity);
                    } catch (Exception e12) {
                        V2.f318762a.a("DEFAULT_TAG", "InAppUpdate: callUpdateFlow error", e12);
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    homeActivity.f162186v = jCurrentTimeMillis;
                    AK0.l lVar = homeActivity.f162178n;
                    (lVar != null ? lVar : null).putLong("in_app_update_last_timestamp", jCurrentTimeMillis);
                } else if (c37094a2.a(AbstractC37097d.c(1).a()) != null) {
                    InterfaceC28373a interfaceC28373a2 = homeActivity.f162177m;
                    if (interfaceC28373a2 == null) {
                        interfaceC28373a2 = null;
                    }
                    interfaceC28373a2.c(new S());
                    try {
                        interfaceC37095b.b(c37094a2, 1, homeActivity);
                    } catch (Exception e13) {
                        V2.f318762a.a("DEFAULT_TAG", "InAppUpdate: callUpdateFlow error", e13);
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    homeActivity.f162186v = jCurrentTimeMillis2;
                    AK0.l lVar2 = homeActivity.f162178n;
                    (lVar2 != null ? lVar2 : null).putLong("in_app_update_last_timestamp", jCurrentTimeMillis2);
                }
            } else if (c37094a2.f358006b == 11) {
                homeActivity.b2();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: HomeActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C37096c.a(HomeActivity.this.getApplicationContext()).c();
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.bottom_navigation.B
    @Y61.l
    public final BottomNavigationFragment F0() {
        return a2().b();
    }

    @Override // vz.f
    @Y61.k
    public final InterfaceC49400a G0() {
        return InterfaceC49400a.c.f441063a;
    }

    @Override // com.avito.android.bottom_navigation.V
    @Y61.l
    public final U J0() {
        return a2().b();
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.activity_home_screen;
    }

    @Override // com.avito.android.ui.activity.a
    /* renamed from: S1 */
    public final boolean getF304545j() {
        return false;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        com.avito.android.di.component.t.a().a((com.avito.android.di.component.D) C29972i.a(C29972i.b(this), com.avito.android.di.component.D.class), cv.c.a(this)).a(this);
        AK0.l lVar = this.f162178n;
        if (lVar == null) {
            lVar = null;
        }
        long j12 = lVar.getLong("LAST_CONFIG_UPDATE_TIMESTAMP", -1L);
        AK0.l lVar2 = this.f162178n;
        if (lVar2 == null) {
            lVar2 = null;
        }
        this.f162186v = lVar2.getLong("in_app_update_last_timestamp", 0L);
        InterfaceC28373a interfaceC28373a = this.f162177m;
        (interfaceC28373a != null ? interfaceC28373a : null).c(new C49842a(j12));
    }

    public final C30759a a2() {
        return (C30759a) this.f162187w.getValue();
    }

    public final void b2() {
        com.avito.android.component.snackbar.h.c(getWindow().getDecorView(), getString(R.string.serp_in_app_update_title), -2, null, getString(R.string.serp_in_app_update_action), new c(), null, 212);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    @Override // com.avito.android.ui.activity.a, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(@Y61.k android.view.MotionEvent r6) {
        /*
            r5 = this;
            com.avito.android.home.bottom_navigation.a r0 = r5.a2()
            android.view.View r1 = r5.getCurrentFocus()
            com.avito.android.home.bottom_navigation.BottomNavigationFragment r0 = r0.b()
            if (r0 == 0) goto Lbe
            androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
            java.util.List r0 = r0.P()
            java.lang.Object r0 = kotlin.collections.C42745f0.S(r0)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            boolean r2 = r0 instanceof com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment
            if (r2 == 0) goto Lbe
            com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment r0 = (com.avito.android.bottom_navigation.ui.fragment.TabContainerFragment) r0
            androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
            java.util.List r0 = r0.P()
            java.lang.Object r0 = kotlin.collections.C42745f0.S(r0)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            boolean r2 = r0 instanceof com.avito.android.search.filter.FiltersFragment
            if (r2 == 0) goto Lbe
            com.avito.android.search.filter.FiltersFragment r0 = (com.avito.android.search.filter.FiltersFragment) r0
            r0.getClass()
            int r0 = r6.getAction()
            if (r0 != 0) goto Lbe
            boolean r0 = r1 instanceof android.widget.EditText
            if (r0 == 0) goto Lbe
            r0 = 0
            if (r1 == 0) goto L4b
            android.view.ViewParent r2 = r1.getParent()
            goto L4c
        L4b:
            r2 = r0
        L4c:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L53
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L54
        L53:
            r2 = r0
        L54:
            if (r2 != 0) goto L57
            goto La1
        L57:
            int r3 = r2.getId()
            r4 = 2131367523(0x7f0a1663, float:1.835497E38)
            if (r3 != r4) goto La1
            android.view.ViewParent r2 = r2.getParent()
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L6b
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L6b:
            if (r0 != 0) goto L6e
            goto La1
        L6e:
            r2 = 2131367521(0x7f0a1661, float:1.8354966E38)
            android.view.View r0 = r0.findViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            com.avito.android.util.p6 r2 = new com.avito.android.util.p6
            r2.<init>(r0)
        L7c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r2.next()
            android.view.View r0 = (android.view.View) r0
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r0.getGlobalVisibleRect(r3)
            float r0 = r6.getRawX()
            int r0 = (int) r0
            float r4 = r6.getRawY()
            int r4 = (int) r4
            boolean r0 = r3.contains(r0, r4)
            if (r0 == 0) goto L7c
            goto Lbe
        La1:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.widget.EditText r1 = (android.widget.EditText) r1
            r1.getGlobalVisibleRect(r0)
            float r2 = r6.getRawX()
            int r2 = (int) r2
            float r3 = r6.getRawY()
            int r3 = (int) r3
            boolean r0 = r0.contains(r2, r3)
            if (r0 != 0) goto Lbe
            r1.clearFocus()
        Lbe:
            boolean r6 = super.dispatchTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.home.HomeActivity.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.avito.android.home.bottom_navigation.n
    public final void f1(@Y61.l C28899v c28899v) {
        String name;
        C30759a c30759aA2 = a2();
        FragmentManager fragmentManager = c30759aA2.f162338c;
        boolean z12 = fragmentManager.L() == 1;
        BottomNavigationFragment bottomNavigationFragmentB = c30759aA2.b();
        BottomNavigationFragment bottomNavigationFragment = null;
        BottomNavigationSpace bottomNavigationSpace = bottomNavigationFragmentB != null ? bottomNavigationFragmentB.v5().f162304c : null;
        C28899v.a.C3201a c3201a = c28899v != null ? c28899v.f107166a : null;
        if (z12) {
            BottomNavigationSpace bottomNavigationSpace2 = c30759aA2.f162340e;
            if (bottomNavigationSpace == bottomNavigationSpace2) {
                c30759aA2.f162336a.finish();
            } else {
                BottomNavigationOpenParams bottomNavigationOpenParams = new BottomNavigationOpenParams(true, bottomNavigationSpace2, new BottomNavigationScreenParams(null, null, null));
                BottomNavigationFragment.f162243V0.getClass();
                BottomNavigationFragment bottomNavigationFragment2 = new BottomNavigationFragment();
                bottomNavigationFragment2.f162251G0.setValue(bottomNavigationFragment2, BottomNavigationFragment.f162244W0[0], bottomNavigationOpenParams);
                fragmentManager.Y();
                androidx.fragment.app.H hE2 = fragmentManager.e();
                String string = UUID.randomUUID().toString();
                hE2.j(R.id.fragment_container, bottomNavigationFragment2, string, 1);
                hE2.c(string);
                hE2.e();
                C30759a.c(c3201a, bottomNavigationFragment2);
            }
        } else {
            int iL2 = fragmentManager.L();
            if (iL2 >= 2 && (name = fragmentManager.K(iL2 - 2).getName()) != null) {
                Fragment fragmentH = fragmentManager.H(name);
                if (fragmentH instanceof BottomNavigationFragment) {
                    bottomNavigationFragment = (BottomNavigationFragment) fragmentH;
                }
            }
            fragmentManager.Y();
            if (bottomNavigationFragment != null) {
                C30759a.c(c3201a, bottomNavigationFragment);
            }
        }
        if (bottomNavigationSpace != BottomNavigationSpace.f107066c) {
            return;
        }
        c30759aA2.f162339d.postDelayed(new com.avito.android.app.coldstart.d(c30759aA2, 26), 1000L);
    }

    @Override // com.avito.android.bottom_navigation.space.o
    @Y61.l
    public final BottomNavigationSpace n() {
        BottomNavigationFragment bottomNavigationFragmentB = a2().b();
        if (bottomNavigationFragmentB != null) {
            return bottomNavigationFragmentB.v5().f162304c;
        }
        return null;
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i12 == 0) {
            if (i13 == -1) {
                InterfaceC28373a interfaceC28373a = this.f162177m;
                (interfaceC28373a != null ? interfaceC28373a : null).c(new P());
            } else {
                if (i13 != 0) {
                    return;
                }
                InterfaceC28373a interfaceC28373a2 = this.f162177m;
                (interfaceC28373a2 != null ? interfaceC28373a2 : null).c(new Q());
            }
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        BottomNavigationFragment bottomNavigationFragmentB = a2().b();
        if (bottomNavigationFragmentB != null) {
            C41336a.C11375a.a();
            C28885g c28885g = bottomNavigationFragmentB.f162252H0;
            if (c28885g != null) {
                c28885g.b(true);
            }
        }
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        if (!isTaskRoot() && getIntent().hasCategory("android.intent.category.LAUNCHER") && L.f(getIntent().getAction(), "android.intent.action.MAIN")) {
            finish();
        }
        super.onCreate(bundle);
        View viewFindViewById = findViewById(android.R.id.content);
        viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC30770e(viewFindViewById, this));
        com.avito.android.version_conflict.i iVar = this.f162180p;
        if (iVar == null) {
            iVar = null;
        }
        iVar.a();
        if (bundle == null) {
            C30759a c30759aA2 = a2();
            BI.a aVar = this.f162183s;
            if (aVar == null) {
                aVar = null;
            }
            Intent intentA = aVar.a();
            if (intentA == null) {
                intentA = getIntent();
            }
            c30759aA2.getClass();
            int intExtra = intentA.getIntExtra("tab_ordinal", -1);
            Integer numValueOf = Integer.valueOf(intExtra);
            if (intExtra < 0) {
                numValueOf = null;
            }
            c30759aA2.d(c30759aA2.a(true, c30759aA2.f162340e, new BottomNavigationScreenParams(numValueOf, C19902a.a(intentA), C35967w2.a(intentA))), false);
        }
        this.f162185u = new C30758b(this);
        InterfaceC49026a interfaceC49026a = this.f162182r;
        (interfaceC49026a != null ? interfaceC49026a : null).a(new C30771f(this));
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        InterfaceC49026a interfaceC49026a = this.f162182r;
        if (interfaceC49026a == null) {
            interfaceC49026a = null;
        }
        interfaceC49026a.clear();
        super.onDestroy();
    }

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onNewIntent(@Y61.k Intent intent) {
        BottomNavigationSpace bottomNavigationSpace;
        super.onNewIntent(intent);
        C30759a c30759aA2 = a2();
        BottomNavigationFragment bottomNavigationFragmentB = c30759aA2.b();
        if (bottomNavigationFragmentB == null || (bottomNavigationSpace = bottomNavigationFragmentB.v5().f162304c) == null) {
            return;
        }
        int intExtra = intent.getIntExtra("tab_ordinal", -1);
        Integer numValueOf = Integer.valueOf(intExtra);
        if (intExtra < 0) {
            numValueOf = null;
        }
        c30759aA2.d(c30759aA2.a(false, bottomNavigationSpace, new BottomNavigationScreenParams(numValueOf, C19902a.a(intent), C35967w2.a(intent))), true);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (System.currentTimeMillis() - this.f162186v > TimeUnit.HOURS.toMillis(24L)) {
            InterfaceC37095b interfaceC37095bA = C37096c.a(getApplicationContext());
            Task<C37094a> taskA = interfaceC37095bA.a();
            taskA.g(new AJ.b(9, new b(interfaceC37095bA)));
            taskA.e(new com.avito.android.bxcontent.mvi.entity.f(19));
        }
        C37096c.a(getApplicationContext()).d(this.f162185u);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        C37096c.a(getApplicationContext()).e(this.f162185u);
        super.onStop();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    @Override // com.avito.android.home.bottom_navigation.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s0(@Y61.k com.avito.android.bottom_navigation.N r8) {
        /*
            r7 = this;
            com.avito.android.home.bottom_navigation.a r0 = r7.a2()
            com.avito.android.home.bottom_navigation.BottomNavigationFragment r1 = r0.b()
            r2 = 1
            androidx.fragment.app.FragmentManager r3 = r0.f162338c
            if (r1 == 0) goto L3a
            com.avito.android.bottom_navigation.g r1 = r1.f162252H0
            if (r1 == 0) goto L3a
            java.util.ArrayDeque<com.avito.android.bottom_navigation.NavigationTabSetItem> r4 = r1.f107022r
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L1a
            goto L3a
        L1a:
            int r5 = r4.size()
            if (r5 != r2) goto L2f
            java.lang.Object r4 = kotlin.collections.C42745f0.D(r4)
            com.avito.android.bottom_navigation.NavigationTabSetItem r4 = (com.avito.android.bottom_navigation.NavigationTabSetItem) r4
            com.avito.android.bottom_navigation.ui.fragment.k r1 = r1.f107008d
            int r1 = r1.c(r4)
            if (r1 != r2) goto L2f
            goto L3a
        L2f:
            com.avito.android.home.bottom_navigation.BottomNavigationFragment r1 = r0.b()
            if (r1 != 0) goto L36
            goto L6b
        L36:
            r1.t5()
            goto L40
        L3a:
            r3.Y()
            r3.E()
        L40:
            int r1 = r3.L()
            r4 = 0
            if (r1 != 0) goto L48
            goto L49
        L48:
            r2 = r4
        L49:
            com.avito.android.home.bottom_navigation.BottomNavigationFragment r1 = r0.b()
            if (r1 == 0) goto L57
            com.avito.android.home.bottom_navigation.BottomNavigationOpenParams r1 = r1.v5()
            com.avito.android.bottom_navigation.space.BottomNavigationSpace r1 = r1.f162304c
            if (r1 != 0) goto L59
        L57:
            com.avito.android.bottom_navigation.space.BottomNavigationSpace r1 = r0.f162340e
        L59:
            com.avito.android.home.bottom_navigation.BottomNavigationScreenParams r5 = new com.avito.android.home.bottom_navigation.BottomNavigationScreenParams
            r6 = 0
            com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory$Data r8 = r8.f106969a
            r5.<init>(r6, r8, r6)
            com.avito.android.home.bottom_navigation.BottomNavigationOpenParams r8 = r0.a(r2, r1, r5)
            r0.d(r8, r4)
            r3.E()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.home.HomeActivity.s0(com.avito.android.bottom_navigation.N):void");
    }

    @Override // com.avito.android.ui.activity.a
    public final void Z1() {
    }
}
