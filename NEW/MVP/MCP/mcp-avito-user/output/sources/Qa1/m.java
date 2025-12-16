package Qa1;

import androidx.core.app.E;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import okhttp3.internal.ws.WebSocketProtocol;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk$onInitialize$1", f = "VkpnsClientSdk.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT, 127, 128}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class m extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f13843q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f13844r;

    @DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk$onInitialize$1$1", f = "VkpnsClientSdk.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f13845q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ j f13846r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f13846r = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Continuation<?> continuation) {
            return new a(this.f13846r, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return new a(this.f13846r, continuation).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f13845q;
            if (i12 == 0) {
                C42729a0.b(obj);
                j jVar = this.f13846r;
                ((V11.b) jVar.f13814c.getValue()).a(new Sa1.a(Boolean.valueOf(new E(jVar.f13812a).f44481b.areNotificationsEnabled())));
                Qa1.a aVar = (Qa1.a) jVar.f13821j.getValue();
                this.f13845q = 1;
                if (aVar.e(this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(j jVar, Continuation<? super m> continuation) {
        super(2, continuation);
        this.f13844r = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new m(this.f13844r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return new m(this.f13844r, continuation).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f13843q
            Qa1.j r2 = r6.f13844r
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L27
            if (r1 == r5) goto L23
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            kotlin.C42729a0.b(r7)
            goto L82
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1f:
            kotlin.C42729a0.b(r7)
            goto L69
        L23:
            kotlin.C42729a0.b(r7)
            goto L4f
        L27:
            kotlin.C42729a0.b(r7)
            kotlin.C r7 = r2.f13814c
            java.lang.Object r7 = r7.getValue()
            V11.b r7 = (V11.b) r7
            Sa1.c r1 = new Sa1.c
            r1.<init>()
            r7.a(r1)
            kotlin.C r7 = r2.f13818g
            java.lang.Object r7 = r7.getValue()
            hb1.b r7 = (hb1.C40910b) r7
            Qa1.p r1 = cb1.C27166e.f57981b
            if (r1 == 0) goto L90
            r6.f13843q = r5
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L4f
            return r0
        L4f:
            r6.f13843q = r4
            kotlin.C r7 = r2.f13816e
            java.lang.Object r7 = r7.getValue()
            kb1.f r7 = (kb1.f) r7
            java.lang.Object r7 = r7.d(r6)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r1) goto L64
            goto L66
        L64:
            kotlin.G0 r7 = kotlin.G0.f406611a
        L66:
            if (r7 != r0) goto L69
            return r0
        L69:
            kotlin.C r7 = r2.f13822k
            java.lang.Object r7 = r7.getValue()
            Qa1.i r7 = (Qa1.i) r7
            Qa1.m$a r1 = new Qa1.m$a
            r4 = 0
            r1.<init>(r2, r4)
            r6.f13843q = r3
            android.app.Application r3 = r2.f13812a
            java.lang.Object r7 = r7.a(r3, r1, r6)
            if (r7 != r0) goto L82
            return r0
        L82:
            kotlin.C r7 = r2.f13815d
            java.lang.Object r7 = r7.getValue()
            U11.b r7 = (U11.b) r7
            r7.a(r2)
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        L90:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "CommonModule.init() must be called before accessing its members"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Qa1.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
