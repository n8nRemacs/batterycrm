package com.avito.android.serp.adapter.mini_menu.item;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.serp.Onboarding;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MiniMenuItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/mini_menu/item/MiniMenuItem;", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MiniMenuItem implements PersistableSpannedItem {

    @Y61.k
    public static final Parcelable.Creator<MiniMenuItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f270346b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f270347c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final DeepLink f270348d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Badge f270349e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Onboarding f270350f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f270351g;

    /* renamed from: h, reason: collision with root package name */
    public final int f270352h;

    /* compiled from: MiniMenuItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MiniMenuItem> {
        @Override // android.os.Parcelable.Creator
        public final MiniMenuItem createFromParcel(Parcel parcel) {
            return new MiniMenuItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(MiniMenuItem.class.getClassLoader()), (Badge) parcel.readParcelable(MiniMenuItem.class.getClassLoader()), (Onboarding) parcel.readParcelable(MiniMenuItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MiniMenuItem[] newArray(int i12) {
            return new MiniMenuItem[i12];
        }
    }

    public MiniMenuItem(@Y61.k String str, @Y61.k String str2, @Y61.k DeepLink deepLink, @Y61.k Badge badge, @l Onboarding onboarding, boolean z12) {
        this.f270346b = str;
        this.f270347c = str2;
        this.f270348d = deepLink;
        this.f270349e = badge;
        this.f270350f = onboarding;
        this.f270351g = z12;
        this.f270352h = 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiniMenuItem)) {
            return false;
        }
        MiniMenuItem miniMenuItem = (MiniMenuItem) obj;
        return L.f(this.f270346b, miniMenuItem.f270346b) && L.f(this.f270347c, miniMenuItem.f270347c) && L.f(this.f270348d, miniMenuItem.f270348d) && L.f(this.f270349e, miniMenuItem.f270349e) && L.f(this.f270350f, miniMenuItem.f270350f) && this.f270351g == miniMenuItem.f270351g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF270893b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270899h() {
        return this.f270352h;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF266199b() {
        return this.f270346b;
    }

    public final int hashCode() {
        int iHashCode = (this.f270349e.hashCode() + com.avito.android.actions_sheet.a.e(this.f270348d, H.d(this.f270346b.hashCode() * 31, 31, this.f270347c), 31)) * 31;
        Onboarding onboarding = this.f270350f;
        return Boolean.hashCode(this.f270351g) + ((iHashCode + (onboarding == null ? 0 : onboarding.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MiniMenuItem(stringId=");
        sb2.append(this.f270346b);
        sb2.append(", title=");
        sb2.append(this.f270347c);
        sb2.append(", deeplink=");
        sb2.append(this.f270348d);
        sb2.append(", badge=");
        sb2.append(this.f270349e);
        sb2.append(", onboarding=");
        sb2.append(this.f270350f);
        sb2.append(", showAsSkeleton=");
        return r.x(sb2, this.f270351g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f270346b);
        parcel.writeString(this.f270347c);
        parcel.writeParcelable(this.f270348d, i12);
        parcel.writeParcelable(this.f270349e, i12);
        parcel.writeParcelable(this.f270350f, i12);
        parcel.writeInt(this.f270351g ? 1 : 0);
    }

    public /* synthetic */ MiniMenuItem(String str, String str2, DeepLink deepLink, Badge badge, Onboarding onboarding, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, deepLink, badge, onboarding, (i12 & 32) != 0 ? false : z12);
    }
}
