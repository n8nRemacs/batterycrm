package eQ0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;

/* compiled from: V2JobSeekerCvsResponse.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b\r\u0010*R\u001a\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b+\u0010\"R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b2\u00101R\u001a\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b3\u0010\"R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b7\u0010\u001fR\u001a\u0010\u0017\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010 \u001a\u0004\b8\u0010\"¨\u00069"}, d2 = {"LeQ0/c;", "", "LeQ0/j;", AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR, "Lcom/avito/android/deep_linking/links/DeepLink;", "editUri", "", "editUrl", "", "id", "Lcom/avito/android/remote/model/Image;", "image", "", "isModerated", "salary", "LeQ0/d;", "stats", "LeQ0/e;", "status", "subStatus", "title", "updatedTime", TooltipAttribute.PARAM_DEEP_LINK, ContextActionHandler.Link.URL, "<init>", "(LeQ0/j;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;JLcom/avito/android/remote/model/Image;Ljava/lang/Boolean;Ljava/lang/String;LeQ0/d;LeQ0/e;LeQ0/e;Ljava/lang/String;Ljava/lang/Long;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "LeQ0/j;", "a", "()LeQ0/j;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "getEditUrl", "()Ljava/lang/String;", "J", "c", "()J", "Lcom/avito/android/remote/model/Image;", "d", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "e", "LeQ0/d;", "f", "()LeQ0/d;", "LeQ0/e;", "g", "()LeQ0/e;", "h", "i", "Ljava/lang/Long;", "j", "()Ljava/lang/Long;", "k", "getUrl", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c {

    @com.google.gson.annotations.c(AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR)
    @Y61.l
    private final j badgeBar;

    @com.google.gson.annotations.c("editUri")
    @Y61.l
    private final DeepLink editUri;

    @com.google.gson.annotations.c("editUrl")
    @Y61.l
    private final String editUrl;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("image")
    @Y61.l
    private final Image image;

    @com.google.gson.annotations.c("isModerated")
    @Y61.l
    private final Boolean isModerated;

    @com.google.gson.annotations.c("salary")
    @Y61.k
    private final String salary;

    @com.google.gson.annotations.c("stats")
    @Y61.l
    private final d stats;

    @com.google.gson.annotations.c("status")
    @Y61.l
    private final e status;

    @com.google.gson.annotations.c("subStatus")
    @Y61.l
    private final e subStatus;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("updatedTime")
    @Y61.l
    private final Long updatedTime;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.k
    private final DeepLink uri;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @Y61.k
    private final String url;

    public c(@Y61.l j jVar, @Y61.l DeepLink deepLink, @Y61.l String str, long j12, @Y61.l Image image, @Y61.l Boolean bool, @Y61.k String str2, @Y61.l d dVar, @Y61.l e eVar, @Y61.l e eVar2, @Y61.k String str3, @Y61.l Long l12, @Y61.k DeepLink deepLink2, @Y61.k String str4) {
        this.badgeBar = jVar;
        this.editUri = deepLink;
        this.editUrl = str;
        this.id = j12;
        this.image = image;
        this.isModerated = bool;
        this.salary = str2;
        this.stats = dVar;
        this.status = eVar;
        this.subStatus = eVar2;
        this.title = str3;
        this.updatedTime = l12;
        this.uri = deepLink2;
        this.url = str4;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final j getBadgeBar() {
        return this.badgeBar;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final DeepLink getEditUri() {
        return this.editUri;
    }

    /* renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getSalary() {
        return this.salary;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final d getStats() {
        return this.stats;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final e getStatus() {
        return this.status;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final e getSubStatus() {
        return this.subStatus;
    }

    @Y61.k
    /* renamed from: i, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: j, reason: from getter */
    public final Long getUpdatedTime() {
        return this.updatedTime;
    }

    @Y61.k
    /* renamed from: k, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }
}
