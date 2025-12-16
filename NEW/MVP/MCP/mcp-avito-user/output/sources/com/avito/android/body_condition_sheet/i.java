package com.avito.android.body_condition_sheet;

import Nj.InterfaceC14580a;
import android.view.View;
import com.avito.android.deep_linking.links.PointWithPosition;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BodyConditionSheetActivity.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Landroid/view/View;", "Lcom/avito/android/deep_linking/links/PointWithPosition;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "<anonymous>", "(Lkotlin/Q;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.body_condition_sheet.BodyConditionSheetActivity$observeViewsClicks$4", f = "BodyConditionSheetActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class i extends SuspendLambda implements Y41.p<Q<? extends View, ? extends PointWithPosition>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f106880q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ BodyConditionSheetActivity f106881r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(BodyConditionSheetActivity bodyConditionSheetActivity, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f106881r = bodyConditionSheetActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f106881r, continuation);
        iVar.f106880q = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends View, ? extends PointWithPosition> q12, Continuation<? super G0> continuation) {
        return ((i) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f106880q;
        View view = (View) q12.f406619b;
        PointWithPosition pointWithPosition = (PointWithPosition) q12.f406620c;
        BodyConditionSheetActivity bodyConditionSheetActivity = this.f106881r;
        bodyConditionSheetActivity.f106835o = view;
        bodyConditionSheetActivity.a2().accept(new InterfaceC14580a.d(pointWithPosition));
        return G0.f406611a;
    }
}
