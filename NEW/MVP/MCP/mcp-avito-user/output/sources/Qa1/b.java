package Qa1;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "ru.rustore.sdk.pushclient.internal.SubscribeComponent", f = "SubscribeComponent.kt", i = {0, 0, 1, 1, 2, 2}, l = {112, 118, 120}, m = "deleteToken", n = {"this", "task", "this", "task", "this", "task"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes9.dex */
public final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f13774q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f13775r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f13776s;

    /* renamed from: t, reason: collision with root package name */
    public int f13777t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f13776s = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008c, code lost:
    
        if (r1.e(r0) == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            r8.f13775r = r9
            int r9 = r8.f13777t
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r9 | r0
            r8.f13777t = r9
            Qa1.a r9 = r8.f13776s
            r9.getClass()
            int r1 = r8.f13777t
            r2 = r1 & r0
            if (r2 == 0) goto L19
            int r1 = r1 - r0
            r8.f13777t = r1
            r0 = r8
            goto L1e
        L19:
            Qa1.b r0 = new Qa1.b
            r0.<init>(r9, r8)
        L1e:
            java.lang.Object r1 = r0.f13775r
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.f13777t
            r4 = 0
            r5 = 3
            r6 = 1
            r7 = 2
            if (r3 == 0) goto L50
            if (r3 == r6) goto L4a
            if (r3 == r7) goto L40
            if (r3 != r5) goto L38
            Qa1.a r9 = r0.f13774q
            kotlin.C42729a0.b(r1)
            goto L8f
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L40:
            Qa1.a r9 = r0.f13774q
            kotlin.C42729a0.b(r1)
            kotlin.Z r1 = (kotlin.Z) r1
            java.lang.Object r1 = r1.f406625b
            goto L7c
        L4a:
            Qa1.a r9 = r0.f13774q
            kotlin.C42729a0.b(r1)
            goto L65
        L50:
            kotlin.C42729a0.b(r1)
            T11.f r1 = r9.f13772i
            java.lang.String r3 = "Deletion current push token"
            r1.a(r3, r4)
            r0.f13774q = r9
            r0.f13777t = r6
            java.lang.Object r1 = r9.b(r0)
            if (r1 != r2) goto L65
            goto L8e
        L65:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto Laa
            boolean r3 = kotlin.text.C43066x.K(r1)
            if (r3 != 0) goto Laa
            mb1.a r3 = r9.f13765b
            r0.f13774q = r9
            r0.f13777t = r7
            java.lang.Object r1 = r3.c(r1, r0)
            if (r1 != r2) goto L7c
            goto L8e
        L7c:
            int r3 = kotlin.Z.f406624c
            boolean r3 = r1 instanceof kotlin.Z.b
            if (r3 != 0) goto L99
            qb1.g r1 = r9.f13766c
            r0.f13774q = r9
            r0.f13777t = r5
            java.lang.Object r0 = r1.e(r0)
            if (r0 != r2) goto L8f
        L8e:
            return r2
        L8f:
            T11.f r9 = r9.f13772i
            java.lang.String r0 = "Push token successfully deleted"
            r9.info(r0)
            kotlin.G0 r9 = kotlin.G0.f406611a
            throw r4
        L99:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.Throwable r1 = kotlin.Z.b(r1)
            java.lang.String r2 = "Push token deletion failed"
            r0.<init>(r2, r1)
            T11.f r9 = r9.f13772i
            r9.a(r2, r4)
            throw r4
        Laa:
            T11.f r9 = r9.f13772i
            java.lang.String r0 = "No saved push token to delete"
            r9.a(r0, r4)
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Qa1.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
