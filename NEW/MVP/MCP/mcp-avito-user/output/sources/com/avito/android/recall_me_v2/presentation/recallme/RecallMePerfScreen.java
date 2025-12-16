package com.avito.android.recall_me_v2.presentation.recallme;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: RecallMeFragmentComponent.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/recall_me_v2/presentation/recallme/RecallMePerfScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_recall-me_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
@K51.d
/* loaded from: classes16.dex */
public final class RecallMePerfScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final RecallMePerfScreen f252089d = new RecallMePerfScreen();

    @Y61.k
    public static final Parcelable.Creator<RecallMePerfScreen> CREATOR = new a();

    /* compiled from: RecallMeFragmentComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RecallMePerfScreen> {
        @Override // android.os.Parcelable.Creator
        public final RecallMePerfScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return RecallMePerfScreen.f252089d;
        }

        @Override // android.os.Parcelable.Creator
        public final RecallMePerfScreen[] newArray(int i12) {
            return new RecallMePerfScreen[i12];
        }
    }

    public RecallMePerfScreen() {
        super("RecallMeScreen", false, 2, null);
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
