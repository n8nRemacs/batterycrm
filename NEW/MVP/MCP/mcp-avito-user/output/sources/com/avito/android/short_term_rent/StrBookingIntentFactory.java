package com.avito.android.short_term_rent;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import java.util.Date;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingIntentFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/StrBookingIntentFactory;", "", "CalendarRestriction", "_avito_short-term-rent_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface StrBookingIntentFactory {

    /* compiled from: StrBookingIntentFactory.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/StrBookingIntentFactory$CalendarRestriction;", "Landroid/os/Parcelable;", "Min", "Lcom/avito/android/short_term_rent/StrBookingIntentFactory$CalendarRestriction$Min;", "_avito_short-term-rent_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface CalendarRestriction extends Parcelable {

        /* compiled from: StrBookingIntentFactory.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/StrBookingIntentFactory$CalendarRestriction$Min;", "Lcom/avito/android/short_term_rent/StrBookingIntentFactory$CalendarRestriction;", "_avito_short-term-rent_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Min implements CalendarRestriction {

            @Y61.k
            public static final Parcelable.Creator<Min> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            public final int f281174b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f281175c;

            /* compiled from: StrBookingIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Min> {
                @Override // android.os.Parcelable.Creator
                public final Min createFromParcel(Parcel parcel) {
                    return new Min(parcel.readInt(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Min[] newArray(int i12) {
                    return new Min[i12];
                }
            }

            public Min(int i12, @Y61.k String str) {
                this.f281174b = i12;
                this.f281175c = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Min)) {
                    return false;
                }
                Min min = (Min) obj;
                return this.f281174b == min.f281174b && L.f(this.f281175c, min.f281175c);
            }

            public final int hashCode() {
                return this.f281175c.hashCode() + (Integer.hashCode(this.f281174b) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Min(minDays=");
                sb2.append(this.f281174b);
                sb2.append(", errorText=");
                return C22026a.c(sb2, this.f281175c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(this.f281174b);
                parcel.writeString(this.f281175c);
            }
        }
    }

    /* compiled from: StrBookingIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    Intent a(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Integer num, boolean z12, @Y61.l String str5, @Y61.l Boolean bool, @Y61.l String str6, @Y61.l Boolean bool2, @Y61.l String str7, @Y61.l String str8);

    @Y61.k
    @InterfaceC42830m
    Intent b(@Y61.l String str, @Y61.l Date date, @Y61.l Date date2);

    @Y61.k
    @InterfaceC42830m
    Intent c(@Y61.l Date date, @Y61.l Date date2, @Y61.k Date date3, @Y61.k Date date4);

    @Y61.k
    Intent d(@Y61.l Date date, @Y61.l Date date2, @Y61.k String str, @Y61.l String str2);

    @Y61.k
    Intent e(@Y61.k String str, @Y61.l String str2, @Y61.l String str3);
}
