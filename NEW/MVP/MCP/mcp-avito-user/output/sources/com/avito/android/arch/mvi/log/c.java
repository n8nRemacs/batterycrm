package com.avito.android.arch.mvi.log;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.arch.mvi.log.f;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FeatureLogger.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@"}, d2 = {"", "T", "value", "Lkotlin/G0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.arch.mvi.log.FeatureLoggerKt$logFeature$2", f = "FeatureLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class c extends SuspendLambda implements p<Object, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f91981q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f91982r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f91983s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, String str, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f91982r = aVar;
        this.f91983s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(this.f91982r, this.f91983s, continuation);
        cVar.f91981q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Continuation<? super G0> continuation) {
        return ((c) create(obj, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Object obj2 = this.f91981q;
        this.f91982r.b(this.f91983s, f.d.a(VoiceInfo.STATE), obj2);
        return G0.f406611a;
    }
}
