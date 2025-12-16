package com.avito.android.category_with_params.analytics;

import I60.b;
import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;

/* compiled from: CategoryWithParamsScreenConst.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/category_with_params/analytics/CategoryWithParamsScreen;", "Lcom/avito/android/analytics/screens/Screen;", "<init>", "()V", "_avito_category-with-params_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@b
@d
/* loaded from: classes12.dex */
public final class CategoryWithParamsScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final CategoryWithParamsScreen f117663d = new CategoryWithParamsScreen();

    @k
    public static final Parcelable.Creator<CategoryWithParamsScreen> CREATOR = new a();

    /* compiled from: CategoryWithParamsScreenConst.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryWithParamsScreen> {
        @Override // android.os.Parcelable.Creator
        public final CategoryWithParamsScreen createFromParcel(Parcel parcel) {
            parcel.readInt();
            return CategoryWithParamsScreen.f117663d;
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryWithParamsScreen[] newArray(int i12) {
            return new CategoryWithParamsScreen[i12];
        }
    }

    public CategoryWithParamsScreen() {
        super("CategoryWithParamsScreenName", false, 2, null);
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
