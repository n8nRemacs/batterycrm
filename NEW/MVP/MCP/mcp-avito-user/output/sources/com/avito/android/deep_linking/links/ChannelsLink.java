package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: ChannelsLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/ChannelsLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class ChannelsLink extends PublicDeeplink {

    @Y61.k
    public static final Parcelable.Creator<ChannelsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f133103b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133104c;

    /* compiled from: ChannelsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChannelsLink> {
        @Override // android.os.Parcelable.Creator
        public final ChannelsLink createFromParcel(Parcel parcel) {
            return new ChannelsLink(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelsLink[] newArray(int i12) {
            return new ChannelsLink[i12];
        }
    }

    /* compiled from: ChannelsLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/ChannelsLink$b;", "", "a", "Lcom/avito/android/deep_linking/links/ChannelsLink$b$a;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f133105a;

        /* compiled from: ChannelsLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/ChannelsLink$b$a;", "Lcom/avito/android/deep_linking/links/ChannelsLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133106b = new a();

            public a() {
                super("popup_unread_chats", null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 343141580;
            }

            @Y61.k
            public final String toString() {
                return "NewUnreadChatsPopup";
            }
        }

        public b(String str, C42822w c42822w) {
            this.f133105a = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsLink() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelsLink)) {
            return false;
        }
        ChannelsLink channelsLink = (ChannelsLink) obj;
        return kotlin.jvm.internal.L.f(this.f133103b, channelsLink.f133103b) && kotlin.jvm.internal.L.f(getPath(), channelsLink.getPath());
    }

    public final int hashCode() {
        String str = this.f133103b;
        return getPath().hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChannelsLink(advertId=");
        sb2.append(this.f133103b);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f133104c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133103b);
        parcel.writeString(this.f133104c);
    }

    public ChannelsLink(@Y61.l String str, @Y61.l String str2) {
        this.f133103b = str;
        this.f133104c = str2;
    }

    public /* synthetic */ ChannelsLink(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2);
    }
}
