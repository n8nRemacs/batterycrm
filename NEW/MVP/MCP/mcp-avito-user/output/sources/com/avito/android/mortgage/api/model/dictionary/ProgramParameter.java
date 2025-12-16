package com.avito.android.mortgage.api.model.dictionary;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProgramParameter.kt */
@d
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/mortgage/api/model/dictionary/ProgramParameter;", "Lcom/avito/android/mortgage/api/model/dictionary/Parameter;", "", "label", "value", "description", "Lcom/avito/android/mortgage/api/model/dictionary/StringNumberParameter;", "downPayment", "maxAmount", "", "loanTypesMeta", "rate", "term", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/mortgage/api/model/dictionary/StringNumberParameter;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/mortgage/api/model/dictionary/StringNumberParameter;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getValue", "getDescription", "Lcom/avito/android/mortgage/api/model/dictionary/StringNumberParameter;", "c", "()Lcom/avito/android/mortgage/api/model/dictionary/StringNumberParameter;", "getMaxAmount", "Ljava/util/List;", "getRate", "getTerm", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ProgramParameter implements Parameter {

    @k
    public static final Parcelable.Creator<ProgramParameter> CREATOR = new a();

    @c("description")
    @k
    private final String description;

    @c("downPayment")
    @k
    private final StringNumberParameter downPayment;

    @c("label")
    @k
    private final String label;

    @c("loanTypes")
    @l
    private final List<String> loanTypesMeta;

    @c("maxAmount")
    @k
    private final String maxAmount;

    @c("rate")
    @k
    private final StringNumberParameter rate;

    @c("term")
    @k
    private final String term;

    @c("text")
    @l
    private final AttributedText text;

    @c("value")
    @k
    private final String value;

    /* compiled from: ProgramParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProgramParameter> {
        @Override // android.os.Parcelable.Creator
        public final ProgramParameter createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Parcelable.Creator<StringNumberParameter> creator = StringNumberParameter.CREATOR;
            return new ProgramParameter(string, string2, string3, creator.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), creator.createFromParcel(parcel), parcel.readString(), (AttributedText) parcel.readParcelable(ProgramParameter.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProgramParameter[] newArray(int i12) {
            return new ProgramParameter[i12];
        }
    }

    public ProgramParameter(@k String str, @k String str2, @k String str3, @k StringNumberParameter stringNumberParameter, @k String str4, @l List<String> list, @k StringNumberParameter stringNumberParameter2, @k String str5, @l AttributedText attributedText) {
        this.label = str;
        this.value = str2;
        this.description = str3;
        this.downPayment = stringNumberParameter;
        this.maxAmount = str4;
        this.loanTypesMeta = list;
        this.rate = stringNumberParameter2;
        this.term = str5;
        this.text = attributedText;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final StringNumberParameter getDownPayment() {
        return this.downPayment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramParameter)) {
            return false;
        }
        ProgramParameter programParameter = (ProgramParameter) obj;
        return L.f(this.label, programParameter.label) && L.f(this.value, programParameter.value) && L.f(this.description, programParameter.description) && L.f(this.downPayment, programParameter.downPayment) && L.f(this.maxAmount, programParameter.maxAmount) && L.f(this.loanTypesMeta, programParameter.loanTypesMeta) && L.f(this.rate, programParameter.rate) && L.f(this.term, programParameter.term) && L.f(this.text, programParameter.text);
    }

    @Override // com.avito.android.mortgage.api.model.dictionary.Parameter
    @k
    public final String getLabel() {
        return this.label;
    }

    @Override // com.avito.android.mortgage.api.model.dictionary.Parameter
    @k
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iD2 = H.d((this.downPayment.hashCode() + H.d(H.d(this.label.hashCode() * 31, 31, this.value), 31, this.description)) * 31, 31, this.maxAmount);
        List<String> list = this.loanTypesMeta;
        int iD3 = H.d((this.rate.hashCode() + ((iD2 + (list == null ? 0 : list.hashCode())) * 31)) * 31, 31, this.term);
        AttributedText attributedText = this.text;
        return iD3 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProgramParameter(label=");
        sb2.append(this.label);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", downPayment=");
        sb2.append(this.downPayment);
        sb2.append(", maxAmount=");
        sb2.append(this.maxAmount);
        sb2.append(", loanTypesMeta=");
        sb2.append(this.loanTypesMeta);
        sb2.append(", rate=");
        sb2.append(this.rate);
        sb2.append(", term=");
        sb2.append(this.term);
        sb2.append(", text=");
        return com.avito.android.actions_sheet.a.w(sb2, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.label);
        parcel.writeString(this.value);
        parcel.writeString(this.description);
        this.downPayment.writeToParcel(parcel, i12);
        parcel.writeString(this.maxAmount);
        parcel.writeStringList(this.loanTypesMeta);
        this.rate.writeToParcel(parcel, i12);
        parcel.writeString(this.term);
        parcel.writeParcelable(this.text, i12);
    }
}
