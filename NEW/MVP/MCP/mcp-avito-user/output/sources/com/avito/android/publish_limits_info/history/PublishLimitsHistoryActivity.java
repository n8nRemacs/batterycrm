package com.avito.android.publish_limits_info.history;

import Mf0.C14485e;
import Nf0.C14571c;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.K;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.error.z;
import com.avito.android.publish_limits_info.ItemId;
import com.avito.android.publish_limits_info.history.e;
import com.avito.android.publish_limits_info.history.m;
import com.avito.android.util.D6;
import com.avito.android.util.P2;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;

/* compiled from: PublishLimitsHistoryActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/publish_limits_info/history/PublishLimitsHistoryActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/K;", "Lcom/avito/android/publish_limits_info/history/di/b;", "Lcom/avito/android/publish_limits_info/history/tab/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_publish-limits-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PublishLimitsHistoryActivity extends com.avito.android.ui.activity.a implements K<com.avito.android.publish_limits_info.history.di.b>, com.avito.android.publish_limits_info.history.tab.a, InterfaceC28477j.b {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f245801u = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public m f245802m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.android.progress_overlay.b f245803n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public C14485e f245804o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f245805p;

    /* renamed from: q, reason: collision with root package name */
    public com.avito.android.publish_limits_info.history.a f245806q;

    /* renamed from: r, reason: collision with root package name */
    public CollapsingTitleAppBarLayout f245807r;

    /* renamed from: s, reason: collision with root package name */
    public View f245808s;

    /* renamed from: t, reason: collision with root package name */
    public com.avito.android.publish_limits_info.history.di.b f245809t;

    /* compiled from: PublishLimitsHistoryActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/publish_limits_info/history/m$a;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<P2<? super m.a>, G0> {
        public a() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final G0 invoke(P2<? super m.a> p22) {
            P2<? super m.a> p23 = p22;
            boolean z12 = p23 instanceof P2.b;
            PublishLimitsHistoryActivity publishLimitsHistoryActivity = PublishLimitsHistoryActivity.this;
            if (z12) {
                m.a aVar = (m.a) ((P2.b) p23).f318720a;
                int i12 = PublishLimitsHistoryActivity.f245801u;
                View view = publishLimitsHistoryActivity.f245808s;
                if (view == null) {
                    view = null;
                }
                D6.G(view, false);
                CollapsingTitleAppBarLayout collapsingTitleAppBarLayout = publishLimitsHistoryActivity.f245807r;
                if (collapsingTitleAppBarLayout == null) {
                    collapsingTitleAppBarLayout = null;
                }
                collapsingTitleAppBarLayout.setTitle(aVar.f245861a);
                CollapsingTitleAppBarLayout collapsingTitleAppBarLayout2 = publishLimitsHistoryActivity.f245807r;
                if (collapsingTitleAppBarLayout2 == null) {
                    collapsingTitleAppBarLayout2 = null;
                }
                collapsingTitleAppBarLayout2.setShortTitle(aVar.f245861a);
                CollapsingTitleAppBarLayout collapsingTitleAppBarLayout3 = publishLimitsHistoryActivity.f245807r;
                if (collapsingTitleAppBarLayout3 == null) {
                    collapsingTitleAppBarLayout3 = null;
                }
                collapsingTitleAppBarLayout3.setSubTitle(aVar.f245862b);
                com.avito.android.publish_limits_info.history.a aVar2 = publishLimitsHistoryActivity.f245806q;
                com.avito.android.publish_limits_info.history.a aVar3 = aVar2 != null ? aVar2 : null;
                aVar3.f245811b.E5(aVar.f245863c);
                androidx.viewpager.widget.a adapter = aVar3.f245813d.getAdapter();
                if (adapter != null) {
                    adapter.h();
                }
                ((com.avito.android.lib.deprecated_design.tab.adapter.g) aVar3.f245812c.getTag()).d();
            } else if (p23 instanceof P2.a) {
                int i13 = PublishLimitsHistoryActivity.f245801u;
                View view2 = publishLimitsHistoryActivity.f245808s;
                if (view2 == null) {
                    view2 = null;
                }
                D6.G(view2, false);
                String strK = z.k(((P2.a) p23).f318719a);
                com.avito.android.progress_overlay.b bVar = publishLimitsHistoryActivity.f245803n;
                (bVar != null ? bVar : null).b(strK);
            } else if (L.f(p23, P2.c.f318721a)) {
                com.avito.android.progress_overlay.b bVar2 = publishLimitsHistoryActivity.f245803n;
                if (bVar2 == null) {
                    bVar2 = null;
                }
                bVar2.C0();
                View view3 = publishLimitsHistoryActivity.f245808s;
                D6.G(view3 != null ? view3 : null, true);
            }
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.publish_limits_history;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        ItemId itemId = (ItemId) getIntent().getParcelableExtra("history_id");
        com.avito.android.publish_limits_info.history.di.b bVarA = com.avito.android.publish_limits_info.history.di.a.a().a(this, itemId, this, (com.avito.android.publish_limits_info.history.di.c) C29972i.a(C29972i.b(this), com.avito.android.publish_limits_info.history.di.c.class), cv.c.a(this));
        this.f245809t = bVarA;
        bVarA.I8(this);
        C14485e c14485e = this.f245804o;
        if (c14485e == null) {
            c14485e = null;
        }
        c14485e.getClass();
        c14485e.f10984a.c(new C14571c(itemId.f245800b));
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(null);
        this.f245806q = new com.avito.android.publish_limits_info.history.a(K1(), getSupportFragmentManager());
        this.f245808s = findViewById(R.id.publish_limits_skeleton_root);
        CollapsingTitleAppBarLayout collapsingTitleAppBarLayout = (CollapsingTitleAppBarLayout) findViewById(R.id.app_bar);
        this.f245807r = collapsingTitleAppBarLayout;
        collapsingTitleAppBarLayout.setClickListener(new c(this));
        com.avito.android.progress_overlay.b bVar = this.f245803n;
        (bVar != null ? bVar : null).d((ViewGroup) K1(), R.id.limits_history_root_container, R.layout.old_part_network_problem, null, true);
        com.avito.android.progress_overlay.b bVar2 = this.f245803n;
        if (bVar2 == null) {
            bVar2 = null;
        }
        bVar2.c(new d(this));
        m mVar = this.f245802m;
        (mVar != null ? mVar : null).f245860P.observe(this, new e.a(new a()));
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        com.avito.android.publish_limits_info.history.di.b bVar = this.f245809t;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    @Override // com.avito.android.publish_limits_info.history.tab.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s1(@Y61.k com.avito.android.deep_linking.links.DeepLink r7) {
        /*
            r6 = this;
            Mf0.e r0 = r6.f245804o
            r1 = 0
            if (r0 == 0) goto L6
            goto L7
        L6:
            r0 = r1
        L7:
            com.avito.android.publish_limits_info.history.m r2 = r6.f245802m
            if (r2 == 0) goto Lc
            goto Ld
        Lc:
            r2 = r1
        Ld:
            com.avito.android.publish_limits_info.ItemId r2 = r2.f245853E
            com.avito.android.publish_limits_info.history.a r3 = r6.f245806q
            if (r3 != 0) goto L14
            r3 = r1
        L14:
            com.google.android.material.tabs.TabLayout r4 = r3.f245812c
            int r4 = r4.getSelectedTabPosition()
            if (r4 < 0) goto L2e
            com.avito.android.lib.deprecated_design.tab.adapter.k<com.avito.android.publish_limits_info.history.tab.HistoryTabItem> r3 = r3.f245811b
            int r5 = r3.getCount()
            if (r4 < r5) goto L25
            goto L2e
        L25:
            java.lang.Object r3 = r3.getItem(r4)
            com.avito.android.publish_limits_info.history.tab.HistoryTabItem r3 = (com.avito.android.publish_limits_info.history.tab.HistoryTabItem) r3
            java.lang.String r3 = r3.f245878e
            goto L30
        L2e:
            java.lang.String r3 = "unknown"
        L30:
            r0.getClass()
            Nf0.b r4 = new Nf0.b
            java.lang.String r2 = r2.f245800b
            r4.<init>(r2, r3)
            com.avito.android.analytics.a r0 = r0.f10984a
            r0.c(r4)
            com.avito.android.deeplink_handler.handler.composite.a r0 = r6.f245805p
            if (r0 == 0) goto L44
            goto L45
        L44:
            r0 = r1
        L45:
            r2 = 6
            com.avito.android.deeplink_handler.handler.b.a.a(r0, r7, r1, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish_limits_info.history.PublishLimitsHistoryActivity.s1(com.avito.android.deep_linking.links.DeepLink):void");
    }
}
