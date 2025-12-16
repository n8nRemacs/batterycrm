package JO0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import com.avito.android.wallet.history.mvi.remote.dto.WalletHistoryItemStatus;
import com.avito.android.wallet.history.mvi.remote.dto.WalletHistoryItemType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WalletHistoryResponse.kt */
@P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0013\u001a\u0004\b!\u0010\u0015R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"LJO0/b;", "", "", "id", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/wallet/history/mvi/remote/dto/WalletHistoryItemType;", "type", "text", "date", "Lcom/avito/android/wallet/history/mvi/remote/dto/WalletHistoryItemStatus;", "status", DeliverySubsidiesSlotKt.AMOUNT, "LJO0/a;", "events", "Lcom/avito/android/deep_linking/links/DeepLink;", "detailsDeeplink", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/wallet/history/mvi/remote/dto/WalletHistoryItemType;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/wallet/history/mvi/remote/dto/WalletHistoryItemStatus;Ljava/lang/String;LJO0/a;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/UniversalImage;", "f", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/wallet/history/mvi/remote/dto/WalletHistoryItemType;", "i", "()Lcom/avito/android/wallet/history/mvi/remote/dto/WalletHistoryItemType;", "h", "b", "Lcom/avito/android/wallet/history/mvi/remote/dto/WalletHistoryItemStatus;", "g", "()Lcom/avito/android/wallet/history/mvi/remote/dto/WalletHistoryItemStatus;", "a", "LJO0/a;", "d", "()LJO0/a;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_wallet-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b {

    @com.google.gson.annotations.c(DeliverySubsidiesSlotKt.AMOUNT)
    @l
    private final String amount;

    @com.google.gson.annotations.c("date")
    @l
    private final String date;

    @com.google.gson.annotations.c("details_deeplink")
    @l
    private final DeepLink detailsDeeplink;

    @com.google.gson.annotations.c("events")
    @l
    private final a events;

    @com.google.gson.annotations.c("id")
    @l
    private final String id;

    @com.google.gson.annotations.c("image")
    @l
    private final UniversalImage image;

    @com.google.gson.annotations.c("status")
    @l
    private final WalletHistoryItemStatus status;

    @com.google.gson.annotations.c("text")
    @l
    private final String text;

    @com.google.gson.annotations.c("type")
    @l
    private final WalletHistoryItemType type;

    public b(@l String str, @l UniversalImage universalImage, @l WalletHistoryItemType walletHistoryItemType, @l String str2, @l String str3, @l WalletHistoryItemStatus walletHistoryItemStatus, @l String str4, @l a aVar, @l DeepLink deepLink) {
        this.id = str;
        this.image = universalImage;
        this.type = walletHistoryItemType;
        this.text = str2;
        this.date = str3;
        this.status = walletHistoryItemStatus;
        this.amount = str4;
        this.events = aVar;
        this.detailsDeeplink = deepLink;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final DeepLink getDetailsDeeplink() {
        return this.detailsDeeplink;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final a getEvents() {
        return this.events;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.id, bVar.id) && L.f(this.image, bVar.image) && this.type == bVar.type && L.f(this.text, bVar.text) && L.f(this.date, bVar.date) && this.status == bVar.status && L.f(this.amount, bVar.amount) && L.f(this.events, bVar.events) && L.f(this.detailsDeeplink, bVar.detailsDeeplink);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final WalletHistoryItemStatus getStatus() {
        return this.status;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode2 = (iHashCode + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        WalletHistoryItemType walletHistoryItemType = this.type;
        int iHashCode3 = (iHashCode2 + (walletHistoryItemType == null ? 0 : walletHistoryItemType.hashCode())) * 31;
        String str2 = this.text;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.date;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        WalletHistoryItemStatus walletHistoryItemStatus = this.status;
        int iHashCode6 = (iHashCode5 + (walletHistoryItemStatus == null ? 0 : walletHistoryItemStatus.hashCode())) * 31;
        String str4 = this.amount;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        a aVar = this.events;
        int iHashCode8 = (iHashCode7 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        DeepLink deepLink = this.detailsDeeplink;
        return iHashCode8 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @l
    /* renamed from: i, reason: from getter */
    public final WalletHistoryItemType getType() {
        return this.type;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WalletHistoryItemModel(id=");
        sb2.append(this.id);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", date=");
        sb2.append(this.date);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", amount=");
        sb2.append(this.amount);
        sb2.append(", events=");
        sb2.append(this.events);
        sb2.append(", detailsDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.detailsDeeplink, ')');
    }
}
