package com.avito.android.search_view;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ToolbarState.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search_view/SavedSearchState;", "Landroid/os/Parcelable;", "Visibility", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavedSearchState implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SavedSearchState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Visibility f264417b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f264418c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f264419d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f264420e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f264421f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ToolbarState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_view/SavedSearchState$Visibility;", "", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Visibility {

        /* renamed from: b, reason: collision with root package name */
        public static final Visibility f264422b;

        /* renamed from: c, reason: collision with root package name */
        public static final Visibility f264423c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Visibility[] f264424d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f264425e;

        static {
            Visibility visibility = new Visibility("VISIBLE", 0);
            f264422b = visibility;
            Visibility visibility2 = new Visibility("HIDDEN_BY_CONSTRAINT", 1);
            Visibility visibility3 = new Visibility("HIDDEN", 2);
            f264423c = visibility3;
            Visibility[] visibilityArr = {visibility, visibility2, visibility3};
            f264424d = visibilityArr;
            f264425e = kotlin.enums.c.a(visibilityArr);
        }

        public Visibility() {
            throw null;
        }

        public static Visibility valueOf(String str) {
            return (Visibility) Enum.valueOf(Visibility.class, str);
        }

        public static Visibility[] values() {
            return (Visibility[]) f264424d.clone();
        }
    }

    /* compiled from: ToolbarState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SavedSearchState> {
        @Override // android.os.Parcelable.Creator
        public final SavedSearchState createFromParcel(Parcel parcel) {
            return new SavedSearchState(Visibility.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SavedSearchState[] newArray(int i12) {
            return new SavedSearchState[i12];
        }
    }

    public SavedSearchState() {
        this(null, false, false, false, false, 31, null);
    }

    public static SavedSearchState a(SavedSearchState savedSearchState, Visibility visibility, boolean z12, boolean z13, boolean z14, boolean z15, int i12) {
        if ((i12 & 1) != 0) {
            visibility = savedSearchState.f264417b;
        }
        Visibility visibility2 = visibility;
        if ((i12 & 2) != 0) {
            z12 = savedSearchState.f264418c;
        }
        boolean z16 = z12;
        if ((i12 & 4) != 0) {
            z13 = savedSearchState.f264419d;
        }
        boolean z17 = z13;
        if ((i12 & 8) != 0) {
            z14 = savedSearchState.f264420e;
        }
        boolean z18 = z14;
        if ((i12 & 16) != 0) {
            z15 = savedSearchState.f264421f;
        }
        savedSearchState.getClass();
        return new SavedSearchState(visibility2, z16, z17, z18, z15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavedSearchState)) {
            return false;
        }
        SavedSearchState savedSearchState = (SavedSearchState) obj;
        return this.f264417b == savedSearchState.f264417b && this.f264418c == savedSearchState.f264418c && this.f264419d == savedSearchState.f264419d && this.f264420e == savedSearchState.f264420e && this.f264421f == savedSearchState.f264421f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f264421f) + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(this.f264417b.hashCode() * 31, 31, this.f264418c), 31, this.f264419d), 31, this.f264420e);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SavedSearchState(visibility=");
        sb2.append(this.f264417b);
        sb2.append(", temporaryHidden=");
        sb2.append(this.f264418c);
        sb2.append(", subscribed=");
        sb2.append(this.f264419d);
        sb2.append(", loading=");
        sb2.append(this.f264420e);
        sb2.append(", trackScroll=");
        return androidx.appcompat.app.r.x(sb2, this.f264421f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f264417b.name());
        parcel.writeInt(this.f264418c ? 1 : 0);
        parcel.writeInt(this.f264419d ? 1 : 0);
        parcel.writeInt(this.f264420e ? 1 : 0);
        parcel.writeInt(this.f264421f ? 1 : 0);
    }

    public SavedSearchState(@Y61.k Visibility visibility, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f264417b = visibility;
        this.f264418c = z12;
        this.f264419d = z13;
        this.f264420e = z14;
        this.f264421f = z15;
    }

    public /* synthetic */ SavedSearchState(Visibility visibility, boolean z12, boolean z13, boolean z14, boolean z15, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? Visibility.f264423c : visibility, (i12 & 2) != 0 ? false : z12, (i12 & 4) != 0 ? false : z13, (i12 & 8) != 0 ? false : z14, (i12 & 16) == 0 ? z15 : false);
    }
}
