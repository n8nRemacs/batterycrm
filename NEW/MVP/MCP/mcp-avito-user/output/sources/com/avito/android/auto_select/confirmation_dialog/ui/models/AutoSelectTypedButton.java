package com.avito.android.auto_select.confirmation_dialog.ui.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.auto_select_core.ui.models.AutoSelectButtonStyle;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: AutoSelectConfirmationDialogContent.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_select/confirmation_dialog/ui/models/AutoSelectTypedButton;", "Landroid/os/Parcelable;", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AutoSelectTypedButton implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoSelectTypedButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f95924b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AutoSelectButtonType f95925c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AutoSelectButtonStyle f95926d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f95927e;

    /* compiled from: AutoSelectConfirmationDialogContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectTypedButton> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectTypedButton createFromParcel(Parcel parcel) {
            return new AutoSelectTypedButton(parcel.readString(), parcel.readInt() == 0 ? null : AutoSelectButtonType.valueOf(parcel.readString()), parcel.readInt() != 0 ? AutoSelectButtonStyle.valueOf(parcel.readString()) : null, (DeepLink) parcel.readParcelable(AutoSelectTypedButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectTypedButton[] newArray(int i12) {
            return new AutoSelectTypedButton[i12];
        }
    }

    public AutoSelectTypedButton(@k String str, @l AutoSelectButtonType autoSelectButtonType, @l AutoSelectButtonStyle autoSelectButtonStyle, @l DeepLink deepLink) {
        this.f95924b = str;
        this.f95925c = autoSelectButtonType;
        this.f95926d = autoSelectButtonStyle;
        this.f95927e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f95924b);
        AutoSelectButtonType autoSelectButtonType = this.f95925c;
        if (autoSelectButtonType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(autoSelectButtonType.name());
        }
        AutoSelectButtonStyle autoSelectButtonStyle = this.f95926d;
        if (autoSelectButtonStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(autoSelectButtonStyle.name());
        }
        parcel.writeParcelable(this.f95927e, i12);
    }
}
