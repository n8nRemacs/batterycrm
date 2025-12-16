package com.avito.android.beduin.ui.screen.perf;

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

/* compiled from: BaseBeduinScreen.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/ui/screen/perf/BaseBeduinScreen;", "Lcom/avito/android/analytics/screens/Screen;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"PerformanceScreenHasNoOwner"})
/* loaded from: classes11.dex */
public final /* data */ class BaseBeduinScreen extends Screen {

    @k
    public static final Parcelable.Creator<BaseBeduinScreen> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f104415d;

    /* compiled from: BaseBeduinScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BaseBeduinScreen> {
        @Override // android.os.Parcelable.Creator
        public final BaseBeduinScreen createFromParcel(Parcel parcel) {
            return new BaseBeduinScreen(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseBeduinScreen[] newArray(int i12) {
            return new BaseBeduinScreen[i12];
        }
    }

    public BaseBeduinScreen(@k String str) {
        super(str, false, 2, null);
        this.f104415d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseBeduinScreen) && L.f(this.f104415d, ((BaseBeduinScreen) obj).f104415d);
    }

    public final int hashCode() {
        return this.f104415d.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("BaseBeduinScreen(screenName="), this.f104415d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f104415d);
    }
}
