package com.avito.android.developments_agency_search;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.screen.deal_cabinet.DealCabinetArguments;
import com.avito.android.developments_agency_search.screen.deal_room.model.DealRoomArguments;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.RealtyAgencySearchArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DevelopmentsAgencySearchFragmentParams.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_agency_search/DevelopmentsAgencySearchFragmentParams;", "Landroid/os/Parcelable;", "DealCabinetFragmentParams", "DealRoomFragmentParams", "RealtyAgencySearchFragmentParams", "Lcom/avito/android/developments_agency_search/DevelopmentsAgencySearchFragmentParams$DealCabinetFragmentParams;", "Lcom/avito/android/developments_agency_search/DevelopmentsAgencySearchFragmentParams$DealRoomFragmentParams;", "Lcom/avito/android/developments_agency_search/DevelopmentsAgencySearchFragmentParams$RealtyAgencySearchFragmentParams;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface DevelopmentsAgencySearchFragmentParams extends Parcelable {

    /* compiled from: DevelopmentsAgencySearchFragmentParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/DevelopmentsAgencySearchFragmentParams$DealCabinetFragmentParams;", "Lcom/avito/android/developments_agency_search/DevelopmentsAgencySearchFragmentParams;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class DealCabinetFragmentParams implements DevelopmentsAgencySearchFragmentParams {

        @k
        public static final Parcelable.Creator<DealCabinetFragmentParams> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DealCabinetArguments f136209b;

        /* compiled from: DevelopmentsAgencySearchFragmentParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DealCabinetFragmentParams> {
            @Override // android.os.Parcelable.Creator
            public final DealCabinetFragmentParams createFromParcel(Parcel parcel) {
                return new DealCabinetFragmentParams(DealCabinetArguments.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final DealCabinetFragmentParams[] newArray(int i12) {
                return new DealCabinetFragmentParams[i12];
            }
        }

        public DealCabinetFragmentParams(@k DealCabinetArguments dealCabinetArguments) {
            this.f136209b = dealCabinetArguments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DealCabinetFragmentParams) && L.f(this.f136209b, ((DealCabinetFragmentParams) obj).f136209b);
        }

        public final int hashCode() {
            return this.f136209b.hashCode();
        }

        @k
        public final String toString() {
            return "DealCabinetFragmentParams(args=" + this.f136209b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f136209b.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: DevelopmentsAgencySearchFragmentParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/DevelopmentsAgencySearchFragmentParams$DealRoomFragmentParams;", "Lcom/avito/android/developments_agency_search/DevelopmentsAgencySearchFragmentParams;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class DealRoomFragmentParams implements DevelopmentsAgencySearchFragmentParams {

        @k
        public static final Parcelable.Creator<DealRoomFragmentParams> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DealRoomArguments f136210b;

        /* compiled from: DevelopmentsAgencySearchFragmentParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DealRoomFragmentParams> {
            @Override // android.os.Parcelable.Creator
            public final DealRoomFragmentParams createFromParcel(Parcel parcel) {
                return new DealRoomFragmentParams((DealRoomArguments) parcel.readParcelable(DealRoomFragmentParams.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final DealRoomFragmentParams[] newArray(int i12) {
                return new DealRoomFragmentParams[i12];
            }
        }

        public DealRoomFragmentParams(@k DealRoomArguments dealRoomArguments) {
            this.f136210b = dealRoomArguments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DealRoomFragmentParams) && L.f(this.f136210b, ((DealRoomFragmentParams) obj).f136210b);
        }

        public final int hashCode() {
            return this.f136210b.hashCode();
        }

        @k
        public final String toString() {
            return "DealRoomFragmentParams(args=" + this.f136210b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f136210b, i12);
        }
    }

    /* compiled from: DevelopmentsAgencySearchFragmentParams.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/DevelopmentsAgencySearchFragmentParams$RealtyAgencySearchFragmentParams;", "Lcom/avito/android/developments_agency_search/DevelopmentsAgencySearchFragmentParams;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class RealtyAgencySearchFragmentParams implements DevelopmentsAgencySearchFragmentParams {

        @k
        public static final Parcelable.Creator<RealtyAgencySearchFragmentParams> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final RealtyAgencySearchArguments f136211b;

        /* compiled from: DevelopmentsAgencySearchFragmentParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RealtyAgencySearchFragmentParams> {
            @Override // android.os.Parcelable.Creator
            public final RealtyAgencySearchFragmentParams createFromParcel(Parcel parcel) {
                return new RealtyAgencySearchFragmentParams(RealtyAgencySearchArguments.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final RealtyAgencySearchFragmentParams[] newArray(int i12) {
                return new RealtyAgencySearchFragmentParams[i12];
            }
        }

        public RealtyAgencySearchFragmentParams(@k RealtyAgencySearchArguments realtyAgencySearchArguments) {
            this.f136211b = realtyAgencySearchArguments;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RealtyAgencySearchFragmentParams) && L.f(this.f136211b, ((RealtyAgencySearchFragmentParams) obj).f136211b);
        }

        public final int hashCode() {
            return this.f136211b.hashCode();
        }

        @k
        public final String toString() {
            return "RealtyAgencySearchFragmentParams(args=" + this.f136211b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.f136211b.writeToParcel(parcel, i12);
        }
    }
}
