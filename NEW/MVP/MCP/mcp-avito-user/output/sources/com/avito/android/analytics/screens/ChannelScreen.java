package com.avito.android.analytics.screens;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: ChannelScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/ChannelScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito-discouraged_analytics-screens_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes11.dex */
public final class ChannelScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final ChannelScreen f90318d = new ChannelScreen();

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final String f90319e = "context";

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final String f90320f = "messages";

    @Y61.k
    public static final Parcelable.Creator<ChannelScreen> CREATOR = new a();

    /* compiled from: ChannelScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChannelScreen> {
        @Override // android.os.Parcelable.Creator
        public final ChannelScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ChannelScreen.f90318d;
        }

        @Override // android.os.Parcelable.Creator
        public final ChannelScreen[] newArray(int i12) {
            return new ChannelScreen[i12];
        }
    }

    public ChannelScreen() {
        super("Channel", false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
