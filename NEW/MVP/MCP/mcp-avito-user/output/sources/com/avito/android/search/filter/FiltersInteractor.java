package com.avito.android.search.filter;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.category_parameters.BottomSheetGroupParameter;
import com.avito.android.remote.model.category_parameters.KeywordsParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.counter.ChangingParametersForButtons;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.search.filter.location_filter.InteractorState;
import com.avito.android.util.Kundle;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: FiltersInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/FiltersInteractor;", "", "ParameterValue", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FiltersInteractor {

    /* compiled from: FiltersInteractor.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/FiltersInteractor$ParameterValue;", "Landroid/os/Parcelable;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ParameterValue implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<ParameterValue> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f261856b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f261857c;

        /* compiled from: FiltersInteractor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ParameterValue> {
            @Override // android.os.Parcelable.Creator
            public final ParameterValue createFromParcel(Parcel parcel) {
                return new ParameterValue(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ParameterValue[] newArray(int i12) {
                return new ParameterValue[i12];
            }
        }

        public ParameterValue(@Y61.k String str, @Y61.l String str2) {
            this.f261856b = str;
            this.f261857c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f261856b);
            parcel.writeString(this.f261857c);
        }
    }

    /* compiled from: FiltersInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(FiltersInteractor filtersInteractor, EditableParameter editableParameter, Object obj, String str, int i12) {
            boolean z12 = (i12 & 4) == 0;
            boolean z13 = (i12 & 8) == 0;
            if ((i12 & 16) != 0) {
                str = "";
            }
            filtersInteractor.r(editableParameter, obj, z12, z13, str, (i12 & 32) == 0);
        }
    }

    void S();

    void a(@Y61.k Context context);

    void b();

    void c(@Y61.k Context context);

    void d(@Y61.l String str);

    @Y61.k
    Kundle d0();

    void e(@Y61.k ActivityC22955m activityC22955m);

    @Y61.k
    SearchParams f();

    @Y61.k
    C41981q0 g();

    @Y61.k
    FiltersMode getMode();

    @Y61.k
    SearchParams h(@Y61.k SearchParams searchParams, @Y61.k SearchParams searchParams2, @Y61.l List<String> list);

    void i(@Y61.k ArrayList arrayList, @Y61.l DeepLink deepLink);

    void j();

    void k(@Y61.l String str, @Y61.k LinkedHashMap linkedHashMap, @Y61.k List list, @Y61.k BottomSheetGroupParameter bottomSheetGroupParameter);

    void l();

    @Y61.k
    InteractorState m();

    void n(@Y61.l ParametersTreeWithAdditional parametersTreeWithAdditional);

    void o();

    @Y61.k
    io.reactivex.rxjava3.core.z<P2<ChangingParametersForButtons>> p(boolean z12);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.L q(@Y61.l SearchParams searchParams);

    <T> void r(@Y61.k EditableParameter<T> editableParameter, @Y61.l T t12, boolean z12, boolean z13, @Y61.k String str, boolean z14);

    @Y61.l
    LocationInfo s();

    void t(@Y61.k KeywordsParameter keywordsParameter);

    void u(@Y61.l String str, @Y61.k String str2, @Y61.l Map<String, ? extends Set<String>> map);

    @Y61.k
    ItemsSearchLink v(@Y61.k PresentationType presentationType);

    <T> void w(@Y61.k Map<String, ? extends T> map);

    void x(@Y61.k String str);

    @Y61.l
    MetroResponseBody y();

    @Y61.l
    Boolean z();
}
