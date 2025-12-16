package androidx.privacysandbox.ads.adservices.java.topics;

import Y41.p;
import Y61.k;
import Y61.l;
import com.google.common.util.concurrent.D0;
import j.InterfaceC42164u;
import j.a0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.scheduling.c;

/* compiled from: TopicsManagerFutures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/topics/a;", "", "<init>", "()V", "a", "b", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: TopicsManagerFutures.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/topics/a$a;", "Landroidx/privacysandbox/ads/adservices/java/topics/a;", "Landroidx/privacysandbox/ads/adservices/topics/a;", "request", "Lcom/google/common/util/concurrent/D0;", "Landroidx/privacysandbox/ads/adservices/topics/b;", "a", "(Landroidx/privacysandbox/ads/adservices/topics/a;)Lcom/google/common/util/concurrent/D0;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.java.topics.a$a, reason: collision with other inner class name */
    public static final class C1902a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f53570a = 0;

        /* compiled from: TopicsManagerFutures.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroidx/privacysandbox/ads/adservices/topics/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroidx/privacysandbox/ads/adservices/topics/b;"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1", f = "TopicsManagerFutures.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.topics.a$a$a, reason: collision with other inner class name */
        public static final class C1903a extends SuspendLambda implements p<T, Continuation<? super androidx.privacysandbox.ads.adservices.topics.b>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f53571q;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ androidx.privacysandbox.ads.adservices.topics.a f53573s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1903a(androidx.privacysandbox.ads.adservices.topics.a aVar, Continuation<? super C1903a> continuation) {
                super(2, continuation);
                this.f53573s = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return C1902a.this.new C1903a(this.f53573s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super androidx.privacysandbox.ads.adservices.topics.b> continuation) {
                C1903a c1903a = (C1903a) create(t12, continuation);
                G0 g02 = G0.f406611a;
                c1903a.invokeSuspend(g02);
                return g02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f53571q;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return obj;
                }
                C42729a0.b(obj);
                int i13 = C1902a.f53570a;
                this.f53571q = 1;
                throw null;
            }
        }

        @InterfaceC42164u
        @k
        @a0
        public D0<androidx.privacysandbox.ads.adservices.topics.b> a(@k androidx.privacysandbox.ads.adservices.topics.a request) {
            c cVar = C43262l0.f411945a;
            return androidx.privacysandbox.ads.adservices.java.internal.c.a(C43259k.b(U.a(K.f411877a), null, new C1903a(request, null), 3));
        }
    }

    /* compiled from: TopicsManagerFutures.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/topics/a$b;", "", "<init>", "()V", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
    }
}
