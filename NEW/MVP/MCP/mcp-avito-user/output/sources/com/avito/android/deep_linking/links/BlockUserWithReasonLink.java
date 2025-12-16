package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: BlockUserWithReasonLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/BlockUserWithReasonLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class BlockUserWithReasonLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<BlockUserWithReasonLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133051b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133052c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133053d;

    /* compiled from: BlockUserWithReasonLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BlockUserWithReasonLink> {
        @Override // android.os.Parcelable.Creator
        public final BlockUserWithReasonLink createFromParcel(Parcel parcel) {
            return new BlockUserWithReasonLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BlockUserWithReasonLink[] newArray(int i12) {
            return new BlockUserWithReasonLink[i12];
        }
    }

    public BlockUserWithReasonLink(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
        this.f133051b = str;
        this.f133052c = str2;
        this.f133053d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockUserWithReasonLink)) {
            return false;
        }
        BlockUserWithReasonLink blockUserWithReasonLink = (BlockUserWithReasonLink) obj;
        return kotlin.jvm.internal.L.f(this.f133051b, blockUserWithReasonLink.f133051b) && kotlin.jvm.internal.L.f(this.f133052c, blockUserWithReasonLink.f133052c) && kotlin.jvm.internal.L.f(this.f133053d, blockUserWithReasonLink.f133053d);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(this.f133051b.hashCode() * 31, 31, this.f133052c);
        String str = this.f133053d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlockUserWithReasonLink(userId=");
        sb2.append(this.f133051b);
        sb2.append(", channelId=");
        sb2.append(this.f133052c);
        sb2.append(", itemId=");
        return C22026a.c(sb2, this.f133053d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133051b);
        parcel.writeString(this.f133052c);
        parcel.writeString(this.f133053d);
    }
}
