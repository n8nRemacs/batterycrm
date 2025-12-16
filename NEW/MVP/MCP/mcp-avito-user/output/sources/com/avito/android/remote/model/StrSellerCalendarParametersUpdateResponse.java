package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerCalendarParametersUpdateResponse.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\r¨\u0006&"}, d2 = {"Lcom/avito/android/remote/model/StrSellerCalendarParametersUpdateResponse;", "Landroid/os/Parcelable;", "", "success", "shouldShowUxf", "Lcom/avito/android/remote/model/StrSellerCalendarParametersWarningDialog;", "warningDialog", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/StrSellerCalendarParametersWarningDialog;)V", "component1", "()Ljava/lang/Boolean;", "component2", "component3", "()Lcom/avito/android/remote/model/StrSellerCalendarParametersWarningDialog;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/StrSellerCalendarParametersWarningDialog;)Lcom/avito/android/remote/model/StrSellerCalendarParametersUpdateResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getSuccess", "getShouldShowUxf", "Lcom/avito/android/remote/model/StrSellerCalendarParametersWarningDialog;", "getWarningDialog", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrSellerCalendarParametersUpdateResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<StrSellerCalendarParametersUpdateResponse> CREATOR = new Creator();

    @c("shouldShowUxf")
    @l
    private final Boolean shouldShowUxf;

    @c("success")
    @l
    private final Boolean success;

    @c("warningDialog")
    @l
    private final StrSellerCalendarParametersWarningDialog warningDialog;

    /* compiled from: StrSellerCalendarParametersUpdateResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrSellerCalendarParametersUpdateResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerCalendarParametersUpdateResponse createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StrSellerCalendarParametersUpdateResponse(boolValueOf, boolValueOf2, parcel.readInt() != 0 ? StrSellerCalendarParametersWarningDialog.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrSellerCalendarParametersUpdateResponse[] newArray(int i12) {
            return new StrSellerCalendarParametersUpdateResponse[i12];
        }
    }

    public StrSellerCalendarParametersUpdateResponse(@l Boolean bool, @l Boolean bool2, @l StrSellerCalendarParametersWarningDialog strSellerCalendarParametersWarningDialog) {
        this.success = bool;
        this.shouldShowUxf = bool2;
        this.warningDialog = strSellerCalendarParametersWarningDialog;
    }

    public static /* synthetic */ StrSellerCalendarParametersUpdateResponse copy$default(StrSellerCalendarParametersUpdateResponse strSellerCalendarParametersUpdateResponse, Boolean bool, Boolean bool2, StrSellerCalendarParametersWarningDialog strSellerCalendarParametersWarningDialog, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            bool = strSellerCalendarParametersUpdateResponse.success;
        }
        if ((i12 & 2) != 0) {
            bool2 = strSellerCalendarParametersUpdateResponse.shouldShowUxf;
        }
        if ((i12 & 4) != 0) {
            strSellerCalendarParametersWarningDialog = strSellerCalendarParametersUpdateResponse.warningDialog;
        }
        return strSellerCalendarParametersUpdateResponse.copy(bool, bool2, strSellerCalendarParametersWarningDialog);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Boolean getSuccess() {
        return this.success;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getShouldShowUxf() {
        return this.shouldShowUxf;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final StrSellerCalendarParametersWarningDialog getWarningDialog() {
        return this.warningDialog;
    }

    @k
    public final StrSellerCalendarParametersUpdateResponse copy(@l Boolean success, @l Boolean shouldShowUxf, @l StrSellerCalendarParametersWarningDialog warningDialog) {
        return new StrSellerCalendarParametersUpdateResponse(success, shouldShowUxf, warningDialog);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrSellerCalendarParametersUpdateResponse)) {
            return false;
        }
        StrSellerCalendarParametersUpdateResponse strSellerCalendarParametersUpdateResponse = (StrSellerCalendarParametersUpdateResponse) other;
        return L.f(this.success, strSellerCalendarParametersUpdateResponse.success) && L.f(this.shouldShowUxf, strSellerCalendarParametersUpdateResponse.shouldShowUxf) && L.f(this.warningDialog, strSellerCalendarParametersUpdateResponse.warningDialog);
    }

    @l
    public final Boolean getShouldShowUxf() {
        return this.shouldShowUxf;
    }

    @l
    public final Boolean getSuccess() {
        return this.success;
    }

    @l
    public final StrSellerCalendarParametersWarningDialog getWarningDialog() {
        return this.warningDialog;
    }

    public int hashCode() {
        Boolean bool = this.success;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.shouldShowUxf;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        StrSellerCalendarParametersWarningDialog strSellerCalendarParametersWarningDialog = this.warningDialog;
        return iHashCode2 + (strSellerCalendarParametersWarningDialog != null ? strSellerCalendarParametersWarningDialog.hashCode() : 0);
    }

    @k
    public String toString() {
        return "StrSellerCalendarParametersUpdateResponse(success=" + this.success + ", shouldShowUxf=" + this.shouldShowUxf + ", warningDialog=" + this.warningDialog + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Boolean bool = this.success;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.shouldShowUxf;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        StrSellerCalendarParametersWarningDialog strSellerCalendarParametersWarningDialog = this.warningDialog;
        if (strSellerCalendarParametersWarningDialog == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strSellerCalendarParametersWarningDialog.writeToParcel(parcel, flags);
        }
    }
}
