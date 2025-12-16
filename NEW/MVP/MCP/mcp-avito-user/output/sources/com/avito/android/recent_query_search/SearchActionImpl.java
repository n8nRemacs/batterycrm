package com.avito.android.recent_query_search;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.recent_query_search.item.SearchAction;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SearchActionImpl.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/recent_query_search/SearchActionImpl;", "Lcom/avito/android/recent_query_search/item/SearchAction;", "_avito_bx-content_widget_recent-query-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SearchActionImpl implements SearchAction {

    @Y61.k
    public static final Parcelable.Creator<SearchActionImpl> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final DeepLink f252244b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f252245c;

    /* compiled from: SearchActionImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SearchActionImpl> {
        @Override // android.os.Parcelable.Creator
        public final SearchActionImpl createFromParcel(Parcel parcel) {
            return new SearchActionImpl((DeepLink) parcel.readParcelable(SearchActionImpl.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchActionImpl[] newArray(int i12) {
            return new SearchActionImpl[i12];
        }
    }

    public SearchActionImpl(@Y61.k DeepLink deepLink, @Y61.k String str) {
        this.f252244b = deepLink;
        this.f252245c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchActionImpl)) {
            return false;
        }
        SearchActionImpl searchActionImpl = (SearchActionImpl) obj;
        return L.f(this.f252244b, searchActionImpl.f252244b) && L.f(this.f252245c, searchActionImpl.f252245c);
    }

    public final int hashCode() {
        return this.f252245c.hashCode() + (this.f252244b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchActionImpl(link=");
        sb2.append(this.f252244b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f252245c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f252244b, i12);
        parcel.writeString(this.f252245c);
    }
}
