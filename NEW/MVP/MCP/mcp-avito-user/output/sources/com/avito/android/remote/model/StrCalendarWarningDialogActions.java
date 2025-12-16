package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.str_booking.network.models.common.Button;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerCalendarParametersUpdateResponse.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/StrCalendarWarningDialogActions;", "Landroid/os/Parcelable;", "Lcom/avito/android/str_booking/network/models/common/Button;", "acceptButton", "denyButton", "<init>", "(Lcom/avito/android/str_booking/network/models/common/Button;Lcom/avito/android/str_booking/network/models/common/Button;)V", "component1", "()Lcom/avito/android/str_booking/network/models/common/Button;", "component2", "copy", "(Lcom/avito/android/str_booking/network/models/common/Button;Lcom/avito/android/str_booking/network/models/common/Button;)Lcom/avito/android/remote/model/StrCalendarWarningDialogActions;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/str_booking/network/models/common/Button;", "getAcceptButton", "getDenyButton", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrCalendarWarningDialogActions implements Parcelable {

    @k
    public static final Parcelable.Creator<StrCalendarWarningDialogActions> CREATOR = new Creator();

    @c("accept")
    @l
    private final Button acceptButton;

    @c("deny")
    @l
    private final Button denyButton;

    /* compiled from: StrSellerCalendarParametersUpdateResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrCalendarWarningDialogActions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrCalendarWarningDialogActions createFromParcel(@k Parcel parcel) {
            return new StrCalendarWarningDialogActions((Button) parcel.readParcelable(StrCalendarWarningDialogActions.class.getClassLoader()), (Button) parcel.readParcelable(StrCalendarWarningDialogActions.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrCalendarWarningDialogActions[] newArray(int i12) {
            return new StrCalendarWarningDialogActions[i12];
        }
    }

    public StrCalendarWarningDialogActions(@l Button button, @l Button button2) {
        this.acceptButton = button;
        this.denyButton = button2;
    }

    public static /* synthetic */ StrCalendarWarningDialogActions copy$default(StrCalendarWarningDialogActions strCalendarWarningDialogActions, Button button, Button button2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            button = strCalendarWarningDialogActions.acceptButton;
        }
        if ((i12 & 2) != 0) {
            button2 = strCalendarWarningDialogActions.denyButton;
        }
        return strCalendarWarningDialogActions.copy(button, button2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Button getAcceptButton() {
        return this.acceptButton;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Button getDenyButton() {
        return this.denyButton;
    }

    @k
    public final StrCalendarWarningDialogActions copy(@l Button acceptButton, @l Button denyButton) {
        return new StrCalendarWarningDialogActions(acceptButton, denyButton);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrCalendarWarningDialogActions)) {
            return false;
        }
        StrCalendarWarningDialogActions strCalendarWarningDialogActions = (StrCalendarWarningDialogActions) other;
        return L.f(this.acceptButton, strCalendarWarningDialogActions.acceptButton) && L.f(this.denyButton, strCalendarWarningDialogActions.denyButton);
    }

    @l
    public final Button getAcceptButton() {
        return this.acceptButton;
    }

    @l
    public final Button getDenyButton() {
        return this.denyButton;
    }

    public int hashCode() {
        Button button = this.acceptButton;
        int iHashCode = (button == null ? 0 : button.hashCode()) * 31;
        Button button2 = this.denyButton;
        return iHashCode + (button2 != null ? button2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "StrCalendarWarningDialogActions(acceptButton=" + this.acceptButton + ", denyButton=" + this.denyButton + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.acceptButton, flags);
        parcel.writeParcelable(this.denyButton, flags);
    }
}
