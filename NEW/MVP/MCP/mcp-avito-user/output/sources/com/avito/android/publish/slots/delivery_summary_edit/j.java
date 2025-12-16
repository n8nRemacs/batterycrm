package com.avito.android.publish.slots.delivery_summary_edit;

import com.avito.android.category_parameters.f;
import com.avito.android.remote.model.category_parameters.slot.SlotType;
import kotlin.Metadata;

/* compiled from: DeliverySummaryEditSlotWrapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class j<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f243822b;

    public j(f fVar) {
        this.f243822b = fVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        f fVar = this.f243822b;
        fVar.f243765j = true;
        fVar.f243769n.accept(new f.b(SlotType.DELIVERY_SUMMARY_EDIT, null));
    }
}
