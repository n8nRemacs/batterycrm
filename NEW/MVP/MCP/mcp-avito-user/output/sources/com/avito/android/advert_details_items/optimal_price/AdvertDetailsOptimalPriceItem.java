package com.avito.android.advert_details_items.optimal_price;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert_core.advert.BlockItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsOptimalPriceItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert_details_items/optimal_price/AdvertDetailsOptimalPriceItem;", "Lcom/avito/android/advert_core/advert/BlockItem;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/l1;", "Button", "Scale", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsOptimalPriceItem implements BlockItem, Q, l1 {

    @k
    public static final Parcelable.Creator<AdvertDetailsOptimalPriceItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f84965b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f84966c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public SerpDisplayType f84967d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SerpViewType f84968e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f84969f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f84970g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Scale f84971h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Button f84972i;

    /* compiled from: AdvertDetailsOptimalPriceItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/optimal_price/AdvertDetailsOptimalPriceItem$Button;", "Landroid/os/Parcelable;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f84973b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f84974c;

        /* compiled from: AdvertDetailsOptimalPriceItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k String str, @l DeepLink deepLink) {
            this.f84973b = str;
            this.f84974c = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return L.f(this.f84973b, button.f84973b) && L.f(this.f84974c, button.f84974c);
        }

        public final int hashCode() {
            int iHashCode = this.f84973b.hashCode() * 31;
            DeepLink deepLink = this.f84974c;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Button(title=");
            sb2.append(this.f84973b);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f84974c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f84973b);
            parcel.writeParcelable(this.f84974c, i12);
        }
    }

    /* compiled from: AdvertDetailsOptimalPriceItem.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/optimal_price/AdvertDetailsOptimalPriceItem$Scale;", "Landroid/os/Parcelable;", "Line", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Scale implements Parcelable {

        @k
        public static final Parcelable.Creator<Scale> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f84975b;

        /* compiled from: AdvertDetailsOptimalPriceItem.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/optimal_price/AdvertDetailsOptimalPriceItem$Scale$Line;", "Landroid/os/Parcelable;", "Marker", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Line implements Parcelable {

            @k
            public static final Parcelable.Creator<Line> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final Object f84976b;

            /* renamed from: c, reason: collision with root package name */
            public final float f84977c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final UniversalColor f84978d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final AttributedText f84979e;

            /* compiled from: AdvertDetailsOptimalPriceItem.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_details_items/optimal_price/AdvertDetailsOptimalPriceItem$Scale$Line$Marker;", "Landroid/os/Parcelable;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final /* data */ class Marker implements Parcelable {

                @k
                public static final Parcelable.Creator<Marker> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @k
                public final AttributedText f84980b;

                /* renamed from: c, reason: collision with root package name */
                public final float f84981c;

                /* compiled from: AdvertDetailsOptimalPriceItem.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<Marker> {
                    @Override // android.os.Parcelable.Creator
                    public final Marker createFromParcel(Parcel parcel) {
                        return new Marker((AttributedText) parcel.readParcelable(Marker.class.getClassLoader()), parcel.readFloat());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Marker[] newArray(int i12) {
                        return new Marker[i12];
                    }
                }

                public Marker(@k AttributedText attributedText, float f12) {
                    this.f84980b = attributedText;
                    this.f84981c = f12;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Marker)) {
                        return false;
                    }
                    Marker marker = (Marker) obj;
                    return L.f(this.f84980b, marker.f84980b) && Float.compare(this.f84981c, marker.f84981c) == 0;
                }

                public final int hashCode() {
                    return Float.hashCode(this.f84981c) + (this.f84980b.hashCode() * 31);
                }

                @k
                public final String toString() {
                    StringBuilder sb2 = new StringBuilder("Marker(title=");
                    sb2.append(this.f84980b);
                    sb2.append(", positionPercent=");
                    return r.k(')', this.f84981c, sb2);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeParcelable(this.f84980b, i12);
                    parcel.writeFloat(this.f84981c);
                }
            }

            /* compiled from: AdvertDetailsOptimalPriceItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Line> {
                @Override // android.os.Parcelable.Creator
                public final Line createFromParcel(Parcel parcel) {
                    int i12 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(Marker.CREATOR, parcel, arrayList, iC2, 1);
                    }
                    return new Line(arrayList, parcel.readFloat(), (UniversalColor) parcel.readParcelable(Line.class.getClassLoader()), (AttributedText) parcel.readParcelable(Line.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Line[] newArray(int i12) {
                    return new Line[i12];
                }
            }

            public Line(@k List<Marker> list, float f12, @k UniversalColor universalColor, @k AttributedText attributedText) {
                this.f84976b = list;
                this.f84977c = f12;
                this.f84978d = universalColor;
                this.f84979e = attributedText;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Line)) {
                    return false;
                }
                Line line = (Line) obj;
                return L.f(this.f84976b, line.f84976b) && Float.compare(this.f84977c, line.f84977c) == 0 && L.f(this.f84978d, line.f84978d) && L.f(this.f84979e, line.f84979e);
            }

            public final int hashCode() {
                return this.f84979e.hashCode() + com.avito.android.actions_sheet.a.i(this.f84978d, r.d(this.f84977c, this.f84976b.hashCode() * 31, 31), 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Line(markers=");
                sb2.append(this.f84976b);
                sb2.append(", weight=");
                sb2.append(this.f84977c);
                sb2.append(", color=");
                sb2.append(this.f84978d);
                sb2.append(", title=");
                return com.avito.android.actions_sheet.a.w(sb2, this.f84979e, ')');
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                ?? r02 = this.f84976b;
                parcel.writeInt(r02.size());
                Iterator it = r02.iterator();
                while (it.hasNext()) {
                    ((Marker) it.next()).writeToParcel(parcel, i12);
                }
                parcel.writeFloat(this.f84977c);
                parcel.writeParcelable(this.f84978d, i12);
                parcel.writeParcelable(this.f84979e, i12);
            }
        }

        /* compiled from: AdvertDetailsOptimalPriceItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Scale> {
            @Override // android.os.Parcelable.Creator
            public final Scale createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Line.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new Scale(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Scale[] newArray(int i12) {
                return new Scale[i12];
            }
        }

        public Scale(@k ArrayList arrayList) {
            this.f84975b = arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Scale) && this.f84975b.equals(((Scale) obj).f84975b);
        }

        public final int hashCode() {
            return this.f84975b.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("Scale(lines="), this.f84975b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            ArrayList arrayList = this.f84975b;
            parcel.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Line) it.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: AdvertDetailsOptimalPriceItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsOptimalPriceItem> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsOptimalPriceItem createFromParcel(Parcel parcel) {
            return new AdvertDetailsOptimalPriceItem(parcel.readInt(), parcel.readString(), SerpDisplayType.valueOf(parcel.readString()), SerpViewType.valueOf(parcel.readString()), (AttributedText) parcel.readParcelable(AdvertDetailsOptimalPriceItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(AdvertDetailsOptimalPriceItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Scale.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsOptimalPriceItem[] newArray(int i12) {
            return new AdvertDetailsOptimalPriceItem[i12];
        }
    }

    public AdvertDetailsOptimalPriceItem(int i12, @k String str, @k SerpDisplayType serpDisplayType, @k SerpViewType serpViewType, @l AttributedText attributedText, @l AttributedText attributedText2, @l Scale scale, @l Button button) {
        this.f84965b = i12;
        this.f84966c = str;
        this.f84967d = serpDisplayType;
        this.f84968e = serpViewType;
        this.f84969f = attributedText;
        this.f84970g = attributedText2;
        this.f84971h = scale;
        this.f84972i = button;
    }

    @Override // com.avito.android.advert_core.advert.BlockItem
    @k
    public final BlockItem K5(int i12) {
        return new AdvertDetailsOptimalPriceItem(i12, this.f84966c, this.f84967d, this.f84968e, this.f84969f, this.f84970g, this.f84971h, this.f84972i);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@k SerpDisplayType serpDisplayType) {
        this.f84967d = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertDetailsOptimalPriceItem)) {
            return false;
        }
        AdvertDetailsOptimalPriceItem advertDetailsOptimalPriceItem = (AdvertDetailsOptimalPriceItem) obj;
        return this.f84965b == advertDetailsOptimalPriceItem.f84965b && L.f(this.f84966c, advertDetailsOptimalPriceItem.f84966c) && this.f84967d == advertDetailsOptimalPriceItem.f84967d && this.f84968e == advertDetailsOptimalPriceItem.f84968e && L.f(this.f84969f, advertDetailsOptimalPriceItem.f84969f) && L.f(this.f84970g, advertDetailsOptimalPriceItem.f84970g) && L.f(this.f84971h, advertDetailsOptimalPriceItem.f84971h) && L.f(this.f84972i, advertDetailsOptimalPriceItem.f84972i);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80616b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF80618d() {
        return this.f84965b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF80617c() {
        return this.f84966c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF80620f() {
        return this.f84968e;
    }

    public final int hashCode() {
        int iJ2 = com.avito.android.actions_sheet.a.j(this.f84968e, com.avito.android.actions_sheet.a.h(this.f84967d, H.d(Integer.hashCode(this.f84965b) * 31, 31, this.f84966c), 31), 31);
        AttributedText attributedText = this.f84969f;
        int iHashCode = (iJ2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f84970g;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        Scale scale = this.f84971h;
        int iHashCode3 = (iHashCode2 + (scale == null ? 0 : scale.f84975b.hashCode())) * 31;
        Button button = this.f84972i;
        return iHashCode3 + (button != null ? button.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "AdvertDetailsOptimalPriceItem(spanCount=" + this.f84965b + ", stringId=" + this.f84966c + ", displayType=" + this.f84967d + ", viewType=" + this.f84968e + ", title=" + this.f84969f + ", description=" + this.f84970g + ", scale=" + this.f84971h + ", button=" + this.f84972i + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f84965b);
        parcel.writeString(this.f84966c);
        parcel.writeString(this.f84967d.name());
        parcel.writeString(this.f84968e.name());
        parcel.writeParcelable(this.f84969f, i12);
        parcel.writeParcelable(this.f84970g, i12);
        Scale scale = this.f84971h;
        if (scale == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            scale.writeToParcel(parcel, i12);
        }
        Button button = this.f84972i;
        if (button == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            button.writeToParcel(parcel, i12);
        }
    }
}
