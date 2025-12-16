package wP;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.job.crm_paid_cvs_public.generated.api.api_paid_cv_get_cvs.ApiPaidCvItemStatus;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiPaidCvGetCvsResponse.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b$\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b)\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b*\u0010\u001dR\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b.\u0010-R\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010+\u001a\u0004\b/\u0010-R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001b\u001a\u0004\b0\u0010\u001dR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b1\u0010\u001dR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010!\u001a\u0004\b2\u0010#R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b6\u0010\u001d¨\u00067"}, d2 = {"LwP/b;", "", "", "avatar", "", "LwP/i;", "badges", "Lcom/avito/android/deep_linking/links/DeepLink;", "chatURI", "cvURI", "description", "LwP/e;", "geoReference", "id", RequestReviewResultKt.INFO_TYPE, "", "isActive", "isCompared", "isFavorite", "name", "note", "phoneURI", "Lcom/avito/android/job/crm_paid_cvs_public/generated/api/api_paid_cv_get_cvs/ApiPaidCvItemStatus;", "status", "subtitle", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;LwP/e;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/job/crm_paid_cvs_public/generated/api/api_paid_cv_get_cvs/ApiPaidCvItemStatus;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "d", "e", "LwP/e;", "getGeoReference", "()LwP/e;", "f", "g", "Z", "m", "()Z", "n", "o", "h", "i", "j", "Lcom/avito/android/job/crm_paid_cvs_public/generated/api/api_paid_cv_get_cvs/ApiPaidCvItemStatus;", "k", "()Lcom/avito/android/job/crm_paid_cvs_public/generated/api/api_paid_cv_get_cvs/ApiPaidCvItemStatus;", "l", "_avito_job_crm-paid-cvs_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wP.b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C49547b {

    @com.google.gson.annotations.c("avatar")
    @Y61.l
    private final String avatar;

    @com.google.gson.annotations.c("badges")
    @Y61.l
    private final List<i> badges;

    @com.google.gson.annotations.c("chatURI")
    @Y61.l
    private final DeepLink chatURI;

    @com.google.gson.annotations.c("cvURI")
    @Y61.l
    private final DeepLink cvURI;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final String description;

    @com.google.gson.annotations.c("geoReference")
    @Y61.l
    private final e geoReference;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c(RequestReviewResultKt.INFO_TYPE)
    @Y61.l
    private final String info;

    @com.google.gson.annotations.c("isActive")
    private final boolean isActive;

    @com.google.gson.annotations.c("isCompared")
    private final boolean isCompared;

    @com.google.gson.annotations.c("isFavorite")
    private final boolean isFavorite;

    @com.google.gson.annotations.c("name")
    @Y61.l
    private final String name;

    @com.google.gson.annotations.c("note")
    @Y61.l
    private final String note;

    @com.google.gson.annotations.c("phoneURI")
    @Y61.l
    private final DeepLink phoneURI;

    @com.google.gson.annotations.c("status")
    @Y61.l
    private final ApiPaidCvItemStatus status;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final String subtitle;

    public C49547b(@Y61.l String str, @Y61.l List<i> list, @Y61.l DeepLink deepLink, @Y61.l DeepLink deepLink2, @Y61.l String str2, @Y61.l e eVar, @Y61.k String str3, @Y61.l String str4, boolean z12, boolean z13, boolean z14, @Y61.l String str5, @Y61.l String str6, @Y61.l DeepLink deepLink3, @Y61.l ApiPaidCvItemStatus apiPaidCvItemStatus, @Y61.l String str7) {
        this.avatar = str;
        this.badges = list;
        this.chatURI = deepLink;
        this.cvURI = deepLink2;
        this.description = str2;
        this.geoReference = eVar;
        this.id = str3;
        this.info = str4;
        this.isActive = z12;
        this.isCompared = z13;
        this.isFavorite = z14;
        this.name = str5;
        this.note = str6;
        this.phoneURI = deepLink3;
        this.status = apiPaidCvItemStatus;
        this.subtitle = str7;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @Y61.l
    public final List<i> b() {
        return this.badges;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final DeepLink getChatURI() {
        return this.chatURI;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final DeepLink getCvURI() {
        return this.cvURI;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    @Y61.l
    /* renamed from: j, reason: from getter */
    public final DeepLink getPhoneURI() {
        return this.phoneURI;
    }

    @Y61.l
    /* renamed from: k, reason: from getter */
    public final ApiPaidCvItemStatus getStatus() {
        return this.status;
    }

    @Y61.l
    /* renamed from: l, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getIsCompared() {
        return this.isCompared;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }
}
