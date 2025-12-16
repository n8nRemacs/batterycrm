package com.avito.android.serp.adapter.suggest_address;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.S2;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qs0.InterfaceC47435a;

/* compiled from: AddAddressSuggestItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/serp/adapter/suggest_address/AddAddressSuggestItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/S2;", "Lis0/h;", "Lqs0/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddAddressSuggestItem implements PersistableSerpItem, S2, is0.h, InterfaceC47435a {

    @Y61.k
    public static final Parcelable.Creator<AddAddressSuggestItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public final int f272372b;

    /* renamed from: c, reason: collision with root package name */
    public final int f272373c;

    /* renamed from: d, reason: collision with root package name */
    public final int f272374d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f272375e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f272376f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Action f272377g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f272378h;

    /* renamed from: i, reason: collision with root package name */
    public final int f272379i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Analytics f272380j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Settings f272381k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final h.b f272382l;

    /* renamed from: m, reason: collision with root package name */
    public final long f272383m = a.C10492a.a(this);

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f272384n = SerpViewType.f268585e;

    /* compiled from: AddAddressSuggestItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/suggest_address/AddAddressSuggestItem$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AddAddressSuggestItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AddAddressSuggestItem> {
        @Override // android.os.Parcelable.Creator
        public final AddAddressSuggestItem createFromParcel(Parcel parcel) {
            return new AddAddressSuggestItem(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), (Action) parcel.readParcelable(AddAddressSuggestItem.class.getClassLoader()), parcel.readString(), parcel.readInt(), (Analytics) parcel.readParcelable(AddAddressSuggestItem.class.getClassLoader()), (Settings) parcel.readParcelable(AddAddressSuggestItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AddAddressSuggestItem[] newArray(int i12) {
            return new AddAddressSuggestItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public AddAddressSuggestItem(int i12, int i13, int i14, @Y61.k String str, @Y61.k String str2, @Y61.k Action action, @Y61.k String str3, int i15, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f272372b = i12;
        this.f272373c = i13;
        this.f272374d = i14;
        this.f272375e = str;
        this.f272376f = str2;
        this.f272377g = action;
        this.f272378h = str3;
        this.f272379i = i15;
        this.f272380j = analytics;
        this.f272381k = settings;
        this.f272382l = new h.b("addressEntryPointWidget", null, null, null, null, analytics, 30, null);
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
    public final boolean getF272697l() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF272381k() {
        return this.f272381k;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272379i() {
        return this.f272379i;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272880b() {
        return this.f272378h;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF272894p() {
        return this.f272383m;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF272883e() {
        return this.f272384n;
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF272895q() {
        return this.f272382l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f272372b);
        parcel.writeInt(this.f272373c);
        parcel.writeInt(this.f272374d);
        parcel.writeString(this.f272375e);
        parcel.writeString(this.f272376f);
        parcel.writeParcelable(this.f272377g, i12);
        parcel.writeString(this.f272378h);
        parcel.writeInt(this.f272379i);
        parcel.writeParcelable(this.f272380j, i12);
        parcel.writeParcelable(this.f272381k, i12);
    }
}
