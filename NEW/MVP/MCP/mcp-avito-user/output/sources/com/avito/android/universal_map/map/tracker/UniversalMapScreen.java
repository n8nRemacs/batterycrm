package com.avito.android.universal_map.map.tracker;

import K51.d;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UniversalMapScreen.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/tracker/UniversalMapScreen;", "Lcom/avito/android/analytics/screens/Screen;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"PerformanceScreenHasNoOwner"})
/* loaded from: classes4.dex */
public final /* data */ class UniversalMapScreen extends Screen {

    @k
    public static final Parcelable.Creator<UniversalMapScreen> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f305945d;

    /* compiled from: UniversalMapScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalMapScreen> {
        @Override // android.os.Parcelable.Creator
        public final UniversalMapScreen createFromParcel(Parcel parcel) {
            return new UniversalMapScreen(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalMapScreen[] newArray(int i12) {
            return new UniversalMapScreen[i12];
        }
    }

    public UniversalMapScreen(@l String str) {
        super(str == null ? "UniversalMap" : str, false, 2, null);
        this.f305945d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UniversalMapScreen) && L.f(this.f305945d, ((UniversalMapScreen) obj).f305945d);
    }

    public final int hashCode() {
        String str = this.f305945d;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("UniversalMapScreen(screenName="), this.f305945d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f305945d);
    }
}
