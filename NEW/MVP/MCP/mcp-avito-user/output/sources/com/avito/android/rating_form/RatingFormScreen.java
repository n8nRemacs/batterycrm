package com.avito.android.rating_form;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.screens.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RatingFormScreens.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/RatingFormScreen;", "Lcom/avito/android/analytics/screens/Screen;", "a", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"PerformanceScreenHasNoOwner"})
/* loaded from: classes16.dex */
public final class RatingFormScreen extends Screen {

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f247917d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f247914e = new a(null);

    @Y61.k
    public static final Parcelable.Creator<RatingFormScreen> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final String f247915f = "content";

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final String f247916g = "ratingFormSelectItem";

    /* compiled from: RatingFormScreens.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating_form/RatingFormScreen$a;", "", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RatingFormScreens.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<RatingFormScreen> {
        @Override // android.os.Parcelable.Creator
        public final RatingFormScreen createFromParcel(Parcel parcel) {
            return new RatingFormScreen(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingFormScreen[] newArray(int i12) {
            return new RatingFormScreen[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RatingFormScreen() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f247917d);
    }

    public /* synthetic */ RatingFormScreen(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RatingFormScreen(@Y61.l String str) {
        String strConcat;
        if (str == null) {
            strConcat = "RatingsForm";
        } else {
            strConcat = "RatingsForm_".concat(str);
        }
        super(strConcat, false, 2, null);
        this.f247917d = str;
    }
}
