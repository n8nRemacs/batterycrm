package com.avito.android.mortgage.landing.mvi;

import com.avito.android.mortgage.landing.list.items.LandingItem;
import com.avito.android.mortgage.landing.list.items.select.SelectItem;
import com.avito.android.mortgage.landing.mvi.entity.LandingInternalAction;
import com.avito.android.mortgage.landing.mvi.entity.LandingState;
import com.avito.android.select.Arguments;
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

/* compiled from: LandingActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingInternalAction$OpenSelectorDialog;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.landing.mvi.LandingActor$selectorClick$1", f = "LandingActor.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super LandingInternalAction.OpenSelectorDialog>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f200147q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f200148r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LandingState f200149s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f200150t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f200151u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LandingState landingState, String str, g gVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f200149s = landingState;
        this.f200150t = str;
        this.f200151u = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f200149s, this.f200150t, this.f200151u, continuation);
        eVar.f200148r = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super LandingInternalAction.OpenSelectorDialog> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f200147q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f200148r;
            LandingItem landingItem = this.f200149s.f200227c.get(this.f200150t);
            SelectItem selectItem = landingItem instanceof SelectItem ? (SelectItem) landingItem : null;
            if (selectItem == null) {
                return G0.f406611a;
            }
            List<SelectItem.Option> list = selectItem.f199955e;
            boolean z12 = list.size() > 10;
            this.f200151u.getClass();
            SelectItem.Option option = selectItem.f199956f;
            List listSingletonList = option != null ? Collections.singletonList(option) : null;
            LandingInternalAction.OpenSelectorDialog openSelectorDialog = new LandingInternalAction.OpenSelectorDialog(new Arguments(false, selectItem.f199952b, null, list, listSingletonList == null ? C42784z0.f406748b : listSingletonList, "", null, z12, false, false, false, false, false, false, false, null, false, null, null, null, null, false, false, false, false, false, false, false, null, null, null, false, false, null, false, z12, false, 0, null, null, -134257851, 247, null));
            this.f200147q = 1;
            if (interfaceC43172j.emit(openSelectorDialog, this) == coroutine_suspended) {
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
