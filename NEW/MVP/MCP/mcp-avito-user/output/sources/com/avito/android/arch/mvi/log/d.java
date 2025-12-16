package com.avito.android.arch.mvi.log;

import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.arch.mvi.log.f;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.concurrent.CancellationException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FeatureLogger.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T", "Lkotlinx/coroutines/flow/j;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.arch.mvi.log.FeatureLoggerKt$logFeature$3", f = "FeatureLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class d extends SuspendLambda implements q<InterfaceC43172j<Object>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Throwable f91984q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f91985r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f91986s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, String str, Continuation<? super d> continuation) {
        super(3, continuation);
        this.f91985r = aVar;
        this.f91986s = str;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<Object> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        d dVar = new d(this.f91985r, this.f91986s, continuation);
        dVar.f91984q = th2;
        return dVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Throwable th2 = this.f91984q;
        String str = this.f91986s;
        a aVar = this.f91985r;
        if (th2 == null) {
            aVar.c(str, f.d.a("completed"));
        } else if (th2 instanceof CancellationException) {
            aVar.c(str, f.d.a("cancelled"));
        } else {
            aVar.a(str, f.d.a(VoiceInfo.STATE), th2);
        }
        return G0.f406611a;
    }
}
