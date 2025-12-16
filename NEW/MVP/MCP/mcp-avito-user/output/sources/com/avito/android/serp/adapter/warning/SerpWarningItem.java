package com.avito.android.serp.adapter.warning;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.Image;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SerpWarningItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/warning/SerpWarningItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SerpWarningItem implements PersistableSerpItem {

    @Y61.k
    public static final Parcelable.Creator<SerpWarningItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f273715b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f273716c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f273717d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Image f273718e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f273719f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<Action> f273720g;

    /* renamed from: h, reason: collision with root package name */
    public final int f273721h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f273722i = SerpViewType.f268585e;

    /* compiled from: SerpWarningItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SerpWarningItem> {
        @Override // android.os.Parcelable.Creator
        public final SerpWarningItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            Image image = (Image) parcel.readParcelable(SerpWarningItem.class.getClassLoader());
            int iL2 = 0;
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(SerpWarningItem.class, parcel, arrayList, iL2, 1);
            }
            return new SerpWarningItem(j12, string, string2, image, z12, arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final SerpWarningItem[] newArray(int i12) {
            return new SerpWarningItem[i12];
        }
    }

    public SerpWarningItem(long j12, @Y61.k String str, @Y61.k String str2, @Y61.l Image image, boolean z12, @Y61.k List<Action> list, int i12) {
        this.f273715b = j12;
        this.f273716c = str;
        this.f273717d = str2;
        this.f273718e = image;
        this.f273719f = z12;
        this.f273720g = list;
        this.f273721h = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272743j() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF428153b() {
        return this.f273715b;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272742i() {
        return this.f273721h;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272735b() {
        return this.f273716c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF272741h() {
        return this.f273722i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f273715b);
        parcel.writeString(this.f273716c);
        parcel.writeString(this.f273717d);
        parcel.writeParcelable(this.f273718e, i12);
        parcel.writeInt(this.f273719f ? 1 : 0);
        Iterator itJ = C0.j(this.f273720g, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f273721h);
    }
}
