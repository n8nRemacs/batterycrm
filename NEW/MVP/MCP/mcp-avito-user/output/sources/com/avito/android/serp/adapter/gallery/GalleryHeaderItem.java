package com.avito.android.serp.adapter.gallery;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.gallery.GalleryHeaderWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: GalleryHeaderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/gallery/GalleryHeaderItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lqs0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GalleryHeaderItem implements PersistableSerpItem, InterfaceC47435a {

    @Y61.k
    public static final Parcelable.Creator<GalleryHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f270005b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f270006c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<GalleryHeaderWidget.GalleryItem> f270007d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final UniversalColor f270008e;

    /* renamed from: f, reason: collision with root package name */
    public int f270009f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Analytics f270010g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Settings f270011h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f270012i = SerpViewType.f268585e;

    /* renamed from: j, reason: collision with root package name */
    public final int f270013j = 6;

    /* compiled from: GalleryHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GalleryHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final GalleryHeaderItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(GalleryHeaderItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(GalleryHeaderItem.class, parcel, arrayList, iL2, 1);
            }
            return new GalleryHeaderItem(string, attributedText, arrayList, (UniversalColor) parcel.readParcelable(GalleryHeaderItem.class.getClassLoader()), parcel.readInt(), (Analytics) parcel.readParcelable(GalleryHeaderItem.class.getClassLoader()), (Settings) parcel.readParcelable(GalleryHeaderItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GalleryHeaderItem[] newArray(int i12) {
            return new GalleryHeaderItem[i12];
        }
    }

    public GalleryHeaderItem(@Y61.k String str, @Y61.l AttributedText attributedText, @Y61.k List<GalleryHeaderWidget.GalleryItem> list, @Y61.l UniversalColor universalColor, int i12, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f270005b = str;
        this.f270006c = attributedText;
        this.f270007d = list;
        this.f270008e = universalColor;
        this.f270009f = i12;
        this.f270010g = analytics;
        this.f270011h = settings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryHeaderItem)) {
            return false;
        }
        GalleryHeaderItem galleryHeaderItem = (GalleryHeaderItem) obj;
        return L.f(this.f270005b, galleryHeaderItem.f270005b) && L.f(this.f270006c, galleryHeaderItem.f270006c) && L.f(this.f270007d, galleryHeaderItem.f270007d) && L.f(this.f270008e, galleryHeaderItem.f270008e) && this.f270009f == galleryHeaderItem.f270009f && L.f(this.f270010g, galleryHeaderItem.f270010g) && L.f(this.f270011h, galleryHeaderItem.f270011h);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272887i() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124042b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF278853l() {
        return this.f270011h;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF264931d() {
        return this.f270013j;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF266390b() {
        return this.f270005b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF264933f() {
        return this.f270012i;
    }

    public final int hashCode() {
        int iHashCode = this.f270005b.hashCode() * 31;
        AttributedText attributedText = this.f270006c;
        int iE2 = H.e((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f270007d);
        UniversalColor universalColor = this.f270008e;
        int iE3 = androidx.appcompat.app.r.e(this.f270009f, (iE2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31, 31);
        Analytics analytics = this.f270010g;
        int iHashCode2 = (iE3 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f270011h;
        return iHashCode2 + (settings != null ? settings.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryHeaderItem(stringId=");
        sb2.append(this.f270005b);
        sb2.append(", title=");
        sb2.append(this.f270006c);
        sb2.append(", galleryItems=");
        sb2.append(this.f270007d);
        sb2.append(", backgroundColor=");
        sb2.append(this.f270008e);
        sb2.append(", selectedIndex=");
        sb2.append(this.f270009f);
        sb2.append(", analytics=");
        sb2.append(this.f270010g);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f270011h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f270005b);
        parcel.writeParcelable(this.f270006c, i12);
        Iterator itJ = C0.j(this.f270007d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f270008e, i12);
        parcel.writeInt(this.f270009f);
        parcel.writeParcelable(this.f270010g, i12);
        parcel.writeParcelable(this.f270011h, i12);
    }
}
