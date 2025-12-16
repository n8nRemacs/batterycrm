package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertNavBar.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/AdvertCardNavBar;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/AdvertCardNavBarContent;", "content", "", "Lcom/avito/android/remote/model/AdvertNavBarAction;", "actions", "<init>", "(Lcom/avito/android/remote/model/AdvertCardNavBarContent;Ljava/util/List;)V", "component1", "()Lcom/avito/android/remote/model/AdvertCardNavBarContent;", "component2", "()Ljava/util/List;", "copy", "(Lcom/avito/android/remote/model/AdvertCardNavBarContent;Ljava/util/List;)Lcom/avito/android/remote/model/AdvertCardNavBar;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/AdvertCardNavBarContent;", "getContent", "Ljava/util/List;", "getActions", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertCardNavBar implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertCardNavBar> CREATOR = new Creator();

    @c("actions")
    @l
    private final List<AdvertNavBarAction> actions;

    @c("content")
    @l
    private final AdvertCardNavBarContent content;

    /* compiled from: AdvertNavBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertCardNavBar> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertCardNavBar createFromParcel(@k Parcel parcel) {
            ArrayList arrayList = null;
            AdvertCardNavBarContent advertCardNavBarContentCreateFromParcel = parcel.readInt() == 0 ? null : AdvertCardNavBarContent.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(AdvertNavBarAction.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new AdvertCardNavBar(advertCardNavBarContentCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertCardNavBar[] newArray(int i12) {
            return new AdvertCardNavBar[i12];
        }
    }

    public AdvertCardNavBar(@l AdvertCardNavBarContent advertCardNavBarContent, @l List<AdvertNavBarAction> list) {
        this.content = advertCardNavBarContent;
        this.actions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvertCardNavBar copy$default(AdvertCardNavBar advertCardNavBar, AdvertCardNavBarContent advertCardNavBarContent, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            advertCardNavBarContent = advertCardNavBar.content;
        }
        if ((i12 & 2) != 0) {
            list = advertCardNavBar.actions;
        }
        return advertCardNavBar.copy(advertCardNavBarContent, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AdvertCardNavBarContent getContent() {
        return this.content;
    }

    @l
    public final List<AdvertNavBarAction> component2() {
        return this.actions;
    }

    @k
    public final AdvertCardNavBar copy(@l AdvertCardNavBarContent content, @l List<AdvertNavBarAction> actions) {
        return new AdvertCardNavBar(content, actions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertCardNavBar)) {
            return false;
        }
        AdvertCardNavBar advertCardNavBar = (AdvertCardNavBar) other;
        return L.f(this.content, advertCardNavBar.content) && L.f(this.actions, advertCardNavBar.actions);
    }

    @l
    public final List<AdvertNavBarAction> getActions() {
        return this.actions;
    }

    @l
    public final AdvertCardNavBarContent getContent() {
        return this.content;
    }

    public int hashCode() {
        AdvertCardNavBarContent advertCardNavBarContent = this.content;
        int iHashCode = (advertCardNavBarContent == null ? 0 : advertCardNavBarContent.hashCode()) * 31;
        List<AdvertNavBarAction> list = this.actions;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertCardNavBar(content=");
        sb2.append(this.content);
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        AdvertCardNavBarContent advertCardNavBarContent = this.content;
        if (advertCardNavBarContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertCardNavBarContent.writeToParcel(parcel, flags);
        }
        List<AdvertNavBarAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((AdvertNavBarAction) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
