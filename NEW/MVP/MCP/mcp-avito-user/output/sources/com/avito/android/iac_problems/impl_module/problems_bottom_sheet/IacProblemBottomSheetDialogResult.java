package com.avito.android.iac_problems.impl_module.problems_bottom_sheet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IacProblemBottomSheetDialogResult.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/problems_bottom_sheet/IacProblemBottomSheetDialogResult;", "", "Landroid/os/Parcelable;", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacProblemBottomSheetDialogResult implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<IacProblemBottomSheetDialogResult> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public static final IacProblemBottomSheetDialogResult f168845b;

    /* renamed from: c, reason: collision with root package name */
    public static final IacProblemBottomSheetDialogResult f168846c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ IacProblemBottomSheetDialogResult[] f168847d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f168848e;

    static {
        IacProblemBottomSheetDialogResult iacProblemBottomSheetDialogResult = new IacProblemBottomSheetDialogResult("CLOSE", 0);
        f168845b = iacProblemBottomSheetDialogResult;
        IacProblemBottomSheetDialogResult iacProblemBottomSheetDialogResult2 = new IacProblemBottomSheetDialogResult("ON_BOARDING_CLICK", 1);
        f168846c = iacProblemBottomSheetDialogResult2;
        IacProblemBottomSheetDialogResult[] iacProblemBottomSheetDialogResultArr = {iacProblemBottomSheetDialogResult, iacProblemBottomSheetDialogResult2};
        f168847d = iacProblemBottomSheetDialogResultArr;
        f168848e = kotlin.enums.c.a(iacProblemBottomSheetDialogResultArr);
        CREATOR = new Parcelable.Creator<IacProblemBottomSheetDialogResult>() { // from class: com.avito.android.iac_problems.impl_module.problems_bottom_sheet.IacProblemBottomSheetDialogResult.a
            @Override // android.os.Parcelable.Creator
            public final IacProblemBottomSheetDialogResult createFromParcel(Parcel parcel) {
                return IacProblemBottomSheetDialogResult.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IacProblemBottomSheetDialogResult[] newArray(int i12) {
                return new IacProblemBottomSheetDialogResult[i12];
            }
        };
    }

    public IacProblemBottomSheetDialogResult() {
        throw null;
    }

    public static IacProblemBottomSheetDialogResult valueOf(String str) {
        return (IacProblemBottomSheetDialogResult) Enum.valueOf(IacProblemBottomSheetDialogResult.class, str);
    }

    public static IacProblemBottomSheetDialogResult[] values() {
        return (IacProblemBottomSheetDialogResult[]) f168847d.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(name());
    }
}
