package com.avito.android.vas_performance.screens.visual_v2;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: VisualVasV2Screen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/VisualVasV2Screen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes5.dex */
public final class VisualVasV2Screen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final VisualVasV2Screen f321178d = new VisualVasV2Screen();

    @k
    public static final Parcelable.Creator<VisualVasV2Screen> CREATOR = new a();

    /* compiled from: VisualVasV2Screen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VisualVasV2Screen> {
        @Override // android.os.Parcelable.Creator
        public final VisualVasV2Screen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return VisualVasV2Screen.f321178d;
        }

        @Override // android.os.Parcelable.Creator
        public final VisualVasV2Screen[] newArray(int i12) {
            return new VisualVasV2Screen[i12];
        }
    }

    public VisualVasV2Screen() {
        super("VisualVasV2", false, 2, null);
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
