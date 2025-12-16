package uP;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiGetFavoritesResponse.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b(\u0018\u00002\u00020\u0001B¯\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u001a\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b%\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b&\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b'\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b+\u0010 R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b2\u00101R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b3\u0010 R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b4\u0010 R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b5\u0010\u001dR\u001a\u0010\u0017\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010/\u001a\u0004\b6\u00101R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b7\u0010 ¨\u00068"}, d2 = {"LuP/a;", "", "Lcom/avito/android/deep_linking/links/DeepLink;", "buyURI", "", "avatar", "", "LuP/j;", "badges", "chatURI", "cvId", "cvURI", "description", "LuP/f;", "geoReference", RequestReviewResultKt.INFO_TYPE, "", "isActive", "isCompared", "isFavorite", "managerName", "name", "phoneURI", "purchased", "subtitle", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;LuP/f;Ljava/lang/String;Ljava/lang/Boolean;ZZLjava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;ZLjava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "d", "e", "f", "g", "LuP/f;", "getGeoReference", "()LuP/f;", "h", "Ljava/lang/Boolean;", "n", "()Ljava/lang/Boolean;", "Z", "o", "()Z", "p", "i", "j", "k", "l", "m", "_avito_job_crm-paid-cvs_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uP.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C48926a {

    @com.google.gson.annotations.c("avatar")
    @Y61.l
    private final String avatar;

    @com.google.gson.annotations.c("badges")
    @Y61.l
    private final List<j> badges;

    @com.google.gson.annotations.c("BuyURI")
    @Y61.l
    private final DeepLink buyURI;

    @com.google.gson.annotations.c("chatURI")
    @Y61.l
    private final DeepLink chatURI;

    @com.google.gson.annotations.c("cvId")
    @Y61.k
    private final String cvId;

    @com.google.gson.annotations.c("cvURI")
    @Y61.l
    private final DeepLink cvURI;

    @com.google.gson.annotations.c("description")
    @Y61.l
    private final String description;

    @com.google.gson.annotations.c("geoReference")
    @Y61.l
    private final f geoReference;

    @com.google.gson.annotations.c(RequestReviewResultKt.INFO_TYPE)
    @Y61.l
    private final String info;

    @com.google.gson.annotations.c("isActive")
    @Y61.l
    private final Boolean isActive;

    @com.google.gson.annotations.c("isCompared")
    private final boolean isCompared;

    @com.google.gson.annotations.c("isFavorite")
    private final boolean isFavorite;

    @com.google.gson.annotations.c("managerName")
    @Y61.l
    private final String managerName;

    @com.google.gson.annotations.c("name")
    @Y61.l
    private final String name;

    @com.google.gson.annotations.c("phoneURI")
    @Y61.l
    private final DeepLink phoneURI;

    @com.google.gson.annotations.c("purchased")
    private final boolean purchased;

    @com.google.gson.annotations.c("subtitle")
    @Y61.l
    private final String subtitle;

    public C48926a(@Y61.l DeepLink deepLink, @Y61.l String str, @Y61.l List<j> list, @Y61.l DeepLink deepLink2, @Y61.k String str2, @Y61.l DeepLink deepLink3, @Y61.l String str3, @Y61.l f fVar, @Y61.l String str4, @Y61.l Boolean bool, boolean z12, boolean z13, @Y61.l String str5, @Y61.l String str6, @Y61.l DeepLink deepLink4, boolean z14, @Y61.l String str7) {
        this.buyURI = deepLink;
        this.avatar = str;
        this.badges = list;
        this.chatURI = deepLink2;
        this.cvId = str2;
        this.cvURI = deepLink3;
        this.description = str3;
        this.geoReference = fVar;
        this.info = str4;
        this.isActive = bool;
        this.isCompared = z12;
        this.isFavorite = z13;
        this.managerName = str5;
        this.name = str6;
        this.phoneURI = deepLink4;
        this.purchased = z14;
        this.subtitle = str7;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    @Y61.l
    public final List<j> b() {
        return this.badges;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final DeepLink getBuyURI() {
        return this.buyURI;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final DeepLink getChatURI() {
        return this.chatURI;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final String getCvId() {
        return this.cvId;
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final DeepLink getCvURI() {
        return this.cvURI;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    @Y61.l
    /* renamed from: i, reason: from getter */
    public final String getManagerName() {
        return this.managerName;
    }

    @Y61.l
    /* renamed from: j, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Y61.l
    /* renamed from: k, reason: from getter */
    public final DeepLink getPhoneURI() {
        return this.phoneURI;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getPurchased() {
        return this.purchased;
    }

    @Y61.l
    /* renamed from: m, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Y61.l
    /* renamed from: n, reason: from getter */
    public final Boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getIsCompared() {
        return this.isCompared;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }
}
