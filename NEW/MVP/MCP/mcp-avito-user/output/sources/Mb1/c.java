package mb1;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import nb1.C44374a;

/* loaded from: classes9.dex */
public final class c implements InterfaceC44046a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f414610a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final T11.f f414611b;

    @DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.push.PushTokenRepositoryImpl", f = "PushTokenRepositoryImpl.kt", i = {}, l = {14}, m = "getNewPushToken-0E7RQCE", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f414612q;

        /* renamed from: s, reason: collision with root package name */
        public int f414614s;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f414612q = obj;
            this.f414614s |= BeduinInputModel.MIN_TEXT_VERSION;
            Object objD = c.this.d(null, null, this);
            return objD == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objD : Z.a(objD);
        }
    }

    @DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.push.PushTokenRepositoryImpl$getNewPushToken$2", f = "PushTokenRepositoryImpl.kt", i = {}, l = {14}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.l<Continuation<? super Z<? extends C44374a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f414615q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f414617s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ W11.a f414618t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, W11.a aVar, Continuation<? super b> continuation) {
            super(1, continuation);
            this.f414617s = str;
            this.f414618t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<G0> create(Continuation<?> continuation) {
            return c.this.new b(this.f414617s, this.f414618t, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super Z<? extends C44374a>> continuation) {
            return ((b) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f414615q;
            if (i12 == 0) {
                C42729a0.b(obj);
                j jVar = c.this.f414610a;
                this.f414615q = 1;
                objA = jVar.a(this.f414617s, this);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                objA = ((Z) obj).f406625b;
            }
            return Z.a(objA);
        }
    }

    public c(@k j jVar, @k T11.f fVar) {
        this.f414610a = jVar;
        this.f414611b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // mb1.InterfaceC44046a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k java.lang.String r5, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mb1.C44047b
            if (r0 == 0) goto L13
            r0 = r6
            mb1.b r0 = (mb1.C44047b) r0
            int r1 = r0.f414609s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f414609s = r1
            goto L18
        L13:
            mb1.b r0 = new mb1.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f414607q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f414609s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kotlin.C42729a0.b(r6)
            kotlin.Z r6 = (kotlin.Z) r6
            java.lang.Object r5 = r6.f406625b
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.C42729a0.b(r6)
            r0.f414609s = r3
            mb1.j r6 = r4.f414610a
            java.lang.Object r5 = r6.b(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mb1.c.c(java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // mb1.InterfaceC44046a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@Y61.k java.lang.String r6, @Y61.l W11.a r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.Z<nb1.C44374a>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof mb1.c.a
            if (r0 == 0) goto L13
            r0 = r8
            mb1.c$a r0 = (mb1.c.a) r0
            int r1 = r0.f414614s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f414614s = r1
            goto L1a
        L13:
            mb1.c$a r0 = new mb1.c$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r8 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r8
            r0.<init>(r8)
        L1a:
            java.lang.Object r8 = r0.f414612q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f414614s
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            kotlin.C42729a0.b(r8)
            kotlin.Z r8 = (kotlin.Z) r8
            java.lang.Object r6 = r8.f406625b
            goto L50
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.C42729a0.b(r8)
            mb1.d r8 = new mb1.d
            T11.f r2 = r5.f414611b
            r8.<init>(r2)
            mb1.c$b r2 = new mb1.c$b
            r4 = 0
            r2.<init>(r6, r7, r4)
            r0.f414614s = r3
            java.lang.Object r6 = r8.b(r2, r0)
            if (r6 != r1) goto L50
            return r1
        L50:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mb1.c.d(java.lang.String, W11.a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
