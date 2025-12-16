package com.avito.android.profile_vk_linking.common.deep_linking;

import Ku.AbstractC14350a;
import Y61.k;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: ProfileVkLinkingGroupManagementLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_vk_linking/common/deep_linking/ProfileVkLinkingGroupManagementLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "b", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes16.dex */
public final class ProfileVkLinkingGroupManagementLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ProfileVkLinkingGroupManagementLink> CREATOR = new a();

    /* compiled from: ProfileVkLinkingGroupManagementLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileVkLinkingGroupManagementLink> {
        @Override // android.os.Parcelable.Creator
        public final ProfileVkLinkingGroupManagementLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new ProfileVkLinkingGroupManagementLink();
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileVkLinkingGroupManagementLink[] newArray(int i12) {
            return new ProfileVkLinkingGroupManagementLink[i12];
        }
    }

    /* compiled from: ProfileVkLinkingGroupManagementLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_vk_linking/common/deep_linking/ProfileVkLinkingGroupManagementLink$b;", "LKu/a;", "Lcom/avito/android/profile_vk_linking/common/deep_linking/ProfileVkLinkingGroupManagementLink;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractC14350a<ProfileVkLinkingGroupManagementLink> {
        @Override // Ku.AbstractC14350a
        public final DeepLink r(Uri uri, Gson gson, x xVar) {
            return new ProfileVkLinkingGroupManagementLink();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
