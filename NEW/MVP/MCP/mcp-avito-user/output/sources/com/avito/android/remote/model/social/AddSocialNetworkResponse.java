package com.avito.android.remote.model.social;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AddSocialNetworkResponse.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/social/AddSocialNetworkResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/social/SocialNetwork;", "socialNetwork", "<init>", "(Lcom/avito/android/remote/model/social/SocialNetwork;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/social/SocialNetwork;", "getSocialNetwork", "()Lcom/avito/android/remote/model/social/SocialNetwork;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AddSocialNetworkResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<AddSocialNetworkResponse> CREATOR = new Creator();

    @c("socialNetwork")
    @k
    private final SocialNetwork socialNetwork;

    /* compiled from: AddSocialNetworkResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AddSocialNetworkResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AddSocialNetworkResponse createFromParcel(@k Parcel parcel) {
            return new AddSocialNetworkResponse((SocialNetwork) parcel.readParcelable(AddSocialNetworkResponse.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AddSocialNetworkResponse[] newArray(int i12) {
            return new AddSocialNetworkResponse[i12];
        }
    }

    public AddSocialNetworkResponse(@k SocialNetwork socialNetwork) {
        this.socialNetwork = socialNetwork;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final SocialNetwork getSocialNetwork() {
        return this.socialNetwork;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.socialNetwork, flags);
    }
}
