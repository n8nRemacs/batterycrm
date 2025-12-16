package com.avito.android.extended_profile_widgets.adapter.selections.adapter;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectionItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/selections/adapter/SelectionItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SelectionItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<SelectionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154870b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f154871c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Image> f154872d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f154873e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f154874f;

    /* compiled from: SelectionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectionItem> {
        @Override // android.os.Parcelable.Creator
        public final SelectionItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(SelectionItem.class, parcel, arrayList, iL2, 1);
            }
            return new SelectionItem(string, string2, parcel.readString(), (DeepLink) parcel.readParcelable(SelectionItem.class.getClassLoader()), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectionItem[] newArray(int i12) {
            return new SelectionItem[i12];
        }
    }

    public SelectionItem(@k String str, @l String str2, @l String str3, @l DeepLink deepLink, @k List list) {
        this.f154870b = str;
        this.f154871c = str2;
        this.f154872d = list;
        this.f154873e = str3;
        this.f154874f = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionItem)) {
            return false;
        }
        SelectionItem selectionItem = (SelectionItem) obj;
        return L.f(this.f154870b, selectionItem.f154870b) && L.f(this.f154871c, selectionItem.f154871c) && L.f(this.f154872d, selectionItem.f154872d) && L.f(this.f154873e, selectionItem.f154873e) && L.f(this.f154874f, selectionItem.f154874f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF273715b() {
        return getF154848b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF154848b() {
        return this.f154870b;
    }

    public final int hashCode() {
        int iHashCode = this.f154870b.hashCode() * 31;
        String str = this.f154871c;
        int iE2 = H.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f154872d);
        String str2 = this.f154873e;
        int iHashCode2 = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.f154874f;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionItem(stringId=");
        sb2.append(this.f154870b);
        sb2.append(", title=");
        sb2.append(this.f154871c);
        sb2.append(", images=");
        sb2.append(this.f154872d);
        sb2.append(", description=");
        sb2.append(this.f154873e);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f154874f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154870b);
        parcel.writeString(this.f154871c);
        Iterator itJ = C0.j(this.f154872d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f154873e);
        parcel.writeParcelable(this.f154874f, i12);
    }
}
