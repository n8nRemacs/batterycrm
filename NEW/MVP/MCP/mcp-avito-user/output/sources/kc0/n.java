package KC0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CptInfoResult.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"LKC0/n;", "", "", "id", "name", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "totalAmount", "LKC0/p;", "sold", "commission", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;LKC0/p;LKC0/p;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getName", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "()Lcom/avito/android/remote/model/text/AttributedText;", "getTotalAmount", "LKC0/p;", "getSold", "()LKC0/p;", "getCommission", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class n {

    @com.google.gson.annotations.c("commission")
    @Y61.l
    private final p commission;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("name")
    @Y61.k
    private final String name;

    @com.google.gson.annotations.c("sold")
    @Y61.k
    private final p sold;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final AttributedText title;

    @com.google.gson.annotations.c("totalAmount")
    @Y61.k
    private final String totalAmount;

    public n(@Y61.k String str, @Y61.k String str2, @Y61.k AttributedText attributedText, @Y61.k String str3, @Y61.k p pVar, @Y61.l p pVar2) {
        this.id = str;
        this.name = str2;
        this.title = attributedText;
        this.totalAmount = str3;
        this.sold = pVar;
        this.commission = pVar2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return L.f(this.id, nVar.id) && L.f(this.name, nVar.name) && L.f(this.title, nVar.title) && L.f(this.totalAmount, nVar.totalAmount) && L.f(this.sold, nVar.sold) && L.f(this.commission, nVar.commission);
    }

    public final int hashCode() {
        int iHashCode = (this.sold.hashCode() + H.d(com.avito.android.actions_sheet.a.b(H.d(this.id.hashCode() * 31, 31, this.name), 31, this.title), 31, this.totalAmount)) * 31;
        p pVar = this.commission;
        return iHashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "MonthResultItem(id=" + this.id + ", name=" + this.name + ", title=" + this.title + ", totalAmount=" + this.totalAmount + ", sold=" + this.sold + ", commission=" + this.commission + ')';
    }
}
