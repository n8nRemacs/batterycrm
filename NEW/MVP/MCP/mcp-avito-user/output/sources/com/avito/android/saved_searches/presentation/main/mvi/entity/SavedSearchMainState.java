package com.avito.android.saved_searches.presentation.main.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.libs.saved_searches.domain.SavedSearchParams;
import com.avito.android.remote.error.ApiError;
import com.avito.android.saved_searches.model.SavedSearchData;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SavedSearchMainState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainState;", "Lcom/avito/android/analytics/screens/mvi/q;", "Landroid/os/Parcelable;", "a", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavedSearchMainState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final SavedSearchData f258662b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final SavedSearchParams f258663c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f258664d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f258665e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f258666f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final ApiError f258667g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f258668h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SavedSearchMainViewState f258669i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f258661j = new a(null);

    @k
    public static final Parcelable.Creator<SavedSearchMainState> CREATOR = new b();

    /* compiled from: SavedSearchMainState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/saved_searches/presentation/main/mvi/entity/SavedSearchMainState$a;", "", "<init>", "()V", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SavedSearchMainState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SavedSearchMainState> {
        @Override // android.os.Parcelable.Creator
        public final SavedSearchMainState createFromParcel(Parcel parcel) {
            return new SavedSearchMainState((SavedSearchData) parcel.readParcelable(SavedSearchMainState.class.getClassLoader()), (SavedSearchParams) parcel.readParcelable(SavedSearchMainState.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (ApiError) parcel.readParcelable(SavedSearchMainState.class.getClassLoader()), parcel.readInt() != 0, (SavedSearchMainViewState) parcel.readParcelable(SavedSearchMainState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SavedSearchMainState[] newArray(int i12) {
            return new SavedSearchMainState[i12];
        }
    }

    public SavedSearchMainState(@l SavedSearchData savedSearchData, @k SavedSearchParams savedSearchParams, boolean z12, boolean z13, boolean z14, @l ApiError apiError, boolean z15, @k SavedSearchMainViewState savedSearchMainViewState) {
        this.f258662b = savedSearchData;
        this.f258663c = savedSearchParams;
        this.f258664d = z12;
        this.f258665e = z13;
        this.f258666f = z14;
        this.f258667g = apiError;
        this.f258668h = z15;
        this.f258669i = savedSearchMainViewState;
    }

    public static SavedSearchMainState a(SavedSearchMainState savedSearchMainState, SavedSearchData savedSearchData, boolean z12, boolean z13, boolean z14, ApiError apiError, boolean z15, SavedSearchMainViewState savedSearchMainViewState, int i12) {
        SavedSearchData savedSearchData2 = (i12 & 1) != 0 ? savedSearchMainState.f258662b : savedSearchData;
        SavedSearchParams savedSearchParams = savedSearchMainState.f258663c;
        boolean z16 = (i12 & 4) != 0 ? savedSearchMainState.f258664d : z12;
        boolean z17 = (i12 & 8) != 0 ? savedSearchMainState.f258665e : z13;
        boolean z18 = (i12 & 16) != 0 ? savedSearchMainState.f258666f : z14;
        ApiError apiError2 = (i12 & 32) != 0 ? savedSearchMainState.f258667g : apiError;
        boolean z19 = (i12 & 64) != 0 ? savedSearchMainState.f258668h : z15;
        SavedSearchMainViewState savedSearchMainViewState2 = (i12 & 128) != 0 ? savedSearchMainState.f258669i : savedSearchMainViewState;
        savedSearchMainState.getClass();
        return new SavedSearchMainState(savedSearchData2, savedSearchParams, z16, z17, z18, apiError2, z19, savedSearchMainViewState2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedSearchMainState)) {
            return false;
        }
        SavedSearchMainState savedSearchMainState = (SavedSearchMainState) obj;
        return L.f(this.f258662b, savedSearchMainState.f258662b) && L.f(this.f258663c, savedSearchMainState.f258663c) && this.f258664d == savedSearchMainState.f258664d && this.f258665e == savedSearchMainState.f258665e && this.f258666f == savedSearchMainState.f258666f && L.f(this.f258667g, savedSearchMainState.f258667g) && this.f258668h == savedSearchMainState.f258668h && L.f(this.f258669i, savedSearchMainState.f258669i);
    }

    public final int hashCode() {
        SavedSearchData savedSearchData = this.f258662b;
        int i12 = r.i(r.i(r.i((this.f258663c.hashCode() + ((savedSearchData == null ? 0 : savedSearchData.hashCode()) * 31)) * 31, 31, this.f258664d), 31, this.f258665e), 31, this.f258666f);
        ApiError apiError = this.f258667g;
        return this.f258669i.hashCode() + r.i((i12 + (apiError != null ? apiError.hashCode() : 0)) * 31, 31, this.f258668h);
    }

    @k
    public final String toString() {
        return "SavedSearchMainState(data=" + this.f258662b + ", initialParams=" + this.f258663c + ", notificationsEnabled=" + this.f258664d + ", progressOnMainButton=" + this.f258665e + ", progressOnSecondaryButton=" + this.f258666f + ", screenError=" + this.f258667g + ", showSkeletons=" + this.f258668h + ", viewState=" + this.f258669i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f258662b, i12);
        parcel.writeParcelable(this.f258663c, i12);
        parcel.writeInt(this.f258664d ? 1 : 0);
        parcel.writeInt(this.f258665e ? 1 : 0);
        parcel.writeInt(this.f258666f ? 1 : 0);
        parcel.writeParcelable(this.f258667g, i12);
        parcel.writeInt(this.f258668h ? 1 : 0);
        parcel.writeParcelable(this.f258669i, i12);
    }
}
