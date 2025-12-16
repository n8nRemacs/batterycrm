package dx;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.DistrictParameter;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api2NdTrxDevelopmentsSearchGetResponse.kt */
@P
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\b\u0007\u0018\u00002\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0012\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b'\u0010&R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b.\u0010&R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b5\u0010&R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b6\u0010&R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b7\u0010&R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\b9\u0010:R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b;\u0010*R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\u001a\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u00108\u001a\u0004\bB\u0010:R\u001a\u0010\u001b\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00108\u001a\u0004\bC\u0010:R\"\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\bD\u0010*R\u001a\u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\bE\u0010&R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\bF\u0010&R\u001a\u0010!\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010G\u001a\u0004\bH\u0010I¨\u0006J"}, d2 = {"Ldx/c;", "", "", AddressParameter.TYPE, "agentCommission", "", "", "bound", "Ldx/b;", "commissionTooltip", "commissionValue", "Ldx/d;", "completionQuarter", "Ldx/e;", "developer", DistrictParameter.TYPE, "features", "finishing", "", "id", "Lcom/avito/android/remote/model/Image;", "images", "", "isBestAgentCommission", "Ldx/f;", "location", SearchParamsConverterKt.LOCATION_ID, "lotsCount", "Ldx/g;", MetroParameter.TYPE, "name", "priceRange", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ldx/b;Ljava/lang/String;Ldx/d;Ldx/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;Ljava/lang/Boolean;Ldx/f;JJLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getBound", "()Ljava/util/List;", "Ldx/b;", "c", "()Ldx/b;", "d", "Ldx/d;", "e", "()Ldx/d;", "Ldx/e;", "f", "()Ldx/e;", "getDistrict", "getFeatures", "getFinishing", "J", "g", "()J", "h", "Ljava/lang/Boolean;", "l", "()Ljava/lang/Boolean;", "Ldx/f;", "getLocation", "()Ldx/f;", "getLocationId", "getLotsCount", "i", "j", "k", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dx.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C39815c {

    @com.google.gson.annotations.c(AddressParameter.TYPE)
    @k
    private final String address;

    @com.google.gson.annotations.c("agentCommission")
    @k
    private final String agentCommission;

    @com.google.gson.annotations.c("bound")
    @k
    private final List<List<Double>> bound;

    @com.google.gson.annotations.c("commissionTooltip")
    @l
    private final C39814b commissionTooltip;

    @com.google.gson.annotations.c("commissionValue")
    @l
    private final String commissionValue;

    @com.google.gson.annotations.c("completionQuarter")
    @k
    private final C39816d completionQuarter;

    @com.google.gson.annotations.c("developer")
    @k
    private final C39817e developer;

    @com.google.gson.annotations.c(DistrictParameter.TYPE)
    @k
    private final String district;

    @com.google.gson.annotations.c("features")
    @k
    private final String features;

    @com.google.gson.annotations.c("finishing")
    @k
    private final String finishing;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("images")
    @k
    private final List<Image> images;

    @com.google.gson.annotations.c("isBestAgentCommission")
    @l
    private final Boolean isBestAgentCommission;

    @com.google.gson.annotations.c("location")
    @k
    private final C39818f location;

    @com.google.gson.annotations.c(SearchParamsConverterKt.LOCATION_ID)
    private final long locationId;

    @com.google.gson.annotations.c("lotsCount")
    private final long lotsCount;

    @com.google.gson.annotations.c(MetroParameter.TYPE)
    @l
    private final List<C39819g> metro;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c("priceRange")
    @k
    private final String priceRange;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink uri;

    /* JADX WARN: Multi-variable type inference failed */
    public C39815c(@k String str, @k String str2, @k List<? extends List<Double>> list, @l C39814b c39814b, @l String str3, @k C39816d c39816d, @k C39817e c39817e, @k String str4, @k String str5, @k String str6, long j12, @k List<Image> list2, @l Boolean bool, @k C39818f c39818f, long j13, long j14, @l List<C39819g> list3, @k String str7, @k String str8, @k DeepLink deepLink) {
        this.address = str;
        this.agentCommission = str2;
        this.bound = list;
        this.commissionTooltip = c39814b;
        this.commissionValue = str3;
        this.completionQuarter = c39816d;
        this.developer = c39817e;
        this.district = str4;
        this.features = str5;
        this.finishing = str6;
        this.id = j12;
        this.images = list2;
        this.isBestAgentCommission = bool;
        this.location = c39818f;
        this.locationId = j13;
        this.lotsCount = j14;
        this.metro = list3;
        this.name = str7;
        this.priceRange = str8;
        this.uri = deepLink;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getAgentCommission() {
        return this.agentCommission;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C39814b getCommissionTooltip() {
        return this.commissionTooltip;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getCommissionValue() {
        return this.commissionValue;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final C39816d getCompletionQuarter() {
        return this.completionQuarter;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final C39817e getDeveloper() {
        return this.developer;
    }

    /* renamed from: g, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @k
    public final List<Image> h() {
        return this.images;
    }

    @l
    public final List<C39819g> i() {
        return this.metro;
    }

    @k
    /* renamed from: j, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    /* renamed from: k, reason: from getter */
    public final String getPriceRange() {
        return this.priceRange;
    }

    @l
    /* renamed from: l, reason: from getter */
    public final Boolean getIsBestAgentCommission() {
        return this.isBestAgentCommission;
    }
}
