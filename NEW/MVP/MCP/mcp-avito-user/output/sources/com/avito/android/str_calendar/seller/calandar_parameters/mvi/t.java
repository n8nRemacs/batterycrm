package com.avito.android.str_calendar.seller.calandar_parameters.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.ParametersTree;
import com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StrCalendarParametersReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/t;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/str_calendar/seller/calandar_parameters/mvi/entity/StrCalendarParametersInternalAction;", "LGy0/e;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class t implements com.avito.android.arch.mvi.u<StrCalendarParametersInternalAction, Gy0.e> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final k f287448b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final v f287449c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calandar_parameters.domain.children.g f287450d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.d f287451e;

    @Inject
    public t(@Y61.k k kVar, @Y61.k v vVar, @Y61.k com.avito.android.str_calendar.seller.calandar_parameters.domain.children.g gVar, @Y61.k com.avito.android.str_calendar.seller.calandar_parameters.domain.discounts.d dVar) {
        this.f287448b = kVar;
        this.f287449c = vVar;
        this.f287450d = gVar;
        this.f287451e = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0340  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v16, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v21, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v26, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v31, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r10v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v46 */
    /* JADX WARN: Type inference failed for: r10v47 */
    /* JADX WARN: Type inference failed for: r10v48 */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v5, types: [kotlin.collections.z0] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v42, types: [com.avito.android.remote.model.category_parameters.base.ParameterSlot] */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v45, types: [com.avito.android.remote.model.category_parameters.StrDurationDiscountsParameter] */
    /* JADX WARN: Type inference failed for: r3v54, types: [com.avito.android.remote.model.category_parameters.base.ParameterSlot] */
    /* JADX WARN: Type inference failed for: r3v55, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v57, types: [com.avito.android.remote.model.category_parameters.ChildrenAgesGroup] */
    /* JADX WARN: Type inference failed for: r4v10, types: [com.avito.android.remote.model.category_parameters.SelectParameter$Flat] */
    /* JADX WARN: Type inference failed for: r4v34, types: [com.avito.android.remote.model.category_parameters.base.ParameterSlot] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v37, types: [com.avito.android.remote.model.category_parameters.StrDurationDiscountsParameter] */
    /* JADX WARN: Type inference failed for: r4v49, types: [com.avito.android.remote.model.category_parameters.base.ParameterSlot] */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.avito.android.remote.model.category_parameters.base.ParameterSlot] */
    /* JADX WARN: Type inference failed for: r4v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v52, types: [com.avito.android.remote.model.category_parameters.ChildrenAgesGroup] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.avito.android.remote.model.category_parameters.base.ParameterSlot] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17, types: [com.avito.android.remote.model.category_parameters.StrEarlyBookingDiscountParameter] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.avito.android.str_calendar.seller.calandar_parameters.mvi.k] */
    /* JADX WARN: Type inference failed for: r9v23, types: [com.avito.android.remote.model.category_parameters.base.ParameterSlot] */
    /* JADX WARN: Type inference failed for: r9v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v39, types: [com.avito.android.remote.model.category_parameters.StrEarlyBookingDiscountParameter] */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Gy0.e a(com.avito.android.str_calendar.seller.calandar_parameters.mvi.entity.StrCalendarParametersInternalAction r48, Gy0.e r49) {
        /*
            Method dump skipped, instructions count: 2110
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.calandar_parameters.mvi.t.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final Gy0.e b(Gy0.e eVar, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(eVar.f6878e);
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            if (L.f((String) key, str)) {
                it.remove();
            }
        }
        ParametersTree parametersTree = eVar.f6876c;
        k kVar = this.f287448b;
        Gy0.e eVarA = Gy0.e.a(eVar, null, kVar.f(kVar.c(parametersTree, str, str2), linkedHashMap), null, linkedHashMap, null, null, null, false, false, null, null, null, null, false, false, null, null, null, 1048437);
        v vVar = this.f287449c;
        return vVar.a(vVar.b(eVarA));
    }
}
