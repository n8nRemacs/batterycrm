package com.avito.android.remote.sticky_block;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.safedeal.SafeDeal;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StickyBlock.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/sticky_block/StickyBlock;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/safedeal/SafeDeal$Component;", "components", "", "", "Lcom/avito/android/remote/safedeal/SafeDeal$TooltipData;", "tooltips", "", "shouldShowAnimated", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/Boolean;)V", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class StickyBlock implements Parcelable {

    @k
    public static final Parcelable.Creator<StickyBlock> CREATOR = new a();

    @c("components")
    @l
    private final List<SafeDeal.Component> components;

    @c("shouldShowAnimated")
    @l
    private final Boolean shouldShowAnimated;

    @c("tooltips")
    @l
    private final Map<String, SafeDeal.TooltipData> tooltips;

    /* compiled from: StickyBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StickyBlock> {
        @Override // android.os.Parcelable.Creator
        public final StickyBlock createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            LinkedHashMap linkedHashMap;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(StickyBlock.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i13 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    linkedHashMap.put(parcel.readString(), SafeDeal.TooltipData.CREATOR.createFromParcel(parcel));
                }
            }
            return new StickyBlock(arrayList, linkedHashMap, parcel.readInt() != 0 ? Boolean.valueOf(parcel.readInt() != 0) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StickyBlock[] newArray(int i12) {
            return new StickyBlock[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StickyBlock(@l List<? extends SafeDeal.Component> list, @l Map<String, SafeDeal.TooltipData> map, @l Boolean bool) {
        this.components = list;
        this.tooltips = map;
        this.shouldShowAnimated = bool;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Boolean getShouldShowAnimated() {
        return this.shouldShowAnimated;
    }

    @l
    public final Map<String, SafeDeal.TooltipData> d() {
        return this.tooltips;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickyBlock)) {
            return false;
        }
        StickyBlock stickyBlock = (StickyBlock) obj;
        return L.f(this.components, stickyBlock.components) && L.f(this.tooltips, stickyBlock.tooltips) && L.f(this.shouldShowAnimated, stickyBlock.shouldShowAnimated);
    }

    @l
    public final List<SafeDeal.Component> getComponents() {
        return this.components;
    }

    public final int hashCode() {
        List<SafeDeal.Component> list = this.components;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<String, SafeDeal.TooltipData> map = this.tooltips;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.shouldShowAnimated;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StickyBlock(components=");
        sb2.append(this.components);
        sb2.append(", tooltips=");
        sb2.append(this.tooltips);
        sb2.append(", shouldShowAnimated=");
        return C0.g(sb2, this.shouldShowAnimated, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<SafeDeal.Component> list = this.components;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        Map<String, SafeDeal.TooltipData> map = this.tooltips;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                ((SafeDeal.TooltipData) entry.getValue()).writeToParcel(parcel, i12);
            }
        }
        Boolean bool = this.shouldShowAnimated;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
