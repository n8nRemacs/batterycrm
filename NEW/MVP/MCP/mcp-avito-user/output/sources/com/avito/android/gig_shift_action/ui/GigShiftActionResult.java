package com.avito.android.gig_shift_action.ui;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigShiftActionResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/gig_shift_action/ui/GigShiftActionResult;", "Landroid/os/Parcelable;", "()V", "Closed", "OpenBarcodeScanner", "OpenDeeplink", "OpenRating", "Lcom/avito/android/gig_shift_action/ui/GigShiftActionResult$Closed;", "Lcom/avito/android/gig_shift_action/ui/GigShiftActionResult$OpenBarcodeScanner;", "Lcom/avito/android/gig_shift_action/ui/GigShiftActionResult$OpenDeeplink;", "Lcom/avito/android/gig_shift_action/ui/GigShiftActionResult$OpenRating;", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class GigShiftActionResult implements Parcelable {

    /* compiled from: GigShiftActionResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_action/ui/GigShiftActionResult$Closed;", "Lcom/avito/android/gig_shift_action/ui/GigShiftActionResult;", "<init>", "()V", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Closed extends GigShiftActionResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Closed f160577b = new Closed();

        @k
        public static final Parcelable.Creator<Closed> CREATOR = new a();

        /* compiled from: GigShiftActionResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Closed> {
            @Override // android.os.Parcelable.Creator
            public final Closed createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Closed.f160577b;
            }

            @Override // android.os.Parcelable.Creator
            public final Closed[] newArray(int i12) {
                return new Closed[i12];
            }
        }

        public Closed() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Closed);
        }

        public final int hashCode() {
            return -1959245850;
        }

        @k
        public final String toString() {
            return "Closed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: GigShiftActionResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/gig_shift_action/ui/GigShiftActionResult$OpenBarcodeScanner;", "Lcom/avito/android/gig_shift_action/ui/GigShiftActionResult;", "<init>", "()V", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenBarcodeScanner extends GigShiftActionResult {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final OpenBarcodeScanner f160578b = new OpenBarcodeScanner();

        @k
        public static final Parcelable.Creator<OpenBarcodeScanner> CREATOR = new a();

        /* compiled from: GigShiftActionResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OpenBarcodeScanner> {
            @Override // android.os.Parcelable.Creator
            public final OpenBarcodeScanner createFromParcel(Parcel parcel) {
                parcel.readInt();
                return OpenBarcodeScanner.f160578b;
            }

            @Override // android.os.Parcelable.Creator
            public final OpenBarcodeScanner[] newArray(int i12) {
                return new OpenBarcodeScanner[i12];
            }
        }

        public OpenBarcodeScanner() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof OpenBarcodeScanner);
        }

        public final int hashCode() {
            return -59064894;
        }

        @k
        public final String toString() {
            return "OpenBarcodeScanner";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: GigShiftActionResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_action/ui/GigShiftActionResult$OpenDeeplink;", "Lcom/avito/android/gig_shift_action/ui/GigShiftActionResult;", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenDeeplink extends GigShiftActionResult {

        @k
        public static final Parcelable.Creator<OpenDeeplink> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f160579b;

        /* compiled from: GigShiftActionResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OpenDeeplink> {
            @Override // android.os.Parcelable.Creator
            public final OpenDeeplink createFromParcel(Parcel parcel) {
                return new OpenDeeplink((DeepLink) parcel.readParcelable(OpenDeeplink.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OpenDeeplink[] newArray(int i12) {
                return new OpenDeeplink[i12];
            }
        }

        public OpenDeeplink(@k DeepLink deepLink) {
            super(null);
            this.f160579b = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDeeplink) && L.f(this.f160579b, ((OpenDeeplink) obj).f160579b);
        }

        public final int hashCode() {
            return this.f160579b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f160579b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f160579b, i12);
        }
    }

    /* compiled from: GigShiftActionResult.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_action/ui/GigShiftActionResult$OpenRating;", "Lcom/avito/android/gig_shift_action/ui/GigShiftActionResult;", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OpenRating extends GigShiftActionResult {

        @k
        public static final Parcelable.Creator<OpenRating> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f160580b;

        /* compiled from: GigShiftActionResult.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<OpenRating> {
            @Override // android.os.Parcelable.Creator
            public final OpenRating createFromParcel(Parcel parcel) {
                return new OpenRating((DeepLink) parcel.readParcelable(OpenRating.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final OpenRating[] newArray(int i12) {
                return new OpenRating[i12];
            }
        }

        public OpenRating(@k DeepLink deepLink) {
            super(null);
            this.f160580b = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenRating) && L.f(this.f160580b, ((OpenRating) obj).f160580b);
        }

        public final int hashCode() {
            return this.f160580b.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenRating(deeplink="), this.f160580b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f160580b, i12);
        }
    }

    public /* synthetic */ GigShiftActionResult(C42822w c42822w) {
        this();
    }

    public GigShiftActionResult() {
    }
}
