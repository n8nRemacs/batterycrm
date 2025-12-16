package com.avito.android.beduin.common.container.flex;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.component.model.Layout;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.BeduinContainerModel;
import com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.BackgroundTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinFlexContainerModel.kt */
@K51.d
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002:;B\u0089\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0005¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b(\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b2\u0010.R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u00106\u001a\u0004\b7\u00108R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b9\u0010!¨\u0006<"}, d2 = {"Lcom/avito/android/beduin/common/container/flex/BeduinFlexContainerModel;", "Lcom/avito/android/beduin/common/container/BeduinSingleChildOwnerModel;", "Lcom/avito/android/beduin/common/container/BeduinContainerModel;", "", "id", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "", "interItemSpacing", "Lcom/avito/android/beduin/common/component/model/Layout;", "layout", "verticalInterItemSpacing", "Lcom/avito/android/beduin/common/container/flex/BeduinFlexContainerModel$HorizontalAlignment;", "horizontalAlignment", "Lcom/avito/android/beduin/common/container/flex/BeduinFlexContainerModel$VerticalAlignment;", "verticalAlignment", "Lcom/avito/android/beduin_models/BeduinModel;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/model/Layout;Ljava/lang/Integer;Lcom/avito/android/beduin/common/container/flex/BeduinFlexContainerModel$HorizontalAlignment;Lcom/avito/android/beduin/common/container/flex/BeduinFlexContainerModel$VerticalAlignment;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getPadding", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getMargin", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "getBackground", "()Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "Ljava/lang/Integer;", "getInterItemSpacing", "()Ljava/lang/Integer;", "Lcom/avito/android/beduin/common/component/model/Layout;", "d", "()Lcom/avito/android/beduin/common/component/model/Layout;", "getVerticalInterItemSpacing", "Lcom/avito/android/beduin/common/container/flex/BeduinFlexContainerModel$HorizontalAlignment;", "c", "()Lcom/avito/android/beduin/common/container/flex/BeduinFlexContainerModel$HorizontalAlignment;", "Lcom/avito/android/beduin/common/container/flex/BeduinFlexContainerModel$VerticalAlignment;", "e", "()Lcom/avito/android/beduin/common/container/flex/BeduinFlexContainerModel$VerticalAlignment;", "getChildren", "HorizontalAlignment", "VerticalAlignment", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinFlexContainerModel extends BeduinSingleChildOwnerModel implements BeduinContainerModel {

    @k
    public static final Parcelable.Creator<BeduinFlexContainerModel> CREATOR = new a();

    @com.google.gson.annotations.c("onTapActions")
    @l
    private final List<BeduinAction> actions;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
    @l
    private final BeduinContainerBackground background;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
    @l
    private final List<BeduinModel> children;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE)
    @l
    private final DisplayingPredicate displayingPredicate;

    @com.google.gson.annotations.c("horizontalAlignment")
    @l
    private final HorizontalAlignment horizontalAlignment;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("horizontalInterItemSpacing")
    @l
    private final Integer interItemSpacing;

    @com.google.gson.annotations.c("layout")
    @l
    private final Layout layout;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN)
    @l
    private final BeduinContainerIndent margin;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_PADDING)
    @l
    private final BeduinContainerIndent padding;

    @com.google.gson.annotations.c("verticalAlignment")
    @l
    private final VerticalAlignment verticalAlignment;

    @com.google.gson.annotations.c("verticalInterItemSpacing")
    @l
    private final Integer verticalInterItemSpacing;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinFlexContainerModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/beduin/common/container/flex/BeduinFlexContainerModel$HorizontalAlignment;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "LEFT", "CENTER", "RIGHT", "SPACE_BETWEEN", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HorizontalAlignment {

        @com.google.gson.annotations.c("center")
        public static final HorizontalAlignment CENTER;

        @com.google.gson.annotations.c("left")
        public static final HorizontalAlignment LEFT;

        @com.google.gson.annotations.c("right")
        public static final HorizontalAlignment RIGHT;

        @com.google.gson.annotations.c("spaceBetween")
        public static final HorizontalAlignment SPACE_BETWEEN;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ HorizontalAlignment[] f103036c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f103037d;

        /* renamed from: b, reason: collision with root package name */
        public final int f103038b;

        static {
            HorizontalAlignment horizontalAlignment = new HorizontalAlignment("LEFT", 0, 0);
            LEFT = horizontalAlignment;
            HorizontalAlignment horizontalAlignment2 = new HorizontalAlignment("CENTER", 1, 2);
            CENTER = horizontalAlignment2;
            HorizontalAlignment horizontalAlignment3 = new HorizontalAlignment("RIGHT", 2, 1);
            RIGHT = horizontalAlignment3;
            HorizontalAlignment horizontalAlignment4 = new HorizontalAlignment("SPACE_BETWEEN", 3, 3);
            SPACE_BETWEEN = horizontalAlignment4;
            HorizontalAlignment[] horizontalAlignmentArr = {horizontalAlignment, horizontalAlignment2, horizontalAlignment3, horizontalAlignment4};
            f103036c = horizontalAlignmentArr;
            f103037d = kotlin.enums.c.a(horizontalAlignmentArr);
        }

        private HorizontalAlignment(String str, int i12, int i13) {
            this.f103038b = i13;
        }

        public static HorizontalAlignment valueOf(String str) {
            return (HorizontalAlignment) Enum.valueOf(HorizontalAlignment.class, str);
        }

        public static HorizontalAlignment[] values() {
            return (HorizontalAlignment[]) f103036c.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BeduinFlexContainerModel.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/beduin/common/container/flex/BeduinFlexContainerModel$VerticalAlignment;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "TOP", "CENTER", "BOTTOM", "STRETCH", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VerticalAlignment {

        @com.google.gson.annotations.c("bottom")
        public static final VerticalAlignment BOTTOM;

        @com.google.gson.annotations.c("center")
        public static final VerticalAlignment CENTER;

        @com.google.gson.annotations.c("stretch")
        public static final VerticalAlignment STRETCH;

        @com.google.gson.annotations.c("top")
        public static final VerticalAlignment TOP;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ VerticalAlignment[] f103039c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f103040d;

        /* renamed from: b, reason: collision with root package name */
        public final int f103041b;

        static {
            VerticalAlignment verticalAlignment = new VerticalAlignment("TOP", 0, 0);
            TOP = verticalAlignment;
            VerticalAlignment verticalAlignment2 = new VerticalAlignment("CENTER", 1, 2);
            CENTER = verticalAlignment2;
            VerticalAlignment verticalAlignment3 = new VerticalAlignment("BOTTOM", 2, 1);
            BOTTOM = verticalAlignment3;
            VerticalAlignment verticalAlignment4 = new VerticalAlignment("STRETCH", 3, 4);
            STRETCH = verticalAlignment4;
            VerticalAlignment[] verticalAlignmentArr = {verticalAlignment, verticalAlignment2, verticalAlignment3, verticalAlignment4};
            f103039c = verticalAlignmentArr;
            f103040d = kotlin.enums.c.a(verticalAlignmentArr);
        }

        private VerticalAlignment(String str, int i12, int i13) {
            this.f103041b = i13;
        }

        public static VerticalAlignment valueOf(String str) {
            return (VerticalAlignment) Enum.valueOf(VerticalAlignment.class, str);
        }

        public static VerticalAlignment[] values() {
            return (VerticalAlignment[]) f103039c.clone();
        }
    }

    /* compiled from: BeduinFlexContainerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinFlexContainerModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinFlexContainerModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinFlexContainerModel.class, parcel, arrayList3, iL3, 1);
                }
                arrayList = arrayList3;
            }
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinFlexContainerModel.class.getClassLoader());
            BeduinContainerIndent beduinContainerIndentCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            BeduinContainerIndent beduinContainerIndentCreateFromParcel2 = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            BeduinContainerBackground beduinContainerBackgroundCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerBackground.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Layout layoutCreateFromParcel = parcel.readInt() == 0 ? null : Layout.CREATOR.createFromParcel(parcel);
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            HorizontalAlignment horizontalAlignmentValueOf = parcel.readInt() == 0 ? null : HorizontalAlignment.valueOf(parcel.readString());
            VerticalAlignment verticalAlignmentValueOf = parcel.readInt() == 0 ? null : VerticalAlignment.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinFlexContainerModel.class, parcel, arrayList2, iL2, 1);
                    i13 = i13;
                }
            }
            return new BeduinFlexContainerModel(string, arrayList, displayingPredicate, beduinContainerIndentCreateFromParcel, beduinContainerIndentCreateFromParcel2, beduinContainerBackgroundCreateFromParcel, numValueOf, layoutCreateFromParcel, numValueOf2, horizontalAlignmentValueOf, verticalAlignmentValueOf, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinFlexContainerModel[] newArray(int i12) {
            return new BeduinFlexContainerModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinFlexContainerModel(@k String str, @l List<? extends BeduinAction> list, @l DisplayingPredicate displayingPredicate, @l BeduinContainerIndent beduinContainerIndent, @l BeduinContainerIndent beduinContainerIndent2, @l BeduinContainerBackground beduinContainerBackground, @l Integer num, @l Layout layout, @l Integer num2, @l HorizontalAlignment horizontalAlignment, @l VerticalAlignment verticalAlignment, @l List<? extends BeduinModel> list2) {
        this.id = str;
        this.actions = list;
        this.displayingPredicate = displayingPredicate;
        this.padding = beduinContainerIndent;
        this.margin = beduinContainerIndent2;
        this.background = beduinContainerBackground;
        this.interItemSpacing = num;
        this.layout = layout;
        this.verticalInterItemSpacing = num2;
        this.horizontalAlignment = horizontalAlignment;
        this.verticalAlignment = verticalAlignment;
        this.children = list2;
    }

    public static BeduinFlexContainerModel a(BeduinFlexContainerModel beduinFlexContainerModel, DisplayingPredicate displayingPredicate, BeduinContainerBackground beduinContainerBackground, List list, int i12) {
        String str = beduinFlexContainerModel.id;
        List<BeduinAction> list2 = beduinFlexContainerModel.actions;
        DisplayingPredicate displayingPredicate2 = (i12 & 4) != 0 ? beduinFlexContainerModel.displayingPredicate : displayingPredicate;
        BeduinContainerIndent beduinContainerIndent = beduinFlexContainerModel.padding;
        BeduinContainerIndent beduinContainerIndent2 = beduinFlexContainerModel.margin;
        BeduinContainerBackground beduinContainerBackground2 = (i12 & 32) != 0 ? beduinFlexContainerModel.background : beduinContainerBackground;
        Integer num = beduinFlexContainerModel.interItemSpacing;
        Layout layout = beduinFlexContainerModel.layout;
        Integer num2 = beduinFlexContainerModel.verticalInterItemSpacing;
        HorizontalAlignment horizontalAlignment = beduinFlexContainerModel.horizontalAlignment;
        VerticalAlignment verticalAlignment = beduinFlexContainerModel.verticalAlignment;
        List list3 = (i12 & 2048) != 0 ? beduinFlexContainerModel.children : list;
        beduinFlexContainerModel.getClass();
        return new BeduinFlexContainerModel(str, list2, displayingPredicate2, beduinContainerIndent, beduinContainerIndent2, beduinContainerBackground2, num, layout, num2, horizontalAlignment, verticalAlignment, list3);
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel, com.avito.android.beduin_models.BeduinModel
    @k
    public final BeduinModel apply(@k BeduinModelTransform beduinModelTransform) {
        return beduinModelTransform instanceof BackgroundTransform ? a(this, null, ((BackgroundTransform) beduinModelTransform).getBackground(), null, 4063) : super.apply(beduinModelTransform);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final HorizontalAlignment getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel
    @k
    public final BeduinModel create(@l List<? extends BeduinModel> list, @l DisplayingPredicate displayingPredicate) {
        return a(this, displayingPredicate, null, list, 2043);
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Layout getLayout() {
        return this.layout;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final VerticalAlignment getVerticalAlignment() {
        return this.verticalAlignment;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinFlexContainerModel)) {
            return false;
        }
        BeduinFlexContainerModel beduinFlexContainerModel = (BeduinFlexContainerModel) obj;
        return L.f(this.id, beduinFlexContainerModel.id) && L.f(this.actions, beduinFlexContainerModel.actions) && L.f(this.displayingPredicate, beduinFlexContainerModel.displayingPredicate) && L.f(this.padding, beduinFlexContainerModel.padding) && L.f(this.margin, beduinFlexContainerModel.margin) && L.f(this.background, beduinFlexContainerModel.background) && L.f(this.interItemSpacing, beduinFlexContainerModel.interItemSpacing) && L.f(this.layout, beduinFlexContainerModel.layout) && L.f(this.verticalInterItemSpacing, beduinFlexContainerModel.verticalInterItemSpacing) && this.horizontalAlignment == beduinFlexContainerModel.horizontalAlignment && this.verticalAlignment == beduinFlexContainerModel.verticalAlignment && L.f(this.children, beduinFlexContainerModel.children);
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @l
    public final BeduinContainerBackground getBackground() {
        return this.background;
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel
    @l
    public final List<BeduinModel> getChildren() {
        return this.children;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate, reason: from getter */
    public final DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId, reason: from getter */
    public final String getF100853b() {
        return this.id;
    }

    @l
    public final Integer getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @l
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @l
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    public final Integer getVerticalInterItemSpacing() {
        return this.verticalInterItemSpacing;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        List<BeduinAction> list = this.actions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode3 = (iHashCode2 + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.padding;
        int iHashCode4 = (iHashCode3 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent2 = this.margin;
        int iHashCode5 = (iHashCode4 + (beduinContainerIndent2 == null ? 0 : beduinContainerIndent2.hashCode())) * 31;
        BeduinContainerBackground beduinContainerBackground = this.background;
        int iHashCode6 = (iHashCode5 + (beduinContainerBackground == null ? 0 : beduinContainerBackground.hashCode())) * 31;
        Integer num = this.interItemSpacing;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Layout layout = this.layout;
        int iHashCode8 = (iHashCode7 + (layout == null ? 0 : layout.hashCode())) * 31;
        Integer num2 = this.verticalInterItemSpacing;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        HorizontalAlignment horizontalAlignment = this.horizontalAlignment;
        int iHashCode10 = (iHashCode9 + (horizontalAlignment == null ? 0 : horizontalAlignment.hashCode())) * 31;
        VerticalAlignment verticalAlignment = this.verticalAlignment;
        int iHashCode11 = (iHashCode10 + (verticalAlignment == null ? 0 : verticalAlignment.hashCode())) * 31;
        List<BeduinModel> list2 = this.children;
        return iHashCode11 + (list2 != null ? list2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinFlexContainerModel(id=");
        sb2.append(this.id);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", padding=");
        sb2.append(this.padding);
        sb2.append(", margin=");
        sb2.append(this.margin);
        sb2.append(", background=");
        sb2.append(this.background);
        sb2.append(", interItemSpacing=");
        sb2.append(this.interItemSpacing);
        sb2.append(", layout=");
        sb2.append(this.layout);
        sb2.append(", verticalInterItemSpacing=");
        sb2.append(this.verticalInterItemSpacing);
        sb2.append(", horizontalAlignment=");
        sb2.append(this.horizontalAlignment);
        sb2.append(", verticalAlignment=");
        sb2.append(this.verticalAlignment);
        sb2.append(", children=");
        return H.p(sb2, this.children, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        List<BeduinAction> list = this.actions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.displayingPredicate, i12);
        BeduinContainerIndent beduinContainerIndent = this.padding;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, i12);
        }
        BeduinContainerIndent beduinContainerIndent2 = this.margin;
        if (beduinContainerIndent2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent2.writeToParcel(parcel, i12);
        }
        BeduinContainerBackground beduinContainerBackground = this.background;
        if (beduinContainerBackground == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerBackground.writeToParcel(parcel, i12);
        }
        Integer num = this.interItemSpacing;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Layout layout = this.layout;
        if (layout == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            layout.writeToParcel(parcel, i12);
        }
        Integer num2 = this.verticalInterItemSpacing;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        HorizontalAlignment horizontalAlignment = this.horizontalAlignment;
        if (horizontalAlignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(horizontalAlignment.name());
        }
        VerticalAlignment verticalAlignment = this.verticalAlignment;
        if (verticalAlignment == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(verticalAlignment.name());
        }
        List<BeduinModel> list2 = this.children;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            parcel.writeParcelable((Parcelable) itA2.next(), i12);
        }
    }
}
