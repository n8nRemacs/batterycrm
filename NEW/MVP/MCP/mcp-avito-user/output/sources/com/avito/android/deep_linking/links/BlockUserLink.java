package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: BlockUserLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/BlockUserLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class BlockUserLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<BlockUserLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133048b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133049c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133050d;

    /* compiled from: BlockUserLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BlockUserLink> {
        @Override // android.os.Parcelable.Creator
        public final BlockUserLink createFromParcel(Parcel parcel) {
            return new BlockUserLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BlockUserLink[] newArray(int i12) {
            return new BlockUserLink[i12];
        }
    }

    public BlockUserLink(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
        this.f133048b = str;
        this.f133049c = str2;
        this.f133050d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockUserLink)) {
            return false;
        }
        BlockUserLink blockUserLink = (BlockUserLink) obj;
        return kotlin.jvm.internal.L.f(this.f133048b, blockUserLink.f133048b) && kotlin.jvm.internal.L.f(this.f133049c, blockUserLink.f133049c) && kotlin.jvm.internal.L.f(this.f133050d, blockUserLink.f133050d);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(this.f133048b.hashCode() * 31, 31, this.f133049c);
        String str = this.f133050d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlockUserLink(userId=");
        sb2.append(this.f133048b);
        sb2.append(", channelId=");
        sb2.append(this.f133049c);
        sb2.append(", itemId=");
        return C22026a.c(sb2, this.f133050d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133048b);
        parcel.writeString(this.f133049c);
        parcel.writeString(this.f133050d);
    }
}
