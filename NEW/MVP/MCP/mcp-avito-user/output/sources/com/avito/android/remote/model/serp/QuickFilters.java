package com.avito.android.remote.model.serp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FeedsWidget.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/serp/QuickFilters;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/serp/TagFiltersItem;", "items", "", "unsetTagId", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/remote/model/serp/QuickFilters;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getItems", "Ljava/lang/String;", "getUnsetTagId", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class QuickFilters implements Parcelable {

    @k
    public static final Parcelable.Creator<QuickFilters> CREATOR = new Creator();

    @c("items")
    @k
    private final List<TagFiltersItem> items;

    @c("defaultQuickFilterFeedId")
    @k
    private final String unsetTagId;

    /* compiled from: FeedsWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QuickFilters> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final QuickFilters createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = a.c(TagFiltersItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new QuickFilters(arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final QuickFilters[] newArray(int i12) {
            return new QuickFilters[i12];
        }
    }

    public QuickFilters(@k List<TagFiltersItem> list, @k String str) {
        this.items = list;
        this.unsetTagId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuickFilters copy$default(QuickFilters quickFilters, List list, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = quickFilters.items;
        }
        if ((i12 & 2) != 0) {
            str = quickFilters.unsetTagId;
        }
        return quickFilters.copy(list, str);
    }

    @k
    public final List<TagFiltersItem> component1() {
        return this.items;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getUnsetTagId() {
        return this.unsetTagId;
    }

    @k
    public final QuickFilters copy(@k List<TagFiltersItem> items, @k String unsetTagId) {
        return new QuickFilters(items, unsetTagId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickFilters)) {
            return false;
        }
        QuickFilters quickFilters = (QuickFilters) other;
        return L.f(this.items, quickFilters.items) && L.f(this.unsetTagId, quickFilters.unsetTagId);
    }

    @k
    public final List<TagFiltersItem> getItems() {
        return this.items;
    }

    @k
    public final String getUnsetTagId() {
        return this.unsetTagId;
    }

    public int hashCode() {
        return this.unsetTagId.hashCode() + (this.items.hashCode() * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("QuickFilters(items=");
        sb2.append(this.items);
        sb2.append(", unsetTagId=");
        return C22026a.c(sb2, this.unsetTagId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.items, parcel);
        while (itJ.hasNext()) {
            ((TagFiltersItem) itJ.next()).writeToParcel(parcel, flags);
        }
        parcel.writeString(this.unsetTagId);
    }
}
