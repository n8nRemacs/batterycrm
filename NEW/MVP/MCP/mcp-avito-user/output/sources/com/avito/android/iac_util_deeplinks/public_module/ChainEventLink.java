package com.avito.android.iac_util_deeplinks.public_module;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ChainEventLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class ChainEventLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ChainEventLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f169242b;

    /* compiled from: ChainEventLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChainEventLink> {
        @Override // android.os.Parcelable.Creator
        public final ChainEventLink createFromParcel(Parcel parcel) {
            return new ChainEventLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChainEventLink[] newArray(int i12) {
            return new ChainEventLink[i12];
        }
    }

    /* compiled from: ChainEventLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink$b;", "LJu/c$b;", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f169243b;

        public b(@k String str) {
            this.f169243b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f169243b, ((b) obj).f169243b);
        }

        public final int hashCode() {
            return this.f169243b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LinkResult(eventValue="), this.f169243b, ')');
        }
    }

    public ChainEventLink(@k String str) {
        this.f169242b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChainEventLink) && L.f(this.f169242b, ((ChainEventLink) obj).f169242b);
    }

    public final int hashCode() {
        return this.f169242b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ChainEventLink(eventValue="), this.f169242b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f169242b);
    }
}
