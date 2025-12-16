package com.avito.android.early_access.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessState.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/ButtonContent;", "Landroid/os/Parcelable;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ButtonContent implements Parcelable {

    @k
    public static final Parcelable.Creator<ButtonContent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f145455b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f145456c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f145457d;

    /* compiled from: EarlyAccessState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ButtonContent> {
        @Override // android.os.Parcelable.Creator
        public final ButtonContent createFromParcel(Parcel parcel) {
            return new ButtonContent(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonContent[] newArray(int i12) {
            return new ButtonContent[i12];
        }
    }

    public ButtonContent(@k String str, @l String str2, @l String str3) {
        this.f145455b = str;
        this.f145456c = str2;
        this.f145457d = str3;
    }

    public static ButtonContent a(ButtonContent buttonContent, String str, String str2, int i12) {
        if ((i12 & 1) != 0) {
            str = buttonContent.f145455b;
        }
        String str3 = buttonContent.f145456c;
        if ((i12 & 4) != 0) {
            str2 = buttonContent.f145457d;
        }
        buttonContent.getClass();
        return new ButtonContent(str, str3, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonContent)) {
            return false;
        }
        ButtonContent buttonContent = (ButtonContent) obj;
        return L.f(this.f145455b, buttonContent.f145455b) && L.f(this.f145456c, buttonContent.f145456c) && L.f(this.f145457d, buttonContent.f145457d);
    }

    public final int hashCode() {
        int iHashCode = this.f145455b.hashCode() * 31;
        String str = this.f145456c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f145457d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonContent(text=");
        sb2.append(this.f145455b);
        sb2.append(", action=");
        sb2.append(this.f145456c);
        sb2.append(", subText=");
        return C22026a.c(sb2, this.f145457d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f145455b);
        parcel.writeString(this.f145456c);
        parcel.writeString(this.f145457d);
    }

    public /* synthetic */ ButtonContent(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3);
    }
}
