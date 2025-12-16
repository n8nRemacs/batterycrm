package com.avito.android.advert_core.auto_select_parameters_v2.advantage;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectExpandableAdvantageItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/auto_select_parameters_v2/advantage/AutoSelectExpandableAdvantageItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AutoSelectExpandableAdvantageItem implements PersistableSerpItem {

    @k
    public static final Parcelable.Creator<AutoSelectExpandableAdvantageItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f82950b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f82951c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f82952d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f82953e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f82954f;

    /* renamed from: g, reason: collision with root package name */
    public final int f82955g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SerpViewType f82956h;

    /* compiled from: AutoSelectExpandableAdvantageItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectExpandableAdvantageItem> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectExpandableAdvantageItem createFromParcel(Parcel parcel) {
            return new AutoSelectExpandableAdvantageItem(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(AutoSelectExpandableAdvantageItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectExpandableAdvantageItem[] newArray(int i12) {
            return new AutoSelectExpandableAdvantageItem[i12];
        }
    }

    public AutoSelectExpandableAdvantageItem(@l String str, @k String str2, @k AttributedText attributedText, @k String str3, @k String str4, int i12) {
        this.f82950b = str;
        this.f82951c = str2;
        this.f82952d = attributedText;
        this.f82953e = str3;
        this.f82954f = str4;
        this.f82955g = i12;
        this.f82956h = SerpViewType.f268584d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoSelectExpandableAdvantageItem)) {
            return false;
        }
        AutoSelectExpandableAdvantageItem autoSelectExpandableAdvantageItem = (AutoSelectExpandableAdvantageItem) obj;
        return L.f(this.f82950b, autoSelectExpandableAdvantageItem.f82950b) && L.f(this.f82951c, autoSelectExpandableAdvantageItem.f82951c) && L.f(this.f82952d, autoSelectExpandableAdvantageItem.f82952d) && L.f(this.f82953e, autoSelectExpandableAdvantageItem.f82953e) && L.f(this.f82954f, autoSelectExpandableAdvantageItem.f82954f) && this.f82955g == autoSelectExpandableAdvantageItem.f82955g;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272887i() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79389b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79393f() {
        return this.f82955g;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79390c() {
        return this.f82954f;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79391d() {
        return this.f82956h;
    }

    public final int hashCode() {
        String str = this.f82950b;
        return Integer.hashCode(this.f82955g) + H.d(H.d(com.avito.android.actions_sheet.a.b(H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f82951c), 31, this.f82952d), 31, this.f82953e), 31, this.f82954f);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoSelectExpandableAdvantageItem(icon=");
        sb2.append(this.f82950b);
        sb2.append(", title=");
        sb2.append(this.f82951c);
        sb2.append(", description=");
        sb2.append(this.f82952d);
        sb2.append(", componentSlug=");
        sb2.append(this.f82953e);
        sb2.append(", stringId=");
        sb2.append(this.f82954f);
        sb2.append(", spanCount=");
        return r.t(sb2, this.f82955g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f82950b);
        parcel.writeString(this.f82951c);
        parcel.writeParcelable(this.f82952d, i12);
        parcel.writeString(this.f82953e);
        parcel.writeString(this.f82954f);
        parcel.writeInt(this.f82955g);
    }

    public /* synthetic */ AutoSelectExpandableAdvantageItem(String str, String str2, AttributedText attributedText, String str3, String str4, int i12, int i13, C42822w c42822w) {
        this(str, str2, attributedText, str3, (i13 & 16) != 0 ? UUID.randomUUID().toString() : str4, i12);
    }
}
