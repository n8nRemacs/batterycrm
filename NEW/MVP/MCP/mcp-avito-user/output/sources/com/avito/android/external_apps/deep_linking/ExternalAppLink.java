package com.avito.android.external_apps.deep_linking;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: ExternalAppLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/external_apps/deep_linking/ExternalAppLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_external-apps_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class ExternalAppLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ExternalAppLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Uri f155024b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Uri f155025c;

    /* compiled from: ExternalAppLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExternalAppLink> {
        @Override // android.os.Parcelable.Creator
        public final ExternalAppLink createFromParcel(Parcel parcel) {
            return new ExternalAppLink((Uri) parcel.readParcelable(ExternalAppLink.class.getClassLoader()), (Uri) parcel.readParcelable(ExternalAppLink.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ExternalAppLink[] newArray(int i12) {
            return new ExternalAppLink[i12];
        }
    }

    public ExternalAppLink(@Y61.k Uri uri, @Y61.l Uri uri2) {
        this.f155024b = uri;
        this.f155025c = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f155024b, i12);
        parcel.writeParcelable(this.f155025c, i12);
    }

    public /* synthetic */ ExternalAppLink(Uri uri, Uri uri2, int i12, C42822w c42822w) {
        this(uri, (i12 & 2) != 0 ? null : uri2);
    }
}
