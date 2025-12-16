package com.avito.android.profile_settings_basic.mvi;

import Qb0.InterfaceC14878a;
import Qb0.InterfaceC14879b;
import Qb0.e;
import com.avito.android.profile_settings_basic.adapter.basic_info.BasicInfoItem;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BasicProfileSettingsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LQb0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_basic.mvi.BasicProfileSettingsActor$process$3", f = "BasicProfileSettingsActor.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC14879b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f228866q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f228867r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14878a f228868s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC14878a interfaceC14878a, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f228868s = interfaceC14878a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f228868s, continuation);
        cVar.f228867r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC14879b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f228866q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f228867r;
            BasicInfoItem basicInfoItem = ((e.c) this.f228868s).f13918b;
            String str = basicInfoItem.f228587g;
            if (str != null) {
                String str2 = basicInfoItem.f228590j;
                BasicInfoItem.TextField textField = basicInfoItem.f228588h;
                InterfaceC14879b.n nVar = new InterfaceC14879b.n(str, str2, textField != null ? textField.f228603c : null, basicInfoItem.f228591k);
                this.f228866q = 1;
                if (interfaceC43172j.emit(nVar, this) == coroutine_suspended) {
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
