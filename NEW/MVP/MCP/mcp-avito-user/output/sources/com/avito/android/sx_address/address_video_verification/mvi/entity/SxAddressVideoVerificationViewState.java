package com.avito.android.sx_address.address_video_verification.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.sx_address.address_video_verification.domain.File;
import com.avito.android.sx_address.address_video_verification.domain.SendButton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SxAddressVideoVerificationState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/mvi/entity/SxAddressVideoVerificationViewState;", "Landroid/os/Parcelable;", "Content", "Loading", "NetworkError", "Lcom/avito/android/sx_address/address_video_verification/mvi/entity/SxAddressVideoVerificationViewState$Content;", "Lcom/avito/android/sx_address/address_video_verification/mvi/entity/SxAddressVideoVerificationViewState$Loading;", "Lcom/avito/android/sx_address/address_video_verification/mvi/entity/SxAddressVideoVerificationViewState$NetworkError;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SxAddressVideoVerificationViewState extends Parcelable {

    /* compiled from: SxAddressVideoVerificationState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/mvi/entity/SxAddressVideoVerificationViewState$Loading;", "Lcom/avito/android/sx_address/address_video_verification/mvi/entity/SxAddressVideoVerificationViewState;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Loading implements SxAddressVideoVerificationViewState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f292703b = new Loading();

        @k
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* compiled from: SxAddressVideoVerificationState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Loading.f292703b;
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i12) {
                return new Loading[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 156147665;
        }

        @k
        public final String toString() {
            return "Loading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: SxAddressVideoVerificationState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/mvi/entity/SxAddressVideoVerificationViewState$NetworkError;", "Lcom/avito/android/sx_address/address_video_verification/mvi/entity/SxAddressVideoVerificationViewState;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class NetworkError implements SxAddressVideoVerificationViewState {

        @k
        public static final Parcelable.Creator<NetworkError> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Throwable f292704b;

        /* compiled from: SxAddressVideoVerificationState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NetworkError> {
            @Override // android.os.Parcelable.Creator
            public final NetworkError createFromParcel(Parcel parcel) {
                return new NetworkError((Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final NetworkError[] newArray(int i12) {
                return new NetworkError[i12];
            }
        }

        public NetworkError(@l Throwable th2) {
            this.f292704b = th2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NetworkError) && L.f(this.f292704b, ((NetworkError) obj).f292704b);
        }

        public final int hashCode() {
            Throwable th2 = this.f292704b;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("NetworkError(throwable="), this.f292704b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeSerializable(this.f292704b);
        }
    }

    /* compiled from: SxAddressVideoVerificationState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/address_video_verification/mvi/entity/SxAddressVideoVerificationViewState$Content;", "Lcom/avito/android/sx_address/address_video_verification/mvi/entity/SxAddressVideoVerificationViewState;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Content implements SxAddressVideoVerificationViewState {

        @k
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f292699b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final File f292700c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final SendButton f292701d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f292702e;

        /* compiled from: SxAddressVideoVerificationState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Content> {
            @Override // android.os.Parcelable.Creator
            public final Content createFromParcel(Parcel parcel) {
                return new Content((AttributedText) parcel.readParcelable(Content.class.getClassLoader()), parcel.readInt() == 0 ? null : File.CREATOR.createFromParcel(parcel), SendButton.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Content[] newArray(int i12) {
                return new Content[i12];
            }
        }

        public Content(@k AttributedText attributedText, @l File file, @k SendButton sendButton, @l String str) {
            this.f292699b = attributedText;
            this.f292700c = file;
            this.f292701d = sendButton;
            this.f292702e = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f292699b, content.f292699b) && L.f(this.f292700c, content.f292700c) && L.f(this.f292701d, content.f292701d) && L.f(this.f292702e, content.f292702e);
        }

        public final int hashCode() {
            int iHashCode = this.f292699b.hashCode() * 31;
            File file = this.f292700c;
            int iHashCode2 = (this.f292701d.hashCode() + ((iHashCode + (file == null ? 0 : file.hashCode())) * 31)) * 31;
            String str = this.f292702e;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(content=");
            sb2.append(this.f292699b);
            sb2.append(", video=");
            sb2.append(this.f292700c);
            sb2.append(", sendButton=");
            sb2.append(this.f292701d);
            sb2.append(", uploadingError=");
            return C22026a.c(sb2, this.f292702e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f292699b, i12);
            File file = this.f292700c;
            if (file == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                file.writeToParcel(parcel, i12);
            }
            this.f292701d.writeToParcel(parcel, i12);
            parcel.writeString(this.f292702e);
        }

        public /* synthetic */ Content(AttributedText attributedText, File file, SendButton sendButton, String str, int i12, C42822w c42822w) {
            this(attributedText, (i12 & 2) != 0 ? null : file, sendButton, (i12 & 8) != 0 ? null : str);
        }
    }
}
