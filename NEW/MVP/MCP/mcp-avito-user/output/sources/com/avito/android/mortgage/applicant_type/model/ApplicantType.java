package com.avito.android.mortgage.applicant_type.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApplicantType.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/applicant_type/model/ApplicantType;", "", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ApplicantType implements Parcelable {

    @k
    public static final Parcelable.Creator<ApplicantType> CREATOR;

    /* renamed from: c, reason: collision with root package name */
    public static final ApplicantType f198304c;

    /* renamed from: d, reason: collision with root package name */
    public static final ApplicantType f198305d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ApplicantType[] f198306e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f198307f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f198308b;

    static {
        ApplicantType applicantType = new ApplicantType("SPOUSE", 0, "spouse");
        f198304c = applicantType;
        ApplicantType applicantType2 = new ApplicantType("GENERAL", 1, "co-borrower");
        f198305d = applicantType2;
        ApplicantType[] applicantTypeArr = {applicantType, applicantType2};
        f198306e = applicantTypeArr;
        f198307f = c.a(applicantTypeArr);
        CREATOR = new Parcelable.Creator<ApplicantType>() { // from class: com.avito.android.mortgage.applicant_type.model.ApplicantType.a
            @Override // android.os.Parcelable.Creator
            public final ApplicantType createFromParcel(Parcel parcel) {
                return ApplicantType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ApplicantType[] newArray(int i12) {
                return new ApplicantType[i12];
            }
        };
    }

    public ApplicantType(String str, int i12, String str2) {
        this.f198308b = str2;
    }

    public static ApplicantType valueOf(String str) {
        return (ApplicantType) Enum.valueOf(ApplicantType.class, str);
    }

    public static ApplicantType[] values() {
        return (ApplicantType[]) f198306e.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
