package com.avito.android.serp.adapter.vertical_main.cv.cv_creation;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.S2;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qs0.InterfaceC47435a;

/* compiled from: CvCreationItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/cv/cv_creation/CvCreationItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/S2;", "Lis0/h;", "Lqs0/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CvCreationItem implements PersistableSerpItem, S2, is0.h, InterfaceC47435a {

    @k
    public static final Parcelable.Creator<CvCreationItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f272735b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f272736c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f272737d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final CvCreationItemAction f272738e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Analytics f272739f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Settings f272740g;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final h.b f272744k;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SerpViewType f272741h = SerpViewType.f268585e;

    /* renamed from: i, reason: collision with root package name */
    public final int f272742i = 6;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f272743j = true;

    /* renamed from: l, reason: collision with root package name */
    public final long f272745l = a.C10492a.a(this);

    /* compiled from: CvCreationItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/cv/cv_creation/CvCreationItem$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CvCreationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CvCreationItem> {
        @Override // android.os.Parcelable.Creator
        public final CvCreationItem createFromParcel(Parcel parcel) {
            return new CvCreationItem(parcel.readString(), parcel.readString(), parcel.readString(), CvCreationItemAction.CREATOR.createFromParcel(parcel), (Analytics) parcel.readParcelable(CvCreationItem.class.getClassLoader()), (Settings) parcel.readParcelable(CvCreationItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CvCreationItem[] newArray(int i12) {
            return new CvCreationItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public CvCreationItem(@k String str, @k String str2, @l String str3, @k CvCreationItemAction cvCreationItemAction, @l Analytics analytics, @l Settings settings) {
        this.f272735b = str;
        this.f272736c = str2;
        this.f272737d = str3;
        this.f272738e = cvCreationItemAction;
        this.f272739f = analytics;
        this.f272740g = settings;
        this.f272744k = new h.b("cvCreateWidget", str2, null, null, null, analytics, 28, null);
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
    public final boolean getF272887i() {
        return this.f272743j;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF272674h() {
        return this.f272740g;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF271560b() {
        return this.f272742i;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF271561c() {
        return this.f272735b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF272676j() {
        return this.f272745l;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF271564f() {
        return this.f272741h;
    }

    @Override // is0.h
    @k
    /* renamed from: q1, reason: from getter */
    public final h.b getF272675i() {
        return this.f272744k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f272735b);
        parcel.writeString(this.f272736c);
        parcel.writeString(this.f272737d);
        this.f272738e.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f272739f, i12);
        parcel.writeParcelable(this.f272740g, i12);
    }
}
