package com.avito.android.user_stats.extended_user_stats.tabs.expenses;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: ExpensesTabStatisticsScreen.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/ExpensesTabStatisticsScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@I60.b
/* loaded from: classes5.dex */
public final class ExpensesTabStatisticsScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final ExpensesTabStatisticsScreen f317543d = new ExpensesTabStatisticsScreen();

    @Y61.k
    public static final Parcelable.Creator<ExpensesTabStatisticsScreen> CREATOR = new a();

    /* compiled from: ExpensesTabStatisticsScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExpensesTabStatisticsScreen> {
        @Override // android.os.Parcelable.Creator
        public final ExpensesTabStatisticsScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return ExpensesTabStatisticsScreen.f317543d;
        }

        @Override // android.os.Parcelable.Creator
        public final ExpensesTabStatisticsScreen[] newArray(int i12) {
            return new ExpensesTabStatisticsScreen[i12];
        }
    }

    public ExpensesTabStatisticsScreen() {
        super("ExpensesTabStatisticsScreen", false, 2, null);
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
