package ei0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2NdTrxLotsSearchGetResponse.kt */
@P
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b0\b\u0007\u0018\u00002\u00020\u0001BÛ\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b+\u0010*R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b,\u0010*R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b-\u0010*R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b.\u0010*R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b/\u0010*R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u00102R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b9\u0010*R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b:\u0010*R\u001a\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010=R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010>\u001a\u0004\b?\u0010@R\u001a\u0010\u0017\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010\u0018\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010;\u001a\u0004\bD\u0010=R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010>\u001a\u0004\bE\u0010@R\u001a\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\bF\u0010*R\u001a\u0010\u001d\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\bM\u0010*R\u001a\u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\bN\u0010*R\u001a\u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\bO\u0010*R\u001a\u0010#\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010(\u001a\u0004\bP\u0010*R\u001a\u0010%\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010Q\u001a\u0004\bR\u0010S¨\u0006T"}, d2 = {"Lei0/c;", "", "", "agentCommissionFullValue", "balconyType", "bathroomType", "building", "commissionPercent", "commissionValue", "Lei0/d;", "completionQuarter", "Lei0/f;", "developer", "Lei0/k;", "development", "finishing", "floor", "", "id", "", "Lcom/avito/android/remote/model/Image;", "images", "", "isBestAgentCommission", SearchParamsConverterKt.LOCATION_ID, "Lei0/h;", MetroParameter.TYPE, "number", "Lei0/e;", "price", "Lei0/b;", "priceTooltip", "squareAll", "squareKitchen", "squareLiving", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lei0/d;Lei0/f;Lei0/k;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;ZJLjava/util/List;Ljava/lang/String;Lei0/e;Lei0/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "c", "d", "getCommissionPercent", "e", "Lei0/d;", "f", "()Lei0/d;", "Lei0/f;", "getDeveloper", "()Lei0/f;", "Lei0/k;", "g", "()Lei0/k;", "h", "i", "J", "j", "()J", "Ljava/util/List;", "k", "()Ljava/util/List;", "Z", "p", "()Z", "getLocationId", "getMetro", "l", "Lei0/e;", "m", "()Lei0/e;", "Lei0/b;", "getPriceTooltip", "()Lei0/b;", "n", "getSquareKitchen", "getSquareLiving", "o", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c {

    @com.google.gson.annotations.c("agentCommissionFullValue")
    @l
    private final String agentCommissionFullValue;

    @com.google.gson.annotations.c("balconyType")
    @Y61.k
    private final String balconyType;

    @com.google.gson.annotations.c("bathroomType")
    @Y61.k
    private final String bathroomType;

    @com.google.gson.annotations.c("building")
    @Y61.k
    private final String building;

    @com.google.gson.annotations.c("commissionPercent")
    @l
    private final String commissionPercent;

    @com.google.gson.annotations.c("commissionValue")
    @l
    private final String commissionValue;

    @com.google.gson.annotations.c("completionQuarter")
    @Y61.k
    private final d completionQuarter;

    @com.google.gson.annotations.c("developer")
    @Y61.k
    private final f developer;

    @com.google.gson.annotations.c("development")
    @Y61.k
    private final k development;

    @com.google.gson.annotations.c("finishing")
    @Y61.k
    private final String finishing;

    @com.google.gson.annotations.c("floor")
    @Y61.k
    private final String floor;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("images")
    @Y61.k
    private final List<Image> images;

    @com.google.gson.annotations.c("isBestAgentCommission")
    private final boolean isBestAgentCommission;

    @com.google.gson.annotations.c(SearchParamsConverterKt.LOCATION_ID)
    private final long locationId;

    @com.google.gson.annotations.c(MetroParameter.TYPE)
    @Y61.k
    private final List<h> metro;

    @com.google.gson.annotations.c("number")
    @Y61.k
    private final String number;

    @com.google.gson.annotations.c("price")
    @Y61.k
    private final e price;

    @com.google.gson.annotations.c("priceTooltip")
    @l
    private final C40111b priceTooltip;

    @com.google.gson.annotations.c("squareAll")
    @Y61.k
    private final String squareAll;

    @com.google.gson.annotations.c("squareKitchen")
    @Y61.k
    private final String squareKitchen;

    @com.google.gson.annotations.c("squareLiving")
    @Y61.k
    private final String squareLiving;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @Y61.k
    private final DeepLink uri;

    public c(@l String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @l String str5, @l String str6, @Y61.k d dVar, @Y61.k f fVar, @Y61.k k kVar, @Y61.k String str7, @Y61.k String str8, long j12, @Y61.k List<Image> list, boolean z12, long j13, @Y61.k List<h> list2, @Y61.k String str9, @Y61.k e eVar, @l C40111b c40111b, @Y61.k String str10, @Y61.k String str11, @Y61.k String str12, @Y61.k String str13, @Y61.k DeepLink deepLink) {
        this.agentCommissionFullValue = str;
        this.balconyType = str2;
        this.bathroomType = str3;
        this.building = str4;
        this.commissionPercent = str5;
        this.commissionValue = str6;
        this.completionQuarter = dVar;
        this.developer = fVar;
        this.development = kVar;
        this.finishing = str7;
        this.floor = str8;
        this.id = j12;
        this.images = list;
        this.isBestAgentCommission = z12;
        this.locationId = j13;
        this.metro = list2;
        this.number = str9;
        this.price = eVar;
        this.priceTooltip = c40111b;
        this.squareAll = str10;
        this.squareKitchen = str11;
        this.squareLiving = str12;
        this.title = str13;
        this.uri = deepLink;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getAgentCommissionFullValue() {
        return this.agentCommissionFullValue;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final String getBalconyType() {
        return this.balconyType;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getBathroomType() {
        return this.bathroomType;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getBuilding() {
        return this.building;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getCommissionValue() {
        return this.commissionValue;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final d getCompletionQuarter() {
        return this.completionQuarter;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final k getDevelopment() {
        return this.development;
    }

    @Y61.k
    /* renamed from: h, reason: from getter */
    public final String getFinishing() {
        return this.finishing;
    }

    @Y61.k
    /* renamed from: i, reason: from getter */
    public final String getFloor() {
        return this.floor;
    }

    /* renamed from: j, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Y61.k
    public final List<Image> k() {
        return this.images;
    }

    @Y61.k
    /* renamed from: l, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    @Y61.k
    /* renamed from: m, reason: from getter */
    public final e getPrice() {
        return this.price;
    }

    @Y61.k
    /* renamed from: n, reason: from getter */
    public final String getSquareAll() {
        return this.squareAll;
    }

    @Y61.k
    /* renamed from: o, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getIsBestAgentCommission() {
        return this.isBestAgentCommission;
    }
}
