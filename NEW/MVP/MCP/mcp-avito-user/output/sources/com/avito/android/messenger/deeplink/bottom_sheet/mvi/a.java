package com.avito.android.messenger.deeplink.bottom_sheet.mvi;

import VY.a;
import Y41.p;
import com.avito.android.messenger.deeplink.bottom_sheet.mvi.entity.BottomSheetInputInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BottomSheetInputActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/messenger/deeplink/bottom_sheet/mvi/entity/BottomSheetInputInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.deeplink.bottom_sheet.mvi.BottomSheetInputActor$process$1", f = "BottomSheetInputActor.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super BottomSheetInputInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f195469q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f195470r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ VY.a f195471s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ VY.c f195472t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(VY.a aVar, VY.c cVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f195471s = aVar;
        this.f195472t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f195471s, this.f195472t, continuation);
        aVar.f195470r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BottomSheetInputInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f195469q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f195470r;
            boolean z12 = !C43066x.K(((a.b) this.f195471s).f17188a);
            if (this.f195472t.f17193b != z12) {
                BottomSheetInputInternalAction.ButtonStateChanged buttonStateChanged = new BottomSheetInputInternalAction.ButtonStateChanged(z12);
                this.f195469q = 1;
                if (interfaceC43172j.emit(buttonStateChanged, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
