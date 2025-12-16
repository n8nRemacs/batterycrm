package com.avito.android.beduin.common.container.horizontal_slider;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.BeduinContainerBackground;
import com.avito.android.beduin.common.container.BeduinContainerModel;
import com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel;
import com.avito.android.beduin.common.container.banner_gallery.BeduinBannerGalleryContainerPaginatorStyle;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.BackgroundTransform;
import com.avito.android.beduin.common.form.transforms.ChangePageTransform;
import com.avito.android.beduin.common.form.transforms.FakeScrollTransform;
import com.avito.android.beduin.common.form.transforms.ResetFakeScrollTransform;
import com.avito.android.beduin.common.form.transforms.ScrollToPositionTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: BeduinHorizontalSliderContainerModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B×\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J)\u0010(\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b0\u0010/J\u0012\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b7\u00106J\u0012\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b8\u00106J\u0012\u00109\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b9\u00106J\u0018\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b:\u00104J\u0010\u0010;\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\bA\u00106J\u0012\u0010B\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0018\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bD\u00104J\u0012\u0010E\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bE\u0010>J\u0012\u0010F\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0082\u0002\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 HÆ\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bJ\u0010+J\u0010\u0010K\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\bK\u0010LJ\u001a\u0010O\u001a\u00020\u00162\b\u0010N\u001a\u0004\u0018\u00010MHÖ\u0003¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\bQ\u0010LJ \u0010V\u001a\u00020U2\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\bV\u0010WR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010X\u001a\u0004\bY\u0010+R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010Z\u001a\u0004\b[\u0010-R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\\\u001a\u0004\b]\u0010/R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\\\u001a\u0004\b^\u0010/R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010_\u001a\u0004\b`\u00102R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010a\u001a\u0004\bb\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010c\u001a\u0004\bd\u00106R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010c\u001a\u0004\be\u00106R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010c\u001a\u0004\bf\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010c\u001a\u0004\bg\u00106R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010a\u001a\u0004\bh\u00104R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010i\u001a\u0004\b\u0017\u0010<R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010j\u001a\u0004\bk\u0010>R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010l\u001a\u0004\bm\u0010@R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010c\u001a\u0004\bn\u00106R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010o\u001a\u0004\bp\u0010CR\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010a\u001a\u0004\bq\u00104R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u001f\u0010j\u001a\u0004\br\u0010>R\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010s\u001a\u0004\bt\u0010GR\u0011\u0010v\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\bu\u0010<¨\u0006w"}, d2 = {"Lcom/avito/android/beduin/common/container/horizontal_slider/BeduinHorizontalSliderContainerModel;", "Lcom/avito/android/beduin/common/container/BeduinSingleChildOwnerModel;", "Lcom/avito/android/beduin/common/container/BeduinContainerModel;", "", "id", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND, "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, BeduinPromoBlockModel.SERIALIZED_NAME_MARGIN, "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin_models/BeduinModel;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "", "interItemSpacing", "initialPageIndex", "currentPageIndex", "scrollToPosition", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "", "isPagingEnabled", "scrollToPositionWithLeftAlign", "Lcom/avito/android/beduin/common/container/horizontal_slider/HorizontalSliderChildLayoutMode;", "layoutMode", "itemWidth", "Lcom/avito/android/beduin/common/container/banner_gallery/BeduinBannerGalleryContainerPaginatorStyle;", "paginatorStyle", "onPageSwipedActions", "alignLastItemLeft", "Lcom/avito/android/beduin/common/form/transforms/FakeScrollTransform;", "fakeScrollTransform", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;ZLjava/lang/Boolean;Lcom/avito/android/beduin/common/container/horizontal_slider/HorizontalSliderChildLayoutMode;Ljava/lang/Integer;Lcom/avito/android/beduin/common/container/banner_gallery/BeduinBannerGalleryContainerPaginatorStyle;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/form/transforms/FakeScrollTransform;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "create", "(Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "component3", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component4", "component5", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component6", "()Ljava/util/List;", "component7", "()Ljava/lang/Integer;", "component8", "component9", "component10", "component11", "component12", "()Z", "component13", "()Ljava/lang/Boolean;", "component14", "()Lcom/avito/android/beduin/common/container/horizontal_slider/HorizontalSliderChildLayoutMode;", "component15", "component16", "()Lcom/avito/android/beduin/common/container/banner_gallery/BeduinBannerGalleryContainerPaginatorStyle;", "component17", "component18", "component19", "()Lcom/avito/android/beduin/common/form/transforms/FakeScrollTransform;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin/common/container/BeduinContainerBackground;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;ZLjava/lang/Boolean;Lcom/avito/android/beduin/common/container/horizontal_slider/HorizontalSliderChildLayoutMode;Ljava/lang/Integer;Lcom/avito/android/beduin/common/container/banner_gallery/BeduinBannerGalleryContainerPaginatorStyle;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/form/transforms/FakeScrollTransform;)Lcom/avito/android/beduin/common/container/horizontal_slider/BeduinHorizontalSliderContainerModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin/common/container/BeduinContainerBackground;", "getBackground", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getPadding", "getMargin", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getChildren", "Ljava/lang/Integer;", "getInterItemSpacing", "getInitialPageIndex", "getCurrentPageIndex", "getScrollToPosition", "getActions", "Z", "Ljava/lang/Boolean;", "getScrollToPositionWithLeftAlign", "Lcom/avito/android/beduin/common/container/horizontal_slider/HorizontalSliderChildLayoutMode;", "getLayoutMode", "getItemWidth", "Lcom/avito/android/beduin/common/container/banner_gallery/BeduinBannerGalleryContainerPaginatorStyle;", "getPaginatorStyle", "getOnPageSwipedActions", "getAlignLastItemLeft", "Lcom/avito/android/beduin/common/form/transforms/FakeScrollTransform;", "getFakeScrollTransform", "getAlignLastItemLeftValue", "alignLastItemLeftValue", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinHorizontalSliderContainerModel extends BeduinSingleChildOwnerModel implements BeduinContainerModel {

    @Y61.k
    public static final Parcelable.Creator<BeduinHorizontalSliderContainerModel> CREATOR = new a();

    @Y61.l
    private final List<BeduinAction> actions;

    @Y61.l
    private final Boolean alignLastItemLeft;

    @Y61.l
    private final BeduinContainerBackground background;

    @Y61.l
    private final List<BeduinModel> children;

    @Y61.l
    private final Integer currentPageIndex;

    @Y61.l
    private final DisplayingPredicate displayingPredicate;

    @Y61.l
    private final FakeScrollTransform fakeScrollTransform;

    @Y61.k
    private final String id;

    @Y61.l
    private final Integer initialPageIndex;

    @Y61.l
    private final Integer interItemSpacing;
    private final boolean isPagingEnabled;

    @Y61.l
    private final Integer itemWidth;

    @Y61.l
    private final HorizontalSliderChildLayoutMode layoutMode;

    @Y61.l
    private final BeduinContainerIndent margin;

    @Y61.l
    private final List<BeduinAction> onPageSwipedActions;

    @Y61.l
    private final BeduinContainerIndent padding;

    @Y61.l
    private final BeduinBannerGalleryContainerPaginatorStyle paginatorStyle;

    @Y61.l
    private final Integer scrollToPosition;

    @Y61.l
    private final Boolean scrollToPositionWithLeftAlign;

    /* compiled from: BeduinHorizontalSliderContainerModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinHorizontalSliderContainerModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinHorizontalSliderContainerModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean boolValueOf;
            boolean z12;
            ArrayList arrayList3;
            Boolean boolValueOf2;
            String string = parcel.readString();
            BeduinContainerBackground beduinContainerBackgroundCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerBackground.CREATOR.createFromParcel(parcel);
            BeduinContainerIndent beduinContainerIndentCreateFromParcel = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            BeduinContainerIndent beduinContainerIndentCreateFromParcel2 = parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel);
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinHorizontalSliderContainerModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinHorizontalSliderContainerModel.class, parcel, arrayList, iL2, 1);
                }
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinHorizontalSliderContainerModel.class, parcel, arrayList2, iL3, 1);
                }
            }
            boolean z13 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            HorizontalSliderChildLayoutMode horizontalSliderChildLayoutModeValueOf = parcel.readInt() == 0 ? null : HorizontalSliderChildLayoutMode.valueOf(parcel.readString());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            BeduinBannerGalleryContainerPaginatorStyle beduinBannerGalleryContainerPaginatorStyleValueOf = parcel.readInt() == 0 ? null : BeduinBannerGalleryContainerPaginatorStyle.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                z12 = z13;
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i14);
                z12 = z13;
                int iL4 = 0;
                while (iL4 != i14) {
                    iL4 = com.avito.android.actions_sheet.a.l(BeduinHorizontalSliderContainerModel.class, parcel, arrayList4, iL4, 1);
                    i14 = i14;
                }
                arrayList3 = arrayList4;
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinHorizontalSliderContainerModel(string, beduinContainerBackgroundCreateFromParcel, beduinContainerIndentCreateFromParcel, beduinContainerIndentCreateFromParcel2, displayingPredicate, arrayList, numValueOf, numValueOf2, numValueOf3, numValueOf4, arrayList2, z12, boolValueOf, horizontalSliderChildLayoutModeValueOf, numValueOf5, beduinBannerGalleryContainerPaginatorStyleValueOf, arrayList3, boolValueOf2, parcel.readInt() == 0 ? null : FakeScrollTransform.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinHorizontalSliderContainerModel[] newArray(int i12) {
            return new BeduinHorizontalSliderContainerModel[i12];
        }
    }

    public /* synthetic */ BeduinHorizontalSliderContainerModel(String str, BeduinContainerBackground beduinContainerBackground, BeduinContainerIndent beduinContainerIndent, BeduinContainerIndent beduinContainerIndent2, DisplayingPredicate displayingPredicate, List list, Integer num, Integer num2, Integer num3, Integer num4, List list2, boolean z12, Boolean bool, HorizontalSliderChildLayoutMode horizontalSliderChildLayoutMode, Integer num5, BeduinBannerGalleryContainerPaginatorStyle beduinBannerGalleryContainerPaginatorStyle, List list3, Boolean bool2, FakeScrollTransform fakeScrollTransform, int i12, C42822w c42822w) {
        this(str, beduinContainerBackground, beduinContainerIndent, beduinContainerIndent2, displayingPredicate, list, num, num2, num3, num4, list2, (i12 & 2048) != 0 ? false : z12, bool, horizontalSliderChildLayoutMode, num5, beduinBannerGalleryContainerPaginatorStyle, list3, bool2, (i12 & 262144) != 0 ? null : fakeScrollTransform);
    }

    public static /* synthetic */ BeduinHorizontalSliderContainerModel copy$default(BeduinHorizontalSliderContainerModel beduinHorizontalSliderContainerModel, String str, BeduinContainerBackground beduinContainerBackground, BeduinContainerIndent beduinContainerIndent, BeduinContainerIndent beduinContainerIndent2, DisplayingPredicate displayingPredicate, List list, Integer num, Integer num2, Integer num3, Integer num4, List list2, boolean z12, Boolean bool, HorizontalSliderChildLayoutMode horizontalSliderChildLayoutMode, Integer num5, BeduinBannerGalleryContainerPaginatorStyle beduinBannerGalleryContainerPaginatorStyle, List list3, Boolean bool2, FakeScrollTransform fakeScrollTransform, int i12, Object obj) {
        return beduinHorizontalSliderContainerModel.copy((i12 & 1) != 0 ? beduinHorizontalSliderContainerModel.id : str, (i12 & 2) != 0 ? beduinHorizontalSliderContainerModel.background : beduinContainerBackground, (i12 & 4) != 0 ? beduinHorizontalSliderContainerModel.padding : beduinContainerIndent, (i12 & 8) != 0 ? beduinHorizontalSliderContainerModel.margin : beduinContainerIndent2, (i12 & 16) != 0 ? beduinHorizontalSliderContainerModel.displayingPredicate : displayingPredicate, (i12 & 32) != 0 ? beduinHorizontalSliderContainerModel.children : list, (i12 & 64) != 0 ? beduinHorizontalSliderContainerModel.interItemSpacing : num, (i12 & 128) != 0 ? beduinHorizontalSliderContainerModel.initialPageIndex : num2, (i12 & 256) != 0 ? beduinHorizontalSliderContainerModel.currentPageIndex : num3, (i12 & 512) != 0 ? beduinHorizontalSliderContainerModel.scrollToPosition : num4, (i12 & 1024) != 0 ? beduinHorizontalSliderContainerModel.actions : list2, (i12 & 2048) != 0 ? beduinHorizontalSliderContainerModel.isPagingEnabled : z12, (i12 & 4096) != 0 ? beduinHorizontalSliderContainerModel.scrollToPositionWithLeftAlign : bool, (i12 & 8192) != 0 ? beduinHorizontalSliderContainerModel.layoutMode : horizontalSliderChildLayoutMode, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? beduinHorizontalSliderContainerModel.itemWidth : num5, (i12 & 32768) != 0 ? beduinHorizontalSliderContainerModel.paginatorStyle : beduinBannerGalleryContainerPaginatorStyle, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? beduinHorizontalSliderContainerModel.onPageSwipedActions : list3, (i12 & 131072) != 0 ? beduinHorizontalSliderContainerModel.alignLastItemLeft : bool2, (i12 & 262144) != 0 ? beduinHorizontalSliderContainerModel.fakeScrollTransform : fakeScrollTransform);
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel, com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public BeduinModel apply(@Y61.k BeduinModelTransform transform) {
        return transform instanceof ScrollToPositionTransform ? copy$default(this, null, null, null, null, null, null, null, null, null, Integer.valueOf(((ScrollToPositionTransform) transform).getPosition()), null, false, null, null, null, null, null, null, null, 523775, null) : transform instanceof ChangePageTransform ? copy$default(this, null, null, null, null, null, null, null, null, Integer.valueOf(((ChangePageTransform) transform).f103378b), null, null, false, null, null, null, null, null, null, null, 524031, null) : transform instanceof FakeScrollTransform ? copy$default(this, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, (FakeScrollTransform) transform, 262143, null) : transform instanceof ResetFakeScrollTransform ? copy$default(this, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 262143, null) : transform instanceof BackgroundTransform ? copy$default(this, null, ((BackgroundTransform) transform).getBackground(), null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, 524285, null) : super.apply(transform);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: component10, reason: from getter */
    public final Integer getScrollToPosition() {
        return this.scrollToPosition;
    }

    @Y61.l
    public final List<BeduinAction> component11() {
        return this.actions;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsPagingEnabled() {
        return this.isPagingEnabled;
    }

    @Y61.l
    /* renamed from: component13, reason: from getter */
    public final Boolean getScrollToPositionWithLeftAlign() {
        return this.scrollToPositionWithLeftAlign;
    }

    @Y61.l
    /* renamed from: component14, reason: from getter */
    public final HorizontalSliderChildLayoutMode getLayoutMode() {
        return this.layoutMode;
    }

    @Y61.l
    /* renamed from: component15, reason: from getter */
    public final Integer getItemWidth() {
        return this.itemWidth;
    }

    @Y61.l
    /* renamed from: component16, reason: from getter */
    public final BeduinBannerGalleryContainerPaginatorStyle getPaginatorStyle() {
        return this.paginatorStyle;
    }

    @Y61.l
    public final List<BeduinAction> component17() {
        return this.onPageSwipedActions;
    }

    @Y61.l
    /* renamed from: component18, reason: from getter */
    public final Boolean getAlignLastItemLeft() {
        return this.alignLastItemLeft;
    }

    @Y61.l
    /* renamed from: component19, reason: from getter */
    public final FakeScrollTransform getFakeScrollTransform() {
        return this.fakeScrollTransform;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final BeduinContainerBackground getBackground() {
        return this.background;
    }

    @Y61.l
    /* renamed from: component3, reason: from getter */
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @Y61.l
    /* renamed from: component4, reason: from getter */
    public final BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @Y61.l
    /* renamed from: component5, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Y61.l
    public final List<BeduinModel> component6() {
        return this.children;
    }

    @Y61.l
    /* renamed from: component7, reason: from getter */
    public final Integer getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @Y61.l
    /* renamed from: component8, reason: from getter */
    public final Integer getInitialPageIndex() {
        return this.initialPageIndex;
    }

    @Y61.l
    /* renamed from: component9, reason: from getter */
    public final Integer getCurrentPageIndex() {
        return this.currentPageIndex;
    }

    @Y61.k
    public final BeduinHorizontalSliderContainerModel copy(@Y61.k String id2, @Y61.l BeduinContainerBackground background, @Y61.l BeduinContainerIndent padding, @Y61.l BeduinContainerIndent margin, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l List<? extends BeduinModel> children, @Y61.l Integer interItemSpacing, @Y61.l Integer initialPageIndex, @Y61.l Integer currentPageIndex, @Y61.l Integer scrollToPosition, @Y61.l List<? extends BeduinAction> actions, boolean isPagingEnabled, @Y61.l Boolean scrollToPositionWithLeftAlign, @Y61.l HorizontalSliderChildLayoutMode layoutMode, @Y61.l Integer itemWidth, @Y61.l BeduinBannerGalleryContainerPaginatorStyle paginatorStyle, @Y61.l List<? extends BeduinAction> onPageSwipedActions, @Y61.l Boolean alignLastItemLeft, @Y61.l FakeScrollTransform fakeScrollTransform) {
        return new BeduinHorizontalSliderContainerModel(id2, background, padding, margin, displayingPredicate, children, interItemSpacing, initialPageIndex, currentPageIndex, scrollToPosition, actions, isPagingEnabled, scrollToPositionWithLeftAlign, layoutMode, itemWidth, paginatorStyle, onPageSwipedActions, alignLastItemLeft, fakeScrollTransform);
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel
    @Y61.k
    public BeduinModel create(@Y61.l List<? extends BeduinModel> children, @Y61.l DisplayingPredicate displayingPredicate) {
        return copy$default(this, null, null, null, null, displayingPredicate, children, null, null, null, null, null, false, null, null, null, null, null, null, null, 524239, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinHorizontalSliderContainerModel)) {
            return false;
        }
        BeduinHorizontalSliderContainerModel beduinHorizontalSliderContainerModel = (BeduinHorizontalSliderContainerModel) other;
        return L.f(this.id, beduinHorizontalSliderContainerModel.id) && L.f(this.background, beduinHorizontalSliderContainerModel.background) && L.f(this.padding, beduinHorizontalSliderContainerModel.padding) && L.f(this.margin, beduinHorizontalSliderContainerModel.margin) && L.f(this.displayingPredicate, beduinHorizontalSliderContainerModel.displayingPredicate) && L.f(this.children, beduinHorizontalSliderContainerModel.children) && L.f(this.interItemSpacing, beduinHorizontalSliderContainerModel.interItemSpacing) && L.f(this.initialPageIndex, beduinHorizontalSliderContainerModel.initialPageIndex) && L.f(this.currentPageIndex, beduinHorizontalSliderContainerModel.currentPageIndex) && L.f(this.scrollToPosition, beduinHorizontalSliderContainerModel.scrollToPosition) && L.f(this.actions, beduinHorizontalSliderContainerModel.actions) && this.isPagingEnabled == beduinHorizontalSliderContainerModel.isPagingEnabled && L.f(this.scrollToPositionWithLeftAlign, beduinHorizontalSliderContainerModel.scrollToPositionWithLeftAlign) && this.layoutMode == beduinHorizontalSliderContainerModel.layoutMode && L.f(this.itemWidth, beduinHorizontalSliderContainerModel.itemWidth) && this.paginatorStyle == beduinHorizontalSliderContainerModel.paginatorStyle && L.f(this.onPageSwipedActions, beduinHorizontalSliderContainerModel.onPageSwipedActions) && L.f(this.alignLastItemLeft, beduinHorizontalSliderContainerModel.alignLastItemLeft) && L.f(this.fakeScrollTransform, beduinHorizontalSliderContainerModel.fakeScrollTransform);
    }

    @Y61.l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @Y61.l
    public final Boolean getAlignLastItemLeft() {
        return this.alignLastItemLeft;
    }

    public final boolean getAlignLastItemLeftValue() {
        Boolean bool = this.alignLastItemLeft;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @Y61.l
    public BeduinContainerBackground getBackground() {
        return this.background;
    }

    @Override // com.avito.android.beduin.common.container.BeduinSingleChildOwnerModel
    @Y61.l
    public List<BeduinModel> getChildren() {
        return this.children;
    }

    @Y61.l
    public final Integer getCurrentPageIndex() {
        return this.currentPageIndex;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @Y61.l
    public final FakeScrollTransform getFakeScrollTransform() {
        return this.fakeScrollTransform;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @Y61.l
    public final Integer getInitialPageIndex() {
        return this.initialPageIndex;
    }

    @Y61.l
    public final Integer getInterItemSpacing() {
        return this.interItemSpacing;
    }

    @Y61.l
    public final Integer getItemWidth() {
        return this.itemWidth;
    }

    @Y61.l
    public final HorizontalSliderChildLayoutMode getLayoutMode() {
        return this.layoutMode;
    }

    @Y61.l
    public BeduinContainerIndent getMargin() {
        return this.margin;
    }

    @Y61.l
    public final List<BeduinAction> getOnPageSwipedActions() {
        return this.onPageSwipedActions;
    }

    @Y61.l
    public BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @Y61.l
    public final BeduinBannerGalleryContainerPaginatorStyle getPaginatorStyle() {
        return this.paginatorStyle;
    }

    @Y61.l
    public final Integer getScrollToPosition() {
        return this.scrollToPosition;
    }

    @Y61.l
    public final Boolean getScrollToPositionWithLeftAlign() {
        return this.scrollToPositionWithLeftAlign;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        BeduinContainerBackground beduinContainerBackground = this.background;
        int iHashCode2 = (iHashCode + (beduinContainerBackground == null ? 0 : beduinContainerBackground.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.padding;
        int iHashCode3 = (iHashCode2 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent2 = this.margin;
        int iHashCode4 = (iHashCode3 + (beduinContainerIndent2 == null ? 0 : beduinContainerIndent2.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode5 = (iHashCode4 + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        List<BeduinModel> list = this.children;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.interItemSpacing;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.initialPageIndex;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.currentPageIndex;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.scrollToPosition;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<BeduinAction> list2 = this.actions;
        int i12 = r.i((iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.isPagingEnabled);
        Boolean bool = this.scrollToPositionWithLeftAlign;
        int iHashCode11 = (i12 + (bool == null ? 0 : bool.hashCode())) * 31;
        HorizontalSliderChildLayoutMode horizontalSliderChildLayoutMode = this.layoutMode;
        int iHashCode12 = (iHashCode11 + (horizontalSliderChildLayoutMode == null ? 0 : horizontalSliderChildLayoutMode.hashCode())) * 31;
        Integer num5 = this.itemWidth;
        int iHashCode13 = (iHashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        BeduinBannerGalleryContainerPaginatorStyle beduinBannerGalleryContainerPaginatorStyle = this.paginatorStyle;
        int iHashCode14 = (iHashCode13 + (beduinBannerGalleryContainerPaginatorStyle == null ? 0 : beduinBannerGalleryContainerPaginatorStyle.hashCode())) * 31;
        List<BeduinAction> list3 = this.onPageSwipedActions;
        int iHashCode15 = (iHashCode14 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool2 = this.alignLastItemLeft;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        FakeScrollTransform fakeScrollTransform = this.fakeScrollTransform;
        return iHashCode16 + (fakeScrollTransform != null ? fakeScrollTransform.hashCode() : 0);
    }

    public final boolean isPagingEnabled() {
        return this.isPagingEnabled;
    }

    @Y61.k
    public String toString() {
        return "BeduinHorizontalSliderContainerModel(id=" + this.id + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", displayingPredicate=" + this.displayingPredicate + ", children=" + this.children + ", interItemSpacing=" + this.interItemSpacing + ", initialPageIndex=" + this.initialPageIndex + ", currentPageIndex=" + this.currentPageIndex + ", scrollToPosition=" + this.scrollToPosition + ", actions=" + this.actions + ", isPagingEnabled=" + this.isPagingEnabled + ", scrollToPositionWithLeftAlign=" + this.scrollToPositionWithLeftAlign + ", layoutMode=" + this.layoutMode + ", itemWidth=" + this.itemWidth + ", paginatorStyle=" + this.paginatorStyle + ", onPageSwipedActions=" + this.onPageSwipedActions + ", alignLastItemLeft=" + this.alignLastItemLeft + ", fakeScrollTransform=" + this.fakeScrollTransform + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        BeduinContainerBackground beduinContainerBackground = this.background;
        if (beduinContainerBackground == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerBackground.writeToParcel(parcel, flags);
        }
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
        parcel.writeParcelable(this.displayingPredicate, flags);
        List<BeduinModel> list = this.children;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        Integer num = this.interItemSpacing;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.initialPageIndex;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.currentPageIndex;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        Integer num4 = this.scrollToPosition;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num4);
        }
        List<BeduinAction> list2 = this.actions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        parcel.writeInt(this.isPagingEnabled ? 1 : 0);
        Boolean bool = this.scrollToPositionWithLeftAlign;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        HorizontalSliderChildLayoutMode horizontalSliderChildLayoutMode = this.layoutMode;
        if (horizontalSliderChildLayoutMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(horizontalSliderChildLayoutMode.name());
        }
        Integer num5 = this.itemWidth;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num5);
        }
        BeduinBannerGalleryContainerPaginatorStyle beduinBannerGalleryContainerPaginatorStyle = this.paginatorStyle;
        if (beduinBannerGalleryContainerPaginatorStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(beduinBannerGalleryContainerPaginatorStyle.name());
        }
        List<BeduinAction> list3 = this.onPageSwipedActions;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), flags);
            }
        }
        Boolean bool2 = this.alignLastItemLeft;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        FakeScrollTransform fakeScrollTransform = this.fakeScrollTransform;
        if (fakeScrollTransform == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fakeScrollTransform.writeToParcel(parcel, flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinHorizontalSliderContainerModel(@Y61.k String str, @Y61.l BeduinContainerBackground beduinContainerBackground, @Y61.l BeduinContainerIndent beduinContainerIndent, @Y61.l BeduinContainerIndent beduinContainerIndent2, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l List<? extends BeduinModel> list, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Integer num4, @Y61.l List<? extends BeduinAction> list2, boolean z12, @Y61.l Boolean bool, @Y61.l HorizontalSliderChildLayoutMode horizontalSliderChildLayoutMode, @Y61.l Integer num5, @Y61.l BeduinBannerGalleryContainerPaginatorStyle beduinBannerGalleryContainerPaginatorStyle, @Y61.l List<? extends BeduinAction> list3, @Y61.l Boolean bool2, @Y61.l FakeScrollTransform fakeScrollTransform) {
        this.id = str;
        this.background = beduinContainerBackground;
        this.padding = beduinContainerIndent;
        this.margin = beduinContainerIndent2;
        this.displayingPredicate = displayingPredicate;
        this.children = list;
        this.interItemSpacing = num;
        this.initialPageIndex = num2;
        this.currentPageIndex = num3;
        this.scrollToPosition = num4;
        this.actions = list2;
        this.isPagingEnabled = z12;
        this.scrollToPositionWithLeftAlign = bool;
        this.layoutMode = horizontalSliderChildLayoutMode;
        this.itemWidth = num5;
        this.paginatorStyle = beduinBannerGalleryContainerPaginatorStyle;
        this.onPageSwipedActions = list3;
        this.alignLastItemLeft = bool2;
        this.fakeScrollTransform = fakeScrollTransform;
    }
}
