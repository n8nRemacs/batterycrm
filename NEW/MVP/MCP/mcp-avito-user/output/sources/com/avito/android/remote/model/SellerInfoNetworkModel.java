package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConstructorAdvertNetworkModel.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/SellerInfoNetworkModel;", "Landroid/os/Parcelable;", "", "userKey", "Lcom/avito/android/remote/model/Image;", "image", "displayName", "name", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUserKey", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "getDisplayName", "getName", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SellerInfoNetworkModel implements Parcelable {

    @k
    public static final Parcelable.Creator<SellerInfoNetworkModel> CREATOR = new Creator();

    @c("displayName")
    @l
    private final String displayName;

    @c("logo")
    @l
    private final Image image;

    @c("name")
    @l
    private final String name;

    @c("userKey")
    @l
    private final String userKey;

    /* compiled from: ConstructorAdvertNetworkModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SellerInfoNetworkModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerInfoNetworkModel createFromParcel(@k Parcel parcel) {
            return new SellerInfoNetworkModel(parcel.readString(), (Image) parcel.readParcelable(SellerInfoNetworkModel.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerInfoNetworkModel[] newArray(int i12) {
            return new SellerInfoNetworkModel[i12];
        }
    }

    public SellerInfoNetworkModel(@l String str, @l Image image, @l String str2, @l String str3) {
        this.userKey = str;
        this.image = image;
        this.displayName = str2;
        this.name = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getDisplayName() {
        return this.displayName;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @l
    public final String getName() {
        return this.name;
    }

    @l
    public final String getUserKey() {
        return this.userKey;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.userKey);
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.displayName);
        parcel.writeString(this.name);
    }

    public /* synthetic */ SellerInfoNetworkModel(String str, Image image, String str2, String str3, int i12, C42822w c42822w) {
        this(str, image, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3);
    }
}
