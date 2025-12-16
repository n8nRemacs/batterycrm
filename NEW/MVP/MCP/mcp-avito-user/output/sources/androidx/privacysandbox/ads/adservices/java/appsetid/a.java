package androidx.privacysandbox.ads.adservices.java.appsetid;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.privacysandbox.ads.adservices.java.internal.c;
import com.google.common.util.concurrent.D0;
import j.InterfaceC42164u;
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

/* compiled from: AppSetIdManagerFutures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/appsetid/a;", "", "<init>", "()V", "a", "b", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: AppSetIdManagerFutures.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/appsetid/a$a;", "Landroidx/privacysandbox/ads/adservices/java/appsetid/a;", "Lcom/google/common/util/concurrent/D0;", "Landroidx/privacysandbox/ads/adservices/appsetid/a;", "a", "()Lcom/google/common/util/concurrent/D0;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.java.appsetid.a$a, reason: collision with other inner class name */
    public static final class C1896a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f53537a = 0;

        /* compiled from: AppSetIdManagerFutures.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroidx/privacysandbox/ads/adservices/appsetid/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroidx/privacysandbox/ads/adservices/appsetid/a;"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.appsetid.AppSetIdManagerFutures$Api33Ext4JavaImpl$getAppSetIdAsync$1", f = "AppSetIdManagerFutures.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.appsetid.a$a$a, reason: collision with other inner class name */
        public static final class C1897a extends SuspendLambda implements p<T, Continuation<? super androidx.privacysandbox.ads.adservices.appsetid.a>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f53538q;

            public C1897a(Continuation<? super C1897a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return C1896a.this.new C1897a(continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super androidx.privacysandbox.ads.adservices.appsetid.a> continuation) {
                C1897a c1897a = (C1897a) create(t12, continuation);
                G0 g02 = G0.f406611a;
                c1897a.invokeSuspend(g02);
                return g02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f53538q;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return obj;
                }
                C42729a0.b(obj);
                int i13 = C1896a.f53537a;
                this.f53538q = 1;
                throw null;
            }
        }

        @InterfaceC42164u
        @k
        public D0<androidx.privacysandbox.ads.adservices.appsetid.a> a() {
            return c.a(C43259k.b(U.a(C43262l0.f411945a), null, new C1897a(null), 3));
        }
    }

    /* compiled from: AppSetIdManagerFutures.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/appsetid/a$b;", "", "<init>", "()V", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
