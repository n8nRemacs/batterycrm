package com.avito.android.publish.slots.delivery_summary_edit;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.single.C42021t;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeliverySummaryEditSlotWrapper.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f243774l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar) {
        super(0);
        this.f243774l = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        final f fVar = this.f243774l;
        io.reactivex.rxjava3.internal.observers.m mVar = fVar.f243767l;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        C42021t c42021tM = fVar.m();
        l41.g gVar = new l41.g() { // from class: com.avito.android.publish.slots.delivery_summary_edit.l
            @Override // l41.g
            public final void accept(Object obj) {
                f.l(fVar, (TypedResult) obj);
            }
        };
        final V2 v22 = V2.f318762a;
        fVar.f243767l = (io.reactivex.rxjava3.internal.observers.m) c42021tM.x(gVar, new l41.g() { // from class: com.avito.android.publish.slots.delivery_summary_edit.m
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        });
        return G0.f406611a;
    }
}
