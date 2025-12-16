package rY;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InfoItem.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LrY/c;", "", "", "count", "price", "roomType", "roomsNumberId", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "d", "e", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_master-plan_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rY.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C47616c {

    @com.google.gson.annotations.c("count")
    @l
    private final String count;

    @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("price")
    @l
    private final String price;

    @com.google.gson.annotations.c("roomType")
    @k
    private final String roomType;

    @com.google.gson.annotations.c("roomsNumberId")
    @k
    private final String roomsNumberId;

    public C47616c(@l String str, @l String str2, @k String str3, @k String str4, @k DeepLink deepLink) {
        this.count = str;
        this.price = str2;
        this.roomType = str3;
        this.roomsNumberId = str4;
        this.deeplink = deepLink;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getCount() {
        return this.count;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getRoomType() {
        return this.roomType;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getRoomsNumberId() {
        return this.roomsNumberId;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47616c)) {
            return false;
        }
        C47616c c47616c = (C47616c) obj;
        return L.f(this.count, c47616c.count) && L.f(this.price, c47616c.price) && L.f(this.roomType, c47616c.roomType) && L.f(this.roomsNumberId, c47616c.roomsNumberId) && L.f(this.deeplink, c47616c.deeplink);
    }

    public final int hashCode() {
        String str = this.count;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.price;
        return this.deeplink.hashCode() + H.d(H.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.roomType), 31, this.roomsNumberId);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InfoItem(count=");
        sb2.append(this.count);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", roomType=");
        sb2.append(this.roomType);
        sb2.append(", roomsNumberId=");
        sb2.append(this.roomsNumberId);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.deeplink, ')');
    }
}
