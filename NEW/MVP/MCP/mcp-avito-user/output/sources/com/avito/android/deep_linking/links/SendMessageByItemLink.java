package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: SendMessageByItemLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/SendMessageByItemLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class SendMessageByItemLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<SendMessageByItemLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133650b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133651c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133652d;

    /* compiled from: SendMessageByItemLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SendMessageByItemLink> {
        @Override // android.os.Parcelable.Creator
        public final SendMessageByItemLink createFromParcel(Parcel parcel) {
            return new SendMessageByItemLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SendMessageByItemLink[] newArray(int i12) {
            return new SendMessageByItemLink[i12];
        }
    }

    /* compiled from: SendMessageByItemLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/SendMessageByItemLink$b;", "LJu/c$b;", "a", "b", "Lcom/avito/android/deep_linking/links/SendMessageByItemLink$b$a;", "Lcom/avito/android/deep_linking/links/SendMessageByItemLink$b$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: SendMessageByItemLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/SendMessageByItemLink$b$a;", "Lcom/avito/android/deep_linking/links/SendMessageByItemLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133653b = new a();
        }

        /* compiled from: SendMessageByItemLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/SendMessageByItemLink$b$b;", "Lcom/avito/android/deep_linking/links/SendMessageByItemLink$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.SendMessageByItemLink$b$b, reason: collision with other inner class name */
        public static final class C4015b implements b {
        }
    }

    public /* synthetic */ SendMessageByItemLink(String str, String str2, String str3, int i12, C42822w c42822w) {
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
        if (!(obj instanceof SendMessageByItemLink)) {
            return false;
        }
        SendMessageByItemLink sendMessageByItemLink = (SendMessageByItemLink) obj;
        return kotlin.jvm.internal.L.f(this.f133650b, sendMessageByItemLink.f133650b) && kotlin.jvm.internal.L.f(this.f133651c, sendMessageByItemLink.f133651c) && kotlin.jvm.internal.L.f(this.f133652d, sendMessageByItemLink.f133652d);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(this.f133650b.hashCode() * 31, 31, this.f133651c);
        String str = this.f133652d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SendMessageByItemLink(itemId=");
        sb2.append(this.f133650b);
        sb2.append(", message=");
        sb2.append(this.f133651c);
        sb2.append(", source=");
        return C22026a.c(sb2, this.f133652d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133650b);
        parcel.writeString(this.f133651c);
        parcel.writeString(this.f133652d);
    }

    public SendMessageByItemLink(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
        this.f133650b = str;
        this.f133651c = str2;
        this.f133652d = str3;
    }
}
