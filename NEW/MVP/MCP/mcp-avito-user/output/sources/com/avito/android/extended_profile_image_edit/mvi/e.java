package com.avito.android.extended_profile_image_edit.mvi;

import com.avito.android.util.V2;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vA.InterfaceC49184b;

/* compiled from: BannerImageEditActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LvA/b$a;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_image_edit.mvi.BannerImageEditActor$process$5", f = "BannerImageEditActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class e extends SuspendLambda implements Y41.q<InterfaceC43172j<? super InterfaceC49184b.a>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Throwable f151061q;

    public e() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super InterfaceC49184b.a> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        e eVar = new e(3, continuation);
        eVar.f151061q = th2;
        return eVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Throwable th2 = this.f151061q;
        if (!(th2 instanceof CancellationException)) {
            V2.f318762a.e("BannerImageEditActor", th2);
        }
        return G0.f406611a;
    }
}
