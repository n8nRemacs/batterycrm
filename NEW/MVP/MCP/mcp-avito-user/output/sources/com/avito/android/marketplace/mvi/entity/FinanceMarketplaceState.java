package com.avito.android.marketplace.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FinanceMarketplaceState.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceState;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "Content", "Error", "Loading", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceState$Content;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceState$Error;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceState$Loading;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class FinanceMarketplaceState implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f185948b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final Loading f185949c = new Loading(0);

    /* compiled from: FinanceMarketplaceState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceState$Content;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceState;", "<init>", "()V", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Content extends FinanceMarketplaceState {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final Content f185950d = new Content();

        @k
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* compiled from: FinanceMarketplaceState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Content> {
            @Override // android.os.Parcelable.Creator
            public final Content createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Content.f185950d;
            }

            @Override // android.os.Parcelable.Creator
            public final Content[] newArray(int i12) {
                return new Content[i12];
            }
        }

        public Content() {
            super(null);
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

    /* compiled from: FinanceMarketplaceState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceState$Error;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceState;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error extends FinanceMarketplaceState {

        @k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public final int f185951d;

        /* compiled from: FinanceMarketplaceState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        public Error(int i12) {
            super(null);
            this.f185951d = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && this.f185951d == ((Error) obj).f185951d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f185951d);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("Error(progress="), this.f185951d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f185951d);
        }
    }

    /* compiled from: FinanceMarketplaceState.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceState$Loading;", "Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceState;", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Loading extends FinanceMarketplaceState {

        @k
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        public final int f185952d;

        /* compiled from: FinanceMarketplaceState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                return new Loading(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Loading[] newArray(int i12) {
                return new Loading[i12];
            }
        }

        public Loading(int i12) {
            super(null);
            this.f185952d = i12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loading) && this.f185952d == ((Loading) obj).f185952d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f185952d);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("Loading(progress="), this.f185952d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(this.f185952d);
        }
    }

    /* compiled from: FinanceMarketplaceState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/marketplace/mvi/entity/FinanceMarketplaceState$a;", "", "<init>", "()V", "_avito_finance-marketplace_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ FinanceMarketplaceState(C42822w c42822w) {
        this();
    }

    public FinanceMarketplaceState() {
    }
}
