package com.avito.android.advert_core.safedeal;

import androidx.view.C23038g0;
import androidx.view.M0;
import com.avito.android.advert_core.safedeal.q;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.MyAdvertSafeDeal;
import com.avito.android.remote.model.MyAdvertSafeDealKt;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: MyAdvertSafeDealServicesViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/safedeal/r;", "Landroidx/lifecycle/M0;", "Lcom/avito/android/advert_core/safedeal/q;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class r extends M0 implements q {

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.safedeal.d f84230E;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f84231J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.safedeal.b f84232K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<MyAdvertSafeDeal> f84233L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f84234M = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet f84235N = new LinkedHashSet();

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Q<MyAdvertSafeDeal, Set<String>>> f84236O = new C23038g0<>();

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Q<String, Boolean>> f84237P = new C23038g0<>();

    /* renamed from: Q, reason: collision with root package name */
    @Y61.k
    public final C23038g0<Q<String, Boolean>> f84238Q = new C23038g0<>();

    /* renamed from: R, reason: collision with root package name */
    @Y61.k
    public final D<q.a> f84239R;

    /* compiled from: MyAdvertSafeDealServicesViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", "loadingState", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f84241c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f84242d;

        public a(String str, boolean z12) {
            this.f84241c = str;
            this.f84242d = z12;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2 p22 = (P2) obj;
            boolean z12 = p22 instanceof P2.c;
            String str = this.f84241c;
            r rVar = r.this;
            if (z12) {
                rVar.f84237P.setValue(new Q<>(str, Boolean.TRUE));
                return;
            }
            boolean z13 = p22 instanceof P2.b;
            boolean z14 = this.f84242d;
            if (!z13) {
                if (p22 instanceof P2.a) {
                    rVar.f84237P.setValue(new Q<>(str, Boolean.FALSE));
                    rVar.f84238Q.setValue(new Q<>(str, Boolean.valueOf(!z14)));
                    r.ke(rVar, z14, null, ((P2.a) p22).f318719a, 2);
                    return;
                }
                return;
            }
            rVar.f84237P.setValue(new Q<>(str, Boolean.FALSE));
            rVar.f84238Q.setValue(new Q<>(str, Boolean.valueOf(z14)));
            LinkedHashSet linkedHashSet = rVar.f84235N;
            if (z14) {
                linkedHashSet.add(str);
            } else {
                linkedHashSet.remove(str);
            }
        }
    }

    /* compiled from: MyAdvertSafeDealServicesViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f84244c;

        public b(boolean z12) {
            this.f84244c = z12;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            V2.f318762a.f(th2);
            r.ke(r.this, this.f84244c, th2, null, 4);
        }
    }

    /* compiled from: MyAdvertSafeDealServicesViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/MyAdvertSafeDeal;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/MyAdvertSafeDeal;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            MyAdvertSafeDeal myAdvertSafeDeal = (MyAdvertSafeDeal) obj;
            r rVar = r.this;
            rVar.f84235N.clear();
            Iterator<T> it = MyAdvertSafeDealKt.switchers(myAdvertSafeDeal.getServices()).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                LinkedHashSet linkedHashSet = rVar.f84235N;
                if (!zHasNext) {
                    rVar.f84236O.setValue(new Q<>(myAdvertSafeDeal, linkedHashSet));
                    return;
                }
                MyAdvertSafeDeal.Service.Content.Switcher switcher = (MyAdvertSafeDeal.Service.Content.Switcher) it.next();
                String id2 = switcher.getId();
                if (L.f(switcher.isSwitchOn(), Boolean.TRUE) && id2 != null) {
                    linkedHashSet.add(id2);
                }
            }
        }
    }

    /* compiled from: MyAdvertSafeDealServicesViewModel.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
            r.this.le();
        }
    }

    public r(@Y61.k com.avito.android.advert_core.safedeal.d dVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.advert_core.safedeal.b bVar, @Y61.k com.jakewharton.rxrelay3.d<MyAdvertSafeDeal> dVar2) {
        this.f84230E = dVar;
        this.f84231J = interfaceC35745a5;
        this.f84232K = bVar;
        this.f84233L = dVar2;
        new C23038g0();
        this.f84239R = new D<>();
        le();
    }

    public static void ke(r rVar, boolean z12, Throwable th2, ApiError apiError, int i12) {
        if ((i12 & 2) != 0) {
            th2 = null;
        }
        if ((i12 & 4) != 0) {
            apiError = null;
        }
        com.avito.android.advert_core.safedeal.b bVar = rVar.f84232K;
        rVar.f84239R.setValue(new q.a(apiError, z12 ? bVar.f84184a : bVar.f84185b, th2));
    }

    @Override // com.avito.android.advert_core.safedeal.q
    /* renamed from: K, reason: from getter */
    public final C23038g0 getF84236O() {
        return this.f84236O;
    }

    @Override // com.avito.android.advert_core.safedeal.q
    public final void Ra(@Y61.k String str, boolean z12) {
        this.f84234M.b(this.f84230E.a(str, z12).j0(this.f84231J.e()).v0(new a(str, z12), new b(z12), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.advert_core.safedeal.q
    /* renamed from: dd, reason: from getter */
    public final C23038g0 getF84237P() {
        return this.f84237P;
    }

    public final void le() {
        this.f84234M.b(this.f84233L.j0(this.f84231J.e()).v0(new c(), new d(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        super.onCleared();
        this.f84234M.e();
    }

    @Override // com.avito.android.advert_core.safedeal.q
    /* renamed from: v4, reason: from getter */
    public final C23038g0 getF84238Q() {
        return this.f84238Q;
    }

    @Override // com.avito.android.advert_core.safedeal.q
    /* renamed from: x5, reason: from getter */
    public final D getF84239R() {
        return this.f84239R;
    }
}
