package jK0;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiViewedEnrichResponse.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b$\u0018\u00002\u00020\u0001B}\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b(\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b/\u0010.R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b0\u0010\u001bR\u001a\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b1\u0010!R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b2\u0010\u001bR\u001a\u0010\u0016\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b3\u0010!¨\u00064"}, d2 = {"LjK0/e;", "", "", AddressParameter.TYPE, "", "LjK0/c;", "buttons", "", "categoryId", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "LjK0/f;", "geoReferences", "id", "Lcom/avito/android/remote/model/Image;", "images", "", "isActive", "isFavorite", "price", "timestamp", "title", "viewedAt", "<init>", "(Ljava/lang/String;Ljava/util/List;JLcom/avito/android/deep_linking/links/DeepLink;LjK0/f;Ljava/lang/String;Lcom/avito/android/remote/model/Image;ZZLjava/lang/String;JLjava/lang/String;J)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "J", "c", "()J", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "LjK0/f;", "e", "()LjK0/f;", "f", "Lcom/avito/android/remote/model/Image;", "g", "()Lcom/avito/android/remote/model/Image;", "Z", "l", "()Z", "m", "h", "i", "j", "k", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jK0.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C42275e {

    @com.google.gson.annotations.c(AddressParameter.TYPE)
    @l
    private final String address;

    @com.google.gson.annotations.c("buttons")
    @l
    private final List<C42273c> buttons;

    @com.google.gson.annotations.c("categoryId")
    private final long categoryId;

    @com.google.gson.annotations.c(Constants.DEEPLINK)
    @k
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("geoReferences")
    @l
    private final C42276f geoReferences;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("images")
    @k
    private final Image images;

    @com.google.gson.annotations.c("isActive")
    private final boolean isActive;

    @com.google.gson.annotations.c("isFavorite")
    private final boolean isFavorite;

    @com.google.gson.annotations.c("price")
    @l
    private final String price;

    @com.google.gson.annotations.c("timestamp")
    private final long timestamp;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("viewedAt")
    private final long viewedAt;

    public C42275e(@l String str, @l List<C42273c> list, long j12, @k DeepLink deepLink, @l C42276f c42276f, @k String str2, @k Image image, boolean z12, boolean z13, @l String str3, long j13, @k String str4, long j14) {
        this.address = str;
        this.buttons = list;
        this.categoryId = j12;
        this.deeplink = deepLink;
        this.geoReferences = c42276f;
        this.id = str2;
        this.images = image;
        this.isActive = z12;
        this.isFavorite = z13;
        this.price = str3;
        this.timestamp = j13;
        this.title = str4;
        this.viewedAt = j14;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @l
    public final List<C42273c> b() {
        return this.buttons;
    }

    /* renamed from: c, reason: from getter */
    public final long getCategoryId() {
        return this.categoryId;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final C42276f getGeoReferences() {
        return this.geoReferences;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final Image getImages() {
        return this.images;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    /* renamed from: i, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @k
    /* renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: k, reason: from getter */
    public final long getViewedAt() {
        return this.viewedAt;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }
}
