package com.avito.android.work_profile.profile.about_me.mvi;

import Y41.p;
import com.avito.android.work_profile.profile.about_me.mvi.entity.AboutMeInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import hQ0.InterfaceC40866a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AboutMeActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/work_profile/profile/about_me/mvi/entity/AboutMeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.work_profile.profile.about_me.mvi.AboutMeActor$handlePublicAction$1", f = "AboutMeActor.kt", i = {0, 1}, l = {AvailableCode.HMS_IS_SPOOF, 32, 37, 43}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super AboutMeInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f330783q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f330784r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40866a.d f330785s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f330786t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC40866a.d dVar, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f330785s = dVar;
        this.f330786t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f330785s, this.f330786t, continuation);
        aVar.f330784r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AboutMeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
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
            int r1 = r6.f330783q
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L32
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L22
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.C42729a0.b(r7)
            goto La8
        L22:
            java.lang.Object r1 = r6.f330784r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L67
        L2a:
            java.lang.Object r1 = r6.f330784r
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            kotlin.C42729a0.b(r7)
            goto L52
        L32:
            kotlin.C42729a0.b(r7)
            java.lang.Object r7 = r6.f330784r
            r1 = r7
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
            hQ0.a$d r7 = r6.f330785s
            hQ0.a$b r7 = (hQ0.InterfaceC40866a.b) r7
            boolean r7 = r7.f397190a
            if (r7 == 0) goto L52
            com.avito.android.work_profile.profile.about_me.mvi.entity.AboutMeInternalAction$StartLoading r7 = new com.avito.android.work_profile.profile.about_me.mvi.entity.AboutMeInternalAction$StartLoading
            r7.<init>()
            r6.f330784r = r1
            r6.f330783q = r5
            java.lang.Object r7 = r1.emit(r7, r6)
            if (r7 != r0) goto L52
            return r0
        L52:
            com.avito.android.work_profile.profile.about_me.mvi.b r7 = r6.f330786t
            com.avito.android.work_profile.domain.j r5 = r7.f330787a
            java.util.Set<java.lang.String> r7 = r7.f330788b
            java.lang.String r7 = ZS.d.a(r7)
            r6.f330784r = r1
            r6.f330783q = r4
            java.lang.Object r7 = r5.b(r7, r6)
            if (r7 != r0) goto L67
            return r0
        L67:
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
            boolean r4 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
            r5 = 0
            if (r4 == 0) goto L8e
            com.avito.android.work_profile.profile.about_me.mvi.entity.AboutMeInternalAction$ContentLoaded r2 = new com.avito.android.work_profile.profile.about_me.mvi.entity.AboutMeInternalAction$ContentLoaded
            com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
            java.lang.Object r7 = r7.getResult()
            com.avito.android.work_profile.api.about_me.AboutMeResponse r7 = (com.avito.android.work_profile.api.about_me.AboutMeResponse) r7
            com.google.gson.k r7 = r7.getForm()
            java.lang.String r7 = r7.toString()
            r2.<init>(r7)
            r6.f330784r = r5
            r6.f330783q = r3
            java.lang.Object r7 = r1.emit(r2, r6)
            if (r7 != r0) goto La8
            return r0
        L8e:
            boolean r3 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
            if (r3 == 0) goto La8
            com.avito.android.work_profile.profile.about_me.mvi.entity.AboutMeInternalAction$Error r3 = new com.avito.android.work_profile.profile.about_me.mvi.entity.AboutMeInternalAction$Error
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
            com.avito.android.remote.error.ApiError r7 = r7.getError()
            r3.<init>(r7)
            r6.f330784r = r5
            r6.f330783q = r2
            java.lang.Object r7 = r1.emit(r3, r6)
            if (r7 != r0) goto La8
            return r0
        La8:
            kotlin.G0 r7 = kotlin.G0.f406611a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.work_profile.profile.about_me.mvi.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
