package com.avito.android.serp.adapter.attributed_header_widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: AttributedHeaderWidgetItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/attributed_header_widget/AttributedHeaderWidgetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lis0/h;", "Lqs0/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AttributedHeaderWidgetItem implements PersistableSerpItem, is0.h, InterfaceC47435a {

    @Y61.k
    public static final Parcelable.Creator<AttributedHeaderWidgetItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final AttributedText f268924b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f268925c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f268926d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Analytics f268927e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Settings f268928f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final h.b f268929g;

    /* renamed from: h, reason: collision with root package name */
    public final long f268930h = a.C10492a.a(this);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f268931i = SerpViewType.f268585e;

    /* renamed from: j, reason: collision with root package name */
    public final int f268932j = 6;

    /* compiled from: AttributedHeaderWidgetItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/attributed_header_widget/AttributedHeaderWidgetItem$a;", "", "<init>", "()V", "", "ATTRIBUTED_HEADER_WIDGET_NAME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AttributedHeaderWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AttributedHeaderWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final AttributedHeaderWidgetItem createFromParcel(Parcel parcel) {
            return new AttributedHeaderWidgetItem((AttributedText) parcel.readParcelable(AttributedHeaderWidgetItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(AttributedHeaderWidgetItem.class.getClassLoader()), parcel.readString(), (Analytics) parcel.readParcelable(AttributedHeaderWidgetItem.class.getClassLoader()), (Settings) parcel.readParcelable(AttributedHeaderWidgetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AttributedHeaderWidgetItem[] newArray(int i12) {
            return new AttributedHeaderWidgetItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public AttributedHeaderWidgetItem(@Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.k String str, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f268924b = attributedText;
        this.f268925c = attributedText2;
        this.f268926d = str;
        this.f268927e = analytics;
        this.f268928f = settings;
        this.f268929g = new h.b("attributed_header", null, null, null, null, analytics, 30, null);
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
        if (!(obj instanceof AttributedHeaderWidgetItem)) {
            return false;
        }
        AttributedHeaderWidgetItem attributedHeaderWidgetItem = (AttributedHeaderWidgetItem) obj;
        return L.f(this.f268924b, attributedHeaderWidgetItem.f268924b) && L.f(this.f268925c, attributedHeaderWidgetItem.f268925c) && L.f(this.f268926d, attributedHeaderWidgetItem.f268926d) && L.f(this.f268927e, attributedHeaderWidgetItem.f268927e) && L.f(this.f268928f, attributedHeaderWidgetItem.f268928f);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF270317l() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79005b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF269269z() {
        return this.f268928f;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79008e() {
        return this.f268932j;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF244870b() {
        return this.f268926d;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF270157i() {
        return this.f268930h;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79010g() {
        return this.f268931i;
    }

    public final int hashCode() {
        AttributedText attributedText = this.f268924b;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        AttributedText attributedText2 = this.f268925c;
        int iD2 = H.d((iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31, 31, this.f268926d);
        Analytics analytics = this.f268927e;
        int iHashCode2 = (iD2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f268928f;
        return iHashCode2 + (settings != null ? settings.hashCode() : 0);
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF270314i() {
        return this.f268929g;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AttributedHeaderWidgetItem(title=");
        sb2.append(this.f268924b);
        sb2.append(", description=");
        sb2.append(this.f268925c);
        sb2.append(", stringId=");
        sb2.append(this.f268926d);
        sb2.append(", analytics=");
        sb2.append(this.f268927e);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f268928f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f268924b, i12);
        parcel.writeParcelable(this.f268925c, i12);
        parcel.writeString(this.f268926d);
        parcel.writeParcelable(this.f268927e, i12);
        parcel.writeParcelable(this.f268928f, i12);
    }
}
