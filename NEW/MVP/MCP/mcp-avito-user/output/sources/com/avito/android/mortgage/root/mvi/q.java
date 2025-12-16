package com.avito.android.mortgage.root.mvi;

import KZ.C14285o;
import KZ.InterfaceC14286p;
import KZ.O;
import com.avito.android.mortgage.api.model.items.form.SuggestFormSuggestType;
import com.avito.android.mortgage.root.mvi.entity.MortgageRootInternalAction;
import g10.C40513c;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MortgageRootActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/root/mvi/entity/MortgageRootInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.root.mvi.MortgageRootActor$process$9", f = "MortgageRootActor.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class q extends SuspendLambda implements Y41.p<InterfaceC43172j<? super MortgageRootInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f203313q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f203314r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C40513c f203315s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f203316t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, C40513c c40513c, Continuation continuation) {
        super(2, continuation);
        this.f203315s = c40513c;
        this.f203316t = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        q qVar = new q(this.f203316t, this.f203315s, continuation);
        qVar.f203314r = obj;
        return qVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super MortgageRootInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((q) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f203313q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f203314r;
            C40513c c40513c = this.f203315s;
            if (c40513c.f396252h) {
                return G0.f406611a;
            }
            Iterator<T> it = c40513c.f396248d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C14285o) next).f9530b instanceof KZ.D) {
                    break;
                }
            }
            C14285o c14285o = (C14285o) next;
            InterfaceC14286p interfaceC14286p = c14285o != null ? c14285o.f9530b : null;
            KZ.D d12 = (KZ.D) (interfaceC14286p instanceof KZ.D ? interfaceC14286p : null);
            if (d12 == null) {
                return G0.f406611a;
            }
            O addressOption = d12.getDetails().getAddressOption();
            if (addressOption.getIsSelected()) {
                String title = addressOption.getField().getTitle();
                String value = addressOption.getField().getValue();
                if (value == null) {
                    value = "";
                }
                MortgageRootInternalAction.RealtyObjectDetailsAddressFocused realtyObjectDetailsAddressFocused = new MortgageRootInternalAction.RealtyObjectDetailsAddressFocused(title, value, addressOption.getField().getPlaceholder(), SuggestFormSuggestType.ADDRESS);
                this.f203313q = 1;
                if (interfaceC43172j.emit(realtyObjectDetailsAddressFocused, this) == coroutine_suspended) {
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
