package com.avito.android.bottom_sheet_group.bottomsheetgroup;

import Y41.p;
import bk.InterfaceC25669a;
import com.avito.android.bottom_sheet_group.items.multiselect_item.BottomSheetMultiselectItem;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BottomSheetGroupViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bottom_sheet_group/items/multiselect_item/BottomSheetMultiselectItem;", "item", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/bottom_sheet_group/items/multiselect_item/BottomSheetMultiselectItem;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bottom_sheet_group.bottomsheetgroup.BottomSheetGroupViewModel$2", f = "BottomSheetGroupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class h extends SuspendLambda implements p<BottomSheetMultiselectItem, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f107226q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f107227r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f107227r = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f107227r, continuation);
        hVar.f107226q = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(BottomSheetMultiselectItem bottomSheetMultiselectItem, Continuation<? super G0> continuation) {
        return ((h) create(bottomSheetMultiselectItem, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        BottomSheetMultiselectItem bottomSheetMultiselectItem = (BottomSheetMultiselectItem) this.f107226q;
        this.f107227r.accept(new InterfaceC25669a.b(bottomSheetMultiselectItem.f107356b, bottomSheetMultiselectItem.f107361g));
        return G0.f406611a;
    }
}
