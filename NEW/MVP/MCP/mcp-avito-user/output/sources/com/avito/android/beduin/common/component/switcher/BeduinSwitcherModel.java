package com.avito.android.beduin.common.component.switcher;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.IsEnabledTransform;
import com.avito.android.beduin.common.form.transforms.IsSwitchOnTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSwitcherModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0001]B\u009f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b3\u00102J\u0018\u00104\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b4\u00102J\u0012\u00105\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b5\u00106JÄ\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010!J\u0010\u0010;\u001a\u00020:HÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010?\u001a\u00020\u000b2\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020:HÖ\u0001¢\u0006\u0004\bA\u0010<J \u0010F\u001a\u00020E2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020:HÖ\u0001¢\u0006\u0004\bF\u0010GR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010H\u001a\u0004\bI\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010H\u001a\u0004\bJ\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010H\u001a\u0004\bK\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010H\u001a\u0004\bL\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010M\u001a\u0004\bN\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010O\u001a\u0004\bP\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010Q\u001a\u0004\b\f\u0010*R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010R\u001a\u0004\b\r\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010S\u001a\u0004\bT\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010U\u001a\u0004\bV\u00100R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010W\u001a\u0004\bX\u00102R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0015\u0010W\u001a\u0004\bY\u00102R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0016\u0010W\u001a\u0004\bZ\u00102R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010[\u001a\u0004\b\\\u00106¨\u0006^"}, d2 = {"Lcom/avito/android/beduin/common/component/switcher/BeduinSwitcherModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "title", "subtitle", "details", "Lcom/avito/android/beduin/common/component/switcher/Link;", "link", "Lcom/avito/android/beduin/common/component/switcher/Icon;", "icon", "", "isEnabled", "isSwitchOn", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lcom/avito/android/beduin/common/component/switcher/BeduinSwitcherModel$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "onSwitchOnActions", "onSwitchOffActions", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/component/switcher/Link;Lcom/avito/android/beduin/common/component/switcher/Icon;Ljava/lang/Boolean;ZLcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/beduin/common/component/switcher/BeduinSwitcherModel$Style;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/avito/android/beduin/common/component/switcher/Link;", "component6", "()Lcom/avito/android/beduin/common/component/switcher/Icon;", "component7", "()Ljava/lang/Boolean;", "component8", "()Z", "component9", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "component10", "()Lcom/avito/android/beduin/common/component/switcher/BeduinSwitcherModel$Style;", "component11", "()Ljava/util/List;", "component12", "component13", "component14", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/component/switcher/Link;Lcom/avito/android/beduin/common/component/switcher/Icon;Ljava/lang/Boolean;ZLcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/beduin/common/component/switcher/BeduinSwitcherModel$Style;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin/common/component/switcher/BeduinSwitcherModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "getDetails", "Lcom/avito/android/beduin/common/component/switcher/Link;", "getLink", "Lcom/avito/android/beduin/common/component/switcher/Icon;", "getIcon", "Ljava/lang/Boolean;", "Z", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "Lcom/avito/android/beduin/common/component/switcher/BeduinSwitcherModel$Style;", "getStyle", "Ljava/util/List;", "getActions", "getOnSwitchOnActions", "getOnSwitchOffActions", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Style", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinSwitcherModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinSwitcherModel> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final String details;

    @l
    private final DisplayingPredicate displayingPredicate;

    @l
    private final Icon icon;

    @k
    private final String id;

    @l
    private final Boolean isEnabled;
    private final boolean isSwitchOn;

    @l
    private final Link link;

    @l
    private final List<BeduinAction> onSwitchOffActions;

    @l
    private final List<BeduinAction> onSwitchOnActions;

    @l
    private final Style style;

    @l
    private final String subtitle;

    @l
    private final BeduinComponentTheme theme;

    @k
    private final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinSwitcherModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/switcher/BeduinSwitcherModel$Style;", "", "(Ljava/lang/String;I)V", "STANDARD", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Style {

        @com.google.gson.annotations.c("standard")
        public static final Style STANDARD;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Style[] f102734b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f102735c;

        static {
            Style style = new Style("STANDARD", 0);
            STANDARD = style;
            Style[] styleArr = {style};
            f102734b = styleArr;
            f102735c = kotlin.enums.c.a(styleArr);
        }

        private Style(String str, int i12) {
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) f102734b.clone();
        }
    }

    /* compiled from: BeduinSwitcherModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinSwitcherModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSwitcherModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Link linkCreateFromParcel = parcel.readInt() == 0 ? null : Link.CREATOR.createFromParcel(parcel);
            Icon iconCreateFromParcel = parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z12 = parcel.readInt() != 0;
            BeduinComponentTheme beduinComponentThemeCreateFromParcel = parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel);
            Style styleValueOf = parcel.readInt() == 0 ? null : Style.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinSwitcherModel.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinSwitcherModel.class, parcel, arrayList5, iL3, 1);
                    i13 = i13;
                }
                arrayList2 = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = arrayList2;
                arrayList4 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i14);
                arrayList3 = arrayList2;
                int iL4 = 0;
                while (iL4 != i14) {
                    iL4 = com.avito.android.actions_sheet.a.l(BeduinSwitcherModel.class, parcel, arrayList6, iL4, 1);
                    i14 = i14;
                }
                arrayList4 = arrayList6;
            }
            return new BeduinSwitcherModel(string, string2, string3, string4, linkCreateFromParcel, iconCreateFromParcel, boolValueOf, z12, beduinComponentThemeCreateFromParcel, styleValueOf, arrayList, arrayList3, arrayList4, (DisplayingPredicate) parcel.readParcelable(BeduinSwitcherModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSwitcherModel[] newArray(int i12) {
            return new BeduinSwitcherModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinSwitcherModel(@k String str, @k String str2, @l String str3, @l String str4, @l Link link, @l Icon icon, @l Boolean bool, boolean z12, @l BeduinComponentTheme beduinComponentTheme, @l Style style, @l List<? extends BeduinAction> list, @l List<? extends BeduinAction> list2, @l List<? extends BeduinAction> list3, @l DisplayingPredicate displayingPredicate) {
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.details = str4;
        this.link = link;
        this.icon = icon;
        this.isEnabled = bool;
        this.isSwitchOn = z12;
        this.theme = beduinComponentTheme;
        this.style = style;
        this.actions = list;
        this.onSwitchOnActions = list2;
        this.onSwitchOffActions = list3;
        this.displayingPredicate = displayingPredicate;
    }

    public static /* synthetic */ BeduinSwitcherModel copy$default(BeduinSwitcherModel beduinSwitcherModel, String str, String str2, String str3, String str4, Link link, Icon icon, Boolean bool, boolean z12, BeduinComponentTheme beduinComponentTheme, Style style, List list, List list2, List list3, DisplayingPredicate displayingPredicate, int i12, Object obj) {
        return beduinSwitcherModel.copy((i12 & 1) != 0 ? beduinSwitcherModel.id : str, (i12 & 2) != 0 ? beduinSwitcherModel.title : str2, (i12 & 4) != 0 ? beduinSwitcherModel.subtitle : str3, (i12 & 8) != 0 ? beduinSwitcherModel.details : str4, (i12 & 16) != 0 ? beduinSwitcherModel.link : link, (i12 & 32) != 0 ? beduinSwitcherModel.icon : icon, (i12 & 64) != 0 ? beduinSwitcherModel.isEnabled : bool, (i12 & 128) != 0 ? beduinSwitcherModel.isSwitchOn : z12, (i12 & 256) != 0 ? beduinSwitcherModel.theme : beduinComponentTheme, (i12 & 512) != 0 ? beduinSwitcherModel.style : style, (i12 & 1024) != 0 ? beduinSwitcherModel.actions : list, (i12 & 2048) != 0 ? beduinSwitcherModel.onSwitchOnActions : list2, (i12 & 4096) != 0 ? beduinSwitcherModel.onSwitchOffActions : list3, (i12 & 8192) != 0 ? beduinSwitcherModel.displayingPredicate : displayingPredicate);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, null, null, null, null, false, null, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), 8191, null) : transform instanceof IsEnabledTransform ? copy$default(this, null, null, null, null, null, null, Boolean.valueOf(((IsEnabledTransform) transform).isEnabled()), false, null, null, null, null, null, null, 16319, null) : transform instanceof IsSwitchOnTransform ? copy$default(this, null, null, null, null, null, null, null, ((IsSwitchOnTransform) transform).isSwitchOn(), null, null, null, null, null, null, 16255, null) : this;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @l
    public final List<BeduinAction> component11() {
        return this.actions;
    }

    @l
    public final List<BeduinAction> component12() {
        return this.onSwitchOnActions;
    }

    @l
    public final List<BeduinAction> component13() {
        return this.onSwitchOffActions;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Link getLink() {
        return this.link;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsSwitchOn() {
        return this.isSwitchOn;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @k
    public final BeduinSwitcherModel copy(@k String id2, @k String title, @l String subtitle, @l String details, @l Link link, @l Icon icon, @l Boolean isEnabled, boolean isSwitchOn, @l BeduinComponentTheme theme, @l Style style, @l List<? extends BeduinAction> actions, @l List<? extends BeduinAction> onSwitchOnActions, @l List<? extends BeduinAction> onSwitchOffActions, @l DisplayingPredicate displayingPredicate) {
        return new BeduinSwitcherModel(id2, title, subtitle, details, link, icon, isEnabled, isSwitchOn, theme, style, actions, onSwitchOnActions, onSwitchOffActions, displayingPredicate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinSwitcherModel)) {
            return false;
        }
        BeduinSwitcherModel beduinSwitcherModel = (BeduinSwitcherModel) other;
        return L.f(this.id, beduinSwitcherModel.id) && L.f(this.title, beduinSwitcherModel.title) && L.f(this.subtitle, beduinSwitcherModel.subtitle) && L.f(this.details, beduinSwitcherModel.details) && L.f(this.link, beduinSwitcherModel.link) && L.f(this.icon, beduinSwitcherModel.icon) && L.f(this.isEnabled, beduinSwitcherModel.isEnabled) && this.isSwitchOn == beduinSwitcherModel.isSwitchOn && this.theme == beduinSwitcherModel.theme && this.style == beduinSwitcherModel.style && L.f(this.actions, beduinSwitcherModel.actions) && L.f(this.onSwitchOnActions, beduinSwitcherModel.onSwitchOnActions) && L.f(this.onSwitchOffActions, beduinSwitcherModel.onSwitchOffActions) && L.f(this.displayingPredicate, beduinSwitcherModel.displayingPredicate);
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @l
    public final String getDetails() {
        return this.details;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    public DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    public final Icon getIcon() {
        return this.icon;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public String getId() {
        return this.id;
    }

    @l
    public final Link getLink() {
        return this.link;
    }

    @l
    public final List<BeduinAction> getOnSwitchOffActions() {
        return this.onSwitchOffActions;
    }

    @l
    public final List<BeduinAction> getOnSwitchOnActions() {
        return this.onSwitchOnActions;
    }

    @l
    public final Style getStyle() {
        return this.style;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.details;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Link link = this.link;
        int iHashCode3 = (iHashCode2 + (link == null ? 0 : link.hashCode())) * 31;
        Icon icon = this.icon;
        int iHashCode4 = (iHashCode3 + (icon == null ? 0 : icon.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int i12 = r.i((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.isSwitchOn);
        BeduinComponentTheme beduinComponentTheme = this.theme;
        int iHashCode5 = (i12 + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31;
        Style style = this.style;
        int iHashCode6 = (iHashCode5 + (style == null ? 0 : style.hashCode())) * 31;
        List<BeduinAction> list = this.actions;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinAction> list2 = this.onSwitchOnActions;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BeduinAction> list3 = this.onSwitchOffActions;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return iHashCode9 + (displayingPredicate != null ? displayingPredicate.hashCode() : 0);
    }

    @l
    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isSwitchOn() {
        return this.isSwitchOn;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinSwitcherModel(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", details=");
        sb2.append(this.details);
        sb2.append(", link=");
        sb2.append(this.link);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", isSwitchOn=");
        sb2.append(this.isSwitchOn);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", onSwitchOnActions=");
        sb2.append(this.onSwitchOnActions);
        sb2.append(", onSwitchOffActions=");
        sb2.append(this.onSwitchOffActions);
        sb2.append(", displayingPredicate=");
        return AK.c.l(sb2, this.displayingPredicate, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.details);
        Link link = this.link;
        if (link == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            link.writeToParcel(parcel, flags);
        }
        Icon icon = this.icon;
        if (icon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            icon.writeToParcel(parcel, flags);
        }
        Boolean bool = this.isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeInt(this.isSwitchOn ? 1 : 0);
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
        Style style = this.style;
        if (style == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(style.name());
        }
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinAction> list2 = this.onSwitchOnActions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        List<BeduinAction> list3 = this.onSwitchOffActions;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), flags);
            }
        }
        parcel.writeParcelable(this.displayingPredicate, flags);
    }
}
