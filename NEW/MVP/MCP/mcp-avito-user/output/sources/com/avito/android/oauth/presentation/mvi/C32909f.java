package com.avito.android.oauth.presentation.mvi;

import com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: OAuthActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.oauth.presentation.mvi.OAuthActor$process$14", f = "OAuthActor.kt", i = {0, 1, 2, 3}, l = {71, 74, 81, 88, 94}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
/* renamed from: com.avito.android.oauth.presentation.mvi.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32909f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super OAuthInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f208326q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f208327r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l40.c f208328s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C32904a f208329t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32909f(l40.c cVar, C32904a c32904a, Continuation<? super C32909f> continuation) {
        super(2, continuation);
        this.f208328s = cVar;
        this.f208329t = c32904a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32909f c32909f = new C32909f(this.f208328s, this.f208329t, continuation);
        c32909f.f208327r = obj;
        return c32909f;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super OAuthInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C32909f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.f208326q
            r2 = 0
            r3 = 5
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L36
            if (r1 == r7) goto L2e
            if (r1 == r6) goto L25
            if (r1 == r5) goto L25
            if (r1 == r4) goto L25
            if (r1 != r3) goto L1d
            kotlin.C42729a0.b(r13)
            goto Lc9
        L1d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L25:
            java.lang.Object r1 = r12.f208327r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r13)
            goto Lb8
        L2e:
            java.lang.Object r1 = r12.f208327r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r13)
            goto L4e
        L36:
            kotlin.C42729a0.b(r13)
            java.lang.Object r13 = r12.f208327r
            kotlinx.coroutines.flow.j r13 = (kotlinx.coroutines.flow.InterfaceC43172j) r13
            com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction$SetSubmitButtonLoading r1 = new com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction$SetSubmitButtonLoading
            r1.<init>(r7)
            r12.f208327r = r13
            r12.f208326q = r7
            java.lang.Object r1 = r13.emit(r1, r12)
            if (r1 != r0) goto L4d
            return r0
        L4d:
            r1 = r13
        L4e:
            l40.c r13 = r12.f208328s
            boolean r8 = r13 instanceof l40.c.g
            com.avito.android.oauth.presentation.mvi.a r9 = r12.f208329t
            if (r8 == 0) goto L67
            com.avito.android.oauth.presentation.mvi.A r13 = r9.f208280c
            kotlinx.coroutines.flow.i r13 = r13.c()
            r12.f208327r = r1
            r12.f208326q = r6
            java.lang.Object r13 = kotlinx.coroutines.flow.C43175k.u(r12, r13, r1)
            if (r13 != r0) goto Lb8
            return r0
        L67:
            boolean r6 = r13 instanceof l40.c.b
            if (r6 == 0) goto Lb8
            l40.c$b r13 = (l40.c.b) r13
            l40.c$c r6 = r13.f413476e
            java.lang.String r6 = r6.f413486a
            int r6 = r6.length()
            if (r6 != 0) goto L79
            r6 = r7
            goto L7a
        L79:
            r6 = r2
        L7a:
            l40.c$c r8 = r13.f413476e
            java.lang.String r8 = r8.f413488c
            int r10 = com.avito.android.oauth.presentation.mvi.C32904a.f208277d
            r9.getClass()
            kotlin.text.p r10 = new kotlin.text.p
            java.lang.String r11 = "^7\\d{10}$"
            r10.<init>(r11)
            boolean r8 = r10.e(r8)
            if (r6 != 0) goto La6
            if (r8 != 0) goto L93
            goto La6
        L93:
            l40.c$c r13 = r13.f413476e
            com.avito.android.oauth.presentation.mvi.A r5 = r9.f208280c
            kotlinx.coroutines.flow.i r13 = r5.d(r13)
            r12.f208327r = r1
            r12.f208326q = r4
            java.lang.Object r13 = kotlinx.coroutines.flow.C43175k.u(r12, r13, r1)
            if (r13 != r0) goto Lb8
            return r0
        La6:
            com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction$ShowFormErrors r13 = new com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction$ShowFormErrors
            r4 = r8 ^ 1
            r13.<init>(r6, r4)
            r12.f208327r = r1
            r12.f208326q = r5
            java.lang.Object r13 = r1.emit(r13, r12)
            if (r13 != r0) goto Lb8
            return r0
        Lb8:
            com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction$SetSubmitButtonLoading r13 = new com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction$SetSubmitButtonLoading
            r13.<init>(r2)
            r2 = 0
            r12.f208327r = r2
            r12.f208326q = r3
            java.lang.Object r13 = r1.emit(r13, r12)
            if (r13 != r0) goto Lc9
            return r0
        Lc9:
            kotlin.G0 r13 = kotlin.G0.f406611a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.oauth.presentation.mvi.C32909f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
