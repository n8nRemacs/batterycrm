package mP;

import Y61.k;
import com.avito.android.job.crm_candidates_public.generated.api.api_job_applications_list_v_3.JobApplicationChatbotResultV3EnrichedPropertiesItem;
import com.avito.android.job.crm_candidates_public.generated.api.api_job_applications_list_v_3.JobApplicationChatbotResultV3Overview;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiJobApplicationsListV3Response.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"LmP/g;", "", "", "description", "", "Lcom/avito/android/job/crm_candidates_public/generated/api/api_job_applications_list_v_3/JobApplicationChatbotResultV3EnrichedPropertiesItem;", "enrichedProperties", "Lcom/avito/android/job/crm_candidates_public/generated/api/api_job_applications_list_v_3/JobApplicationChatbotResultV3Overview;", "overview", "title", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/job/crm_candidates_public/generated/api/api_job_applications_list_v_3/JobApplicationChatbotResultV3Overview;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/avito/android/job/crm_candidates_public/generated/api/api_job_applications_list_v_3/JobApplicationChatbotResultV3Overview;", "c", "()Lcom/avito/android/job/crm_candidates_public/generated/api/api_job_applications_list_v_3/JobApplicationChatbotResultV3Overview;", "d", "_avito_job_crm-candidates_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mP.g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C43995g {

    @com.google.gson.annotations.c("description")
    @k
    private final String description;

    @com.google.gson.annotations.c("enrichedProperties")
    @k
    private final List<JobApplicationChatbotResultV3EnrichedPropertiesItem> enrichedProperties;

    @com.google.gson.annotations.c("overview")
    @k
    private final JobApplicationChatbotResultV3Overview overview;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C43995g(@k String str, @k List<JobApplicationChatbotResultV3EnrichedPropertiesItem> list, @k JobApplicationChatbotResultV3Overview jobApplicationChatbotResultV3Overview, @k String str2) {
        this.description = str;
        this.enrichedProperties = list;
        this.overview = jobApplicationChatbotResultV3Overview;
        this.title = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    public final List<JobApplicationChatbotResultV3EnrichedPropertiesItem> b() {
        return this.enrichedProperties;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final JobApplicationChatbotResultV3Overview getOverview() {
        return this.overview;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
