package com.avito.android.sx_address.new_address.mvi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.sx_address.new_address.mvi.SxNewAddressMviState;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SxNewAddressMviViewState.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviViewState;", "Landroid/os/Parcelable;", "()V", "Content", "Loading", "NetworkError", "SaveLoading", "ValidationError", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviViewState$Content;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviViewState$Loading;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviViewState$NetworkError;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviViewState$SaveLoading;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SxNewAddressMviViewState implements Parcelable {

    /* compiled from: SxNewAddressMviViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviViewState$Content;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviViewState;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Content extends SxNewAddressMviViewState {

        @Y61.k
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final SxNewAddressMviState.AddressContent f293738b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final SxNewAddressMviState.TitleContent f293739c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final SxNewAddressMviState.TypesContent f293740d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final SxNewAddressMviState.DetailsContent f293741e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final SxNewAddressMviState.WorkingSchedulerContent f293742f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final AttributedText f293743g;

        /* compiled from: SxNewAddressMviViewState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Content> {
            @Override // android.os.Parcelable.Creator
            public final Content createFromParcel(Parcel parcel) {
                return new Content(SxNewAddressMviState.AddressContent.CREATOR.createFromParcel(parcel), SxNewAddressMviState.TitleContent.CREATOR.createFromParcel(parcel), SxNewAddressMviState.TypesContent.CREATOR.createFromParcel(parcel), SxNewAddressMviState.DetailsContent.CREATOR.createFromParcel(parcel), SxNewAddressMviState.WorkingSchedulerContent.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(Content.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Content[] newArray(int i12) {
                return new Content[i12];
            }
        }

        public Content(@Y61.k SxNewAddressMviState.AddressContent addressContent, @Y61.k SxNewAddressMviState.TitleContent titleContent, @Y61.k SxNewAddressMviState.TypesContent typesContent, @Y61.k SxNewAddressMviState.DetailsContent detailsContent, @Y61.k SxNewAddressMviState.WorkingSchedulerContent workingSchedulerContent, @Y61.l AttributedText attributedText) {
            super(null);
            this.f293738b = addressContent;
            this.f293739c = titleContent;
            this.f293740d = typesContent;
            this.f293741e = detailsContent;
            this.f293742f = workingSchedulerContent;
            this.f293743g = attributedText;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return L.f(this.f293738b, content.f293738b) && L.f(this.f293739c, content.f293739c) && L.f(this.f293740d, content.f293740d) && L.f(this.f293741e, content.f293741e) && L.f(this.f293742f, content.f293742f) && L.f(this.f293743g, content.f293743g);
        }

        public final int hashCode() {
            int iHashCode = (this.f293742f.hashCode() + C23088b.a((this.f293740d.hashCode() + ((this.f293739c.hashCode() + (this.f293738b.hashCode() * 31)) * 31)) * 31, 31, this.f293741e.f293725b)) * 31;
            AttributedText attributedText = this.f293743g;
            return iHashCode + (attributedText == null ? 0 : attributedText.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(addressContent=");
            sb2.append(this.f293738b);
            sb2.append(", titleContent=");
            sb2.append(this.f293739c);
            sb2.append(", typesContent=");
            sb2.append(this.f293740d);
            sb2.append(", detailsContent=");
            sb2.append(this.f293741e);
            sb2.append(", scheduleContent=");
            sb2.append(this.f293742f);
            sb2.append(", legalText=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f293743g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            this.f293738b.writeToParcel(parcel, i12);
            this.f293739c.writeToParcel(parcel, i12);
            this.f293740d.writeToParcel(parcel, i12);
            this.f293741e.writeToParcel(parcel, i12);
            this.f293742f.writeToParcel(parcel, i12);
            parcel.writeParcelable(this.f293743g, i12);
        }
    }

    /* compiled from: SxNewAddressMviViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviViewState$Loading;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviViewState;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading extends SxNewAddressMviViewState {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Loading f293744b = new Loading();

        @Y61.k
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* compiled from: SxNewAddressMviViewState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Loading.f293744b;
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i12) {
                return new Loading[i12];
            }
        }

        public Loading() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1416314205;
        }

        @Y61.k
        public final String toString() {
            return "Loading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: SxNewAddressMviViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviViewState$NetworkError;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviViewState;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NetworkError extends SxNewAddressMviViewState {

        @Y61.k
        public static final Parcelable.Creator<NetworkError> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Throwable f293745b;

        /* compiled from: SxNewAddressMviViewState.kt */
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

        public NetworkError(@Y61.l Throwable th2) {
            super(null);
            this.f293745b = th2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NetworkError) && L.f(this.f293745b, ((NetworkError) obj).f293745b);
        }

        public final int hashCode() {
            Throwable th2 = this.f293745b;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("NetworkError(value="), this.f293745b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeSerializable(this.f293745b);
        }
    }

    /* compiled from: SxNewAddressMviViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviViewState$SaveLoading;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviViewState;", "<init>", "()V", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SaveLoading extends SxNewAddressMviViewState {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final SaveLoading f293746b = new SaveLoading();

        @Y61.k
        public static final Parcelable.Creator<SaveLoading> CREATOR = new a();

        /* compiled from: SxNewAddressMviViewState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SaveLoading> {
            @Override // android.os.Parcelable.Creator
            public final SaveLoading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return SaveLoading.f293746b;
            }

            @Override // android.os.Parcelable.Creator
            public final SaveLoading[] newArray(int i12) {
                return new SaveLoading[i12];
            }
        }

        public SaveLoading() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof SaveLoading);
        }

        public final int hashCode() {
            return -1013819674;
        }

        @Y61.k
        public final String toString() {
            return "SaveLoading";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: SxNewAddressMviViewState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviViewState$ValidationError;", "", "Type", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ValidationError {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Type.FilledWrong f293747a;

        /* compiled from: SxNewAddressMviViewState.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviViewState$ValidationError$Type;", "Landroid/os/Parcelable;", "FilledWrong", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviViewState$ValidationError$Type$FilledWrong;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static abstract class Type implements Parcelable {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f293748b;

            /* compiled from: SxNewAddressMviViewState.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviViewState$ValidationError$Type$FilledWrong;", "Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviViewState$ValidationError$Type;", "Reason", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final /* data */ class FilledWrong extends Type {

                @Y61.k
                public static final Parcelable.Creator<FilledWrong> CREATOR = new a();

                /* renamed from: c, reason: collision with root package name */
                @Y61.k
                public final Reason f293749c;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: SxNewAddressMviViewState.kt */
                @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/mvi/SxNewAddressMviViewState$ValidationError$Type$FilledWrong$Reason;", "", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class Reason {

                    /* renamed from: c, reason: collision with root package name */
                    public static final Reason f293750c;

                    /* renamed from: d, reason: collision with root package name */
                    public static final Reason f293751d;

                    /* renamed from: e, reason: collision with root package name */
                    public static final /* synthetic */ Reason[] f293752e;

                    /* renamed from: f, reason: collision with root package name */
                    public static final /* synthetic */ kotlin.enums.a f293753f;

                    /* renamed from: b, reason: collision with root package name */
                    @Y61.k
                    public final String f293754b;

                    static {
                        Reason reason = new Reason("NOT_FILLED", 0, "Заполните все обязательные пункты");
                        f293750c = reason;
                        Reason reason2 = new Reason("WORKING_DAY_EMPTY", 1, "Выберите день и время работы");
                        f293751d = reason2;
                        Reason[] reasonArr = {reason, reason2};
                        f293752e = reasonArr;
                        f293753f = kotlin.enums.c.a(reasonArr);
                    }

                    public Reason(String str, int i12, String str2) {
                        this.f293754b = str2;
                    }

                    public static Reason valueOf(String str) {
                        return (Reason) Enum.valueOf(Reason.class, str);
                    }

                    public static Reason[] values() {
                        return (Reason[]) f293752e.clone();
                    }
                }

                /* compiled from: SxNewAddressMviViewState.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<FilledWrong> {
                    @Override // android.os.Parcelable.Creator
                    public final FilledWrong createFromParcel(Parcel parcel) {
                        return new FilledWrong(Reason.valueOf(parcel.readString()));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final FilledWrong[] newArray(int i12) {
                        return new FilledWrong[i12];
                    }
                }

                public FilledWrong(@Y61.k Reason reason) {
                    super(reason.f293754b, null);
                    this.f293749c = reason;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof FilledWrong) && this.f293749c == ((FilledWrong) obj).f293749c;
                }

                public final int hashCode() {
                    return this.f293749c.hashCode();
                }

                @Y61.k
                public final String toString() {
                    return "FilledWrong(reason=" + this.f293749c + ')';
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                    parcel.writeString(this.f293749c.name());
                }
            }

            public Type(String str, C42822w c42822w) {
                this.f293748b = str;
            }
        }

        public ValidationError(@Y61.k Type.FilledWrong filledWrong) {
            this.f293747a = filledWrong;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ValidationError) && L.f(this.f293747a, ((ValidationError) obj).f293747a);
        }

        public final int hashCode() {
            return this.f293747a.f293749c.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ValidationError(type=" + this.f293747a + ')';
        }
    }

    public /* synthetic */ SxNewAddressMviViewState(C42822w c42822w) {
        this();
    }

    public SxNewAddressMviViewState() {
    }
}
