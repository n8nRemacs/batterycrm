package com.avito.android.serp.adapter.beduin_v2;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinV2Content.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/beduin_v2/BeduinV2Content;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BeduinV2Content implements Parcelable {

    @k
    public static final Parcelable.Creator<BeduinV2Content> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f268992b;

    /* compiled from: BeduinV2Content.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinV2Content> {
        @Override // android.os.Parcelable.Creator
        public final BeduinV2Content createFromParcel(Parcel parcel) {
            return new BeduinV2Content(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinV2Content[] newArray(int i12) {
            return new BeduinV2Content[i12];
        }
    }

    public BeduinV2Content(@k String str) {
        this.f268992b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BeduinV2Content) && L.f(this.f268992b, ((BeduinV2Content) obj).f268992b);
    }

    public final int hashCode() {
        return this.f268992b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("BeduinV2Content(json="), this.f268992b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f268992b);
    }
}
