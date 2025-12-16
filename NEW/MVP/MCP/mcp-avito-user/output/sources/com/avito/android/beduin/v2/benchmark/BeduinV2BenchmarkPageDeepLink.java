package com.avito.android.beduin.v2.benchmark;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: BeduinV2BenchmarkPageDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/v2/benchmark/BeduinV2BenchmarkPageDeepLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_design-modules_beduin-v2_benchmark_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes11.dex */
public final /* data */ class BeduinV2BenchmarkPageDeepLink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<BeduinV2BenchmarkPageDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f104579b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f104580c;

    /* compiled from: BeduinV2BenchmarkPageDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinV2BenchmarkPageDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final BeduinV2BenchmarkPageDeepLink createFromParcel(Parcel parcel) {
            return new BeduinV2BenchmarkPageDeepLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinV2BenchmarkPageDeepLink[] newArray(int i12) {
            return new BeduinV2BenchmarkPageDeepLink[i12];
        }
    }

    public BeduinV2BenchmarkPageDeepLink(@k String str, @k String str2) {
        this.f104579b = str;
        this.f104580c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinV2BenchmarkPageDeepLink)) {
            return false;
        }
        BeduinV2BenchmarkPageDeepLink beduinV2BenchmarkPageDeepLink = (BeduinV2BenchmarkPageDeepLink) obj;
        return L.f(this.f104579b, beduinV2BenchmarkPageDeepLink.f104579b) && L.f(this.f104580c, beduinV2BenchmarkPageDeepLink.f104580c);
    }

    public final int hashCode() {
        return this.f104580c.hashCode() + (this.f104579b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinV2BenchmarkPageDeepLink(sampleId=");
        sb2.append(this.f104579b);
        sb2.append(", screenName=");
        return C22026a.c(sb2, this.f104580c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f104579b);
        parcel.writeString(this.f104580c);
    }
}
