package com.avito.android.loyalty.ui.badges_list;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.BadgesMainScreen;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.compose.q;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.loyalty.data.Badge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BadgesListActivity.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/loyalty/ui/badges_list/BadgesListActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BadgesListActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f183359m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f183360n = C42727D.c(new b());

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f183361o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f183362p;

    /* compiled from: BadgesListActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/loyalty/ui/badges_list/BadgesListActivity$a;", "", "<init>", "()V", "", "BADGES_LIST_KEY", "Ljava/lang/String;", "USER_KEY", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BadgesListActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = BadgesListActivity.this.f183359m;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: BadgesListActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BadgesListActivity f183364l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Badge f183365m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ List<Badge> f183366n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f183367o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Badge badge, BadgesListActivity badgesListActivity, String str, List list) {
            super(2);
            this.f183364l = badgesListActivity;
            this.f183365m = badge;
            this.f183366n = list;
            this.f183367o = str;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                BadgesListActivity badgesListActivity = this.f183364l;
                q.b((com.avito.android.analytics.screens.compose.a) badgesListActivity.f183360n.getValue(), r.c(-2096551012, new d(this.f183365m, badgesListActivity, this.f183367o, this.f183366n), a13), a13, 48);
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.loyalty.di.badges_list.c.a().a(new C28478k(BadgesMainScreen.f90295d, s.a(this), null, 4, null), cv.c.a(this), (com.avito.android.loyalty.di.badges_list.b) C29972i.a(C29972i.b(this), com.avito.android.loyalty.di.badges_list.b.class)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f183359m;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        Q q12;
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f183359m;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        Intent intent = getIntent();
        ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("badges_list_key", Badge.class) : intent.getParcelableArrayListExtra("badges_list_key");
        if (parcelableArrayListExtra.size() > 2) {
            int i12 = 0;
            Object obj = parcelableArrayListExtra.get(0);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : parcelableArrayListExtra) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                if (i12 != 0) {
                    arrayList.add(obj2);
                }
                i12 = i13;
            }
            q12 = new Q(obj, arrayList);
        } else {
            q12 = new Q(null, parcelableArrayListExtra);
        }
        Badge badge = (Badge) q12.f406619b;
        List list = (List) q12.f406620c;
        String stringExtra = getIntent().getStringExtra("user_key");
        androidx.view.compose.j.a(this, new C22096n(2138971708, new c(badge, this, stringExtra, list), true));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f183359m;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        screenPerformanceTracker2.d();
        InterfaceC28373a interfaceC28373a = this.f183362p;
        InterfaceC28373a interfaceC28373a2 = interfaceC28373a != null ? interfaceC28373a : null;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(parcelableArrayListExtra, 10));
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((Badge) it.next()).f182980b));
        }
        interfaceC28373a2.c(new f(stringExtra, arrayList2));
    }
}
