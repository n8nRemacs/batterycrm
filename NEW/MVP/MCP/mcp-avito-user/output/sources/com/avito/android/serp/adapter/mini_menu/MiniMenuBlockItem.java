package com.avito.android.serp.adapter.mini_menu;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.mini_menu.item.MiniMenuItem;
import com.avito.android.util.y6;
import com.avito.conveyor_item.a;
import com.avito.konveyor.item_visibility_tracker.b;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qs0.InterfaceC47435a;

/* compiled from: MiniMenuBlockItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/serp/adapter/mini_menu/MiniMenuBlockItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "Lqs0/a;", "Lis0/h;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MiniMenuBlockItem implements PersistableSerpItem, b.InterfaceC10495b, InterfaceC47435a, is0.h {

    @Y61.k
    public static final Parcelable.Creator<MiniMenuBlockItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f270307b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<MiniMenuItem> f270308c;

    /* renamed from: d, reason: collision with root package name */
    public final int f270309d;

    /* renamed from: e, reason: collision with root package name */
    public final int f270310e;

    /* renamed from: f, reason: collision with root package name */
    public final int f270311f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Analytics f270312g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Settings f270313h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final h.b f270314i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f270315j;

    /* renamed from: k, reason: collision with root package name */
    public final int f270316k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f270317l;

    /* compiled from: MiniMenuBlockItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/mini_menu/MiniMenuBlockItem$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: MiniMenuBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<MiniMenuBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final MiniMenuBlockItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(MiniMenuItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new MiniMenuBlockItem(string, arrayList, parcel.readInt(), parcel.readInt(), parcel.readInt(), (Analytics) parcel.readParcelable(MiniMenuBlockItem.class.getClassLoader()), (Settings) parcel.readParcelable(MiniMenuBlockItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MiniMenuBlockItem[] newArray(int i12) {
            return new MiniMenuBlockItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public MiniMenuBlockItem(@Y61.k String str, @Y61.k List<MiniMenuItem> list, int i12, int i13, int i14, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f270307b = str;
        this.f270308c = list;
        this.f270309d = i12;
        this.f270310e = i13;
        this.f270311f = i14;
        this.f270312g = analytics;
        this.f270313h = settings;
        this.f270314i = new h.b("servicesMenuWidget", null, null, null, null, analytics, 30, null);
        this.f270315j = SerpViewType.f268585e;
        this.f270316k = 6;
        this.f270317l = true;
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition, reason: from getter */
    public final boolean getF272527e() {
        return this.f270317l;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84654b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF270155g() {
        return this.f270313h;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270732f() {
        return this.f270316k;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270728b() {
        return this.f270307b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId */
    public final long getF270157i() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270731e() {
        return this.f270315j;
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF270158j() {
        return this.f270314i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f270307b);
        Iterator itJ = C0.j(this.f270308c, parcel);
        while (itJ.hasNext()) {
            ((MiniMenuItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f270309d);
        parcel.writeInt(this.f270310e);
        parcel.writeInt(this.f270311f);
        parcel.writeParcelable(this.f270312g, i12);
        parcel.writeParcelable(this.f270313h, i12);
    }

    public /* synthetic */ MiniMenuBlockItem(String str, List list, int i12, int i13, int i14, Analytics analytics, Settings settings, int i15, C42822w c42822w) {
        this(str, list, (i15 & 4) != 0 ? y6.b(0) : i12, (i15 & 8) != 0 ? y6.b(16) : i13, (i15 & 16) != 0 ? y6.b(0) : i14, (i15 & 32) != 0 ? null : analytics, (i15 & 64) != 0 ? null : settings);
    }
}
