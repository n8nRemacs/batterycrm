package com.avito.android.vas_performance.ui;

import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.deep_linking.K;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import com.avito.android.vas_performance.InterfaceC36056j;
import io.reactivex.rxjava3.core.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PerformanceVasViewModelImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/ui/m;", "Lcom/avito/android/vas_performance/o;", "Landroidx/lifecycle/M0;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class m extends M0 implements com.avito.android.vas_performance.o {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final String f321864E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final String f321865J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.vas_performance.repository.a f321866K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f321867L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36056j f321868M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final TL0.a f321869N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final AK0.l f321870O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public AtomicReference f321871P = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(io.reactivex.rxjava3.internal.functions.a.f401992b);

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C23038g0<P2<?>> f321872Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final C23038g0<String> f321873R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.k
    public final C23038g0<com.avito.android.vas_performance.ui.recycler.g> f321874S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f321875T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.k
    public final D<DeepLink> f321876U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f321877V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.k
    public List<? extends com.avito.conveyor_item.a> f321878W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public List<? extends com.avito.conveyor_item.a> f321879X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.l
    public DeepLink f321880Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f321881Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final D f321882a0;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f321883b0;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final C23038g0 f321884c0;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final D f321885d0;

    /* compiled from: PerformanceVasViewModelImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "LDL0/b;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            DeepLink deepLink;
            T next;
            P2<?> p22 = (P2) obj;
            m mVar = m.this;
            mVar.getClass();
            boolean z12 = p22 instanceof P2.b;
            C23038g0<P2<?>> c23038g0 = mVar.f321872Q;
            TL0.a aVar = mVar.f321869N;
            if (!z12) {
                if (!(p22 instanceof P2.a)) {
                    c23038g0.postValue(p22);
                    return;
                }
                ApiError apiError = ((P2.a) p22).f318719a;
                aVar.i(apiError);
                aVar.f();
                c23038g0.postValue(p22);
                aVar.j(apiError);
                return;
            }
            aVar.h();
            aVar.f();
            DL0.b bVar = (DL0.b) ((P2.b) p22).f318720a;
            mVar.f321878W = mVar.f321868M.a(bVar);
            Iterator<T> it = bVar.f().iterator();
            while (true) {
                deepLink = null;
                if (it.hasNext()) {
                    next = it.next();
                    if (((DL0.c) next).getSelected()) {
                        break;
                    }
                } else {
                    next = (T) null;
                    break;
                }
            }
            DL0.c cVar = next;
            if (cVar != null) {
                ArrayList arrayListKe = m.ke(cVar.getTitle(), mVar.f321878W);
                mVar.f321874S.postValue(new com.avito.android.vas_performance.ui.recycler.g(arrayListKe, C23424o.a(new com.avito.android.vas_performance.ui.recycler.c(mVar.f321879X, arrayListKe), true)));
                mVar.f321879X = arrayListKe;
            }
            C23038g0<String> c23038g02 = mVar.f321873R;
            Action action = bVar.getAction();
            c23038g02.postValue(action != null ? action.getTitle() : null);
            Action action2 = bVar.getAction();
            mVar.f321880Y = action2 != null ? action2.getDeepLink() : null;
            c23038g0.postValue(p22);
            aVar.g();
            AL0.b lightning = bVar.getLightning();
            if (lightning != null) {
                AK0.l lVar = mVar.f321870O;
                if (lVar.c("vas_lighting_bottom_sheet_showed")) {
                    return;
                }
                for (Attribute attribute : lightning.getDescription().getAttributes()) {
                    if ((attribute instanceof DeepLinkAttribute) && L.f(attribute.getName(), "action")) {
                        deepLink = ((DeepLinkAttribute) attribute).getDeepLink();
                    }
                }
                if (deepLink != null) {
                    mVar.f321876U.postValue(deepLink);
                    lVar.putBoolean("vas_lighting_bottom_sheet_showed", true);
                }
            }
        }
    }

    /* compiled from: PerformanceVasViewModelImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f321887b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    public m(@Y61.k String str, @Y61.k String str2, @Y61.k com.avito.android.vas_performance.repository.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC36056j interfaceC36056j, @Y61.k TL0.a aVar2, @Y61.k AK0.l lVar) {
        this.f321864E = str;
        this.f321865J = str2;
        this.f321866K = aVar;
        this.f321867L = interfaceC35745a5;
        this.f321868M = interfaceC36056j;
        this.f321869N = aVar2;
        this.f321870O = lVar;
        C23038g0<P2<?>> c23038g0 = new C23038g0<>();
        this.f321872Q = c23038g0;
        C23038g0<String> c23038g02 = new C23038g0<>();
        this.f321873R = c23038g02;
        C23038g0<com.avito.android.vas_performance.ui.recycler.g> c23038g03 = new C23038g0<>();
        this.f321874S = c23038g03;
        D<DeepLink> d12 = new D<>();
        this.f321875T = d12;
        D<DeepLink> d13 = new D<>();
        this.f321876U = d13;
        this.f321877V = new io.reactivex.rxjava3.disposables.c();
        C42784z0 c42784z0 = C42784z0.f406748b;
        this.f321878W = c42784z0;
        this.f321879X = c42784z0;
        this.f321881Z = c23038g03;
        this.f321882a0 = d12;
        this.f321883b0 = c23038g02;
        this.f321884c0 = c23038g0;
        this.f321885d0 = d13;
        le();
    }

    public static ArrayList ke(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) obj;
            if (!(aVar instanceof com.avito.android.vas_performance.ui.items.vas.c) || L.f(((com.avito.android.vas_performance.ui.items.vas.c) aVar).f321801i, str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // com.avito.android.vas_performance.o
    @Y61.k
    /* renamed from: K, reason: from getter */
    public final C23038g0 getF321881Z() {
        return this.f321881Z;
    }

    @Override // com.avito.android.vas_performance.o
    @Y61.k
    /* renamed from: L7, reason: from getter */
    public final D getF321885d0() {
        return this.f321885d0;
    }

    @Override // com.avito.android.vas_performance.o
    public final void a(@Y61.k Set<? extends TV0.d<?, ?>> set) {
        io.reactivex.rxjava3.disposables.c cVar = this.f321877V;
        cVar.e();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            TV0.d dVar = (TV0.d) it.next();
            boolean z12 = dVar instanceof com.avito.android.vas_performance.ui.items.tabs.e;
            InterfaceC35745a5 interfaceC35745a5 = this.f321867L;
            if (z12) {
                io.reactivex.rxjava3.subjects.e f321777c = ((com.avito.android.vas_performance.ui.items.tabs.e) dVar).getF321777c();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                f321777c.getClass();
                cVar.b(f321777c.y(50L, timeUnit, io.reactivex.rxjava3.schedulers.b.f404942b).d0(new t(this)).j0(interfaceC35745a5.e()).v0(new u(this), v.f322069b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.vas_performance.ui.items.vas.d) {
                io.reactivex.rxjava3.subjects.e f321806c = ((com.avito.android.vas_performance.ui.items.vas.d) dVar).getF321806c();
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                f321806c.getClass();
                cVar.b(f321806c.y(50L, timeUnit2, io.reactivex.rxjava3.schedulers.b.f404942b).j0(interfaceC35745a5.e()).v0(new r(this), s.f321918b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof com.avito.android.vas_performance.ui.items.info_action.d) {
                io.reactivex.rxjava3.subjects.e f321703c = ((com.avito.android.vas_performance.ui.items.info_action.d) dVar).getF321703c();
                p pVar = new p(this);
                l41.g<? super Throwable> gVar = q.f321891b;
                f321703c.getClass();
                cVar.b(f321703c.v0(pVar, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
            } else if (dVar instanceof K) {
                z<DeepLink> zVarK = ((K) dVar).k();
                TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
                zVarK.getClass();
                cVar.b(zVarK.y(50L, timeUnit3, io.reactivex.rxjava3.schedulers.b.f404942b).j0(interfaceC35745a5.e()).v0(new n(this), o.f321889b, io.reactivex.rxjava3.internal.functions.a.f401993c));
            }
        }
    }

    @Override // com.avito.android.vas_performance.o
    @Y61.k
    /* renamed from: g0, reason: from getter */
    public final C23038g0 getF321884c0() {
        return this.f321884c0;
    }

    @Override // com.avito.android.vas_performance.o
    public final void h0() {
        le();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    public final void le() {
        this.f321871P.dispose();
        this.f321869N.c();
        this.f321871P = (AtomicReference) this.f321866K.g(this.f321864E, this.f321865J).j0(this.f321867L.e()).v0(new a(), b.f321887b, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.vas_performance.o
    public final void pa() {
        DeepLink deepLink = this.f321880Y;
        if (deepLink != null) {
            this.f321876U.postValue(deepLink);
        }
    }

    @Override // com.avito.android.vas_performance.o
    @Y61.k
    /* renamed from: q0, reason: from getter */
    public final C23038g0 getF321883b0() {
        return this.f321883b0;
    }

    @Override // com.avito.android.vas_performance.o
    @Y61.k
    /* renamed from: w5, reason: from getter */
    public final D getF321882a0() {
        return this.f321882a0;
    }
}
