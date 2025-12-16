package nP;

import Y61.k;
import Y61.l;
import com.avito.android.job.crm_candidates_public.generated.api.api_put_applicant_note.JobApplicationApiBadgesV3;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiPutApplicantNoteResponse.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b.\u0010*R\u001a\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"LnP/d;", "", "LnP/e;", "applicant", "", "Lcom/avito/android/job/crm_candidates_public/generated/api/api_put_applicant_note/JobApplicationApiBadgesV3;", "badges", "LnP/b;", "buttons", "LnP/g;", "chatbotResult", "", "created", "LnP/h;", "enrichment", "", "id", "", "isViewed", "price", "LnP/f;", "vacancy", "<init>", "(LnP/e;Ljava/util/List;Ljava/util/List;LnP/g;JLnP/h;Ljava/lang/String;ZLjava/lang/String;LnP/f;)V", "LnP/e;", "a", "()LnP/e;", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "LnP/g;", "d", "()LnP/g;", "J", "e", "()J", "LnP/h;", "f", "()LnP/h;", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Z", "j", "()Z", "h", "LnP/f;", "i", "()LnP/f;", "_avito_job_crm-candidates_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nP.d, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C44308d {

    @com.google.gson.annotations.c("applicant")
    @k
    private final C44309e applicant;

    @com.google.gson.annotations.c("badges")
    @l
    private final List<JobApplicationApiBadgesV3> badges;

    @com.google.gson.annotations.c("buttons")
    @l
    private final List<C44306b> buttons;

    @com.google.gson.annotations.c("chatbotResult")
    @l
    private final C44311g chatbotResult;

    @com.google.gson.annotations.c("created")
    private final long created;

    @com.google.gson.annotations.c("enrichment")
    @l
    private final C44312h enrichment;

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
    private final C44310f vacancy;

    public C44308d(@k C44309e c44309e, @l List<JobApplicationApiBadgesV3> list, @l List<C44306b> list2, @l C44311g c44311g, long j12, @l C44312h c44312h, @k String str, boolean z12, @l String str2, @k C44310f c44310f) {
        this.applicant = c44309e;
        this.badges = list;
        this.buttons = list2;
        this.chatbotResult = c44311g;
        this.created = j12;
        this.enrichment = c44312h;
        this.id = str;
        this.isViewed = z12;
        this.price = str2;
        this.vacancy = c44310f;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C44309e getApplicant() {
        return this.applicant;
    }

    @l
    public final List<JobApplicationApiBadgesV3> b() {
        return this.badges;
    }

    @l
    public final List<C44306b> c() {
        return this.buttons;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final C44311g getChatbotResult() {
        return this.chatbotResult;
    }

    /* renamed from: e, reason: from getter */
    public final long getCreated() {
        return this.created;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final C44312h getEnrichment() {
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
    public final C44310f getVacancy() {
        return this.vacancy;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getIsViewed() {
        return this.isViewed;
    }
}
