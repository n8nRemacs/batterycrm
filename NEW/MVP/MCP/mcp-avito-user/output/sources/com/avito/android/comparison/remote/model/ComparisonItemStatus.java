package com.avito.android.comparison.remote.model;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ComparisonResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/comparison/remote/model/ComparisonItemStatus;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "INACTIVE", "BLOCKED", "REJECTED", "OLD", "ARCHIVED", GrsBaseInfo.CountryCodeSource.UNKNOWN, "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ComparisonItemStatus implements Parcelable {

    @c("active")
    public static final ComparisonItemStatus ACTIVE;

    @c("archived")
    public static final ComparisonItemStatus ARCHIVED;

    @c("blocked")
    public static final ComparisonItemStatus BLOCKED;

    @k
    public static final Parcelable.Creator<ComparisonItemStatus> CREATOR;

    @c("inactive")
    public static final ComparisonItemStatus INACTIVE;

    @c("old")
    public static final ComparisonItemStatus OLD;

    @c("rejected")
    public static final ComparisonItemStatus REJECTED;

    @c("unknown")
    public static final ComparisonItemStatus UNKNOWN;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ComparisonItemStatus[] f124195b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f124196c;

    static {
        ComparisonItemStatus comparisonItemStatus = new ComparisonItemStatus("ACTIVE", 0);
        ACTIVE = comparisonItemStatus;
        ComparisonItemStatus comparisonItemStatus2 = new ComparisonItemStatus("INACTIVE", 1);
        INACTIVE = comparisonItemStatus2;
        ComparisonItemStatus comparisonItemStatus3 = new ComparisonItemStatus("BLOCKED", 2);
        BLOCKED = comparisonItemStatus3;
        ComparisonItemStatus comparisonItemStatus4 = new ComparisonItemStatus("REJECTED", 3);
        REJECTED = comparisonItemStatus4;
        ComparisonItemStatus comparisonItemStatus5 = new ComparisonItemStatus("OLD", 4);
        OLD = comparisonItemStatus5;
        ComparisonItemStatus comparisonItemStatus6 = new ComparisonItemStatus("ARCHIVED", 5);
        ARCHIVED = comparisonItemStatus6;
        ComparisonItemStatus comparisonItemStatus7 = new ComparisonItemStatus(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6);
        UNKNOWN = comparisonItemStatus7;
        ComparisonItemStatus[] comparisonItemStatusArr = {comparisonItemStatus, comparisonItemStatus2, comparisonItemStatus3, comparisonItemStatus4, comparisonItemStatus5, comparisonItemStatus6, comparisonItemStatus7};
        f124195b = comparisonItemStatusArr;
        f124196c = kotlin.enums.c.a(comparisonItemStatusArr);
        CREATOR = new Parcelable.Creator<ComparisonItemStatus>() { // from class: com.avito.android.comparison.remote.model.ComparisonItemStatus.a
            @Override // android.os.Parcelable.Creator
            public final ComparisonItemStatus createFromParcel(Parcel parcel) {
                return ComparisonItemStatus.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ComparisonItemStatus[] newArray(int i12) {
                return new ComparisonItemStatus[i12];
            }
        };
    }

    private ComparisonItemStatus(String str, int i12) {
    }

    public static ComparisonItemStatus valueOf(String str) {
        return (ComparisonItemStatus) Enum.valueOf(ComparisonItemStatus.class, str);
    }

    public static ComparisonItemStatus[] values() {
        return (ComparisonItemStatus[]) f124195b.clone();
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
