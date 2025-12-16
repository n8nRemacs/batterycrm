package PO;

import com.avito.android.job.apply_only_with_cv_impl.generated.api.applies_create_v_3.EnrichmentField2;
import com.avito.android.publish.drafts.LocalPublishState;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AppliesCreateV3Response.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LPO/e;", "", "", "Lcom/avito/android/job/apply_only_with_cv_impl/generated/api/applies_create_v_3/EnrichmentField2;", LocalPublishState.FIELDS, "LPO/f;", "status", "", "vacancyId", "<init>", "(Ljava/util/List;LPO/f;J)V", "Ljava/util/List;", "getFields", "()Ljava/util/List;", "LPO/f;", "getStatus", "()LPO/f;", "J", "getVacancyId", "()J", "_avito_job_apply-only-with-cv_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e {

    @com.google.gson.annotations.c(LocalPublishState.FIELDS)
    @Y61.k
    private final List<EnrichmentField2> fields;

    @com.google.gson.annotations.c("status")
    @Y61.k
    private final f status;

    @com.google.gson.annotations.c("vacancyId")
    private final long vacancyId;

    public e(@Y61.k List<EnrichmentField2> list, @Y61.k f fVar, long j12) {
        this.fields = list;
        this.status = fVar;
        this.vacancyId = j12;
    }
}
