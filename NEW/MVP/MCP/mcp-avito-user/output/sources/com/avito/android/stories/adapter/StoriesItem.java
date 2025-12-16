package com.avito.android.stories.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.S2;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.stories.model.StoryBannerItem;
import com.avito.android.stories.model.StoryCarouselItem;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qs0.InterfaceC47435a;

/* compiled from: StoriesItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/stories/adapter/StoriesItem;", "Lcom/avito/android/S2;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lis0/h;", "Lqs0/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoriesItem implements S2, PersistableSerpItem, is0.h, InterfaceC47435a {

    @Y61.k
    public static final Parcelable.Creator<StoriesItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f285028b;

    /* renamed from: c, reason: collision with root package name */
    public final int f285029c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final StoryBannerItem f285030d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<StoryCarouselItem> f285031e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Integer f285032f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f285033g;

    /* renamed from: h, reason: collision with root package name */
    public final int f285034h;

    /* renamed from: i, reason: collision with root package name */
    public final int f285035i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Analytics f285036j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Settings f285037k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f285038l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f285039m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final h.b f285040n;

    /* renamed from: o, reason: collision with root package name */
    public final long f285041o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f285042p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f285043q;

    /* compiled from: StoriesItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/stories/adapter/StoriesItem$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StoriesItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<StoriesItem> {
        @Override // android.os.Parcelable.Creator
        public final StoriesItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            StoryBannerItem storyBannerItem = (StoryBannerItem) parcel.readParcelable(StoriesItem.class.getClassLoader());
            int iA2 = 0;
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(StoriesItem.class, parcel, arrayList, iL2, 1);
                }
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z12 = parcel.readInt() != 0;
            int i14 = parcel.readInt();
            int i15 = parcel.readInt();
            Analytics analytics = (Analytics) parcel.readParcelable(StoriesItem.class.getClassLoader());
            Settings settings = (Settings) parcel.readParcelable(StoriesItem.class.getClassLoader());
            if (parcel.readInt() != 0) {
                int i16 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i16);
                while (iA2 != i16) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            return new StoriesItem(string, i12, storyBannerItem, arrayList, numValueOf, z12, i14, i15, analytics, settings, linkedHashMap, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesItem[] newArray(int i12) {
            return new StoriesItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public StoriesItem(@Y61.k String str, int i12, @Y61.l StoryBannerItem storyBannerItem, @Y61.l List<StoryCarouselItem> list, @Y61.l Integer num, boolean z12, int i13, int i14, @Y61.l Analytics analytics, @Y61.l Settings settings, @Y61.l Map<String, String> map, @Y61.l String str2) {
        this.f285028b = str;
        this.f285029c = i12;
        this.f285030d = storyBannerItem;
        this.f285031e = list;
        this.f285032f = num;
        this.f285033g = z12;
        this.f285034h = i13;
        this.f285035i = i14;
        this.f285036j = analytics;
        this.f285037k = settings;
        this.f285038l = map;
        this.f285039m = str2;
        this.f285040n = new h.b("stories", null, null, null, map, analytics, 14, null);
        this.f285041o = a.C10492a.a(this);
        this.f285042p = SerpViewType.f268585e;
        this.f285043q = true;
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
    public final boolean getF272848j() {
        return this.f285043q;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83733q() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF273286g() {
        return this.f285037k;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF83735s() {
        return this.f285029c;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF83734r() {
        return this.f285028b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF273288i() {
        return this.f285041o;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF83737u() {
        return this.f285042p;
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF273287h() {
        return this.f285040n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f285028b);
        parcel.writeInt(this.f285029c);
        parcel.writeParcelable(this.f285030d, i12);
        List<StoryCarouselItem> list = this.f285031e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        Integer num = this.f285032f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeInt(this.f285033g ? 1 : 0);
        parcel.writeInt(this.f285034h);
        parcel.writeInt(this.f285035i);
        parcel.writeParcelable(this.f285036j, i12);
        parcel.writeParcelable(this.f285037k, i12);
        Map<String, String> map = this.f285038l;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeString(this.f285039m);
    }

    public /* synthetic */ StoriesItem(String str, int i12, StoryBannerItem storyBannerItem, List list, Integer num, boolean z12, int i13, int i14, Analytics analytics, Settings settings, Map map, String str2, int i15, C42822w c42822w) {
        this((i15 & 1) != 0 ? "stories_item_id" : str, i12, storyBannerItem, list, (i15 & 16) != 0 ? null : num, (i15 & 32) != 0 ? false : z12, (i15 & 64) != 0 ? 16 : i13, (i15 & 128) != 0 ? 8 : i14, (i15 & 256) != 0 ? null : analytics, (i15 & 512) != 0 ? null : settings, (i15 & 1024) != 0 ? null : map, str2);
    }
}
