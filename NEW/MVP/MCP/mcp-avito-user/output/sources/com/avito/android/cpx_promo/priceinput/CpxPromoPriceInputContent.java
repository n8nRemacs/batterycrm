package com.avito.android.cpx_promo.priceinput;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CpxPromoPriceInputContent.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/CpxPromoPriceInputContent;", "Landroid/os/Parcelable;", "DisplayingEventParams", "Input", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CpxPromoPriceInputContent implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CpxPromoPriceInputContent> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CpxPromoInputSource f127252b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f127253c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Input f127254d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f127255e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final DisplayingEventParams f127256f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f127257g;

    /* compiled from: CpxPromoPriceInputContent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/CpxPromoPriceInputContent$DisplayingEventParams;", "Landroid/os/Parcelable;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class DisplayingEventParams implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<DisplayingEventParams> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f127258b;

        /* renamed from: c, reason: collision with root package name */
        public final int f127259c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f127260d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f127261e;

        /* compiled from: CpxPromoPriceInputContent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DisplayingEventParams> {
            @Override // android.os.Parcelable.Creator
            public final DisplayingEventParams createFromParcel(Parcel parcel) {
                return new DisplayingEventParams(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final DisplayingEventParams[] newArray(int i12) {
                return new DisplayingEventParams[i12];
            }
        }

        public DisplayingEventParams(int i12, int i13, @Y61.k String str, boolean z12) {
            this.f127258b = i12;
            this.f127259c = i13;
            this.f127260d = str;
            this.f127261e = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f127258b);
            parcel.writeInt(this.f127259c);
            parcel.writeString(this.f127260d);
            parcel.writeInt(this.f127261e ? 1 : 0);
        }
    }

    /* compiled from: CpxPromoPriceInputContent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/CpxPromoPriceInputContent$Input;", "Landroid/os/Parcelable;", "Constraints", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class Input implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Input> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f127262b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f127263c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Long f127264d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f127265e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Constraints f127266f;

        /* compiled from: CpxPromoPriceInputContent.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cpx_promo/priceinput/CpxPromoPriceInputContent$Input$Constraints;", "Landroid/os/Parcelable;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class Constraints implements Parcelable {

            @Y61.k
            public static final Parcelable.Creator<Constraints> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final Long f127267b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final Long f127268c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.l
            public final String f127269d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final String f127270e;

            /* compiled from: CpxPromoPriceInputContent.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Constraints> {
                @Override // android.os.Parcelable.Creator
                public final Constraints createFromParcel(Parcel parcel) {
                    return new Constraints(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Constraints[] newArray(int i12) {
                    return new Constraints[i12];
                }
            }

            public Constraints(@Y61.l Long l12, @Y61.l String str, @Y61.l Long l13, @Y61.l String str2) {
                this.f127267b = l12;
                this.f127268c = l13;
                this.f127269d = str;
                this.f127270e = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                Long l12 = this.f127267b;
                if (l12 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.m(parcel, 1, l12);
                }
                Long l13 = this.f127268c;
                if (l13 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.m(parcel, 1, l13);
                }
                parcel.writeString(this.f127269d);
                parcel.writeString(this.f127270e);
            }
        }

        /* compiled from: CpxPromoPriceInputContent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Input> {
            @Override // android.os.Parcelable.Creator
            public final Input createFromParcel(Parcel parcel) {
                return new Input(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? Constraints.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Input[] newArray(int i12) {
                return new Input[i12];
            }
        }

        public Input(@Y61.l String str, @Y61.l String str2, @Y61.l Long l12, @Y61.l String str3, @Y61.l Constraints constraints) {
            this.f127262b = str;
            this.f127263c = str2;
            this.f127264d = l12;
            this.f127265e = str3;
            this.f127266f = constraints;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f127262b);
            parcel.writeString(this.f127263c);
            Long l12 = this.f127264d;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeString(this.f127265e);
            Constraints constraints = this.f127266f;
            if (constraints == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                constraints.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: CpxPromoPriceInputContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CpxPromoPriceInputContent> {
        @Override // android.os.Parcelable.Creator
        public final CpxPromoPriceInputContent createFromParcel(Parcel parcel) {
            return new CpxPromoPriceInputContent(CpxPromoInputSource.valueOf(parcel.readString()), parcel.readString(), Input.CREATOR.createFromParcel(parcel), parcel.readString(), DisplayingEventParams.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CpxPromoPriceInputContent[] newArray(int i12) {
            return new CpxPromoPriceInputContent[i12];
        }
    }

    public CpxPromoPriceInputContent(@Y61.k CpxPromoInputSource cpxPromoInputSource, @Y61.k String str, @Y61.k Input input, @Y61.k String str2, @Y61.k DisplayingEventParams displayingEventParams, @Y61.l String str3) {
        this.f127252b = cpxPromoInputSource;
        this.f127253c = str;
        this.f127254d = input;
        this.f127255e = str2;
        this.f127256f = displayingEventParams;
        this.f127257g = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f127252b.name());
        parcel.writeString(this.f127253c);
        this.f127254d.writeToParcel(parcel, i12);
        parcel.writeString(this.f127255e);
        this.f127256f.writeToParcel(parcel, i12);
        parcel.writeString(this.f127257g);
    }

    public /* synthetic */ CpxPromoPriceInputContent(CpxPromoInputSource cpxPromoInputSource, String str, Input input, String str2, DisplayingEventParams displayingEventParams, String str3, int i12, C42822w c42822w) {
        this(cpxPromoInputSource, str, input, str2, displayingEventParams, (i12 & 32) != 0 ? null : str3);
    }
}
