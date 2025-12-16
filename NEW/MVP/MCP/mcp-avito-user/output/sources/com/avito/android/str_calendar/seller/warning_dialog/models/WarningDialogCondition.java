package com.avito.android.str_calendar.seller.warning_dialog.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WarningDialogData.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/warning_dialog/models/WarningDialogCondition;", "Landroid/os/Parcelable;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class WarningDialogCondition implements Parcelable {

    @k
    public static final Parcelable.Creator<WarningDialogCondition> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final UniversalImage f288090b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f288091c;

    /* compiled from: WarningDialogData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WarningDialogCondition> {
        @Override // android.os.Parcelable.Creator
        public final WarningDialogCondition createFromParcel(Parcel parcel) {
            return new WarningDialogCondition((UniversalImage) parcel.readParcelable(WarningDialogCondition.class.getClassLoader()), (AttributedText) parcel.readParcelable(WarningDialogCondition.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WarningDialogCondition[] newArray(int i12) {
            return new WarningDialogCondition[i12];
        }
    }

    public WarningDialogCondition(@l UniversalImage universalImage, @k AttributedText attributedText) {
        this.f288090b = universalImage;
        this.f288091c = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WarningDialogCondition)) {
            return false;
        }
        WarningDialogCondition warningDialogCondition = (WarningDialogCondition) obj;
        return L.f(this.f288090b, warningDialogCondition.f288090b) && L.f(this.f288091c, warningDialogCondition.f288091c);
    }

    public final int hashCode() {
        UniversalImage universalImage = this.f288090b;
        return this.f288091c.hashCode() + ((universalImage == null ? 0 : universalImage.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WarningDialogCondition(image=");
        sb2.append(this.f288090b);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f288091c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f288090b, i12);
        parcel.writeParcelable(this.f288091c, i12);
    }
}
