package com.avito.android.user_favorites;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserFavoritesInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_favorites.UserFavoritesInteractorImpl$viewedBadgeChanges$1", f = "UserFavoritesInteractor.kt", i = {0}, l = {136, 137, 139}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class u extends SuspendLambda implements Y41.p<InterfaceC43172j<? super String>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f316940q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f316941r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f316942s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q qVar, Continuation<? super u> continuation) {
        super(2, continuation);
        this.f316942s = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        u uVar = new u(this.f316942s, continuation);
        uVar.f316941r = obj;
        return uVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super String> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((u) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f316940q
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            com.avito.android.user_favorites.q r6 = r8.f316942s
            if (r1 == 0) goto L29
            if (r1 == r5) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            kotlin.C42729a0.b(r9)
            goto L79
        L21:
            java.lang.Object r1 = r8.f316941r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r9)
            goto L53
        L29:
            kotlin.C42729a0.b(r9)
            java.lang.Object r9 = r8.f316941r
            r1 = r9
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            u3.g<com.avito.android.user_viewed.feature.UserViewedTestGroup> r9 = r6.f316934j
            u3.m<T> r9 = r9.f439742a
            T r9 = r9.f439749b
            com.avito.android.user_viewed.feature.UserViewedTestGroup r9 = (com.avito.android.user_viewed.feature.UserViewedTestGroup) r9
            r9.getClass()
            com.avito.android.user_viewed.feature.UserViewedTestGroup r7 = com.avito.android.user_viewed.feature.UserViewedTestGroup.f318388d
            if (r9 == r7) goto L44
            com.avito.android.user_viewed.feature.UserViewedTestGroup r7 = com.avito.android.user_viewed.feature.UserViewedTestGroup.f318389e
            if (r9 != r7) goto L6c
        L44:
            zE0.e r9 = zE0.C50450e.f443982a
            r8.f316941r = r1
            r8.f316940q = r5
            com.avito.android.timestamp_storage.domain.d r5 = r6.f316935k
            java.lang.Object r9 = r5.b(r9, r8)
            if (r9 != r0) goto L53
            return r0
        L53:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L6c
            com.avito.android.user_favorites.E r9 = r6.f316926b
            java.lang.String r9 = r9.c()
            r8.f316941r = r2
            r8.f316940q = r4
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L79
            return r0
        L6c:
            r8.f316941r = r2
            r8.f316940q = r3
            java.lang.String r9 = ""
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L79
            return r0
        L79:
            kotlin.G0 r9 = kotlin.G0.f406611a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_favorites.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
