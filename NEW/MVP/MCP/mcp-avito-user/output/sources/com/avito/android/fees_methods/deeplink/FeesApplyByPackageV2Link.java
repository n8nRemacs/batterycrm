package com.avito.android.fees_methods.deeplink;

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

/* compiled from: FeesApplyByPackageLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/fees_methods/deeplink/FeesApplyByPackageV2Link;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_fees-methods_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final /* data */ class FeesApplyByPackageV2Link extends DeepLink {

    @k
    public static final Parcelable.Creator<FeesApplyByPackageV2Link> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f157940b;

    /* compiled from: FeesApplyByPackageLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FeesApplyByPackageV2Link> {
        @Override // android.os.Parcelable.Creator
        public final FeesApplyByPackageV2Link createFromParcel(Parcel parcel) {
            return new FeesApplyByPackageV2Link(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FeesApplyByPackageV2Link[] newArray(int i12) {
            return new FeesApplyByPackageV2Link[i12];
        }
    }

    /* compiled from: FeesApplyByPackageLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/fees_methods/deeplink/FeesApplyByPackageV2Link$b;", "", "a", "b", "Lcom/avito/android/fees_methods/deeplink/FeesApplyByPackageV2Link$b$a;", "Lcom/avito/android/fees_methods/deeplink/FeesApplyByPackageV2Link$b$b;", "_avito_fees-methods_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: FeesApplyByPackageLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/fees_methods/deeplink/FeesApplyByPackageV2Link$b$a;", "Lcom/avito/android/fees_methods/deeplink/FeesApplyByPackageV2Link$b;", "LJu/c$b;", "<init>", "()V", "_avito_fees-methods_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f157941b = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -570783266;
            }

            @k
            public final String toString() {
                return "Failure";
            }
        }

        /* compiled from: FeesApplyByPackageLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/fees_methods/deeplink/FeesApplyByPackageV2Link$b$b;", "Lcom/avito/android/fees_methods/deeplink/FeesApplyByPackageV2Link$b;", "LJu/c$a;", "<init>", "()V", "_avito_fees-methods_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.fees_methods.deeplink.FeesApplyByPackageV2Link$b$b, reason: collision with other inner class name */
        public static final /* data */ class C4617b implements b, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4617b f157942b = new C4617b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C4617b);
            }

            public final int hashCode() {
                return -1351378857;
            }

            @k
            public final String toString() {
                return "Success";
            }
        }
    }

    public FeesApplyByPackageV2Link(@k String str) {
        this.f157940b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeesApplyByPackageV2Link) && L.f(this.f157940b, ((FeesApplyByPackageV2Link) obj).f157940b);
    }

    public final int hashCode() {
        return this.f157940b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("FeesApplyByPackageV2Link(remoteContext="), this.f157940b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f157940b);
    }
}
