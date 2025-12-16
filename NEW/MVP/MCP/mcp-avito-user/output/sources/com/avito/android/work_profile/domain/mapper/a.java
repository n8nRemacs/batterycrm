package com.avito.android.work_profile.domain.mapper;

import Y61.k;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35787f0;
import com.avito.android.work_profile.generated.api.get_profile_applies_to_vacancy_v_2.ProfileAppliesToVacancyResultListItem;
import dQ0.C39616a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GetProfileAppliesToVacancyV2ResponseMapper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/domain/mapper/a;", "", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final x f330657a;

    /* compiled from: GetProfileAppliesToVacancyV2ResponseMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.work_profile.domain.mapper.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C10264a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f330658a;

        static {
            int[] iArr = new int[ProfileAppliesToVacancyResultListItem.Type.values().length];
            try {
                iArr[ProfileAppliesToVacancyResultListItem.Type.ApplyToVacancy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f330658a = iArr;
        }
    }

    @Inject
    public a(@k x xVar) {
        this.f330657a = xVar;
    }

    public static UniversalColor a(C39616a c39616a) {
        Integer numA;
        String valueName = c39616a.getValueName();
        String valueDark = c39616a.getValueDark();
        Color color = (valueDark == null || (numA = C35787f0.a(valueDark)) == null) ? null : new Color(numA.intValue());
        Integer numA2 = C35787f0.a(c39616a.getValue());
        return new UniversalColor(valueName, color, numA2 != null ? new Color(numA2.intValue()) : null);
    }
}
