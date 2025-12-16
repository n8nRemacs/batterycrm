package com.avito.android.remote.model.buyer_trust_banner;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BuyerTrustBanner.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0017J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u000f¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/buyer_trust_banner/BuyerTrustBanner;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lcom/avito/android/remote/model/buyer_trust_banner/BuyerTrustBanner$Background;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/remote/model/ParametrizedEvent;", "showEvent", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/buyer_trust_banner/BuyerTrustBanner$Background;Lcom/avito/android/remote/model/ParametrizedEvent;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Lcom/avito/android/remote/model/buyer_trust_banner/BuyerTrustBanner$Background;", "component3", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/buyer_trust_banner/BuyerTrustBanner$Background;Lcom/avito/android/remote/model/ParametrizedEvent;)Lcom/avito/android/remote/model/buyer_trust_banner/BuyerTrustBanner;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "Lcom/avito/android/remote/model/buyer_trust_banner/BuyerTrustBanner$Background;", "getBackground", "Lcom/avito/android/remote/model/ParametrizedEvent;", "getShowEvent", "Background", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BuyerTrustBanner implements Parcelable {

    @k
    public static final Parcelable.Creator<BuyerTrustBanner> CREATOR = new Creator();

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
    @l
    private final Background background;

    @c("showEvent")
    @l
    private final ParametrizedEvent showEvent;

    @c("text")
    @k
    private final AttributedText text;

    /* compiled from: BuyerTrustBanner.kt */
    @d
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/buyer_trust_banner/BuyerTrustBanner$Background;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/UniversalColor;", "gradientColors", "", "gradientName", "color", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Ljava/util/List;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/buyer_trust_banner/BuyerTrustBanner$Background;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getGradientColors", "Ljava/lang/String;", "getGradientName", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Background implements Parcelable {

        @k
        public static final Parcelable.Creator<Background> CREATOR = new Creator();

        @c("color")
        @l
        private final UniversalColor color;

        @c("gradientColors")
        @l
        private final List<UniversalColor> gradientColors;

        @c("gradientName")
        @l
        private final String gradientName;

        /* compiled from: BuyerTrustBanner.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Background> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Background createFromParcel(@k Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = a.l(Background.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new Background(arrayList, parcel.readString(), (UniversalColor) parcel.readParcelable(Background.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Background[] newArray(int i12) {
                return new Background[i12];
            }
        }

        public Background(@l List<UniversalColor> list, @l String str, @l UniversalColor universalColor) {
            this.gradientColors = list;
            this.gradientName = str;
            this.color = universalColor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Background copy$default(Background background, List list, String str, UniversalColor universalColor, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = background.gradientColors;
            }
            if ((i12 & 2) != 0) {
                str = background.gradientName;
            }
            if ((i12 & 4) != 0) {
                universalColor = background.color;
            }
            return background.copy(list, str, universalColor);
        }

        @l
        public final List<UniversalColor> component1() {
            return this.gradientColors;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getGradientName() {
            return this.gradientName;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final UniversalColor getColor() {
            return this.color;
        }

        @k
        public final Background copy(@l List<UniversalColor> gradientColors, @l String gradientName, @l UniversalColor color) {
            return new Background(gradientColors, gradientName, color);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Background)) {
                return false;
            }
            Background background = (Background) other;
            return L.f(this.gradientColors, background.gradientColors) && L.f(this.gradientName, background.gradientName) && L.f(this.color, background.color);
        }

        @l
        public final UniversalColor getColor() {
            return this.color;
        }

        @l
        public final List<UniversalColor> getGradientColors() {
            return this.gradientColors;
        }

        @l
        public final String getGradientName() {
            return this.gradientName;
        }

        public int hashCode() {
            List<UniversalColor> list = this.gradientColors;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.gradientName;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            UniversalColor universalColor = this.color;
            return iHashCode2 + (universalColor != null ? universalColor.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Background(gradientColors=");
            sb2.append(this.gradientColors);
            sb2.append(", gradientName=");
            sb2.append(this.gradientName);
            sb2.append(", color=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            List<UniversalColor> list = this.gradientColors;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), flags);
                }
            }
            parcel.writeString(this.gradientName);
            parcel.writeParcelable(this.color, flags);
        }
    }

    /* compiled from: BuyerTrustBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BuyerTrustBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BuyerTrustBanner createFromParcel(@k Parcel parcel) {
            return new BuyerTrustBanner((AttributedText) parcel.readParcelable(BuyerTrustBanner.class.getClassLoader()), parcel.readInt() == 0 ? null : Background.CREATOR.createFromParcel(parcel), (ParametrizedEvent) parcel.readParcelable(BuyerTrustBanner.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BuyerTrustBanner[] newArray(int i12) {
            return new BuyerTrustBanner[i12];
        }
    }

    public BuyerTrustBanner(@k AttributedText attributedText, @l Background background, @l ParametrizedEvent parametrizedEvent) {
        this.text = attributedText;
        this.background = background;
        this.showEvent = parametrizedEvent;
    }

    public static /* synthetic */ BuyerTrustBanner copy$default(BuyerTrustBanner buyerTrustBanner, AttributedText attributedText, Background background, ParametrizedEvent parametrizedEvent, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = buyerTrustBanner.text;
        }
        if ((i12 & 2) != 0) {
            background = buyerTrustBanner.background;
        }
        if ((i12 & 4) != 0) {
            parametrizedEvent = buyerTrustBanner.showEvent;
        }
        return buyerTrustBanner.copy(attributedText, background, parametrizedEvent);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Background getBackground() {
        return this.background;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ParametrizedEvent getShowEvent() {
        return this.showEvent;
    }

    @k
    public final BuyerTrustBanner copy(@k AttributedText text, @l Background background, @l ParametrizedEvent showEvent) {
        return new BuyerTrustBanner(text, background, showEvent);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuyerTrustBanner)) {
            return false;
        }
        BuyerTrustBanner buyerTrustBanner = (BuyerTrustBanner) other;
        return L.f(this.text, buyerTrustBanner.text) && L.f(this.background, buyerTrustBanner.background) && L.f(this.showEvent, buyerTrustBanner.showEvent);
    }

    @l
    public final Background getBackground() {
        return this.background;
    }

    @l
    public final ParametrizedEvent getShowEvent() {
        return this.showEvent;
    }

    @k
    public final AttributedText getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        Background background = this.background;
        int iHashCode2 = (iHashCode + (background == null ? 0 : background.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.showEvent;
        return iHashCode2 + (parametrizedEvent != null ? parametrizedEvent.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BuyerTrustBanner(text=");
        sb2.append(this.text);
        sb2.append(", background=");
        sb2.append(this.background);
        sb2.append(", showEvent=");
        return com.avito.android.advert.item.delivery_suggests.l.q(sb2, this.showEvent, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.text, flags);
        Background background = this.background;
        if (background == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            background.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.showEvent, flags);
    }
}
