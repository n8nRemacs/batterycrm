package androidx.privacysandbox.ads.adservices.java.adselection;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.privacysandbox.ads.adservices.adselection.c;
import androidx.privacysandbox.ads.adservices.adselection.d;
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

/* compiled from: AdSelectionManagerFutures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adselection/a;", "", "<init>", "()V", "a", "b", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: AdSelectionManagerFutures.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adselection/a$a;", "Landroidx/privacysandbox/ads/adservices/java/adselection/a;", "Landroidx/privacysandbox/ads/adservices/adselection/a;", "adSelectionConfig", "Lcom/google/common/util/concurrent/D0;", "Landroidx/privacysandbox/ads/adservices/adselection/c;", "b", "(Landroidx/privacysandbox/ads/adservices/adselection/a;)Lcom/google/common/util/concurrent/D0;", "Landroidx/privacysandbox/ads/adservices/adselection/d;", "reportImpressionRequest", "Lkotlin/G0;", "a", "(Landroidx/privacysandbox/ads/adservices/adselection/d;)Lcom/google/common/util/concurrent/D0;", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.privacysandbox.ads.adservices.java.adselection.a$a, reason: collision with other inner class name */
    public static final class C1894a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f53530a = 0;

        /* compiled from: AdSelectionManagerFutures.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1", f = "AdSelectionManagerFutures.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.adselection.a$a$a, reason: collision with other inner class name */
        public static final class C1895a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f53531q;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ d f53533s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1895a(d dVar, Continuation<? super C1895a> continuation) {
                super(2, continuation);
                this.f53533s = dVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return C1894a.this.new C1895a(this.f53533s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C1895a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f53531q;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                C42729a0.b(obj);
                int i13 = C1894a.f53530a;
                this.f53531q = 1;
                throw null;
            }
        }

        /* compiled from: AdSelectionManagerFutures.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Landroidx/privacysandbox/ads/adservices/adselection/c;", "<anonymous>", "(Lkotlinx/coroutines/T;)Landroidx/privacysandbox/ads/adservices/adselection/c;"}, k = 3, mv = {1, 8, 0})
        @DebugMetadata(c = "androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1", f = "AdSelectionManagerFutures.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.privacysandbox.ads.adservices.java.adselection.a$a$b */
        public static final class b extends SuspendLambda implements p<T, Continuation<? super c>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f53534q;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ androidx.privacysandbox.ads.adservices.adselection.a f53536s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(androidx.privacysandbox.ads.adservices.adselection.a aVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f53536s = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return C1894a.this.new b(this.f53536s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super c> continuation) {
                b bVar = (b) create(t12, continuation);
                G0 g02 = G0.f406611a;
                bVar.invokeSuspend(g02);
                return g02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f53534q;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return obj;
                }
                C42729a0.b(obj);
                int i13 = C1894a.f53530a;
                this.f53534q = 1;
                throw null;
            }
        }

        @InterfaceC42164u
        @k
        @a0
        public D0<G0> a(@k d reportImpressionRequest) {
            return androidx.privacysandbox.ads.adservices.java.internal.c.a(C43259k.b(U.a(C43262l0.f411945a), null, new C1895a(reportImpressionRequest, null), 3));
        }

        @InterfaceC42164u
        @k
        @a0
        public D0<c> b(@k androidx.privacysandbox.ads.adservices.adselection.a adSelectionConfig) {
            return androidx.privacysandbox.ads.adservices.java.internal.c.a(C43259k.b(U.a(C43262l0.f411945a), null, new b(adSelectionConfig, null), 3));
        }
    }

    /* compiled from: AdSelectionManagerFutures.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/privacysandbox/ads/adservices/java/adselection/a$b;", "", "<init>", "()V", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
