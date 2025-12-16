package com.avito.android.vas_planning.remove;

import aM0.InterfaceC19791a;
import androidx.view.M0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.architecture_components.D;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VasPlannerRemoveViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning/remove/o;", "Landroidx/lifecycle/M0;", "a", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class o extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final VasPlannerRemoveInfo f322498E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f322499J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19791a f322500K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f322501L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public Object f322502M = EmptyDisposable.f401988b;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final D<a> f322503N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final D f322504O;

    /* compiled from: VasPlannerRemoveViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/vas_planning/remove/o$a;", "", "<init>", "()V", "a", "b", "Lcom/avito/android/vas_planning/remove/o$a$a;", "Lcom/avito/android/vas_planning/remove/o$a$b;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* compiled from: VasPlannerRemoveViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_planning/remove/o$a$a;", "Lcom/avito/android/vas_planning/remove/o$a;", "<init>", "()V", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.vas_planning.remove.o$a$a, reason: collision with other inner class name */
        public static final class C9970a extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C9970a f322505a = new C9970a();

            public C9970a() {
                super(null);
            }
        }

        /* compiled from: VasPlannerRemoveViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/remove/o$a$b;", "Lcom/avito/android/vas_planning/remove/o$a;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f322506a;

            public b(@Y61.k String str) {
                super(null);
                this.f322506a = str;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public o(@Y61.k InterfaceC19791a interfaceC19791a, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k VasPlannerRemoveInfo vasPlannerRemoveInfo) {
        this.f322498E = vasPlannerRemoveInfo;
        this.f322499J = interfaceC35745a5;
        this.f322500K = interfaceC19791a;
        this.f322501L = interfaceC28373a;
        D<a> d12 = new D<>();
        this.f322503N = d12;
        this.f322504O = d12;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f322502M.dispose();
    }
}
