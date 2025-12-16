package com.avito.android.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ContactInfo.kt */
@K51.d
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/ContactInfo;", "Landroid/os/Parcelable;", "", "name", "", "Lcom/avito/android/remote/Phone;", "phones", "Lcom/avito/android/remote/FormParams;", "formParams", "Lcom/avito/android/remote/model/text/AttributedText;", "userAgreement", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/FormParams;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/avito/android/remote/FormParams;", "c", "()Lcom/avito/android/remote/FormParams;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_avito-api_recall-me"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ContactInfo implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ContactInfo> CREATOR = new a();

    @com.google.gson.annotations.c("formParams")
    @Y61.k
    private final FormParams formParams;

    @com.google.gson.annotations.c("name")
    @Y61.l
    private final String name;

    @com.google.gson.annotations.c("phones")
    @Y61.l
    private final List<Phone> phones;

    @com.google.gson.annotations.c("userAgreement")
    @Y61.l
    private final AttributedText userAgreement;

    /* compiled from: ContactInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ContactInfo> {
        @Override // android.os.Parcelable.Creator
        public final ContactInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Phone.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new ContactInfo(string, arrayList, FormParams.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(ContactInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ContactInfo[] newArray(int i12) {
            return new ContactInfo[i12];
        }
    }

    public ContactInfo(@Y61.l String str, @Y61.l List<Phone> list, @Y61.k FormParams formParams, @Y61.l AttributedText attributedText) {
        this.name = str;
        this.phones = list;
        this.formParams = formParams;
        this.userAgreement = attributedText;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final FormParams getFormParams() {
        return this.formParams;
    }

    @Y61.l
    public final List<Phone> d() {
        return this.phones;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final AttributedText getUserAgreement() {
        return this.userAgreement;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactInfo)) {
            return false;
        }
        ContactInfo contactInfo = (ContactInfo) obj;
        return kotlin.jvm.internal.L.f(this.name, contactInfo.name) && kotlin.jvm.internal.L.f(this.phones, contactInfo.phones) && kotlin.jvm.internal.L.f(this.formParams, contactInfo.formParams) && kotlin.jvm.internal.L.f(this.userAgreement, contactInfo.userAgreement);
    }

    @Y61.l
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Phone> list = this.phones;
        int iHashCode2 = (this.formParams.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        AttributedText attributedText = this.userAgreement;
        return iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactInfo(name=");
        sb2.append(this.name);
        sb2.append(", phones=");
        sb2.append(this.phones);
        sb2.append(", formParams=");
        sb2.append(this.formParams);
        sb2.append(", userAgreement=");
        return com.avito.android.actions_sheet.a.w(sb2, this.userAgreement, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.name);
        List<Phone> list = this.phones;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Phone) itA.next()).writeToParcel(parcel, i12);
            }
        }
        this.formParams.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.userAgreement, i12);
    }
}
