package com.avito.android.iac_util_deeplinks.public_module.run_once;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: RunOnceLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/run_once/RunOnceLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class RunOnceLink extends DeepLink {

    @k
    public static final Parcelable.Creator<RunOnceLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f169325b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Boolean f169326c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f169327d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f169328e;

    /* compiled from: RunOnceLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RunOnceLink> {
        @Override // android.os.Parcelable.Creator
        public final RunOnceLink createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RunOnceLink(string, boolValueOf, (DeepLink) parcel.readParcelable(RunOnceLink.class.getClassLoader()), (DeepLink) parcel.readParcelable(RunOnceLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RunOnceLink[] newArray(int i12) {
            return new RunOnceLink[i12];
        }
    }

    /* compiled from: RunOnceLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/public_module/run_once/RunOnceLink$b;", "LJu/c$a;", "<init>", "()V", "_avito_iac-util-deeplinks_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC14249c.a {
    }

    public /* synthetic */ RunOnceLink(String str, Boolean bool, DeepLink deepLink, DeepLink deepLink2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : bool, (i12 & 4) != 0 ? null : deepLink, (i12 & 8) != 0 ? null : deepLink2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RunOnceLink)) {
            return false;
        }
        RunOnceLink runOnceLink = (RunOnceLink) obj;
        return L.f(this.f169325b, runOnceLink.f169325b) && L.f(this.f169326c, runOnceLink.f169326c) && L.f(this.f169327d, runOnceLink.f169327d) && L.f(this.f169328e, runOnceLink.f169328e);
    }

    public final int hashCode() {
        int iHashCode = this.f169325b.hashCode() * 31;
        Boolean bool = this.f169326c;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        DeepLink deepLink = this.f169327d;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        DeepLink deepLink2 = this.f169328e;
        return iHashCode3 + (deepLink2 != null ? deepLink2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RunOnceLink(key=");
        sb2.append(this.f169325b);
        sb2.append(", clearKeyOnLogout=");
        sb2.append(this.f169326c);
        sb2.append(", keyNotExistLink=");
        sb2.append(this.f169327d);
        sb2.append(", keyExistLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f169328e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f169325b);
        Boolean bool = this.f169326c;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.f169327d, i12);
        parcel.writeParcelable(this.f169328e, i12);
    }

    public RunOnceLink(@k String str, @l Boolean bool, @l DeepLink deepLink, @l DeepLink deepLink2) {
        this.f169325b = str;
        this.f169326c = bool;
        this.f169327d = deepLink;
        this.f169328e = deepLink2;
    }
}
