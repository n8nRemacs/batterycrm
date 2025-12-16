package com.avito.android.deep_linking.links;

import Ku.AbstractC14350a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: ProfileLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/ProfileLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class ProfileLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<ProfileLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f133612b;

    /* compiled from: ProfileLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileLink> {
        @Override // android.os.Parcelable.Creator
        public final ProfileLink createFromParcel(Parcel parcel) {
            return new ProfileLink(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileLink[] newArray(int i12) {
            return new ProfileLink[i12];
        }
    }

    /* compiled from: ProfileLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/ProfileLink$b;", "LKu/a;", "Lcom/avito/android/deep_linking/links/ProfileLink;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractC14350a<ProfileLink> {
        @Override // Ku.AbstractC14350a
        public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) {
            return new ProfileLink(Boolean.parseBoolean(uri.getQueryParameter("resetFlow")));
        }
    }

    public ProfileLink() {
        this(false, 1, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f133612b ? 1 : 0);
    }

    public /* synthetic */ ProfileLink(boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12);
    }

    public ProfileLink(boolean z12) {
        this.f133612b = z12;
    }
}
