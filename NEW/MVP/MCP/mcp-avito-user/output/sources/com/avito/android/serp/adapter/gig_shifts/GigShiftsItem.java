package com.avito.android.serp.adapter.gig_shifts;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.gig_snippet.list.snippet.GigShiftSnippetItem;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qs0.InterfaceC47435a;

/* compiled from: GigShiftsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/serp/adapter/gig_shifts/GigShiftsItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Landroid/os/Parcelable;", "Lqs0/a;", "Lis0/h;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GigShiftsItem implements PersistableSerpItem, Parcelable, InterfaceC47435a, is0.h {

    @k
    public static final Parcelable.Creator<GigShiftsItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f270098b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GigShiftSnippetItem f270099c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Analytics f270100d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Settings f270101e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final h.b f270102f;

    /* renamed from: g, reason: collision with root package name */
    public final long f270103g = a.C10492a.a(this);

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SerpViewType f270104h = SerpViewType.f268585e;

    /* renamed from: i, reason: collision with root package name */
    public final int f270105i = 6;

    /* compiled from: GigShiftsItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/gig_shifts/GigShiftsItem$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: GigShiftsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<GigShiftsItem> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftsItem createFromParcel(Parcel parcel) {
            return new GigShiftsItem(parcel.readString(), (GigShiftSnippetItem) parcel.readParcelable(GigShiftsItem.class.getClassLoader()), (Analytics) parcel.readParcelable(GigShiftsItem.class.getClassLoader()), (Settings) parcel.readParcelable(GigShiftsItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftsItem[] newArray(int i12) {
            return new GigShiftsItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public GigShiftsItem(@k String str, @k GigShiftSnippetItem gigShiftSnippetItem, @l Analytics analytics, @l Settings settings) {
        this.f270098b = str;
        this.f270099c = gigShiftSnippetItem;
        this.f270100d = analytics;
        this.f270101e = settings;
        this.f270102f = new h.b("yourSlotsWidget", null, null, null, null, analytics, 30, null);
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
    public final long getF80596b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF272674h() {
        return this.f270101e;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF80598d() {
        return this.f270105i;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF248579b() {
        return this.f270098b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF272676j() {
        return this.f270103g;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF80600f() {
        return this.f270104h;
    }

    @Override // is0.h
    @k
    /* renamed from: q1, reason: from getter */
    public final h.b getF272675i() {
        return this.f270102f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f270098b);
        parcel.writeParcelable(this.f270099c, i12);
        parcel.writeParcelable(this.f270100d, i12);
        parcel.writeParcelable(this.f270101e, i12);
    }
}
