package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: LegalRequirements.kt */
@d
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/avito/android/mortgage/api/model/LegalRequirements;", "Landroid/os/Parcelable;", "", "title", "description", "", "Lcom/avito/android/mortgage/api/model/CheckboxMeta;", "checkboxesMeta", "Lcom/avito/android/remote/model/text/AttributedText;", ServiceTransportationWidget.DisclaimerField.TYPE, "confirmButton", "declineButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Ljava/util/Map;", "getCheckboxesMeta", "()Ljava/util/Map;", "Lcom/avito/android/remote/model/text/AttributedText;", "f", "()Lcom/avito/android/remote/model/text/AttributedText;", "d", "e", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LegalRequirements implements Parcelable {

    @k
    public static final Parcelable.Creator<LegalRequirements> CREATOR = new a();

    @c("checkboxes")
    @l
    private final Map<String, CheckboxMeta> checkboxesMeta;

    @c("confirmButton")
    @k
    private final String confirmButton;

    @c("declineButton")
    @k
    private final String declineButton;

    @c("description")
    @l
    private final String description;

    @c(ServiceTransportationWidget.DisclaimerField.TYPE)
    @l
    private final AttributedText disclaimer;

    @c("title")
    @k
    private final String title;

    /* compiled from: LegalRequirements.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LegalRequirements> {
        @Override // android.os.Parcelable.Creator
        public final LegalRequirements createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    linkedHashMap.put(parcel.readString(), CheckboxMeta.CREATOR.createFromParcel(parcel));
                }
            }
            return new LegalRequirements(string, string2, linkedHashMap, (AttributedText) parcel.readParcelable(LegalRequirements.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LegalRequirements[] newArray(int i12) {
            return new LegalRequirements[i12];
        }
    }

    public LegalRequirements(@k String str, @l String str2, @l Map<String, CheckboxMeta> map, @l AttributedText attributedText, @k String str3, @k String str4) {
        this.title = str;
        this.description = str2;
        this.checkboxesMeta = map;
        this.disclaimer = attributedText;
        this.confirmButton = str3;
        this.declineButton = str4;
    }

    @k
    public final Map<String, CheckboxMeta> c() {
        Map<String, CheckboxMeta> map = this.checkboxesMeta;
        return map == null ? P0.c() : map;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getConfirmButton() {
        return this.confirmButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getDeclineButton() {
        return this.declineButton;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegalRequirements)) {
            return false;
        }
        LegalRequirements legalRequirements = (LegalRequirements) obj;
        return L.f(this.title, legalRequirements.title) && L.f(this.description, legalRequirements.description) && L.f(this.checkboxesMeta, legalRequirements.checkboxesMeta) && L.f(this.disclaimer, legalRequirements.disclaimer) && L.f(this.confirmButton, legalRequirements.confirmButton) && L.f(this.declineButton, legalRequirements.declineButton);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final AttributedText getDisclaimer() {
        return this.disclaimer;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, CheckboxMeta> map = this.checkboxesMeta;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        AttributedText attributedText = this.disclaimer;
        return this.declineButton.hashCode() + H.d((iHashCode3 + (attributedText != null ? attributedText.hashCode() : 0)) * 31, 31, this.confirmButton);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LegalRequirements(title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", checkboxesMeta=");
        sb2.append(this.checkboxesMeta);
        sb2.append(", disclaimer=");
        sb2.append(this.disclaimer);
        sb2.append(", confirmButton=");
        sb2.append(this.confirmButton);
        sb2.append(", declineButton=");
        return C22026a.c(sb2, this.declineButton, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Map<String, CheckboxMeta> map = this.checkboxesMeta;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                ((CheckboxMeta) entry.getValue()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeParcelable(this.disclaimer, i12);
        parcel.writeString(this.confirmButton);
        parcel.writeString(this.declineButton);
    }
}
