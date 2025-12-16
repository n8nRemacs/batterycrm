package com.avito.android.language_selector.perf_const;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: LanguageSelectorPerfConst.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/language_selector/perf_const/LanguageSelectorScreenPerfConst;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@d
/* loaded from: classes14.dex */
public final class LanguageSelectorScreenPerfConst extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final LanguageSelectorScreenPerfConst f174933d = new LanguageSelectorScreenPerfConst();

    @k
    public static final Parcelable.Creator<LanguageSelectorScreenPerfConst> CREATOR = new a();

    /* compiled from: LanguageSelectorPerfConst.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LanguageSelectorScreenPerfConst> {
        @Override // android.os.Parcelable.Creator
        public final LanguageSelectorScreenPerfConst createFromParcel(Parcel parcel) {
            parcel.readInt();
            return LanguageSelectorScreenPerfConst.f174933d;
        }

        @Override // android.os.Parcelable.Creator
        public final LanguageSelectorScreenPerfConst[] newArray(int i12) {
            return new LanguageSelectorScreenPerfConst[i12];
        }
    }

    public LanguageSelectorScreenPerfConst() {
        super("LanguageSelector", false, 2, null);
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
