package Va1;

import Na1.c;
import V11.b;
import V11.d;
import Y41.l;
import Y41.p;
import Y61.k;
import ab1.g;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.r;
import ru.rustore.sdk.reactive.core.j;
import ru.rustore.sdk.reactive.single.D;
import ru.rustore.sdk.reactive.single.E;

/* loaded from: classes9.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Na1.b f17205a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f17206b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C43238h f17207c;

    @DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.analytics.sender.ClientAnalyticsSender$send$1", f = "ClientAnalyticsSender.kt", i = {1}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES, 39}, m = "invokeSuspend", n = {"params"}, s = {"L$0"})
    /* renamed from: Va1.a$a, reason: collision with other inner class name */
    public static final class C1187a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f17208q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ d f17210s;

        /* renamed from: Va1.a$a$a, reason: collision with other inner class name */
        public static final class C1188a extends N implements l<Throwable, G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final C1188a f17211l = new C1188a();

            public C1188a() {
                super(1);
            }

            @Override // Y41.l
            public final G0 invoke(Throwable th2) {
                return G0.f406611a;
            }
        }

        /* renamed from: Va1.a$a$b */
        public static final class b extends N implements l<G0, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ r f17212l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(r rVar) {
                super(1);
                this.f17212l = rVar;
            }

            @Override // Y41.l
            public final G0 invoke(G0 g02) {
                r rVar = this.f17212l;
                G0 g03 = G0.f406611a;
                ru.rustore.sdk.core.util.a.a(rVar, g03);
                return g03;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1187a(d dVar, Continuation<? super C1187a> continuation) {
            super(2, continuation);
            this.f17210s = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
            return a.this.new C1187a(this.f17210s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return a.this.new C1187a(this.f17210s, continuation).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f17208q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                g gVar = aVar.f17206b;
                this.f17208q = 1;
                obj = gVar.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                C42729a0.b(obj);
            }
            d dVar = this.f17210s;
            LinkedHashMap linkedHashMapK = P0.k((Map) obj, dVar.a());
            this.f17208q = 2;
            r rVar = new r(1, IntrinsicsKt.intercepted(this));
            rVar.p();
            E.a(D.a(aVar.f17205a.a(new c(dVar.f16896a, linkedHashMapK)), C1188a.f17211l), j.f436875a, new b(rVar));
            Object objO = rVar.o();
            if (objO == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (objO == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    public a(Na1.b bVar, g gVar) {
        C43238h c43238hA = U.a(C43262l0.f411947c);
        this.f17205a = bVar;
        this.f17206b = gVar;
        this.f17207c = c43238hA;
    }

    @Override // V11.b
    public final void a(@k d dVar) {
        C43259k.d(this.f17207c, null, null, new C1187a(dVar, null), 3);
    }
}
