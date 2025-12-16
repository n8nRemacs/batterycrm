package dQ0;

import com.avito.android.work_profile.generated.api.get_profile_applies_to_vacancy_v_2.ProfileAppliesToVacancyResultListItem;
import com.my.tracker.ads.AdFormat;
import java.util.List;
import kotlin.Metadata;

/* compiled from: GetProfileAppliesToVacancyV2Response.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LdQ0/b;", "", "LdQ0/c;", AdFormat.BANNER, "", "Lcom/avito/android/work_profile/generated/api/get_profile_applies_to_vacancy_v_2/ProfileAppliesToVacancyResultListItem;", "list", "", "screenType", "<init>", "(LdQ0/c;Ljava/util/List;Ljava/lang/String;)V", "LdQ0/c;", "a", "()LdQ0/c;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "getScreenType", "()Ljava/lang/String;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    @com.google.gson.annotations.c(AdFormat.BANNER)
    @Y61.l
    private final c banner;

    @com.google.gson.annotations.c("list")
    @Y61.k
    private final List<ProfileAppliesToVacancyResultListItem> list;

    @com.google.gson.annotations.c("screenType")
    @Y61.l
    private final String screenType;

    public b(@Y61.l c cVar, @Y61.k List<ProfileAppliesToVacancyResultListItem> list, @Y61.l String str) {
        this.banner = cVar;
        this.list = list;
        this.screenType = str;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final c getBanner() {
        return this.banner;
    }

    @Y61.k
    public final List<ProfileAppliesToVacancyResultListItem> b() {
        return this.list;
    }
}
