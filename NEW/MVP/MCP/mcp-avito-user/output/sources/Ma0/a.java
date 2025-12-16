package MA0;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiEditSellerAddressInfoV2Response.kt */
@P
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0007\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b*\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\b4\u00100R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b5\u0010 R\u001a\u0010\u0018\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"LMA0/a;", "", "LMA0/e;", "addressComponents", "", "LMA0/b;", "details", "LMA0/i;", "hideAddressDetails", "Lcom/avito/android/remote/model/text/AttributedText;", "legal", "", SearchParamsConverterKt.LOCATION_ID, "maxSelectedTypes", "LMA0/f;", "required", "", "sellersName", "LMA0/g;", "standardWorkingHours", "title", "LMA0/d;", "types", "LMA0/h;", "workingHours", "<init>", "(LMA0/e;Ljava/util/List;LMA0/i;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Long;Ljava/lang/Long;LMA0/f;Ljava/lang/String;LMA0/g;Ljava/lang/String;Ljava/util/List;LMA0/h;)V", "LMA0/e;", "a", "()LMA0/e;", "Ljava/util/List;", "b", "()Ljava/util/List;", "LMA0/i;", "c", "()LMA0/i;", "Lcom/avito/android/remote/model/text/AttributedText;", "getLegal", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "getMaxSelectedTypes", "LMA0/f;", "e", "()LMA0/f;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "LMA0/g;", "g", "()LMA0/g;", "getTitle", "h", "LMA0/h;", "i", "()LMA0/h;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    @com.google.gson.annotations.c("addressComponents")
    @Y61.k
    private final e addressComponents;

    @com.google.gson.annotations.c("details")
    @l
    private final List<b> details;

    @com.google.gson.annotations.c("hideAddressDetails")
    @l
    private final i hideAddressDetails;

    @com.google.gson.annotations.c("legal")
    @l
    private final AttributedText legal;

    @com.google.gson.annotations.c(SearchParamsConverterKt.LOCATION_ID)
    @l
    private final Long locationId;

    @com.google.gson.annotations.c("maxSelectedTypes")
    @l
    private final Long maxSelectedTypes;

    @com.google.gson.annotations.c("required")
    @l
    private final f required;

    @com.google.gson.annotations.c("sellersName")
    @l
    private final String sellersName;

    @com.google.gson.annotations.c("standardWorkingHours")
    @Y61.k
    private final g standardWorkingHours;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("types")
    @Y61.k
    private final List<d> types;

    @com.google.gson.annotations.c("workingHours")
    @Y61.k
    private final h workingHours;

    public a(@Y61.k e eVar, @l List<b> list, @l i iVar, @l AttributedText attributedText, @l Long l12, @l Long l13, @l f fVar, @l String str, @Y61.k g gVar, @Y61.k String str2, @Y61.k List<d> list2, @Y61.k h hVar) {
        this.addressComponents = eVar;
        this.details = list;
        this.hideAddressDetails = iVar;
        this.legal = attributedText;
        this.locationId = l12;
        this.maxSelectedTypes = l13;
        this.required = fVar;
        this.sellersName = str;
        this.standardWorkingHours = gVar;
        this.title = str2;
        this.types = list2;
        this.workingHours = hVar;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final e getAddressComponents() {
        return this.addressComponents;
    }

    @l
    public final List<b> b() {
        return this.details;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final i getHideAddressDetails() {
        return this.hideAddressDetails;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Long getLocationId() {
        return this.locationId;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final f getRequired() {
        return this.required;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getSellersName() {
        return this.sellersName;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final g getStandardWorkingHours() {
        return this.standardWorkingHours;
    }

    @Y61.k
    public final List<d> h() {
        return this.types;
    }

    @Y61.k
    /* renamed from: i, reason: from getter */
    public final h getWorkingHours() {
        return this.workingHours;
    }
}
