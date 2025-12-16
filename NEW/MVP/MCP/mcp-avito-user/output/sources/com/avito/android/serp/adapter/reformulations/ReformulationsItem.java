package com.avito.android.serp.adapter.reformulations;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ReformulationsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/reformulations/ReformulationsItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReformulationsItem implements PersistableSerpItem {

    @Y61.k
    public static final Parcelable.Creator<ReformulationsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f270622b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f270623c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<ReformulationElement> f270624d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final ButtonStyle f270625e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f270626f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f270627g;

    /* renamed from: h, reason: collision with root package name */
    public final int f270628h;

    /* compiled from: ReformulationsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReformulationsItem> {
        @Override // android.os.Parcelable.Creator
        public final ReformulationsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ReformulationElement.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ReformulationsItem(string, string2, arrayList, parcel.readInt() == 0 ? null : ButtonStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ReformulationsItem[] newArray(int i12) {
            return new ReformulationsItem[i12];
        }
    }

    public ReformulationsItem(@Y61.k String str, @Y61.k String str2, @Y61.k List<ReformulationElement> list, @Y61.l ButtonStyle buttonStyle, boolean z12) {
        this.f270622b = str;
        this.f270623c = str2;
        this.f270624d = list;
        this.f270625e = buttonStyle;
        this.f270626f = z12;
        this.f270627g = SerpViewType.f268585e;
        this.f270628h = 6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272887i() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF270893b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270352h() {
        return this.f270628h;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF273000c() {
        return this.f270622b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270900i() {
        return this.f270627g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f270622b);
        parcel.writeString(this.f270623c);
        Iterator itJ = C0.j(this.f270624d, parcel);
        while (itJ.hasNext()) {
            ((ReformulationElement) itJ.next()).writeToParcel(parcel, i12);
        }
        ButtonStyle buttonStyle = this.f270625e;
        if (buttonStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buttonStyle.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f270626f ? 1 : 0);
    }

    public /* synthetic */ ReformulationsItem(String str, String str2, List list, ButtonStyle buttonStyle, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, list, (i12 & 8) != 0 ? null : buttonStyle, (i12 & 16) != 0 ? false : z12);
    }
}
