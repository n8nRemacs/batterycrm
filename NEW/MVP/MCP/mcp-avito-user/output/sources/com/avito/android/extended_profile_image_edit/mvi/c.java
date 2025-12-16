package com.avito.android.extended_profile_image_edit.mvi;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vA.InterfaceC49184b;

/* compiled from: BannerImageEditActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LvA/b;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_image_edit.mvi.BannerImageEditActor$process$3", f = "BannerImageEditActor.kt", i = {0}, l = {66, 67}, m = "invokeSuspend", n = {"$this$catch"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super InterfaceC49184b>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f151046q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f151047r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f151048s;

    public c() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super InterfaceC49184b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        c cVar = new c(3, continuation);
        cVar.f151047r = interfaceC43172j;
        cVar.f151048s = th2;
        return cVar.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.f151046q
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.C42729a0.b(r5)
            goto L46
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlinx.coroutines.flow.j r1 = r4.f151047r
            kotlin.C42729a0.b(r5)
            goto L38
        L20:
            kotlin.C42729a0.b(r5)
            kotlinx.coroutines.flow.j r1 = r4.f151047r
            java.lang.Throwable r5 = r4.f151048s
            boolean r5 = r5 instanceof java.util.concurrent.CancellationException
            if (r5 != 0) goto L46
            vA.b$h r5 = vA.InterfaceC49184b.h.f440500a
            r4.f151047r = r1
            r4.f151046q = r3
            java.lang.Object r5 = r1.emit(r5, r4)
            if (r5 != r0) goto L38
            return r0
        L38:
            vA.b$f r5 = vA.InterfaceC49184b.f.f440498a
            r3 = 0
            r4.f151047r = r3
            r4.f151046q = r2
            java.lang.Object r5 = r1.emit(r5, r4)
            if (r5 != r0) goto L46
            return r0
        L46:
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile_image_edit.mvi.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
