package com.avito.android.messenger.conversation.adapter.quote;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.messenger.message.Quote;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: QuoteView.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData;", "Landroid/os/Parcelable;", "ImageType", "Style", "TextType", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class QuoteViewData implements Parcelable {

    @k
    public static final Parcelable.Creator<QuoteViewData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f189266b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextType f189267c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f189268d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f189269e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Style f189270f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ImageType f189271g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f189272h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final Quote f189273i;

    /* compiled from: QuoteView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$ImageType;", "Landroid/os/Parcelable;", "Image", "ImageFromUri", "Static", "Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$ImageType$Image;", "Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$ImageType$ImageFromUri;", "Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$ImageType$Static;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ImageType extends Parcelable {

        /* compiled from: QuoteView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$ImageType$Image;", "Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$ImageType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Image implements ImageType {

            @k
            public static final Parcelable.Creator<Image> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final com.avito.android.remote.model.Image f189274b;

            /* compiled from: QuoteView.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Image> {
                @Override // android.os.Parcelable.Creator
                public final Image createFromParcel(Parcel parcel) {
                    return new Image((com.avito.android.remote.model.Image) parcel.readParcelable(Image.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Image[] newArray(int i12) {
                    return new Image[i12];
                }
            }

            public Image(@k com.avito.android.remote.model.Image image) {
                this.f189274b = image;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Image) && L.f(this.f189274b, ((Image) obj).f189274b);
            }

            public final int hashCode() {
                return this.f189274b.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.o(new StringBuilder("Image(img="), this.f189274b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f189274b, i12);
            }
        }

        /* compiled from: QuoteView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$ImageType$ImageFromUri;", "Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$ImageType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class ImageFromUri implements ImageType {

            @k
            public static final Parcelable.Creator<ImageFromUri> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Uri f189275b;

            /* compiled from: QuoteView.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ImageFromUri> {
                @Override // android.os.Parcelable.Creator
                public final ImageFromUri createFromParcel(Parcel parcel) {
                    return new ImageFromUri((Uri) parcel.readParcelable(ImageFromUri.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ImageFromUri[] newArray(int i12) {
                    return new ImageFromUri[i12];
                }
            }

            public ImageFromUri(@k Uri uri) {
                this.f189275b = uri;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ImageFromUri) && L.f(this.f189275b, ((ImageFromUri) obj).f189275b);
            }

            public final int hashCode() {
                return this.f189275b.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.t(new StringBuilder("ImageFromUri(uri="), this.f189275b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f189275b, i12);
            }
        }

        /* compiled from: QuoteView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$ImageType$Static;", "Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$ImageType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Static implements ImageType {

            @k
            public static final Parcelable.Creator<Static> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final int f189276b;

            /* compiled from: QuoteView.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Static> {
                @Override // android.os.Parcelable.Creator
                public final Static createFromParcel(Parcel parcel) {
                    return new Static(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Static[] newArray(int i12) {
                    return new Static[i12];
                }
            }

            public Static(@InterfaceC42165v int i12) {
                this.f189276b = i12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Static) && this.f189276b == ((Static) obj).f189276b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f189276b);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("Static(resId="), this.f189276b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.f189276b);
            }
        }
    }

    /* compiled from: QuoteView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$Style;", "Landroid/os/Parcelable;", "Gray", "Regular", "Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$Style$Gray;", "Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$Style$Regular;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Style extends Parcelable {

        /* compiled from: QuoteView.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$Style$Gray;", "Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$Style;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Gray implements Style {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Gray f189277b = new Gray();

            @k
            public static final Parcelable.Creator<Gray> CREATOR = new a();

            /* compiled from: QuoteView.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Gray> {
                @Override // android.os.Parcelable.Creator
                public final Gray createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Gray.f189277b;
                }

                @Override // android.os.Parcelable.Creator
                public final Gray[] newArray(int i12) {
                    return new Gray[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof Gray);
            }

            public final int hashCode() {
                return -1437853767;
            }

            @k
            public final String toString() {
                return "Gray";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: QuoteView.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$Style$Regular;", "Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$Style;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Regular implements Style {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final Regular f189278b = new Regular();

            @k
            public static final Parcelable.Creator<Regular> CREATOR = new a();

            /* compiled from: QuoteView.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Regular> {
                @Override // android.os.Parcelable.Creator
                public final Regular createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Regular.f189278b;
                }

                @Override // android.os.Parcelable.Creator
                public final Regular[] newArray(int i12) {
                    return new Regular[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof Regular);
            }

            public final int hashCode() {
                return -586773882;
            }

            @k
            public final String toString() {
                return "Regular";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }
    }

    /* compiled from: QuoteView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$TextType;", "Landroid/os/Parcelable;", "Attributed", "Plain", "Res", "Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$TextType$Attributed;", "Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$TextType$Plain;", "Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$TextType$Res;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface TextType extends Parcelable {

        /* compiled from: QuoteView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$TextType$Attributed;", "Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$TextType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Attributed implements TextType {

            @k
            public static final Parcelable.Creator<Attributed> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @l
            public final CharSequence f189279b;

            /* compiled from: QuoteView.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Attributed> {
                @Override // android.os.Parcelable.Creator
                public final Attributed createFromParcel(Parcel parcel) {
                    return new Attributed((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Attributed[] newArray(int i12) {
                    return new Attributed[i12];
                }
            }

            public Attributed(@l CharSequence charSequence) {
                this.f189279b = charSequence;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Attributed) && L.f(this.f189279b, ((Attributed) obj).f189279b);
            }

            public final int hashCode() {
                CharSequence charSequence = this.f189279b;
                if (charSequence == null) {
                    return 0;
                }
                return charSequence.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.r(new StringBuilder("Attributed(text="), this.f189279b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                TextUtils.writeToParcel(this.f189279b, parcel, i12);
            }
        }

        /* compiled from: QuoteView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$TextType$Plain;", "Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$TextType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Plain implements TextType {

            @k
            public static final Parcelable.Creator<Plain> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f189280b;

            /* compiled from: QuoteView.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Plain> {
                @Override // android.os.Parcelable.Creator
                public final Plain createFromParcel(Parcel parcel) {
                    return new Plain(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Plain[] newArray(int i12) {
                    return new Plain[i12];
                }
            }

            public Plain(@k String str) {
                this.f189280b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Plain) && L.f(this.f189280b, ((Plain) obj).f189280b);
            }

            public final int hashCode() {
                return this.f189280b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("Plain(text="), this.f189280b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f189280b);
            }
        }

        /* compiled from: QuoteView.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$TextType$Res;", "Lcom/avito/android/messenger/conversation/adapter/quote/QuoteViewData$TextType;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Res implements TextType {

            @k
            public static final Parcelable.Creator<Res> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final int f189281b;

            /* compiled from: QuoteView.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Res> {
                @Override // android.os.Parcelable.Creator
                public final Res createFromParcel(Parcel parcel) {
                    return new Res(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Res[] newArray(int i12) {
                    return new Res[i12];
                }
            }

            public Res(int i12) {
                this.f189281b = i12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Res) && this.f189281b == ((Res) obj).f189281b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f189281b);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("Res(resId="), this.f189281b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.f189281b);
            }
        }
    }

    /* compiled from: QuoteView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<QuoteViewData> {
        @Override // android.os.Parcelable.Creator
        public final QuoteViewData createFromParcel(Parcel parcel) {
            return new QuoteViewData(parcel.readString(), (TextType) parcel.readParcelable(QuoteViewData.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, (Style) parcel.readParcelable(QuoteViewData.class.getClassLoader()), (ImageType) parcel.readParcelable(QuoteViewData.class.getClassLoader()), parcel.readInt() != 0, (Quote) parcel.readParcelable(QuoteViewData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final QuoteViewData[] newArray(int i12) {
            return new QuoteViewData[i12];
        }
    }

    public QuoteViewData(@k String str, @k TextType textType, @l String str2, boolean z12, @k Style style, @l ImageType imageType, boolean z13, @k Quote quote) {
        this.f189266b = str;
        this.f189267c = textType;
        this.f189268d = str2;
        this.f189269e = z12;
        this.f189270f = style;
        this.f189271g = imageType;
        this.f189272h = z13;
        this.f189273i = quote;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuoteViewData)) {
            return false;
        }
        QuoteViewData quoteViewData = (QuoteViewData) obj;
        return L.f(this.f189266b, quoteViewData.f189266b) && L.f(this.f189267c, quoteViewData.f189267c) && L.f(this.f189268d, quoteViewData.f189268d) && this.f189269e == quoteViewData.f189269e && L.f(this.f189270f, quoteViewData.f189270f) && L.f(this.f189271g, quoteViewData.f189271g) && this.f189272h == quoteViewData.f189272h && L.f(this.f189273i, quoteViewData.f189273i);
    }

    public final int hashCode() {
        int iHashCode = (this.f189267c.hashCode() + (this.f189266b.hashCode() * 31)) * 31;
        String str = this.f189268d;
        int iHashCode2 = (this.f189270f.hashCode() + r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f189269e)) * 31;
        ImageType imageType = this.f189271g;
        return this.f189273i.hashCode() + r.i((iHashCode2 + (imageType != null ? imageType.hashCode() : 0)) * 31, 31, this.f189272h);
    }

    @k
    public final String toString() {
        return "QuoteViewData(authorName=" + this.f189266b + ", message=" + this.f189267c + ", detail=" + this.f189268d + ", withDelimiter=" + this.f189269e + ", messageStyle=" + this.f189270f + ", image=" + this.f189271g + ", showPlayOverlayButton=" + this.f189272h + ", quote=" + this.f189273i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f189266b);
        parcel.writeParcelable(this.f189267c, i12);
        parcel.writeString(this.f189268d);
        parcel.writeInt(this.f189269e ? 1 : 0);
        parcel.writeParcelable(this.f189270f, i12);
        parcel.writeParcelable(this.f189271g, i12);
        parcel.writeInt(this.f189272h ? 1 : 0);
        parcel.writeParcelable(this.f189273i, i12);
    }
}
