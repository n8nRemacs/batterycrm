package com.avito.android.sx_address.list.mvi;

import com.avito.android.ActionModalDialogContent;
import com.avito.android.T0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.sx_address.list.mvi.entity.a;
import com.avito.android.sx_address.list.mvi.entity.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SxAddressListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.list.mvi.SxAddressListActor$invoke$23", f = "SxAddressListActor.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class o extends SuspendLambda implements Y41.p<InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f293342q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f293343r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x f293344s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.k f293345t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(x xVar, a.k kVar, Continuation<? super o> continuation) {
        super(2, continuation);
        this.f293344s = xVar;
        this.f293345t = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        o oVar = new o(this.f293344s, this.f293345t, continuation);
        oVar.f293343r = obj;
        return oVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.sx_address.list.mvi.entity.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((o) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f293342q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f293343r;
            x xVar = this.f293344s;
            String f293202k = xVar.f293381f.getF293202k();
            com.avito.android.sx_address.list.e eVar = xVar.f293381f;
            ActionModalDialogContent actionModalDialogContent = new ActionModalDialogContent(f293202k, new AttributedText(eVar.getF293203l(), C42784z0.f406748b, 0, 4, null), eVar.getF293204m(), eVar.getF293205n());
            DeepLink deepLink = this.f293345t.f293267a;
            T0 t02 = deepLink instanceof T0 ? (T0) deepLink : null;
            ActionModalDialogContent f67553c = t02 != null ? t02.getF67553c() : null;
            if (f67553c != null) {
                actionModalDialogContent = f67553c;
            }
            b.r rVar = new b.r(actionModalDialogContent, deepLink);
            this.f293342q = 1;
            if (interfaceC43172j.emit(rVar, this) == coroutine_suspended) {
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
