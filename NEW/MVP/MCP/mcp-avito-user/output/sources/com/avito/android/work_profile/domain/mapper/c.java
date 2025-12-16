package com.avito.android.work_profile.domain.mapper;

import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.cv.CvStatsPeriod;
import com.avito.android.util.C35787f0;
import com.avito.android.work_profile.generated.api.v_2__job_seeker_cvs.JobSeekerCVsListItem;
import eQ0.C40039a;
import eQ0.k;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: V2JobSeekerCvsResponseMapper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_profile/domain/mapper/c;", "", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    /* compiled from: V2JobSeekerCvsResponseMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f330660a;

        static {
            int[] iArr = new int[JobSeekerCVsListItem.Type.values().length];
            try {
                iArr[JobSeekerCVsListItem.Type.f330690Cv.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f330660a = iArr;
        }
    }

    @Inject
    public c() {
    }

    public static CvStatsPeriod a(k kVar) {
        Long total = kVar.getTotal();
        Integer numValueOf = total != null ? Integer.valueOf((int) total.longValue()) : null;
        Long today = kVar.getToday();
        return new CvStatsPeriod(numValueOf, today != null ? Integer.valueOf((int) today.longValue()) : null);
    }

    public static UniversalColor b(C40039a c40039a) {
        Integer numA;
        String valueName = c40039a.getValueName();
        String valueDark = c40039a.getValueDark();
        Color color = (valueDark == null || (numA = C35787f0.a(valueDark)) == null) ? null : new Color(numA.intValue());
        Integer numA2 = C35787f0.a(c40039a.getValue());
        return new UniversalColor(valueName, color, numA2 != null ? new Color(numA2.intValue()) : null);
    }
}
