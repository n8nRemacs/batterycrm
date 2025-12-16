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

/* compiled from: SetFlowResultLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/SetFlowResultLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class SetFlowResultLink extends DeepLink {

    @k
    public static final Parcelable.Creator<SetFlowResultLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f169286b;

    /* compiled from: SetFlowResultLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SetFlowResultLink> {
        @Override // android.os.Parcelable.Creator
        public final SetFlowResultLink createFromParcel(Parcel parcel) {
            return new SetFlowResultLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SetFlowResultLink[] newArray(int i12) {
            return new SetFlowResultLink[i12];
        }
    }

    /* compiled from: SetFlowResultLink.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/SetFlowResultLink$b;", "LJu/c$b;", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f169287b;

        public b(@k String str) {
            this.f169287b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f169287b, ((b) obj).f169287b);
        }

        public final int hashCode() {
            return this.f169287b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("LinkResult(resultKey="), this.f169287b, ')');
        }
    }

    public SetFlowResultLink(@k String str) {
        this.f169286b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetFlowResultLink) && L.f(this.f169286b, ((SetFlowResultLink) obj).f169286b);
    }

    public final int hashCode() {
        return this.f169286b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("SetFlowResultLink(resultKey="), this.f169286b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f169286b);
    }
}
