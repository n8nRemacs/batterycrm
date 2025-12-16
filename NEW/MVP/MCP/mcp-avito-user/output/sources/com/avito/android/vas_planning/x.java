package com.avito.android.vas_planning;

import com.avito.android.vas_planning.model.VasPlanningItem;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VasPlanningViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/vas_planning/model/VasPlanningItem$VasPlanningDateTime;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class x extends N implements Y41.l<VasPlanningItem.VasPlanningDateTime, VasPlanningItem.VasPlanningDateTime> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ org.threeten.bp.g f322553l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(org.threeten.bp.g gVar) {
        super(1);
        this.f322553l = gVar;
    }

    @Override // Y41.l
    public final VasPlanningItem.VasPlanningDateTime invoke(VasPlanningItem.VasPlanningDateTime vasPlanningDateTime) {
        return VasPlanningItem.VasPlanningDateTime.L(vasPlanningDateTime, null, this.f322553l, false, false, 55);
    }
}
