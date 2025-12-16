package com.avito.android.passport.auth_suggest;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PassportAuthSuggestOpenParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/auth_suggest/PassportAuthSuggestOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportAuthSuggestOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<PassportAuthSuggestOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f210941b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f210942c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f210943d;

    /* compiled from: PassportAuthSuggestOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportAuthSuggestOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final PassportAuthSuggestOpenParams createFromParcel(Parcel parcel) {
            return new PassportAuthSuggestOpenParams(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PassportAuthSuggestOpenParams[] newArray(int i12) {
            return new PassportAuthSuggestOpenParams[i12];
        }
    }

    public PassportAuthSuggestOpenParams(@k String str, @l String str2, @k String str3) {
        this.f210941b = str;
        this.f210942c = str2;
        this.f210943d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f210941b);
        parcel.writeString(this.f210942c);
        parcel.writeString(this.f210943d);
    }

    public /* synthetic */ PassportAuthSuggestOpenParams(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, str3);
    }
}
