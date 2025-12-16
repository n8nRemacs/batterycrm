package kb1;

import h21.C40764a;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.incoming.MessagesIPCInteractorImpl$onMessagesReceived$1", f = "MessagesIPCInteractorImpl.kt", i = {}, l = {51, 52}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class o extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f406479q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f406480r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C40764a f406481s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.vk.push.core.base.a f406482t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ArrayList f406483u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, C40764a c40764a, com.vk.push.core.base.a aVar, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f406480r = mVar;
        this.f406481s = c40764a;
        this.f406482t = aVar;
        this.f406483u = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        com.vk.push.core.base.a aVar = this.f406482t;
        ArrayList arrayList = this.f406483u;
        return new o(this.f406480r, this.f406481s, aVar, arrayList, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((o) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:(1:(8:6|18|19|(1:21)(1:22)|29|23|27|28)(2:7|8))(1:9))(2:10|(1:12))|13|(3:15|(1:17)|18)|19|(0)(0)|29|23|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        ((T11.f) r4.f406470i.getValue()).error("Messages received result by ipc has failed", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f406479q
            r2 = 1
            r3 = 2
            kb1.m r4 = r5.f406480r
            if (r1 == 0) goto L24
            if (r1 == r2) goto L1c
            if (r1 != r3) goto L14
            kotlin.C42729a0.b(r6)
            goto L47
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            kotlin.C42729a0.b(r6)
            kotlin.Z r6 = (kotlin.Z) r6
            java.lang.Object r6 = r6.f406625b
            goto L34
        L24:
            kotlin.C42729a0.b(r6)
            kb1.u r6 = r4.f406463b
            r5.f406479q = r2
            h21.a r1 = r5.f406481s
            java.lang.Object r6 = r6.a(r1, r5)
            if (r6 != r0) goto L34
            return r0
        L34:
            int r1 = kotlin.Z.f406624c
            boolean r1 = r6 instanceof kotlin.Z.b
            if (r1 != 0) goto L4b
            kotlin.G0 r6 = (kotlin.G0) r6
            r5.f406479q = r3
            java.util.ArrayList r6 = r5.f406483u
            java.lang.Object r6 = kb1.m.g(r4, r6, r5)
            if (r6 != r0) goto L47
            return r0
        L47:
            com.vk.push.core.push.SendPushesResult r6 = (com.vk.push.core.push.SendPushesResult) r6
            int r0 = kotlin.Z.f406624c
        L4b:
            com.vk.push.core.base.AidlResult r6 = com.vk.push.core.utils.o.a(r6)
            T extends android.os.Parcelable r0 = r6.f367015b
            boolean r0 = r0 instanceof com.vk.push.core.base.AidlException
            if (r0 != 0) goto L63
            kotlin.C r0 = r4.f406470i
            java.lang.Object r0 = r0.getValue()
            T11.f r0 = (T11.f) r0
            java.lang.String r1 = "Messages receiving is successful"
            r0.info(r1)
            goto L74
        L63:
            kotlin.C r0 = r4.f406470i
            java.lang.Object r0 = r0.getValue()
            T11.f r0 = (T11.f) r0
            java.lang.RuntimeException r1 = r6.c()
            java.lang.String r2 = "Messages receiving has failed"
            r0.error(r2, r1)
        L74:
            com.vk.push.core.base.a r0 = r5.f406482t     // Catch: android.os.RemoteException -> L7a
            r0.e2(r6)     // Catch: android.os.RemoteException -> L7a
            goto L88
        L7a:
            r6 = move-exception
            kotlin.C r0 = r4.f406470i
            java.lang.Object r0 = r0.getValue()
            T11.f r0 = (T11.f) r0
            java.lang.String r1 = "Messages received result by ipc has failed"
            r0.error(r1, r6)
        L88:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kb1.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
