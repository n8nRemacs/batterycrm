package com.avito.android.beduin.common.component.top_toolbar;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.top_toolbar.h;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.RightItemsUpdateTransform;
import com.avito.android.beduin.common.navigation_bar.NavigationBarItem;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.beduin_shared.common.form.transforms.TextTransform;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinTopToolbarModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0002LMBY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'Jr\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001aJ\u0010\u0010+\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b2\u0010,J \u00107\u001a\u0002062\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b7\u00108R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bA\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010#R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bE\u0010%R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010F\u001a\u0004\bG\u0010'R\u0011\u0010K\u001a\u00020H8F¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006N"}, d2 = {"Lcom/avito/android/beduin/common/component/top_toolbar/BeduinTopToolbarModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "title", "Lcom/avito/android/beduin/common/component/top_toolbar/BeduinTopToolbarModel$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lcom/avito/android/beduin/common/component/top_toolbar/BeduinTopToolbarModel$CloseButton;", "closeButton", "", "titleNumberOfLines", "", "Lcom/avito/android/beduin/common/navigation_bar/NavigationBarItem;", "rightItems", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/component/top_toolbar/BeduinTopToolbarModel$Style;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/beduin/common/component/top_toolbar/BeduinTopToolbarModel$CloseButton;Ljava/lang/Integer;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/beduin/common/component/top_toolbar/BeduinTopToolbarModel$Style;", "component4", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "component5", "()Lcom/avito/android/beduin/common/component/top_toolbar/BeduinTopToolbarModel$CloseButton;", "component6", "()Ljava/lang/Integer;", "component7", "()Ljava/util/List;", "component8", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/component/top_toolbar/BeduinTopToolbarModel$Style;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/beduin/common/component/top_toolbar/BeduinTopToolbarModel$CloseButton;Ljava/lang/Integer;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin/common/component/top_toolbar/BeduinTopToolbarModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/beduin/common/component/top_toolbar/BeduinTopToolbarModel$Style;", "getStyle", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "Lcom/avito/android/beduin/common/component/top_toolbar/BeduinTopToolbarModel$CloseButton;", "getCloseButton", "Ljava/lang/Integer;", "getTitleNumberOfLines", "Ljava/util/List;", "getRightItems", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/beduin/common/component/top_toolbar/h$a;", "getLocalStyle", "()Lcom/avito/android/beduin/common/component/top_toolbar/h$a;", "localStyle", "CloseButton", "Style", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinTopToolbarModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinTopToolbarModel> CREATOR = new a();

    @l
    private final CloseButton closeButton;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;

    @l
    private final List<NavigationBarItem> rightItems;

    @l
    private final Style style;

    @l
    private final BeduinComponentTheme theme;

    @k
    private final String title;

    @l
    private final Integer titleNumberOfLines;

    /* compiled from: BeduinTopToolbarModel.kt */
    @Keep
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/beduin/common/component/top_toolbar/BeduinTopToolbarModel$CloseButton;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/avito/android/beduin/common/component/top_toolbar/BeduinTopToolbarModel$CloseButton;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getActions", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class CloseButton implements Parcelable {

        @k
        public static final Parcelable.Creator<CloseButton> CREATOR = new a();

        @l
        private final List<BeduinAction> actions;

        /* compiled from: BeduinTopToolbarModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CloseButton> {
            @Override // android.os.Parcelable.Creator
            public final CloseButton createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i12);
                    int iL2 = 0;
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(CloseButton.class, parcel, arrayList2, iL2, 1);
                    }
                    arrayList = arrayList2;
                }
                return new CloseButton(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final CloseButton[] newArray(int i12) {
                return new CloseButton[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CloseButton(@l List<? extends BeduinAction> list) {
            this.actions = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CloseButton copy$default(CloseButton closeButton, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = closeButton.actions;
            }
            return closeButton.copy(list);
        }

        @l
        public final List<BeduinAction> component1() {
            return this.actions;
        }

        @k
        public final CloseButton copy(@l List<? extends BeduinAction> actions) {
            return new CloseButton(actions);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CloseButton) && L.f(this.actions, ((CloseButton) other).actions);
        }

        @l
        public final List<BeduinAction> getActions() {
            return this.actions;
        }

        public int hashCode() {
            List<BeduinAction> list = this.actions;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @k
        public String toString() {
            return H.p(new StringBuilder("CloseButton(actions="), this.actions, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            List<BeduinAction> list = this.actions;
            if (list == null) {
                parcel.writeInt(0);
                return;
            }
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinTopToolbarModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/top_toolbar/BeduinTopToolbarModel$Style;", "", "(Ljava/lang/String;I)V", "LARGE", "SMALL", "BACK", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        @com.google.gson.annotations.c("bottomSheetBackArrow")
        public static final Style BACK;

        @com.google.gson.annotations.c("bottomSheetLargeTitle")
        public static final Style LARGE;

        @com.google.gson.annotations.c("bottomSheetCompact")
        public static final Style SMALL;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Style[] f102795b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f102796c;

        static {
            Style style = new Style("LARGE", 0);
            LARGE = style;
            Style style2 = new Style("SMALL", 1);
            SMALL = style2;
            Style style3 = new Style("BACK", 2);
            BACK = style3;
            Style[] styleArr = {style, style2, style3};
            f102795b = styleArr;
            f102796c = kotlin.enums.c.a(styleArr);
        }

        private Style(String str, int i12) {
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f102795b.clone();
        }
    }

    /* compiled from: BeduinTopToolbarModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinTopToolbarModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinTopToolbarModel createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            ArrayList arrayList = null;
            Style styleValueOf = parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString());
            BeduinComponentTheme beduinComponentThemeCreateFromParcel = parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel);
            CloseButton closeButtonCreateFromParcel = parcel.readInt() == 0 ? null : CloseButton.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinTopToolbarModel.class, parcel, arrayList, iL2, 1);
                }
            }
            return new BeduinTopToolbarModel(string, string2, styleValueOf, beduinComponentThemeCreateFromParcel, closeButtonCreateFromParcel, numValueOf, arrayList, (DisplayingPredicate) parcel.readParcelable(BeduinTopToolbarModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinTopToolbarModel[] newArray(int i12) {
            return new BeduinTopToolbarModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinTopToolbarModel(@k String str, @k String str2, @l Style style, @l BeduinComponentTheme beduinComponentTheme, @l CloseButton closeButton, @l Integer num, @l List<? extends NavigationBarItem> list, @l DisplayingPredicate displayingPredicate) {
        this.id = str;
        this.title = str2;
        this.style = style;
        this.theme = beduinComponentTheme;
        this.closeButton = closeButton;
        this.titleNumberOfLines = num;
        this.rightItems = list;
        this.displayingPredicate = displayingPredicate;
    }

    public static /* synthetic */ BeduinTopToolbarModel copy$default(BeduinTopToolbarModel beduinTopToolbarModel, String str, String str2, Style style, BeduinComponentTheme beduinComponentTheme, CloseButton closeButton, Integer num, List list, DisplayingPredicate displayingPredicate, int i12, Object obj) {
        return beduinTopToolbarModel.copy((i12 & 1) != 0 ? beduinTopToolbarModel.id : str, (i12 & 2) != 0 ? beduinTopToolbarModel.title : str2, (i12 & 4) != 0 ? beduinTopToolbarModel.style : style, (i12 & 8) != 0 ? beduinTopToolbarModel.theme : beduinComponentTheme, (i12 & 16) != 0 ? beduinTopToolbarModel.closeButton : closeButton, (i12 & 32) != 0 ? beduinTopToolbarModel.titleNumberOfLines : num, (i12 & 64) != 0 ? beduinTopToolbarModel.rightItems : list, (i12 & 128) != 0 ? beduinTopToolbarModel.displayingPredicate : displayingPredicate);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), 127, null) : transform instanceof TextTransform ? copy$default(this, null, ((TextTransform) transform).getText(), null, null, null, null, null, null, 253, null) : transform instanceof RightItemsUpdateTransform ? copy$default(this, null, null, null, null, null, null, ((RightItemsUpdateTransform) transform).getRightItems(), null, 191, null) : this;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final CloseButton getCloseButton() {
        return this.closeButton;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Integer getTitleNumberOfLines() {
        return this.titleNumberOfLines;
    }

    @l
    public final List<NavigationBarItem> component7() {
        return this.rightItems;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @k
    public final BeduinTopToolbarModel copy(@k String id2, @k String title, @l Style style, @l BeduinComponentTheme theme, @l CloseButton closeButton, @l Integer titleNumberOfLines, @l List<? extends NavigationBarItem> rightItems, @l DisplayingPredicate displayingPredicate) {
        return new BeduinTopToolbarModel(id2, title, style, theme, closeButton, titleNumberOfLines, rightItems, displayingPredicate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinTopToolbarModel)) {
            return false;
        }
        BeduinTopToolbarModel beduinTopToolbarModel = (BeduinTopToolbarModel) other;
        return L.f(this.id, beduinTopToolbarModel.id) && L.f(this.title, beduinTopToolbarModel.title) && this.style == beduinTopToolbarModel.style && this.theme == beduinTopToolbarModel.theme && L.f(this.closeButton, beduinTopToolbarModel.closeButton) && L.f(this.titleNumberOfLines, beduinTopToolbarModel.titleNumberOfLines) && L.f(this.rightItems, beduinTopToolbarModel.rightItems) && L.f(this.displayingPredicate, beduinTopToolbarModel.displayingPredicate);
    }

    @l
    public final CloseButton getCloseButton() {
        return this.closeButton;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    public DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public String getId() {
        return this.id;
    }

    @k
    public final h.a getLocalStyle() {
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            beduinComponentTheme = BeduinComponentTheme.AVITO;
        }
        Style style = this.style;
        if (style == null) {
            style = Style.LARGE;
        }
        return i.a(beduinComponentTheme, style, this.closeButton != null);
    }

    @l
    public final List<NavigationBarItem> getRightItems() {
        return this.rightItems;
    }

    @l
    public final Style getStyle() {
        return this.style;
    }

    @l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final Integer getTitleNumberOfLines() {
        return this.titleNumberOfLines;
    }

    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        Style style = this.style;
        int iHashCode = (iD2 + (style == null ? 0 : style.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        int iHashCode2 = (iHashCode + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31;
        CloseButton closeButton = this.closeButton;
        int iHashCode3 = (iHashCode2 + (closeButton == null ? 0 : closeButton.hashCode())) * 31;
        Integer num = this.titleNumberOfLines;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        List<NavigationBarItem> list = this.rightItems;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return iHashCode5 + (displayingPredicate != null ? displayingPredicate.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinTopToolbarModel(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", closeButton=");
        sb2.append(this.closeButton);
        sb2.append(", titleNumberOfLines=");
        sb2.append(this.titleNumberOfLines);
        sb2.append(", rightItems=");
        sb2.append(this.rightItems);
        sb2.append(", displayingPredicate=");
        return AK.c.l(sb2, this.displayingPredicate, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        Style style = this.style;
        if (style == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(style.name());
        }
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
        CloseButton closeButton = this.closeButton;
        if (closeButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            closeButton.writeToParcel(parcel, flags);
        }
        Integer num = this.titleNumberOfLines;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        List<NavigationBarItem> list = this.rightItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeParcelable(this.displayingPredicate, flags);
    }
}
