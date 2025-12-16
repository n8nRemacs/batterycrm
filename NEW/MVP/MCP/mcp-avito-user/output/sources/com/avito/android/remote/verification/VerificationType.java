package com.avito.android.remote.verification;

import K51.d;
import X41.g;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationType.kt */
@d
@g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/verification/VerificationType;", "Landroid/os/Parcelable;", "type", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VerificationType implements Parcelable {

    @k
    public static final Parcelable.Creator<VerificationType> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f254401b;

    /* compiled from: VerificationType.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationType> {
        @Override // android.os.Parcelable.Creator
        public final VerificationType createFromParcel(Parcel parcel) {
            return VerificationType.a(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationType[] newArray(int i12) {
            return new VerificationType[i12];
        }
    }

    private /* synthetic */ VerificationType(String str) {
        this.f254401b = str;
    }

    public static final /* synthetic */ VerificationType a(String str) {
        return new VerificationType(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof VerificationType) {
            return L.f(this.f254401b, ((VerificationType) obj).f254401b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f254401b.hashCode();
    }

    public final String toString() {
        return C22026a.c(new StringBuilder("VerificationType(type="), this.f254401b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f254401b);
    }
}
