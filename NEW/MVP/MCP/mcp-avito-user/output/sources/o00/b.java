package o00;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;

/* compiled from: Api1MortgageFormApplicationByApplicationIdUpsertRealtyObjectPostRequest.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0007\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lo00/b;", "", "", AddressParameter.TYPE, "", "cost", "", "isAvitoItem", "itemUrl", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)V", "Ljava/lang/String;", "getAddress", "()Ljava/lang/String;", "Ljava/lang/Long;", "getCost", "()Ljava/lang/Long;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getItemUrl", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b {

    @com.google.gson.annotations.c(AddressParameter.TYPE)
    @l
    private final String address;

    @com.google.gson.annotations.c("cost")
    @l
    private final Long cost;

    @com.google.gson.annotations.c("isAvitoItem")
    @l
    private final Boolean isAvitoItem;

    @com.google.gson.annotations.c("itemUrl")
    @l
    private final String itemUrl;

    public b(@l String str, @l Long l12, @l Boolean bool, @l String str2) {
        this.address = str;
        this.cost = l12;
        this.isAvitoItem = bool;
        this.itemUrl = str2;
    }
}
