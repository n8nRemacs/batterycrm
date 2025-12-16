package com.avito.android.edit_text_field;

import Ay.InterfaceC13104b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EditTextFieldInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LAy/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.edit_text_field.EditTextFieldInteractorImpl$editBasicSettingsTextField$1", f = "EditTextFieldInteractor.kt", i = {0, 1}, l = {141, 143, 145}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* renamed from: com.avito.android.edit_text_field.h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30332h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC13104b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f146978q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f146979r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C30336l f146980s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f146981t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f146982u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30332h(C30336l c30336l, String str, String str2, Continuation<? super C30332h> continuation) {
        super(2, continuation);
        this.f146980s = c30336l;
        this.f146981t = str;
        this.f146982u = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30332h c30332h = new C30332h(this.f146980s, this.f146981t, this.f146982u, continuation);
        c30332h.f146979r = obj;
        return c30332h;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC13104b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30332h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) throws com.avito.android.util.ApiException {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f146978q
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.C42729a0.b(r8)
            goto L7e
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            java.lang.Object r1 = r7.f146979r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L5f
        L25:
            java.lang.Object r1 = r7.f146979r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r8)
            goto L42
        L2d:
            kotlin.C42729a0.b(r8)
            java.lang.Object r8 = r7.f146979r
            kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
            Ay.b$g r1 = Ay.InterfaceC13104b.g.f749a
            r7.f146979r = r8
            r7.f146978q = r4
            java.lang.Object r1 = r8.emit(r1, r7)
            if (r1 != r0) goto L41
            return r0
        L41:
            r1 = r8
        L42:
            com.avito.android.edit_text_field.l r8 = r7.f146980s
            h31.e<com.avito.android.remote.D0> r8 = r8.f147000b
            java.lang.Object r8 = r8.get()
            com.avito.android.remote.D0 r8 = (com.avito.android.remote.D0) r8
            java.lang.String r5 = r7.f146982u
            java.lang.String r6 = r7.f146981t
            java.util.Map r5 = java.util.Collections.singletonMap(r6, r5)
            r7.f146979r = r1
            r7.f146978q = r3
            java.lang.Object r8 = r8.f(r5, r7)
            if (r8 != r0) goto L5f
            return r0
        L5f:
            com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8
            boolean r3 = r8 instanceof com.avito.android.remote.model.TypedResult.Success
            if (r3 == 0) goto L81
            com.avito.android.remote.model.TypedResult$Success r8 = (com.avito.android.remote.model.TypedResult.Success) r8
            java.lang.Object r8 = r8.getResult()
            kotlin.G0 r8 = (kotlin.G0) r8
            Ay.b$a r8 = new Ay.b$a
            r8.<init>(r4)
            r3 = 0
            r7.f146979r = r3
            r7.f146978q = r2
            java.lang.Object r8 = r1.emit(r8, r7)
            if (r8 != r0) goto L7e
            return r0
        L7e:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        L81:
            boolean r0 = r8 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r0 == 0) goto L94
            com.avito.android.remote.model.TypedResult$Error r8 = (com.avito.android.remote.model.TypedResult.Error) r8
            com.avito.android.remote.error.ApiError r0 = r8.getError()
            java.lang.Throwable r8 = r8.getCause()
            com.avito.android.util.ApiException r8 = com.avito.android.util.C35936s.a(r0, r8)
            throw r8
        L94:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.edit_text_field.C30332h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
