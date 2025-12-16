package com.avito.android.select_field.mvi;

import Y41.p;
import Y61.l;
import com.avito.android.profile_settings_extended.adapter.select.SelectItem;
import com.avito.android.select.Arguments;
import com.avito.android.select_field.mvi.entity.SelectFieldInternalAction;
import java.util.Collections;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import sq0.C48401c;

/* compiled from: SelectFieldActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/select_field/mvi/entity/SelectFieldInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.select_field.mvi.SelectFieldActor$process$1", f = "SelectFieldActor.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super SelectFieldInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f267181q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f267182r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f267183s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C48401c f267184t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation, C48401c c48401c) {
        super(2, continuation);
        this.f267183s = cVar;
        this.f267184t = c48401c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f267183s, continuation, this.f267184t);
        aVar.f267182r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super SelectFieldInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f267181q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f267182r;
            SelectItem selectItem = this.f267183s.f267189a.f267179b;
            String str = selectItem.f229812b;
            String str2 = selectItem.f229817g;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            C48401c c48401c = this.f267184t;
            List<SelectItem.Option> list = c48401c.f438889c;
            SelectItem.Option option = c48401c.f438888b;
            List listSingletonList = option != null ? Collections.singletonList(option) : null;
            if (listSingletonList == null) {
                listSingletonList = C42784z0.f406748b;
            }
            SelectFieldInternalAction.OpenSelector openSelector = new SelectFieldInternalAction.OpenSelector(new Arguments(false, str, null, list, listSingletonList, str3, null, false, false, false, false, true, false, false, false, null, false, null, null, null, null, false, false, false, false, false, false, true, null, null, null, false, false, null, false, false, false, 0, null, null, -134257851, 255, null));
            this.f267181q = 1;
            if (interfaceC43172j.emit(openSelector, this) == coroutine_suspended) {
                return coroutine_suspended;
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
