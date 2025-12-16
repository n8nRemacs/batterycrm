package com.avito.android.select.new_metro.mvi;

import com.avito.android.select.new_metro.mvi.entity.SelectMetroInternalAction;
import com.avito.android.select.new_metro.mvi.entity.SelectMetroState;
import iq0.InterfaceC42091a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectMetroActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/select/new_metro/mvi/entity/SelectMetroInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.select.new_metro.mvi.SelectMetroActor$process$2", f = "SelectMetroActor.kt", i = {0}, l = {48, 50, 52}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super SelectMetroInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f266219q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f266220r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42091a f266221s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SelectMetroState f266222t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC42091a interfaceC42091a, SelectMetroState selectMetroState, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f266221s = interfaceC42091a;
        this.f266222t = selectMetroState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f266221s, this.f266222t, continuation);
        bVar.f266220r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SelectMetroInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f266219q;
        InterfaceC42091a interfaceC42091a = this.f266221s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f266220r;
            SelectMetroInternalAction.SearchTextChanged searchTextChanged = new SelectMetroInternalAction.SearchTextChanged(((InterfaceC42091a.i) interfaceC42091a).f405263a);
            this.f266220r = interfaceC43172j;
            this.f266219q = 1;
            if (interfaceC43172j.emit(searchTextChanged, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f266220r;
            C42729a0.b(obj);
        }
        if (((InterfaceC42091a.i) interfaceC42091a).f405263a.length() == 0) {
            SelectMetroInternalAction.NewOutputTypeSelected newOutputTypeSelected = new SelectMetroInternalAction.NewOutputTypeSelected(this.f266222t.f266248b);
            this.f266220r = null;
            this.f266219q = 2;
            if (interfaceC43172j.emit(newOutputTypeSelected, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            SelectMetroInternalAction.ResetScroll resetScroll = SelectMetroInternalAction.ResetScroll.f266242b;
            this.f266220r = null;
            this.f266219q = 3;
            if (interfaceC43172j.emit(resetScroll, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
