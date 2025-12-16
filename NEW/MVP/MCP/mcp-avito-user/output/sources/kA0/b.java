package KA0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ApiEditSellerAddressRequest.kt */
@P
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BO\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"LKA0/b;", "", "", "LKA0/c;", "details", "", "hideAddressDetails", "", "selectedTypes", "", "sellerAddressId", "sellersName", "verticalId", "LKA0/d;", "workingHours", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;JLjava/lang/String;JLKA0/d;)V", "Ljava/util/List;", "getDetails", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getHideAddressDetails", "()Ljava/lang/Boolean;", "getSelectedTypes", "J", "getSellerAddressId", "()J", "Ljava/lang/String;", "getSellersName", "()Ljava/lang/String;", "getVerticalId", "LKA0/d;", "getWorkingHours", "()LKA0/d;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b {

    @com.google.gson.annotations.c("details")
    @l
    private final List<c> details;

    @com.google.gson.annotations.c("hideAddressDetails")
    @l
    private final Boolean hideAddressDetails;

    @com.google.gson.annotations.c("selectedTypes")
    @k
    private final List<String> selectedTypes;

    @com.google.gson.annotations.c("sellerAddressId")
    private final long sellerAddressId;

    @com.google.gson.annotations.c("sellersName")
    @k
    private final String sellersName;

    @com.google.gson.annotations.c("verticalId")
    private final long verticalId;

    @com.google.gson.annotations.c("workingHours")
    @k
    private final d workingHours;

    public b(@l List<c> list, @l Boolean bool, @k List<String> list2, long j12, @k String str, long j13, @k d dVar) {
        this.details = list;
        this.hideAddressDetails = bool;
        this.selectedTypes = list2;
        this.sellerAddressId = j12;
        this.sellersName = str;
        this.verticalId = j13;
        this.workingHours = dVar;
    }
}
