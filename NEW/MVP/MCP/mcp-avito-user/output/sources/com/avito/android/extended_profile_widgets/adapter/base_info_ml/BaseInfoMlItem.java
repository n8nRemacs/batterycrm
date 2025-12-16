package com.avito.android.extended_profile_widgets.adapter.base_info_ml;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.extended_profile_ui_components.FloatingButton;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.grid.GridElementType;
import com.avito.android.remote.model.ExtendedProfileBaseInfoMl;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ProfileRating;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BaseInfoMlItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/base_info_ml/BaseInfoMlItem;", "Lcom/avito/android/extended_profile_widgets/adapter/ExtendedProfileWidgetItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BaseInfoMlItem implements ExtendedProfileWidgetItem {

    @Y61.k
    public static final Parcelable.Creator<BaseInfoMlItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f154247b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final GridElementType f154248c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f154249d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f154250e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f154251f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Image f154252g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final ProfileRating f154253h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f154254i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f154255j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f154256k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final List<ExtendedProfileBaseInfoMl.Action> f154257l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final List<FloatingButton> f154258m;

    /* compiled from: BaseInfoMlItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BaseInfoMlItem> {
        @Override // android.os.Parcelable.Creator
        public final BaseInfoMlItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            GridElementType gridElementType = (GridElementType) parcel.readParcelable(BaseInfoMlItem.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Image image = (Image) parcel.readParcelable(BaseInfoMlItem.class.getClassLoader());
            ProfileRating profileRating = (ProfileRating) parcel.readParcelable(BaseInfoMlItem.class.getClassLoader());
            boolean z12 = parcel.readInt() != 0;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(BaseInfoMlItem.class, parcel, arrayList, iL2, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            int iL3 = 0;
            while (iL3 != i13) {
                iL3 = com.avito.android.actions_sheet.a.l(BaseInfoMlItem.class, parcel, arrayList2, iL3, 1);
                i13 = i13;
            }
            return new BaseInfoMlItem(string, gridElementType, string2, string3, string4, image, profileRating, z12, string5, string6, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseInfoMlItem[] newArray(int i12) {
            return new BaseInfoMlItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseInfoMlItem(@Y61.k String str, @Y61.k GridElementType gridElementType, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l Image image, @Y61.l ProfileRating profileRating, boolean z12, @Y61.l String str5, @Y61.l String str6, @Y61.k List<? extends ExtendedProfileBaseInfoMl.Action> list, @Y61.k List<FloatingButton> list2) {
        this.f154247b = str;
        this.f154248c = gridElementType;
        this.f154249d = str2;
        this.f154250e = str3;
        this.f154251f = str4;
        this.f154252g = image;
        this.f154253h = profileRating;
        this.f154254i = z12;
        this.f154255j = str5;
        this.f154256k = str6;
        this.f154257l = list;
        this.f154258m = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseInfoMlItem)) {
            return false;
        }
        BaseInfoMlItem baseInfoMlItem = (BaseInfoMlItem) obj;
        return L.f(this.f154247b, baseInfoMlItem.f154247b) && L.f(this.f154248c, baseInfoMlItem.f154248c) && L.f(this.f154249d, baseInfoMlItem.f154249d) && L.f(this.f154250e, baseInfoMlItem.f154250e) && L.f(this.f154251f, baseInfoMlItem.f154251f) && L.f(this.f154252g, baseInfoMlItem.f154252g) && L.f(this.f154253h, baseInfoMlItem.f154253h) && this.f154254i == baseInfoMlItem.f154254i && L.f(this.f154255j, baseInfoMlItem.f154255j) && L.f(this.f154256k, baseInfoMlItem.f154256k) && L.f(this.f154257l, baseInfoMlItem.f154257l) && L.f(this.f154258m, baseInfoMlItem.f154258m);
    }

    @Override // QH.a
    @Y61.k
    /* renamed from: getGridType, reason: from getter */
    public final GridElementType getF154284c() {
        return this.f154248c;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF150590d() {
        return this.f154247b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(com.avito.android.bxcontent.mvi.entity.f.b(this.f154248c, this.f154247b.hashCode() * 31, 31), 31, this.f154249d), 31, this.f154250e);
        String str = this.f154251f;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.f154252g;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        ProfileRating profileRating = this.f154253h;
        int i12 = r.i((iHashCode2 + (profileRating == null ? 0 : profileRating.hashCode())) * 31, 31, this.f154254i);
        String str2 = this.f154255j;
        int iHashCode3 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f154256k;
        return this.f154258m.hashCode() + H.e((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f154257l);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseInfoMlItem(stringId=");
        sb2.append(this.f154247b);
        sb2.append(", gridType=");
        sb2.append(this.f154248c);
        sb2.append(", userKey=");
        sb2.append(this.f154249d);
        sb2.append(", name=");
        sb2.append(this.f154250e);
        sb2.append(", description=");
        sb2.append(this.f154251f);
        sb2.append(", avatar=");
        sb2.append(this.f154252g);
        sb2.append(", rating=");
        sb2.append(this.f154253h);
        sb2.append(", isSubscriptionProgress=");
        sb2.append(this.f154254i);
        sb2.append(", contextId=");
        sb2.append(this.f154255j);
        sb2.append(", profileSession=");
        sb2.append(this.f154256k);
        sb2.append(", actions=");
        sb2.append(this.f154257l);
        sb2.append(", floatingButtons=");
        return H.p(sb2, this.f154258m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f154247b);
        parcel.writeParcelable(this.f154248c, i12);
        parcel.writeString(this.f154249d);
        parcel.writeString(this.f154250e);
        parcel.writeString(this.f154251f);
        parcel.writeParcelable(this.f154252g, i12);
        parcel.writeParcelable(this.f154253h, i12);
        parcel.writeInt(this.f154254i ? 1 : 0);
        parcel.writeString(this.f154255j);
        parcel.writeString(this.f154256k);
        Iterator itJ = C0.j(this.f154257l, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        Iterator itJ2 = C0.j(this.f154258m, parcel);
        while (itJ2.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ2.next(), i12);
        }
    }

    public /* synthetic */ BaseInfoMlItem(String str, GridElementType gridElementType, String str2, String str3, String str4, Image image, ProfileRating profileRating, boolean z12, String str5, String str6, List list, List list2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? GridElementType.FullWidth.f161209b : gridElementType, str2, str3, str4, image, profileRating, z12, str5, str6, list, list2);
    }
}
