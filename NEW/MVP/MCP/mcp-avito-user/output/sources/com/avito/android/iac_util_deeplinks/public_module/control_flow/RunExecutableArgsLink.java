package com.avito.android.iac_util_deeplinks.public_module.control_flow;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: RunExecutableArgsLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/control_flow/RunExecutableArgsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class RunExecutableArgsLink extends DeepLink {

    @k
    public static final Parcelable.Creator<RunExecutableArgsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f169290b;

    /* compiled from: RunExecutableArgsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RunExecutableArgsLink> {
        @Override // android.os.Parcelable.Creator
        public final RunExecutableArgsLink createFromParcel(Parcel parcel) {
            return new RunExecutableArgsLink(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final RunExecutableArgsLink[] newArray(int i12) {
            return new RunExecutableArgsLink[i12];
        }
    }

    public RunExecutableArgsLink(@k ArrayList arrayList) {
        this.f169290b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RunExecutableArgsLink) && L.f(this.f169290b, ((RunExecutableArgsLink) obj).f169290b);
    }

    public final int hashCode() {
        return this.f169290b.hashCode();
    }

    @k
    public final String toString() {
        return e.p(new StringBuilder("RunExecutableArgsLink(keys="), this.f169290b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeStringList(this.f169290b);
    }
}
