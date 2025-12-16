package com.avito.android.remote.model.autotekateaser;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NewDesignGallery.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/autotekateaser/UserData;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/autotekateaser/PersonalDiscount;", "personalDiscount", "Lcom/avito/android/remote/model/autotekateaser/ActivePackage;", "activePackage", "Lcom/avito/android/remote/model/autotekateaser/ExistingReport;", "existingReport", "<init>", "(Lcom/avito/android/remote/model/autotekateaser/PersonalDiscount;Lcom/avito/android/remote/model/autotekateaser/ActivePackage;Lcom/avito/android/remote/model/autotekateaser/ExistingReport;)V", "component1", "()Lcom/avito/android/remote/model/autotekateaser/PersonalDiscount;", "component2", "()Lcom/avito/android/remote/model/autotekateaser/ActivePackage;", "component3", "()Lcom/avito/android/remote/model/autotekateaser/ExistingReport;", "copy", "(Lcom/avito/android/remote/model/autotekateaser/PersonalDiscount;Lcom/avito/android/remote/model/autotekateaser/ActivePackage;Lcom/avito/android/remote/model/autotekateaser/ExistingReport;)Lcom/avito/android/remote/model/autotekateaser/UserData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/autotekateaser/PersonalDiscount;", "getPersonalDiscount", "Lcom/avito/android/remote/model/autotekateaser/ActivePackage;", "getActivePackage", "Lcom/avito/android/remote/model/autotekateaser/ExistingReport;", "getExistingReport", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UserData implements Parcelable {

    @k
    public static final Parcelable.Creator<UserData> CREATOR = new Creator();

    @c("activePackage")
    @l
    private final ActivePackage activePackage;

    @c("existingReport")
    @l
    private final ExistingReport existingReport;

    @c("personalDiscount")
    @l
    private final PersonalDiscount personalDiscount;

    /* compiled from: NewDesignGallery.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserData createFromParcel(@k Parcel parcel) {
            return new UserData(parcel.readInt() == 0 ? null : PersonalDiscount.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ActivePackage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ExistingReport.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserData[] newArray(int i12) {
            return new UserData[i12];
        }
    }

    public UserData(@l PersonalDiscount personalDiscount, @l ActivePackage activePackage, @l ExistingReport existingReport) {
        this.personalDiscount = personalDiscount;
        this.activePackage = activePackage;
        this.existingReport = existingReport;
    }

    public static /* synthetic */ UserData copy$default(UserData userData, PersonalDiscount personalDiscount, ActivePackage activePackage, ExistingReport existingReport, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            personalDiscount = userData.personalDiscount;
        }
        if ((i12 & 2) != 0) {
            activePackage = userData.activePackage;
        }
        if ((i12 & 4) != 0) {
            existingReport = userData.existingReport;
        }
        return userData.copy(personalDiscount, activePackage, existingReport);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final PersonalDiscount getPersonalDiscount() {
        return this.personalDiscount;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final ActivePackage getActivePackage() {
        return this.activePackage;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ExistingReport getExistingReport() {
        return this.existingReport;
    }

    @k
    public final UserData copy(@l PersonalDiscount personalDiscount, @l ActivePackage activePackage, @l ExistingReport existingReport) {
        return new UserData(personalDiscount, activePackage, existingReport);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserData)) {
            return false;
        }
        UserData userData = (UserData) other;
        return L.f(this.personalDiscount, userData.personalDiscount) && L.f(this.activePackage, userData.activePackage) && L.f(this.existingReport, userData.existingReport);
    }

    @l
    public final ActivePackage getActivePackage() {
        return this.activePackage;
    }

    @l
    public final ExistingReport getExistingReport() {
        return this.existingReport;
    }

    @l
    public final PersonalDiscount getPersonalDiscount() {
        return this.personalDiscount;
    }

    public int hashCode() {
        PersonalDiscount personalDiscount = this.personalDiscount;
        int iHashCode = (personalDiscount == null ? 0 : personalDiscount.hashCode()) * 31;
        ActivePackage activePackage = this.activePackage;
        int iHashCode2 = (iHashCode + (activePackage == null ? 0 : activePackage.hashCode())) * 31;
        ExistingReport existingReport = this.existingReport;
        return iHashCode2 + (existingReport != null ? existingReport.hashCode() : 0);
    }

    @k
    public String toString() {
        return "UserData(personalDiscount=" + this.personalDiscount + ", activePackage=" + this.activePackage + ", existingReport=" + this.existingReport + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        PersonalDiscount personalDiscount = this.personalDiscount;
        if (personalDiscount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            personalDiscount.writeToParcel(parcel, flags);
        }
        ActivePackage activePackage = this.activePackage;
        if (activePackage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            activePackage.writeToParcel(parcel, flags);
        }
        ExistingReport existingReport = this.existingReport;
        if (existingReport == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            existingReport.writeToParcel(parcel, flags);
        }
    }
}
