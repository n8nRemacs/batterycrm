package com.avito.android.error_reporting.app_state;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import com.avito.android.util.C35755b0;
import com.avito.android.util.J5;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AppStateCollectorOpenedScreens.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/error_reporting/app_state/x;", "Lcom/avito/android/error_reporting/app_state/a;", "Lcom/avito/android/util/J5;", "a", "b", "c", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class x extends J5 implements InterfaceC30362a {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Application f147845c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30362a.InterfaceC4322a f147846d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a f147847e = new a();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final c f147848f = new c();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final LinkedList<b> f147849g = new LinkedList<>();

    /* renamed from: h, reason: collision with root package name */
    public int f147850h;

    /* compiled from: AppStateCollectorOpenedScreens.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/error_reporting/app_state/x$a;", "Lid/i;", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends id.i {
        public a() {
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@Y61.k Activity activity, @Y61.l Bundle bundle) {
            x xVar = x.this;
            LinkedList<b> linkedList = xVar.f147849g;
            xVar.getClass();
            linkedList.push(new b(activity.getClass().getSimpleName(), null, 2, null));
            xVar.getClass();
            if (activity instanceof ActivityC22955m) {
                ((ActivityC22955m) activity).getSupportFragmentManager().e0(xVar.f147848f, true);
            }
            xVar.p();
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(@Y61.k Activity activity) {
            x xVar = x.this;
            xVar.f147849g.poll();
            xVar.getClass();
            if (activity instanceof ActivityC22955m) {
                ((ActivityC22955m) activity).getSupportFragmentManager().v0(xVar.f147848f);
            }
            xVar.p();
        }
    }

    /* compiled from: AppStateCollectorOpenedScreens.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/error_reporting/app_state/x$b;", "", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f147852a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkedList<String> f147853b;

        public b() {
            throw null;
        }

        public b(String str, LinkedList linkedList, int i12, C42822w c42822w) {
            linkedList = (i12 & 2) != 0 ? new LinkedList() : linkedList;
            this.f147852a = str;
            this.f147853b = linkedList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.L.f(this.f147852a, bVar.f147852a) && kotlin.jvm.internal.L.f(this.f147853b, bVar.f147853b);
        }

        public final int hashCode() {
            return this.f147853b.hashCode() + (this.f147852a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ActivityWithFragments(activity=" + this.f147852a + ", fragments=" + this.f147853b + ')';
        }
    }

    /* compiled from: AppStateCollectorOpenedScreens.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/error_reporting/app_state/x$c;", "Landroidx/fragment/app/FragmentManager$n;", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends FragmentManager.n {
        public c() {
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public final void onFragmentCreated(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment, @Y61.l Bundle bundle) {
            x xVar = x.this;
            b bVarPeek = xVar.f147849g.peek();
            if (bVarPeek == null) {
                bVarPeek = new b("[unknown]", null, 2, null);
            }
            xVar.getClass();
            bVarPeek.f147853b.push(fragment.getClass().getSimpleName());
            xVar.p();
        }

        @Override // androidx.fragment.app.FragmentManager.n
        public final void onFragmentDestroyed(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment) {
            LinkedList<String> linkedList;
            x xVar = x.this;
            b bVarPeek = xVar.f147849g.peek();
            if (bVarPeek != null && (linkedList = bVarPeek.f147853b) != null) {
                linkedList.poll();
            }
            xVar.p();
        }
    }

    @Inject
    public x(@Y61.k Application application, @Y61.k InterfaceC30362a.InterfaceC4322a interfaceC4322a) {
        this.f147845c = application;
        this.f147846d = interfaceC4322a;
    }

    @Override // com.avito.android.util.J5
    public final void o() {
        this.f147845c.registerActivityLifecycleCallbacks(this.f147847e);
        p();
    }

    public final void p() {
        LinkedList<b> linkedList = this.f147849g;
        InterfaceC30362a.InterfaceC4322a interfaceC4322a = this.f147846d;
        List listG = C35755b0.g(linkedList, interfaceC4322a.d(), y.f147855l, ",TRUNCATED");
        interfaceC4322a.e("screens.all", listG);
        int size = listG.size();
        kotlin.ranges.k it = kotlin.ranges.s.r(this.f147850h, size).iterator();
        while (it.f406910d) {
            interfaceC4322a.b("screens.all." + it.a(), "{}");
        }
        this.f147850h = size;
    }
}
