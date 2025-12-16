package com.avito.android.publish.screen.step.request.steps.loader;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.publish.PublishState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: StepsRequestLoader.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/publish/PublishState;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/publish/PublishState;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.screen.step.request.steps.loader.StepsRequestLoaderImpl$deserializedState$2", f = "StepsRequestLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super PublishState>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b f242027q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f242028r;

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/N1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends com.google.gson.reflect.a<PublishState> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, String str, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f242027q = bVar;
        this.f242028r = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f242027q, this.f242028r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super PublishState> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r4) {
        /*
            r3 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.C42729a0.b(r4)
            com.avito.android.publish.screen.step.request.steps.loader.b r4 = r3.f242027q
            com.google.gson.Gson r4 = r4.f242021j
            com.avito.android.publish.screen.step.request.steps.loader.c$a r0 = new com.avito.android.publish.screen.step.request.steps.loader.c$a
            r0.<init>()
            java.lang.reflect.Type r0 = r0.getType()
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L25
            r1 = r0
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            boolean r2 = com.avito.android.util.R1.a(r1)
            if (r2 == 0) goto L25
            java.lang.reflect.Type r0 = r1.getRawType()
            goto L29
        L25:
            java.lang.reflect.Type r0 = com.avito.android.util.R1.b(r0)
        L29:
            java.lang.String r1 = r3.f242028r
            java.lang.Object r4 = r4.e(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.screen.step.request.steps.loader.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
