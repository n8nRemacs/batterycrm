package com.avito.android.tariff_cpt.configure.forbidden.viewmodel;

import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.analytics.screens.utils.D;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35745a5;
import i31.InterfaceC41220a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.single.C42021t;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l41.o;
import mC0.C43945a;

/* compiled from: CptForbiddenViewModel.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/forbidden/viewmodel/g;", "Landroidx/lifecycle/M0;", "a", "b", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @l
    public final String f297634E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_cpt.configure.forbidden.viewmodel.d f297635J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.tariff_cpt.configure.forbidden.viewmodel.a f297636K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f297637L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f297638M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f297639N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f297640O = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C23038g0<b> f297641P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f297642Q;

    /* compiled from: CptForbiddenViewModel.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/forbidden/viewmodel/g$a;", "", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        g a(@l @InterfaceC41220a String str);
    }

    /* compiled from: CptForbiddenViewModel.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/forbidden/viewmodel/g$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/tariff_cpt/configure/forbidden/viewmodel/g$b$a;", "Lcom/avito/android/tariff_cpt/configure/forbidden/viewmodel/g$b$b;", "Lcom/avito/android/tariff_cpt/configure/forbidden/viewmodel/g$b$c;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: CptForbiddenViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/forbidden/viewmodel/g$b$a;", "Lcom/avito/android/tariff_cpt/configure/forbidden/viewmodel/g$b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f297643a;

            public a(@Y61.k String str) {
                super(null);
                this.f297643a = str;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f297643a, ((a) obj).f297643a);
            }

            public final int hashCode() {
                return this.f297643a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Error(message="), this.f297643a, ')');
            }
        }

        /* compiled from: CptForbiddenViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/forbidden/viewmodel/g$b$b;", "Lcom/avito/android/tariff_cpt/configure/forbidden/viewmodel/g$b;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.tariff_cpt.configure.forbidden.viewmodel.g$b$b, reason: collision with other inner class name */
        public static final class C9088b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C9088b f297644a = new C9088b();

            public C9088b() {
                super(null);
            }
        }

        /* compiled from: CptForbiddenViewModel.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_cpt/configure/forbidden/viewmodel/g$b$c;", "Lcom/avito/android/tariff_cpt/configure/forbidden/viewmodel/g$b;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final C43945a f297645a;

            public c(@Y61.k C43945a c43945a) {
                super(null);
                this.f297645a = c43945a;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f297645a, ((c) obj).f297645a);
            }

            public final int hashCode() {
                return this.f297645a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "Success(data=" + this.f297645a + ')';
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: CptForbiddenViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            g.this.f297641P.postValue(b.C9088b.f297644a);
        }
    }

    /* compiled from: CptForbiddenViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LmC0/a;", "model", "Lkotlin/G0;", "invoke", "(LmC0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<C43945a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C43945a c43945a) {
            C43945a c43945a2 = c43945a;
            g gVar = g.this;
            gVar.f297641P.setValue(new b.c(c43945a2));
            AttributedText attributedText = c43945a2.f414401c;
            if (attributedText != null) {
                z<DeepLink> zVarLinkClicksV3 = attributedText.linkClicksV3();
                final com.avito.android.deeplink_handler.handler.composite.a aVar = gVar.f297638M;
                gVar.f297640O.b(zVarLinkClicksV3.t0(new l41.g() { // from class: com.avito.android.tariff_cpt.configure.forbidden.viewmodel.i
                    @Override // l41.g
                    public final void accept(Object obj) {
                        b.a.a(aVar, (DeepLink) obj, null, null, 6);
                    }
                }));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CptForbiddenViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<Throwable, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            com.avito.android.error.z.h(th2, new h(g.this), null, null, 62);
            return G0.f406611a;
        }
    }

    @i31.c
    public g(@l @InterfaceC41220a String str, @Y61.k com.avito.android.tariff_cpt.configure.forbidden.viewmodel.d dVar, @Y61.k com.avito.android.tariff_cpt.configure.forbidden.viewmodel.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f297634E = str;
        this.f297635J = dVar;
        this.f297636K = aVar;
        this.f297637L = interfaceC35745a5;
        this.f297638M = aVar2;
        this.f297639N = screenPerformanceTracker;
        C23038g0<b> c23038g0 = new C23038g0<>();
        this.f297641P = c23038g0;
        this.f297642Q = c23038g0;
        O();
    }

    public final void O() {
        io.reactivex.rxjava3.disposables.c cVar = this.f297640O;
        cVar.e();
        C42021t c42021tJ = this.f297635J.a(this.f297634E).j(new c());
        final com.avito.android.tariff_cpt.configure.forbidden.viewmodel.a aVar = this.f297636K;
        cVar.b(D.a(c42021tJ.r(new o() { // from class: com.avito.android.tariff_cpt.configure.forbidden.viewmodel.g.d
            @Override // l41.o
            public final Object apply(Object obj) {
                return aVar.a((KC0.c) obj);
            }
        }).s(this.f297637L.e()), this.f297639N, null, new e(), new f(), 18));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f297640O.e();
    }
}
