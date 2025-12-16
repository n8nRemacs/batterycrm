package com.avito.android.extended_profile_widgets.adapter.categorizer;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.extended_profile_widgets.adapter.categorizer.adapter.CategorizerSnippetItem;
import com.avito.android.grid.GridElementType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CategorizerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/categorizer/CategorizerItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CategorizerItem implements ExtendedProfileWidgetItem {

    @k
    public static final Parcelable.Creator<CategorizerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154310b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GridElementType f154311c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f154312d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<CategorizerSnippetItem> f154313e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Parcelable f154314f;

    /* compiled from: CategorizerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategorizerItem> {
        @Override // android.os.Parcelable.Creator
        public final CategorizerItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            GridElementType gridElementType = (GridElementType) parcel.readParcelable(CategorizerItem.class.getClassLoader());
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(CategorizerSnippetItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new CategorizerItem(string, gridElementType, string2, arrayList, parcel.readParcelable(CategorizerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CategorizerItem[] newArray(int i12) {
            return new CategorizerItem[i12];
        }
    }

    public CategorizerItem(@k String str, @k GridElementType gridElementType, @l String str2, @k List<CategorizerSnippetItem> list, @l Parcelable parcelable) {
        this.f154310b = str;
        this.f154311c = gridElementType;
        this.f154312d = str2;
        this.f154313e = list;
        this.f154314f = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategorizerItem)) {
            return false;
        }
        CategorizerItem categorizerItem = (CategorizerItem) obj;
        return L.f(this.f154310b, categorizerItem.f154310b) && L.f(this.f154311c, categorizerItem.f154311c) && L.f(this.f154312d, categorizerItem.f154312d) && L.f(this.f154313e, categorizerItem.f154313e) && L.f(this.f154314f, categorizerItem.f154314f);
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154528c() {
        return this.f154311c;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF135409b() {
        return this.f154310b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.bxcontent.mvi.entity.f.b(this.f154311c, this.f154310b.hashCode() * 31, 31);
        String str = this.f154312d;
        int iE2 = H.e((iB2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f154313e);
        Parcelable parcelable = this.f154314f;
        return iE2 + (parcelable != null ? parcelable.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategorizerItem(stringId=");
        sb2.append(this.f154310b);
        sb2.append(", gridType=");
        sb2.append(this.f154311c);
        sb2.append(", title=");
        sb2.append(this.f154312d);
        sb2.append(", items=");
        sb2.append(this.f154313e);
        sb2.append(", scrollState=");
        return com.avito.android.advert.item.delivery_suggests.l.o(sb2, this.f154314f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154310b);
        parcel.writeParcelable(this.f154311c, i12);
        parcel.writeString(this.f154312d);
        Iterator itJ = C0.j(this.f154313e, parcel);
        while (itJ.hasNext()) {
            ((CategorizerSnippetItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f154314f, i12);
    }

    public /* synthetic */ CategorizerItem(String str, GridElementType gridElementType, String str2, List list, Parcelable parcelable, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, str2, list, (i12 & 16) != 0 ? null : parcelable);
    }
}
