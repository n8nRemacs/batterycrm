package com.avito.android.remote.model.sales;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SalesHeaderWidget.kt */
@d
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0005+,-./B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J:\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0018J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b#\u0010$R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0010¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/sales/SaleShortcuts;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/sales/SaleShortcuts$Tile;", "tiles", "Lcom/avito/android/remote/model/sales/SaleShortcuts$RubricatorType;", "rubricatorType", "Lcom/avito/android/remote/model/sales/SaleShortcuts$AllCategoriesItem;", "allCategories", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/sales/SaleShortcuts$RubricatorType;Lcom/avito/android/remote/model/sales/SaleShortcuts$AllCategoriesItem;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/remote/model/sales/SaleShortcuts$RubricatorType;", "component3", "()Lcom/avito/android/remote/model/sales/SaleShortcuts$AllCategoriesItem;", "copy", "(Ljava/util/List;Lcom/avito/android/remote/model/sales/SaleShortcuts$RubricatorType;Lcom/avito/android/remote/model/sales/SaleShortcuts$AllCategoriesItem;)Lcom/avito/android/remote/model/sales/SaleShortcuts;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getTiles", "Lcom/avito/android/remote/model/sales/SaleShortcuts$RubricatorType;", "getRubricatorType", "Lcom/avito/android/remote/model/sales/SaleShortcuts$AllCategoriesItem;", "getAllCategories", "Action", "AllCategoriesItem", "Badge", "RubricatorType", "Tile", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SaleShortcuts implements Parcelable {

    @k
    public static final Parcelable.Creator<SaleShortcuts> CREATOR = new Creator();

    @c("allCategories")
    @l
    private final AllCategoriesItem allCategories;

    @c("rubricatorType")
    @l
    private final RubricatorType rubricatorType;

    @c("tiles")
    @l
    private final List<Tile> tiles;

    /* compiled from: SalesHeaderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/sales/SaleShortcuts$Action;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/sales/SaleShortcuts$Action;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deepLink;

        /* compiled from: SalesHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Action> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action createFromParcel(@k Parcel parcel) {
                return new Action((DeepLink) parcel.readParcelable(Action.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@k DeepLink deepLink) {
            this.deepLink = deepLink;
        }

        public static /* synthetic */ Action copy$default(Action action, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                deepLink = action.deepLink;
            }
            return action.copy(deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final Action copy(@k DeepLink deepLink) {
            return new Action(deepLink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Action) && L.f(this.deepLink, ((Action) other).deepLink);
        }

        @k
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        public int hashCode() {
            return this.deepLink.hashCode();
        }

        @k
        public String toString() {
            return a.v(new StringBuilder("Action(deepLink="), this.deepLink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.deepLink, flags);
        }
    }

    /* compiled from: SalesHeaderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/sales/SaleShortcuts$Badge;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/remote/model/UniversalColor;", "textColor", "backgroundColor", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/UniversalColor;", "component3", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/sales/SaleShortcuts$Badge;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/UniversalColor;", "getTextColor", "getBackgroundColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Badge implements Parcelable {

        @k
        public static final Parcelable.Creator<Badge> CREATOR = new Creator();

        @c("backgroundColor")
        @k
        private final UniversalColor backgroundColor;

        @c("text")
        @k
        private final String text;

        @c("textColor")
        @k
        private final UniversalColor textColor;

        /* compiled from: SalesHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Badge> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Badge createFromParcel(@k Parcel parcel) {
                return new Badge(parcel.readString(), (UniversalColor) parcel.readParcelable(Badge.class.getClassLoader()), (UniversalColor) parcel.readParcelable(Badge.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Badge[] newArray(int i12) {
                return new Badge[i12];
            }
        }

        public Badge(@k String str, @k UniversalColor universalColor, @k UniversalColor universalColor2) {
            this.text = str;
            this.textColor = universalColor;
            this.backgroundColor = universalColor2;
        }

        public static /* synthetic */ Badge copy$default(Badge badge, String str, UniversalColor universalColor, UniversalColor universalColor2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = badge.text;
            }
            if ((i12 & 2) != 0) {
                universalColor = badge.textColor;
            }
            if ((i12 & 4) != 0) {
                universalColor2 = badge.backgroundColor;
            }
            return badge.copy(str, universalColor, universalColor2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        @k
        /* renamed from: component3, reason: from getter */
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @k
        public final Badge copy(@k String text, @k UniversalColor textColor, @k UniversalColor backgroundColor) {
            return new Badge(text, textColor, backgroundColor);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) other;
            return L.f(this.text, badge.text) && L.f(this.textColor, badge.textColor) && L.f(this.backgroundColor, badge.backgroundColor);
        }

        @k
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @k
        public final String getText() {
            return this.text;
        }

        @k
        public final UniversalColor getTextColor() {
            return this.textColor;
        }

        public int hashCode() {
            return this.backgroundColor.hashCode() + a.i(this.textColor, this.text.hashCode() * 31, 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Badge(text=");
            sb2.append(this.text);
            sb2.append(", textColor=");
            sb2.append(this.textColor);
            sb2.append(", backgroundColor=");
            return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.backgroundColor, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.text);
            parcel.writeParcelable(this.textColor, flags);
            parcel.writeParcelable(this.backgroundColor, flags);
        }
    }

    /* compiled from: SalesHeaderWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SaleShortcuts> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SaleShortcuts createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Tile.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new SaleShortcuts(arrayList, parcel.readInt() == 0 ? null : RubricatorType.valueOf(parcel.readString()), parcel.readInt() != 0 ? AllCategoriesItem.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SaleShortcuts[] newArray(int i12) {
            return new SaleShortcuts[i12];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SalesHeaderWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/sales/SaleShortcuts$RubricatorType;", "", "(Ljava/lang/String;I)V", "STATIC", "DYNAMIC", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RubricatorType {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ RubricatorType[] $VALUES;

        @c("static")
        public static final RubricatorType STATIC = new RubricatorType("STATIC", 0);

        @c("dynamic")
        public static final RubricatorType DYNAMIC = new RubricatorType("DYNAMIC", 1);

        private static final /* synthetic */ RubricatorType[] $values() {
            return new RubricatorType[]{STATIC, DYNAMIC};
        }

        static {
            RubricatorType[] rubricatorTypeArr$values = $values();
            $VALUES = rubricatorTypeArr$values;
            $ENTRIES = kotlin.enums.c.a(rubricatorTypeArr$values);
        }

        private RubricatorType(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<RubricatorType> getEntries() {
            return $ENTRIES;
        }

        public static RubricatorType valueOf(String str) {
            return (RubricatorType) Enum.valueOf(RubricatorType.class, str);
        }

        public static RubricatorType[] values() {
            return (RubricatorType[]) $VALUES.clone();
        }
    }

    public SaleShortcuts(@l List<Tile> list, @l RubricatorType rubricatorType, @l AllCategoriesItem allCategoriesItem) {
        this.tiles = list;
        this.rubricatorType = rubricatorType;
        this.allCategories = allCategoriesItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SaleShortcuts copy$default(SaleShortcuts saleShortcuts, List list, RubricatorType rubricatorType, AllCategoriesItem allCategoriesItem, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = saleShortcuts.tiles;
        }
        if ((i12 & 2) != 0) {
            rubricatorType = saleShortcuts.rubricatorType;
        }
        if ((i12 & 4) != 0) {
            allCategoriesItem = saleShortcuts.allCategories;
        }
        return saleShortcuts.copy(list, rubricatorType, allCategoriesItem);
    }

    @l
    public final List<Tile> component1() {
        return this.tiles;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final RubricatorType getRubricatorType() {
        return this.rubricatorType;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final AllCategoriesItem getAllCategories() {
        return this.allCategories;
    }

    @k
    public final SaleShortcuts copy(@l List<Tile> tiles, @l RubricatorType rubricatorType, @l AllCategoriesItem allCategories) {
        return new SaleShortcuts(tiles, rubricatorType, allCategories);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaleShortcuts)) {
            return false;
        }
        SaleShortcuts saleShortcuts = (SaleShortcuts) other;
        return L.f(this.tiles, saleShortcuts.tiles) && this.rubricatorType == saleShortcuts.rubricatorType && L.f(this.allCategories, saleShortcuts.allCategories);
    }

    @l
    public final AllCategoriesItem getAllCategories() {
        return this.allCategories;
    }

    @l
    public final RubricatorType getRubricatorType() {
        return this.rubricatorType;
    }

    @l
    public final List<Tile> getTiles() {
        return this.tiles;
    }

    public int hashCode() {
        List<Tile> list = this.tiles;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        RubricatorType rubricatorType = this.rubricatorType;
        int iHashCode2 = (iHashCode + (rubricatorType == null ? 0 : rubricatorType.hashCode())) * 31;
        AllCategoriesItem allCategoriesItem = this.allCategories;
        return iHashCode2 + (allCategoriesItem != null ? allCategoriesItem.hashCode() : 0);
    }

    @k
    public String toString() {
        return "SaleShortcuts(tiles=" + this.tiles + ", rubricatorType=" + this.rubricatorType + ", allCategories=" + this.allCategories + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<Tile> list = this.tiles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Tile) itA.next()).writeToParcel(parcel, flags);
            }
        }
        RubricatorType rubricatorType = this.rubricatorType;
        if (rubricatorType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(rubricatorType.name());
        }
        AllCategoriesItem allCategoriesItem = this.allCategories;
        if (allCategoriesItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            allCategoriesItem.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: SalesHeaderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J`\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b/\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b0\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b1\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u0017¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/sales/SaleShortcuts$AllCategoriesItem;", "Landroid/os/Parcelable;", "", "title", "titleWithTransfer", "Lcom/avito/android/remote/model/UniversalColor;", "titleColor", "layout", "backgroundColor", "icon", "Lcom/avito/android/remote/model/sales/SaleShortcuts$Action;", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Lcom/avito/android/remote/model/sales/SaleShortcuts$Action;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/UniversalColor;", "component4", "component5", "component6", "component7", "()Lcom/avito/android/remote/model/sales/SaleShortcuts$Action;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Lcom/avito/android/remote/model/sales/SaleShortcuts$Action;)Lcom/avito/android/remote/model/sales/SaleShortcuts$AllCategoriesItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getTitleWithTransfer", "Lcom/avito/android/remote/model/UniversalColor;", "getTitleColor", "getLayout", "getBackgroundColor", "getIcon", "Lcom/avito/android/remote/model/sales/SaleShortcuts$Action;", "getAction", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AllCategoriesItem implements Parcelable {

        @k
        public static final Parcelable.Creator<AllCategoriesItem> CREATOR = new Creator();

        @c("action")
        @k
        private final Action action;

        @c("backgroundColor")
        @l
        private final UniversalColor backgroundColor;

        @c("icon")
        @l
        private final String icon;

        @c("layout")
        @l
        private final String layout;

        @c("title")
        @k
        private final String title;

        @c("titleColor")
        @l
        private final UniversalColor titleColor;

        @c("titleWithTransfer")
        @l
        private final String titleWithTransfer;

        /* compiled from: SalesHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AllCategoriesItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AllCategoriesItem createFromParcel(@k Parcel parcel) {
                return new AllCategoriesItem(parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(AllCategoriesItem.class.getClassLoader()), parcel.readString(), (UniversalColor) parcel.readParcelable(AllCategoriesItem.class.getClassLoader()), parcel.readString(), Action.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AllCategoriesItem[] newArray(int i12) {
                return new AllCategoriesItem[i12];
            }
        }

        public AllCategoriesItem(@k String str, @l String str2, @l UniversalColor universalColor, @l String str3, @l UniversalColor universalColor2, @l String str4, @k Action action) {
            this.title = str;
            this.titleWithTransfer = str2;
            this.titleColor = universalColor;
            this.layout = str3;
            this.backgroundColor = universalColor2;
            this.icon = str4;
            this.action = action;
        }

        public static /* synthetic */ AllCategoriesItem copy$default(AllCategoriesItem allCategoriesItem, String str, String str2, UniversalColor universalColor, String str3, UniversalColor universalColor2, String str4, Action action, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = allCategoriesItem.title;
            }
            if ((i12 & 2) != 0) {
                str2 = allCategoriesItem.titleWithTransfer;
            }
            String str5 = str2;
            if ((i12 & 4) != 0) {
                universalColor = allCategoriesItem.titleColor;
            }
            UniversalColor universalColor3 = universalColor;
            if ((i12 & 8) != 0) {
                str3 = allCategoriesItem.layout;
            }
            String str6 = str3;
            if ((i12 & 16) != 0) {
                universalColor2 = allCategoriesItem.backgroundColor;
            }
            UniversalColor universalColor4 = universalColor2;
            if ((i12 & 32) != 0) {
                str4 = allCategoriesItem.icon;
            }
            String str7 = str4;
            if ((i12 & 64) != 0) {
                action = allCategoriesItem.action;
            }
            return allCategoriesItem.copy(str, str5, universalColor3, str6, universalColor4, str7, action);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getTitleWithTransfer() {
            return this.titleWithTransfer;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final UniversalColor getTitleColor() {
            return this.titleColor;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getLayout() {
            return this.layout;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        /* renamed from: component6, reason: from getter */
        public final String getIcon() {
            return this.icon;
        }

        @k
        /* renamed from: component7, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        @k
        public final AllCategoriesItem copy(@k String title, @l String titleWithTransfer, @l UniversalColor titleColor, @l String layout, @l UniversalColor backgroundColor, @l String icon, @k Action action) {
            return new AllCategoriesItem(title, titleWithTransfer, titleColor, layout, backgroundColor, icon, action);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AllCategoriesItem)) {
                return false;
            }
            AllCategoriesItem allCategoriesItem = (AllCategoriesItem) other;
            return L.f(this.title, allCategoriesItem.title) && L.f(this.titleWithTransfer, allCategoriesItem.titleWithTransfer) && L.f(this.titleColor, allCategoriesItem.titleColor) && L.f(this.layout, allCategoriesItem.layout) && L.f(this.backgroundColor, allCategoriesItem.backgroundColor) && L.f(this.icon, allCategoriesItem.icon) && L.f(this.action, allCategoriesItem.action);
        }

        @k
        public final Action getAction() {
            return this.action;
        }

        @l
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        public final String getIcon() {
            return this.icon;
        }

        @l
        public final String getLayout() {
            return this.layout;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @l
        public final UniversalColor getTitleColor() {
            return this.titleColor;
        }

        @l
        public final String getTitleWithTransfer() {
            return this.titleWithTransfer;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.titleWithTransfer;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            UniversalColor universalColor = this.titleColor;
            int iHashCode3 = (iHashCode2 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            String str2 = this.layout;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            UniversalColor universalColor2 = this.backgroundColor;
            int iHashCode5 = (iHashCode4 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
            String str3 = this.icon;
            return this.action.hashCode() + ((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        @k
        public String toString() {
            return "AllCategoriesItem(title=" + this.title + ", titleWithTransfer=" + this.titleWithTransfer + ", titleColor=" + this.titleColor + ", layout=" + this.layout + ", backgroundColor=" + this.backgroundColor + ", icon=" + this.icon + ", action=" + this.action + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.titleWithTransfer);
            parcel.writeParcelable(this.titleColor, flags);
            parcel.writeString(this.layout);
            parcel.writeParcelable(this.backgroundColor, flags);
            parcel.writeString(this.icon);
            this.action.writeToParcel(parcel, flags);
        }

        public /* synthetic */ AllCategoriesItem(String str, String str2, UniversalColor universalColor, String str3, UniversalColor universalColor2, String str4, Action action, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : universalColor, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : universalColor2, (i12 & 32) != 0 ? null : str4, action);
        }
    }

    /* compiled from: SalesHeaderWidget.kt */
    @d
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0014J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b \u0010!Jv\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010%\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010&J \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b;\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b<\u0010\u0014R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b=\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\b?\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bA\u0010!¨\u0006B"}, d2 = {"Lcom/avito/android/remote/model/sales/SaleShortcuts$Tile;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "titleColor", "layout", "titleWithTransfer", "", "rowLine", "Lcom/avito/android/remote/model/sales/SaleShortcuts$Badge;", "badge", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/sales/SaleShortcuts$Badge;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Lcom/avito/android/remote/model/UniversalImage;", "component4", "()Lcom/avito/android/remote/model/UniversalColor;", "component5", "component6", "component7", "component8", "()Ljava/lang/Integer;", "component9", "()Lcom/avito/android/remote/model/sales/SaleShortcuts$Badge;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/sales/SaleShortcuts$Badge;)Lcom/avito/android/remote/model/sales/SaleShortcuts$Tile;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "getTitleColor", "getLayout", "getTitleWithTransfer", "Ljava/lang/Integer;", "getRowLine", "Lcom/avito/android/remote/model/sales/SaleShortcuts$Badge;", "getBadge", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Tile implements Parcelable {

        @k
        public static final Parcelable.Creator<Tile> CREATOR = new Creator();

        @c("backgroundColor")
        @l
        private final UniversalColor backgroundColor;

        @c("badge")
        @l
        private final Badge badge;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deepLink;

        @c("image")
        @l
        private final UniversalImage image;

        @c("layout")
        @k
        private final String layout;

        @c("rowLine")
        @l
        private final Integer rowLine;

        @c("title")
        @k
        private final String title;

        @c("titleColor")
        @l
        private final UniversalColor titleColor;

        @c("titleWithTransfer")
        @l
        private final String titleWithTransfer;

        /* compiled from: SalesHeaderWidget.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Tile> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tile createFromParcel(@k Parcel parcel) {
                return new Tile(parcel.readString(), (DeepLink) parcel.readParcelable(Tile.class.getClassLoader()), (UniversalImage) parcel.readParcelable(Tile.class.getClassLoader()), (UniversalColor) parcel.readParcelable(Tile.class.getClassLoader()), (UniversalColor) parcel.readParcelable(Tile.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Badge.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Tile[] newArray(int i12) {
                return new Tile[i12];
            }
        }

        public Tile(@k String str, @k DeepLink deepLink, @l UniversalImage universalImage, @l UniversalColor universalColor, @l UniversalColor universalColor2, @k String str2, @l String str3, @l Integer num, @l Badge badge) {
            this.title = str;
            this.deepLink = deepLink;
            this.image = universalImage;
            this.backgroundColor = universalColor;
            this.titleColor = universalColor2;
            this.layout = str2;
            this.titleWithTransfer = str3;
            this.rowLine = num;
            this.badge = badge;
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final UniversalImage getImage() {
            return this.image;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final UniversalColor getTitleColor() {
            return this.titleColor;
        }

        @k
        /* renamed from: component6, reason: from getter */
        public final String getLayout() {
            return this.layout;
        }

        @l
        /* renamed from: component7, reason: from getter */
        public final String getTitleWithTransfer() {
            return this.titleWithTransfer;
        }

        @l
        /* renamed from: component8, reason: from getter */
        public final Integer getRowLine() {
            return this.rowLine;
        }

        @l
        /* renamed from: component9, reason: from getter */
        public final Badge getBadge() {
            return this.badge;
        }

        @k
        public final Tile copy(@k String title, @k DeepLink deepLink, @l UniversalImage image, @l UniversalColor backgroundColor, @l UniversalColor titleColor, @k String layout, @l String titleWithTransfer, @l Integer rowLine, @l Badge badge) {
            return new Tile(title, deepLink, image, backgroundColor, titleColor, layout, titleWithTransfer, rowLine, badge);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tile)) {
                return false;
            }
            Tile tile = (Tile) other;
            return L.f(this.title, tile.title) && L.f(this.deepLink, tile.deepLink) && L.f(this.image, tile.image) && L.f(this.backgroundColor, tile.backgroundColor) && L.f(this.titleColor, tile.titleColor) && L.f(this.layout, tile.layout) && L.f(this.titleWithTransfer, tile.titleWithTransfer) && L.f(this.rowLine, tile.rowLine) && L.f(this.badge, tile.badge);
        }

        @l
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        public final Badge getBadge() {
            return this.badge;
        }

        @k
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @l
        public final UniversalImage getImage() {
            return this.image;
        }

        @k
        public final String getLayout() {
            return this.layout;
        }

        @l
        public final Integer getRowLine() {
            return this.rowLine;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @l
        public final UniversalColor getTitleColor() {
            return this.titleColor;
        }

        @l
        public final String getTitleWithTransfer() {
            return this.titleWithTransfer;
        }

        public int hashCode() {
            int iE2 = a.e(this.deepLink, this.title.hashCode() * 31, 31);
            UniversalImage universalImage = this.image;
            int iHashCode = (iE2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
            UniversalColor universalColor = this.backgroundColor;
            int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            UniversalColor universalColor2 = this.titleColor;
            int iD2 = H.d((iHashCode2 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31, 31, this.layout);
            String str = this.titleWithTransfer;
            int iHashCode3 = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.rowLine;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Badge badge = this.badge;
            return iHashCode4 + (badge != null ? badge.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Tile(title=" + this.title + ", deepLink=" + this.deepLink + ", image=" + this.image + ", backgroundColor=" + this.backgroundColor + ", titleColor=" + this.titleColor + ", layout=" + this.layout + ", titleWithTransfer=" + this.titleWithTransfer + ", rowLine=" + this.rowLine + ", badge=" + this.badge + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deepLink, flags);
            parcel.writeParcelable(this.image, flags);
            parcel.writeParcelable(this.backgroundColor, flags);
            parcel.writeParcelable(this.titleColor, flags);
            parcel.writeString(this.layout);
            parcel.writeString(this.titleWithTransfer);
            Integer num = this.rowLine;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            Badge badge = this.badge;
            if (badge == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                badge.writeToParcel(parcel, flags);
            }
        }

        public /* synthetic */ Tile(String str, DeepLink deepLink, UniversalImage universalImage, UniversalColor universalColor, UniversalColor universalColor2, String str2, String str3, Integer num, Badge badge, int i12, C42822w c42822w) {
            this(str, deepLink, (i12 & 4) != 0 ? null : universalImage, (i12 & 8) != 0 ? null : universalColor, (i12 & 16) != 0 ? null : universalColor2, str2, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : num, (i12 & 256) != 0 ? null : badge);
        }
    }
}
