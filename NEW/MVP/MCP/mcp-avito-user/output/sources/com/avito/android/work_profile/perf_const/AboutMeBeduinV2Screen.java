package com.avito.android.work_profile.perf_const;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: JobSeekerProfilePerfConstants.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_profile/perf_const/AboutMeBeduinV2Screen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
/* loaded from: classes5.dex */
public final class AboutMeBeduinV2Screen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final AboutMeBeduinV2Screen f330707d = new AboutMeBeduinV2Screen();

    @k
    public static final Parcelable.Creator<AboutMeBeduinV2Screen> CREATOR = new a();

    /* compiled from: JobSeekerProfilePerfConstants.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AboutMeBeduinV2Screen> {
        @Override // android.os.Parcelable.Creator
        public final AboutMeBeduinV2Screen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return AboutMeBeduinV2Screen.f330707d;
        }

        @Override // android.os.Parcelable.Creator
        public final AboutMeBeduinV2Screen[] newArray(int i12) {
            return new AboutMeBeduinV2Screen[i12];
        }
    }

    public AboutMeBeduinV2Screen() {
        super("AboutMeBeduinV2ScreenName", false);
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
