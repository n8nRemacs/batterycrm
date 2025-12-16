package com.avito.android.tariff_cpt.configure.migration.viewmodel;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.analytics.screens.utils.D;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.error.z;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l41.o;
import sC0.C48030a;

/* compiled from: CptMigrationViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/migration/viewmodel/h;", "Landroidx/lifecycle/M0;", "a", "b", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final String f298080E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_cpt.configure.migration.viewmodel.e f298081J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_cpt.configure.migration.viewmodel.a f298082K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f298083L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f298084M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f298085N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f298086O = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public AtomicReference f298087P = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C23038g0<b> f298088Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f298089R;

    /* compiled from: CptMigrationViewModel.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/migration/viewmodel/h$a;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        h a(@Y61.l @InterfaceC41220a String str);
    }

    /* compiled from: CptMigrationViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/migration/viewmodel/h$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/tariff_cpt/configure/migration/viewmodel/h$b$a;", "Lcom/avito/android/tariff_cpt/configure/migration/viewmodel/h$b$b;", "Lcom/avito/android/tariff_cpt/configure/migration/viewmodel/h$b$c;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: CptMigrationViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/migration/viewmodel/h$b$a;", "Lcom/avito/android/tariff_cpt/configure/migration/viewmodel/h$b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f298090a;

            public a(@Y61.k String str) {
                super(null);
                this.f298090a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f298090a, ((a) obj).f298090a);
            }

            public final int hashCode() {
                return this.f298090a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Error(message="), this.f298090a, ')');
            }
        }

        /* compiled from: CptMigrationViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/migration/viewmodel/h$b$b;", "Lcom/avito/android/tariff_cpt/configure/migration/viewmodel/h$b;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.tariff_cpt.configure.migration.viewmodel.h$b$b, reason: collision with other inner class name */
        public static final class C9106b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C9106b f298091a = new C9106b();

            public C9106b() {
                super(null);
            }
        }

        /* compiled from: CptMigrationViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/migration/viewmodel/h$b$c;", "Lcom/avito/android/tariff_cpt/configure/migration/viewmodel/h$b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final C48030a f298092a;

            public c(@Y61.k C48030a c48030a) {
                super(null);
                this.f298092a = c48030a;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f298092a, ((c) obj).f298092a);
            }

            public final int hashCode() {
                return this.f298092a.f437543a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Success(data=" + this.f298092a + ')';
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: CptMigrationViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            h.this.f298088Q.postValue(b.C9106b.f298091a);
        }
    }

    /* compiled from: CptMigrationViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LKC0/e;", "it", "LsC0/a;", "apply", "(LKC0/e;)LsC0/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T, R> implements o {
        public d() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return h.this.f298082K.a((KC0.e) obj);
        }
    }

    /* compiled from: CptMigrationViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LsC0/a;", "model", "Lkotlin/G0;", "invoke", "(LsC0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<C48030a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C48030a c48030a) {
            h.this.f298088Q.setValue(new b.c(c48030a));
            return G0.f406611a;
        }
    }

    /* compiled from: CptMigrationViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<Throwable, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            z.h(th2, new i(h.this), null, null, 62);
            return G0.f406611a;
        }
    }

    @i31.c
    public h(@Y61.l @InterfaceC41220a String str, @Y61.k com.avito.android.tariff_cpt.configure.migration.viewmodel.e eVar, @Y61.k com.avito.android.tariff_cpt.configure.migration.viewmodel.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f298080E = str;
        this.f298081J = eVar;
        this.f298082K = aVar;
        this.f298083L = interfaceC35745a5;
        this.f298084M = aVar2;
        this.f298085N = screenPerformanceTracker;
        C23038g0<b> c23038g0 = new C23038g0<>();
        this.f298088Q = c23038g0;
        this.f298089R = c23038g0;
        O();
    }

    public final void O() {
        io.reactivex.rxjava3.disposables.c cVar = this.f298086O;
        cVar.e();
        cVar.b(D.a(this.f298081J.a(this.f298080E).j(new c()).r(new d()).s(this.f298083L.e()), this.f298085N, null, new e(), new f(), 18));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void a(@Y61.k Set<? extends TV0.d<?, ?>> set) {
        this.f298087P.dispose();
        I0 i0J0 = com.avito.android.tariff_cpt.common.util.b.a(set).j0(this.f298083L.e());
        l41.g gVar = new l41.g() { // from class: com.avito.android.tariff_cpt.configure.migration.viewmodel.h.g
            @Override // l41.g
            public final void accept(Object obj) {
                b.a.a(h.this.f298084M, (DeepLink) obj, "CPT_MIGRATION_REQUEST_KEY", null, 4);
            }
        };
        final V2 v22 = V2.f318762a;
        this.f298087P = (AtomicReference) i0J0.v0(gVar, new l41.g() { // from class: com.avito.android.tariff_cpt.configure.migration.viewmodel.h.h
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // androidx.view.M0
    public final void onCleared() {
        this.f298086O.e();
        this.f298087P.dispose();
    }
}
