package com.avito.android.remote.model.early_access_advert;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessAdvert.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJN\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b)\u0010\rR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b*\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b+\u0010\r¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/early_access_advert/EarlyAccessData;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/early_access_advert/EarlyAccessFeature;", "features", "agreementButtonText", "disagreementButtonText", "buttonDisclaimer", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/early_access_advert/EarlyAccessData;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getFeatures", "getAgreementButtonText", "getDisagreementButtonText", "getButtonDisclaimer", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EarlyAccessData implements Parcelable {

    @k
    public static final Parcelable.Creator<EarlyAccessData> CREATOR = new Creator();

    @c("agreementButtonText")
    @k
    private final String agreementButtonText;

    @c("buttonDisclaimer")
    @l
    private final String buttonDisclaimer;

    @c("disagreementButtonText")
    @k
    private final String disagreementButtonText;

    @c("features")
    @l
    private final List<EarlyAccessFeature> features;

    @c("title")
    @l
    private final String title;

    /* compiled from: EarlyAccessAdvert.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EarlyAccessData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EarlyAccessData createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(EarlyAccessFeature.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new EarlyAccessData(string, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EarlyAccessData[] newArray(int i12) {
            return new EarlyAccessData[i12];
        }
    }

    public EarlyAccessData(@l String str, @l List<EarlyAccessFeature> list, @k String str2, @k String str3, @l String str4) {
        this.title = str;
        this.features = list;
        this.agreementButtonText = str2;
        this.disagreementButtonText = str3;
        this.buttonDisclaimer = str4;
    }

    public static /* synthetic */ EarlyAccessData copy$default(EarlyAccessData earlyAccessData, String str, List list, String str2, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = earlyAccessData.title;
        }
        if ((i12 & 2) != 0) {
            list = earlyAccessData.features;
        }
        List list2 = list;
        if ((i12 & 4) != 0) {
            str2 = earlyAccessData.agreementButtonText;
        }
        String str5 = str2;
        if ((i12 & 8) != 0) {
            str3 = earlyAccessData.disagreementButtonText;
        }
        String str6 = str3;
        if ((i12 & 16) != 0) {
            str4 = earlyAccessData.buttonDisclaimer;
        }
        return earlyAccessData.copy(str, list2, str5, str6, str4);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<EarlyAccessFeature> component2() {
        return this.features;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getAgreementButtonText() {
        return this.agreementButtonText;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getDisagreementButtonText() {
        return this.disagreementButtonText;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getButtonDisclaimer() {
        return this.buttonDisclaimer;
    }

    @k
    public final EarlyAccessData copy(@l String title, @l List<EarlyAccessFeature> features, @k String agreementButtonText, @k String disagreementButtonText, @l String buttonDisclaimer) {
        return new EarlyAccessData(title, features, agreementButtonText, disagreementButtonText, buttonDisclaimer);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarlyAccessData)) {
            return false;
        }
        EarlyAccessData earlyAccessData = (EarlyAccessData) other;
        return L.f(this.title, earlyAccessData.title) && L.f(this.features, earlyAccessData.features) && L.f(this.agreementButtonText, earlyAccessData.agreementButtonText) && L.f(this.disagreementButtonText, earlyAccessData.disagreementButtonText) && L.f(this.buttonDisclaimer, earlyAccessData.buttonDisclaimer);
    }

    @k
    public final String getAgreementButtonText() {
        return this.agreementButtonText;
    }

    @l
    public final String getButtonDisclaimer() {
        return this.buttonDisclaimer;
    }

    @k
    public final String getDisagreementButtonText() {
        return this.disagreementButtonText;
    }

    @l
    public final List<EarlyAccessFeature> getFeatures() {
        return this.features;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<EarlyAccessFeature> list = this.features;
        int iD2 = H.d(H.d((iHashCode + (list == null ? 0 : list.hashCode())) * 31, 31, this.agreementButtonText), 31, this.disagreementButtonText);
        String str2 = this.buttonDisclaimer;
        return iD2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EarlyAccessData(title=");
        sb2.append(this.title);
        sb2.append(", features=");
        sb2.append(this.features);
        sb2.append(", agreementButtonText=");
        sb2.append(this.agreementButtonText);
        sb2.append(", disagreementButtonText=");
        sb2.append(this.disagreementButtonText);
        sb2.append(", buttonDisclaimer=");
        return C22026a.c(sb2, this.buttonDisclaimer, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        List<EarlyAccessFeature> list = this.features;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((EarlyAccessFeature) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.agreementButtonText);
        parcel.writeString(this.disagreementButtonText);
        parcel.writeString(this.buttonDisclaimer);
    }
}
