package com.avito.android.beduin.common.component.item_color_picker;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.q;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.SelectedIdsTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.FontStyleKt;
import com.avito.android.util.O2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: BeduinItemColorPickerModel.kt */
@K51.d
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0007:;<=>?@B\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\r\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b\n\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b+\u0010\u001fR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00102\u001a\u0004\b3\u00104R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010,\u001a\u0004\b5\u0010.R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010,\u001a\u0004\b6\u0010.R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00107\u001a\u0004\b8\u00109¨\u0006A"}, d2 = {"Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "Lcom/avito/android/beduin/common/component/q;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "", "isRequired", "_isEnabled", "errorMessage", "", "_selectedIds", "Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$ItemColorSelectionType;", "_selectionType", "Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$ItemColorDisplayType;", "displayType", "Lcom/avito/android/beduin_models/BeduinAction;", "onSelectChangedActions", "Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$ItemColorPickerOption;", "options", "Lcom/avito/android/remote/model/UniversalColor;", "selectionStrokeColor", "Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$ItemColorErrorDisplayMode;", "errorDisplayMode", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$ItemColorSelectionType;Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$ItemColorDisplayType;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$ItemColorErrorDisplayMode;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "Z", "()Z", "Ljava/lang/Boolean;", "get_isEnabled", "()Ljava/lang/Boolean;", "getErrorMessage", "Ljava/util/List;", "get_selectedIds", "()Ljava/util/List;", "Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$ItemColorSelectionType;", "get_selectionType", "()Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$ItemColorSelectionType;", "Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$ItemColorDisplayType;", "c", "()Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$ItemColorDisplayType;", "d", "getOptions", "Lcom/avito/android/remote/model/UniversalColor;", "f", "()Lcom/avito/android/remote/model/UniversalColor;", "BlendingState", "Color", "GradientColor", "ItemColorDisplayType", "ItemColorErrorDisplayMode", "ItemColorPickerOption", "ItemColorSelectionType", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinItemColorPickerModel extends LeafBeduinModel implements q {

    @k
    public static final Parcelable.Creator<BeduinItemColorPickerModel> CREATOR = new a();

    @com.google.gson.annotations.c("isEnabled")
    @l
    private final Boolean _isEnabled;

    @com.google.gson.annotations.c("selectedIds")
    @l
    private final List<String> _selectedIds;

    @com.google.gson.annotations.c("selectionType")
    @l
    private final ItemColorSelectionType _selectionType;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final transient ItemColorErrorDisplayMode f101599b;

    @com.google.gson.annotations.c("displayType")
    @l
    private final ItemColorDisplayType displayType;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE)
    @l
    private final DisplayingPredicate displayingPredicate;

    @com.google.gson.annotations.c("errorMessage")
    @l
    private final String errorMessage;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("isRequired")
    private final boolean isRequired;

    @com.google.gson.annotations.c("onSelectChangedActions")
    @k
    private final List<BeduinAction> onSelectChangedActions;

    @com.google.gson.annotations.c("options")
    @l
    private final List<ItemColorPickerOption> options;

    @com.google.gson.annotations.c("selectionStrokeColor")
    @l
    private final UniversalColor selectionStrokeColor;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @l
    private final BeduinComponentTheme theme;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinItemColorPickerModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$BlendingState;", "", "(Ljava/lang/String;I)V", "DARK", "LIGHT", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BlendingState {

        @com.google.gson.annotations.c("dark")
        public static final BlendingState DARK;

        @com.google.gson.annotations.c(FontStyleKt.LIGHT)
        public static final BlendingState LIGHT;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ BlendingState[] f101601b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f101602c;

        static {
            BlendingState blendingState = new BlendingState("DARK", 0);
            DARK = blendingState;
            BlendingState blendingState2 = new BlendingState("LIGHT", 1);
            LIGHT = blendingState2;
            BlendingState[] blendingStateArr = {blendingState, blendingState2};
            f101601b = blendingStateArr;
            f101602c = kotlin.enums.c.a(blendingStateArr);
        }

        private BlendingState(String str, int i12) {
        }

        public static BlendingState valueOf(String str) {
            return (BlendingState) Enum.valueOf(BlendingState.class, str);
        }

        public static BlendingState[] values() {
            return (BlendingState[]) f101601b.clone();
        }
    }

    /* compiled from: BeduinItemColorPickerModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$Color;", "Landroid/os/Parcelable;", "", "position", "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(FLcom/avito/android/remote/model/UniversalColor;)V", "F", "d", "()F", "Lcom/avito/android/remote/model/UniversalColor;", "c", "()Lcom/avito/android/remote/model/UniversalColor;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Color implements Parcelable {

        @k
        public static final Parcelable.Creator<Color> CREATOR = new a();

        @com.google.gson.annotations.c("color")
        @k
        private final UniversalColor color;

        @com.google.gson.annotations.c("position")
        private final float position;

        /* compiled from: BeduinItemColorPickerModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Color> {
            @Override // android.os.Parcelable.Creator
            public final Color createFromParcel(Parcel parcel) {
                return new Color(parcel.readFloat(), (UniversalColor) parcel.readParcelable(Color.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Color[] newArray(int i12) {
                return new Color[i12];
            }
        }

        public Color(float f12, @k UniversalColor universalColor) {
            this.position = f12;
            this.color = universalColor;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final UniversalColor getColor() {
            return this.color;
        }

        /* renamed from: d, reason: from getter */
        public final float getPosition() {
            return this.position;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeFloat(this.position);
            parcel.writeParcelable(this.color, i12);
        }
    }

    /* compiled from: BeduinItemColorPickerModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$GradientColor;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$Color;", "colors", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GradientColor implements Parcelable {

        @k
        public static final Parcelable.Creator<GradientColor> CREATOR = new a();

        @com.google.gson.annotations.c("colors")
        @k
        private final List<Color> colors;

        /* compiled from: BeduinItemColorPickerModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GradientColor> {
            @Override // android.os.Parcelable.Creator
            public final GradientColor createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Color.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new GradientColor(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final GradientColor[] newArray(int i12) {
                return new GradientColor[i12];
            }
        }

        public GradientColor(@k List<Color> list) {
            this.colors = list;
        }

        @k
        public final List<Color> c() {
            return this.colors;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            Iterator itJ = C0.j(this.colors, parcel);
            while (itJ.hasNext()) {
                ((Color) itJ.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinItemColorPickerModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$ItemColorDisplayType;", "", "(Ljava/lang/String;I)V", "SINGLE_LINE_SCROLLABLE", "MULTILINE", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ItemColorDisplayType {

        @com.google.gson.annotations.c("multiLine")
        public static final ItemColorDisplayType MULTILINE;

        @com.google.gson.annotations.c("singleLineScrollable")
        public static final ItemColorDisplayType SINGLE_LINE_SCROLLABLE;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ItemColorDisplayType[] f101603b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f101604c;

        static {
            ItemColorDisplayType itemColorDisplayType = new ItemColorDisplayType("SINGLE_LINE_SCROLLABLE", 0);
            SINGLE_LINE_SCROLLABLE = itemColorDisplayType;
            ItemColorDisplayType itemColorDisplayType2 = new ItemColorDisplayType("MULTILINE", 1);
            MULTILINE = itemColorDisplayType2;
            ItemColorDisplayType[] itemColorDisplayTypeArr = {itemColorDisplayType, itemColorDisplayType2};
            f101603b = itemColorDisplayTypeArr;
            f101604c = kotlin.enums.c.a(itemColorDisplayTypeArr);
        }

        private ItemColorDisplayType(String str, int i12) {
        }

        public static ItemColorDisplayType valueOf(String str) {
            return (ItemColorDisplayType) Enum.valueOf(ItemColorDisplayType.class, str);
        }

        public static ItemColorDisplayType[] values() {
            return (ItemColorDisplayType[]) f101603b.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinItemColorPickerModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$ItemColorErrorDisplayMode;", "", "(Ljava/lang/String;I)V", "AFTER_VALIDATION", "DISPLAYED", "NOT_DISPLAYED", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ItemColorErrorDisplayMode {

        @com.google.gson.annotations.c("afterValidation")
        public static final ItemColorErrorDisplayMode AFTER_VALIDATION;

        @com.google.gson.annotations.c("displayed")
        public static final ItemColorErrorDisplayMode DISPLAYED;

        @com.google.gson.annotations.c("notDisplayed")
        public static final ItemColorErrorDisplayMode NOT_DISPLAYED;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ItemColorErrorDisplayMode[] f101605b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f101606c;

        static {
            ItemColorErrorDisplayMode itemColorErrorDisplayMode = new ItemColorErrorDisplayMode("AFTER_VALIDATION", 0);
            AFTER_VALIDATION = itemColorErrorDisplayMode;
            ItemColorErrorDisplayMode itemColorErrorDisplayMode2 = new ItemColorErrorDisplayMode("DISPLAYED", 1);
            DISPLAYED = itemColorErrorDisplayMode2;
            ItemColorErrorDisplayMode itemColorErrorDisplayMode3 = new ItemColorErrorDisplayMode("NOT_DISPLAYED", 2);
            NOT_DISPLAYED = itemColorErrorDisplayMode3;
            ItemColorErrorDisplayMode[] itemColorErrorDisplayModeArr = {itemColorErrorDisplayMode, itemColorErrorDisplayMode2, itemColorErrorDisplayMode3};
            f101605b = itemColorErrorDisplayModeArr;
            f101606c = kotlin.enums.c.a(itemColorErrorDisplayModeArr);
        }

        private ItemColorErrorDisplayMode(String str, int i12) {
        }

        public static ItemColorErrorDisplayMode valueOf(String str) {
            return (ItemColorErrorDisplayMode) Enum.valueOf(ItemColorErrorDisplayMode.class, str);
        }

        public static ItemColorErrorDisplayMode[] values() {
            return (ItemColorErrorDisplayMode[]) f101605b.clone();
        }
    }

    /* compiled from: BeduinItemColorPickerModel.kt */
    @K51.d
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0005\u0010\u0017R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$ItemColorPickerOption;", "Landroid/os/Parcelable;", "", "id", "", "isEnabled", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onSelectChangedActions", "Lcom/avito/android/remote/model/UniversalColor;", "optionColor", "Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$GradientColor;", "gradientColor", "strikethroughColor", "strokeColor", "Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$BlendingState;", "blendingState", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$GradientColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$BlendingState;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/avito/android/remote/model/UniversalColor;", "e", "()Lcom/avito/android/remote/model/UniversalColor;", "Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$GradientColor;", "c", "()Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$GradientColor;", "f", "g", "Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$BlendingState;", "getBlendingState", "()Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$BlendingState;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ItemColorPickerOption implements Parcelable {

        @k
        public static final Parcelable.Creator<ItemColorPickerOption> CREATOR = new a();

        @com.google.gson.annotations.c("blendingFor")
        @l
        private final BlendingState blendingState;

        @com.google.gson.annotations.c("gradientColor")
        @l
        private final GradientColor gradientColor;

        @com.google.gson.annotations.c("id")
        @k
        private final String id;

        @com.google.gson.annotations.c("isEnabled")
        @l
        private final Boolean isEnabled;

        @com.google.gson.annotations.c("onSelectChangedActions")
        @l
        private final List<BeduinAction> onSelectChangedActions;

        @com.google.gson.annotations.c("optionColor")
        @k
        private final UniversalColor optionColor;

        @com.google.gson.annotations.c("strikethroughColor")
        @l
        private final UniversalColor strikethroughColor;

        @com.google.gson.annotations.c("strokeColor")
        @l
        private final UniversalColor strokeColor;

        /* compiled from: BeduinItemColorPickerModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ItemColorPickerOption> {
            @Override // android.os.Parcelable.Creator
            public final ItemColorPickerOption createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                ArrayList arrayList;
                String string = parcel.readString();
                int iL2 = 0;
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    while (iL2 != i12) {
                        iL2 = com.avito.android.actions_sheet.a.l(ItemColorPickerOption.class, parcel, arrayList, iL2, 1);
                    }
                }
                return new ItemColorPickerOption(string, boolValueOf, arrayList, (UniversalColor) parcel.readParcelable(ItemColorPickerOption.class.getClassLoader()), parcel.readInt() == 0 ? null : GradientColor.CREATOR.createFromParcel(parcel), (UniversalColor) parcel.readParcelable(ItemColorPickerOption.class.getClassLoader()), (UniversalColor) parcel.readParcelable(ItemColorPickerOption.class.getClassLoader()), parcel.readInt() == 0 ? null : BlendingState.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final ItemColorPickerOption[] newArray(int i12) {
                return new ItemColorPickerOption[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ItemColorPickerOption(@k String str, @l Boolean bool, @l List<? extends BeduinAction> list, @k UniversalColor universalColor, @l GradientColor gradientColor, @l UniversalColor universalColor2, @l UniversalColor universalColor3, @l BlendingState blendingState) {
            this.id = str;
            this.isEnabled = bool;
            this.onSelectChangedActions = list;
            this.optionColor = universalColor;
            this.gradientColor = gradientColor;
            this.strikethroughColor = universalColor2;
            this.strokeColor = universalColor3;
            this.blendingState = blendingState;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final GradientColor getGradientColor() {
            return this.gradientColor;
        }

        @l
        public final List<BeduinAction> d() {
            return this.onSelectChangedActions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final UniversalColor getOptionColor() {
            return this.optionColor;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemColorPickerOption)) {
                return false;
            }
            ItemColorPickerOption itemColorPickerOption = (ItemColorPickerOption) obj;
            return L.f(this.id, itemColorPickerOption.id) && L.f(this.isEnabled, itemColorPickerOption.isEnabled) && L.f(this.onSelectChangedActions, itemColorPickerOption.onSelectChangedActions) && L.f(this.optionColor, itemColorPickerOption.optionColor) && L.f(this.gradientColor, itemColorPickerOption.gradientColor) && L.f(this.strikethroughColor, itemColorPickerOption.strikethroughColor) && L.f(this.strokeColor, itemColorPickerOption.strokeColor) && this.blendingState == itemColorPickerOption.blendingState;
        }

        @l
        /* renamed from: f, reason: from getter */
        public final UniversalColor getStrikethroughColor() {
            return this.strikethroughColor;
        }

        @l
        /* renamed from: g, reason: from getter */
        public final UniversalColor getStrokeColor() {
            return this.strokeColor;
        }

        @k
        public final String getId() {
            return this.id;
        }

        public final int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            Boolean bool = this.isEnabled;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            List<BeduinAction> list = this.onSelectChangedActions;
            int i12 = com.avito.android.actions_sheet.a.i(this.optionColor, (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31, 31);
            GradientColor gradientColor = this.gradientColor;
            int iHashCode3 = (i12 + (gradientColor == null ? 0 : gradientColor.hashCode())) * 31;
            UniversalColor universalColor = this.strikethroughColor;
            int iHashCode4 = (iHashCode3 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
            UniversalColor universalColor2 = this.strokeColor;
            int iHashCode5 = (iHashCode4 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31;
            BlendingState blendingState = this.blendingState;
            return iHashCode5 + (blendingState != null ? blendingState.hashCode() : 0);
        }

        @l
        /* renamed from: isEnabled, reason: from getter */
        public final Boolean getIsEnabled() {
            return this.isEnabled;
        }

        @k
        public final String toString() {
            return "ItemColorPickerOption(id=" + this.id + ", isEnabled=" + this.isEnabled + ", onSelectChangedActions=" + this.onSelectChangedActions + ", optionColor=" + this.optionColor + ", gradientColor=" + this.gradientColor + ", strikethroughColor=" + this.strikethroughColor + ", strokeColor=" + this.strokeColor + ", blendingState=" + this.blendingState + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.id);
            Boolean bool = this.isEnabled;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
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
            parcel.writeParcelable(this.optionColor, i12);
            GradientColor gradientColor = this.gradientColor;
            if (gradientColor == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                gradientColor.writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.strikethroughColor, i12);
            parcel.writeParcelable(this.strokeColor, i12);
            BlendingState blendingState = this.blendingState;
            if (blendingState == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(blendingState.name());
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinItemColorPickerModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/common/component/item_color_picker/BeduinItemColorPickerModel$ItemColorSelectionType;", "", "(Ljava/lang/String;I)V", "SINGLE", "SINGLE_OPTIONAL", "MULTIPLE", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ItemColorSelectionType {

        @com.google.gson.annotations.c("multiple")
        public static final ItemColorSelectionType MULTIPLE;

        @com.google.gson.annotations.c("single")
        public static final ItemColorSelectionType SINGLE;

        @com.google.gson.annotations.c("singleOptional")
        public static final ItemColorSelectionType SINGLE_OPTIONAL;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ItemColorSelectionType[] f101608b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f101609c;

        static {
            ItemColorSelectionType itemColorSelectionType = new ItemColorSelectionType("SINGLE", 0);
            SINGLE = itemColorSelectionType;
            ItemColorSelectionType itemColorSelectionType2 = new ItemColorSelectionType("SINGLE_OPTIONAL", 1);
            SINGLE_OPTIONAL = itemColorSelectionType2;
            ItemColorSelectionType itemColorSelectionType3 = new ItemColorSelectionType("MULTIPLE", 2);
            MULTIPLE = itemColorSelectionType3;
            ItemColorSelectionType[] itemColorSelectionTypeArr = {itemColorSelectionType, itemColorSelectionType2, itemColorSelectionType3};
            f101608b = itemColorSelectionTypeArr;
            f101609c = kotlin.enums.c.a(itemColorSelectionTypeArr);
        }

        private ItemColorSelectionType(String str, int i12) {
        }

        public static ItemColorSelectionType valueOf(String str) {
            return (ItemColorSelectionType) Enum.valueOf(ItemColorSelectionType.class, str);
        }

        public static ItemColorSelectionType[] values() {
            return (ItemColorSelectionType[]) f101608b.clone();
        }
    }

    /* compiled from: BeduinItemColorPickerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinItemColorPickerModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinItemColorPickerModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinItemColorPickerModel.class.getClassLoader());
            BeduinComponentTheme beduinComponentThemeCreateFromParcel = parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel);
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ItemColorSelectionType itemColorSelectionTypeValueOf = parcel.readInt() == 0 ? null : ItemColorSelectionType.valueOf(parcel.readString());
            ItemColorDisplayType itemColorDisplayTypeValueOf = parcel.readInt() == 0 ? null : ItemColorDisplayType.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(BeduinItemColorPickerModel.class, parcel, arrayList2, iL2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(ItemColorPickerOption.CREATOR, parcel, arrayList, iC2, 1);
                    i13 = i13;
                }
            }
            return new BeduinItemColorPickerModel(string, displayingPredicate, beduinComponentThemeCreateFromParcel, z12, boolValueOf, string2, arrayListCreateStringArrayList, itemColorSelectionTypeValueOf, itemColorDisplayTypeValueOf, arrayList2, arrayList, (UniversalColor) parcel.readParcelable(BeduinItemColorPickerModel.class.getClassLoader()), parcel.readInt() == 0 ? null : ItemColorErrorDisplayMode.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinItemColorPickerModel[] newArray(int i12) {
            return new BeduinItemColorPickerModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinItemColorPickerModel(@k String str, @l DisplayingPredicate displayingPredicate, @l BeduinComponentTheme beduinComponentTheme, boolean z12, @l Boolean bool, @l String str2, @l List<String> list, @l ItemColorSelectionType itemColorSelectionType, @l ItemColorDisplayType itemColorDisplayType, @k List<? extends BeduinAction> list2, @l List<ItemColorPickerOption> list3, @l UniversalColor universalColor, @l ItemColorErrorDisplayMode itemColorErrorDisplayMode) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.theme = beduinComponentTheme;
        this.isRequired = z12;
        this._isEnabled = bool;
        this.errorMessage = str2;
        this._selectedIds = list;
        this._selectionType = itemColorSelectionType;
        this.displayType = itemColorDisplayType;
        this.onSelectChangedActions = list2;
        this.options = list3;
        this.selectionStrokeColor = universalColor;
        this.f101599b = itemColorErrorDisplayMode;
    }

    public static BeduinItemColorPickerModel a(BeduinItemColorPickerModel beduinItemColorPickerModel, List list, int i12) {
        String str = beduinItemColorPickerModel.id;
        DisplayingPredicate displayingPredicate = beduinItemColorPickerModel.displayingPredicate;
        BeduinComponentTheme beduinComponentTheme = beduinItemColorPickerModel.theme;
        boolean z12 = beduinItemColorPickerModel.isRequired;
        Boolean bool = (i12 & 16) != 0 ? beduinItemColorPickerModel._isEnabled : null;
        String str2 = (i12 & 32) != 0 ? beduinItemColorPickerModel.errorMessage : null;
        ItemColorSelectionType itemColorSelectionType = beduinItemColorPickerModel._selectionType;
        ItemColorDisplayType itemColorDisplayType = beduinItemColorPickerModel.displayType;
        List<BeduinAction> list2 = beduinItemColorPickerModel.onSelectChangedActions;
        List<ItemColorPickerOption> list3 = beduinItemColorPickerModel.options;
        UniversalColor universalColor = beduinItemColorPickerModel.selectionStrokeColor;
        ItemColorErrorDisplayMode itemColorErrorDisplayMode = beduinItemColorPickerModel.f101599b;
        beduinItemColorPickerModel.getClass();
        return new BeduinItemColorPickerModel(str, displayingPredicate, beduinComponentTheme, z12, bool, str2, list, itemColorSelectionType, itemColorDisplayType, list2, list3, universalColor, itemColorErrorDisplayMode);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public final BeduinModel apply(@k BeduinModelTransform beduinModelTransform) {
        return beduinModelTransform instanceof SelectedIdsTransform ? a(this, ((SelectedIdsTransform) beduinModelTransform).getSelectedIds(), 8127) : super.apply(beduinModelTransform);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final ItemColorDisplayType getDisplayType() {
        return this.displayType;
    }

    @k
    public final List<BeduinAction> d() {
        return this.onSelectChangedActions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final List<String> e() {
        List<String> list = this._selectedIds;
        return list == null ? C42784z0.f406748b : list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinItemColorPickerModel)) {
            return false;
        }
        BeduinItemColorPickerModel beduinItemColorPickerModel = (BeduinItemColorPickerModel) obj;
        return L.f(this.id, beduinItemColorPickerModel.id) && L.f(this.displayingPredicate, beduinItemColorPickerModel.displayingPredicate) && this.theme == beduinItemColorPickerModel.theme && this.isRequired == beduinItemColorPickerModel.isRequired && L.f(this._isEnabled, beduinItemColorPickerModel._isEnabled) && L.f(this.errorMessage, beduinItemColorPickerModel.errorMessage) && L.f(this._selectedIds, beduinItemColorPickerModel._selectedIds) && this._selectionType == beduinItemColorPickerModel._selectionType && this.displayType == beduinItemColorPickerModel.displayType && L.f(this.onSelectChangedActions, beduinItemColorPickerModel.onSelectChangedActions) && L.f(this.options, beduinItemColorPickerModel.options) && L.f(this.selectionStrokeColor, beduinItemColorPickerModel.selectionStrokeColor) && this.f101599b == beduinItemColorPickerModel.f101599b;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final UniversalColor getSelectionStrokeColor() {
        return this.selectionStrokeColor;
    }

    @k
    public final ItemColorSelectionType g() {
        ItemColorSelectionType itemColorSelectionType = this._selectionType;
        return itemColorSelectionType == null ? ItemColorSelectionType.SINGLE : itemColorSelectionType;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate, reason: from getter */
    public final DisplayingPredicate getF102360b() {
        return this.displayingPredicate;
    }

    @l
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final List<ItemColorPickerOption> getOptions() {
        return this.options;
    }

    @l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        int i12 = r.i((iHashCode2 + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31, 31, this.isRequired);
        Boolean bool = this._isEnabled;
        int iHashCode3 = (i12 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.errorMessage;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this._selectedIds;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        ItemColorSelectionType itemColorSelectionType = this._selectionType;
        int iHashCode6 = (iHashCode5 + (itemColorSelectionType == null ? 0 : itemColorSelectionType.hashCode())) * 31;
        ItemColorDisplayType itemColorDisplayType = this.displayType;
        int iE2 = H.e((iHashCode6 + (itemColorDisplayType == null ? 0 : itemColorDisplayType.hashCode())) * 31, 31, this.onSelectChangedActions);
        List<ItemColorPickerOption> list2 = this.options;
        int iHashCode7 = (iE2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        UniversalColor universalColor = this.selectionStrokeColor;
        int iHashCode8 = (iHashCode7 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        ItemColorErrorDisplayMode itemColorErrorDisplayMode = this.f101599b;
        return iHashCode8 + (itemColorErrorDisplayMode != null ? itemColorErrorDisplayMode.hashCode() : 0);
    }

    public final boolean isEnabled() {
        Boolean bool = this._isEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    public final boolean isValid() {
        String str;
        return !this.isRequired || (O2.a(e()) && !(this.f101599b == ItemColorErrorDisplayMode.DISPLAYED && (str = this.errorMessage) != null && str.length() != 0));
    }

    @k
    public final String toString() {
        return "BeduinItemColorPickerModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", theme=" + this.theme + ", isRequired=" + this.isRequired + ", _isEnabled=" + this._isEnabled + ", errorMessage=" + this.errorMessage + ", _selectedIds=" + this._selectedIds + ", _selectionType=" + this._selectionType + ", displayType=" + this.displayType + ", onSelectChangedActions=" + this.onSelectChangedActions + ", options=" + this.options + ", selectionStrokeColor=" + this.selectionStrokeColor + ", errorDisplayMode=" + this.f101599b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, i12);
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.isRequired ? 1 : 0);
        Boolean bool = this._isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.errorMessage);
        parcel.writeStringList(this._selectedIds);
        ItemColorSelectionType itemColorSelectionType = this._selectionType;
        if (itemColorSelectionType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(itemColorSelectionType.name());
        }
        ItemColorDisplayType itemColorDisplayType = this.displayType;
        if (itemColorDisplayType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(itemColorDisplayType.name());
        }
        Iterator itJ = C0.j(this.onSelectChangedActions, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        List<ItemColorPickerOption> list = this.options;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((ItemColorPickerOption) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeParcelable(this.selectionStrokeColor, i12);
        ItemColorErrorDisplayMode itemColorErrorDisplayMode = this.f101599b;
        if (itemColorErrorDisplayMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(itemColorErrorDisplayMode.name());
        }
    }

    @Override // com.avito.android.beduin.common.component.q
    @k
    public final BeduinModel validateModelByConstraints() {
        return this;
    }
}
