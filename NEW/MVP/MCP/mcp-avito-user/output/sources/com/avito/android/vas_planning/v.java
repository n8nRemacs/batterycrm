package com.avito.android.vas_planning;

import com.avito.android.vas_planning.model.VasPlanningItem;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: VasPlanningViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/vas_planning/model/VasPlanningItem$VasPlanningDateTime;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class v extends N implements Y41.l<VasPlanningItem.VasPlanningDateTime, VasPlanningItem.VasPlanningDateTime> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Date f322547l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.h<VasPlanningItem.VasPlanningDateTime> f322548m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Date date, l0.h<VasPlanningItem.VasPlanningDateTime> hVar) {
        super(1);
        this.f322547l = date;
        this.f322548m = hVar;
    }

    /* JADX WARN: Type inference failed for: r7v10, types: [T, com.avito.android.vas_planning.model.VasPlanningItem$VasPlanningDateTime] */
    @Override // Y41.l
    public final VasPlanningItem.VasPlanningDateTime invoke(VasPlanningItem.VasPlanningDateTime vasPlanningDateTime) {
        VasPlanningItem.VasPlanningDateTime vasPlanningDateTime2 = vasPlanningDateTime;
        long time = this.f322547l.getTime();
        org.threeten.bp.d dVar = org.threeten.bp.d.f421934d;
        org.threeten.bp.d dVarO = org.threeten.bp.d.o(w81.d.e(1000, time) * 1000000, w81.d.c(time, 1000L));
        org.threeten.bp.o oVarR = org.threeten.bp.o.r();
        dVarO.getClass();
        int i12 = org.threeten.bp.s.f422114e;
        w81.d.f(oVarR, "zone");
        ?? L12 = VasPlanningItem.VasPlanningDateTime.L(vasPlanningDateTime2, org.threeten.bp.s.B(dVarO.f421935b, dVarO.f421936c, oVarR).f422115b.f421948b, null, false, false, 59);
        this.f322548m.f406842b = L12;
        return L12;
    }
}
