package com.avito.android.avl_entry.impl.ui.external_item;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.avl_public.repo.BaseAvlVideoItem;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ShortVideosItemImpl.kt */
@K51.d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bo\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00038\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\b\u0010\u001fR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001a\u0010\r\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b$\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b%\u0010\u001d¨\u0006&"}, d2 = {"Lcom/avito/android/avl_entry/impl/ui/external_item/ShortVideosItemImpl;", "LIg/d;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "", "spanCount", "", "title", "", "isNew", "", "Lcom/avito/android/avl_public/repo/BaseAvlVideoItem;", "shortVideos", "categoryId", "stringId", "xHash", "isSerp", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(ILjava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "I", "getSpanCount", "()I", "setSpanCount", "(I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Z", "()Z", "Ljava/util/List;", "d1", "()Ljava/util/List;", "getCategoryId", "getStringId", "getXHash", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ShortVideosItemImpl implements Ig.d, PersistableSerpItem {

    @Y61.k
    public static final Parcelable.Creator<ShortVideosItemImpl> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f98495b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Analytics f98496c;

    @com.google.gson.annotations.c("categoryId")
    @Y61.l
    private final String categoryId;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Settings f98497d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f98498e;

    @com.google.gson.annotations.c("isNew")
    private final boolean isNew;

    @com.google.gson.annotations.c("shortVideos")
    @Y61.l
    private final List<BaseAvlVideoItem> shortVideos;

    @com.google.gson.annotations.c("spanCount")
    private int spanCount;

    @com.google.gson.annotations.c("stringId")
    @Y61.k
    private final String stringId;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("xHash")
    @Y61.l
    private final String xHash;

    /* compiled from: ShortVideosItemImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ShortVideosItemImpl> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideosItemImpl createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int i12 = parcel.readInt();
            String string = parcel.readString();
            int iL2 = 0;
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(ShortVideosItemImpl.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new ShortVideosItemImpl(i12, string, z12, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), false, null, (Settings) parcel.readParcelable(ShortVideosItemImpl.class.getClassLoader()), 384, null);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideosItemImpl[] newArray(int i12) {
            return new ShortVideosItemImpl[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShortVideosItemImpl(int i12, @Y61.k String str, boolean z12, @Y61.l List<? extends BaseAvlVideoItem> list, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, boolean z13, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.spanCount = i12;
        this.title = str;
        this.isNew = z12;
        this.shortVideos = list;
        this.categoryId = str2;
        this.stringId = str3;
        this.xHash = str4;
        this.f98495b = z13;
        this.f98496c = analytics;
        this.f98497d = settings;
        this.f98498e = SerpViewType.f268584d;
    }

    @Override // Ig.d
    @Y61.l
    public final List<BaseAvlVideoItem> d1() {
        return this.shortVideos;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideosItemImpl)) {
            return false;
        }
        ShortVideosItemImpl shortVideosItemImpl = (ShortVideosItemImpl) obj;
        return this.spanCount == shortVideosItemImpl.spanCount && L.f(this.title, shortVideosItemImpl.title) && this.isNew == shortVideosItemImpl.isNew && L.f(this.shortVideos, shortVideosItemImpl.shortVideos) && L.f(this.categoryId, shortVideosItemImpl.categoryId) && L.f(this.stringId, shortVideosItemImpl.stringId) && L.f(this.xHash, shortVideosItemImpl.xHash) && this.f98495b == shortVideosItemImpl.f98495b && L.f(this.f98496c, shortVideosItemImpl.f98496c) && L.f(this.f98497d, shortVideosItemImpl.f98497d);
    }

    @Override // Ig.d
    /* renamed from: f2, reason: from getter */
    public final boolean getF98495b() {
        return this.f98495b;
    }

    @Override // Ig.d
    @Y61.l
    /* renamed from: getAnalytics, reason: from getter */
    public final Analytics getF98496c() {
        return this.f98496c;
    }

    @Override // Ig.d
    @Y61.l
    public final String getCategoryId() {
        return this.categoryId;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF116731g() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85764e() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF116734j() {
        return this.f98497d;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF116738n() {
        return this.spanCount;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF77924b() {
        return this.stringId;
    }

    @Override // Ig.d
    @Y61.k
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF116737m() {
        return this.f98498e;
    }

    @Override // Ig.d
    @Y61.l
    public final String getXHash() {
        return this.xHash;
    }

    @Override // Ig.d
    @Y61.k
    public final ShortVideosItemImpl h1(@Y61.k ArrayList arrayList, boolean z12) {
        return new ShortVideosItemImpl(this.spanCount, this.title, this.isNew, arrayList, this.categoryId, this.stringId, this.xHash, z12, this.f98496c, this.f98497d);
    }

    public final int hashCode() {
        int i12 = r.i(H.d(Integer.hashCode(this.spanCount) * 31, 31, this.title), 31, this.isNew);
        List<BaseAvlVideoItem> list = this.shortVideos;
        int iHashCode = (i12 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.categoryId;
        int iD2 = H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.stringId);
        String str2 = this.xHash;
        int i13 = r.i((iD2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f98495b);
        Analytics analytics = this.f98496c;
        int iHashCode2 = (i13 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f98497d;
        return iHashCode2 + (settings != null ? settings.hashCode() : 0);
    }

    @Override // Ig.d
    /* renamed from: isNew, reason: from getter */
    public final boolean getIsNew() {
        return this.isNew;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShortVideosItemImpl(spanCount=");
        sb2.append(this.spanCount);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", isNew=");
        sb2.append(this.isNew);
        sb2.append(", shortVideos=");
        sb2.append(this.shortVideos);
        sb2.append(", categoryId=");
        sb2.append(this.categoryId);
        sb2.append(", stringId=");
        sb2.append(this.stringId);
        sb2.append(", xHash=");
        sb2.append(this.xHash);
        sb2.append(", isSerp=");
        sb2.append(this.f98495b);
        sb2.append(", analytics=");
        sb2.append(this.f98496c);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f98497d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.spanCount);
        parcel.writeString(this.title);
        parcel.writeInt(this.isNew ? 1 : 0);
        List<BaseAvlVideoItem> list = this.shortVideos;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeString(this.categoryId);
        parcel.writeString(this.stringId);
        parcel.writeString(this.xHash);
        parcel.writeParcelable(this.f98497d, i12);
    }

    public /* synthetic */ ShortVideosItemImpl(int i12, String str, boolean z12, List list, String str2, String str3, String str4, boolean z13, Analytics analytics, Settings settings, int i13, C42822w c42822w) {
        this(i12, str, z12, (i13 & 8) != 0 ? null : list, str2, str3, str4, (i13 & 128) != 0 ? false : z13, (i13 & 256) != 0 ? null : analytics, (i13 & 512) != 0 ? null : settings);
    }
}
