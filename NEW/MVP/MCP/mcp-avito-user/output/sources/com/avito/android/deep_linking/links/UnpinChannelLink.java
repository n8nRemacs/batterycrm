package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: UnpinChannelLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/UnpinChannelLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class UnpinChannelLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<UnpinChannelLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133768b;

    /* compiled from: UnpinChannelLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UnpinChannelLink> {
        @Override // android.os.Parcelable.Creator
        public final UnpinChannelLink createFromParcel(Parcel parcel) {
            return new UnpinChannelLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UnpinChannelLink[] newArray(int i12) {
            return new UnpinChannelLink[i12];
        }
    }

    /* compiled from: UnpinChannelLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/UnpinChannelLink$b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/deep_linking/links/UnpinChannelLink$b$a;", "Lcom/avito/android/deep_linking/links/UnpinChannelLink$b$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: UnpinChannelLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/UnpinChannelLink$b$a;", "Lcom/avito/android/deep_linking/links/UnpinChannelLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133769b = new a();
        }

        /* compiled from: UnpinChannelLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/UnpinChannelLink$b$b;", "Lcom/avito/android/deep_linking/links/UnpinChannelLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.UnpinChannelLink$b$b, reason: collision with other inner class name */
        public static final class C4018b implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C4018b f133770b = new C4018b();
        }
    }

    public UnpinChannelLink(@Y61.k String str) {
        this.f133768b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnpinChannelLink) && kotlin.jvm.internal.L.f(this.f133768b, ((UnpinChannelLink) obj).f133768b);
    }

    public final int hashCode() {
        return this.f133768b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("UnpinChannelLink(channelId="), this.f133768b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133768b);
    }
}
