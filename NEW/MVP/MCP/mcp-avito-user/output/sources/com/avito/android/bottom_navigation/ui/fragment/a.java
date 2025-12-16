package com.avito.android.bottom_navigation.ui.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.C28429n;
import com.avito.android.bottom_navigation.F;
import com.avito.android.bottom_navigation.ui.fragment.c;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.C41977p;
import io.reactivex.rxjava3.internal.operators.observable.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.o;
import l41.r;
import p41.AbstractC46895b;

/* compiled from: BottomNavigationLifecycleLogger.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/a;", "Landroidx/fragment/app/FragmentManager$n;", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"CheckResult"})
/* loaded from: classes11.dex */
public final class a extends FragmentManager.n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final F f107125a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f107126b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f107127c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.bottom_navigation.ui.fragment.c> f107128d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final y f107129e;

    /* compiled from: BottomNavigationLifecycleLogger.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/fragment/c;", "kotlin.jvm.PlatformType", "it", "", "test", "(Lcom/avito/android/bottom_navigation/ui/fragment/c;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bottom_navigation.ui.fragment.a$a, reason: collision with other inner class name */
    public static final class C3199a<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final C3199a<T> f107130b = new C3199a<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            com.avito.android.bottom_navigation.ui.fragment.c cVar = (com.avito.android.bottom_navigation.ui.fragment.c) obj;
            return ((cVar.f107140b instanceof TabContainerFragment) || L.f(cVar.f107139a, GrsBaseInfo.CountryCodeSource.UNKNOWN)) ? false : true;
        }
    }

    /* compiled from: BottomNavigationLifecycleLogger.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0015\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0003¢\u0006\u0002\b\u00040\u0000¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/avito/android/bottom_navigation/ui/fragment/c;", "kotlin.jvm.PlatformType", "", "Lj41/e;", "it", "", "test", "(Ljava/util/List;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f107131b = new b<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return !((List) obj).isEmpty();
        }
    }

    /* compiled from: BottomNavigationLifecycleLogger.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u000622\u0010\u0005\u001a.\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0015\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0003¢\u0006\u0002\b\u00040\u0000¢\u0006\u0002\b\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/avito/android/bottom_navigation/ui/fragment/c;", "kotlin.jvm.PlatformType", "", "Lj41/e;", "bufferedEvents", "Lcom/avito/android/analytics/event/n;", "apply", "(Ljava/util/List;)Lcom/avito/android/analytics/event/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f107132b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f107133c;

        public c(String str, String str2) {
            this.f107132b = str;
            this.f107133c = str2;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.avito.android.bottom_navigation.ui.fragment.c) it.next()).f107140b);
            }
            return new C28429n(this.f107132b, this.f107133c, arrayList);
        }
    }

    /* compiled from: BottomNavigationLifecycleLogger.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/analytics/event/n;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/analytics/event/n;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            a.this.f107126b.c((C28429n) obj);
        }
    }

    /* compiled from: BottomNavigationLifecycleLogger.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T> f107135b = new e<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.a("BottomNavigationFragmentLifecycleCallbacks", " stream error", (Throwable) obj);
        }
    }

    /* compiled from: Observables.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "KeyT", "EventT", "OutT", "event", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "com/avito/android/util/rx3/n0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T, R> implements o {
        @Override // l41.o
        @Y61.k
        public final String apply(@Y61.k com.avito.android.bottom_navigation.ui.fragment.c cVar) {
            return cVar.f107139a;
        }
    }

    /* compiled from: Observables.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "KeyT", "EventT", "OutT", "Lp41/b;", "groupedObs", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lp41/b;)Lio/reactivex/rxjava3/core/E;", "com/avito/android/util/rx3/o0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T, R> implements o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f107137c;

        public g(String str) {
            this.f107137c = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.o
        public final Object apply(Object obj) {
            AbstractC46895b abstractC46895b = (AbstractC46895b) obj;
            String str = (String) abstractC46895b.f428195b;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            H hC2 = a.this.f107127c.c();
            Objects.requireNonNull(timeUnit, "unit is null");
            io.reactivex.rxjava3.internal.functions.b.a(Integer.MAX_VALUE, "count");
            C41977p c41977p = new C41977p(abstractC46895b, timeUnit, hC2);
            b<T> bVar = b.f107131b;
            Objects.requireNonNull(bVar, "predicate is null");
            return new z1(c41977p, bVar).d0(new c(str, this.f107137c));
        }
    }

    /* compiled from: Observables.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\b\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "KeyT", "EventT", "OutT", "event", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "com/avito/android/util/rx3/n0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T, R> implements o {
        @Override // l41.o
        @Y61.k
        public final String apply(@Y61.k com.avito.android.bottom_navigation.ui.fragment.c cVar) {
            return cVar.f107141c;
        }
    }

    /* compiled from: Observables.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "KeyT", "EventT", "OutT", "Lp41/b;", "groupedObs", "Lio/reactivex/rxjava3/core/E;", "apply", "(Lp41/b;)Lio/reactivex/rxjava3/core/E;", "com/avito/android/util/rx3/o0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T, R> implements o {
        public i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.o
        public final Object apply(Object obj) {
            AbstractC46895b abstractC46895b = (AbstractC46895b) obj;
            return abstractC46895b.Z(new f()).T(a.this.new g((String) abstractC46895b.f428195b), Integer.MAX_VALUE);
        }
    }

    public a(@Y61.k F f12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f107125a = f12;
        this.f107126b = interfaceC28373a;
        this.f107127c = interfaceC35745a5;
        com.jakewharton.rxrelay3.c<com.avito.android.bottom_navigation.ui.fragment.c> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f107128d = cVar;
        this.f107129e = (y) cVar.N(C3199a.f107130b).Z(new h()).T(new i(), Integer.MAX_VALUE).x0(interfaceC35745a5.a()).v0(new d(), e.f107135b, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(androidx.fragment.app.Fragment r4, com.avito.android.bottom_navigation.F r5) {
        /*
            java.lang.String r0 = r4.getTag()
            r1 = 0
            if (r0 == 0) goto L35
            if (r5 == 0) goto L12
            java.util.List<com.avito.android.bottom_navigation.NavigationTabSetItem> r2 = r5.f106933b
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L12
            goto L2f
        L12:
            java.util.List<com.avito.android.bottom_navigation.NavigationTabSetItem> r2 = r5.f106933b
            java.util.Iterator r2 = r2.iterator()
        L18:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.next()
            com.avito.android.bottom_navigation.NavigationTabSetItem r3 = (com.avito.android.bottom_navigation.NavigationTabSetItem) r3
            java.lang.String r3 = r3.getName()
            boolean r3 = kotlin.jvm.internal.L.f(r3, r0)
            if (r3 == 0) goto L18
            goto L30
        L2f:
            r0 = r1
        L30:
            if (r0 != 0) goto L33
            goto L35
        L33:
            r1 = r0
            goto L3f
        L35:
            androidx.fragment.app.Fragment r4 = r4.getParentFragment()
            if (r4 == 0) goto L3f
            java.lang.String r1 = a(r4, r5)
        L3f:
            if (r1 != 0) goto L43
            java.lang.String r1 = "UNKNOWN"
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bottom_navigation.ui.fragment.a.a(androidx.fragment.app.Fragment, com.avito.android.bottom_navigation.F):java.lang.String");
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public final void onFragmentCreated(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment, @Y61.l Bundle bundle) {
        this.f107128d.accept(new c.a(a(fragment, this.f107125a), fragment, "created", null));
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public final void onFragmentDestroyed(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment) {
        this.f107128d.accept(new c.b(a(fragment, this.f107125a), fragment, "destroyed", null));
        y yVar = this.f107129e;
        yVar.getClass();
        DisposableHelper.a(yVar);
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public final void onFragmentStarted(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment) {
        this.f107128d.accept(new c.C3200c(a(fragment, this.f107125a), fragment, "started", null));
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public final void onFragmentStopped(@Y61.k FragmentManager fragmentManager, @Y61.k Fragment fragment) {
        this.f107128d.accept(new c.d(a(fragment, this.f107125a), fragment, "stopped", null));
    }
}
