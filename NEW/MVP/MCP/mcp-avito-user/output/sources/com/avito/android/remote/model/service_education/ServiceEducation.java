package com.avito.android.remote.model.service_education;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceEducation.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/service_education/ServiceEducation;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/service_education/ServiceEducation$ServiceEducationValue;", "values", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/service_education/ServiceEducation;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getValues", "ServiceEducationValue", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ServiceEducation implements Parcelable {

    @k
    public static final Parcelable.Creator<ServiceEducation> CREATOR = new Creator();

    @c("title")
    @l
    private final String title;

    @c("values")
    @k
    private final List<ServiceEducationValue> values;

    /* compiled from: ServiceEducation.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ServiceEducation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ServiceEducation createFromParcel(@k Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(ServiceEducationValue.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ServiceEducation(string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ServiceEducation[] newArray(int i12) {
            return new ServiceEducation[i12];
        }
    }

    /* compiled from: ServiceEducation.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\rJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\r¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/service_education/ServiceEducation$ServiceEducationValue;", "Landroid/os/Parcelable;", "", "institution", "speciality", "", SelectionType.TYPE_YEAR, "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/avito/android/remote/model/service_education/ServiceEducation$ServiceEducationValue;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getInstitution", "getSpeciality", "I", "getYear", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ServiceEducationValue implements Parcelable {

        @k
        public static final Parcelable.Creator<ServiceEducationValue> CREATOR = new Creator();

        @c("institution")
        @k
        private final String institution;

        @c("speciality")
        @k
        private final String speciality;

        @c(SelectionType.TYPE_YEAR)
        private final int year;

        /* compiled from: ServiceEducation.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ServiceEducationValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ServiceEducationValue createFromParcel(@k Parcel parcel) {
                return new ServiceEducationValue(parcel.readString(), parcel.readString(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ServiceEducationValue[] newArray(int i12) {
                return new ServiceEducationValue[i12];
            }
        }

        public ServiceEducationValue(@k String str, @k String str2, int i12) {
            this.institution = str;
            this.speciality = str2;
            this.year = i12;
        }

        public static /* synthetic */ ServiceEducationValue copy$default(ServiceEducationValue serviceEducationValue, String str, String str2, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = serviceEducationValue.institution;
            }
            if ((i13 & 2) != 0) {
                str2 = serviceEducationValue.speciality;
            }
            if ((i13 & 4) != 0) {
                i12 = serviceEducationValue.year;
            }
            return serviceEducationValue.copy(str, str2, i12);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getInstitution() {
            return this.institution;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getSpeciality() {
            return this.speciality;
        }

        /* renamed from: component3, reason: from getter */
        public final int getYear() {
            return this.year;
        }

        @k
        public final ServiceEducationValue copy(@k String institution, @k String speciality, int year) {
            return new ServiceEducationValue(institution, speciality, year);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ServiceEducationValue)) {
                return false;
            }
            ServiceEducationValue serviceEducationValue = (ServiceEducationValue) other;
            return L.f(this.institution, serviceEducationValue.institution) && L.f(this.speciality, serviceEducationValue.speciality) && this.year == serviceEducationValue.year;
        }

        @k
        public final String getInstitution() {
            return this.institution;
        }

        @k
        public final String getSpeciality() {
            return this.speciality;
        }

        public final int getYear() {
            return this.year;
        }

        public int hashCode() {
            return Integer.hashCode(this.year) + H.d(this.institution.hashCode() * 31, 31, this.speciality);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("ServiceEducationValue(institution=");
            sb2.append(this.institution);
            sb2.append(", speciality=");
            sb2.append(this.speciality);
            sb2.append(", year=");
            return r.t(sb2, this.year, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.institution);
            parcel.writeString(this.speciality);
            parcel.writeInt(this.year);
        }
    }

    public ServiceEducation(@l String str, @k List<ServiceEducationValue> list) {
        this.title = str;
        this.values = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServiceEducation copy$default(ServiceEducation serviceEducation, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = serviceEducation.title;
        }
        if ((i12 & 2) != 0) {
            list = serviceEducation.values;
        }
        return serviceEducation.copy(str, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    public final List<ServiceEducationValue> component2() {
        return this.values;
    }

    @k
    public final ServiceEducation copy(@l String title, @k List<ServiceEducationValue> values) {
        return new ServiceEducation(title, values);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceEducation)) {
            return false;
        }
        ServiceEducation serviceEducation = (ServiceEducation) other;
        return L.f(this.title, serviceEducation.title) && L.f(this.values, serviceEducation.values);
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @k
    public final List<ServiceEducationValue> getValues() {
        return this.values;
    }

    public int hashCode() {
        String str = this.title;
        return this.values.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceEducation(title=");
        sb2.append(this.title);
        sb2.append(", values=");
        return H.p(sb2, this.values, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        Iterator itJ = C0.j(this.values, parcel);
        while (itJ.hasNext()) {
            ((ServiceEducationValue) itJ.next()).writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ ServiceEducation(String str, List list, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, list);
    }
}
