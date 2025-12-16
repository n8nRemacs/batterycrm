package uF0;

import Y61.k;
import Y61.l;
import com.avito.android.beduin_models.BeduinForm;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Api1TravelSearchFavoritesItemsPostResponse.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b*\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\u000f\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b3\u0010,R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b4\u0010,R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b6\u00107R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\b<\u0010=R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00105\u001a\u0004\b>\u00107R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00105\u001a\u0004\b?\u00107R\u001a\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u00105\u001a\u0004\b@\u00107R\u001a\u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010A\u001a\u0004\bB\u0010C¨\u0006D"}, d2 = {"LuF0/f;", "", "", "", "analyticParams", "", "categoryId", "Lcom/avito/android/beduin_models/BeduinForm;", "freeForm", "", "LuF0/c;", "galleryItems", "", "hasRealtyLayout", "id", "isFavorite", "isStrRedesign", "isUnavailable", "layoutDirection", "LuF0/g;", "price", "LuF0/h;", "sellerInfo", "size", "subTitle", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/util/Map;Ljava/lang/Long;Lcom/avito/android/beduin_models/BeduinForm;Ljava/util/List;Ljava/lang/Boolean;JZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;LuF0/g;LuF0/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "Lcom/avito/android/beduin_models/BeduinForm;", "c", "()Lcom/avito/android/beduin_models/BeduinForm;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "J", "f", "()J", "Z", "l", "()Z", "m", "n", "Ljava/lang/String;", "getLayoutDirection", "()Ljava/lang/String;", "LuF0/g;", "g", "()LuF0/g;", "LuF0/h;", "h", "()LuF0/h;", "i", "getSubTitle", "j", "Lcom/avito/android/deep_linking/links/DeepLink;", "k", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    @com.google.gson.annotations.c("analyticParams")
    @l
    private final Map<String, String> analyticParams;

    @com.google.gson.annotations.c("categoryId")
    @l
    private final Long categoryId;

    @com.google.gson.annotations.c("freeForm")
    @k
    private final BeduinForm freeForm;

    @com.google.gson.annotations.c("galleryItems")
    @k
    private final List<InterfaceC48892c> galleryItems;

    @com.google.gson.annotations.c("hasRealtyLayout")
    @l
    private final Boolean hasRealtyLayout;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("isFavorite")
    private final boolean isFavorite;

    @com.google.gson.annotations.c("isStrRedesign")
    @l
    private final Boolean isStrRedesign;

    @com.google.gson.annotations.c("isUnavailable")
    @l
    private final Boolean isUnavailable;

    @com.google.gson.annotations.c("layoutDirection")
    @l
    private final String layoutDirection;

    @com.google.gson.annotations.c("price")
    @l
    private final g price;

    @com.google.gson.annotations.c("sellerInfo")
    @l
    private final h sellerInfo;

    @com.google.gson.annotations.c("size")
    @l
    private final String size;

    @com.google.gson.annotations.c("subTitle")
    @l
    private final String subTitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink uri;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@l Map<String, String> map, @l Long l12, @k BeduinForm beduinForm, @k List<? extends InterfaceC48892c> list, @l Boolean bool, long j12, boolean z12, @l Boolean bool2, @l Boolean bool3, @l String str, @l g gVar, @l h hVar, @l String str2, @l String str3, @k String str4, @k DeepLink deepLink) {
        this.analyticParams = map;
        this.categoryId = l12;
        this.freeForm = beduinForm;
        this.galleryItems = list;
        this.hasRealtyLayout = bool;
        this.id = j12;
        this.isFavorite = z12;
        this.isStrRedesign = bool2;
        this.isUnavailable = bool3;
        this.layoutDirection = str;
        this.price = gVar;
        this.sellerInfo = hVar;
        this.size = str2;
        this.subTitle = str3;
        this.title = str4;
        this.uri = deepLink;
    }

    @l
    public final Map<String, String> a() {
        return this.analyticParams;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Long getCategoryId() {
        return this.categoryId;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final BeduinForm getFreeForm() {
        return this.freeForm;
    }

    @k
    public final List<InterfaceC48892c> d() {
        return this.galleryItems;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Boolean getHasRealtyLayout() {
        return this.hasRealtyLayout;
    }

    /* renamed from: f, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final g getPrice() {
        return this.price;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final h getSellerInfo() {
        return this.sellerInfo;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    @k
    /* renamed from: j, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: k, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @l
    /* renamed from: m, reason: from getter */
    public final Boolean getIsStrRedesign() {
        return this.isStrRedesign;
    }

    @l
    /* renamed from: n, reason: from getter */
    public final Boolean getIsUnavailable() {
        return this.isUnavailable;
    }
}
