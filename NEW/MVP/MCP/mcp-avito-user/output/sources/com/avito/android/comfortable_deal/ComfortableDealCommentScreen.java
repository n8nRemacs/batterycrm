package com.avito.android.comfortable_deal;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: Screens.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/ComfortableDealCommentScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@d
/* loaded from: classes12.dex */
public final class ComfortableDealCommentScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final ComfortableDealCommentScreen f119737d = new ComfortableDealCommentScreen();

    @k
    public static final Parcelable.Creator<ComfortableDealCommentScreen> CREATOR = new a();

    /* compiled from: Screens.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ComfortableDealCommentScreen> {
        @Override // android.os.Parcelable.Creator
        public final ComfortableDealCommentScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ComfortableDealCommentScreen.f119737d;
        }

        @Override // android.os.Parcelable.Creator
        public final ComfortableDealCommentScreen[] newArray(int i12) {
            return new ComfortableDealCommentScreen[i12];
        }
    }

    public ComfortableDealCommentScreen() {
        super("ComfortableDealComment", false, 2, null);
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
