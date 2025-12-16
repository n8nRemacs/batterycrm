package com.avito.android.inline_filters;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.shortcut_navigation_bar.InlineActions;
import java.util.List;
import kotlin.Metadata;

/* compiled from: InlineFiltersPresenter.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/State;", "Landroid/os/Parcelable;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class State implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<State> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final InlineActions f171034b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final InlineFilters f171035c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Filter f171036d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final SearchParams f171037e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final PresentationType f171038f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Parcelable f171039g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final List<String> f171040h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f171041i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f171042j;

    /* compiled from: InlineFiltersPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<State> {
        @Override // android.os.Parcelable.Creator
        public final State createFromParcel(Parcel parcel) {
            return new State((InlineActions) parcel.readParcelable(State.class.getClassLoader()), (InlineFilters) parcel.readParcelable(State.class.getClassLoader()), (Filter) parcel.readParcelable(State.class.getClassLoader()), (SearchParams) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() == 0 ? null : PresentationType.valueOf(parcel.readString()), parcel.readParcelable(State.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final State[] newArray(int i12) {
            return new State[i12];
        }
    }

    public State(@Y61.l InlineActions inlineActions, @Y61.l InlineFilters inlineFilters, @Y61.l Filter filter, @Y61.l SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l Parcelable parcelable, @Y61.l List<String> list, @Y61.l String str, boolean z12) {
        this.f171034b = inlineActions;
        this.f171035c = inlineFilters;
        this.f171036d = filter;
        this.f171037e = searchParams;
        this.f171038f = presentationType;
        this.f171039g = parcelable;
        this.f171040h = list;
        this.f171041i = str;
        this.f171042j = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f171034b, i12);
        parcel.writeParcelable(this.f171035c, i12);
        parcel.writeParcelable(this.f171036d, i12);
        parcel.writeParcelable(this.f171037e, i12);
        PresentationType presentationType = this.f171038f;
        if (presentationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(presentationType.name());
        }
        parcel.writeParcelable(this.f171039g, i12);
        parcel.writeStringList(this.f171040h);
        parcel.writeString(this.f171041i);
        parcel.writeInt(this.f171042j ? 1 : 0);
    }
}
