package D20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;

/* compiled from: ApiBulkMessagingGetAnchorsResponse.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b \u0010\u0013R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LD20/d;", "", "", AddressParameter.TYPE, "", "id", "Lcom/avito/android/remote/model/Image;", "imgUrls", "minDelivery", "minDeliveryTime", "name", "price", "sellerName", "LD20/e;", "sellerReputation", "<init>", "(Ljava/lang/String;JLcom/avito/android/remote/model/Image;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LD20/e;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "J", "b", "()J", "Lcom/avito/android/remote/model/Image;", "c", "()Lcom/avito/android/remote/model/Image;", "Ljava/lang/Long;", "getMinDelivery", "()Ljava/lang/Long;", "d", "e", "f", "g", "LD20/e;", "h", "()LD20/e;", "_avito_multi-message-send_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d {

    @com.google.gson.annotations.c(AddressParameter.TYPE)
    @l
    private final String address;

    @com.google.gson.annotations.c("id")
    private final long id;

    @com.google.gson.annotations.c("imgUrls")
    @l
    private final Image imgUrls;

    @com.google.gson.annotations.c("minDelivery")
    @l
    private final Long minDelivery;

    @com.google.gson.annotations.c("minDeliveryTime")
    @l
    private final String minDeliveryTime;

    @com.google.gson.annotations.c("name")
    @k
    private final String name;

    @com.google.gson.annotations.c("price")
    @k
    private final String price;

    @com.google.gson.annotations.c("sellerName")
    @k
    private final String sellerName;

    @com.google.gson.annotations.c("sellerReputation")
    @l
    private final e sellerReputation;

    public d(@l String str, long j12, @l Image image, @l Long l12, @l String str2, @k String str3, @k String str4, @k String str5, @l e eVar) {
        this.address = str;
        this.id = j12;
        this.imgUrls = image;
        this.minDelivery = l12;
        this.minDeliveryTime = str2;
        this.name = str3;
        this.price = str4;
        this.sellerName = str5;
        this.sellerReputation = eVar;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Image getImgUrls() {
        return this.imgUrls;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getMinDeliveryTime() {
        return this.minDeliveryTime;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getSellerName() {
        return this.sellerName;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final e getSellerReputation() {
        return this.sellerReputation;
    }
}
