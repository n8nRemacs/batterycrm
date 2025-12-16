package com.avito.android.profile.user_profile.mvi;

import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import com.avito.android.remote.model.user_profile.UserProfileResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserProfileActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$updatePhones$1", f = "UserProfileActor.kt", i = {0}, l = {533, 534, 534}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class W extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f226269q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f226270r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C33388a f226271s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ UserProfileResult f226272t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(C33388a c33388a, UserProfileResult userProfileResult, Continuation<? super W> continuation) {
        super(2, continuation);
        this.f226271s = c33388a;
        this.f226272t = userProfileResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        W w12 = new W(this.f226271s, this.f226272t, continuation);
        w12.f226270r = obj;
        return w12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((W) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad A[RETURN] */
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
            int r1 = r9.f226269q
            com.avito.android.profile.user_profile.mvi.a r2 = r9.f226271s
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L33
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            kotlin.C42729a0.b(r10)
            goto Lc3
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            java.lang.Object r1 = r9.f226270r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto Lae
        L2a:
            java.lang.Object r1 = r9.f226270r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r10)
            goto La1
        L33:
            kotlin.C42729a0.b(r10)
            java.lang.Object r10 = r9.f226270r
            kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
            r2.getClass()
            com.avito.android.remote.model.user_profile.UserProfileResult r1 = r9.f226272t
            java.util.List r1 = r1.getItems()
            if (r1 == 0) goto L61
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L4b:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L5d
            java.lang.Object r7 = r1.next()
            r8 = r7
            com.avito.android.remote.model.user_profile.items.UserProfileItem r8 = (com.avito.android.remote.model.user_profile.items.UserProfileItem) r8
            boolean r8 = r8 instanceof com.avito.android.remote.model.user_profile.items.PhonesItem
            if (r8 == 0) goto L4b
            goto L5e
        L5d:
            r7 = r6
        L5e:
            com.avito.android.remote.model.user_profile.items.UserProfileItem r7 = (com.avito.android.remote.model.user_profile.items.UserProfileItem) r7
            goto L62
        L61:
            r7 = r6
        L62:
            boolean r1 = r7 instanceof com.avito.android.remote.model.user_profile.items.PhonesItem
            if (r1 == 0) goto L69
            com.avito.android.remote.model.user_profile.items.PhonesItem r7 = (com.avito.android.remote.model.user_profile.items.PhonesItem) r7
            goto L6a
        L69:
            r7 = r6
        L6a:
            if (r7 == 0) goto L71
            java.util.List r1 = r7.getPhones()
            goto L72
        L71:
            r1 = r6
        L72:
            if (r1 != 0) goto L76
            kotlin.collections.z0 r1 = kotlin.collections.C42784z0.f406748b
        L76:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L7c:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L90
            java.lang.Object r7 = r1.next()
            r8 = r7
            com.avito.android.remote.model.user_profile.Phone r8 = (com.avito.android.remote.model.user_profile.Phone) r8
            boolean r8 = r8.isLocked()
            if (r8 == 0) goto L7c
            goto L91
        L90:
            r7 = r6
        L91:
            if (r7 == 0) goto Lc0
            r9.f226270r = r10
            r9.f226269q = r5
            r7 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r1 = kotlinx.coroutines.C43131e0.b(r7, r9)
            if (r1 != r0) goto La0
            return r0
        La0:
            r1 = r10
        La1:
            com.avito.android.profile.user_profile.j r10 = r2.f226282b
            r9.f226270r = r1
            r9.f226269q = r4
            java.lang.Object r10 = r10.c(r9)
            if (r10 != r0) goto Lae
            return r0
        Lae:
            java.util.List r10 = (java.util.List) r10
            com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction$UpdatePhones r2 = new com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction$UpdatePhones
            r2.<init>(r10)
            r9.f226270r = r6
            r9.f226269q = r3
            java.lang.Object r10 = r1.emit(r2, r9)
            if (r10 != r0) goto Lc3
            return r0
        Lc0:
            kotlinx.coroutines.flow.C43175k.w()
        Lc3:
            kotlin.G0 r10 = kotlin.G0.f406611a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.mvi.W.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
