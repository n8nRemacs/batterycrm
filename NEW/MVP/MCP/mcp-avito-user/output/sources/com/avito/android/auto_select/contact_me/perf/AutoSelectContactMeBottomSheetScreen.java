package com.avito.android.auto_select.contact_me.perf;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: AutoSelectContactMeBottomSheetScreen.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/auto_select/contact_me/perf/AutoSelectContactMeBottomSheetScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@d
/* loaded from: classes11.dex */
public final class AutoSelectContactMeBottomSheetScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final AutoSelectContactMeBottomSheetScreen f96030d = new AutoSelectContactMeBottomSheetScreen();

    @k
    public static final Parcelable.Creator<AutoSelectContactMeBottomSheetScreen> CREATOR = new a();

    /* compiled from: AutoSelectContactMeBottomSheetScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectContactMeBottomSheetScreen> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectContactMeBottomSheetScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return AutoSelectContactMeBottomSheetScreen.f96030d;
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectContactMeBottomSheetScreen[] newArray(int i12) {
            return new AutoSelectContactMeBottomSheetScreen[i12];
        }
    }

    public AutoSelectContactMeBottomSheetScreen() {
        super("AutoSelectContactMeBottomSheet", false, 2, null);
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
