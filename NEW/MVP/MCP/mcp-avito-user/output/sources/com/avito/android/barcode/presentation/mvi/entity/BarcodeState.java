package com.avito.android.barcode.presentation.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.barcode.domain.model.BarcodeData;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BarcodeState.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/barcode/presentation/mvi/entity/BarcodeState;", "Landroid/os/Parcelable;", "Error", "Loading", "ShowContent", "Lcom/avito/android/barcode/presentation/mvi/entity/BarcodeState$Error;", "Lcom/avito/android/barcode/presentation/mvi/entity/BarcodeState$Loading;", "Lcom/avito/android/barcode/presentation/mvi/entity/BarcodeState$ShowContent;", "_avito_barcode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface BarcodeState extends Parcelable {

    /* compiled from: BarcodeState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode/presentation/mvi/entity/BarcodeState$Error;", "Lcom/avito/android/barcode/presentation/mvi/entity/BarcodeState;", "_avito_barcode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements BarcodeState {

        @k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f98737b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f98738c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f98739d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f98740e;

        /* compiled from: BarcodeState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error((PrintableText) parcel.readParcelable(Error.class.getClassLoader()), (PrintableText) parcel.readParcelable(Error.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        public Error(@k PrintableText printableText, @k PrintableText printableText2, @l String str, @l String str2) {
            this.f98737b = printableText;
            this.f98738c = printableText2;
            this.f98739d = str;
            this.f98740e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return L.f(this.f98737b, error.f98737b) && L.f(this.f98738c, error.f98738c) && L.f(this.f98739d, error.f98739d) && L.f(this.f98740e, error.f98740e);
        }

        public final int hashCode() {
            int iF2 = com.avito.android.actions_sheet.a.f(this.f98738c, this.f98737b.hashCode() * 31, 31);
            String str = this.f98739d;
            int iHashCode = (iF2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f98740e;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(errorTitle=");
            sb2.append(this.f98737b);
            sb2.append(", errorText=");
            sb2.append(this.f98738c);
            sb2.append(", providerLabel=");
            sb2.append(this.f98739d);
            sb2.append(", code=");
            return C22026a.c(sb2, this.f98740e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f98737b, i12);
            parcel.writeParcelable(this.f98738c, i12);
            parcel.writeString(this.f98739d);
            parcel.writeString(this.f98740e);
        }
    }

    /* compiled from: BarcodeState.kt */
    @d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/barcode/presentation/mvi/entity/BarcodeState$Loading;", "Lcom/avito/android/barcode/presentation/mvi/entity/BarcodeState;", "<init>", "()V", "_avito_barcode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Loading implements BarcodeState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f98741b = new Loading();

        @k
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* compiled from: BarcodeState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Loading.f98741b;
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

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: BarcodeState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode/presentation/mvi/entity/BarcodeState$ShowContent;", "Lcom/avito/android/barcode/presentation/mvi/entity/BarcodeState;", "_avito_barcode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ShowContent implements BarcodeState {

        @k
        public static final Parcelable.Creator<ShowContent> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BarcodeData f98742b;

        /* compiled from: BarcodeState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowContent> {
            @Override // android.os.Parcelable.Creator
            public final ShowContent createFromParcel(Parcel parcel) {
                return new ShowContent(BarcodeData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ShowContent[] newArray(int i12) {
                return new ShowContent[i12];
            }
        }

        public ShowContent(@k BarcodeData barcodeData) {
            this.f98742b = barcodeData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowContent) && L.f(this.f98742b, ((ShowContent) obj).f98742b);
        }

        public final int hashCode() {
            return this.f98742b.hashCode();
        }

        @k
        public final String toString() {
            return "ShowContent(data=" + this.f98742b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f98742b.writeToParcel(parcel, i12);
        }
    }
}
