package com.avito.android.str_insurance;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrInsuranceLink.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/avito/android/str_insurance/Form;", "Landroid/os/Parcelable;", "", "title", "description", AddressParameter.TYPE, "Lcom/avito/android/remote/model/text/AttributedText;", ServiceTransportationWidget.DisclaimerField.TYPE, "flatNumberPattern", "itemId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "c", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "e", "getItemId", "_avito_str-insurance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Form implements Parcelable {

    @k
    public static final Parcelable.Creator<Form> CREATOR = new a();

    @c(AddressParameter.TYPE)
    @k
    private final String address;

    @c("description")
    @k
    private final String description;

    @c(ServiceTransportationWidget.DisclaimerField.TYPE)
    @k
    private final AttributedText disclaimer;

    @c("flatNumberPattern")
    @k
    private final String flatNumberPattern;

    @c("itemId")
    @k
    private final String itemId;

    @c("title")
    @k
    private final String title;

    /* compiled from: StrInsuranceLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Form> {
        @Override // android.os.Parcelable.Creator
        public final Form createFromParcel(Parcel parcel) {
            return new Form(parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(Form.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Form[] newArray(int i12) {
            return new Form[i12];
        }
    }

    public Form(@k String str, @k String str2, @k String str3, @k AttributedText attributedText, @k String str4, @k String str5) {
        this.title = str;
        this.description = str2;
        this.address = str3;
        this.disclaimer = attributedText;
        this.flatNumberPattern = str4;
        this.itemId = str5;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getDisclaimer() {
        return this.disclaimer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getFlatNumberPattern() {
        return this.flatNumberPattern;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Form)) {
            return false;
        }
        Form form = (Form) obj;
        return L.f(this.title, form.title) && L.f(this.description, form.description) && L.f(this.address, form.address) && L.f(this.disclaimer, form.disclaimer) && L.f(this.flatNumberPattern, form.flatNumberPattern) && L.f(this.itemId, form.itemId);
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getItemId() {
        return this.itemId;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.itemId.hashCode() + H.d(com.avito.android.actions_sheet.a.b(H.d(H.d(this.title.hashCode() * 31, 31, this.description), 31, this.address), 31, this.disclaimer), 31, this.flatNumberPattern);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Form(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", address=");
        sb2.append(this.address);
        sb2.append(", disclaimer=");
        sb2.append(this.disclaimer);
        sb2.append(", flatNumberPattern=");
        sb2.append(this.flatNumberPattern);
        sb2.append(", itemId=");
        return C22026a.c(sb2, this.itemId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeString(this.address);
        parcel.writeParcelable(this.disclaimer, i12);
        parcel.writeString(this.flatNumberPattern);
        parcel.writeString(this.itemId);
    }
}
