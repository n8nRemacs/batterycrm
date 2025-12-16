package com.avito.android.avl_entry.impl.data.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.avl_entry_public.ShortVideosWitcherNetworkModel;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ShortVideosWitcherNetworkModelImpl.kt */
@d
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0012\u0010\u000fR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/avl_entry/impl/data/model/ShortVideosWitcherNetworkModelImpl;", "Lcom/avito/android/avl_entry_public/ShortVideosWitcherNetworkModel;", "", "title", "", "isNew", "xHash", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "analytics", "Lcom/avito/android/remote/model/widget_settings/Settings;", "settings", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/widget_analytics/Analytics;Lcom/avito/android/remote/model/widget_settings/Settings;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getXHash", "Lcom/avito/android/remote/model/widget_analytics/Analytics;", "getAnalytics", "()Lcom/avito/android/remote/model/widget_analytics/Analytics;", "setAnalytics", "(Lcom/avito/android/remote/model/widget_analytics/Analytics;)V", "Lcom/avito/android/remote/model/widget_settings/Settings;", "getSettings", "()Lcom/avito/android/remote/model/widget_settings/Settings;", "setSettings", "(Lcom/avito/android/remote/model/widget_settings/Settings;)V", "_avito_avl-entry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShortVideosWitcherNetworkModelImpl implements ShortVideosWitcherNetworkModel {

    @k
    public static final Parcelable.Creator<ShortVideosWitcherNetworkModelImpl> CREATOR = new a();

    @c("analytics")
    @l
    private Analytics analytics;

    /* renamed from: b, reason: collision with root package name */
    public long f98452b;

    @c("isNew")
    @l
    private final Boolean isNew;

    @c("settings")
    @l
    private Settings settings;

    @c("title")
    @l
    private final String title;

    @c("xHash")
    @l
    private final String xHash;

    /* compiled from: ShortVideosWitcherNetworkModelImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ShortVideosWitcherNetworkModelImpl> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideosWitcherNetworkModelImpl createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ShortVideosWitcherNetworkModelImpl(string, boolValueOf, parcel.readString(), (Analytics) parcel.readParcelable(ShortVideosWitcherNetworkModelImpl.class.getClassLoader()), (Settings) parcel.readParcelable(ShortVideosWitcherNetworkModelImpl.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideosWitcherNetworkModelImpl[] newArray(int i12) {
            return new ShortVideosWitcherNetworkModelImpl[i12];
        }
    }

    public ShortVideosWitcherNetworkModelImpl(@l String str, @l Boolean bool, @l String str2, @l Analytics analytics, @l Settings settings) {
        this.title = str;
        this.isNew = bool;
        this.xHash = str2;
        this.analytics = analytics;
        this.settings = settings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    @l
    public final Analytics getAnalytics() {
        return this.analytics;
    }

    @Override // qs0.InterfaceC47435a
    @l
    public final Settings getSettings() {
        return this.settings;
    }

    @Override // com.avito.android.avl_entry_public.ShortVideosWitcherNetworkModel
    @l
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.SerpElement
    /* renamed from: getUniqueId, reason: from getter */
    public final long getF98452b() {
        return this.f98452b;
    }

    @Override // com.avito.android.avl_entry_public.ShortVideosWitcherNetworkModel
    @l
    public final String getXHash() {
        return this.xHash;
    }

    @Override // com.avito.android.avl_entry_public.ShortVideosWitcherNetworkModel
    @l
    /* renamed from: isNew, reason: from getter */
    public final Boolean getIsNew() {
        return this.isNew;
    }

    @Override // com.avito.android.remote.model.AnalyticsElement
    public final void setAnalytics(@l Analytics analytics) {
        this.analytics = analytics;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public final void setUniqueId(long j12) {
        this.f98452b = j12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        Boolean bool = this.isNew;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.xHash);
        parcel.writeParcelable(this.analytics, i12);
        parcel.writeParcelable(this.settings, i12);
    }

    public /* synthetic */ ShortVideosWitcherNetworkModelImpl(String str, Boolean bool, String str2, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this(str, bool, str2, (i12 & 8) != 0 ? null : analytics, (i12 & 16) != 0 ? null : settings);
    }
}
