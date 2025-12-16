package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: DeleteChannelLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/DeleteChannelLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class DeleteChannelLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DeleteChannelLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133176b;

    /* compiled from: DeleteChannelLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeleteChannelLink> {
        @Override // android.os.Parcelable.Creator
        public final DeleteChannelLink createFromParcel(Parcel parcel) {
            return new DeleteChannelLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DeleteChannelLink[] newArray(int i12) {
            return new DeleteChannelLink[i12];
        }
    }

    /* compiled from: DeleteChannelLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deep_linking/links/DeleteChannelLink$b;", "LJu/c$b;", "a", "b", "c", "Lcom/avito/android/deep_linking/links/DeleteChannelLink$b$a;", "Lcom/avito/android/deep_linking/links/DeleteChannelLink$b$b;", "Lcom/avito/android/deep_linking/links/DeleteChannelLink$b$c;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: DeleteChannelLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeleteChannelLink$b$a;", "Lcom/avito/android/deep_linking/links/DeleteChannelLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133177b = new a();
        }

        /* compiled from: DeleteChannelLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeleteChannelLink$b$b;", "Lcom/avito/android/deep_linking/links/DeleteChannelLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.DeleteChannelLink$b$b, reason: collision with other inner class name */
        public static final class C3993b implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C3993b f133178b = new C3993b();
        }

        /* compiled from: DeleteChannelLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeleteChannelLink$b$c;", "Lcom/avito/android/deep_linking/links/DeleteChannelLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c f133179b = new c();
        }
    }

    public DeleteChannelLink(@Y61.k String str) {
        this.f133176b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeleteChannelLink) && kotlin.jvm.internal.L.f(this.f133176b, ((DeleteChannelLink) obj).f133176b);
    }

    public final int hashCode() {
        return this.f133176b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("DeleteChannelLink(channelId="), this.f133176b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133176b);
    }
}
