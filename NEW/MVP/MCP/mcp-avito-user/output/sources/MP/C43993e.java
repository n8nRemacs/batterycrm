package mP;

import Y61.k;
import Y61.l;
import com.avito.android.job.crm_candidates_public.generated.api.api_job_applications_list_v_3.JobApplicationApiBadgesV3;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiJobApplicationsListV3Response.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b\"\u0010!R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b,\u0010\u001eR\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b0\u0010\u001eR\u001a\u0010\u0016\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"LmP/e;", "", "LmP/d;", "applicant", "", "applyId", "", "Lcom/avito/android/job/crm_candidates_public/generated/api/api_job_applications_list_v_3/JobApplicationApiBadgesV3;", "badges", "LmP/a;", "buttons", "LmP/g;", "chatbotResult", "", "created", "LmP/h;", "enrichment", "id", "", "isViewed", "price", "LmP/f;", "vacancy", "<init>", "(LmP/d;Ljava/lang/String;Ljava/util/List;Ljava/util/List;LmP/g;JLmP/h;Ljava/lang/String;ZLjava/lang/String;LmP/f;)V", "LmP/d;", "a", "()LmP/d;", "Ljava/lang/String;", "getApplyId", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "LmP/g;", "d", "()LmP/g;", "J", "e", "()J", "LmP/h;", "f", "()LmP/h;", "g", "Z", "j", "()Z", "h", "LmP/f;", "i", "()LmP/f;", "_avito_job_crm-candidates_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mP.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C43993e {

    @com.google.gson.annotations.c("applicant")
    @k
    private final C43992d applicant;

    @com.google.gson.annotations.c("apply_id")
    @l
    private final String applyId;

    @com.google.gson.annotations.c("badges")
    @l
    private final List<JobApplicationApiBadgesV3> badges;

    @com.google.gson.annotations.c("buttons")
    @l
    private final List<C43989a> buttons;

    @com.google.gson.annotations.c("chatbotResult")
    @l
    private final C43995g chatbotResult;

    @com.google.gson.annotations.c("created")
    private final long created;

    @com.google.gson.annotations.c("enrichment")
    @l
    private final C43996h enrichment;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("isViewed")
    private final boolean isViewed;

    @com.google.gson.annotations.c("price")
    @l
    private final String price;

    @com.google.gson.annotations.c("vacancy")
    @k
    private final C43994f vacancy;

    public C43993e(@k C43992d c43992d, @l String str, @l List<JobApplicationApiBadgesV3> list, @l List<C43989a> list2, @l C43995g c43995g, long j12, @l C43996h c43996h, @k String str2, boolean z12, @l String str3, @k C43994f c43994f) {
        this.applicant = c43992d;
        this.applyId = str;
        this.badges = list;
        this.buttons = list2;
        this.chatbotResult = c43995g;
        this.created = j12;
        this.enrichment = c43996h;
        this.id = str2;
        this.isViewed = z12;
        this.price = str3;
        this.vacancy = c43994f;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C43992d getApplicant() {
        return this.applicant;
    }

    @l
    public final List<JobApplicationApiBadgesV3> b() {
        return this.badges;
    }

    @l
    public final List<C43989a> c() {
        return this.buttons;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final C43995g getChatbotResult() {
        return this.chatbotResult;
    }

    /* renamed from: e, reason: from getter */
    public final long getCreated() {
        return this.created;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final C43996h getEnrichment() {
        return this.enrichment;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @k
    /* renamed from: i, reason: from getter */
    public final C43994f getVacancy() {
        return this.vacancy;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsViewed() {
        return this.isViewed;
    }
}
