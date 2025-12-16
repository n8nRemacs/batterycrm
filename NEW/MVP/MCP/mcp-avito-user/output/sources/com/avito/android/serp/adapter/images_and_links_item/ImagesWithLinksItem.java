package com.avito.android.serp.adapter.images_and_links_item;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advert_details.model.images_with_links.Displaying;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.images_and_links_item.item.ImageWithLinkItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ImagesWithLinksItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/images_and_links_item/ImagesWithLinksItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImagesWithLinksItem implements PersistableSerpItem {

    @Y61.k
    public static final Parcelable.Creator<ImagesWithLinksItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f270168b;

    /* renamed from: c, reason: collision with root package name */
    public final int f270169c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f270170d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<ImageWithLinkItem> f270171e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Displaying f270172f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f270173g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f270174h;

    /* compiled from: ImagesWithLinksItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImagesWithLinksItem> {
        @Override // android.os.Parcelable.Creator
        public final ImagesWithLinksItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(ImageWithLinkItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ImagesWithLinksItem(string, i12, string2, arrayList, (Displaying) parcel.readParcelable(ImagesWithLinksItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ImagesWithLinksItem[] newArray(int i12) {
            return new ImagesWithLinksItem[i12];
        }
    }

    public ImagesWithLinksItem(@Y61.l String str, int i12, @Y61.k String str2, @Y61.k List<ImageWithLinkItem> list, @Y61.l Displaying displaying, boolean z12) {
        this.f270168b = str;
        this.f270169c = i12;
        this.f270170d = str2;
        this.f270171e = list;
        this.f270172f = displaying;
        this.f270173g = z12;
        this.f270174h = SerpViewType.f268585e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272697l() {
        return false;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270169c() {
        return this.f270169c;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270170d() {
        return this.f270170d;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270174h() {
        return this.f270174h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f270168b);
        parcel.writeInt(this.f270169c);
        parcel.writeString(this.f270170d);
        Iterator itJ = C0.j(this.f270171e, parcel);
        while (itJ.hasNext()) {
            ((ImageWithLinkItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f270172f, i12);
        parcel.writeInt(this.f270173g ? 1 : 0);
    }

    public /* synthetic */ ImagesWithLinksItem(String str, int i12, String str2, List list, Displaying displaying, boolean z12, int i13, C42822w c42822w) {
        this(str, i12, str2, list, displaying, (i13 & 32) != 0 ? false : z12);
    }
}
