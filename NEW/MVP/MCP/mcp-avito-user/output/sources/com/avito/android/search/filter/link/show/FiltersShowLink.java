package com.avito.android.search.filter.link.show;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.map.Area;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: FiltersShowLink.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/link/show/FiltersShowLink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "Landroid/os/Parcelable;", "b", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class FiltersShowLink extends PublicDeeplink implements Parcelable {

    @k
    public static final Parcelable.Creator<FiltersShowLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SearchParams f263399b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f263400c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f263401d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Area f263402e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final PresentationType f263403f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f263404g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f263405h;

    /* compiled from: FiltersShowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FiltersShowLink> {
        @Override // android.os.Parcelable.Creator
        public final FiltersShowLink createFromParcel(Parcel parcel) {
            SearchParams searchParams = (SearchParams) parcel.readParcelable(FiltersShowLink.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            return new FiltersShowLink(parcel.readInt() == 0 ? null : PresentationType.valueOf(parcel.readString()), searchParams, (Area) parcel.readParcelable(FiltersShowLink.class.getClassLoader()), string, string2, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FiltersShowLink[] newArray(int i12) {
            return new FiltersShowLink[i12];
        }
    }

    /* compiled from: FiltersShowLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/search/filter/link/show/FiltersShowLink$b;", "", "a", "b", "Lcom/avito/android/search/filter/link/show/FiltersShowLink$b$a;", "Lcom/avito/android/search/filter/link/show/FiltersShowLink$b$b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: FiltersShowLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/search/filter/link/show/FiltersShowLink$b$a;", "Lcom/avito/android/search/filter/link/show/FiltersShowLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f263406b = new a();
        }

        /* compiled from: FiltersShowLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/link/show/FiltersShowLink$b$b;", "Lcom/avito/android/search/filter/link/show/FiltersShowLink$b;", "LJu/c$b;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.search.filter.link.show.FiltersShowLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C7865b implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final DeepLink f263407b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f263408c;

            public C7865b(@k DeepLink deepLink, boolean z12) {
                this.f263407b = deepLink;
                this.f263408c = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C7865b)) {
                    return false;
                }
                C7865b c7865b = (C7865b) obj;
                return L.f(this.f263407b, c7865b.f263407b) && this.f263408c == c7865b.f263408c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f263408c) + (this.f263407b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ClarifySearch(deeplink=");
                sb2.append(this.f263407b);
                sb2.append(", resetArea=");
                return r.x(sb2, this.f263408c, ')');
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ FiltersShowLink(SearchParams searchParams, String str, String str2, Area area, PresentationType presentationType, String str3, String str4, int i12, C42822w c42822w) {
        String str5 = (i12 & 2) != 0 ? null : str;
        this((i12 & 16) != 0 ? null : presentationType, searchParams, (i12 & 8) != 0 ? null : area, str5, str2, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? null : str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FiltersShowLink)) {
            return false;
        }
        FiltersShowLink filtersShowLink = (FiltersShowLink) obj;
        return L.f(this.f263399b, filtersShowLink.f263399b) && L.f(this.f263400c, filtersShowLink.f263400c) && L.f(this.f263401d, filtersShowLink.f263401d) && L.f(this.f263402e, filtersShowLink.f263402e) && this.f263403f == filtersShowLink.f263403f && L.f(this.f263404g, filtersShowLink.f263404g) && L.f(this.f263405h, filtersShowLink.f263405h);
    }

    public final int hashCode() {
        int iHashCode = this.f263399b.hashCode() * 31;
        String str = this.f263400c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f263401d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Area area = this.f263402e;
        int iHashCode4 = (iHashCode3 + (area == null ? 0 : area.hashCode())) * 31;
        PresentationType presentationType = this.f263403f;
        int iHashCode5 = (iHashCode4 + (presentationType == null ? 0 : presentationType.hashCode())) * 31;
        String str3 = this.f263404g;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f263405h;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FiltersShowLink(searchParams=");
        sb2.append(this.f263399b);
        sb2.append(", context=");
        sb2.append(this.f263400c);
        sb2.append(", fromPage=");
        sb2.append(this.f263401d);
        sb2.append(", searchArea=");
        sb2.append(this.f263402e);
        sb2.append(", presentationType=");
        sb2.append(this.f263403f);
        sb2.append(", scrollToParameterWithId=");
        sb2.append(this.f263404g);
        sb2.append(", mapSerpState=");
        return C22026a.c(sb2, this.f263405h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f263399b, i12);
        parcel.writeString(this.f263400c);
        parcel.writeString(this.f263401d);
        parcel.writeParcelable(this.f263402e, i12);
        PresentationType presentationType = this.f263403f;
        if (presentationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(presentationType.name());
        }
        parcel.writeString(this.f263404g);
        parcel.writeString(this.f263405h);
    }

    public FiltersShowLink(@l PresentationType presentationType, @k SearchParams searchParams, @l Area area, @l String str, @l String str2, @l String str3, @l String str4) {
        this.f263399b = searchParams;
        this.f263400c = str;
        this.f263401d = str2;
        this.f263402e = area;
        this.f263403f = presentationType;
        this.f263404g = str3;
        this.f263405h = str4;
    }
}
