package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalculateDetailsResponse.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JF\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0014¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/TrustItems;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/TrustItem;", "items", "Lcom/avito/android/remote/model/TrustItemsAction;", "action", "Lcom/avito/android/remote/model/ParametrizedEvent;", "onShowEvent", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/TrustItemsAction;Lcom/avito/android/remote/model/ParametrizedEvent;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/remote/model/TrustItemsAction;", "component4", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/TrustItemsAction;Lcom/avito/android/remote/model/ParametrizedEvent;)Lcom/avito/android/remote/model/TrustItems;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getItems", "Lcom/avito/android/remote/model/TrustItemsAction;", "getAction", "Lcom/avito/android/remote/model/ParametrizedEvent;", "getOnShowEvent", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TrustItems implements Parcelable {

    @k
    public static final Parcelable.Creator<TrustItems> CREATOR = new Creator();

    @c("action")
    @l
    private final TrustItemsAction action;

    @c("items")
    @l
    private final List<TrustItem> items;

    @c("onShowEvent")
    @l
    private final ParametrizedEvent onShowEvent;

    @c("title")
    @l
    private final String title;

    /* compiled from: StrBookingCalculateDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TrustItems> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TrustItems createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(TrustItem.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new TrustItems(string, arrayList, parcel.readInt() != 0 ? TrustItemsAction.CREATOR.createFromParcel(parcel) : null, (ParametrizedEvent) parcel.readParcelable(TrustItems.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final TrustItems[] newArray(int i12) {
            return new TrustItems[i12];
        }
    }

    public TrustItems(@l String str, @l List<TrustItem> list, @l TrustItemsAction trustItemsAction, @l ParametrizedEvent parametrizedEvent) {
        this.title = str;
        this.items = list;
        this.action = trustItemsAction;
        this.onShowEvent = parametrizedEvent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrustItems copy$default(TrustItems trustItems, String str, List list, TrustItemsAction trustItemsAction, ParametrizedEvent parametrizedEvent, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = trustItems.title;
        }
        if ((i12 & 2) != 0) {
            list = trustItems.items;
        }
        if ((i12 & 4) != 0) {
            trustItemsAction = trustItems.action;
        }
        if ((i12 & 8) != 0) {
            parametrizedEvent = trustItems.onShowEvent;
        }
        return trustItems.copy(str, list, trustItemsAction, parametrizedEvent);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<TrustItem> component2() {
        return this.items;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final TrustItemsAction getAction() {
        return this.action;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final ParametrizedEvent getOnShowEvent() {
        return this.onShowEvent;
    }

    @k
    public final TrustItems copy(@l String title, @l List<TrustItem> items, @l TrustItemsAction action, @l ParametrizedEvent onShowEvent) {
        return new TrustItems(title, items, action, onShowEvent);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrustItems)) {
            return false;
        }
        TrustItems trustItems = (TrustItems) other;
        return L.f(this.title, trustItems.title) && L.f(this.items, trustItems.items) && L.f(this.action, trustItems.action) && L.f(this.onShowEvent, trustItems.onShowEvent);
    }

    @l
    public final TrustItemsAction getAction() {
        return this.action;
    }

    @l
    public final List<TrustItem> getItems() {
        return this.items;
    }

    @l
    public final ParametrizedEvent getOnShowEvent() {
        return this.onShowEvent;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<TrustItem> list = this.items;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        TrustItemsAction trustItemsAction = this.action;
        int iHashCode3 = (iHashCode2 + (trustItemsAction == null ? 0 : trustItemsAction.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.onShowEvent;
        return iHashCode3 + (parametrizedEvent != null ? parametrizedEvent.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("TrustItems(title=");
        sb2.append(this.title);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", action=");
        sb2.append(this.action);
        sb2.append(", onShowEvent=");
        return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.onShowEvent, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        List<TrustItem> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((TrustItem) itA.next()).writeToParcel(parcel, flags);
            }
        }
        TrustItemsAction trustItemsAction = this.action;
        if (trustItemsAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            trustItemsAction.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.onShowEvent, flags);
    }
}
