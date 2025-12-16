package com.avito.android.serp.adapter.actions_horizontal_block;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.developments_catalog.serp.Tab;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ActionsHorizontalBlockItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/actions_horizontal_block/ActionsHorizontalBlockItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ActionsHorizontalBlockItem implements PersistableSerpItem {

    @Y61.k
    public static final Parcelable.Creator<ActionsHorizontalBlockItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f268655b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Action f268656c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Action f268657d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<Tab> f268658e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f268659f;

    /* renamed from: g, reason: collision with root package name */
    public final int f268660g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f268661h;

    /* compiled from: ActionsHorizontalBlockItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/actions_horizontal_block/ActionsHorizontalBlockItem$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ActionsHorizontalBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ActionsHorizontalBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final ActionsHorizontalBlockItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            Action action = (Action) parcel.readParcelable(ActionsHorizontalBlockItem.class.getClassLoader());
            Action action2 = (Action) parcel.readParcelable(ActionsHorizontalBlockItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(ActionsHorizontalBlockItem.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new ActionsHorizontalBlockItem(string, action, action2, arrayList, parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ActionsHorizontalBlockItem[] newArray(int i12) {
            return new ActionsHorizontalBlockItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public ActionsHorizontalBlockItem(@Y61.k String str, @Y61.l Action action, @Y61.l Action action2, @Y61.l List<Tab> list, boolean z12, int i12) {
        this.f268655b = str;
        this.f268656c = action;
        this.f268657d = action2;
        this.f268658e = list;
        this.f268659f = z12;
        this.f268660g = i12;
        this.f268661h = SerpViewType.f268585e;
    }

    public static ActionsHorizontalBlockItem a(ActionsHorizontalBlockItem actionsHorizontalBlockItem, Action action, Action action2, boolean z12, int i12) {
        if ((i12 & 2) != 0) {
            action = actionsHorizontalBlockItem.f268656c;
        }
        Action action3 = action;
        if ((i12 & 4) != 0) {
            action2 = actionsHorizontalBlockItem.f268657d;
        }
        Action action4 = action2;
        if ((i12 & 16) != 0) {
            z12 = actionsHorizontalBlockItem.f268659f;
        }
        return new ActionsHorizontalBlockItem(actionsHorizontalBlockItem.f268655b, action3, action4, actionsHorizontalBlockItem.f268658e, z12, actionsHorizontalBlockItem.f268660g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionsHorizontalBlockItem)) {
            return false;
        }
        ActionsHorizontalBlockItem actionsHorizontalBlockItem = (ActionsHorizontalBlockItem) obj;
        return L.f(this.f268655b, actionsHorizontalBlockItem.f268655b) && L.f(this.f268656c, actionsHorizontalBlockItem.f268656c) && L.f(this.f268657d, actionsHorizontalBlockItem.f268657d) && L.f(this.f268658e, actionsHorizontalBlockItem.f268658e) && this.f268659f == actionsHorizontalBlockItem.f268659f && this.f268660g == actionsHorizontalBlockItem.f268660g;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF68289e() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124032b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF161889l() {
        return this.f268660g;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF266382b() {
        return this.f268655b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF161888k() {
        return this.f268661h;
    }

    public final int hashCode() {
        int iHashCode = this.f268655b.hashCode() * 31;
        Action action = this.f268656c;
        int iHashCode2 = (iHashCode + (action == null ? 0 : action.hashCode())) * 31;
        Action action2 = this.f268657d;
        int iHashCode3 = (iHashCode2 + (action2 == null ? 0 : action2.hashCode())) * 31;
        List<Tab> list = this.f268658e;
        return Integer.hashCode(this.f268660g) + androidx.appcompat.app.r.i((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31, 31, this.f268659f);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionsHorizontalBlockItem(stringId=");
        sb2.append(this.f268655b);
        sb2.append(", leftAction=");
        sb2.append(this.f268656c);
        sb2.append(", rightAction=");
        sb2.append(this.f268657d);
        sb2.append(", tabs=");
        sb2.append(this.f268658e);
        sb2.append(", visible=");
        sb2.append(this.f268659f);
        sb2.append(", spanCount=");
        return androidx.appcompat.app.r.t(sb2, this.f268660g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f268655b);
        parcel.writeParcelable(this.f268656c, i12);
        parcel.writeParcelable(this.f268657d, i12);
        List<Tab> list = this.f268658e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeInt(this.f268659f ? 1 : 0);
        parcel.writeInt(this.f268660g);
    }

    public /* synthetic */ ActionsHorizontalBlockItem(String str, Action action, Action action2, List list, boolean z12, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? "ActionsHorizontalBlockItem" : str, (i13 & 2) != 0 ? null : action, (i13 & 4) != 0 ? null : action2, list, z12, (i13 & 32) != 0 ? 6 : i12);
    }
}
