package com.avito.android.search_view;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ToolbarState.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_view/ToolbarState;", "Landroid/os/Parcelable;", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ToolbarState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ToolbarState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SavedSearchState f264550b;

    /* compiled from: ToolbarState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ToolbarState> {
        @Override // android.os.Parcelable.Creator
        public final ToolbarState createFromParcel(Parcel parcel) {
            return new ToolbarState(SavedSearchState.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ToolbarState[] newArray(int i12) {
            return new ToolbarState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ToolbarState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ToolbarState) && L.f(this.f264550b, ((ToolbarState) obj).f264550b);
    }

    public final int hashCode() {
        return this.f264550b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "ToolbarState(savedSearchState=" + this.f264550b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f264550b.writeToParcel(parcel, i12);
    }

    public ToolbarState(@Y61.k SavedSearchState savedSearchState) {
        this.f264550b = savedSearchState;
    }

    public /* synthetic */ ToolbarState(SavedSearchState savedSearchState, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new SavedSearchState(null, false, false, false, false, 31, null) : savedSearchState);
    }
}
