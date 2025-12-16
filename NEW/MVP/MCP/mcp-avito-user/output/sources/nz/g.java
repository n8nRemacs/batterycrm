package NZ;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalculationProgramsItem.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LNZ/g;", "", "", "label", "value", "description", "maxAmount", "LNZ/i;", "rate", "downPayment", "term", "alert", "Lcom/avito/android/remote/model/text/AttributedText;", "detailedDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNZ/i;LNZ/i;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "i", "b", "f", "LNZ/i;", "g", "()LNZ/i;", "d", "h", "a", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class g {

    @com.google.gson.annotations.c("alert")
    @l
    private final String alert;

    @com.google.gson.annotations.c("description")
    @k
    private final String description;

    @com.google.gson.annotations.c("detailedDescription")
    @l
    private final AttributedText detailedDescription;

    @com.google.gson.annotations.c("downPayment")
    @k
    private final i downPayment;

    @com.google.gson.annotations.c("label")
    @k
    private final String label;

    @com.google.gson.annotations.c("maxAmount")
    @k
    private final String maxAmount;

    @com.google.gson.annotations.c("rate")
    @k
    private final i rate;

    @com.google.gson.annotations.c("term")
    @k
    private final String term;

    @com.google.gson.annotations.c("value")
    @k
    private final String value;

    public g(@k String str, @k String str2, @k String str3, @k String str4, @k i iVar, @k i iVar2, @k String str5, @l String str6, @l AttributedText attributedText) {
        this.label = str;
        this.value = str2;
        this.description = str3;
        this.maxAmount = str4;
        this.rate = iVar;
        this.downPayment = iVar2;
        this.term = str5;
        this.alert = str6;
        this.detailedDescription = attributedText;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getAlert() {
        return this.alert;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getDetailedDescription() {
        return this.detailedDescription;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final i getDownPayment() {
        return this.downPayment;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.label, gVar.label) && L.f(this.value, gVar.value) && L.f(this.description, gVar.description) && L.f(this.maxAmount, gVar.maxAmount) && L.f(this.rate, gVar.rate) && L.f(this.downPayment, gVar.downPayment) && L.f(this.term, gVar.term) && L.f(this.alert, gVar.alert) && L.f(this.detailedDescription, gVar.detailedDescription);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getMaxAmount() {
        return this.maxAmount;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final i getRate() {
        return this.rate;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getTerm() {
        return this.term;
    }

    public final int hashCode() {
        int iD2 = H.d((this.downPayment.hashCode() + ((this.rate.hashCode() + H.d(H.d(H.d(this.label.hashCode() * 31, 31, this.value), 31, this.description), 31, this.maxAmount)) * 31)) * 31, 31, this.term);
        String str = this.alert;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.detailedDescription;
        return iHashCode + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    /* renamed from: i, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CalculationProgramOption(label=");
        sb2.append(this.label);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", maxAmount=");
        sb2.append(this.maxAmount);
        sb2.append(", rate=");
        sb2.append(this.rate);
        sb2.append(", downPayment=");
        sb2.append(this.downPayment);
        sb2.append(", term=");
        sb2.append(this.term);
        sb2.append(", alert=");
        sb2.append(this.alert);
        sb2.append(", detailedDescription=");
        return com.avito.android.actions_sheet.a.w(sb2, this.detailedDescription, ')');
    }
}
