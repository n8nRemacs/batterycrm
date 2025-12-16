package com.avito.android.early_access.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: EarlyAccessModalResponse.kt */
@d
@s0
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0002\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b#\u0010\u0016R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b$\u0010\u0016R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b%\u0010\u0019¨\u0006&"}, d2 = {"Lcom/avito/android/early_access/remote/model/PackageInfo;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/early_access/remote/model/Package;", "packages", "", "packagesExplanation", "packagesTitle", "packagesDescription", "packagesActionTitle", "", "defaultBundleId", "singleContact", "Lcom/avito/android/early_access/remote/model/EarlyAccessLegalBlock;", "legalV2", "Lcom/avito/android/early_access/remote/model/Parameter;", AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS, "singleContactTitle", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/early_access/remote/model/Package;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "Ljava/util/List;", "getPackages", "()Ljava/util/List;", "Ljava/lang/String;", "getPackagesExplanation", "()Ljava/lang/String;", "getPackagesTitle", "getPackagesDescription", "getPackagesActionTitle", "Ljava/lang/Integer;", "getDefaultBundleId", "()Ljava/lang/Integer;", "Lcom/avito/android/early_access/remote/model/Package;", "getSingleContact", "()Lcom/avito/android/early_access/remote/model/Package;", "getLegalV2", "getParameters", "getSingleContactTitle", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PackageInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<PackageInfo> CREATOR = new a();

    @c("defaultBundleId")
    @l
    private final Integer defaultBundleId;

    @c("legalV2")
    @l
    private final List<EarlyAccessLegalBlock> legalV2;

    @c("packages")
    @k
    private final List<Package> packages;

    @c("packagesActionTitle")
    @l
    private final String packagesActionTitle;

    @c("packagesDescription")
    @l
    private final String packagesDescription;

    @c("packagesExplanation")
    @l
    private final String packagesExplanation;

    @c("packagesTitle")
    @l
    private final String packagesTitle;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_PARAMETERS)
    @l
    private final List<Parameter> parameters;

    @c("singleContact")
    @l
    private final Package singleContact;

    @c("singleContactTitle")
    @l
    private final String singleContactTitle;

    /* compiled from: EarlyAccessModalResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PackageInfo> {
        @Override // android.os.Parcelable.Creator
        public final PackageInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int i12 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i12);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = com.avito.android.actions_sheet.a.c(Package.CREATOR, parcel, arrayList3, iC3, 1);
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Package packageCreateFromParcel = parcel.readInt() == 0 ? null : Package.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                int iC4 = 0;
                while (iC4 != i13) {
                    iC4 = com.avito.android.actions_sheet.a.c(EarlyAccessLegalBlock.CREATOR, parcel, arrayList4, iC4, 1);
                }
                arrayList = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i14 = parcel.readInt();
                arrayList2 = new ArrayList(i14);
                while (iC2 != i14) {
                    iC2 = com.avito.android.actions_sheet.a.c(Parameter.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new PackageInfo(arrayList3, string, string2, string3, string4, numValueOf, packageCreateFromParcel, arrayList, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PackageInfo[] newArray(int i12) {
            return new PackageInfo[i12];
        }
    }

    public PackageInfo(@k List<Package> list, @l String str, @l String str2, @l String str3, @l String str4, @l Integer num, @l Package r72, @l List<EarlyAccessLegalBlock> list2, @l List<Parameter> list3, @l String str5) {
        this.packages = list;
        this.packagesExplanation = str;
        this.packagesTitle = str2;
        this.packagesDescription = str3;
        this.packagesActionTitle = str4;
        this.defaultBundleId = num;
        this.singleContact = r72;
        this.legalV2 = list2;
        this.parameters = list3;
        this.singleContactTitle = str5;
    }

    @k
    public final ReEarlyAccessData.PackagesInfo c() {
        ArrayList arrayList;
        List<Package> list = this.packages;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Package) it.next()).c());
        }
        String str = this.packagesExplanation;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String str3 = this.packagesTitle;
        String str4 = this.packagesDescription;
        String str5 = this.packagesActionTitle;
        Integer num = this.defaultBundleId;
        ArrayList arrayList3 = null;
        String string = num != null ? num.toString() : null;
        Package r02 = this.singleContact;
        ReEarlyAccessData.Package packageC = r02 != null ? r02.c() : null;
        List<EarlyAccessLegalBlock> list2 = this.legalV2;
        if (list2 != null) {
            List<EarlyAccessLegalBlock> list3 = list2;
            arrayList = new ArrayList(C42745f0.q(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList.add(((EarlyAccessLegalBlock) it2.next()).c());
            }
        } else {
            arrayList = null;
        }
        List<Parameter> list4 = this.parameters;
        if (list4 != null) {
            List<Parameter> list5 = list4;
            arrayList3 = new ArrayList(C42745f0.q(list5, 10));
            Iterator<T> it3 = list5.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((Parameter) it3.next()).c());
            }
        }
        return new ReEarlyAccessData.PackagesInfo(arrayList2, str2, str3, str4, str5, arrayList3, string, packageC, arrayList, this.singleContactTitle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PackageInfo)) {
            return false;
        }
        PackageInfo packageInfo = (PackageInfo) obj;
        return L.f(this.packages, packageInfo.packages) && L.f(this.packagesExplanation, packageInfo.packagesExplanation) && L.f(this.packagesTitle, packageInfo.packagesTitle) && L.f(this.packagesDescription, packageInfo.packagesDescription) && L.f(this.packagesActionTitle, packageInfo.packagesActionTitle) && L.f(this.defaultBundleId, packageInfo.defaultBundleId) && L.f(this.singleContact, packageInfo.singleContact) && L.f(this.legalV2, packageInfo.legalV2) && L.f(this.parameters, packageInfo.parameters) && L.f(this.singleContactTitle, packageInfo.singleContactTitle);
    }

    public final int hashCode() {
        int iHashCode = this.packages.hashCode() * 31;
        String str = this.packagesExplanation;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.packagesTitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.packagesDescription;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.packagesActionTitle;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.defaultBundleId;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Package r12 = this.singleContact;
        int iHashCode7 = (iHashCode6 + (r12 == null ? 0 : r12.hashCode())) * 31;
        List<EarlyAccessLegalBlock> list = this.legalV2;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<Parameter> list2 = this.parameters;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.singleContactTitle;
        return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PackageInfo(packages=");
        sb2.append(this.packages);
        sb2.append(", packagesExplanation=");
        sb2.append(this.packagesExplanation);
        sb2.append(", packagesTitle=");
        sb2.append(this.packagesTitle);
        sb2.append(", packagesDescription=");
        sb2.append(this.packagesDescription);
        sb2.append(", packagesActionTitle=");
        sb2.append(this.packagesActionTitle);
        sb2.append(", defaultBundleId=");
        sb2.append(this.defaultBundleId);
        sb2.append(", singleContact=");
        sb2.append(this.singleContact);
        sb2.append(", legalV2=");
        sb2.append(this.legalV2);
        sb2.append(", parameters=");
        sb2.append(this.parameters);
        sb2.append(", singleContactTitle=");
        return C22026a.c(sb2, this.singleContactTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.packages, parcel);
        while (itJ.hasNext()) {
            ((Package) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.packagesExplanation);
        parcel.writeString(this.packagesTitle);
        parcel.writeString(this.packagesDescription);
        parcel.writeString(this.packagesActionTitle);
        Integer num = this.defaultBundleId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Package r02 = this.singleContact;
        if (r02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            r02.writeToParcel(parcel, i12);
        }
        List<EarlyAccessLegalBlock> list = this.legalV2;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((EarlyAccessLegalBlock) itA.next()).writeToParcel(parcel, i12);
            }
        }
        List<Parameter> list2 = this.parameters;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((Parameter) itA2.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeString(this.singleContactTitle);
    }
}
