package eQ0;

import com.avito.android.work_profile.generated.api.v_2__job_seeker_cvs.JobSeekerCVsListItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: V2JobSeekerCvsResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LeQ0/l;", "", "LeQ0/b;", "action", "", "Lcom/avito/android/work_profile/generated/api/v_2__job_seeker_cvs/JobSeekerCVsListItem;", "list", "", "title", "<init>", "(LeQ0/b;Ljava/util/List;Ljava/lang/String;)V", "LeQ0/b;", "a", "()LeQ0/b;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l {

    @com.google.gson.annotations.c("action")
    @Y61.k
    private final b action;

    @com.google.gson.annotations.c("list")
    @Y61.k
    private final List<JobSeekerCVsListItem> list;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public l(@Y61.k b bVar, @Y61.k List<JobSeekerCVsListItem> list, @Y61.k String str) {
        this.action = bVar;
        this.list = list;
        this.title = str;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final b getAction() {
        return this.action;
    }

    @Y61.k
    public final List<JobSeekerCVsListItem> b() {
        return this.list;
    }
}
