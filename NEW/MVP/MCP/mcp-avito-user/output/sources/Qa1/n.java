package Qa1;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import ru.rustore.sdk.core.tasks.f;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk$onUpdate$1", f = "VkpnsClientSdk.kt", i = {}, l = {142, 144, 146}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class n extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f13847q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f13848r;

    @DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.VkpnsClientSdk$onUpdate$1$1", f = "VkpnsClientSdk.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f13849q;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Continuation<?> continuation) {
            return new a(1, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super G0> continuation) {
            return new a(1, continuation).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f13849q;
            if (i12 == 0) {
                C42729a0.b(obj);
                ru.rustore.sdk.core.tasks.f.f436778d.getClass();
                f.b bVar = (f.b) f.a.a().f406620c;
                this.f13849q = 1;
                j jVar = j.f13811r;
                if (jVar == null) {
                    throw new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?");
                }
                Object objF = ((Qa1.a) jVar.f13821j.getValue()).f(bVar, this);
                if (objF != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objF = G0.f406611a;
                }
                if (objF == coroutine_suspended) {
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
    public n(j jVar, Continuation<? super n> continuation) {
        super(2, continuation);
        this.f13848r = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new n(this.f13848r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return new n(this.f13848r, continuation).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f13847q
            r2 = 0
            r3 = 3
            r4 = 2
            Qa1.j r5 = r7.f13848r
            r6 = 1
            if (r1 == 0) goto L28
            if (r1 == r6) goto L24
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            kotlin.C42729a0.b(r8)
            goto L6e
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            kotlin.C42729a0.b(r8)
            goto L56
        L24:
            kotlin.C42729a0.b(r8)
            goto L3c
        L28:
            kotlin.C42729a0.b(r8)
            kotlin.C r8 = r5.f13819h
            java.lang.Object r8 = r8.getValue()
            ab1.e r8 = (ab1.e) r8
            r7.f13847q = r6
            java.lang.Object r8 = r8.b(r7)
            if (r8 != r0) goto L3c
            return r0
        L3c:
            kotlin.C r8 = r5.f13820i
            java.lang.Object r8 = r8.getValue()
            jb1.e r8 = (jb1.e) r8
            r7.f13847q = r4
            ab1.j r8 = r8.f405683a
            bb1.p r8 = r8.f21043a
            bb1.s r1 = new bb1.s
            r1.<init>(r8, r6, r2)
            java.lang.Object r8 = kotlinx.coroutines.U.c(r1, r7)
            if (r8 != r0) goto L56
            return r0
        L56:
            kotlin.C r8 = r5.f13822k
            java.lang.Object r8 = r8.getValue()
            Qa1.i r8 = (Qa1.i) r8
            Qa1.n$a r1 = new Qa1.n$a
            r1.<init>(r6, r2)
            r7.f13847q = r3
            android.app.Application r2 = r5.f13812a
            java.lang.Object r8 = r8.a(r2, r1, r7)
            if (r8 != r0) goto L6e
            return r0
        L6e:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Qa1.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
