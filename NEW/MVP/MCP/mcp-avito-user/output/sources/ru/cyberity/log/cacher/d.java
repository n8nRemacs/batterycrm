package ru.cyberity.log.cacher;

import Y41.p;
import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43225h;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43315z0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;

/* compiled from: SinkCache.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/cyberity/log/cacher/d;", "", "<init>", "()V", "Lru/cyberity/log/cacher/b;", "processor", "", "a", "(Lru/cyberity/log/cacher/b;)Z", "Lkotlin/G0;", "b", "c", "Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/T;", "scope", "", "Ljava/util/Set;", "processors", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f436072a = new d();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private static final T scope = U.a(new C43315z0(Executors.newSingleThreadExecutor()));

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private static final Set<b> processors = new LinkedHashSet();

    /* compiled from: SinkCache.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "ru.cyberity.log.cacher.SinkCache$flush$1", f = "SinkCache.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f436075a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f436076b;

        /* compiled from: SinkCache.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "ru.cyberity.log.cacher.SinkCache$flush$1$1$1", f = "SinkCache.kt", i = {}, l = {131}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: ru.cyberity.log.cacher.d$a$a, reason: collision with other inner class name */
        public static final class C12563a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f436077a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f436078b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12563a(b bVar, Continuation<? super C12563a> continuation) {
                super(2, continuation);
                this.f436078b = bVar;
            }

            @Override // Y41.p
            @l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
                return ((C12563a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C12563a(this.f436078b, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f436077a;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    b bVar = this.f436078b;
                    this.f436077a = 1;
                    if (bVar.a(this) == coroutine_suspended) {
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

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // Y41.p
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@k T t12, @l Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(continuation);
            aVar.f436076b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f436075a;
            if (i12 == 0) {
                C42729a0.b(obj);
                T t12 = (T) this.f436076b;
                Set set = d.processors;
                ArrayList arrayList = new ArrayList(C42745f0.q(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(C43259k.b(t12, null, new C12563a((b) it.next(), null), 3));
                }
                this.f436075a = 1;
                if (C43225h.a(arrayList, this) == coroutine_suspended) {
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

    private d() {
    }

    public final void b() {
        C43259k.d(scope, null, null, new a(null), 3);
    }

    public final void c() {
        U.b(scope, null);
    }

    public final boolean a(@k b processor) {
        return processors.add(processor);
    }
}
