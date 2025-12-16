package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import lr0.InterfaceC43821a;

/* compiled from: BxContentInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V", "com/avito/android/bxcontent/mvi/x0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$loadCarouselItems$lambda$7$$inlined$loadCarouselItems$2", f = "BxContentInteractor.kt", i = {}, l = {1293}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.mvi.z0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29234z0 extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, Throwable, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f112637q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f112638r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f112639s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43821a f112640t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29234z0(InterfaceC43821a interfaceC43821a, Continuation continuation) {
        super(3, continuation);
        this.f112640t = interfaceC43821a;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
        C29234z0 c29234z0 = new C29234z0(this.f112640t, continuation);
        c29234z0.f112638r = interfaceC43172j;
        c29234z0.f112639s = th2;
        return c29234z0.invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f112637q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f112638r;
            V2.f318762a.a("BxContentInteractor", "Error loading itemsCarouselWidget", this.f112639s);
            BxContentInternalAction.RemoveItem.ByStringId byStringId = new BxContentInternalAction.RemoveItem.ByStringId(this.f112640t.getF116728d());
            this.f112637q = 1;
            if (interfaceC43172j.emit(byStringId, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
