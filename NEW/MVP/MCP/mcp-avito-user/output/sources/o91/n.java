package O91;

import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class n extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f12057q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f12058r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f12059s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, Continuation continuation) {
        super(2, continuation);
        this.f12059s = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        n nVar = new n(this.f12059s, continuation);
        nVar.f12058r = obj;
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:5:0x000d, B:40:0x00a9, B:21:0x005e, B:24:0x0077, B:37:0x00a4, B:27:0x0084, B:30:0x008b, B:34:0x009d, B:33:0x009b), top: B:52:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f12057q
            O91.o r2 = r7.f12059s
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            kotlin.C42729a0.b(r8)     // Catch: java.lang.Throwable -> L12
            goto La9
        L12:
            r8 = move-exception
            goto Lae
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f12058r
            kotlinx.coroutines.T r8 = (kotlinx.coroutines.T) r8
            kotlinx.coroutines.flow.Z1 r8 = r2.f12065N
            java.lang.Object r8 = r8.getValue()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L30:
            boolean r1 = r8.hasNext()
            java.lang.String r4 = "Collection contains no element matching the predicate."
            if (r1 == 0) goto Lca
            java.lang.Object r1 = r8.next()
            M91.b r1 = (M91.b) r1
            boolean r5 = r1.f10434c
            if (r5 == 0) goto L30
            kotlinx.coroutines.flow.Z1 r8 = r2.f12062K
            java.lang.Object r8 = r8.getValue()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L4e:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto Lc4
            java.lang.Object r5 = r8.next()
            M91.c r5 = (M91.c) r5
            boolean r6 = r5.f10437c
            if (r6 == 0) goto L4e
            int r8 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L12
            M91.a r8 = r2.f12060E     // Catch: java.lang.Throwable -> L12
            r7.f12057q = r3     // Catch: java.lang.Throwable -> L12
            r8.getClass()     // Catch: java.lang.Throwable -> L12
            ru.mts.biometry.sdk.domain.entity.selector.f r3 = M91.a.c()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r3 = r3.f436417d     // Catch: java.lang.Throwable -> L12
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.f10432a
            java.lang.String r4 = r5.f10435a
            if (r3 == 0) goto L84
            ru.mts.biometry.api.dataSource.j r8 = r8.f10430a     // Catch: java.lang.Throwable -> L12
            java.lang.Object r8 = r8.f(r1, r4, r7)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L12
            if (r8 != r1) goto La4
            goto La6
        L84:
            ru.mts.biometry.api.dataSource.o r8 = r8.f10431b     // Catch: java.lang.Throwable -> L12
            y91.b r8 = r8.f436354c     // Catch: java.lang.Throwable -> L12
            if (r8 != 0) goto L8b
            r8 = 0
        L8b:
            ru.mts.biometry.api.entity.SelectDocumentBody r3 = new ru.mts.biometry.api.entity.SelectDocumentBody     // Catch: java.lang.Throwable -> L12
            r3.<init>(r1, r4)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r8 = r8.a(r3, r7)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L12
            if (r8 != r1) goto L9b
            goto L9d
        L9b:
            kotlin.G0 r8 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L12
        L9d:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L12
            if (r8 != r1) goto La4
            goto La6
        La4:
            kotlin.G0 r8 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L12
        La6:
            if (r8 != r0) goto La9
            return r0
        La9:
            kotlin.G0 r8 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L12
            int r0 = kotlin.Z.f406624c     // Catch: java.lang.Throwable -> L12
            goto Lb6
        Lae:
            int r0 = kotlin.Z.f406624c
            kotlin.Z$b r0 = new kotlin.Z$b
            r0.<init>(r8)
            r8 = r0
        Lb6:
            java.lang.Throwable r8 = kotlin.Z.b(r8)
            if (r8 == 0) goto Lc1
            W91.h r8 = r2.f12061J
            ba1.AbstractC25617i.a(r8)
        Lc1:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        Lc4:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>(r4)
            throw r8
        Lca:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: O91.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
