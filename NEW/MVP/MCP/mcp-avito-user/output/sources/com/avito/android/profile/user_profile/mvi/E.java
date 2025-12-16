package com.avito.android.profile.user_profile.mvi;

import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserProfileActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$handleCardAction$9", f = "UserProfileActor.kt", i = {0, 1, 2, 3}, l = {591, 596, 598, 600, 603}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes16.dex */
final class E extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f226209q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f226210r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C33388a f226211s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(C33388a c33388a, Continuation<? super E> continuation) {
        super(2, continuation);
        this.f226211s = c33388a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        E e12 = new E(this.f226211s, continuation);
        e12.f226210r = obj;
        return e12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((E) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0091 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:13:0x002a, B:19:0x003b, B:29:0x0074, B:31:0x0091, B:34:0x009e, B:26:0x0061), top: B:42:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #0 {all -> 0x002f, blocks: (B:13:0x002a, B:19:0x003b, B:29:0x0074, B:31:0x0091, B:34:0x009e, B:26:0x0061), top: B:42:0x000d }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.flow.j] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.f226209q
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            com.avito.android.profile.user_profile.mvi.a r6 = r9.f226211s
            r7 = 1
            if (r1 == 0) goto L47
            if (r1 == r7) goto L3f
            if (r1 == r5) goto L37
            if (r1 == r4) goto L32
            if (r1 == r3) goto L26
            if (r1 != r2) goto L1e
            kotlin.C42729a0.b(r10)
            goto Lbc
        L1e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L26:
            java.lang.Object r1 = r9.f226210r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
        L2a:
            kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L2f
            goto Lbc
        L2f:
            r10 = move-exception
            goto Lab
        L32:
            java.lang.Object r1 = r9.f226210r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            goto L2a
        L37:
            java.lang.Object r1 = r9.f226210r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)     // Catch: java.lang.Throwable -> L2f
            goto L74
        L3f:
            java.lang.Object r1 = r9.f226210r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto L61
        L47:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f226210r
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            com.avito.android.social.q r1 = r6.f226293m
            r1.a()
            com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction$ShowLogoutProgress r1 = com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction.ShowLogoutProgress.f226441b
            r9.f226210r = r10
            r9.f226209q = r7
            java.lang.Object r1 = r10.emit(r1, r9)
            if (r1 != r0) goto L60
            return r0
        L60:
            r1 = r10
        L61:
            com.avito.android.account.a r10 = r6.f226290j     // Catch: java.lang.Throwable -> L2f
            java.lang.String r8 = "user_action"
            io.reactivex.rxjava3.internal.operators.completable.K r10 = r10.a(r8, r7)     // Catch: java.lang.Throwable -> L2f
            r9.f226210r = r1     // Catch: java.lang.Throwable -> L2f
            r9.f226209q = r5     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r10 = kotlinx.coroutines.rx3.C43292o.a(r10, r9)     // Catch: java.lang.Throwable -> L2f
            if (r10 != r0) goto L74
            return r0
        L74:
            gD.f r10 = r6.f226298r     // Catch: java.lang.Throwable -> L2f
            r10.getClass()     // Catch: java.lang.Throwable -> L2f
            kotlin.reflect.n<java.lang.Object>[] r5 = gD.f.f396389r     // Catch: java.lang.Throwable -> L2f
            r6 = 15
            r5 = r5[r6]     // Catch: java.lang.Throwable -> L2f
            com.avito.android.A0$a r10 = r10.f396404p     // Catch: java.lang.Throwable -> L2f
            DE0.a r10 = r10.a()     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r10 = r10.invoke()     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L2f
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L2f
            if (r10 == 0) goto L9e
            com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction$OpenMainScreen r10 = com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction.OpenMainScreen.f226434b     // Catch: java.lang.Throwable -> L2f
            r9.f226210r = r1     // Catch: java.lang.Throwable -> L2f
            r9.f226209q = r4     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r10 = r1.emit(r10, r9)     // Catch: java.lang.Throwable -> L2f
            if (r10 != r0) goto Lbc
            return r0
        L9e:
            com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction$CloseScreen r10 = com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction.CloseScreen.f226416b     // Catch: java.lang.Throwable -> L2f
            r9.f226210r = r1     // Catch: java.lang.Throwable -> L2f
            r9.f226209q = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r10 = r1.emit(r10, r9)     // Catch: java.lang.Throwable -> L2f
            if (r10 != r0) goto Lbc
            return r0
        Lab:
            com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction$LogoutError r3 = new com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction$LogoutError
            r3.<init>(r10)
            r10 = 0
            r9.f226210r = r10
            r9.f226209q = r2
            java.lang.Object r10 = r1.emit(r3, r9)
            if (r10 != r0) goto Lbc
            return r0
        Lbc:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.mvi.E.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
