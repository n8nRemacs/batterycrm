package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: CalendarLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/CalendarLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "CalendarData", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CalendarLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<CalendarLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CalendarData f133077b;

    /* compiled from: CalendarLink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/avito/android/deep_linking/links/CalendarLink$CalendarData;", "Landroid/os/Parcelable;", "Ljava/util/Date;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, "", "title", "itemId", "<init>", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/util/Date;", "c", "()Ljava/util/Date;", "d", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getItemId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CalendarData implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<CalendarData> CREATOR = new a();

        @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME)
        @Y61.l
        private final Date from;

        @com.google.gson.annotations.c("itemId")
        @Y61.l
        private final String itemId;

        @com.google.gson.annotations.c("title")
        @Y61.l
        private final String title;

        @com.google.gson.annotations.c(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME)
        @Y61.l
        private final Date to;

        /* compiled from: CalendarLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CalendarData> {
            @Override // android.os.Parcelable.Creator
            public final CalendarData createFromParcel(Parcel parcel) {
                return new CalendarData((Date) parcel.readSerializable(), (Date) parcel.readSerializable(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CalendarData[] newArray(int i12) {
                return new CalendarData[i12];
            }
        }

        public CalendarData() {
            this(null, null, null, null, 15, null);
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final Date getFrom() {
            return this.from;
        }

        @Y61.l
        /* renamed from: d, reason: from getter */
        public final Date getTo() {
            return this.to;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CalendarData)) {
                return false;
            }
            CalendarData calendarData = (CalendarData) obj;
            return kotlin.jvm.internal.L.f(this.from, calendarData.from) && kotlin.jvm.internal.L.f(this.to, calendarData.to) && kotlin.jvm.internal.L.f(this.title, calendarData.title) && kotlin.jvm.internal.L.f(this.itemId, calendarData.itemId);
        }

        @Y61.l
        public final String getItemId() {
            return this.itemId;
        }

        @Y61.l
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            Date date = this.from;
            int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
            Date date2 = this.to;
            int iHashCode2 = (iHashCode + (date2 == null ? 0 : date2.hashCode())) * 31;
            String str = this.title;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.itemId;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CalendarData(from=");
            sb2.append(this.from);
            sb2.append(", to=");
            sb2.append(this.to);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", itemId=");
            return C22026a.c(sb2, this.itemId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeSerializable(this.from);
            parcel.writeSerializable(this.to);
            parcel.writeString(this.title);
            parcel.writeString(this.itemId);
        }

        public CalendarData(@Y61.l Date date, @Y61.l Date date2, @Y61.l String str, @Y61.l String str2) {
            this.from = date;
            this.to = date2;
            this.title = str;
            this.itemId = str2;
        }

        public /* synthetic */ CalendarData(Date date, Date date2, String str, String str2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : date, (i12 & 2) != 0 ? null : date2, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : str2);
        }
    }

    /* compiled from: CalendarLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CalendarLink> {
        @Override // android.os.Parcelable.Creator
        public final CalendarLink createFromParcel(Parcel parcel) {
            return new CalendarLink(CalendarData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CalendarLink[] newArray(int i12) {
            return new CalendarLink[i12];
        }
    }

    /* compiled from: CalendarLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/deep_linking/links/CalendarLink$b;", "LJu/c$b;", "a", "b", "c", "Lcom/avito/android/deep_linking/links/CalendarLink$b$a;", "Lcom/avito/android/deep_linking/links/CalendarLink$b$b;", "Lcom/avito/android/deep_linking/links/CalendarLink$b$c;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: CalendarLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/CalendarLink$b$a;", "Lcom/avito/android/deep_linking/links/CalendarLink$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Date f133079b;

            public a(@Y61.k Date date) {
                this.f133079b = date;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f133079b, ((a) obj).f133079b);
            }

            public final int hashCode() {
                return this.f133079b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.bxcontent.mvi.entity.f.n(new StringBuilder("DateChosen(date="), this.f133079b, ')');
            }
        }

        /* compiled from: CalendarLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/CalendarLink$b$b;", "Lcom/avito/android/deep_linking/links/CalendarLink$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.CalendarLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C3988b implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Date f133080b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final Date f133081c;

            public C3988b(@Y61.k Date date, @Y61.k Date date2) {
                this.f133080b = date;
                this.f133081c = date2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3988b)) {
                    return false;
                }
                C3988b c3988b = (C3988b) obj;
                return kotlin.jvm.internal.L.f(this.f133080b, c3988b.f133080b) && kotlin.jvm.internal.L.f(this.f133081c, c3988b.f133081c);
            }

            public final int hashCode() {
                return this.f133081c.hashCode() + (this.f133080b.hashCode() * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("IntervalChosen(from=");
                sb2.append(this.f133080b);
                sb2.append(", to=");
                return com.avito.android.bxcontent.mvi.entity.f.n(sb2, this.f133081c, ')');
            }
        }

        /* compiled from: CalendarLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/CalendarLink$b$c;", "Lcom/avito/android/deep_linking/links/CalendarLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final c f133082b = new c();
        }
    }

    public CalendarLink(@Y61.k CalendarData calendarData) {
        this.f133077b = calendarData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CalendarLink) && kotlin.jvm.internal.L.f(this.f133077b, ((CalendarLink) obj).f133077b);
    }

    public final int hashCode() {
        return this.f133077b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "CalendarLink(calendarData=" + this.f133077b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f133077b.writeToParcel(parcel, i12);
    }
}
