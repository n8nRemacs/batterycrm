package We;

import com.avito.android.remote.model.category_parameters.slot.delivery_subsidies.DeliverySubsidiesSlotKt;
import kotlin.Metadata;

/* compiled from: GetMessengerByItemIdForApiv3Response.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"LWe/j;", "", "", DeliverySubsidiesSlotKt.AMOUNT, "", "error", "header", "title", "<init>", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "D", "getAmount", "()D", "Ljava/lang/String;", "getError", "()Ljava/lang/String;", "getHeader", "getTitle", "_avito_auto-reseller-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j {

    @com.google.gson.annotations.c(DeliverySubsidiesSlotKt.AMOUNT)
    private final double amount;

    @com.google.gson.annotations.c("error")
    @Y61.l
    private final String error;

    @com.google.gson.annotations.c("header")
    @Y61.k
    private final String header;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public j(double d12, @Y61.l String str, @Y61.k String str2, @Y61.k String str3) {
        this.amount = d12;
        this.error = str;
        this.header = str2;
        this.title = str3;
    }
}
