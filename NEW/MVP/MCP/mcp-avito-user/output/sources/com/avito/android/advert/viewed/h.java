package com.avito.android.advert.viewed;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.serp.adapter.m1;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: ViewedAdvertsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert.viewed.ViewedAdvertsPresenterImpl$checkViewedAdvertsAsync$1", f = "ViewedAdvertsPresenter.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class h extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f81021q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UV0.a<? extends TV0.a> f81022r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f81023s;

    /* compiled from: ViewedAdvertsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/util/HashSet;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advert.viewed.ViewedAdvertsPresenterImpl$checkViewedAdvertsAsync$1$newViewedAdverts$1", f = "ViewedAdvertsPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super HashSet<String>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ g f81024q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ArrayList f81025r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, ArrayList arrayList, Continuation continuation) {
            super(2, continuation);
            this.f81024q = gVar;
            this.f81025r = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f81024q, this.f81025r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super HashSet<String>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return C42745f0.K0(this.f81024q.f81011b.c(this.f81025r));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(UV0.a<? extends TV0.a> aVar, g gVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f81022r = aVar;
        this.f81023s = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new h(this.f81022r, this.f81023s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r5v15, types: [com.avito.android.advert.viewed.j, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f81021q;
        g gVar = this.f81023s;
        if (i12 == 0) {
            C42729a0.b(obj);
            UV0.b<TV0.a> bVarB = com.avito.konveyor.util.g.b(this.f81022r);
            ArrayList arrayList = new ArrayList();
            for (TV0.a aVar : bVarB) {
                m1 m1Var = aVar instanceof m1 ? (m1) aVar : null;
                String f291445k = (m1Var == null || m1Var.getF107481q()) ? null : m1Var.getF157692b();
                if (f291445k != null) {
                    arrayList.add(f291445k);
                }
            }
            kotlinx.coroutines.scheduling.b bVarA = gVar.f81012c.a();
            a aVar2 = new a(gVar, arrayList, null);
            this.f81021q = 1;
            obj = C43259k.g(bVarA, aVar2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        HashSet hashSet = (HashSet) obj;
        UV0.a<? extends TV0.a> aVar3 = gVar.f81019j;
        if (aVar3 != null) {
            int i13 = 0;
            for (Object obj2 : com.avito.konveyor.util.g.b(aVar3)) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                TV0.a aVar4 = (TV0.a) obj2;
                if (aVar4 instanceof m1) {
                    m1 m1Var2 = (m1) aVar4;
                    if (hashSet.contains(m1Var2.getF157692b())) {
                        m1Var2.setViewed(true);
                        try {
                            ?? r52 = gVar.f81017h;
                            if (r52 != 0) {
                                r52.C3(i13);
                            }
                        } catch (Throwable th2) {
                            V2.f318762a.f(th2);
                        }
                    }
                }
                i13 = i14;
            }
        }
        return G0.f406611a;
    }
}
