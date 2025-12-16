package com.avito.android;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: SxAddressListLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/SxAddressListRefreshLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes10.dex */
public final class SxAddressListRefreshLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<SxAddressListRefreshLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f67561b;

    /* compiled from: SxAddressListLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SxAddressListRefreshLink> {
        @Override // android.os.Parcelable.Creator
        public final SxAddressListRefreshLink createFromParcel(Parcel parcel) {
            return new SxAddressListRefreshLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SxAddressListRefreshLink[] newArray(int i12) {
            return new SxAddressListRefreshLink[i12];
        }
    }

    /* compiled from: SxAddressListLink.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/SxAddressListRefreshLink$b;", "", "<init>", "()V", "a", "Lcom/avito/android/SxAddressListRefreshLink$b$a;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: SxAddressListLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/SxAddressListRefreshLink$b$a;", "Lcom/avito/android/SxAddressListRefreshLink$b;", "LJu/c$b;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            public final long f67562b;

            public a(long j12) {
                super(null);
                this.f67562b = j12;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public SxAddressListRefreshLink(@Y61.l String str) {
        this.f67561b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f67561b);
    }
}
