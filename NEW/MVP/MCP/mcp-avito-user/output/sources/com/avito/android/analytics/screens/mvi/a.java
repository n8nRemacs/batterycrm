package com.avito.android.analytics.screens.mvi;

import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MviPerformanceUtils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_analytics-screens-mvi_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* compiled from: MviPerformanceUtils.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/analytics/screens/mvi/q;", "T", VoiceInfo.STATE, "Lkotlin/G0;", "emit", "(Lcom/avito/android/analytics/screens/mvi/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.analytics.screens.mvi.a$a, reason: collision with other inner class name */
    public static final class C2680a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ScreenPerformanceTracker f90641b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f90642c;

        public C2680a(ScreenPerformanceTracker screenPerformanceTracker, Y41.l<? super T, G0> lVar) {
            this.f90641b = screenPerformanceTracker;
            this.f90642c = lVar;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [Y41.l, java.lang.Object] */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            a.i((q) obj, this.f90641b, this.f90642c);
            return G0.f406611a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [State] */
    /* compiled from: MviPerformanceUtils.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/analytics/screens/mvi/q;", "State", "", "OneTimeEvent", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/analytics/screens/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<State> extends N implements Y41.l<State, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ScreenPerformanceTracker f90643l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Object f90644m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ScreenPerformanceTracker screenPerformanceTracker, Y41.l<? super State, G0> lVar) {
            super(1);
            this.f90643l = screenPerformanceTracker;
            this.f90644m = lVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, java.lang.Object] */
        @Override // Y41.l
        public final G0 invoke(Object obj) {
            a.i((q) obj, this.f90643l, new f(this.f90644m));
            return G0.f406611a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [State] */
    /* compiled from: MviPerformanceUtils.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/analytics/screens/mvi/q;", "State", "", "OneTimeEvent", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/analytics/screens/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<State> extends N implements Y41.l<State, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ScreenPerformanceTracker f90645l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Object f90646m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ScreenPerformanceTracker screenPerformanceTracker, Y41.l<? super State, G0> lVar) {
            super(1);
            this.f90645l = screenPerformanceTracker;
            this.f90646m = lVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, java.lang.Object] */
        @Override // Y41.l
        public final G0 invoke(Object obj) {
            a.i((q) obj, this.f90645l, new h(this.f90646m));
            return G0.f406611a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [State] */
    /* compiled from: MviPerformanceUtils.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/analytics/screens/mvi/q;", "State", "", "OneTimeEvent", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/analytics/screens/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<State> extends N implements Y41.l<State, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ScreenPerformanceTracker f90647l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Object f90648m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ScreenPerformanceTracker screenPerformanceTracker, Y41.l<? super State, G0> lVar) {
            super(1);
            this.f90647l = screenPerformanceTracker;
            this.f90648m = lVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, java.lang.Object] */
        @Override // Y41.l
        public final G0 invoke(Object obj) {
            a.i((q) obj, this.f90647l, new j(this.f90648m));
            return G0.f406611a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [State] */
    /* compiled from: MviPerformanceUtils.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/analytics/screens/mvi/q;", "State", "", "OneTimeEvent", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/analytics/screens/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<State> extends N implements Y41.l<State, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ScreenPerformanceTracker f90649l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Object f90650m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ScreenPerformanceTracker screenPerformanceTracker, Y41.l<? super State, G0> lVar) {
            super(1);
            this.f90649l = screenPerformanceTracker;
            this.f90650m = lVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.l, java.lang.Object] */
        @Override // Y41.l
        public final G0 invoke(Object obj) {
            a.i((q) obj, this.f90649l, new l(this.f90650m));
            return G0.f406611a;
        }
    }

    @Y61.l
    public static final <T extends q> Object a(@Y61.k InterfaceC43160i<? extends T> interfaceC43160i, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k Y41.l<? super T, G0> lVar, @Y61.k Continuation<? super G0> continuation) {
        Object objCollect = interfaceC43160i.collect(new C2680a(screenPerformanceTracker, lVar), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }

    public static final void b(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.arch.mvi.android.j jVar, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2) {
        com.avito.android.arch.mvi.android.f.a(jVar, interfaceC22983P, Lifecycle.State.f46681d, lVar, new com.avito.android.analytics.screens.mvi.d(screenPerformanceTracker, lVar2));
    }

    public static final <State extends q, OneTimeEvent> void c(@Y61.k androidx.view.n nVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.arch.mvi.android.m<State, OneTimeEvent> mVar, @Y61.k Y41.l<? super OneTimeEvent, G0> lVar, @Y61.k Y41.l<? super State, G0> lVar2) {
        com.avito.android.arch.mvi.android.f.b(nVar, mVar, lVar, new b(screenPerformanceTracker, lVar2));
    }

    public static final <State extends q, OneTimeEvent> void d(@Y61.k Fragment fragment, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.arch.mvi.android.m<State, OneTimeEvent> mVar, @Y61.k Y41.l<? super OneTimeEvent, G0> lVar, @Y61.k Y41.l<? super State, G0> lVar2) {
        com.avito.android.arch.mvi.android.f.a(mVar, fragment.getViewLifecycleOwner(), Lifecycle.State.f46681d, lVar, new c(screenPerformanceTracker, lVar2));
    }

    public static final <State extends q, OneTimeEvent> void f(@Y61.k androidx.view.n nVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.arch.mvi.android.m<State, OneTimeEvent> mVar, @Y61.k Y41.l<? super OneTimeEvent, G0> lVar, @Y61.k Y41.l<? super State, G0> lVar2) {
        com.avito.android.arch.mvi.android.f.a(mVar, nVar, Lifecycle.State.f46682e, lVar, new d(screenPerformanceTracker, lVar2));
    }

    public static final <State extends q, OneTimeEvent> void g(@Y61.k Fragment fragment, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.arch.mvi.android.m<State, OneTimeEvent> mVar, @Y61.k Y41.l<? super OneTimeEvent, G0> lVar, @Y61.k Y41.l<? super State, G0> lVar2) {
        com.avito.android.arch.mvi.android.f.a(mVar, fragment.getViewLifecycleOwner(), Lifecycle.State.f46682e, lVar, new e(screenPerformanceTracker, lVar2));
    }

    public static final <T extends q> void i(@Y61.k T t12, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k Y41.l<? super T, G0> lVar) {
        screenPerformanceTracker.l();
        r perfTrackerParams = t12.getPerfTrackerParams();
        G0 g02 = null;
        if (perfTrackerParams != null) {
            String str = perfTrackerParams.f90666a;
            screenPerformanceTracker.m(str);
            lVar.invoke(t12);
            ScreenPerformanceTracker.a.c(screenPerformanceTracker, str, perfTrackerParams.f90667b, null, 4);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            lVar.invoke(t12);
        }
        screenPerformanceTracker.f();
    }
}
