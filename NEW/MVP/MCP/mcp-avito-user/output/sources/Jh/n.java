package jh;

import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import kotlin.Metadata;

/* compiled from: BbipForecastResult.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ljh/n;", "", "", "value", "totalPrice", "totalBudget", "Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "contact", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "b", "Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "a", "()Lcom/avito/android/mnz_common/data/MnzFloatingFooterContact;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class n {

    @com.google.gson.annotations.c("bblContacts")
    @Y61.l
    private final MnzFloatingFooterContact contact;

    @com.google.gson.annotations.c("totalBudgetFormatted")
    @Y61.l
    private final String totalBudget;

    @com.google.gson.annotations.c("totalPriceFormatted")
    @Y61.k
    private final String totalPrice;

    @com.google.gson.annotations.c("value")
    @Y61.k
    private final String value;

    static {
        Parcelable.Creator<MnzFloatingFooterContact> creator = MnzFloatingFooterContact.CREATOR;
    }

    public n(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l MnzFloatingFooterContact mnzFloatingFooterContact) {
        this.value = str;
        this.totalPrice = str2;
        this.totalBudget = str3;
        this.contact = mnzFloatingFooterContact;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final MnzFloatingFooterContact getContact() {
        return this.contact;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getTotalBudget() {
        return this.totalBudget;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getTotalPrice() {
        return this.totalPrice;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
