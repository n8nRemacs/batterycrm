package com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.CategoryParameters;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: BasePretendPremoderationLoader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/publish/screen/step/request/mergedpretendpremoderation/loader/a$b;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.BasePretendPremoderationLoader$pretend$2", f = "BasePretendPremoderationLoader.kt", i = {}, l = {35, 37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class e extends SuspendLambda implements p<T, Continuation<? super a.b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f241788q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f241789r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Navigation f241790s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ CategoryParameters f241791t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, Navigation navigation2, CategoryParameters categoryParameters, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f241789r = aVar;
        this.f241790s = navigation2;
        this.f241791t = categoryParameters;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new e(this.f241789r, this.f241790s, this.f241791t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super a.b> continuation) {
        return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0061 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:6:0x0010, B:23:0x0059, B:25:0x0061, B:26:0x0064, B:12:0x001e, B:18:0x0038, B:20:0x0044, B:15:0x0025), top: B:30:0x000a }] */
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
            int r1 = r6.f241788q
            com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a r2 = r6.f241789r
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L14
            goto L59
        L14:
            r7 = move-exception
            goto L67
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            kotlin.C42729a0.b(r7)     // Catch: java.lang.Throwable -> L14
            goto L38
        L22:
            kotlin.C42729a0.b(r7)
            com.avito.android.publish.pretend.e r7 = r2.f241768b     // Catch: java.lang.Throwable -> L14
            com.avito.android.remote.model.Navigation r1 = r6.f241790s     // Catch: java.lang.Throwable -> L14
            com.avito.android.remote.model.category_parameters.CategoryParameters r5 = r6.f241791t     // Catch: java.lang.Throwable -> L14
            io.reactivex.rxjava3.core.I r7 = r7.a(r1, r5)     // Catch: java.lang.Throwable -> L14
            r6.f241788q = r4     // Catch: java.lang.Throwable -> L14
            java.lang.Object r7 = kotlinx.coroutines.rx3.C43292o.b(r7, r6)     // Catch: java.lang.Throwable -> L14
            if (r7 != r0) goto L38
            return r0
        L38:
            com.avito.android.remote.model.PretendResult r7 = (com.avito.android.remote.model.PretendResult) r7     // Catch: java.lang.Throwable -> L14
            java.util.Map r7 = r7.getErrors()     // Catch: java.lang.Throwable -> L14
            boolean r1 = r7.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L64
            r6.f241788q = r3     // Catch: java.lang.Throwable -> L14
            com.avito.android.util.R0 r1 = r2.f241767a     // Catch: java.lang.Throwable -> L14
            kotlinx.coroutines.d1 r1 = r1.d()     // Catch: java.lang.Throwable -> L14
            com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.c r3 = new com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.c     // Catch: java.lang.Throwable -> L14
            r4 = 0
            r3.<init>(r2, r7, r4)     // Catch: java.lang.Throwable -> L14
            java.lang.Object r7 = kotlinx.coroutines.C43259k.g(r1, r3, r6)     // Catch: java.lang.Throwable -> L14
            if (r7 != r0) goto L59
            return r0
        L59:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L14
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L14
            if (r7 == 0) goto L64
            com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a$b$b r7 = com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a.b.C7242b.f241776a     // Catch: java.lang.Throwable -> L14
            goto L71
        L64:
            com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a$b$c r7 = com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a.b.c.f241777a     // Catch: java.lang.Throwable -> L14
            goto L71
        L67:
            com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a$b$a r0 = new com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.a$b$a
            java.lang.String r7 = com.avito.android.error.z.l(r7)
            r0.<init>(r7)
            r7 = r0
        L71:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.request.mergedpretendpremoderation.loader.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
