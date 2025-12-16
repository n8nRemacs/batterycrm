package com.avito.android.sx_address.selectaddresslist.mvi;

import UA0.a;
import UA0.b;
import com.avito.android.sx_address.selectaddresslist.domain.AddressListViewItem;
import com.avito.android.sx_address.selectaddresslist.mvi.entity.SelectAddressListState;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.text.C43059p;
import kotlin.text.RegexOption;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectAddressListActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LUA0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sx_address.selectaddresslist.mvi.SelectAddressListActor$invoke$7", f = "SelectAddressListActor.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UA0.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f294123q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f294124r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SelectAddressListState f294125s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f294126t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ a.e f294127u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SelectAddressListState selectAddressListState, h hVar, a.e eVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f294125s = selectAddressListState;
        this.f294126t = hVar;
        this.f294127u = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        g gVar = new g(this.f294125s, this.f294126t, this.f294127u, continuation);
        gVar.f294124r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UA0.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f294123q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f294124r;
            List<AddressListViewItem> list = this.f294125s.f294110a.f294076b;
            List arrayList = C42784z0.f406748b;
            for (Object obj2 : list) {
                AddressListViewItem addressListViewItem = (AddressListViewItem) obj2;
                String str = this.f294127u.f16247a;
                this.f294126t.getClass();
                C43059p c43059p = new C43059p(str, RegexOption.f410582c);
                if (!c43059p.a(addressListViewItem.f294067e)) {
                    if (c43059p.a(addressListViewItem.f294066d + ", " + addressListViewItem.f294065c)) {
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                v0.b(arrayList).add(obj2);
            }
            b.C1105b c1105b = new b.C1105b(arrayList);
            this.f294123q = 1;
            if (interfaceC43172j.emit(c1105b, this) == coroutine_suspended) {
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
