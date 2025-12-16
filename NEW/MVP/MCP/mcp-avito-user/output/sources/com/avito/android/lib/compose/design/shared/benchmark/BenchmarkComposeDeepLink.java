package com.avito.android.lib.compose.design.shared.benchmark;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: BenchmarkComposeDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/compose/design/shared/benchmark/BenchmarkComposeDeepLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_design-modules_compose_shared_benchmark_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class BenchmarkComposeDeepLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<BenchmarkComposeDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f177621b;

    /* compiled from: BenchmarkComposeDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BenchmarkComposeDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final BenchmarkComposeDeepLink createFromParcel(Parcel parcel) {
            return new BenchmarkComposeDeepLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BenchmarkComposeDeepLink[] newArray(int i12) {
            return new BenchmarkComposeDeepLink[i12];
        }
    }

    public BenchmarkComposeDeepLink(@Y61.l String str) {
        this.f177621b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BenchmarkComposeDeepLink) && L.f(this.f177621b, ((BenchmarkComposeDeepLink) obj).f177621b);
    }

    public final int hashCode() {
        String str = this.f177621b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("BenchmarkComposeDeepLink(componentName="), this.f177621b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f177621b);
    }
}
