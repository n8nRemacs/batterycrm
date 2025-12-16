package com.avito.android.profile.user_profile.mvi;

import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;
import l90.l;

/* compiled from: UserProfileActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$deeplinkHandlerFlow$1$2", f = "UserProfileActor.kt", i = {0, 0}, l = {389, 392}, m = "invokeSuspend", n = {"$this$flow", "result"}, s = {"L$0", "L$1"})
/* renamed from: com.avito.android.profile.user_profile.mvi.g, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33394g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public l.b f226480q;

    /* renamed from: r, reason: collision with root package name */
    public int f226481r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f226482s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C43501a f226483t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C33388a f226484u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33394g(C43501a c43501a, C33388a c33388a, Continuation<? super C33394g> continuation) {
        super(2, continuation);
        this.f226483t = c43501a;
        this.f226484u = c33388a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33394g c33394g = new C33394g(this.f226483t, this.f226484u, continuation);
        c33394g.f226482s = obj;
        return c33394g;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33394g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f226481r
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.C42729a0.b(r7)
            goto L62
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            l90.l$b r1 = r6.f226480q
            java.lang.Object r3 = r6.f226482s
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.InterfaceC43172j) r3
            kotlin.C42729a0.b(r7)
            goto L48
        L24:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f226482s
            kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.InterfaceC43172j) r7
            kv.a r1 = r6.f226483t
            Ju.c r1 = r1.f413261b
            l90.l$b r1 = (l90.l.b) r1
            java.lang.String r4 = r1.f413558b
            if (r4 == 0) goto L49
            com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction$ShowSnackBar r5 = new com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction$ShowSnackBar
            r5.<init>(r4)
            r6.f226482s = r7
            r6.f226480q = r1
            r6.f226481r = r3
            java.lang.Object r3 = r7.emit(r5, r6)
            if (r3 != r0) goto L47
            return r0
        L47:
            r3 = r7
        L48:
            r7 = r3
        L49:
            boolean r1 = r1.f413559c
            if (r1 == 0) goto L62
            com.avito.android.profile.user_profile.mvi.a r1 = r6.f226484u
            r3 = 3
            kotlinx.coroutines.flow.i r1 = com.avito.android.profile.user_profile.mvi.C33388a.d(r1, r3)
            r3 = 0
            r6.f226482s = r3
            r6.f226480q = r3
            r6.f226481r = r2
            java.lang.Object r7 = kotlinx.coroutines.flow.C43175k.u(r6, r1, r7)
            if (r7 != r0) goto L62
            return r0
        L62:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.user_profile.mvi.C33394g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
