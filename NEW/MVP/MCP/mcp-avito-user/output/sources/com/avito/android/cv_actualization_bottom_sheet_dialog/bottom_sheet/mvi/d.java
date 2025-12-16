package com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi;

import Y41.p;
import com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.entity.JsxActualizationBottomSheetInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import yt.AbstractC50297a;
import yt.C50299c;

/* compiled from: JsxActualizationBottomSheetActor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyt/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/cv_actualization_bottom_sheet_dialog/bottom_sheet/mvi/entity/JsxActualizationBottomSheetInternalAction;", "<anonymous>", "(Lyt/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cv_actualization_bottom_sheet_dialog.bottom_sheet.mvi.JsxActualizationBottomSheetActor$process$1", f = "JsxActualizationBottomSheetActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class d extends SuspendLambda implements p<AbstractC50297a, Continuation<? super InterfaceC43160i<? extends JsxActualizationBottomSheetInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f131508q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f131509r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C50299c> f131510s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Y41.a<C50299c> aVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f131509r = eVar;
        this.f131510s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f131509r, this.f131510s, continuation);
        dVar.f131508q = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(AbstractC50297a abstractC50297a, Continuation<? super InterfaceC43160i<? extends JsxActualizationBottomSheetInternalAction>> continuation) {
        return ((d) create(abstractC50297a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return this.f131509r.b((AbstractC50297a) this.f131508q, this.f131510s.invoke());
    }
}
