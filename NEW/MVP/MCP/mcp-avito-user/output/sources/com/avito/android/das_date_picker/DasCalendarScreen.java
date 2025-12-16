package com.avito.android.das_date_picker;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: DasCalendarScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/das_date_picker/DasCalendarScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes12.dex */
public final class DasCalendarScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final DasCalendarScreen f132244d = new DasCalendarScreen();

    @k
    public static final Parcelable.Creator<DasCalendarScreen> CREATOR = new a();

    /* compiled from: DasCalendarScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DasCalendarScreen> {
        @Override // android.os.Parcelable.Creator
        public final DasCalendarScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return DasCalendarScreen.f132244d;
        }

        @Override // android.os.Parcelable.Creator
        public final DasCalendarScreen[] newArray(int i12) {
            return new DasCalendarScreen[i12];
        }
    }

    public DasCalendarScreen() {
        super("DasCalendar", false, 2, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
