package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: ChannelCallLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/ChannelCallLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class ChannelCallLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ChannelCallLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133092b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133093c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133094d;

    /* compiled from: ChannelCallLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChannelCallLink> {
        @Override // android.os.Parcelable.Creator
        public final ChannelCallLink createFromParcel(Parcel parcel) {
            return new ChannelCallLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelCallLink[] newArray(int i12) {
            return new ChannelCallLink[i12];
        }
    }

    /* compiled from: ChannelCallLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deep_linking/links/ChannelCallLink$b;", "", "a", "b", "c", "Lcom/avito/android/deep_linking/links/ChannelCallLink$b$a;", "Lcom/avito/android/deep_linking/links/ChannelCallLink$b$b;", "Lcom/avito/android/deep_linking/links/ChannelCallLink$b$c;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ChannelCallLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/ChannelCallLink$b$a;", "Lcom/avito/android/deep_linking/links/ChannelCallLink$b;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133095b = new a();
        }

        /* compiled from: ChannelCallLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/ChannelCallLink$b$b;", "Lcom/avito/android/deep_linking/links/ChannelCallLink$b;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.ChannelCallLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C3990b implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Throwable f133096b;

            public C3990b(@Y61.k Throwable th2) {
                this.f133096b = th2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3990b) && kotlin.jvm.internal.L.f(this.f133096b, ((C3990b) obj).f133096b);
            }

            public final int hashCode() {
                return this.f133096b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Error(error="), this.f133096b, ')');
            }
        }

        /* compiled from: ChannelCallLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/ChannelCallLink$b$c;", "Lcom/avito/android/deep_linking/links/ChannelCallLink$b;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements b, InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c f133097b = new c();
        }
    }

    public /* synthetic */ ChannelCallLink(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelCallLink)) {
            return false;
        }
        ChannelCallLink channelCallLink = (ChannelCallLink) obj;
        return kotlin.jvm.internal.L.f(this.f133092b, channelCallLink.f133092b) && kotlin.jvm.internal.L.f(this.f133093c, channelCallLink.f133093c) && kotlin.jvm.internal.L.f(this.f133094d, channelCallLink.f133094d);
    }

    public final int hashCode() {
        int iHashCode = this.f133092b.hashCode() * 31;
        String str = this.f133093c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133094d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChannelCallLink(channelId=");
        sb2.append(this.f133092b);
        sb2.append(", itemId=");
        sb2.append(this.f133093c);
        sb2.append(", xHash=");
        return C22026a.c(sb2, this.f133094d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133092b);
        parcel.writeString(this.f133093c);
        parcel.writeString(this.f133094d);
    }

    public ChannelCallLink(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        this.f133092b = str;
        this.f133093c = str2;
        this.f133094d = str3;
    }
}
