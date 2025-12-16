package com.avito.android.travel_payment_methods.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LoanTerm.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_payment_methods/model/LoanTerm;", "Landroid/os/Parcelable;", "Progress", "_avito_travel-payment-methods_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LoanTerm implements Parcelable {

    @k
    public static final Parcelable.Creator<LoanTerm> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f302533b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Progress f302534c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f302535d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f302536e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AttributedText f302537f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f302538g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f302539h;

    /* compiled from: LoanTerm.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LoanTerm> {
        @Override // android.os.Parcelable.Creator
        public final LoanTerm createFromParcel(Parcel parcel) {
            return new LoanTerm(parcel.readString(), Progress.CREATOR.createFromParcel(parcel), (AttributedText) parcel.readParcelable(LoanTerm.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(LoanTerm.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final LoanTerm[] newArray(int i12) {
            return new LoanTerm[i12];
        }
    }

    public LoanTerm(@k String str, @k Progress progress, @l AttributedText attributedText, @k String str2, @k AttributedText attributedText2, @k String str3, boolean z12) {
        this.f302533b = str;
        this.f302534c = progress;
        this.f302535d = attributedText;
        this.f302536e = str2;
        this.f302537f = attributedText2;
        this.f302538g = str3;
        this.f302539h = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanTerm)) {
            return false;
        }
        LoanTerm loanTerm = (LoanTerm) obj;
        return L.f(this.f302533b, loanTerm.f302533b) && L.f(this.f302534c, loanTerm.f302534c) && L.f(this.f302535d, loanTerm.f302535d) && L.f(this.f302536e, loanTerm.f302536e) && L.f(this.f302537f, loanTerm.f302537f) && L.f(this.f302538g, loanTerm.f302538g) && this.f302539h == loanTerm.f302539h;
    }

    public final int hashCode() {
        int iHashCode = (this.f302534c.hashCode() + (this.f302533b.hashCode() * 31)) * 31;
        AttributedText attributedText = this.f302535d;
        return Boolean.hashCode(this.f302539h) + H.d(com.avito.android.actions_sheet.a.b(H.d((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f302536e), 31, this.f302537f), 31, this.f302538g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LoanTerm(planId=");
        sb2.append(this.f302533b);
        sb2.append(", progress=");
        sb2.append(this.f302534c);
        sb2.append(", subtitle=");
        sb2.append(this.f302535d);
        sb2.append(", termTitle=");
        sb2.append(this.f302536e);
        sb2.append(", title=");
        sb2.append(this.f302537f);
        sb2.append(", type=");
        sb2.append(this.f302538g);
        sb2.append(", isSelected=");
        return r.x(sb2, this.f302539h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f302533b);
        this.f302534c.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f302535d, i12);
        parcel.writeString(this.f302536e);
        parcel.writeParcelable(this.f302537f, i12);
        parcel.writeString(this.f302538g);
        parcel.writeInt(this.f302539h ? 1 : 0);
    }

    /* compiled from: LoanTerm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_payment_methods/model/LoanTerm$Progress;", "Landroid/os/Parcelable;", "ProgressBlock", "_avito_travel-payment-methods_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final class Progress implements Parcelable {

        @k
        public static final Parcelable.Creator<Progress> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final long f302540b;

        /* renamed from: c, reason: collision with root package name */
        public final long f302541c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final List<ProgressBlock> f302542d;

        /* compiled from: LoanTerm.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_methods/model/LoanTerm$Progress$ProgressBlock;", "Landroid/os/Parcelable;", "_avito_travel-payment-methods_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class ProgressBlock implements Parcelable {

            @k
            public static final Parcelable.Creator<ProgressBlock> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @l
            public final Long f302543b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final UniversalColor f302544c;

            /* renamed from: d, reason: collision with root package name */
            public final long f302545d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final Long f302546e;

            /* renamed from: f, reason: collision with root package name */
            @l
            public final AttributedText f302547f;

            /* renamed from: g, reason: collision with root package name */
            @l
            public final Long f302548g;

            /* renamed from: h, reason: collision with root package name */
            @k
            public final AttributedText f302549h;

            /* compiled from: LoanTerm.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ProgressBlock> {
                @Override // android.os.Parcelable.Creator
                public final ProgressBlock createFromParcel(Parcel parcel) {
                    return new ProgressBlock(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (UniversalColor) parcel.readParcelable(ProgressBlock.class.getClassLoader()), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (AttributedText) parcel.readParcelable(ProgressBlock.class.getClassLoader()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, (AttributedText) parcel.readParcelable(ProgressBlock.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ProgressBlock[] newArray(int i12) {
                    return new ProgressBlock[i12];
                }
            }

            public ProgressBlock(@l Long l12, @k UniversalColor universalColor, long j12, @l Long l13, @l AttributedText attributedText, @l Long l14, @k AttributedText attributedText2) {
                this.f302543b = l12;
                this.f302544c = universalColor;
                this.f302545d = j12;
                this.f302546e = l13;
                this.f302547f = attributedText;
                this.f302548g = l14;
                this.f302549h = attributedText2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                Long l12 = this.f302543b;
                if (l12 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.m(parcel, 1, l12);
                }
                parcel.writeParcelable(this.f302544c, i12);
                parcel.writeLong(this.f302545d);
                Long l13 = this.f302546e;
                if (l13 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.m(parcel, 1, l13);
                }
                parcel.writeParcelable(this.f302547f, i12);
                Long l14 = this.f302548g;
                if (l14 == null) {
                    parcel.writeInt(0);
                } else {
                    C0.m(parcel, 1, l14);
                }
                parcel.writeParcelable(this.f302549h, i12);
            }
        }

        /* compiled from: LoanTerm.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Progress> {
            @Override // android.os.Parcelable.Creator
            public final Progress createFromParcel(Parcel parcel) {
                long j12 = parcel.readLong();
                long j13 = parcel.readLong();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(ProgressBlock.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Progress(j12, arrayList, j13);
            }

            @Override // android.os.Parcelable.Creator
            public final Progress[] newArray(int i12) {
                return new Progress[i12];
            }
        }

        public Progress(long j12, @k List list, long j13) {
            this.f302540b = j12;
            this.f302541c = j13;
            this.f302542d = list;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.f302540b);
            parcel.writeLong(this.f302541c);
            Iterator itJ = C0.j(this.f302542d, parcel);
            while (itJ.hasNext()) {
                ((ProgressBlock) itJ.next()).writeToParcel(parcel, i12);
            }
        }

        public Progress(long j12, long j13, List list, int i12, C42822w c42822w) {
            this(j12, (i12 & 4) != 0 ? C42784z0.f406748b : list, j13);
        }
    }
}
