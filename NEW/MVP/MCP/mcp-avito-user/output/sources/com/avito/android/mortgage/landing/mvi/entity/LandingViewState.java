package com.avito.android.mortgage.landing.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LandingState.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingViewState;", "Landroid/os/Parcelable;", "()V", "Content", "Error", "Loading", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingViewState$Content;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingViewState$Error;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingViewState$Loading;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class LandingViewState implements Parcelable {

    /* compiled from: LandingState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingViewState$Content;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingViewState;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Content extends LandingViewState {

        @k
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final LandingViewHeader f200247b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f200248c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final BottomState f200249d;

        /* compiled from: LandingState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Content> {
            @Override // android.os.Parcelable.Creator
            public final Content createFromParcel(Parcel parcel) {
                LandingViewHeader landingViewHeaderCreateFromParcel = parcel.readInt() == 0 ? null : LandingViewHeader.CREATOR.createFromParcel(parcel);
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Content.class, parcel, arrayList, iL2, 1);
                }
                return new Content(landingViewHeaderCreateFromParcel, arrayList, (BottomState) parcel.readParcelable(Content.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Content[] newArray(int i12) {
                return new Content[i12];
            }
        }

        public Content(@l LandingViewHeader landingViewHeader, @k ArrayList arrayList, @k BottomState bottomState) {
            super(null);
            this.f200247b = landingViewHeader;
            this.f200248c = arrayList;
            this.f200249d = bottomState;
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
            return L.f(this.f200247b, content.f200247b) && L.f(this.f200248c, content.f200248c) && L.f(this.f200249d, content.f200249d);
        }

        public final int hashCode() {
            LandingViewHeader landingViewHeader = this.f200247b;
            return this.f200249d.hashCode() + e.g(this.f200248c, (landingViewHeader == null ? 0 : landingViewHeader.hashCode()) * 31, 31);
        }

        @k
        public final String toString() {
            return "Content(header=" + this.f200247b + ", items=" + this.f200248c + ", bottomState=" + this.f200249d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            LandingViewHeader landingViewHeader = this.f200247b;
            if (landingViewHeader == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                landingViewHeader.writeToParcel(parcel, i12);
            }
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f200248c, parcel);
            while (itZ.hasNext()) {
                parcel.writeParcelable((Parcelable) itZ.next(), i12);
            }
            parcel.writeParcelable(this.f200249d, i12);
        }
    }

    /* compiled from: LandingState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingViewState$Error;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingViewState;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Error extends LandingViewState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Error f200250b = new Error();

        @k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* compiled from: LandingState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Error.f200250b;
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        public Error() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return 1433378062;
        }

        @k
        public final String toString() {
            return "Error";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: LandingState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/landing/mvi/entity/LandingViewState$Loading;", "Lcom/avito/android/mortgage/landing/mvi/entity/LandingViewState;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Loading extends LandingViewState {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Loading f200251b = new Loading();

        @k
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        /* compiled from: LandingState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Loading> {
            @Override // android.os.Parcelable.Creator
            public final Loading createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Loading.f200251b;
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

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 607453890;
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

    public /* synthetic */ LandingViewState(C42822w c42822w) {
        this();
    }

    public LandingViewState() {
    }
}
