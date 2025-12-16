package com.avito.android.beduin.common.container.card_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.beduin.common.component.model.BeduinLayoutParams;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinCardItemContainerModel.kt */
@K51.d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002./Bu\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\r\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010)\u001a\u0004\b*\u0010+R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b,\u0010+R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010)\u001a\u0004\b-\u0010+¨\u00060"}, d2 = {"Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel;", "Lcom/avito/android/beduin_models/BeduinModel;", "Lcom/avito/android/beduin/common/component/g;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/model/BeduinLayoutParams;", "layoutParams", "Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel$SelectionDisplayType;", "selectionDisplayType", "child", "", "isSelected", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onSelectActions", "onDeselectActions", "onTapActions", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/model/BeduinLayoutParams;Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel$Style;Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel$SelectionDisplayType;Lcom/avito/android/beduin_models/BeduinModel;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "Lcom/avito/android/beduin/common/component/model/BeduinLayoutParams;", "d", "()Lcom/avito/android/beduin/common/component/model/BeduinLayoutParams;", "Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel$Style;", "i", "()Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel$Style;", "Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel$SelectionDisplayType;", "h", "()Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel$SelectionDisplayType;", "Lcom/avito/android/beduin_models/BeduinModel;", "c", "()Lcom/avito/android/beduin_models/BeduinModel;", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "g", "SelectionDisplayType", "Style", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinCardItemContainerModel implements BeduinModel, com.avito.android.beduin.common.component.g {

    @k
    public static final Parcelable.Creator<BeduinCardItemContainerModel> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final transient boolean f102942b;

    @com.google.gson.annotations.c("child")
    @k
    private final BeduinModel child;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE)
    @l
    private final DisplayingPredicate displayingPredicate;

    @com.google.gson.annotations.c("id")
    @k
    private final String id;

    @com.google.gson.annotations.c("layoutParams")
    @l
    private final BeduinLayoutParams layoutParams;

    @com.google.gson.annotations.c("onDeselectActions")
    @l
    private final List<BeduinAction> onDeselectActions;

    @com.google.gson.annotations.c("onSelectActions")
    @l
    private final List<BeduinAction> onSelectActions;

    @com.google.gson.annotations.c("onTapActions")
    @l
    private final List<BeduinAction> onTapActions;

    @com.google.gson.annotations.c("selectionDisplayType")
    @k
    private final SelectionDisplayType selectionDisplayType;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final Style style;

    /* compiled from: BeduinCardItemContainerModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel$SelectionDisplayType;", "Landroid/os/Parcelable;", "()V", "Border", "BorderAndMark", "Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel$SelectionDisplayType$Border;", "Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel$SelectionDisplayType$BorderAndMark;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class SelectionDisplayType implements Parcelable {

        /* compiled from: BeduinCardItemContainerModel.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel$SelectionDisplayType$Border;", "Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel$SelectionDisplayType;", "", "width", "<init>", "(I)V", "I", "getWidth", "()I", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Border extends SelectionDisplayType {

            @k
            public static final Parcelable.Creator<Border> CREATOR = new a();

            @com.google.gson.annotations.c("width")
            private final int width;

            /* compiled from: BeduinCardItemContainerModel.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Border> {
                @Override // android.os.Parcelable.Creator
                public final Border createFromParcel(Parcel parcel) {
                    return new Border(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Border[] newArray(int i12) {
                    return new Border[i12];
                }
            }

            public Border(int i12) {
                super(null);
                this.width = i12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Border) && this.width == ((Border) obj).width;
            }

            public final int getWidth() {
                return this.width;
            }

            public final int hashCode() {
                return Integer.hashCode(this.width);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("Border(width="), this.width, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.width);
            }
        }

        /* compiled from: BeduinCardItemContainerModel.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel$SelectionDisplayType$BorderAndMark;", "Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel$SelectionDisplayType;", "", "width", "<init>", "(I)V", "I", "getWidth", "()I", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class BorderAndMark extends SelectionDisplayType {

            @k
            public static final Parcelable.Creator<BorderAndMark> CREATOR = new a();

            @com.google.gson.annotations.c("width")
            private final int width;

            /* compiled from: BeduinCardItemContainerModel.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<BorderAndMark> {
                @Override // android.os.Parcelable.Creator
                public final BorderAndMark createFromParcel(Parcel parcel) {
                    return new BorderAndMark(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final BorderAndMark[] newArray(int i12) {
                    return new BorderAndMark[i12];
                }
            }

            public BorderAndMark(int i12) {
                super(null);
                this.width = i12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BorderAndMark) && this.width == ((BorderAndMark) obj).width;
            }

            public final int getWidth() {
                return this.width;
            }

            public final int hashCode() {
                return Integer.hashCode(this.width);
            }

            @k
            public final String toString() {
                return r.t(new StringBuilder("BorderAndMark(width="), this.width, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(this.width);
            }
        }

        public /* synthetic */ SelectionDisplayType(C42822w c42822w) {
            this();
        }

        private SelectionDisplayType() {
        }
    }

    /* compiled from: BeduinCardItemContainerModel.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/common/container/card_item/BeduinCardItemContainerModel$Style;", "Landroid/os/Parcelable;", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "<init>", "(Lcom/avito/android/beduin/common/container/BeduinContainerBackground;)V", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "c", "()Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Style implements Parcelable {

        @k
        public static final Parcelable.Creator<Style> CREATOR = new a();

        @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
        @k
        private final BeduinContainerBackground background;

        /* compiled from: BeduinCardItemContainerModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Style> {
            @Override // android.os.Parcelable.Creator
            public final Style createFromParcel(Parcel parcel) {
                return new Style(BeduinContainerBackground.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Style[] newArray(int i12) {
                return new Style[i12];
            }
        }

        public Style(@k BeduinContainerBackground beduinContainerBackground) {
            this.background = beduinContainerBackground;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final BeduinContainerBackground getBackground() {
            return this.background;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Style) && L.f(this.background, ((Style) obj).background);
        }

        public final int hashCode() {
            return this.background.hashCode();
        }

        @k
        public final String toString() {
            return "Style(background=" + this.background + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            this.background.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: BeduinCardItemContainerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinCardItemContainerModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinCardItemContainerModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinCardItemContainerModel.class.getClassLoader());
            BeduinLayoutParams beduinLayoutParamsCreateFromParcel = parcel.readInt() == 0 ? null : BeduinLayoutParams.CREATOR.createFromParcel(parcel);
            Style styleCreateFromParcel = Style.CREATOR.createFromParcel(parcel);
            SelectionDisplayType selectionDisplayType = (SelectionDisplayType) parcel.readParcelable(BeduinCardItemContainerModel.class.getClassLoader());
            BeduinModel beduinModel = (BeduinModel) parcel.readParcelable(BeduinCardItemContainerModel.class.getClassLoader());
            int iL2 = 0;
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinCardItemContainerModel.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iL4 = 0;
                while (iL4 != i13) {
                    iL4 = com.avito.android.actions_sheet.a.l(BeduinCardItemContainerModel.class, parcel, arrayList2, iL4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i14);
                while (iL2 != i14) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinCardItemContainerModel.class, parcel, arrayList4, iL2, 1);
                }
                arrayList3 = arrayList4;
            }
            return new BeduinCardItemContainerModel(string, displayingPredicate, beduinLayoutParamsCreateFromParcel, styleCreateFromParcel, selectionDisplayType, beduinModel, z12, arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinCardItemContainerModel[] newArray(int i12) {
            return new BeduinCardItemContainerModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinCardItemContainerModel(@k String str, @l DisplayingPredicate displayingPredicate, @l BeduinLayoutParams beduinLayoutParams, @k Style style, @k SelectionDisplayType selectionDisplayType, @k BeduinModel beduinModel, boolean z12, @l List<? extends BeduinAction> list, @l List<? extends BeduinAction> list2, @l List<? extends BeduinAction> list3) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.layoutParams = beduinLayoutParams;
        this.style = style;
        this.selectionDisplayType = selectionDisplayType;
        this.child = beduinModel;
        this.f102942b = z12;
        this.onSelectActions = list;
        this.onDeselectActions = list2;
        this.onTapActions = list3;
    }

    public static BeduinCardItemContainerModel a(BeduinCardItemContainerModel beduinCardItemContainerModel, DisplayingPredicate displayingPredicate, BeduinModel beduinModel, boolean z12, int i12) {
        String str = beduinCardItemContainerModel.id;
        if ((i12 & 2) != 0) {
            displayingPredicate = beduinCardItemContainerModel.displayingPredicate;
        }
        DisplayingPredicate displayingPredicate2 = displayingPredicate;
        BeduinLayoutParams beduinLayoutParams = beduinCardItemContainerModel.layoutParams;
        Style style = beduinCardItemContainerModel.style;
        SelectionDisplayType selectionDisplayType = beduinCardItemContainerModel.selectionDisplayType;
        if ((i12 & 32) != 0) {
            beduinModel = beduinCardItemContainerModel.child;
        }
        BeduinModel beduinModel2 = beduinModel;
        if ((i12 & 64) != 0) {
            z12 = beduinCardItemContainerModel.f102942b;
        }
        boolean z13 = z12;
        List<BeduinAction> list = (i12 & 128) != 0 ? beduinCardItemContainerModel.onSelectActions : null;
        List<BeduinAction> list2 = (i12 & 256) != 0 ? beduinCardItemContainerModel.onDeselectActions : null;
        List<BeduinAction> list3 = (i12 & 512) != 0 ? beduinCardItemContainerModel.onTapActions : null;
        beduinCardItemContainerModel.getClass();
        return new BeduinCardItemContainerModel(str, displayingPredicate2, beduinLayoutParams, style, selectionDisplayType, beduinModel2, z13, list, list2, list3);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public final BeduinModel apply(@k BeduinModelTransform beduinModelTransform) {
        return beduinModelTransform instanceof DisplayPredicateTransform ? a(this, ((DisplayPredicateTransform) beduinModelTransform).getDisplayingPredicate(), null, false, 1021) : this;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final BeduinModel getChild() {
        return this.child;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final BeduinLayoutParams getLayoutParams() {
        return this.layoutParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final List<BeduinAction> e() {
        return this.onDeselectActions;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeduinCardItemContainerModel)) {
            return false;
        }
        BeduinCardItemContainerModel beduinCardItemContainerModel = (BeduinCardItemContainerModel) obj;
        return L.f(this.id, beduinCardItemContainerModel.id) && L.f(this.displayingPredicate, beduinCardItemContainerModel.displayingPredicate) && L.f(this.layoutParams, beduinCardItemContainerModel.layoutParams) && L.f(this.style, beduinCardItemContainerModel.style) && L.f(this.selectionDisplayType, beduinCardItemContainerModel.selectionDisplayType) && L.f(this.child, beduinCardItemContainerModel.child) && this.f102942b == beduinCardItemContainerModel.f102942b && L.f(this.onSelectActions, beduinCardItemContainerModel.onSelectActions) && L.f(this.onDeselectActions, beduinCardItemContainerModel.onDeselectActions) && L.f(this.onTapActions, beduinCardItemContainerModel.onTapActions);
    }

    @l
    public final List<BeduinAction> f() {
        return this.onSelectActions;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public final List<BeduinModel> flatMap(@k Y41.l<? super BeduinModel, ? extends List<? extends BeduinModel>> lVar) {
        BeduinModel beduinModel = (BeduinModel) C42745f0.G(this.child.flatMap(lVar));
        if (beduinModel == null) {
            return C42784z0.f406748b;
        }
        BeduinCardItemContainerModel beduinCardItemContainerModelA = L.f(this.child, beduinModel) ? this : null;
        if (beduinCardItemContainerModelA == null) {
            beduinCardItemContainerModelA = a(this, null, beduinModel, false, 991);
        }
        return (List) lVar.invoke(beduinCardItemContainerModelA);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public final void forEach(@k Y41.l<? super BeduinModel, Boolean> lVar) {
        if (lVar.invoke(this).booleanValue()) {
            return;
        }
        this.child.forEach(lVar);
    }

    @l
    public final List<BeduinAction> g() {
        return this.onTapActions;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final SelectionDisplayType getSelectionDisplayType() {
        return this.selectionDisplayType;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        BeduinLayoutParams beduinLayoutParams = this.layoutParams;
        int i12 = r.i((this.child.hashCode() + ((this.selectionDisplayType.hashCode() + ((this.style.hashCode() + ((iHashCode2 + (beduinLayoutParams == null ? 0 : beduinLayoutParams.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.f102942b);
        List<BeduinAction> list = this.onSelectActions;
        int iHashCode3 = (i12 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinAction> list2 = this.onDeselectActions;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BeduinAction> list3 = this.onTapActions;
        return iHashCode4 + (list3 != null ? list3.hashCode() : 0);
    }

    @k
    /* renamed from: i, reason: from getter */
    public final Style getStyle() {
        return this.style;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public final boolean isValid() {
        return true;
    }

    @Override // com.avito.android.beduin.common.component.g
    @k
    public final BeduinModel setSelected(boolean z12) {
        return a(this, null, null, z12, 959);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinCardItemContainerModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", layoutParams=");
        sb2.append(this.layoutParams);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", selectionDisplayType=");
        sb2.append(this.selectionDisplayType);
        sb2.append(", child=");
        sb2.append(this.child);
        sb2.append(", isSelected=");
        sb2.append(this.f102942b);
        sb2.append(", onSelectActions=");
        sb2.append(this.onSelectActions);
        sb2.append(", onDeselectActions=");
        sb2.append(this.onDeselectActions);
        sb2.append(", onTapActions=");
        return H.p(sb2, this.onTapActions, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, i12);
        BeduinLayoutParams beduinLayoutParams = this.layoutParams;
        if (beduinLayoutParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinLayoutParams.writeToParcel(parcel, i12);
        }
        this.style.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.selectionDisplayType, i12);
        parcel.writeParcelable(this.child, i12);
        parcel.writeInt(this.f102942b ? 1 : 0);
        List<BeduinAction> list = this.onSelectActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        List<BeduinAction> list2 = this.onDeselectActions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        List<BeduinAction> list3 = this.onTapActions;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
        while (itA3.hasNext()) {
            parcel.writeParcelable((Parcelable) itA3.next(), i12);
        }
    }

    public /* synthetic */ BeduinCardItemContainerModel(String str, DisplayingPredicate displayingPredicate, BeduinLayoutParams beduinLayoutParams, Style style, SelectionDisplayType selectionDisplayType, BeduinModel beduinModel, boolean z12, List list, List list2, List list3, int i12, C42822w c42822w) {
        this(str, displayingPredicate, beduinLayoutParams, style, selectionDisplayType, beduinModel, (i12 & 64) != 0 ? false : z12, list, list2, list3);
    }
}
