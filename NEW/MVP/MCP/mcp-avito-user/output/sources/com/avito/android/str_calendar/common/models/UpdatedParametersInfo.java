package com.avito.android.str_calendar.common.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.bxcontent.mvi.entity.f;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UpdatedParametersInfo.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/str_calendar/common/models/UpdatedParametersInfo;", "Landroid/os/Parcelable;", "Base", "Ranged", "Lcom/avito/android/str_calendar/common/models/UpdatedParametersInfo$Base;", "Lcom/avito/android/str_calendar/common/models/UpdatedParametersInfo$Ranged;", "_avito_str-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface UpdatedParametersInfo extends Parcelable {

    /* compiled from: UpdatedParametersInfo.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/common/models/UpdatedParametersInfo$Base;", "Lcom/avito/android/str_calendar/common/models/UpdatedParametersInfo;", "_avito_str-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Base implements UpdatedParametersInfo {

        @k
        public static final Parcelable.Creator<Base> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f286649b;

        /* compiled from: UpdatedParametersInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Base> {
            @Override // android.os.Parcelable.Creator
            public final Base createFromParcel(Parcel parcel) {
                return new Base(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Base[] newArray(int i12) {
                return new Base[i12];
            }
        }

        public Base(@k String str) {
            this.f286649b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Base) && L.f(this.f286649b, ((Base) obj).f286649b);
        }

        public final int hashCode() {
            return this.f286649b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Base(itemId="), this.f286649b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f286649b);
        }
    }

    /* compiled from: UpdatedParametersInfo.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/common/models/UpdatedParametersInfo$Ranged;", "Lcom/avito/android/str_calendar/common/models/UpdatedParametersInfo;", "_avito_str-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Ranged implements UpdatedParametersInfo {

        @k
        public static final Parcelable.Creator<Ranged> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f286650b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Date f286651c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final Date f286652d;

        /* compiled from: UpdatedParametersInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Ranged> {
            @Override // android.os.Parcelable.Creator
            public final Ranged createFromParcel(Parcel parcel) {
                return new Ranged(parcel.readString(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Ranged[] newArray(int i12) {
                return new Ranged[i12];
            }
        }

        public Ranged(@k String str, @k Date date, @k Date date2) {
            this.f286650b = str;
            this.f286651c = date;
            this.f286652d = date2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ranged)) {
                return false;
            }
            Ranged ranged = (Ranged) obj;
            return L.f(this.f286650b, ranged.f286650b) && L.f(this.f286651c, ranged.f286651c) && L.f(this.f286652d, ranged.f286652d);
        }

        public final int hashCode() {
            return this.f286652d.hashCode() + m.f(this.f286651c, this.f286650b.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Ranged(itemId=");
            sb2.append(this.f286650b);
            sb2.append(", startDate=");
            sb2.append(this.f286651c);
            sb2.append(", endDate=");
            return f.n(sb2, this.f286652d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f286650b);
            parcel.writeSerializable(this.f286651c);
            parcel.writeSerializable(this.f286652d);
        }
    }
}
