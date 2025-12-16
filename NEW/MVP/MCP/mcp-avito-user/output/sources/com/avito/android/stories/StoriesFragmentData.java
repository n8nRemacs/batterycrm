package com.avito.android.stories;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.R;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StoriesFragmentData.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/stories/StoriesFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "Lcom/avito/android/bottom_navigation/ui/fragment/h;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StoriesFragmentData implements TabFragmentFactory.Data, com.avito.android.bottom_navigation.ui.fragment.h {

    @Y61.k
    public static final Parcelable.Creator<StoriesFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final StoriesArguments f285015b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f285016c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final NavigationTabSetItem f285017d;

    /* compiled from: StoriesFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StoriesFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final StoriesFragmentData createFromParcel(Parcel parcel) {
            return new StoriesFragmentData((StoriesArguments) parcel.readParcelable(StoriesFragmentData.class.getClassLoader()), (NavigationTabSetItem) parcel.readParcelable(StoriesFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesFragmentData[] newArray(int i12) {
            return new StoriesFragmentData[i12];
        }
    }

    public StoriesFragmentData(@Y61.k StoriesArguments storiesArguments, @Y61.k NavigationTabSetItem navigationTabSetItem) {
        this.f285015b = storiesArguments;
        this.f285016c = navigationTabSetItem;
        this.f285017d = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: W4 */
    public final NavigationScreenAction getF71588d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.h
    public final TabFragmentFactory.Data a(NavigationTabSetItem navigationTabSetItem) {
        return new StoriesFragmentData(this.f285015b, navigationTabSetItem);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF115291c() {
        return this.f285017d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0 */
    public final boolean getF186714d() {
        return false;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesFragmentData)) {
            return false;
        }
        StoriesFragmentData storiesFragmentData = (StoriesFragmentData) obj;
        return L.f(this.f285015b, storiesFragmentData.f285015b) && L.f(this.f285016c, storiesFragmentData.f285016c);
    }

    public final int hashCode() {
        return this.f285016c.hashCode() + (this.f285015b.hashCode() * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @Y61.k
    public final Integer t3() {
        return Integer.valueOf(R.anim.fade_out_stories);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StoriesFragmentData(arguments=");
        sb2.append(this.f285015b);
        sb2.append(", tab=");
        return com.avito.android.actions_sheet.a.u(sb2, this.f285016c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f285015b, i12);
        parcel.writeParcelable(this.f285016c, i12);
    }
}
