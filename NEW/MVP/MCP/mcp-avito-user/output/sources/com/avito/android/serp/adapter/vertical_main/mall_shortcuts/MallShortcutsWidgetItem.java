package com.avito.android.serp.adapter.vertical_main.mall_shortcuts;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.vertical_main.mall_shortcuts.mall_shortcut_item.MallShortcutItem;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: MallShortcutsWidgetItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/mall_shortcuts/MallShortcutsWidgetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lis0/h;", "Lqs0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MallShortcutsWidgetItem implements PersistableSerpItem, is0.h, InterfaceC47435a {

    @Y61.k
    public static final Parcelable.Creator<MallShortcutsWidgetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f272973b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f272974c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Analytics f272975d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Settings f272976e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final h.b f272977f;

    /* renamed from: g, reason: collision with root package name */
    public final long f272978g = getF266193b().hashCode();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f272979h = SerpViewType.f268585e;

    /* renamed from: i, reason: collision with root package name */
    public final int f272980i = 6;

    /* compiled from: MallShortcutsWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MallShortcutsWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final MallShortcutsWidgetItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(MallShortcutItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new MallShortcutsWidgetItem(string, arrayList, (Analytics) parcel.readParcelable(MallShortcutsWidgetItem.class.getClassLoader()), (Settings) parcel.readParcelable(MallShortcutsWidgetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MallShortcutsWidgetItem[] newArray(int i12) {
            return new MallShortcutsWidgetItem[i12];
        }
    }

    public MallShortcutsWidgetItem(@Y61.k String str, @Y61.k ArrayList arrayList, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f272973b = str;
        this.f272974c = arrayList;
        this.f272975d = analytics;
        this.f272976e = settings;
        this.f272977f = new h.b("mall_shortcuts_widget", null, null, null, null, analytics, 30, null);
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallShortcutsWidgetItem)) {
            return false;
        }
        MallShortcutsWidgetItem mallShortcutsWidgetItem = (MallShortcutsWidgetItem) obj;
        return L.f(this.f272973b, mallShortcutsWidgetItem.f272973b) && this.f272974c.equals(mallShortcutsWidgetItem.f272974c) && L.f(this.f272975d, mallShortcutsWidgetItem.f272975d) && L.f(this.f272976e, mallShortcutsWidgetItem.f272976e);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272775j() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF247679b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF270700f() {
        return this.f272976e;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78040c() {
        return this.f272980i;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF266193b() {
        return this.f272973b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF270702h() {
        return this.f272978g;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79109g() {
        return this.f272979h;
    }

    public final int hashCode() {
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f272974c, this.f272973b.hashCode() * 31, 31);
        Analytics analytics = this.f272975d;
        int iHashCode = (iG2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f272976e;
        return iHashCode + (settings != null ? settings.hashCode() : 0);
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF270701g() {
        return this.f272977f;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MallShortcutsWidgetItem(stringId=");
        sb2.append(this.f272973b);
        sb2.append(", items=");
        sb2.append(this.f272974c);
        sb2.append(", analytics=");
        sb2.append(this.f272975d);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f272976e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f272973b);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f272974c, parcel);
        while (itZ.hasNext()) {
            ((MallShortcutItem) itZ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f272975d, i12);
        parcel.writeParcelable(this.f272976e, i12);
    }
}
