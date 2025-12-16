package com.avito.android.publish.screen.step.request.steps.loader;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.publish.PublishParametersInteractor;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: StepsRequestLoader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/publish/PublishParametersInteractor$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/publish/PublishParametersInteractor$a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.request.steps.loader.StepsRequestLoaderImpl$loadEditSteps$2", f = "StepsRequestLoader.kt", i = {}, l = {102, 122}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super PublishParametersInteractor.a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f242035q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f242036r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f242037s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b bVar, String str, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f242036r = bVar;
        this.f242037s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new f(this.f242036r, this.f242037s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super PublishParametersInteractor.a> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8 A[PHI: r7
  0x00a8: PHI (r7v24 java.lang.Object) = (r7v19 java.lang.Object), (r7v0 java.lang.Object) binds: [B:22:0x00a5, B:6:0x000e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
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
            int r1 = r6.f242035q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.C42729a0.b(r7)
            goto La8
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.C42729a0.b(r7)
            goto L5f
        L1f:
            kotlin.C42729a0.b(r7)
            com.avito.android.publish.screen.step.request.steps.loader.b r7 = r6.f242036r
            com.avito.android.publish.C0 r7 = r7.f242014c
            com.avito.android.publish.PublishState r7 = r7.f231861Y
            com.avito.android.remote.model.Navigation r7 = r7.getNavigation()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L6c
            com.avito.android.publish.screen.step.request.steps.loader.b r7 = r6.f242036r
            java.lang.String r1 = r6.f242037s
            yc.a r4 = r7.f242017f
            Zd0.c r5 = r7.f242020i
            java.lang.String r5 = r5.a()
            r4.f443211c = r5
            r4.f443210b = r5
            yc.a r4 = r7.f242017f
            com.avito.android.analytics.publish.FromPage r5 = com.avito.android.analytics.publish.FromPage.f90273c
            r4.f443212d = r5
            yc.a r7 = r7.f242017f
            r7.f443213e = r1
            com.avito.android.publish.screen.step.request.steps.loader.b r7 = r6.f242036r
            com.avito.android.publish.PublishParametersInteractor r7 = r7.f242019h
            java.lang.String r1 = r6.f242037s
            io.reactivex.rxjava3.core.I r7 = r7.h(r1)
            r6.f242035q = r3
            java.lang.Object r7 = kotlinx.coroutines.rx3.C43292o.b(r7, r6)
            if (r7 != r0) goto L5f
            return r0
        L5f:
            com.avito.android.remote.model.ItemBrief r7 = (com.avito.android.remote.model.ItemBrief) r7
            com.avito.android.publish.screen.step.request.steps.loader.b r1 = r6.f242036r
            com.avito.android.publish.C0 r1 = r1.f242014c
            r1.f231867e0 = r7
            com.avito.android.remote.model.Navigation r7 = r7.getNavigation()
            goto L76
        L6c:
            com.avito.android.publish.screen.step.request.steps.loader.b r7 = r6.f242036r
            com.avito.android.publish.C0 r7 = r7.f242014c
            com.avito.android.publish.PublishState r7 = r7.f231861Y
            com.avito.android.remote.model.Navigation r7 = r7.getNavigation()
        L76:
            com.avito.android.publish.screen.step.request.steps.loader.b r1 = r6.f242036r
            boolean r3 = r1.f242012a
            if (r3 == 0) goto L91
            com.avito.android.publish.PublishParametersInteractor r3 = r1.f242019h
            java.lang.String r4 = r6.f242037s
            com.avito.android.publish.C0 r1 = r1.f242014c
            java.lang.String r1 = r1.se()
            com.avito.android.publish.screen.step.request.steps.loader.b r5 = r6.f242036r
            com.avito.android.publish.C0 r5 = r5.f242014c
            java.lang.String r5 = r5.f231868f0
            io.reactivex.rxjava3.core.I r7 = r3.j(r7, r4, r1, r5)
            goto L9f
        L91:
            com.avito.android.publish.PublishParametersInteractor r3 = r1.f242019h
            com.avito.android.publish.C0 r1 = r1.f242014c
            com.avito.android.remote.model.category_parameters.CategoryParameters r4 = r1.f231873k0
            boolean r5 = r1.f231875m0
            java.lang.String r1 = r1.f231868f0
            io.reactivex.rxjava3.core.I r7 = r3.e(r7, r4, r5, r1)
        L9f:
            r6.f242035q = r2
            java.lang.Object r7 = kotlinx.coroutines.rx3.C43292o.b(r7, r6)
            if (r7 != r0) goto La8
            return r0
        La8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.request.steps.loader.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
