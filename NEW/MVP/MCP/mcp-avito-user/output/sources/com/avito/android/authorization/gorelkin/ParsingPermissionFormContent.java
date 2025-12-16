package com.avito.android.authorization.gorelkin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ParsingPermissionFormContent.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/gorelkin/ParsingPermissionFormContent;", "Landroid/os/Parcelable;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ParsingPermissionFormContent implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ParsingPermissionFormContent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f93865b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f93866c;

    /* compiled from: ParsingPermissionFormContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ParsingPermissionFormContent> {
        @Override // android.os.Parcelable.Creator
        public final ParsingPermissionFormContent createFromParcel(Parcel parcel) {
            return new ParsingPermissionFormContent(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ParsingPermissionFormContent[] newArray(int i12) {
            return new ParsingPermissionFormContent[i12];
        }
    }

    public ParsingPermissionFormContent(@Y61.l String str, @Y61.l String str2) {
        this.f93865b = str;
        this.f93866c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParsingPermissionFormContent)) {
            return false;
        }
        ParsingPermissionFormContent parsingPermissionFormContent = (ParsingPermissionFormContent) obj;
        return L.f(this.f93865b, parsingPermissionFormContent.f93865b) && L.f(this.f93866c, parsingPermissionFormContent.f93866c);
    }

    public final int hashCode() {
        String str = this.f93865b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f93866c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParsingPermissionFormContent(name=");
        sb2.append(this.f93865b);
        sb2.append(", phone=");
        return C22026a.c(sb2, this.f93866c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f93865b);
        parcel.writeString(this.f93866c);
    }
}
