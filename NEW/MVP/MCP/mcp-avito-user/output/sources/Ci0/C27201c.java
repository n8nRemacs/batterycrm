package ci0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Api1NdTrxBuildingsByBuildingIdSectionsBySectionIdCheckerboardSearchGetResponse.kt */
@P
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b*\u0010)¨\u0006+"}, d2 = {"Lci0/c;", "", "", "isActive", "isFiltered", "", "lotId", "Lcom/avito/android/remote/model/Image;", "lotImage", "Lci0/d;", "price", "", "", "properties", "Lci0/e;", "revenue", "roomType", "square", "<init>", "(ZZLjava/lang/Long;Lcom/avito/android/remote/model/Image;Lci0/d;Ljava/util/List;Lci0/e;Ljava/lang/String;Ljava/lang/String;)V", "Z", "h", "()Z", "i", "Ljava/lang/Long;", "a", "()Ljava/lang/Long;", "Lcom/avito/android/remote/model/Image;", "b", "()Lcom/avito/android/remote/model/Image;", "Lci0/d;", "c", "()Lci0/d;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lci0/e;", "e", "()Lci0/e;", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "g", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ci0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C27201c {

    @com.google.gson.annotations.c("isActive")
    private final boolean isActive;

    @com.google.gson.annotations.c("isFiltered")
    private final boolean isFiltered;

    @com.google.gson.annotations.c("lotId")
    @l
    private final Long lotId;

    @com.google.gson.annotations.c("lotImage")
    @k
    private final Image lotImage;

    @com.google.gson.annotations.c("price")
    @k
    private final C27202d price;

    @com.google.gson.annotations.c("properties")
    @k
    private final List<String> properties;

    @com.google.gson.annotations.c("revenue")
    @k
    private final e revenue;

    @com.google.gson.annotations.c("roomType")
    @k
    private final String roomType;

    @com.google.gson.annotations.c("square")
    @l
    private final String square;

    public C27201c(boolean z12, boolean z13, @l Long l12, @k Image image, @k C27202d c27202d, @k List<String> list, @k e eVar, @k String str, @l String str2) {
        this.isActive = z12;
        this.isFiltered = z13;
        this.lotId = l12;
        this.lotImage = image;
        this.price = c27202d;
        this.properties = list;
        this.revenue = eVar;
        this.roomType = str;
        this.square = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Long getLotId() {
        return this.lotId;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Image getLotImage() {
        return this.lotImage;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final C27202d getPrice() {
        return this.price;
    }

    @k
    public final List<String> d() {
        return this.properties;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final e getRevenue() {
        return this.revenue;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getRoomType() {
        return this.roomType;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final String getSquare() {
        return this.square;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsFiltered() {
        return this.isFiltered;
    }
}
