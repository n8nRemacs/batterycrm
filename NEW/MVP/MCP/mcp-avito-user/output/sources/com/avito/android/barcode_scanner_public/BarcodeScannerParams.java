package com.avito.android.barcode_scanner_public;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BarcodeScannerParams.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/barcode_scanner_public/BarcodeScannerParams;", "Landroid/os/Parcelable;", "a", "_avito_barcode-scanner_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BarcodeScannerParams implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f99050b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final BarcodeScannerType f99051c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f99052d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f99049e = new a(null);

    @k
    public static final Parcelable.Creator<BarcodeScannerParams> CREATOR = new b();

    /* compiled from: BarcodeScannerParams.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/barcode_scanner_public/BarcodeScannerParams$a;", "", "<init>", "()V", "_avito_barcode-scanner_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BarcodeScannerParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BarcodeScannerParams> {
        @Override // android.os.Parcelable.Creator
        public final BarcodeScannerParams createFromParcel(Parcel parcel) {
            return new BarcodeScannerParams((PrintableText) parcel.readParcelable(BarcodeScannerParams.class.getClassLoader()), BarcodeScannerType.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BarcodeScannerParams[] newArray(int i12) {
            return new BarcodeScannerParams[i12];
        }
    }

    public BarcodeScannerParams(@k PrintableText printableText, @k BarcodeScannerType barcodeScannerType, boolean z12) {
        this.f99050b = printableText;
        this.f99051c = barcodeScannerType;
        this.f99052d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BarcodeScannerParams)) {
            return false;
        }
        BarcodeScannerParams barcodeScannerParams = (BarcodeScannerParams) obj;
        return L.f(this.f99050b, barcodeScannerParams.f99050b) && this.f99051c == barcodeScannerParams.f99051c && this.f99052d == barcodeScannerParams.f99052d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99052d) + ((this.f99051c.hashCode() + (this.f99050b.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BarcodeScannerParams(scannerDescription=");
        sb2.append(this.f99050b);
        sb2.append(", scannerType=");
        sb2.append(this.f99051c);
        sb2.append(", resultConfirmationRequired=");
        return r.x(sb2, this.f99052d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f99050b, i12);
        this.f99051c.writeToParcel(parcel, i12);
        parcel.writeInt(this.f99052d ? 1 : 0);
    }
}
