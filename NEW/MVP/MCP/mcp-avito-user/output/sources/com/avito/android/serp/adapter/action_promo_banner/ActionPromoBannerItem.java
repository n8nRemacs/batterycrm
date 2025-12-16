package com.avito.android.serp.adapter.action_promo_banner;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActionPromoBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/serp/adapter/action_promo_banner/ActionPromoBannerItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Background", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ActionPromoBannerItem implements PersistableSerpItem {

    @Y61.k
    public static final Parcelable.Creator<ActionPromoBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f268597b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AttributedText f268598c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f268599d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ButtonAction f268600e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Background f268601f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final UniversalImage f268602g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final UniversalColor f268603h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f268604i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f268605j = SerpViewType.f268585e;

    /* renamed from: k, reason: collision with root package name */
    public final int f268606k = 6;

    /* compiled from: ActionPromoBannerItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/action_promo_banner/ActionPromoBannerItem$Background;", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Background implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Background> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ArrayList f268607b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f268608c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final UniversalColor f268609d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f268610e;

        /* compiled from: ActionPromoBannerItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Background> {
            @Override // android.os.Parcelable.Creator
            public final Background createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(Background.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new Background(arrayList, parcel.readString(), (UniversalColor) parcel.readParcelable(Background.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Background[] newArray(int i12) {
                return new Background[i12];
            }
        }

        public Background(@l ArrayList arrayList, @l String str, @l UniversalColor universalColor, @l String str2) {
            this.f268607b = arrayList;
            this.f268608c = str;
            this.f268609d = universalColor;
            this.f268610e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Background)) {
                return false;
            }
            Background background = (Background) obj;
            return L.f(this.f268607b, background.f268607b) && L.f(this.f268608c, background.f268608c) && L.f(this.f268609d, background.f268609d) && L.f(this.f268610e, background.f268610e);
        }

        public final int hashCode() {
            ArrayList arrayList = this.f268607b;
            int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
            String str = this.f268608c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            UniversalColor universalColor = this.f268609d;
            int iHashCode3 = (iHashCode2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            String str2 = this.f268610e;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Background(gradientColors=");
            sb2.append(this.f268607b);
            sb2.append(", gradientName=");
            sb2.append(this.f268608c);
            sb2.append(", universalColor=");
            sb2.append(this.f268609d);
            sb2.append(", colorName=");
            return C22026a.c(sb2, this.f268610e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            ArrayList arrayList = this.f268607b;
            if (arrayList == null) {
                parcel.writeInt(0);
            } else {
                Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
                while (itY.hasNext()) {
                    parcel.writeParcelable((Parcelable) itY.next(), i12);
                }
            }
            parcel.writeString(this.f268608c);
            parcel.writeParcelable(this.f268609d, i12);
            parcel.writeString(this.f268610e);
        }
    }

    /* compiled from: ActionPromoBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ActionPromoBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final ActionPromoBannerItem createFromParcel(Parcel parcel) {
            return new ActionPromoBannerItem(parcel.readString(), (AttributedText) parcel.readParcelable(ActionPromoBannerItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(ActionPromoBannerItem.class.getClassLoader()), (ButtonAction) parcel.readParcelable(ActionPromoBannerItem.class.getClassLoader()), Background.CREATOR.createFromParcel(parcel), (UniversalImage) parcel.readParcelable(ActionPromoBannerItem.class.getClassLoader()), (UniversalColor) parcel.readParcelable(ActionPromoBannerItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ActionPromoBannerItem[] newArray(int i12) {
            return new ActionPromoBannerItem[i12];
        }
    }

    public ActionPromoBannerItem(@Y61.k String str, @Y61.k AttributedText attributedText, @l AttributedText attributedText2, @l ButtonAction buttonAction, @Y61.k Background background, @l UniversalImage universalImage, @Y61.k UniversalColor universalColor, boolean z12) {
        this.f268597b = str;
        this.f268598c = attributedText;
        this.f268599d = attributedText2;
        this.f268600e = buttonAction;
        this.f268601f = background;
        this.f268602g = universalImage;
        this.f268603h = universalColor;
        this.f268604i = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionPromoBannerItem)) {
            return false;
        }
        ActionPromoBannerItem actionPromoBannerItem = (ActionPromoBannerItem) obj;
        return L.f(this.f268597b, actionPromoBannerItem.f268597b) && L.f(this.f268598c, actionPromoBannerItem.f268598c) && L.f(this.f268599d, actionPromoBannerItem.f268599d) && L.f(this.f268600e, actionPromoBannerItem.f268600e) && L.f(this.f268601f, actionPromoBannerItem.f268601f) && L.f(this.f268602g, actionPromoBannerItem.f268602g) && L.f(this.f268603h, actionPromoBannerItem.f268603h) && this.f268604i == actionPromoBannerItem.f268604i;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272527e() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84801b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270151c() {
        return this.f268606k;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF132047b() {
        return this.f268597b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF270156h() {
        return this.f268605j;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.f268597b.hashCode() * 31, 31, this.f268598c);
        AttributedText attributedText = this.f268599d;
        int iHashCode = (iB2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        ButtonAction buttonAction = this.f268600e;
        int iHashCode2 = (this.f268601f.hashCode() + ((iHashCode + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31)) * 31;
        UniversalImage universalImage = this.f268602g;
        return Boolean.hashCode(this.f268604i) + com.avito.android.actions_sheet.a.i(this.f268603h, (iHashCode2 + (universalImage != null ? universalImage.hashCode() : 0)) * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActionPromoBannerItem(stringId=");
        sb2.append(this.f268597b);
        sb2.append(", title=");
        sb2.append(this.f268598c);
        sb2.append(", description=");
        sb2.append(this.f268599d);
        sb2.append(", button=");
        sb2.append(this.f268600e);
        sb2.append(", background=");
        sb2.append(this.f268601f);
        sb2.append(", backgroundImage=");
        sb2.append(this.f268602g);
        sb2.append(", closeIconColor=");
        sb2.append(this.f268603h);
        sb2.append(", closable=");
        return r.x(sb2, this.f268604i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f268597b);
        parcel.writeParcelable(this.f268598c, i12);
        parcel.writeParcelable(this.f268599d, i12);
        parcel.writeParcelable(this.f268600e, i12);
        this.f268601f.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f268602g, i12);
        parcel.writeParcelable(this.f268603h, i12);
        parcel.writeInt(this.f268604i ? 1 : 0);
    }
}
