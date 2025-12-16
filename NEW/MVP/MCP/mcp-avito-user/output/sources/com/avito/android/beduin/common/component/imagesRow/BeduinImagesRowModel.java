package com.avito.android.beduin.common.component.imagesRow;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.image.ImageStyle;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinImagesRowModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 ]2\u00020\u0001:\u0001^B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b/\u0010+J\u0012\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b2\u0010'J\u0010\u00103\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b5\u0010#J\u0012\u00106\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b6\u00107J¦\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010#J\u0010\u0010;\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b;\u0010+J\u001a\u0010>\u001a\u00020\t2\b\u0010=\u001a\u0004\u0018\u00010<HÖ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b@\u0010+J \u0010E\u001a\u00020D2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\bE\u0010FR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010#R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010I\u001a\u0004\bJ\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010K\u001a\u0004\bL\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010M\u001a\u0004\bN\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010O\u001a\u0004\bP\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010Q\u001a\u0004\bR\u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010Q\u001a\u0004\bS\u0010-R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bT\u0010+R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010U\u001a\u0004\bV\u00101R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bW\u0010'R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010X\u001a\u0004\bY\u00104R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010G\u001a\u0004\bZ\u0010#R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010[\u001a\u0004\b\\\u00107¨\u0006_"}, d2 = {"Lcom/avito/android/beduin/common/component/imagesRow/BeduinImagesRowModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "", "Lcom/avito/android/beduin/common/component/imagesRow/Image;", "images", "Lcom/avito/android/beduin/common/component/image/ImageStyle;", "imageStyle", "", "shouldOpenGallery", "", "height", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "interItemSpacing", "maxImagesCount", "lastImageStyle", "Lcom/avito/android/remote/model/UniversalColor;", "counterTextColor", "counterTextStyle", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/beduin/common/component/image/ImageStyle;Ljava/lang/Boolean;ILcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;ILjava/lang/Integer;Lcom/avito/android/beduin/common/component/image/ImageStyle;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "parentWidthInDp", "getVisibleImages", "(I)Ljava/util/List;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/avito/android/beduin/common/component/image/ImageStyle;", "component4", "()Ljava/lang/Boolean;", "component5", "()I", "component6", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component7", "component8", "component9", "()Ljava/lang/Integer;", "component10", "component11", "()Lcom/avito/android/remote/model/UniversalColor;", "component12", "component13", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/beduin/common/component/image/ImageStyle;Ljava/lang/Boolean;ILcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;ILjava/lang/Integer;Lcom/avito/android/beduin/common/component/image/ImageStyle;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin/common/component/imagesRow/BeduinImagesRowModel;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getImages", "Lcom/avito/android/beduin/common/component/image/ImageStyle;", "getImageStyle", "Ljava/lang/Boolean;", "getShouldOpenGallery", "I", "getHeight", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getPadding", "getMargin", "getInterItemSpacing", "Ljava/lang/Integer;", "getMaxImagesCount", "getLastImageStyle", "Lcom/avito/android/remote/model/UniversalColor;", "getCounterTextColor", "getCounterTextStyle", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Companion", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinImagesRowModel extends LeafBeduinModel {

    @k
    private final UniversalColor counterTextColor;

    @k
    private final String counterTextStyle;

    @l
    private final DisplayingPredicate displayingPredicate;
    private final int height;

    @k
    private final String id;

    @l
    private final ImageStyle imageStyle;

    @k
    private final List<Image> images;
    private final int interItemSpacing;

    @l
    private final ImageStyle lastImageStyle;

    @l
    private final BeduinContainerIndent margin;

    @l
    private final Integer maxImagesCount;

    @l
    private final BeduinContainerIndent padding;

    @l
    private final Boolean shouldOpenGallery;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<BeduinImagesRowModel> CREATOR = new b();

    @k
    private static final List<String> types = Collections.singletonList("imagesRow");

    @k
    private static final Class<? extends BeduinModel> model = BeduinImagesRowModel.class;

    /* compiled from: BeduinImagesRowModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/imagesRow/BeduinImagesRowModel$a;", "Lcom/avito/android/beduin/common/component/b;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.beduin.common.component.imagesRow.BeduinImagesRowModel$a, reason: from kotlin metadata */
    public static final class Companion implements com.avito.android.beduin.common.component.b {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final Class<? extends BeduinModel> S() {
            return BeduinImagesRowModel.model;
        }

        @Override // com.avito.android.beduin.common.component.b
        @k
        public final List<String> a() {
            return BeduinImagesRowModel.types;
        }

        public Companion() {
        }
    }

    /* compiled from: BeduinImagesRowModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BeduinImagesRowModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinImagesRowModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Image.CREATOR, parcel, arrayList, iC2, 1);
            }
            ImageStyle imageStyleCreateFromParcel = parcel.readInt() == 0 ? null : ImageStyle.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinImagesRowModel(string, arrayList, imageStyleCreateFromParcel, boolValueOf, parcel.readInt(), parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? ImageStyle.CREATOR.createFromParcel(parcel) : null, (UniversalColor) parcel.readParcelable(BeduinImagesRowModel.class.getClassLoader()), parcel.readString(), (DisplayingPredicate) parcel.readParcelable(BeduinImagesRowModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinImagesRowModel[] newArray(int i12) {
            return new BeduinImagesRowModel[i12];
        }
    }

    public BeduinImagesRowModel(@k String str, @k List<Image> list, @l ImageStyle imageStyle, @l Boolean bool, int i12, @l BeduinContainerIndent beduinContainerIndent, @l BeduinContainerIndent beduinContainerIndent2, int i13, @l Integer num, @l ImageStyle imageStyle2, @k UniversalColor universalColor, @k String str2, @l DisplayingPredicate displayingPredicate) {
        this.id = str;
        this.images = list;
        this.imageStyle = imageStyle;
        this.shouldOpenGallery = bool;
        this.height = i12;
        this.padding = beduinContainerIndent;
        this.margin = beduinContainerIndent2;
        this.interItemSpacing = i13;
        this.maxImagesCount = num;
        this.lastImageStyle = imageStyle2;
        this.counterTextColor = universalColor;
        this.counterTextStyle = str2;
        this.displayingPredicate = displayingPredicate;
    }

    public static /* synthetic */ BeduinImagesRowModel copy$default(BeduinImagesRowModel beduinImagesRowModel, String str, List list, ImageStyle imageStyle, Boolean bool, int i12, BeduinContainerIndent beduinContainerIndent, BeduinContainerIndent beduinContainerIndent2, int i13, Integer num, ImageStyle imageStyle2, UniversalColor universalColor, String str2, DisplayingPredicate displayingPredicate, int i14, Object obj) {
        return beduinImagesRowModel.copy((i14 & 1) != 0 ? beduinImagesRowModel.id : str, (i14 & 2) != 0 ? beduinImagesRowModel.images : list, (i14 & 4) != 0 ? beduinImagesRowModel.imageStyle : imageStyle, (i14 & 8) != 0 ? beduinImagesRowModel.shouldOpenGallery : bool, (i14 & 16) != 0 ? beduinImagesRowModel.height : i12, (i14 & 32) != 0 ? beduinImagesRowModel.padding : beduinContainerIndent, (i14 & 64) != 0 ? beduinImagesRowModel.margin : beduinContainerIndent2, (i14 & 128) != 0 ? beduinImagesRowModel.interItemSpacing : i13, (i14 & 256) != 0 ? beduinImagesRowModel.maxImagesCount : num, (i14 & 512) != 0 ? beduinImagesRowModel.lastImageStyle : imageStyle2, (i14 & 1024) != 0 ? beduinImagesRowModel.counterTextColor : universalColor, (i14 & 2048) != 0 ? beduinImagesRowModel.counterTextStyle : str2, (i14 & 4096) != 0 ? beduinImagesRowModel.displayingPredicate : displayingPredicate);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, null, 0, null, null, 0, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), 4095, null) : this;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final ImageStyle getLastImageStyle() {
        return this.lastImageStyle;
    }

    @k
    /* renamed from: component11, reason: from getter */
    public final UniversalColor getCounterTextColor() {
        return this.counterTextColor;
    }

    @k
    /* renamed from: component12, reason: from getter */
    public final String getCounterTextStyle() {
        return this.counterTextStyle;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @k
    public final List<Image> component2() {
        return this.images;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final ImageStyle getImageStyle() {
        return this.imageStyle;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getShouldOpenGallery() {
        return this.shouldOpenGallery;
    }

    /* renamed from: component5, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    /* renamed from: component8, reason: from getter */
    public final int getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Integer getMaxImagesCount() {
        return this.maxImagesCount;
    }

    @k
    public final BeduinImagesRowModel copy(@k String id2, @k List<Image> images, @l ImageStyle imageStyle, @l Boolean shouldOpenGallery, int height, @l BeduinContainerIndent padding, @l BeduinContainerIndent margin, int interItemSpacing, @l Integer maxImagesCount, @l ImageStyle lastImageStyle, @k UniversalColor counterTextColor, @k String counterTextStyle, @l DisplayingPredicate displayingPredicate) {
        return new BeduinImagesRowModel(id2, images, imageStyle, shouldOpenGallery, height, padding, margin, interItemSpacing, maxImagesCount, lastImageStyle, counterTextColor, counterTextStyle, displayingPredicate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinImagesRowModel)) {
            return false;
        }
        BeduinImagesRowModel beduinImagesRowModel = (BeduinImagesRowModel) other;
        return L.f(this.id, beduinImagesRowModel.id) && L.f(this.images, beduinImagesRowModel.images) && L.f(this.imageStyle, beduinImagesRowModel.imageStyle) && L.f(this.shouldOpenGallery, beduinImagesRowModel.shouldOpenGallery) && this.height == beduinImagesRowModel.height && L.f(this.padding, beduinImagesRowModel.padding) && L.f(this.margin, beduinImagesRowModel.margin) && this.interItemSpacing == beduinImagesRowModel.interItemSpacing && L.f(this.maxImagesCount, beduinImagesRowModel.maxImagesCount) && L.f(this.lastImageStyle, beduinImagesRowModel.lastImageStyle) && L.f(this.counterTextColor, beduinImagesRowModel.counterTextColor) && L.f(this.counterTextStyle, beduinImagesRowModel.counterTextStyle) && L.f(this.displayingPredicate, beduinImagesRowModel.displayingPredicate);
    }

    @k
    public final UniversalColor getCounterTextColor() {
        return this.counterTextColor;
    }

    @k
    public final String getCounterTextStyle() {
        return this.counterTextStyle;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @l
    public final ImageStyle getImageStyle() {
        return this.imageStyle;
    }

    @k
    public final List<Image> getImages() {
        return this.images;
    }

    public final int getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @l
    public final ImageStyle getLastImageStyle() {
        return this.lastImageStyle;
    }

    @l
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @l
    public final Integer getMaxImagesCount() {
        return this.maxImagesCount;
    }

    @l
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @l
    public final Boolean getShouldOpenGallery() {
        return this.shouldOpenGallery;
    }

    @k
    public final List<Image> getVisibleImages(int parentWidthInDp) {
        Integer right;
        Integer left;
        BeduinContainerIndent beduinContainerIndent = this.padding;
        int iIntValue = parentWidthInDp - ((beduinContainerIndent == null || (left = beduinContainerIndent.getLeft()) == null) ? 0 : left.intValue());
        BeduinContainerIndent beduinContainerIndent2 = this.padding;
        int iIntValue2 = iIntValue - ((beduinContainerIndent2 == null || (right = beduinContainerIndent2.getRight()) == null) ? 0 : right.intValue());
        int size = this.images.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            int width = e.a(this.images.get(i13), this.height).getWidth();
            Integer num = this.maxImagesCount;
            if (iIntValue2 <= width || (num != null && i12 >= num.intValue())) {
                break;
            }
            i12++;
            iIntValue2 -= width + this.interItemSpacing;
        }
        return C42745f0.E0(this.images, i12);
    }

    public int hashCode() {
        int iE2 = H.e(this.id.hashCode() * 31, 31, this.images);
        ImageStyle imageStyle = this.imageStyle;
        int iHashCode = (iE2 + (imageStyle == null ? 0 : imageStyle.hashCode())) * 31;
        Boolean bool = this.shouldOpenGallery;
        int iE3 = r.e(this.height, (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        BeduinContainerIndent beduinContainerIndent = this.padding;
        int iHashCode2 = (iE3 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent2 = this.margin;
        int iE4 = r.e(this.interItemSpacing, (iHashCode2 + (beduinContainerIndent2 == null ? 0 : beduinContainerIndent2.hashCode())) * 31, 31);
        Integer num = this.maxImagesCount;
        int iHashCode3 = (iE4 + (num == null ? 0 : num.hashCode())) * 31;
        ImageStyle imageStyle2 = this.lastImageStyle;
        int iD2 = H.d(com.avito.android.actions_sheet.a.i(this.counterTextColor, (iHashCode3 + (imageStyle2 == null ? 0 : imageStyle2.hashCode())) * 31, 31), 31, this.counterTextStyle);
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return iD2 + (displayingPredicate != null ? displayingPredicate.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinImagesRowModel(id=");
        sb2.append(this.id);
        sb2.append(", images=");
        sb2.append(this.images);
        sb2.append(", imageStyle=");
        sb2.append(this.imageStyle);
        sb2.append(", shouldOpenGallery=");
        sb2.append(this.shouldOpenGallery);
        sb2.append(", height=");
        sb2.append(this.height);
        sb2.append(", padding=");
        sb2.append(this.padding);
        sb2.append(", margin=");
        sb2.append(this.margin);
        sb2.append(", interItemSpacing=");
        sb2.append(this.interItemSpacing);
        sb2.append(", maxImagesCount=");
        sb2.append(this.maxImagesCount);
        sb2.append(", lastImageStyle=");
        sb2.append(this.lastImageStyle);
        sb2.append(", counterTextColor=");
        sb2.append(this.counterTextColor);
        sb2.append(", counterTextStyle=");
        sb2.append(this.counterTextStyle);
        sb2.append(", displayingPredicate=");
        return AK.c.l(sb2, this.displayingPredicate, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        Iterator itJ = C0.j(this.images, parcel);
        while (itJ.hasNext()) {
            ((Image) itJ.next()).writeToParcel(parcel, flags);
        }
        ImageStyle imageStyle = this.imageStyle;
        if (imageStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageStyle.writeToParcel(parcel, flags);
        }
        Boolean bool = this.shouldOpenGallery;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeInt(this.height);
        BeduinContainerIndent beduinContainerIndent = this.padding;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
        BeduinContainerIndent beduinContainerIndent2 = this.margin;
        if (beduinContainerIndent2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent2.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.interItemSpacing);
        Integer num = this.maxImagesCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        ImageStyle imageStyle2 = this.lastImageStyle;
        if (imageStyle2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            imageStyle2.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.counterTextColor, flags);
        parcel.writeString(this.counterTextStyle);
        parcel.writeParcelable(this.displayingPredicate, flags);
    }
}
