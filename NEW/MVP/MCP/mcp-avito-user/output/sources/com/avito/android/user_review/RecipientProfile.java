package com.avito.android.user_review;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;

/* compiled from: RecipientProfile.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_review/RecipientProfile;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RecipientProfile implements Parcelable {

    @k
    public static final Parcelable.Creator<RecipientProfile> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f316947b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f316948c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Image f316949d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f316950e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f316951f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f316952g;

    /* compiled from: RecipientProfile.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecipientProfile> {
        @Override // android.os.Parcelable.Creator
        public final RecipientProfile createFromParcel(Parcel parcel) {
            return new RecipientProfile((DeepLink) parcel.readParcelable(RecipientProfile.class.getClassLoader()), (Image) parcel.readParcelable(RecipientProfile.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final RecipientProfile[] newArray(int i12) {
            return new RecipientProfile[i12];
        }
    }

    public RecipientProfile(@l DeepLink deepLink, @l Image image, @k String str, @l String str2, @l String str3, boolean z12) {
        this.f316947b = str;
        this.f316948c = z12;
        this.f316949d = image;
        this.f316950e = deepLink;
        this.f316951f = str2;
        this.f316952g = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f316947b);
        parcel.writeInt(this.f316948c ? 1 : 0);
        parcel.writeParcelable(this.f316949d, i12);
        parcel.writeParcelable(this.f316950e, i12);
        parcel.writeString(this.f316951f);
        parcel.writeString(this.f316952g);
    }
}
