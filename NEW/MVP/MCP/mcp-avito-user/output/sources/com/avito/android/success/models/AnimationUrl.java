package com.avito.android.success.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SuccessDataResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/success/models/AnimationUrl;", "Landroid/os/Parcelable;", "", "value", "valueDark", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "getValueDark", "_avito_success_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AnimationUrl implements Parcelable {

    @k
    public static final Parcelable.Creator<AnimationUrl> CREATOR = new a();

    @c("value")
    @k
    private final String value;

    @c("valueDark")
    @l
    private final String valueDark;

    /* compiled from: SuccessDataResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AnimationUrl> {
        @Override // android.os.Parcelable.Creator
        public final AnimationUrl createFromParcel(Parcel parcel) {
            return new AnimationUrl(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AnimationUrl[] newArray(int i12) {
            return new AnimationUrl[i12];
        }
    }

    public AnimationUrl(@k String str, @l String str2) {
        this.value = str;
        this.valueDark = str2;
    }

    @k
    public final String a(boolean z12) {
        if (z12) {
            return this.value;
        }
        String str = this.valueDark;
        return str == null ? this.value : str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimationUrl)) {
            return false;
        }
        AnimationUrl animationUrl = (AnimationUrl) obj;
        return L.f(this.value, animationUrl.value) && L.f(this.valueDark, animationUrl.valueDark);
    }

    public final int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        String str = this.valueDark;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnimationUrl(value=");
        sb2.append(this.value);
        sb2.append(", valueDark=");
        return C22026a.c(sb2, this.valueDark, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.value);
        parcel.writeString(this.valueDark);
    }
}
