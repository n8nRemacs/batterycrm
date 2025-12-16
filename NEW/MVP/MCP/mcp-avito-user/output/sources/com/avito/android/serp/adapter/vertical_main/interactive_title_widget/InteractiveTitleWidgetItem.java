package com.avito.android.serp.adapter.vertical_main.interactive_title_widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.S2;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qs0.InterfaceC47435a;

/* compiled from: InteractiveTitleWidgetItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/interactive_title_widget/InteractiveTitleWidgetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/S2;", "Lis0/h;", "Lqs0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InteractiveTitleWidgetItem implements PersistableSerpItem, S2, is0.h, InterfaceC47435a {

    @Y61.k
    public static final Parcelable.Creator<InteractiveTitleWidgetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f272938b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f272939c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f272940d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final DeepLink f272941e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final VerticalInsets f272942f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.remote.model.vertical_main.HorizontalInsets f272943g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Analytics f272944h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Settings f272945i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final h.b f272946j;

    /* renamed from: k, reason: collision with root package name */
    public final long f272947k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f272948l;

    /* renamed from: m, reason: collision with root package name */
    public final int f272949m;

    /* compiled from: InteractiveTitleWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InteractiveTitleWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final InteractiveTitleWidgetItem createFromParcel(Parcel parcel) {
            return new InteractiveTitleWidgetItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(InteractiveTitleWidgetItem.class.getClassLoader()), parcel.readInt() == 0 ? null : VerticalInsets.CREATOR.createFromParcel(parcel), (com.avito.android.remote.model.vertical_main.HorizontalInsets) parcel.readParcelable(InteractiveTitleWidgetItem.class.getClassLoader()), (Analytics) parcel.readParcelable(InteractiveTitleWidgetItem.class.getClassLoader()), (Settings) parcel.readParcelable(InteractiveTitleWidgetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final InteractiveTitleWidgetItem[] newArray(int i12) {
            return new InteractiveTitleWidgetItem[i12];
        }
    }

    public InteractiveTitleWidgetItem(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l DeepLink deepLink, @Y61.l VerticalInsets verticalInsets, @Y61.l com.avito.android.remote.model.vertical_main.HorizontalInsets horizontalInsets, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f272938b = str;
        this.f272939c = str2;
        this.f272940d = str3;
        this.f272941e = deepLink;
        this.f272942f = verticalInsets;
        this.f272943g = horizontalInsets;
        this.f272944h = analytics;
        this.f272945i = settings;
        this.f272946j = new h.b("interactive_title_widget", null, null, null, null, analytics, 30, null);
        this.f272947k = a.C10492a.a(this);
        this.f272948l = SerpViewType.f268585e;
        this.f272949m = 6;
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
    /* renamed from: getHasStablePosition */
    public final boolean getF272887i() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF272976e() {
        return this.f272945i;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272980i() {
        return this.f272949m;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272973b() {
        return this.f272940d;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF272978g() {
        return this.f272947k;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF272979h() {
        return this.f272948l;
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF272977f() {
        return this.f272946j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f272938b);
        parcel.writeString(this.f272939c);
        parcel.writeString(this.f272940d);
        parcel.writeParcelable(this.f272941e, i12);
        VerticalInsets verticalInsets = this.f272942f;
        if (verticalInsets == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            verticalInsets.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f272943g, i12);
        parcel.writeParcelable(this.f272944h, i12);
        parcel.writeParcelable(this.f272945i, i12);
    }

    public /* synthetic */ InteractiveTitleWidgetItem(String str, String str2, String str3, DeepLink deepLink, VerticalInsets verticalInsets, com.avito.android.remote.model.vertical_main.HorizontalInsets horizontalInsets, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? str : str3, deepLink, verticalInsets, horizontalInsets, analytics, settings);
    }
}
