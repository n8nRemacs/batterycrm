package com.avito.android.beduin.common.component.selector_card_group;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.component.selector_card_group.SelectorCardGroupTransform;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.ErrorMessageTransform;
import com.avito.android.beduin.common.form.transforms.SelectedIdsTransform;
import com.avito.android.beduin.common.form.transforms.SelectorCardGroupSelectedIdTransform;
import com.avito.android.beduin.common.utils.C28809e;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.UniversalColor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: BeduinSelectorCardGroupModel.kt */
@K51.d
@s0
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0004:;<=B³\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\n\u0010*\u0012\u0004\b+\u0010,R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b.\u0010/R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b0\u0010/R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0010\u0010!\u0012\u0004\b1\u0010,R\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010-R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u00102R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b3\u0010#R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u00104R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u00105R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u00106R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00107\u001a\u0004\b8\u00109¨\u0006>"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lcom/avito/android/beduin/common/component/q;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "", "_verticalItemSpacing", "", "Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel$Option;", "options", "Lcom/avito/android/beduin_models/BeduinAction;", "onSelectChangedActions", "_selectedId", "_selectedIds", "", "_isRequired", "errorMessage", "Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel$SelectionType;", "_selectionType", "Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel$SelectionDisplayType;", "_selectionDisplayType", "Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel$LayoutSettings;", "_layoutSettings", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "showErrorToast", "isValidationError", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel$SelectionType;Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel$SelectionDisplayType;Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel$LayoutSettings;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;ZZ)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "g", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "Ljava/lang/Double;", "get_verticalItemSpacing$annotations", "()V", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "get_selectedId$annotations", "Ljava/lang/Boolean;", "c", "Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel$SelectionType;", "Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel$SelectionDisplayType;", "Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel$LayoutSettings;", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "k", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "LayoutSettings", "Option", "SelectionDisplayType", "SelectionType", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinSelectorCardGroupModel implements BeduinModel, com.avito.android.beduin.common.component.q {

    @Y61.k
    public static final Parcelable.Creator<BeduinSelectorCardGroupModel> CREATOR = new a();

    @com.google.gson.annotations.c("isRequired")
    @Y61.l
    private final Boolean _isRequired;

    @com.google.gson.annotations.c("layoutSettings")
    @Y61.l
    private final LayoutSettings _layoutSettings;

    @com.google.gson.annotations.c("selectedId")
    @Y61.l
    private final String _selectedId;

    @com.google.gson.annotations.c("selectedIds")
    @Y61.l
    private final List<String> _selectedIds;

    @com.google.gson.annotations.c("selectionDisplayType")
    @Y61.l
    private final SelectionDisplayType _selectionDisplayType;

    @com.google.gson.annotations.c("selectionType")
    @Y61.l
    private final SelectionType _selectionType;

    @com.google.gson.annotations.c("verticalItemSpacing")
    @Y61.l
    private final Double _verticalItemSpacing;

    /* renamed from: b, reason: collision with root package name */
    public final transient boolean f102519b;

    /* renamed from: c, reason: collision with root package name */
    public final transient boolean f102520c;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE)
    @Y61.l
    private final DisplayingPredicate displayingPredicate;

    @com.google.gson.annotations.c("errorMessage")
    @Y61.l
    private final String errorMessage;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("onSelectChangedActions")
    @Y61.l
    private final List<BeduinAction> onSelectChangedActions;

    @com.google.gson.annotations.c("options")
    @Y61.k
    private final List<Option> options;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_PADDING)
    @Y61.l
    private final BeduinContainerIndent padding;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @Y61.l
    private final BeduinComponentTheme theme;

    /* compiled from: BeduinSelectorCardGroupModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u0012\u0004\b\u0017\u0010\u0018R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0019\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel$LayoutSettings;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel$LayoutSettings$LastRowAlignment;", "_lastRowAlignment", "", "_elementsPerRow", "", "verticalItemSpacing", "horizontalItemSpacing", "_borderWidth", "_cornerRadius", "Lcom/avito/android/remote/model/UniversalColor;", "backgroundColor", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "<init>", "(Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel$LayoutSettings$LastRowAlignment;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;)V", "Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel$LayoutSettings$LastRowAlignment;", "Ljava/lang/Integer;", "Ljava/lang/Double;", "i", "()Ljava/lang/Double;", "g", "get_cornerRadius$annotations", "()V", "Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getBackgroundColor$annotations", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "c", "()Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "LastRowAlignment", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class LayoutSettings implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<LayoutSettings> CREATOR = new a();

        @com.google.gson.annotations.c("borderWidth")
        @Y61.l
        private final Double _borderWidth;

        @com.google.gson.annotations.c("cornerRadius")
        @Y61.l
        private final Double _cornerRadius;

        @com.google.gson.annotations.c("elementsPerRow")
        @Y61.l
        private final Integer _elementsPerRow;

        @com.google.gson.annotations.c("lastRowAlignment")
        @Y61.l
        private final LastRowAlignment _lastRowAlignment;

        @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
        @Y61.l
        private final BeduinContainerBackground background;

        @com.google.gson.annotations.c("backgroundColor")
        @Y61.l
        private final UniversalColor backgroundColor;

        @com.google.gson.annotations.c("horizontalItemSpacing")
        @Y61.l
        private final Double horizontalItemSpacing;

        @com.google.gson.annotations.c("verticalItemSpacing")
        @Y61.l
        private final Double verticalItemSpacing;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: BeduinSelectorCardGroupModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel$LayoutSettings$LastRowAlignment;", "", "(Ljava/lang/String;I)V", "Left", "Center", "Right", "Stretch", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class LastRowAlignment {

            @com.google.gson.annotations.c("center")
            public static final LastRowAlignment Center;

            @com.google.gson.annotations.c("left")
            public static final LastRowAlignment Left;

            @com.google.gson.annotations.c("right")
            public static final LastRowAlignment Right;

            @com.google.gson.annotations.c("stretch")
            public static final LastRowAlignment Stretch;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ LastRowAlignment[] f102522b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f102523c;

            static {
                LastRowAlignment lastRowAlignment = new LastRowAlignment("Left", 0);
                Left = lastRowAlignment;
                LastRowAlignment lastRowAlignment2 = new LastRowAlignment("Center", 1);
                Center = lastRowAlignment2;
                LastRowAlignment lastRowAlignment3 = new LastRowAlignment("Right", 2);
                Right = lastRowAlignment3;
                LastRowAlignment lastRowAlignment4 = new LastRowAlignment("Stretch", 3);
                Stretch = lastRowAlignment4;
                LastRowAlignment[] lastRowAlignmentArr = {lastRowAlignment, lastRowAlignment2, lastRowAlignment3, lastRowAlignment4};
                f102522b = lastRowAlignmentArr;
                f102523c = kotlin.enums.c.a(lastRowAlignmentArr);
            }

            private LastRowAlignment(String str, int i12) {
            }

            public static LastRowAlignment valueOf(String str) {
                return (LastRowAlignment) Enum.valueOf(LastRowAlignment.class, str);
            }

            public static LastRowAlignment[] values() {
                return (LastRowAlignment[]) f102522b.clone();
            }
        }

        /* compiled from: BeduinSelectorCardGroupModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LayoutSettings> {
            @Override // android.os.Parcelable.Creator
            public final LayoutSettings createFromParcel(Parcel parcel) {
                return new LayoutSettings(parcel.readInt() == 0 ? null : LastRowAlignment.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), (UniversalColor) parcel.readParcelable(LayoutSettings.class.getClassLoader()), parcel.readInt() != 0 ? BeduinContainerBackground.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final LayoutSettings[] newArray(int i12) {
                return new LayoutSettings[i12];
            }
        }

        public LayoutSettings(@Y61.l LastRowAlignment lastRowAlignment, @Y61.l Integer num, @Y61.l Double d12, @Y61.l Double d13, @Y61.l Double d14, @Y61.l Double d15, @Y61.l UniversalColor universalColor, @Y61.l BeduinContainerBackground beduinContainerBackground) {
            this._lastRowAlignment = lastRowAlignment;
            this._elementsPerRow = num;
            this.verticalItemSpacing = d12;
            this.horizontalItemSpacing = d13;
            this._borderWidth = d14;
            this._cornerRadius = d15;
            this.backgroundColor = universalColor;
            this.background = beduinContainerBackground;
        }

        public static LayoutSettings a(LayoutSettings layoutSettings, Double d12) {
            return new LayoutSettings(layoutSettings._lastRowAlignment, layoutSettings._elementsPerRow, d12, layoutSettings.horizontalItemSpacing, layoutSettings._borderWidth, layoutSettings._cornerRadius, layoutSettings.backgroundColor, layoutSettings.background);
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final BeduinContainerBackground getBackground() {
            return this.background;
        }

        public final double d() {
            Double d12 = this._borderWidth;
            if (d12 != null) {
                return d12.doubleValue();
            }
            return 2.0d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final double e() {
            Double d12 = this._cornerRadius;
            if (d12 != null) {
                return d12.doubleValue();
            }
            return 6.0d;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LayoutSettings)) {
                return false;
            }
            LayoutSettings layoutSettings = (LayoutSettings) obj;
            return this._lastRowAlignment == layoutSettings._lastRowAlignment && L.f(this._elementsPerRow, layoutSettings._elementsPerRow) && L.f(this.verticalItemSpacing, layoutSettings.verticalItemSpacing) && L.f(this.horizontalItemSpacing, layoutSettings.horizontalItemSpacing) && L.f(this._borderWidth, layoutSettings._borderWidth) && L.f(this._cornerRadius, layoutSettings._cornerRadius) && L.f(this.backgroundColor, layoutSettings.backgroundColor) && L.f(this.background, layoutSettings.background);
        }

        public final int f() {
            Integer num = this._elementsPerRow;
            if (num != null) {
                return num.intValue();
            }
            return 1;
        }

        @Y61.l
        /* renamed from: g, reason: from getter */
        public final Double getHorizontalItemSpacing() {
            return this.horizontalItemSpacing;
        }

        @Y61.l
        public final UniversalColor getBackgroundColor() {
            return this.backgroundColor;
        }

        @Y61.k
        public final LastRowAlignment h() {
            LastRowAlignment lastRowAlignment = this._lastRowAlignment;
            return lastRowAlignment == null ? LastRowAlignment.Left : lastRowAlignment;
        }

        public final int hashCode() {
            LastRowAlignment lastRowAlignment = this._lastRowAlignment;
            int iHashCode = (lastRowAlignment == null ? 0 : lastRowAlignment.hashCode()) * 31;
            Integer num = this._elementsPerRow;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Double d12 = this.verticalItemSpacing;
            int iHashCode3 = (iHashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
            Double d13 = this.horizontalItemSpacing;
            int iHashCode4 = (iHashCode3 + (d13 == null ? 0 : d13.hashCode())) * 31;
            Double d14 = this._borderWidth;
            int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this._cornerRadius;
            int iHashCode6 = (iHashCode5 + (d15 == null ? 0 : d15.hashCode())) * 31;
            UniversalColor universalColor = this.backgroundColor;
            int iHashCode7 = (iHashCode6 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            BeduinContainerBackground beduinContainerBackground = this.background;
            return iHashCode7 + (beduinContainerBackground != null ? beduinContainerBackground.hashCode() : 0);
        }

        @Y61.l
        /* renamed from: i, reason: from getter */
        public final Double getVerticalItemSpacing() {
            return this.verticalItemSpacing;
        }

        @Y61.k
        public final String toString() {
            return "LayoutSettings(_lastRowAlignment=" + this._lastRowAlignment + ", _elementsPerRow=" + this._elementsPerRow + ", verticalItemSpacing=" + this.verticalItemSpacing + ", horizontalItemSpacing=" + this.horizontalItemSpacing + ", _borderWidth=" + this._borderWidth + ", _cornerRadius=" + this._cornerRadius + ", backgroundColor=" + this.backgroundColor + ", background=" + this.background + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            LastRowAlignment lastRowAlignment = this._lastRowAlignment;
            if (lastRowAlignment == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(lastRowAlignment.name());
            }
            Integer num = this._elementsPerRow;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            Double d12 = this.verticalItemSpacing;
            if (d12 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
            }
            Double d13 = this.horizontalItemSpacing;
            if (d13 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d13);
            }
            Double d14 = this._borderWidth;
            if (d14 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d14);
            }
            Double d15 = this._cornerRadius;
            if (d15 == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d15);
            }
            parcel.writeParcelable(this.backgroundColor, i12);
            BeduinContainerBackground beduinContainerBackground = this.background;
            if (beduinContainerBackground == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                beduinContainerBackground.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: BeduinSelectorCardGroupModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel$Option;", "Landroid/os/Parcelable;", "", "id", "", "_isEnabled", "", "Lcom/avito/android/beduin_models/BeduinModel;", "components", "Lcom/avito/android/beduin_models/BeduinAction;", "onSelectActions", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "d", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "c", "()Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Option implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Option> CREATOR = new a();

        @com.google.gson.annotations.c("isEnabled")
        @Y61.l
        private final Boolean _isEnabled;

        @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
        @Y61.l
        private final BeduinContainerBackground background;

        @com.google.gson.annotations.c("components")
        @Y61.k
        private final List<BeduinModel> components;

        @com.google.gson.annotations.c("id")
        @Y61.k
        private final String id;

        @com.google.gson.annotations.c("onSelectActions")
        @Y61.l
        private final List<BeduinAction> onSelectActions;

        /* compiled from: BeduinSelectorCardGroupModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Option> {
            @Override // android.os.Parcelable.Creator
            public final Option createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                ArrayList arrayList;
                String string = parcel.readString();
                int iL2 = 0;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(Option.class, parcel, arrayList2, iL3, 1);
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i13 = parcel.readInt();
                    arrayList = new ArrayList(i13);
                    while (iL2 != i13) {
                        iL2 = com.avito.android.actions_sheet.a.l(Option.class, parcel, arrayList, iL2, 1);
                    }
                }
                return new Option(string, boolValueOf, arrayList2, arrayList, parcel.readInt() != 0 ? BeduinContainerBackground.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Option[] newArray(int i12) {
                return new Option[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Option(@Y61.k String str, @Y61.l Boolean bool, @Y61.k List<? extends BeduinModel> list, @Y61.l List<? extends BeduinAction> list2, @Y61.l BeduinContainerBackground beduinContainerBackground) {
            this.id = str;
            this._isEnabled = bool;
            this.components = list;
            this.onSelectActions = list2;
            this.background = beduinContainerBackground;
        }

        public static Option a(Option option, List list) {
            String str = option.id;
            Boolean bool = option._isEnabled;
            List<BeduinAction> list2 = option.onSelectActions;
            BeduinContainerBackground beduinContainerBackground = option.background;
            option.getClass();
            return new Option(str, bool, list, list2, beduinContainerBackground);
        }

        @Y61.l
        /* renamed from: c, reason: from getter */
        public final BeduinContainerBackground getBackground() {
            return this.background;
        }

        @Y61.l
        public final List<BeduinAction> d() {
            return this.onSelectActions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean e() {
            Boolean bool = this._isEnabled;
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return L.f(this.id, option.id) && L.f(this._isEnabled, option._isEnabled) && L.f(this.components, option.components) && L.f(this.onSelectActions, option.onSelectActions) && L.f(this.background, option.background);
        }

        @Y61.k
        public final List<BeduinModel> getComponents() {
            return this.components;
        }

        @Y61.k
        public final String getId() {
            return this.id;
        }

        public final int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            Boolean bool = this._isEnabled;
            int iE2 = H.e((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.components);
            List<BeduinAction> list = this.onSelectActions;
            int iHashCode2 = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
            BeduinContainerBackground beduinContainerBackground = this.background;
            return iHashCode2 + (beduinContainerBackground != null ? beduinContainerBackground.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "Option(id=" + this.id + ", _isEnabled=" + this._isEnabled + ", components=" + this.components + ", onSelectActions=" + this.onSelectActions + ", background=" + this.background + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.id);
            Boolean bool = this._isEnabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            Iterator itJ = C0.j(this.components, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), i12);
            }
            List<BeduinAction> list = this.onSelectActions;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    parcel.writeParcelable((Parcelable) itA.next(), i12);
                }
            }
            BeduinContainerBackground beduinContainerBackground = this.background;
            if (beduinContainerBackground == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                beduinContainerBackground.writeToParcel(parcel, i12);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinSelectorCardGroupModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel$SelectionDisplayType;", "", "(Ljava/lang/String;I)V", "Border", "Mark", "BorderAndMark", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SelectionDisplayType {

        @com.google.gson.annotations.c("border")
        public static final SelectionDisplayType Border;

        @com.google.gson.annotations.c("borderAndMark")
        public static final SelectionDisplayType BorderAndMark;

        @com.google.gson.annotations.c("mark")
        public static final SelectionDisplayType Mark;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SelectionDisplayType[] f102525b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f102526c;

        static {
            SelectionDisplayType selectionDisplayType = new SelectionDisplayType("Border", 0);
            Border = selectionDisplayType;
            SelectionDisplayType selectionDisplayType2 = new SelectionDisplayType("Mark", 1);
            Mark = selectionDisplayType2;
            SelectionDisplayType selectionDisplayType3 = new SelectionDisplayType("BorderAndMark", 2);
            BorderAndMark = selectionDisplayType3;
            SelectionDisplayType[] selectionDisplayTypeArr = {selectionDisplayType, selectionDisplayType2, selectionDisplayType3};
            f102525b = selectionDisplayTypeArr;
            f102526c = kotlin.enums.c.a(selectionDisplayTypeArr);
        }

        private SelectionDisplayType(String str, int i12) {
        }

        public static SelectionDisplayType valueOf(String str) {
            return (SelectionDisplayType) Enum.valueOf(SelectionDisplayType.class, str);
        }

        public static SelectionDisplayType[] values() {
            return (SelectionDisplayType[]) f102525b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinSelectorCardGroupModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/BeduinSelectorCardGroupModel$SelectionType;", "", "(Ljava/lang/String;I)V", "Single", "Multiple", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SelectionType {

        @com.google.gson.annotations.c("multiple")
        public static final SelectionType Multiple;

        @com.google.gson.annotations.c("single")
        public static final SelectionType Single;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ SelectionType[] f102527b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f102528c;

        static {
            SelectionType selectionType = new SelectionType("Single", 0);
            Single = selectionType;
            SelectionType selectionType2 = new SelectionType("Multiple", 1);
            Multiple = selectionType2;
            SelectionType[] selectionTypeArr = {selectionType, selectionType2};
            f102527b = selectionTypeArr;
            f102528c = kotlin.enums.c.a(selectionTypeArr);
        }

        private SelectionType(String str, int i12) {
        }

        public static SelectionType valueOf(String str) {
            return (SelectionType) Enum.valueOf(SelectionType.class, str);
        }

        public static SelectionType[] values() {
            return (SelectionType[]) f102527b.clone();
        }
    }

    /* compiled from: BeduinSelectorCardGroupModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinSelectorCardGroupModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSelectorCardGroupModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinSelectorCardGroupModel.class.getClassLoader());
            BeduinContainerIndent beduinContainerIndentCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Option.CREATOR, parcel, arrayList2, iC2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinSelectorCardGroupModel.class, parcel, arrayList, iL2, 1);
                }
            }
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinSelectorCardGroupModel(string, displayingPredicate, beduinContainerIndentCreateFromParcel, dValueOf, arrayList2, arrayList, string2, arrayListCreateStringArrayList, boolValueOf, parcel.readString(), parcel.readInt() == 0 ? null : SelectionType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : SelectionDisplayType.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : LayoutSettings.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BeduinComponentTheme.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSelectorCardGroupModel[] newArray(int i12) {
            return new BeduinSelectorCardGroupModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinSelectorCardGroupModel(@Y61.k String str, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l BeduinContainerIndent beduinContainerIndent, @Y61.l Double d12, @Y61.k List<Option> list, @Y61.l List<? extends BeduinAction> list2, @Y61.l String str2, @Y61.l List<String> list3, @Y61.l Boolean bool, @Y61.l String str3, @Y61.l SelectionType selectionType, @Y61.l SelectionDisplayType selectionDisplayType, @Y61.l LayoutSettings layoutSettings, @Y61.l BeduinComponentTheme beduinComponentTheme, boolean z12, boolean z13) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.padding = beduinContainerIndent;
        this._verticalItemSpacing = d12;
        this.options = list;
        this.onSelectChangedActions = list2;
        this._selectedId = str2;
        this._selectedIds = list3;
        this._isRequired = bool;
        this.errorMessage = str3;
        this._selectionType = selectionType;
        this._selectionDisplayType = selectionDisplayType;
        this._layoutSettings = layoutSettings;
        this.theme = beduinComponentTheme;
        this.f102519b = z12;
        this.f102520c = z13;
    }

    public static BeduinSelectorCardGroupModel a(BeduinSelectorCardGroupModel beduinSelectorCardGroupModel, DisplayingPredicate displayingPredicate, ArrayList arrayList, List list, String str, boolean z12, boolean z13, int i12) {
        String str2 = beduinSelectorCardGroupModel.id;
        DisplayingPredicate displayingPredicate2 = (i12 & 2) != 0 ? beduinSelectorCardGroupModel.displayingPredicate : displayingPredicate;
        BeduinContainerIndent beduinContainerIndent = beduinSelectorCardGroupModel.padding;
        Double d12 = beduinSelectorCardGroupModel._verticalItemSpacing;
        List<Option> list2 = (i12 & 16) != 0 ? beduinSelectorCardGroupModel.options : arrayList;
        List<BeduinAction> list3 = beduinSelectorCardGroupModel.onSelectChangedActions;
        String str3 = (i12 & 64) != 0 ? beduinSelectorCardGroupModel._selectedId : null;
        List list4 = (i12 & 128) != 0 ? beduinSelectorCardGroupModel._selectedIds : list;
        Boolean bool = beduinSelectorCardGroupModel._isRequired;
        String str4 = (i12 & 512) != 0 ? beduinSelectorCardGroupModel.errorMessage : str;
        SelectionType selectionType = beduinSelectorCardGroupModel._selectionType;
        SelectionDisplayType selectionDisplayType = beduinSelectorCardGroupModel._selectionDisplayType;
        LayoutSettings layoutSettings = beduinSelectorCardGroupModel._layoutSettings;
        BeduinComponentTheme beduinComponentTheme = beduinSelectorCardGroupModel.theme;
        boolean z14 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? beduinSelectorCardGroupModel.f102519b : z12;
        boolean z15 = (i12 & 32768) != 0 ? beduinSelectorCardGroupModel.f102520c : z13;
        beduinSelectorCardGroupModel.getClass();
        return new BeduinSelectorCardGroupModel(str2, displayingPredicate2, beduinContainerIndent, d12, list2, list3, str3, list4, bool, str4, selectionType, selectionDisplayType, layoutSettings, beduinComponentTheme, z14, z15);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public final BeduinModel apply(@Y61.k BeduinModelTransform beduinModelTransform) {
        return beduinModelTransform instanceof DisplayPredicateTransform ? a(this, ((DisplayPredicateTransform) beduinModelTransform).getDisplayingPredicate(), null, null, null, false, false, 65533) : beduinModelTransform instanceof SelectorCardGroupSelectedIdTransform ? a(this, null, null, Collections.singletonList(((SelectorCardGroupSelectedIdTransform) beduinModelTransform).getNewSelectedId()), null, false, false, 65407) : beduinModelTransform instanceof SelectedIdsTransform ? a(this, null, null, ((SelectedIdsTransform) beduinModelTransform).getSelectedIds(), null, false, false, 65407) : beduinModelTransform instanceof ErrorMessageTransform ? a(this, null, null, null, ((ErrorMessageTransform) beduinModelTransform).getErrorMessage(), false, false, 65023) : beduinModelTransform instanceof SelectorCardGroupTransform.ErrorState ? a(this, null, null, null, null, false, ((SelectorCardGroupTransform.ErrorState) beduinModelTransform).f102529b, 32767) : this;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Y61.k
    public final LayoutSettings d() {
        Double d12;
        LayoutSettings layoutSettings = this._layoutSettings;
        if (layoutSettings == null) {
            layoutSettings = new LayoutSettings(null, null, null, null, null, null, null, null);
        }
        return (layoutSettings.getVerticalItemSpacing() != null || (d12 = this._verticalItemSpacing) == null) ? layoutSettings : LayoutSettings.a(layoutSettings, d12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Y61.l
    public final List<BeduinAction> e() {
        return this.onSelectChangedActions;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinSelectorCardGroupModel)) {
            return false;
        }
        BeduinSelectorCardGroupModel beduinSelectorCardGroupModel = (BeduinSelectorCardGroupModel) obj;
        return L.f(this.id, beduinSelectorCardGroupModel.id) && L.f(this.displayingPredicate, beduinSelectorCardGroupModel.displayingPredicate) && L.f(this.padding, beduinSelectorCardGroupModel.padding) && L.f(this._verticalItemSpacing, beduinSelectorCardGroupModel._verticalItemSpacing) && L.f(this.options, beduinSelectorCardGroupModel.options) && L.f(this.onSelectChangedActions, beduinSelectorCardGroupModel.onSelectChangedActions) && L.f(this._selectedId, beduinSelectorCardGroupModel._selectedId) && L.f(this._selectedIds, beduinSelectorCardGroupModel._selectedIds) && L.f(this._isRequired, beduinSelectorCardGroupModel._isRequired) && L.f(this.errorMessage, beduinSelectorCardGroupModel.errorMessage) && this._selectionType == beduinSelectorCardGroupModel._selectionType && this._selectionDisplayType == beduinSelectorCardGroupModel._selectionDisplayType && L.f(this._layoutSettings, beduinSelectorCardGroupModel._layoutSettings) && this.theme == beduinSelectorCardGroupModel.theme && this.f102519b == beduinSelectorCardGroupModel.f102519b && this.f102520c == beduinSelectorCardGroupModel.f102520c;
    }

    @Y61.k
    public final List<Option> f() {
        return this.options;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public final List<BeduinModel> flatMap(@Y61.k Y41.l<? super BeduinModel, ? extends List<? extends BeduinModel>> lVar) {
        List<Option> list = this.options;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (Option option : list) {
            arrayList.add(Option.a(option, C28809e.c(lVar, option.getComponents())));
        }
        return (List) lVar.invoke(a(this, null, arrayList, null, null, false, false, 65519));
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public final void forEach(@Y61.k Y41.l<? super BeduinModel, Boolean> lVar) {
        if (lVar.invoke(this).booleanValue()) {
            return;
        }
        Iterator<T> it = this.options.iterator();
        while (it.hasNext()) {
            C28809e.e(lVar, ((Option) it.next()).getComponents());
        }
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.l
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public final String getId() {
        return this.id;
    }

    @Y61.k
    public final List<String> h() {
        List<String> list = this._selectedIds;
        return list == null ? C42745f0.V(this._selectedId) : list;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.padding;
        int iHashCode3 = (iHashCode2 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
        Double d12 = this._verticalItemSpacing;
        int iE2 = H.e((iHashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31, 31, this.options);
        List<BeduinAction> list = this.onSelectChangedActions;
        int iHashCode4 = (iE2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this._selectedId;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list2 = this._selectedIds;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this._isRequired;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.errorMessage;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SelectionType selectionType = this._selectionType;
        int iHashCode9 = (iHashCode8 + (selectionType == null ? 0 : selectionType.hashCode())) * 31;
        SelectionDisplayType selectionDisplayType = this._selectionDisplayType;
        int iHashCode10 = (iHashCode9 + (selectionDisplayType == null ? 0 : selectionDisplayType.hashCode())) * 31;
        LayoutSettings layoutSettings = this._layoutSettings;
        int iHashCode11 = (iHashCode10 + (layoutSettings == null ? 0 : layoutSettings.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        return Boolean.hashCode(this.f102520c) + androidx.appcompat.app.r.i((iHashCode11 + (beduinComponentTheme != null ? beduinComponentTheme.hashCode() : 0)) * 31, 31, this.f102519b);
    }

    @Y61.k
    public final SelectionDisplayType i() {
        SelectionDisplayType selectionDisplayType = this._selectionDisplayType;
        return selectionDisplayType == null ? SelectionDisplayType.BorderAndMark : selectionDisplayType;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public final boolean isValid() {
        Boolean bool = this._isRequired;
        return ((bool != null ? bool.booleanValue() : true) && h().isEmpty()) ? false : true;
    }

    @Y61.k
    public final SelectionType j() {
        SelectionType selectionType = this._selectionType;
        return selectionType == null ? SelectionType.Single : selectionType;
    }

    @Y61.l
    /* renamed from: k, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinSelectorCardGroupModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", padding=");
        sb2.append(this.padding);
        sb2.append(", _verticalItemSpacing=");
        sb2.append(this._verticalItemSpacing);
        sb2.append(", options=");
        sb2.append(this.options);
        sb2.append(", onSelectChangedActions=");
        sb2.append(this.onSelectChangedActions);
        sb2.append(", _selectedId=");
        sb2.append(this._selectedId);
        sb2.append(", _selectedIds=");
        sb2.append(this._selectedIds);
        sb2.append(", _isRequired=");
        sb2.append(this._isRequired);
        sb2.append(", errorMessage=");
        sb2.append(this.errorMessage);
        sb2.append(", _selectionType=");
        sb2.append(this._selectionType);
        sb2.append(", _selectionDisplayType=");
        sb2.append(this._selectionDisplayType);
        sb2.append(", _layoutSettings=");
        sb2.append(this._layoutSettings);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", showErrorToast=");
        sb2.append(this.f102519b);
        sb2.append(", isValidationError=");
        return androidx.appcompat.app.r.x(sb2, this.f102520c, ')');
    }

    @Override // com.avito.android.beduin.common.component.q
    @Y61.k
    public final BeduinModel validateModelByConstraints() {
        return a(this, null, null, null, null, !isValid(), !isValid(), 16383);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, i12);
        BeduinContainerIndent beduinContainerIndent = this.padding;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, i12);
        }
        Double d12 = this._verticalItemSpacing;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
        }
        Iterator itJ = C0.j(this.options, parcel);
        while (itJ.hasNext()) {
            ((Option) itJ.next()).writeToParcel(parcel, i12);
        }
        List<BeduinAction> list = this.onSelectChangedActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeString(this._selectedId);
        parcel.writeStringList(this._selectedIds);
        Boolean bool = this._isRequired;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.errorMessage);
        SelectionType selectionType = this._selectionType;
        if (selectionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(selectionType.name());
        }
        SelectionDisplayType selectionDisplayType = this._selectionDisplayType;
        if (selectionDisplayType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(selectionDisplayType.name());
        }
        LayoutSettings layoutSettings = this._layoutSettings;
        if (layoutSettings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            layoutSettings.writeToParcel(parcel, i12);
        }
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f102519b ? 1 : 0);
        parcel.writeInt(this.f102520c ? 1 : 0);
    }

    public /* synthetic */ BeduinSelectorCardGroupModel(String str, DisplayingPredicate displayingPredicate, BeduinContainerIndent beduinContainerIndent, Double d12, List list, List list2, String str2, List list3, Boolean bool, String str3, SelectionType selectionType, SelectionDisplayType selectionDisplayType, LayoutSettings layoutSettings, BeduinComponentTheme beduinComponentTheme, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, displayingPredicate, beduinContainerIndent, d12, list, list2, str2, list3, bool, str3, selectionType, selectionDisplayType, layoutSettings, beduinComponentTheme, z12, (i12 & 32768) != 0 ? false : z13);
    }
}
