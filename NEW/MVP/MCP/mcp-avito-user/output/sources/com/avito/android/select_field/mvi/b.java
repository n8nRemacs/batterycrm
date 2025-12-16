package com.avito.android.select_field.mvi;

import Y41.p;
import Y61.l;
import com.avito.android.profile_settings_extended.adapter.select.SelectItem;
import com.avito.android.select_field.mvi.entity.SelectFieldInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import sq0.C48401c;

/* compiled from: SelectFieldActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.select_field.mvi.SelectFieldActor$process$2", f = "SelectFieldActor.kt", i = {}, l = {44, 46}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super SelectFieldInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f267185q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f267186r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C48401c f267187s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f267188t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation, C48401c c48401c) {
        super(2, continuation);
        this.f267187s = c48401c;
        this.f267188t = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f267188t, continuation, this.f267187s);
        bVar.f267186r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SelectFieldInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f267185q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f267186r;
            C48401c c48401c = this.f267187s;
            if (c48401c.f438890d) {
                return G0.f406611a;
            }
            c cVar = this.f267188t;
            Integer num = cVar.f267189a.f267179b.f229822l;
            SelectItem.Option option = c48401c.f438888b;
            if (L.f(num, option != null ? Boxing.boxInt(option.f229827c) : null)) {
                SelectFieldInternalAction.SubmitSuccess submitSuccess = new SelectFieldInternalAction.SubmitSuccess(false);
                this.f267185q = 2;
                if (interfaceC43172j.emit(submitSuccess, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                InterfaceC43160i<SelectFieldInternalAction> interfaceC43160iA = cVar.f267190b.a(option != null ? Boxing.boxInt(option.f229827c) : null);
                this.f267185q = 1;
                if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
