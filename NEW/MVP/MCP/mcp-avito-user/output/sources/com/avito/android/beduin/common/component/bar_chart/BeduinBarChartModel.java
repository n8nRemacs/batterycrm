package com.avito.android.beduin.common.component.bar_chart;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.bar_chart.column.BarChartColumnItem;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.SelectedIdTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.beduin_shared.model.adapter.BeduinHorizontalIndent;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinBarChartModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017\u0012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010$J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b.\u0010(J\u0010\u0010/\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b/\u00100J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b5\u00104J\u0018\u00106\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b6\u00102Jº\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010$J\u0010\u0010:\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b:\u0010(J\u001a\u0010=\u001a\u00020\n2\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b?\u0010(J \u0010D\u001a\u00020C2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020\bHÖ\u0001¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0006HÂ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0004\bH\u0010IR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u0010$R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010L\u001a\u0004\bM\u0010&R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010NR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010O\u001a\u0004\bP\u0010(R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010QR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010J\u001a\u0004\bR\u0010$R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010S\u001a\u0004\bT\u0010+R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010U\u001a\u0004\bV\u0010-R\u001a\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010O\u001a\u0004\bW\u0010(R\u001a\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010X\u001a\u0004\bY\u00100R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010Z\u001a\u0004\b[\u00102R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\\\u001a\u0004\b]\u00104R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\\\u001a\u0004\b^\u00104R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010Z\u001a\u0004\b_\u00102R\u0011\u0010a\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b`\u0010GR\u0011\u0010d\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006e"}, d2 = {"Lcom/avito/android/beduin/common/component/bar_chart/BeduinBarChartModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "_theme", "", "height", "", "_showFade", "selectedColumnId", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "Lcom/avito/android/beduin_shared/model/adapter/BeduinHorizontalIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "spacingBetweenItems", "Lcom/avito/android/beduin/common/component/bar_chart/BarChartVerticalAxis;", "verticalAxis", "", "Lcom/avito/android/beduin/common/component/bar_chart/column/BarChartColumnItem;", "columns", "Lcom/avito/android/beduin/common/component/bar_chart/BarChartTextSettings;", "columnDetailsSettings", "columnTitleSettings", "Lcom/avito/android/beduin_models/BeduinAction;", "onScrollActions", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;ILjava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin_shared/model/adapter/BeduinHorizontalIndent;ILcom/avito/android/beduin/common/component/bar_chart/BarChartVerticalAxis;Ljava/util/List;Lcom/avito/android/beduin/common/component/bar_chart/BarChartTextSettings;Lcom/avito/android/beduin/common/component/bar_chart/BarChartTextSettings;Ljava/util/List;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component4", "()I", "component6", "component7", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component8", "()Lcom/avito/android/beduin_shared/model/adapter/BeduinHorizontalIndent;", "component9", "component10", "()Lcom/avito/android/beduin/common/component/bar_chart/BarChartVerticalAxis;", "component11", "()Ljava/util/List;", "component12", "()Lcom/avito/android/beduin/common/component/bar_chart/BarChartTextSettings;", "component13", "component14", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;ILjava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin_shared/model/adapter/BeduinHorizontalIndent;ILcom/avito/android/beduin/common/component/bar_chart/BarChartVerticalAxis;Ljava/util/List;Lcom/avito/android/beduin/common/component/bar_chart/BarChartTextSettings;Lcom/avito/android/beduin/common/component/bar_chart/BarChartTextSettings;Ljava/util/List;)Lcom/avito/android/beduin/common/component/bar_chart/BeduinBarChartModel;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component3", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "component5", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "I", "getHeight", "Ljava/lang/Boolean;", "getSelectedColumnId", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getMargin", "Lcom/avito/android/beduin_shared/model/adapter/BeduinHorizontalIndent;", "getPadding", "getSpacingBetweenItems", "Lcom/avito/android/beduin/common/component/bar_chart/BarChartVerticalAxis;", "getVerticalAxis", "Ljava/util/List;", "getColumns", "Lcom/avito/android/beduin/common/component/bar_chart/BarChartTextSettings;", "getColumnDetailsSettings", "getColumnTitleSettings", "getOnScrollActions", "getTheme", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "getShowFade", "()Z", "showFade", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class BeduinBarChartModel extends LeafBeduinModel {

    @Y61.k
    public static final Parcelable.Creator<BeduinBarChartModel> CREATOR = new a();

    @com.google.gson.annotations.c("showFade")
    @Y61.l
    private final Boolean _showFade;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @Y61.l
    private final BeduinComponentTheme _theme;

    @com.google.gson.annotations.c("columnDetailsSettings")
    @Y61.l
    private final BarChartTextSettings columnDetailsSettings;

    @com.google.gson.annotations.c("columnTitleSettings")
    @Y61.l
    private final BarChartTextSettings columnTitleSettings;

    @com.google.gson.annotations.c("columns")
    @Y61.k
    private final List<BarChartColumnItem> columns;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE)
    @Y61.l
    private final DisplayingPredicate displayingPredicate;

    @com.google.gson.annotations.c("height")
    private final int height;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN)
    @Y61.l
    private final BeduinContainerIndent margin;

    @com.google.gson.annotations.c("onScrollActions")
    @Y61.l
    private final List<BeduinAction> onScrollActions;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_PADDING)
    @Y61.l
    private final BeduinHorizontalIndent padding;

    @com.google.gson.annotations.c("selectedColumnId")
    @Y61.l
    private final String selectedColumnId;

    @com.google.gson.annotations.c("spacingBetweenColumns")
    private final int spacingBetweenItems;

    @com.google.gson.annotations.c("verticalAxis")
    @Y61.k
    private final BarChartVerticalAxis verticalAxis;

    /* compiled from: BeduinBarChartModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinBarChartModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinBarChartModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            BarChartTextSettings barChartTextSettings;
            ArrayList arrayList;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinBarChartModel.class.getClassLoader());
            BeduinComponentTheme beduinComponentThemeCreateFromParcel = parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            BeduinContainerIndent beduinContainerIndentCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            BeduinHorizontalIndent beduinHorizontalIndent = (BeduinHorizontalIndent) parcel.readParcelable(BeduinBarChartModel.class.getClassLoader());
            int i13 = parcel.readInt();
            BarChartVerticalAxis barChartVerticalAxisCreateFromParcel = BarChartVerticalAxis.CREATOR.createFromParcel(parcel);
            int i14 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i14);
            int iC2 = 0;
            while (iC2 != i14) {
                iC2 = com.avito.android.actions_sheet.a.c(BarChartColumnItem.CREATOR, parcel, arrayList2, iC2, 1);
                i14 = i14;
            }
            BarChartTextSettings barChartTextSettingsCreateFromParcel = parcel.readInt() == 0 ? null : BarChartTextSettings.CREATOR.createFromParcel(parcel);
            BarChartTextSettings barChartTextSettingsCreateFromParcel2 = parcel.readInt() == 0 ? null : BarChartTextSettings.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                barChartTextSettings = barChartTextSettingsCreateFromParcel;
                arrayList = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i15);
                barChartTextSettings = barChartTextSettingsCreateFromParcel;
                int iL2 = 0;
                while (iL2 != i15) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinBarChartModel.class, parcel, arrayList3, iL2, 1);
                    i15 = i15;
                }
                arrayList = arrayList3;
            }
            return new BeduinBarChartModel(string, displayingPredicate, beduinComponentThemeCreateFromParcel, i12, boolValueOf, string2, beduinContainerIndentCreateFromParcel, beduinHorizontalIndent, i13, barChartVerticalAxisCreateFromParcel, arrayList2, barChartTextSettings, barChartTextSettingsCreateFromParcel2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinBarChartModel[] newArray(int i12) {
            return new BeduinBarChartModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinBarChartModel(@Y61.k String str, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l BeduinComponentTheme beduinComponentTheme, int i12, @Y61.l Boolean bool, @Y61.l String str2, @Y61.l BeduinContainerIndent beduinContainerIndent, @Y61.l BeduinHorizontalIndent beduinHorizontalIndent, int i13, @Y61.k BarChartVerticalAxis barChartVerticalAxis, @Y61.k List<BarChartColumnItem> list, @Y61.l BarChartTextSettings barChartTextSettings, @Y61.l BarChartTextSettings barChartTextSettings2, @Y61.l List<? extends BeduinAction> list2) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this._theme = beduinComponentTheme;
        this.height = i12;
        this._showFade = bool;
        this.selectedColumnId = str2;
        this.margin = beduinContainerIndent;
        this.padding = beduinHorizontalIndent;
        this.spacingBetweenItems = i13;
        this.verticalAxis = barChartVerticalAxis;
        this.columns = list;
        this.columnDetailsSettings = barChartTextSettings;
        this.columnTitleSettings = barChartTextSettings2;
        this.onScrollActions = list2;
    }

    /* renamed from: component3, reason: from getter */
    private final BeduinComponentTheme get_theme() {
        return this._theme;
    }

    /* renamed from: component5, reason: from getter */
    private final Boolean get_showFade() {
        return this._showFade;
    }

    public static /* synthetic */ BeduinBarChartModel copy$default(BeduinBarChartModel beduinBarChartModel, String str, DisplayingPredicate displayingPredicate, BeduinComponentTheme beduinComponentTheme, int i12, Boolean bool, String str2, BeduinContainerIndent beduinContainerIndent, BeduinHorizontalIndent beduinHorizontalIndent, int i13, BarChartVerticalAxis barChartVerticalAxis, List list, BarChartTextSettings barChartTextSettings, BarChartTextSettings barChartTextSettings2, List list2, int i14, Object obj) {
        return beduinBarChartModel.copy((i14 & 1) != 0 ? beduinBarChartModel.id : str, (i14 & 2) != 0 ? beduinBarChartModel.displayingPredicate : displayingPredicate, (i14 & 4) != 0 ? beduinBarChartModel._theme : beduinComponentTheme, (i14 & 8) != 0 ? beduinBarChartModel.height : i12, (i14 & 16) != 0 ? beduinBarChartModel._showFade : bool, (i14 & 32) != 0 ? beduinBarChartModel.selectedColumnId : str2, (i14 & 64) != 0 ? beduinBarChartModel.margin : beduinContainerIndent, (i14 & 128) != 0 ? beduinBarChartModel.padding : beduinHorizontalIndent, (i14 & 256) != 0 ? beduinBarChartModel.spacingBetweenItems : i13, (i14 & 512) != 0 ? beduinBarChartModel.verticalAxis : barChartVerticalAxis, (i14 & 1024) != 0 ? beduinBarChartModel.columns : list, (i14 & 2048) != 0 ? beduinBarChartModel.columnDetailsSettings : barChartTextSettings, (i14 & 4096) != 0 ? beduinBarChartModel.columnTitleSettings : barChartTextSettings2, (i14 & 8192) != 0 ? beduinBarChartModel.onScrollActions : list2);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public BeduinModel apply(@Y61.k BeduinModelTransform transform) {
        if (transform instanceof DisplayPredicateTransform) {
            return copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, 0, null, null, null, null, 0, null, null, null, null, null, 16381, null);
        }
        if (!(transform instanceof SelectedIdTransform)) {
            return this;
        }
        SelectedIdTransform selectedIdTransform = (SelectedIdTransform) transform;
        String selectedId = selectedIdTransform.getSelectedId();
        List<BarChartColumnItem> list = this.columns;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (BarChartColumnItem barChartColumnItem : list) {
            arrayList.add(barChartColumnItem.copy((1023 & 1) != 0 ? barChartColumnItem.stringId : null, (1023 & 2) != 0 ? barChartColumnItem.value : 0.0d, (1023 & 4) != 0 ? barChartColumnItem.width : 0, (1023 & 8) != 0 ? barChartColumnItem.corners : null, (1023 & 16) != 0 ? barChartColumnItem.backgroundColor : null, (1023 & 32) != 0 ? barChartColumnItem.selectedBackgroundColor : null, (1023 & 64) != 0 ? barChartColumnItem.details : null, (1023 & 128) != 0 ? barChartColumnItem.title : null, (1023 & 256) != 0 ? barChartColumnItem.footer : null, (1023 & 512) != 0 ? barChartColumnItem.actions : null, (1023 & 1024) != 0 ? barChartColumnItem._isSelected : Boolean.valueOf(L.f(barChartColumnItem.getF84571b(), selectedIdTransform.getSelectedId()))));
        }
        return copy$default(this, null, null, null, 0, null, selectedId, null, null, 0, null, arrayList, null, null, null, 15327, null);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.k
    /* renamed from: component10, reason: from getter */
    public final BarChartVerticalAxis getVerticalAxis() {
        return this.verticalAxis;
    }

    @Y61.k
    public final List<BarChartColumnItem> component11() {
        return this.columns;
    }

    @Y61.l
    /* renamed from: component12, reason: from getter */
    public final BarChartTextSettings getColumnDetailsSettings() {
        return this.columnDetailsSettings;
    }

    @Y61.l
    /* renamed from: component13, reason: from getter */
    public final BarChartTextSettings getColumnTitleSettings() {
        return this.columnTitleSettings;
    }

    @Y61.l
    public final List<BeduinAction> component14() {
        return this.onScrollActions;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    /* renamed from: component4, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @Y61.l
    /* renamed from: component6, reason: from getter */
    public final String getSelectedColumnId() {
        return this.selectedColumnId;
    }

    @Y61.l
    /* renamed from: component7, reason: from getter */
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @Y61.l
    /* renamed from: component8, reason: from getter */
    public final BeduinHorizontalIndent getPadding() {
        return this.padding;
    }

    /* renamed from: component9, reason: from getter */
    public final int getSpacingBetweenItems() {
        return this.spacingBetweenItems;
    }

    @Y61.k
    public final BeduinBarChartModel copy(@Y61.k String id2, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l BeduinComponentTheme _theme, int height, @Y61.l Boolean _showFade, @Y61.l String selectedColumnId, @Y61.l BeduinContainerIndent margin, @Y61.l BeduinHorizontalIndent padding, int spacingBetweenItems, @Y61.k BarChartVerticalAxis verticalAxis, @Y61.k List<BarChartColumnItem> columns, @Y61.l BarChartTextSettings columnDetailsSettings, @Y61.l BarChartTextSettings columnTitleSettings, @Y61.l List<? extends BeduinAction> onScrollActions) {
        return new BeduinBarChartModel(id2, displayingPredicate, _theme, height, _showFade, selectedColumnId, margin, padding, spacingBetweenItems, verticalAxis, columns, columnDetailsSettings, columnTitleSettings, onScrollActions);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinBarChartModel)) {
            return false;
        }
        BeduinBarChartModel beduinBarChartModel = (BeduinBarChartModel) other;
        return L.f(this.id, beduinBarChartModel.id) && L.f(this.displayingPredicate, beduinBarChartModel.displayingPredicate) && this._theme == beduinBarChartModel._theme && this.height == beduinBarChartModel.height && L.f(this._showFade, beduinBarChartModel._showFade) && L.f(this.selectedColumnId, beduinBarChartModel.selectedColumnId) && L.f(this.margin, beduinBarChartModel.margin) && L.f(this.padding, beduinBarChartModel.padding) && this.spacingBetweenItems == beduinBarChartModel.spacingBetweenItems && L.f(this.verticalAxis, beduinBarChartModel.verticalAxis) && L.f(this.columns, beduinBarChartModel.columns) && L.f(this.columnDetailsSettings, beduinBarChartModel.columnDetailsSettings) && L.f(this.columnTitleSettings, beduinBarChartModel.columnTitleSettings) && L.f(this.onScrollActions, beduinBarChartModel.onScrollActions);
    }

    @Y61.l
    public final BarChartTextSettings getColumnDetailsSettings() {
        return this.columnDetailsSettings;
    }

    @Y61.l
    public final BarChartTextSettings getColumnTitleSettings() {
        return this.columnTitleSettings;
    }

    @Y61.k
    public final List<BarChartColumnItem> getColumns() {
        return this.columns;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF102397d() {
        return this.displayingPredicate;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    /* renamed from: getId */
    public String getF102944b() {
        return this.id;
    }

    @Y61.l
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @Y61.l
    public final List<BeduinAction> getOnScrollActions() {
        return this.onScrollActions;
    }

    @Y61.l
    public final BeduinHorizontalIndent getPadding() {
        return this.padding;
    }

    @Y61.l
    public final String getSelectedColumnId() {
        return this.selectedColumnId;
    }

    public final boolean getShowFade() {
        Boolean bool = this._showFade;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final int getSpacingBetweenItems() {
        return this.spacingBetweenItems;
    }

    @Y61.k
    public final BeduinComponentTheme getTheme() {
        BeduinComponentTheme beduinComponentTheme = this._theme;
        return beduinComponentTheme == null ? BeduinComponentTheme.AVITO_RE_23 : beduinComponentTheme;
    }

    @Y61.k
    public final BarChartVerticalAxis getVerticalAxis() {
        return this.verticalAxis;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this._theme;
        int iE2 = r.e(this.height, (iHashCode2 + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31, 31);
        Boolean bool = this._showFade;
        int iHashCode3 = (iE2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.selectedColumnId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.margin;
        int iHashCode5 = (iHashCode4 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
        BeduinHorizontalIndent beduinHorizontalIndent = this.padding;
        int iE3 = H.e((this.verticalAxis.hashCode() + r.e(this.spacingBetweenItems, (iHashCode5 + (beduinHorizontalIndent == null ? 0 : beduinHorizontalIndent.hashCode())) * 31, 31)) * 31, 31, this.columns);
        BarChartTextSettings barChartTextSettings = this.columnDetailsSettings;
        int iHashCode6 = (iE3 + (barChartTextSettings == null ? 0 : barChartTextSettings.hashCode())) * 31;
        BarChartTextSettings barChartTextSettings2 = this.columnTitleSettings;
        int iHashCode7 = (iHashCode6 + (barChartTextSettings2 == null ? 0 : barChartTextSettings2.hashCode())) * 31;
        List<BeduinAction> list = this.onScrollActions;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinBarChartModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", _theme=");
        sb2.append(this._theme);
        sb2.append(", height=");
        sb2.append(this.height);
        sb2.append(", _showFade=");
        sb2.append(this._showFade);
        sb2.append(", selectedColumnId=");
        sb2.append(this.selectedColumnId);
        sb2.append(", margin=");
        sb2.append(this.margin);
        sb2.append(", padding=");
        sb2.append(this.padding);
        sb2.append(", spacingBetweenItems=");
        sb2.append(this.spacingBetweenItems);
        sb2.append(", verticalAxis=");
        sb2.append(this.verticalAxis);
        sb2.append(", columns=");
        sb2.append(this.columns);
        sb2.append(", columnDetailsSettings=");
        sb2.append(this.columnDetailsSettings);
        sb2.append(", columnTitleSettings=");
        sb2.append(this.columnTitleSettings);
        sb2.append(", onScrollActions=");
        return H.p(sb2, this.onScrollActions, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        BeduinComponentTheme beduinComponentTheme = this._theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.height);
        Boolean bool = this._showFade;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.selectedColumnId);
        BeduinContainerIndent beduinContainerIndent = this.margin;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.padding, flags);
        parcel.writeInt(this.spacingBetweenItems);
        this.verticalAxis.writeToParcel(parcel, flags);
        Iterator itJ = C0.j(this.columns, parcel);
        while (itJ.hasNext()) {
            ((BarChartColumnItem) itJ.next()).writeToParcel(parcel, flags);
        }
        BarChartTextSettings barChartTextSettings = this.columnDetailsSettings;
        if (barChartTextSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            barChartTextSettings.writeToParcel(parcel, flags);
        }
        BarChartTextSettings barChartTextSettings2 = this.columnTitleSettings;
        if (barChartTextSettings2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            barChartTextSettings2.writeToParcel(parcel, flags);
        }
        List<BeduinAction> list = this.onScrollActions;
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
