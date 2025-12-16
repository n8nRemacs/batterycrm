package com.avito.android.serp.adapter.slider;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: SliderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/slider/SliderItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lqs0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SliderItem implements PersistableSerpItem, InterfaceC47435a {

    @Y61.k
    public static final Parcelable.Creator<SliderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f272246b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final AttributedText f272247c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final UniversalColor f272248d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final UniversalColor f272249e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final UniversalColor f272250f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final UniversalImage f272251g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final UniversalColor f272252h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final DeepLink f272253i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f272254j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f272255k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final Analytics f272256l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final Settings f272257m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f272258n;

    /* renamed from: o, reason: collision with root package name */
    public final int f272259o;

    /* compiled from: SliderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SliderItem> {
        @Override // android.os.Parcelable.Creator
        public final SliderItem createFromParcel(Parcel parcel) {
            return new SliderItem(parcel.readString(), (AttributedText) parcel.readParcelable(SliderItem.class.getClassLoader()), (UniversalColor) parcel.readParcelable(SliderItem.class.getClassLoader()), (UniversalColor) parcel.readParcelable(SliderItem.class.getClassLoader()), (UniversalColor) parcel.readParcelable(SliderItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(SliderItem.class.getClassLoader()), (UniversalColor) parcel.readParcelable(SliderItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(SliderItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, (Analytics) parcel.readParcelable(SliderItem.class.getClassLoader()), (Settings) parcel.readParcelable(SliderItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SliderItem[] newArray(int i12) {
            return new SliderItem[i12];
        }
    }

    public SliderItem(@Y61.k String str, @Y61.l AttributedText attributedText, @Y61.k UniversalColor universalColor, @Y61.k UniversalColor universalColor2, @Y61.l UniversalColor universalColor3, @Y61.k UniversalImage universalImage, @Y61.l UniversalColor universalColor4, @Y61.k DeepLink deepLink, boolean z12, boolean z13, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f272246b = str;
        this.f272247c = attributedText;
        this.f272248d = universalColor;
        this.f272249e = universalColor2;
        this.f272250f = universalColor3;
        this.f272251g = universalImage;
        this.f272252h = universalColor4;
        this.f272253i = deepLink;
        this.f272254j = z12;
        this.f272255k = z13;
        this.f272256l = analytics;
        this.f272257m = settings;
        this.f272258n = SerpViewType.f268585e;
        this.f272259o = 6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SliderItem)) {
            return false;
        }
        SliderItem sliderItem = (SliderItem) obj;
        return L.f(this.f272246b, sliderItem.f272246b) && L.f(this.f272247c, sliderItem.f272247c) && L.f(this.f272248d, sliderItem.f272248d) && L.f(this.f272249e, sliderItem.f272249e) && L.f(this.f272250f, sliderItem.f272250f) && L.f(this.f272251g, sliderItem.f272251g) && L.f(this.f272252h, sliderItem.f272252h) && L.f(this.f272253i, sliderItem.f272253i) && this.f272254j == sliderItem.f272254j && this.f272255k == sliderItem.f272255k && L.f(this.f272256l, sliderItem.f272256l) && L.f(this.f272257m, sliderItem.f272257m);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272775j() {
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
        return this.f272257m;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF79433k() {
        return this.f272259o;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF132117b() {
        return this.f272246b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF79435m() {
        return this.f272258n;
    }

    public final int hashCode() {
        int iHashCode = this.f272246b.hashCode() * 31;
        AttributedText attributedText = this.f272247c;
        int i12 = com.avito.android.actions_sheet.a.i(this.f272249e, com.avito.android.actions_sheet.a.i(this.f272248d, (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31), 31);
        UniversalColor universalColor = this.f272250f;
        int iA2 = com.avito.android.actions_sheet.a.a((i12 + (universalColor == null ? 0 : universalColor.hashCode())) * 31, 31, this.f272251g);
        UniversalColor universalColor2 = this.f272252h;
        int i13 = r.i(r.i(com.avito.android.actions_sheet.a.e(this.f272253i, (iA2 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31, 31), 31, this.f272254j), 31, this.f272255k);
        Analytics analytics = this.f272256l;
        int iHashCode2 = (i13 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f272257m;
        return iHashCode2 + (settings != null ? settings.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SliderItem(stringId=");
        sb2.append(this.f272246b);
        sb2.append(", title=");
        sb2.append(this.f272247c);
        sb2.append(", startColor=");
        sb2.append(this.f272248d);
        sb2.append(", endColor=");
        sb2.append(this.f272249e);
        sb2.append(", iconColor=");
        sb2.append(this.f272250f);
        sb2.append(", image=");
        sb2.append(this.f272251g);
        sb2.append(", imageBackgroundColor=");
        sb2.append(this.f272252h);
        sb2.append(", deeplink=");
        sb2.append(this.f272253i);
        sb2.append(", isVibrationEnabled=");
        sb2.append(this.f272254j);
        sb2.append(", isInSalesHeaderWidget=");
        sb2.append(this.f272255k);
        sb2.append(", analytics=");
        sb2.append(this.f272256l);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f272257m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f272246b);
        parcel.writeParcelable(this.f272247c, i12);
        parcel.writeParcelable(this.f272248d, i12);
        parcel.writeParcelable(this.f272249e, i12);
        parcel.writeParcelable(this.f272250f, i12);
        parcel.writeParcelable(this.f272251g, i12);
        parcel.writeParcelable(this.f272252h, i12);
        parcel.writeParcelable(this.f272253i, i12);
        parcel.writeInt(this.f272254j ? 1 : 0);
        parcel.writeInt(this.f272255k ? 1 : 0);
        parcel.writeParcelable(this.f272256l, i12);
        parcel.writeParcelable(this.f272257m, i12);
    }

    public /* synthetic */ SliderItem(String str, AttributedText attributedText, UniversalColor universalColor, UniversalColor universalColor2, UniversalColor universalColor3, UniversalImage universalImage, UniversalColor universalColor4, DeepLink deepLink, boolean z12, boolean z13, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? UUID.randomUUID().toString() : str, attributedText, universalColor, universalColor2, universalColor3, universalImage, universalColor4, deepLink, z12, (i12 & 512) != 0 ? false : z13, analytics, settings);
    }
}
