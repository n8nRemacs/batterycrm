package com.avito.android.analytics.screens.tracker.fps;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.L;
import com.avito.android.analytics.screens.tracker.fps.h;
import com.avito.android.analytics.screens.u;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ScreenFpsTracker.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/fps/f;", "Lcom/avito/android/analytics/screens/tracker/fps/e;", "Lcom/avito/android/analytics/screens/tracker/L$a;", "a", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f extends L.a implements e {

    /* renamed from: j, reason: collision with root package name */
    public static final long f90869j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f90870k = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final z<com.avito.android.fps.a> f90871a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final u f90872b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public y f90873c;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.analytics.screens.tracker.degrade.fps.a f90875e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Long f90876f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Long f90877g;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f90874d = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final Set<RecyclerView> f90878h = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: i, reason: collision with root package name */
    @k
    public final LinkedHashSet f90879i = new LinkedHashSet();

    /* compiled from: ScreenFpsTracker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/fps/f$a;", "", "<init>", "()V", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ScreenFpsTracker.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/analytics/screens/tracker/fps/f$b", "Landroidx/lifecycle/L;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC22979L {

        /* compiled from: ScreenFpsTracker.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f90881a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f90881a = iArr;
            }
        }

        public b() {
        }

        @Override // androidx.view.InterfaceC22979L
        public final void HH(@k InterfaceC22983P interfaceC22983P, @k Lifecycle.Event event) {
            int i12 = a.f90881a[event.ordinal()];
            f fVar = f.this;
            if (i12 == 1) {
                int i13 = f.f90870k;
                fVar.getClass();
                fVar.f90873c = (y) fVar.f90871a.t0(new g(fVar));
                return;
            }
            if (i12 != 2) {
                return;
            }
            Iterator it = fVar.f90874d.values().iterator();
            while (it.hasNext()) {
                ((com.avito.android.analytics.screens.tracker.fps.b) it.next()).c();
            }
            y yVar = fVar.f90873c;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            fVar.f90873c = null;
        }
    }

    /* compiled from: ScreenFpsTracker.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/analytics/screens/tracker/fps/f$c", "Landroidx/recyclerview/widget/RecyclerView$r;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends RecyclerView.r {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public final void i(int i12, @k RecyclerView recyclerView) {
            f fVar = f.this;
            if (i12 == 0) {
                fVar.f90878h.remove(recyclerView);
            } else if (i12 == 1) {
                fVar.f90878h.add(recyclerView);
            }
            fVar.f90872b.getClass();
            fVar.f90877g = Long.valueOf(u.c());
        }
    }

    /* compiled from: ScreenFpsTracker.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/analytics/screens/tracker/fps/f$d", "Lcom/avito/android/analytics/screens/tracker/fps/h$a;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements h.a {
        public d() {
        }

        @Override // com.avito.android.analytics.screens.tracker.fps.h.a
        public final void a(@k UUID uuid) {
            f fVar = f.this;
            fVar.f90872b.getClass();
            fVar.f90877g = Long.valueOf(u.c());
            fVar.f90879i.remove(uuid);
        }

        @Override // com.avito.android.analytics.screens.tracker.fps.h.a
        public final void b(@k UUID uuid) {
            f fVar = f.this;
            fVar.f90872b.getClass();
            fVar.f90877g = Long.valueOf(u.c());
            fVar.f90879i.add(uuid);
        }
    }

    static {
        new a(null);
        f90869j = TimeUnit.SECONDS.toMillis(1L);
    }

    public f(@RE.a @k z<com.avito.android.fps.a> zVar, @k Screen screen, @k u uVar, @k L l12, @k com.avito.android.analytics.screens.tracker.degrade.fps.f fVar, @k com.avito.android.analytics.screens.tracker.fps.a aVar) {
        this.f90871a = zVar;
        this.f90872b = uVar;
        this.f90875e = new com.avito.android.analytics.screens.tracker.degrade.fps.a(screen, fVar.f90828a.getSharedPreferences("DegradeScrollFPS", 0), fVar.f90829b);
        Iterator it = ((AbstractC42738c) ScreenFpsContext.f90851g).iterator();
        while (it.hasNext()) {
            ScreenFpsContext screenFpsContext = (ScreenFpsContext) it.next();
            this.f90874d.put(screenFpsContext, new com.avito.android.analytics.screens.tracker.fps.c(aVar.f90853a, aVar.f90854b, aVar.f90855c, aVar.f90856d, aVar.f90857e, screenFpsContext, aVar.f90858f));
        }
        l12.f90768a.add(this);
    }

    @Override // com.avito.android.analytics.screens.tracker.fps.e
    public final void a(@k RecyclerView recyclerView) {
        recyclerView.o(new c());
        com.avito.android.analytics.screens.tracker.degrade.fps.a aVar = this.f90875e;
        aVar.getClass();
        recyclerView.m(new com.avito.android.analytics.screens.tracker.degrade.fps.b(aVar));
    }

    @Override // com.avito.android.analytics.screens.tracker.L.a
    public final void b(long j12) {
        LinkedHashMap linkedHashMap = this.f90874d;
        com.avito.android.analytics.screens.tracker.fps.b bVar = (com.avito.android.analytics.screens.tracker.fps.b) P0.d(linkedHashMap, ScreenFpsContext.f90849e);
        com.avito.android.analytics.screens.tracker.fps.b bVar2 = (com.avito.android.analytics.screens.tracker.fps.b) P0.d(linkedHashMap, ScreenFpsContext.f90847c);
        this.f90872b.getClass();
        Iterator it = bVar.b(u.c() - j12).iterator();
        while (it.hasNext()) {
            bVar2.a((com.avito.android.fps.a) it.next());
        }
        this.f90876f = Long.valueOf(u.c());
    }

    public final void c(@k InterfaceC22983P interfaceC22983P) {
        interfaceC22983P.getLifecycle().a(new b());
    }

    @Override // com.avito.android.analytics.screens.tracker.fps.e
    public final void g(@k h hVar) {
        hVar.a(new d());
    }
}
