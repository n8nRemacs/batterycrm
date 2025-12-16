package com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.util.R0;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: BeduinV1InMemoryRepositoryClientImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/repository/beduin_v1_in_memory/b;", "Lcom/avito/beduin/v2/repository/beduin_v1_in_memory/b;", "_design-modules_beduin-v2_interactions_repository_common_beduin-v1-in-memory_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.beduin.v2.repository.beduin_v1_in_memory.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f176421a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f176422b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f176423c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C43238h f176424d;

    /* compiled from: BeduinV1InMemoryRepositoryClientImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory.BeduinV1InMemoryRepositoryClientImpl$observe$job$1", f = "BeduinV1InMemoryRepositoryClientImpl.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f176425q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f176427s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ p<String, A, G0> f176428t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C36272i f176429u;

        /* compiled from: BeduinV1InMemoryRepositoryClientImpl.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "value", "Lkotlin/G0;", "emit", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory.b$a$a, reason: collision with other inner class name */
        public static final class C5228a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p<String, A, G0> f176430b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f176431c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f176432d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C36272i f176433e;

            /* JADX WARN: Multi-variable type inference failed */
            public C5228a(p<? super String, ? super A, G0> pVar, String str, b bVar, C36272i c36272i) {
                this.f176430b = pVar;
                this.f176431c = str;
                this.f176432d = bVar;
                this.f176433e = c36272i;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                Map mapC = (Map) obj;
                d dVar = this.f176432d.f176423c;
                if (mapC == null) {
                    mapC = P0.c();
                }
                dVar.getClass();
                this.f176430b.invoke(this.f176431c, d.c(mapC, this.f176433e));
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, p<? super String, ? super A, G0> pVar, C36272i c36272i, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f176427s = str;
            this.f176428t = pVar;
            this.f176429u = c36272i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new a(this.f176427s, this.f176428t, this.f176429u, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f176425q;
            if (i12 == 0) {
                C42729a0.b(obj);
                b bVar = b.this;
                g gVar = bVar.f176422b;
                String str = this.f176427s;
                com.avito.android.beduin.common.storage.k kVarA = gVar.a(str);
                C5228a c5228a = new C5228a(this.f176428t, str, bVar, this.f176429u);
                this.f176425q = 1;
                if (kVarA.collect(c5228a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k f fVar, @k g gVar, @k d dVar, @k R0 r02) {
        this.f176421a = fVar;
        this.f176422b = gVar;
        this.f176423c = dVar;
        this.f176424d = U.a(CoroutineContext.Element.DefaultImpls.plus(Q0.a(), r02.b()));
    }

    @Override // com.avito.beduin.v2.repository.beduin_v1_in_memory.a
    public final Object a(C36272i c36272i, String str) {
        Map<String, Object> mapC = this.f176421a.get(str);
        if (mapC == null) {
            mapC = P0.c();
        }
        this.f176423c.getClass();
        return d.c(mapC, c36272i);
    }

    @Override // com.avito.beduin.v2.repository.beduin_v1_in_memory.a
    @k
    public final HV0.c b(@k String str, @k C36272i c36272i, @k p<? super String, ? super A, G0> pVar) {
        return new com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory.a(C43259k.d(this.f176424d, null, null, new a(str, pVar, c36272i, null), 3), 0);
    }

    @Override // com.avito.beduin.v2.repository.beduin_v1_in_memory.a
    public final void c(String str, A a12) {
        this.f176423c.getClass();
        this.f176421a.a(d.d(a12), str);
    }

    @Override // com.avito.beduin.v2.repository.beduin_v1_in_memory.a
    public final void remove(@k String str) {
        this.f176421a.remove(str);
    }
}
