package com.avito.android.saved_searches.presentation.items.chips;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.saved_searches.model.SavedSearchData;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchChipsItem.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/chips/SavedSearchChipsItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "<init>", "()V", "DayOfWeek", "Periodicity", "TimeOfDay", "Lcom/avito/android/saved_searches/presentation/items/chips/SavedSearchChipsItem$DayOfWeek;", "Lcom/avito/android/saved_searches/presentation/items/chips/SavedSearchChipsItem$Periodicity;", "Lcom/avito/android/saved_searches/presentation/items/chips/SavedSearchChipsItem$TimeOfDay;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SavedSearchChipsItem implements ParcelableItem {

    /* compiled from: SavedSearchChipsItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/chips/SavedSearchChipsItem$DayOfWeek;", "Lcom/avito/android/saved_searches/presentation/items/chips/SavedSearchChipsItem;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DayOfWeek extends SavedSearchChipsItem {

        @Y61.k
        public static final Parcelable.Creator<DayOfWeek> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f258443b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final SavedSearchData.Settings.SettingsDetails.Parameter f258444c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f258445d;

        /* compiled from: SavedSearchChipsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DayOfWeek> {
            @Override // android.os.Parcelable.Creator
            public final DayOfWeek createFromParcel(Parcel parcel) {
                return new DayOfWeek(parcel.readString(), (SavedSearchData.Settings.SettingsDetails.Parameter) parcel.readParcelable(DayOfWeek.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DayOfWeek[] newArray(int i12) {
                return new DayOfWeek[i12];
            }
        }

        public DayOfWeek(@Y61.k String str, @Y61.k SavedSearchData.Settings.SettingsDetails.Parameter parameter, @l String str2) {
            super(null);
            this.f258443b = str;
            this.f258444c = parameter;
            this.f258445d = str2;
        }

        @Override // com.avito.android.saved_searches.presentation.items.chips.SavedSearchChipsItem
        @Y61.k
        /* renamed from: L, reason: from getter */
        public final SavedSearchData.Settings.SettingsDetails.Parameter getF258450c() {
            return this.f258444c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DayOfWeek)) {
                return false;
            }
            DayOfWeek dayOfWeek = (DayOfWeek) obj;
            return L.f(this.f258443b, dayOfWeek.f258443b) && L.f(this.f258444c, dayOfWeek.f258444c) && L.f(this.f258445d, dayOfWeek.f258445d);
        }

        @Override // com.avito.android.saved_searches.presentation.items.chips.SavedSearchChipsItem
        @l
        /* renamed from: f, reason: from getter */
        public final String getF258451d() {
            return this.f258445d;
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF250794b() {
            return this.f258443b;
        }

        public final int hashCode() {
            int iHashCode = (this.f258444c.hashCode() + (this.f258443b.hashCode() * 31)) * 31;
            String str = this.f258445d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DayOfWeek(stringId=");
            sb2.append(this.f258443b);
            sb2.append(", parameter=");
            sb2.append(this.f258444c);
            sb2.append(", errorMessage=");
            return C22026a.c(sb2, this.f258445d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f258443b);
            parcel.writeParcelable(this.f258444c, i12);
            parcel.writeString(this.f258445d);
        }
    }

    /* compiled from: SavedSearchChipsItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/chips/SavedSearchChipsItem$Periodicity;", "Lcom/avito/android/saved_searches/presentation/items/chips/SavedSearchChipsItem;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Periodicity extends SavedSearchChipsItem {

        @Y61.k
        public static final Parcelable.Creator<Periodicity> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f258446b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final SavedSearchData.Settings.SettingsDetails.Parameter f258447c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f258448d;

        /* compiled from: SavedSearchChipsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Periodicity> {
            @Override // android.os.Parcelable.Creator
            public final Periodicity createFromParcel(Parcel parcel) {
                return new Periodicity(parcel.readString(), (SavedSearchData.Settings.SettingsDetails.Parameter) parcel.readParcelable(Periodicity.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Periodicity[] newArray(int i12) {
                return new Periodicity[i12];
            }
        }

        public Periodicity(@Y61.k String str, @Y61.k SavedSearchData.Settings.SettingsDetails.Parameter parameter, @l String str2) {
            super(null);
            this.f258446b = str;
            this.f258447c = parameter;
            this.f258448d = str2;
        }

        @Override // com.avito.android.saved_searches.presentation.items.chips.SavedSearchChipsItem
        @Y61.k
        /* renamed from: L, reason: from getter */
        public final SavedSearchData.Settings.SettingsDetails.Parameter getF258450c() {
            return this.f258447c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Periodicity)) {
                return false;
            }
            Periodicity periodicity = (Periodicity) obj;
            return L.f(this.f258446b, periodicity.f258446b) && L.f(this.f258447c, periodicity.f258447c) && L.f(this.f258448d, periodicity.f258448d);
        }

        @Override // com.avito.android.saved_searches.presentation.items.chips.SavedSearchChipsItem
        @l
        /* renamed from: f, reason: from getter */
        public final String getF258451d() {
            return this.f258448d;
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF250794b() {
            return this.f258446b;
        }

        public final int hashCode() {
            int iHashCode = (this.f258447c.hashCode() + (this.f258446b.hashCode() * 31)) * 31;
            String str = this.f258448d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Periodicity(stringId=");
            sb2.append(this.f258446b);
            sb2.append(", parameter=");
            sb2.append(this.f258447c);
            sb2.append(", errorMessage=");
            return C22026a.c(sb2, this.f258448d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f258446b);
            parcel.writeParcelable(this.f258447c, i12);
            parcel.writeString(this.f258448d);
        }
    }

    /* compiled from: SavedSearchChipsItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/saved_searches/presentation/items/chips/SavedSearchChipsItem$TimeOfDay;", "Lcom/avito/android/saved_searches/presentation/items/chips/SavedSearchChipsItem;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TimeOfDay extends SavedSearchChipsItem {

        @Y61.k
        public static final Parcelable.Creator<TimeOfDay> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f258449b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final SavedSearchData.Settings.SettingsDetails.Parameter f258450c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f258451d;

        /* compiled from: SavedSearchChipsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TimeOfDay> {
            @Override // android.os.Parcelable.Creator
            public final TimeOfDay createFromParcel(Parcel parcel) {
                return new TimeOfDay(parcel.readString(), (SavedSearchData.Settings.SettingsDetails.Parameter) parcel.readParcelable(TimeOfDay.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TimeOfDay[] newArray(int i12) {
                return new TimeOfDay[i12];
            }
        }

        public TimeOfDay(@Y61.k String str, @Y61.k SavedSearchData.Settings.SettingsDetails.Parameter parameter, @l String str2) {
            super(null);
            this.f258449b = str;
            this.f258450c = parameter;
            this.f258451d = str2;
        }

        @Override // com.avito.android.saved_searches.presentation.items.chips.SavedSearchChipsItem
        @Y61.k
        /* renamed from: L, reason: from getter */
        public final SavedSearchData.Settings.SettingsDetails.Parameter getF258450c() {
            return this.f258450c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimeOfDay)) {
                return false;
            }
            TimeOfDay timeOfDay = (TimeOfDay) obj;
            return L.f(this.f258449b, timeOfDay.f258449b) && L.f(this.f258450c, timeOfDay.f258450c) && L.f(this.f258451d, timeOfDay.f258451d);
        }

        @Override // com.avito.android.saved_searches.presentation.items.chips.SavedSearchChipsItem
        @l
        /* renamed from: f, reason: from getter */
        public final String getF258451d() {
            return this.f258451d;
        }

        @Override // com.avito.conveyor_item.a
        @Y61.k
        /* renamed from: getStringId, reason: from getter */
        public final String getF250794b() {
            return this.f258449b;
        }

        public final int hashCode() {
            int iHashCode = (this.f258450c.hashCode() + (this.f258449b.hashCode() * 31)) * 31;
            String str = this.f258451d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TimeOfDay(stringId=");
            sb2.append(this.f258449b);
            sb2.append(", parameter=");
            sb2.append(this.f258450c);
            sb2.append(", errorMessage=");
            return C22026a.c(sb2, this.f258451d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f258449b);
            parcel.writeParcelable(this.f258450c, i12);
            parcel.writeString(this.f258451d);
        }
    }

    public /* synthetic */ SavedSearchChipsItem(C42822w c42822w) {
        this();
    }

    @Y61.k
    /* renamed from: L */
    public abstract SavedSearchData.Settings.SettingsDetails.Parameter getF258450c();

    @l
    /* renamed from: f */
    public abstract String getF258451d();

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    public SavedSearchChipsItem() {
    }
}
