package com.avito.android.user_address_public.api;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MultiAddressesItem.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0012\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/avito/android/user_address_public/api/AdditionalInfo;", "Landroid/os/Parcelable;", "", "delimiter", "content", "", "addressesAssignments", "textButtonShowMap", "blockType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getDelimiter", "()Ljava/lang/String;", "e", "Ljava/util/List;", "c", "()Ljava/util/List;", "f", "d", "_avito_user-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AdditionalInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<AdditionalInfo> CREATOR = new a();

    @c("addressesAssignments")
    @l
    private final List<String> addressesAssignments;

    @c("blockType")
    @l
    private final String blockType;

    @c("content")
    @k
    private final String content;

    @c("delimiter")
    @l
    private final String delimiter;

    @c("textButtonShowMap")
    @l
    private final String textButtonShowMap;

    /* compiled from: MultiAddressesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdditionalInfo> {
        @Override // android.os.Parcelable.Creator
        public final AdditionalInfo createFromParcel(Parcel parcel) {
            return new AdditionalInfo(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdditionalInfo[] newArray(int i12) {
            return new AdditionalInfo[i12];
        }
    }

    public AdditionalInfo(@l String str, @k String str2, @l List<String> list, @l String str3, @l String str4) {
        this.delimiter = str;
        this.content = str2;
        this.addressesAssignments = list;
        this.textButtonShowMap = str3;
        this.blockType = str4;
    }

    @l
    public final List<String> c() {
        return this.addressesAssignments;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getBlockType() {
        return this.blockType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalInfo)) {
            return false;
        }
        AdditionalInfo additionalInfo = (AdditionalInfo) obj;
        return L.f(this.delimiter, additionalInfo.delimiter) && L.f(this.content, additionalInfo.content) && L.f(this.addressesAssignments, additionalInfo.addressesAssignments) && L.f(this.textButtonShowMap, additionalInfo.textButtonShowMap) && L.f(this.blockType, additionalInfo.blockType);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getTextButtonShowMap() {
        return this.textButtonShowMap;
    }

    public final int hashCode() {
        String str = this.delimiter;
        int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.content);
        List<String> list = this.addressesAssignments;
        int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.textButtonShowMap;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.blockType;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdditionalInfo(delimiter=");
        sb2.append(this.delimiter);
        sb2.append(", content=");
        sb2.append(this.content);
        sb2.append(", addressesAssignments=");
        sb2.append(this.addressesAssignments);
        sb2.append(", textButtonShowMap=");
        sb2.append(this.textButtonShowMap);
        sb2.append(", blockType=");
        return C22026a.c(sb2, this.blockType, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.delimiter);
        parcel.writeString(this.content);
        parcel.writeStringList(this.addressesAssignments);
        parcel.writeString(this.textButtonShowMap);
        parcel.writeString(this.blockType);
    }

    public /* synthetic */ AdditionalInfo(String str, String str2, List list, String str3, String str4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, str2, list, str3, str4);
    }
}
