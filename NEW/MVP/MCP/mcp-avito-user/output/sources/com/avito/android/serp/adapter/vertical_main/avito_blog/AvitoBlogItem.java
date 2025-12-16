package com.avito.android.serp.adapter.vertical_main.avito_blog;

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
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qs0.InterfaceC47435a;

/* compiled from: AvitoBlogItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/avito_blog/AvitoBlogItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/S2;", "Lis0/h;", "Lqs0/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AvitoBlogItem implements PersistableSerpItem, S2, is0.h, InterfaceC47435a {

    @Y61.k
    public static final Parcelable.Creator<AvitoBlogItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f272581b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f272582c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f272583d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Analytics f272584e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Settings f272585f;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final h.b f272589j;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f272586g = SerpViewType.f268585e;

    /* renamed from: h, reason: collision with root package name */
    public final int f272587h = 6;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f272588i = true;

    /* renamed from: k, reason: collision with root package name */
    public final long f272590k = getF199644b().hashCode();

    /* compiled from: AvitoBlogItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/avito_blog/AvitoBlogItem$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AvitoBlogItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AvitoBlogItem> {
        @Override // android.os.Parcelable.Creator
        public final AvitoBlogItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(AvitoBlogItem.class, parcel, arrayList, iL2, 1);
            }
            return new AvitoBlogItem(string, string2, arrayList, (Analytics) parcel.readParcelable(AvitoBlogItem.class.getClassLoader()), (Settings) parcel.readParcelable(AvitoBlogItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AvitoBlogItem[] newArray(int i12) {
            return new AvitoBlogItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public AvitoBlogItem(@Y61.k String str, @Y61.k String str2, @Y61.k ArrayList arrayList, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f272581b = str;
        this.f272582c = str2;
        this.f272583d = arrayList;
        this.f272584e = analytics;
        this.f272585f = settings;
        this.f272589j = new h.b("vertical_avito_blog", null, null, null, null, analytics, 30, null);
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
        return this.f272588i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF77493b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF270101e() {
        return this.f272585f;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF77496e() {
        return this.f272587h;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF199644b() {
        return this.f272581b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF77499h() {
        return this.f272590k;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF77498g() {
        return this.f272586g;
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF270102f() {
        return this.f272589j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f272581b);
        parcel.writeString(this.f272582c);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f272583d, parcel);
        while (itZ.hasNext()) {
            parcel.writeParcelable((Parcelable) itZ.next(), i12);
        }
        parcel.writeParcelable(this.f272584e, i12);
        parcel.writeParcelable(this.f272585f, i12);
    }
}
