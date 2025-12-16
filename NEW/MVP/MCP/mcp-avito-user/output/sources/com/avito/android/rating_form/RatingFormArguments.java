package com.avito.android.rating_form;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingFormArguments.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating_form/RatingFormArguments;", "Landroid/os/Parcelable;", "RatingModelArguments", "RatingSellerArguments", "Lcom/avito/android/rating_form/RatingFormArguments$RatingModelArguments;", "Lcom/avito/android/rating_form/RatingFormArguments$RatingSellerArguments;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface RatingFormArguments extends Parcelable {

    /* compiled from: RatingFormArguments.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/RatingFormArguments$RatingSellerArguments;", "Lcom/avito/android/rating_form/RatingFormArguments;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RatingSellerArguments implements RatingFormArguments {

        @Y61.k
        public static final Parcelable.Creator<RatingSellerArguments> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f247909b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Map<String, Serializable> f247910c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f247911d;

        /* compiled from: RatingFormArguments.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RatingSellerArguments> {
            @Override // android.os.Parcelable.Creator
            public final RatingSellerArguments createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    linkedHashMap.put(parcel.readString(), parcel.readSerializable());
                }
                return new RatingSellerArguments(string, linkedHashMap, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final RatingSellerArguments[] newArray(int i12) {
                return new RatingSellerArguments[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RatingSellerArguments(@Y61.k String str, @Y61.k Map<String, ? extends Serializable> map, @Y61.l String str2) {
            this.f247909b = str;
            this.f247910c = map;
            this.f247911d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RatingSellerArguments)) {
                return false;
            }
            RatingSellerArguments ratingSellerArguments = (RatingSellerArguments) obj;
            return L.f(this.f247909b, ratingSellerArguments.f247909b) && L.f(this.f247910c, ratingSellerArguments.f247910c) && L.f(this.f247911d, ratingSellerArguments.f247911d);
        }

        public final int hashCode() {
            int iC2 = AK.c.c(this.f247909b.hashCode() * 31, 31, this.f247910c);
            String str = this.f247911d;
            return iC2 + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RatingSellerArguments(fid=");
            sb2.append(this.f247909b);
            sb2.append(", queryMap=");
            sb2.append(this.f247910c);
            sb2.append(", publishedRatingUserKey=");
            return C22026a.c(sb2, this.f247911d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f247909b);
            Iterator itI = C0.i(parcel, this.f247910c);
            while (itI.hasNext()) {
                Map.Entry entry = (Map.Entry) itI.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeSerializable((Serializable) entry.getValue());
            }
            parcel.writeString(this.f247911d);
        }
    }

    /* compiled from: RatingFormArguments.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/RatingFormArguments$RatingModelArguments;", "Lcom/avito/android/rating_form/RatingFormArguments;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RatingModelArguments implements RatingFormArguments {

        @Y61.k
        public static final Parcelable.Creator<RatingModelArguments> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f247904b;

        /* renamed from: c, reason: collision with root package name */
        public final int f247905c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Integer f247906d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f247907e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f247908f;

        /* compiled from: RatingFormArguments.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<RatingModelArguments> {
            @Override // android.os.Parcelable.Creator
            public final RatingModelArguments createFromParcel(Parcel parcel) {
                return new RatingModelArguments(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final RatingModelArguments[] newArray(int i12) {
                return new RatingModelArguments[i12];
            }
        }

        public RatingModelArguments(int i12, @Y61.l Integer num, @Y61.l String str, @Y61.l String str2, boolean z12) {
            this.f247904b = str;
            this.f247905c = i12;
            this.f247906d = num;
            this.f247907e = str2;
            this.f247908f = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RatingModelArguments)) {
                return false;
            }
            RatingModelArguments ratingModelArguments = (RatingModelArguments) obj;
            return L.f(this.f247904b, ratingModelArguments.f247904b) && this.f247905c == ratingModelArguments.f247905c && L.f(this.f247906d, ratingModelArguments.f247906d) && L.f(this.f247907e, ratingModelArguments.f247907e) && this.f247908f == ratingModelArguments.f247908f;
        }

        public final int hashCode() {
            String str = this.f247904b;
            int iE2 = androidx.appcompat.app.r.e(this.f247905c, (str == null ? 0 : str.hashCode()) * 31, 31);
            Integer num = this.f247906d;
            int iHashCode = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.f247907e;
            return Boolean.hashCode(this.f247908f) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RatingModelArguments(pageFrom=");
            sb2.append(this.f247904b);
            sb2.append(", categoryId=");
            sb2.append(this.f247905c);
            sb2.append(", catalogId=");
            sb2.append(this.f247906d);
            sb2.append(", path=");
            sb2.append(this.f247907e);
            sb2.append(", fromPush=");
            return androidx.appcompat.app.r.x(sb2, this.f247908f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f247904b);
            parcel.writeInt(this.f247905c);
            Integer num = this.f247906d;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeString(this.f247907e);
            parcel.writeInt(this.f247908f ? 1 : 0);
        }

        public /* synthetic */ RatingModelArguments(String str, int i12, Integer num, String str2, boolean z12, int i13, C42822w c42822w) {
            this(i12, (i13 & 4) != 0 ? null : num, (i13 & 1) != 0 ? null : str, str2, z12);
        }
    }
}
