package com.avito.android.mortgage.person_form.list.items.suggestion_banner;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuggestionBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/suggestion_banner/SuggestionBannerItem;", "Lcom/avito/android/mortgage/person_form/list/items/PersonFormItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SuggestionBannerItem implements PersonFormItem {

    @Y61.k
    public static final Parcelable.Creator<SuggestionBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f200789b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f200790c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<String> f200791d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<String> f200792e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f200793f;

    /* compiled from: SuggestionBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SuggestionBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final SuggestionBannerItem createFromParcel(Parcel parcel) {
            return new SuggestionBannerItem(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SuggestionBannerItem[] newArray(int i12) {
            return new SuggestionBannerItem[i12];
        }
    }

    public SuggestionBannerItem(@Y61.k String str, @Y61.k String str2, @Y61.k List<String> list, @Y61.k List<String> list2, boolean z12) {
        this.f200789b = str;
        this.f200790c = str2;
        this.f200791d = list;
        this.f200792e = list2;
        this.f200793f = z12;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    @Y61.k
    public final PersonFormItem N() {
        return new SuggestionBannerItem(this.f200789b, this.f200790c, this.f200791d, this.f200792e, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuggestionBannerItem)) {
            return false;
        }
        SuggestionBannerItem suggestionBannerItem = (SuggestionBannerItem) obj;
        return L.f(this.f200789b, suggestionBannerItem.f200789b) && L.f(this.f200790c, suggestionBannerItem.f200790c) && L.f(this.f200791d, suggestionBannerItem.f200791d) && L.f(this.f200792e, suggestionBannerItem.f200792e) && this.f200793f == suggestionBannerItem.f200793f;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF200568g() {
        return this.f200793f;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    public final boolean getHasError() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF182878b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF199921b() {
        return this.f200789b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200793f) + H.e(H.e(H.d(this.f200789b.hashCode() * 31, 31, this.f200790c), 31, this.f200791d), 31, this.f200792e);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestionBannerItem(stringId=");
        sb2.append(this.f200789b);
        sb2.append(", suggestionId=");
        sb2.append(this.f200790c);
        sb2.append(", primaryContent=");
        sb2.append(this.f200791d);
        sb2.append(", content=");
        sb2.append(this.f200792e);
        sb2.append(", enabled=");
        return r.x(sb2, this.f200793f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f200789b);
        parcel.writeString(this.f200790c);
        parcel.writeStringList(this.f200791d);
        parcel.writeStringList(this.f200792e);
        parcel.writeInt(this.f200793f ? 1 : 0);
    }

    public /* synthetic */ SuggestionBannerItem(String str, String str2, List list, List list2, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, list, list2, (i12 & 16) != 0 ? true : z12);
    }
}
