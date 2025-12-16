package com.avito.android.gig_apply;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: GigApplyDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/GigApplyDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_gig_apply-screen_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class GigApplyDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<GigApplyDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f159516b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f159517c;

    /* compiled from: GigApplyDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigApplyDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final GigApplyDeeplink createFromParcel(Parcel parcel) {
            return new GigApplyDeeplink(parcel.readLong(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final GigApplyDeeplink[] newArray(int i12) {
            return new GigApplyDeeplink[i12];
        }
    }

    public /* synthetic */ GigApplyDeeplink(long j12, boolean z12, int i12, C42822w c42822w) {
        this(j12, (i12 & 2) != 0 ? false : z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f159516b);
        parcel.writeInt(this.f159517c ? 1 : 0);
    }

    public GigApplyDeeplink(long j12, boolean z12) {
        this.f159516b = j12;
        this.f159517c = z12;
    }
}
