package com.avito.android.extended_profile_map;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.remote.model.GeoReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExtendedProfileAddress.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_map/ExtendedProfileAddress;", "Landroid/os/Parcelable;", "DaySchedule", "TimeInterval", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtendedProfileAddress implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ExtendedProfileAddress> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f151139b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AvitoMapPoint f151140c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f151141d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f151142e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final List<GeoReference> f151143f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final ArrayList f151144g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f151145h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final DeeplinkAction f151146i;

    /* compiled from: ExtendedProfileAddress.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_map/ExtendedProfileAddress$DaySchedule;", "Landroid/os/Parcelable;", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DaySchedule implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<DaySchedule> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<TimeInterval> f151147b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final List<TimeInterval> f151148c;

        /* compiled from: ExtendedProfileAddress.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DaySchedule> {
            @Override // android.os.Parcelable.Creator
            public final DaySchedule createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = com.avito.android.actions_sheet.a.c(TimeInterval.CREATOR, parcel, arrayList, iC3, 1);
                }
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(TimeInterval.CREATOR, parcel, arrayList2, iC2, 1);
                }
                return new DaySchedule(arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final DaySchedule[] newArray(int i12) {
                return new DaySchedule[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DaySchedule() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Iterator itJ = C0.j(this.f151147b, parcel);
            while (itJ.hasNext()) {
                ((TimeInterval) itJ.next()).writeToParcel(parcel, i12);
            }
            Iterator itJ2 = C0.j(this.f151148c, parcel);
            while (itJ2.hasNext()) {
                ((TimeInterval) itJ2.next()).writeToParcel(parcel, i12);
            }
        }

        public DaySchedule(@Y61.k List<TimeInterval> list, @Y61.k List<TimeInterval> list2) {
            this.f151147b = list;
            this.f151148c = list2;
        }

        public /* synthetic */ DaySchedule(List list, List list2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? new ArrayList() : list, (i12 & 2) != 0 ? new ArrayList() : list2);
        }
    }

    /* compiled from: ExtendedProfileAddress.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_map/ExtendedProfileAddress$TimeInterval;", "Landroid/os/Parcelable;", "_avito_extended-profile-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TimeInterval implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<TimeInterval> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f151149b;

        /* renamed from: c, reason: collision with root package name */
        public final int f151150c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f151151d;

        /* compiled from: ExtendedProfileAddress.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TimeInterval> {
            @Override // android.os.Parcelable.Creator
            public final TimeInterval createFromParcel(Parcel parcel) {
                return new TimeInterval(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final TimeInterval[] newArray(int i12) {
                return new TimeInterval[i12];
            }
        }

        public TimeInterval(int i12, int i13) {
            this.f151149b = i12;
            this.f151150c = i13;
            this.f151151d = i12 == 0 && (i13 == 0 || i13 == 1440);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f151149b);
            parcel.writeInt(this.f151150c);
        }
    }

    /* compiled from: ExtendedProfileAddress.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileAddress> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileAddress createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            AvitoMapPoint avitoMapPoint = (AvitoMapPoint) parcel.readParcelable(ExtendedProfileAddress.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(ExtendedProfileAddress.class, parcel, arrayList3, iL2, 1);
                }
                arrayList = arrayList3;
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(DaySchedule.CREATOR, parcel, arrayList4, iC2, 1);
                }
                arrayList2 = arrayList4;
            }
            return new ExtendedProfileAddress(string, avitoMapPoint, string2, string3, arrayList, arrayList2, parcel.readInt() != 0, (DeeplinkAction) parcel.readParcelable(ExtendedProfileAddress.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileAddress[] newArray(int i12) {
            return new ExtendedProfileAddress[i12];
        }
    }

    public ExtendedProfileAddress(@Y61.k String str, @Y61.k AvitoMapPoint avitoMapPoint, @Y61.k String str2, @Y61.l String str3, @Y61.l List list, @Y61.l ArrayList arrayList, boolean z12, @Y61.k DeeplinkAction deeplinkAction) {
        this.f151139b = str;
        this.f151140c = avitoMapPoint;
        this.f151141d = str2;
        this.f151142e = str3;
        this.f151143f = list;
        this.f151144g = arrayList;
        this.f151145h = z12;
        this.f151146i = deeplinkAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f151139b);
        parcel.writeParcelable(this.f151140c, i12);
        parcel.writeString(this.f151141d);
        parcel.writeString(this.f151142e);
        List<GeoReference> list = this.f151143f;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        ArrayList arrayList = this.f151144g;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                ((DaySchedule) itY.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeInt(this.f151145h ? 1 : 0);
        parcel.writeParcelable(this.f151146i, i12);
    }
}
