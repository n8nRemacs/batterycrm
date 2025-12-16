package com.avito.android.analytics.screens;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: CodeCheckScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/CodeConfirmScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito-discouraged_analytics-screens_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes11.dex */
public final class CodeConfirmScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final CodeConfirmScreen f90325d = new CodeConfirmScreen();

    @Y61.k
    public static final Parcelable.Creator<CodeConfirmScreen> CREATOR = new a();

    /* compiled from: CodeCheckScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CodeConfirmScreen> {
        @Override // android.os.Parcelable.Creator
        public final CodeConfirmScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return CodeConfirmScreen.f90325d;
        }

        @Override // android.os.Parcelable.Creator
        public final CodeConfirmScreen[] newArray(int i12) {
            return new CodeConfirmScreen[i12];
        }
    }

    public CodeConfirmScreen() {
        super("CodeCheck_CodeConfirm", false, 2, null);
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
