package com.avito.android.arch.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.arch.mvi.log.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FeatureBuilder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00020\u0001*\b\b\u0003\u0010\u0005*\u00020\u00012\u00020\u0001¨\u0006\u0006"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "", "Action", "InternalAction", "State", "OneTimeEvent", "_common_mvi-flow_util-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class q<Action, InternalAction, State, OneTimeEvent> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f92005a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final State f92006b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final N f92007c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public com.avito.android.arch.mvi.b<InternalAction> f92008d = b.f92016a;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public com.avito.android.arch.mvi.a<Action, InternalAction, State> f92009e = a.f92015a;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public t<InternalAction, OneTimeEvent> f92010f = new com.avito.android.advert.item.delivery_suggests.l(22);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public u<InternalAction, State> f92011g = new com.avito.android.advert.item.delivery_suggests.l(23);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public a.C2710a f92012h = new a.C2710a(null, null, 3, null);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public CoroutineContext f92013i = EmptyCoroutineContext.INSTANCE;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public r f92014j;

    /* compiled from: FeatureBuilder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Action", "InternalAction", "State", "OneTimeEvent", "<anonymous parameter 0>", "<anonymous parameter 1>", "Lkotlinx/coroutines/flow/i;", "process", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<Action, InternalAction, State> implements com.avito.android.arch.mvi.a {

        /* renamed from: a, reason: collision with root package name */
        public static final a<Action, InternalAction, State> f92015a = new a<>();

        @Override // com.avito.android.arch.mvi.a
        @Y61.k
        public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
            return a.C2701a.a(this, c43197r1, aVar);
        }

        @Override // com.avito.android.arch.mvi.a
        @Y61.k
        public final InterfaceC43160i<InternalAction> b(@Y61.k Action action, @Y61.k State state) {
            return C43175k.w();
        }
    }

    /* compiled from: FeatureBuilder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000\"\b\b\u0003\u0010\u0004*\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Action", "InternalAction", "State", "OneTimeEvent", "Lkotlinx/coroutines/flow/i;", "produce", "()Lkotlinx/coroutines/flow/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<InternalAction> implements com.avito.android.arch.mvi.b {

        /* renamed from: a, reason: collision with root package name */
        public static final b<InternalAction> f92016a = new b<>();

        @Override // com.avito.android.arch.mvi.b
        @Y61.k
        public final InterfaceC43160i<InternalAction> a() {
            return C43175k.w();
        }

        @Override // com.avito.android.arch.mvi.b
        @Y61.l
        public final Object b(@Y61.k Continuation<? super G0> continuation) {
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(@Y61.k String str, @Y61.k State state, @Y61.k Y41.l<? super q<Action, InternalAction, State, OneTimeEvent>, G0> lVar) {
        this.f92005a = str;
        this.f92006b = state;
        this.f92007c = (N) lVar;
        r.f92017c.getClass();
        this.f92014j = r.f92018d;
    }

    public static /* synthetic */ c b(q qVar, c60.c cVar, T t12, int i12) {
        if ((i12 & 1) != 0) {
            cVar = null;
        }
        if ((i12 & 2) != 0) {
            t12 = U.a(EmptyCoroutineContext.INSTANCE);
        }
        return qVar.a(cVar, t12);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Y61.k
    public final c<Action, InternalAction, State, OneTimeEvent> a(@Y61.l State state, @Y61.k T t12) {
        this.f92007c.invoke(this);
        if (state == null) {
            state = this.f92006b;
        }
        return new c<>(state, this.f92008d, this.f92009e, this.f92010f, this.f92011g, this.f92005a, this.f92012h, U.f(t12, this.f92013i), this.f92014j);
    }

    @Y61.k
    public final void c(@Y61.k AW.b bVar, @Y61.k com.avito.android.arch.mvi.log.g gVar) {
        this.f92012h = new a.C2710a(bVar, gVar);
    }
}
