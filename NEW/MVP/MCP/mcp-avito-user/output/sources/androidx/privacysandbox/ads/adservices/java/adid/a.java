package androidx.privacysandbox.ads.adservices.java.adid;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.privacysandbox.ads.adservices.java.internal.c;
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

/* compiled from: AdIdManagerFutures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adid/a;", "", "<init>", "()V", "a", "b", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: AdIdManagerFutures.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adid/a$a;", "Landroidx/privacysandbox/ads/adservices/java/adid/a;", "Lcom/google/common/util/concurrent/D0;", "Landroidx/privacysandbox/ads/adservices/adid/a;", "a", "()Lcom/google/common/util/concurrent/D0;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.java.adid.a$a, reason: collision with other inner class name */
    public static final class C1892a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f53527a = 0;

        /* compiled from: AdIdManagerFutures.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroidx/privacysandbox/ads/adservices/adid/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroidx/privacysandbox/ads/adservices/adid/a;"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.adid.AdIdManagerFutures$Api33Ext4JavaImpl$getAdIdAsync$1", f = "AdIdManagerFutures.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.adid.a$a$a, reason: collision with other inner class name */
        public static final class C1893a extends SuspendLambda implements p<T, Continuation<? super androidx.privacysandbox.ads.adservices.adid.a>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f53528q;

            public C1893a(Continuation<? super C1893a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return C1892a.this.new C1893a(continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super androidx.privacysandbox.ads.adservices.adid.a> continuation) {
                C1893a c1893a = (C1893a) create(t12, continuation);
                G0 g02 = G0.f406611a;
                c1893a.invokeSuspend(g02);
                return g02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f53528q;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return obj;
                }
                C42729a0.b(obj);
                int i13 = C1892a.f53527a;
                this.f53528q = 1;
                throw null;
            }
        }

        @InterfaceC42164u
        @k
        @a0
        public D0<androidx.privacysandbox.ads.adservices.adid.a> a() {
            return c.a(C43259k.b(U.a(C43262l0.f411945a), null, new C1893a(null), 3));
        }
    }

    /* compiled from: AdIdManagerFutures.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adid/a$b;", "", "<init>", "()V", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
