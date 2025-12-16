package com.avito.android.profile_management_core.edit_text_field;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FormattedAlertSettings.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_management_core/edit_text_field/FormattedAlertSettings;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_profile-management-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class FormattedAlertSettings implements Parcelable {

    @k
    public static final Parcelable.Creator<FormattedAlertSettings> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f226609b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f226610c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f226611d;

    /* compiled from: FormattedAlertSettings.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FormattedAlertSettings> {
        @Override // android.os.Parcelable.Creator
        public final FormattedAlertSettings createFromParcel(Parcel parcel) {
            return new FormattedAlertSettings(parcel.readString(), (AttributedText) parcel.readParcelable(FormattedAlertSettings.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FormattedAlertSettings[] newArray(int i12) {
            return new FormattedAlertSettings[i12];
        }
    }

    public FormattedAlertSettings(@k String str, @k AttributedText attributedText, @k String str2) {
        this.f226609b = str;
        this.f226610c = attributedText;
        this.f226611d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FormattedAlertSettings)) {
            return false;
        }
        FormattedAlertSettings formattedAlertSettings = (FormattedAlertSettings) obj;
        return L.f(this.f226609b, formattedAlertSettings.f226609b) && L.f(this.f226610c, formattedAlertSettings.f226610c) && L.f(this.f226611d, formattedAlertSettings.f226611d);
    }

    public final int hashCode() {
        return this.f226611d.hashCode() + com.avito.android.actions_sheet.a.b(this.f226609b.hashCode() * 31, 31, this.f226610c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FormattedAlertSettings(title=");
        sb2.append(this.f226609b);
        sb2.append(", subtitle=");
        sb2.append(this.f226610c);
        sb2.append(", buttonTitle=");
        return C22026a.c(sb2, this.f226611d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f226609b);
        parcel.writeParcelable(this.f226610c, i12);
        parcel.writeString(this.f226611d);
    }
}
