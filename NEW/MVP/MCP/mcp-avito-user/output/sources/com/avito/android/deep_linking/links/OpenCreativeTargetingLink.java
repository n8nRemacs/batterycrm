package com.avito.android.deep_linking.links;

import Ku.AbstractC14350a;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.Gson;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: OpenCreativeTargetingLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/OpenCreativeTargetingLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class OpenCreativeTargetingLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<OpenCreativeTargetingLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133525b;

    /* compiled from: OpenCreativeTargetingLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OpenCreativeTargetingLink> {
        @Override // android.os.Parcelable.Creator
        public final OpenCreativeTargetingLink createFromParcel(Parcel parcel) {
            return new OpenCreativeTargetingLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OpenCreativeTargetingLink[] newArray(int i12) {
            return new OpenCreativeTargetingLink[i12];
        }
    }

    /* compiled from: OpenCreativeTargetingLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/OpenCreativeTargetingLink$b;", "LKu/a;", "Lcom/avito/android/deep_linking/links/OpenCreativeTargetingLink;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends AbstractC14350a<OpenCreativeTargetingLink> {
        @Override // Ku.AbstractC14350a
        public final DeepLink r(Uri uri, Gson gson, com.avito.android.deep_linking.x xVar) {
            return new OpenCreativeTargetingLink(Ku.i.p(uri, "creativeId"));
        }
    }

    public OpenCreativeTargetingLink(@Y61.k String str) {
        this.f133525b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OpenCreativeTargetingLink) && kotlin.jvm.internal.L.f(this.f133525b, ((OpenCreativeTargetingLink) obj).f133525b);
    }

    public final int hashCode() {
        return this.f133525b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("OpenCreativeTargetingLink(creativeId="), this.f133525b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133525b);
    }
}
