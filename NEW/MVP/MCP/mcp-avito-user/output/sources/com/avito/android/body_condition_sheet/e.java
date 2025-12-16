package com.avito.android.body_condition_sheet;

import com.avito.android.deep_linking.links.BodyConditionPoint;
import com.avito.android.deep_linking.links.PointWithPosition;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BodyConditionSheetActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PointWithPosition f106867l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PointWithPosition pointWithPosition) {
        super(1);
        this.f106867l = pointWithPosition;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
        com.avito.android.lib.design.tooltip.o oVar2 = oVar;
        PointWithPosition pointWithPosition = this.f106867l;
        if (pointWithPosition instanceof BodyConditionPoint) {
            StringBuilder sb2 = new StringBuilder();
            BodyConditionPoint bodyConditionPoint = (BodyConditionPoint) pointWithPosition;
            sb2.append(bodyConditionPoint.getParamsTitle());
            sb2.append(":\n");
            sb2.append(bodyConditionPoint.getParamsValue());
            oVar2.b(sb2.toString());
        }
        return G0.f406611a;
    }
}
