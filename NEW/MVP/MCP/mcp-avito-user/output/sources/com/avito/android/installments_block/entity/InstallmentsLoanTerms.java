package com.avito.android.installments_block.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsLoanTerms.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/installments_block/entity/InstallmentsLoanTerms;", "Landroid/os/Parcelable;", "Term", "_avito_installments-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class InstallmentsLoanTerms implements Parcelable {

    @k
    public static final Parcelable.Creator<InstallmentsLoanTerms> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f172858b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f172859c;

    /* compiled from: InstallmentsLoanTerms.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/installments_block/entity/InstallmentsLoanTerms$Term;", "Landroid/os/Parcelable;", "Badge", "_avito_installments-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Term implements Parcelable {

        @k
        public static final Parcelable.Creator<Term> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f172860b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Badge f172861c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f172862d;

        /* compiled from: InstallmentsLoanTerms.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/installments_block/entity/InstallmentsLoanTerms$Term$Badge;", "Landroid/os/Parcelable;", "Ellipse", "Text", "Lcom/avito/android/installments_block/entity/InstallmentsLoanTerms$Term$Badge$Ellipse;", "Lcom/avito/android/installments_block/entity/InstallmentsLoanTerms$Term$Badge$Text;", "_avito_installments-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface Badge extends Parcelable {

            /* compiled from: InstallmentsLoanTerms.kt */
            @d
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/installments_block/entity/InstallmentsLoanTerms$Term$Badge$Ellipse;", "Lcom/avito/android/installments_block/entity/InstallmentsLoanTerms$Term$Badge;", "<init>", "()V", "_avito_installments-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Ellipse implements Badge {

                /* renamed from: b, reason: collision with root package name */
                @k
                public static final Ellipse f172863b = new Ellipse();

                @k
                public static final Parcelable.Creator<Ellipse> CREATOR = new a();

                /* compiled from: InstallmentsLoanTerms.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Ellipse> {
                    @Override // android.os.Parcelable.Creator
                    public final Ellipse createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return Ellipse.f172863b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Ellipse[] newArray(int i12) {
                        return new Ellipse[i12];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    return this == obj || (obj instanceof Ellipse);
                }

                public final int hashCode() {
                    return -1768609742;
                }

                @k
                public final String toString() {
                    return "Ellipse";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeInt(1);
                }
            }

            /* compiled from: InstallmentsLoanTerms.kt */
            @d
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments_block/entity/InstallmentsLoanTerms$Term$Badge$Text;", "Lcom/avito/android/installments_block/entity/InstallmentsLoanTerms$Term$Badge;", "_avito_installments-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Text implements Badge {

                @k
                public static final Parcelable.Creator<Text> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @k
                public final String f172864b;

                /* compiled from: InstallmentsLoanTerms.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Text> {
                    @Override // android.os.Parcelable.Creator
                    public final Text createFromParcel(Parcel parcel) {
                        return new Text(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Text[] newArray(int i12) {
                        return new Text[i12];
                    }
                }

                public Text(@k String str) {
                    this.f172864b = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Text) && L.f(this.f172864b, ((Text) obj).f172864b);
                }

                public final int hashCode() {
                    return this.f172864b.hashCode();
                }

                @k
                public final String toString() {
                    return C22026a.c(new StringBuilder("Text(payload="), this.f172864b, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeString(this.f172864b);
                }
            }
        }

        /* compiled from: InstallmentsLoanTerms.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Term> {
            @Override // android.os.Parcelable.Creator
            public final Term createFromParcel(Parcel parcel) {
                return new Term(parcel.readString(), (Badge) parcel.readParcelable(Term.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Term[] newArray(int i12) {
                return new Term[i12];
            }
        }

        public Term(@k String str, @l Badge badge, @k String str2) {
            this.f172860b = str;
            this.f172861c = badge;
            this.f172862d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Term)) {
                return false;
            }
            Term term = (Term) obj;
            return L.f(this.f172860b, term.f172860b) && L.f(this.f172861c, term.f172861c) && L.f(this.f172862d, term.f172862d);
        }

        public final int hashCode() {
            int iHashCode = this.f172860b.hashCode() * 31;
            Badge badge = this.f172861c;
            return this.f172862d.hashCode() + ((iHashCode + (badge == null ? 0 : badge.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Term(planId=");
            sb2.append(this.f172860b);
            sb2.append(", badge=");
            sb2.append(this.f172861c);
            sb2.append(", title=");
            return C22026a.c(sb2, this.f172862d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f172860b);
            parcel.writeParcelable(this.f172861c, i12);
            parcel.writeString(this.f172862d);
        }
    }

    /* compiled from: InstallmentsLoanTerms.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InstallmentsLoanTerms> {
        @Override // android.os.Parcelable.Creator
        public final InstallmentsLoanTerms createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(Term.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new InstallmentsLoanTerms(i12, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentsLoanTerms[] newArray(int i12) {
            return new InstallmentsLoanTerms[i12];
        }
    }

    public InstallmentsLoanTerms(int i12, @k ArrayList arrayList) {
        this.f172858b = i12;
        this.f172859c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentsLoanTerms)) {
            return false;
        }
        InstallmentsLoanTerms installmentsLoanTerms = (InstallmentsLoanTerms) obj;
        return this.f172858b == installmentsLoanTerms.f172858b && this.f172859c.equals(installmentsLoanTerms.f172859c);
    }

    public final int hashCode() {
        return this.f172859c.hashCode() + (Integer.hashCode(this.f172858b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsLoanTerms(defaultTerm=");
        sb2.append(this.f172858b);
        sb2.append(", terms=");
        return e.p(sb2, this.f172859c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f172858b);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f172859c, parcel);
        while (itZ.hasNext()) {
            ((Term) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
