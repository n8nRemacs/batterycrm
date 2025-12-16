package com.avito.android.beduin.common.component.checkbox_list_item;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.akita.compose.component.accordion.s;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinCheckableModel;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.beduin.common.component.checkbox.CheckboxState;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.CheckboxStateTransform;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.utils.C28809e;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinCheckboxListItemModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001kB\u008b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00062\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00060\u001fH\u0016¢\u0006\u0004\b\"\u0010#J#\u0010&\u001a\u00020%2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001b0\u001fH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020 2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b0\u00101J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b2\u00101J\u0018\u00103\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b3\u00101J\u0010\u00104\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b@\u0010AJ¬\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bD\u0010-J\u0010\u0010F\u001a\u00020EHÖ\u0001¢\u0006\u0004\bF\u0010GJ\u001a\u0010J\u001a\u00020\u001b2\b\u0010I\u001a\u0004\u0018\u00010HHÖ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020EHÖ\u0001¢\u0006\u0004\bL\u0010GJ \u0010P\u001a\u00020%2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020EHÖ\u0001¢\u0006\u0004\bP\u0010QR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010R\u001a\u0004\bS\u0010-R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010T\u001a\u0004\bU\u0010/R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010V\u001a\u0004\bW\u00101R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010V\u001a\u0004\bX\u00101R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010V\u001a\u0004\bY\u00101R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010Z\u001a\u0004\b[\u00105R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\\\u001a\u0004\b]\u00107R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010^\u001a\u0004\b_\u00109R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010`\u001a\u0004\ba\u0010;R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010b\u001a\u0004\bc\u0010=R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010d\u001a\u0004\be\u0010?R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010f\u001a\u0004\bg\u0010AR\u0014\u0010h\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010j\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010i¨\u0006l"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox_list_item/BeduinCheckboxListItemModel;", "Lcom/avito/android/beduin/common/component/BeduinCheckableModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "Lcom/avito/android/beduin_models/BeduinAction;", "onCheckedActions", "onUncheckedActions", "onCheckboxTapActions", "Lcom/avito/android/beduin/common/component/checkbox/CheckboxState;", VoiceInfo.STATE, "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lcom/avito/android/beduin/common/component/checkbox_list_item/BeduinCheckboxListItemModel$Content;", "content", "Lcom/avito/android/beduin/common/component/checkbox_list_item/CheckboxTapArea;", "checkboxTapArea", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", BeduinPromoBlockModel.SERIALIZED_NAME_PADDING, "Lcom/avito/android/remote/model/UniversalColor;", "selectedBackgroundColor", "Lcom/avito/android/beduin/common/component/checkbox_list_item/CheckboxVerticalPosition;", "checkboxVerticalPosition", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/component/checkbox/CheckboxState;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/beduin/common/component/checkbox_list_item/BeduinCheckboxListItemModel$Content;Lcom/avito/android/beduin/common/component/checkbox_list_item/CheckboxTapArea;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/checkbox_list_item/CheckboxVerticalPosition;)V", "", BeduinCartItemModel.CHECKED_STRING, "applyChecked", "(Z)Lcom/avito/android/beduin/common/component/BeduinCheckableModel;", "Lkotlin/Function1;", "Lcom/avito/android/beduin_models/BeduinModel;", "mapper", "flatMap", "(LY41/l;)Ljava/util/List;", "action", "Lkotlin/G0;", "forEach", "(LY41/l;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "()Lcom/avito/android/beduin/common/component/checkbox/CheckboxState;", "component7", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "component8", "()Lcom/avito/android/beduin/common/component/checkbox_list_item/BeduinCheckboxListItemModel$Content;", "component9", "()Lcom/avito/android/beduin/common/component/checkbox_list_item/CheckboxTapArea;", "component10", "()Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "component11", "()Lcom/avito/android/remote/model/UniversalColor;", "component12", "()Lcom/avito/android/beduin/common/component/checkbox_list_item/CheckboxVerticalPosition;", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin/common/component/checkbox/CheckboxState;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/beduin/common/component/checkbox_list_item/BeduinCheckboxListItemModel$Content;Lcom/avito/android/beduin/common/component/checkbox_list_item/CheckboxTapArea;Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;Lcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/beduin/common/component/checkbox_list_item/CheckboxVerticalPosition;)Lcom/avito/android/beduin/common/component/checkbox_list_item/BeduinCheckboxListItemModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/util/List;", "getOnCheckedActions", "getOnUncheckedActions", "getOnCheckboxTapActions", "Lcom/avito/android/beduin/common/component/checkbox/CheckboxState;", "getState", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "Lcom/avito/android/beduin/common/component/checkbox_list_item/BeduinCheckboxListItemModel$Content;", "getContent", "Lcom/avito/android/beduin/common/component/checkbox_list_item/CheckboxTapArea;", "getCheckboxTapArea", "Lcom/avito/android/beduin/common/component/model/BeduinContainerIndent;", "getPadding", "Lcom/avito/android/remote/model/UniversalColor;", "getSelectedBackgroundColor", "Lcom/avito/android/beduin/common/component/checkbox_list_item/CheckboxVerticalPosition;", "getCheckboxVerticalPosition", "isValid", "()Z", "isChecked", "Content", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinCheckboxListItemModel implements BeduinCheckableModel {

    @Y61.k
    public static final Parcelable.Creator<BeduinCheckboxListItemModel> CREATOR = new a();

    @Y61.l
    private final CheckboxTapArea checkboxTapArea;

    @Y61.l
    private final CheckboxVerticalPosition checkboxVerticalPosition;

    @Y61.k
    private final Content content;

    @Y61.l
    private final DisplayingPredicate displayingPredicate;

    @Y61.k
    private final String id;

    @Y61.l
    private final List<BeduinAction> onCheckboxTapActions;

    @Y61.l
    private final List<BeduinAction> onCheckedActions;

    @Y61.l
    private final List<BeduinAction> onUncheckedActions;

    @Y61.l
    private final BeduinContainerIndent padding;

    @Y61.l
    private final UniversalColor selectedBackgroundColor;

    @Y61.k
    private final CheckboxState state;

    @Y61.l
    private final BeduinComponentTheme theme;

    /* compiled from: BeduinCheckboxListItemModel.kt */
    @Keep
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/beduin/common/component/checkbox_list_item/BeduinCheckboxListItemModel$Content;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/beduin_models/BeduinModel;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "", "interItemSpacing", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/util/List;Ljava/lang/Integer;)Lcom/avito/android/beduin/common/component/checkbox_list_item/BeduinCheckboxListItemModel$Content;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getChildren", "Ljava/lang/Integer;", "getInterItemSpacing", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Content implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Content> CREATOR = new a();

        @Y61.k
        private final List<BeduinModel> children;

        @Y61.l
        private final Integer interItemSpacing;

        /* compiled from: BeduinCheckboxListItemModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Content> {
            @Override // android.os.Parcelable.Creator
            public final Content createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Content.class, parcel, arrayList, iL2, 1);
                }
                return new Content(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Content[] newArray(int i12) {
                return new Content[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Content(@Y61.k List<? extends BeduinModel> list, @Y61.l Integer num) {
            this.children = list;
            this.interItemSpacing = num;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, List list, Integer num, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                list = content.children;
            }
            if ((i12 & 2) != 0) {
                num = content.interItemSpacing;
            }
            return content.copy(list, num);
        }

        @Y61.k
        public final List<BeduinModel> component1() {
            return this.children;
        }

        @Y61.l
        /* renamed from: component2, reason: from getter */
        public final Integer getInterItemSpacing() {
            return this.interItemSpacing;
        }

        @Y61.k
        public final Content copy(@Y61.k List<? extends BeduinModel> children, @Y61.l Integer interItemSpacing) {
            return new Content(children, interItemSpacing);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return L.f(this.children, content.children) && L.f(this.interItemSpacing, content.interItemSpacing);
        }

        @Y61.k
        public final List<BeduinModel> getChildren() {
            return this.children;
        }

        @Y61.l
        public final Integer getInterItemSpacing() {
            return this.interItemSpacing;
        }

        public int hashCode() {
            int iHashCode = this.children.hashCode() * 31;
            Integer num = this.interItemSpacing;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Content(children=");
            sb2.append(this.children);
            sb2.append(", interItemSpacing=");
            return s.j(sb2, this.interItemSpacing, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int flags) {
            Iterator itJ = C0.j(this.children, parcel);
            while (itJ.hasNext()) {
                parcel.writeParcelable((Parcelable) itJ.next(), flags);
            }
            Integer num = this.interItemSpacing;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
        }
    }

    /* compiled from: BeduinCheckboxListItemModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinCheckboxListItemModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinCheckboxListItemModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinCheckboxListItemModel.class.getClassLoader());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinCheckboxListItemModel.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                int iL4 = 0;
                while (iL4 != i13) {
                    iL4 = com.avito.android.actions_sheet.a.l(BeduinCheckboxListItemModel.class, parcel, arrayList4, iL4, 1);
                }
                arrayList2 = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i14);
                while (iL2 != i14) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinCheckboxListItemModel.class, parcel, arrayList5, iL2, 1);
                }
                arrayList3 = arrayList5;
            }
            return new BeduinCheckboxListItemModel(string, displayingPredicate, arrayList, arrayList2, arrayList3, CheckboxState.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel), Content.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CheckboxTapArea.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : BeduinContainerIndent.CREATOR.createFromParcel(parcel), (UniversalColor) parcel.readParcelable(BeduinCheckboxListItemModel.class.getClassLoader()), parcel.readInt() != 0 ? CheckboxVerticalPosition.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinCheckboxListItemModel[] newArray(int i12) {
            return new BeduinCheckboxListItemModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinCheckboxListItemModel(@Y61.k String str, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l List<? extends BeduinAction> list, @Y61.l List<? extends BeduinAction> list2, @Y61.l List<? extends BeduinAction> list3, @Y61.k CheckboxState checkboxState, @Y61.l BeduinComponentTheme beduinComponentTheme, @Y61.k Content content, @Y61.l CheckboxTapArea checkboxTapArea, @Y61.l BeduinContainerIndent beduinContainerIndent, @Y61.l UniversalColor universalColor, @Y61.l CheckboxVerticalPosition checkboxVerticalPosition) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.onCheckedActions = list;
        this.onUncheckedActions = list2;
        this.onCheckboxTapActions = list3;
        this.state = checkboxState;
        this.theme = beduinComponentTheme;
        this.content = content;
        this.checkboxTapArea = checkboxTapArea;
        this.padding = beduinContainerIndent;
        this.selectedBackgroundColor = universalColor;
        this.checkboxVerticalPosition = checkboxVerticalPosition;
    }

    public static /* synthetic */ BeduinCheckboxListItemModel copy$default(BeduinCheckboxListItemModel beduinCheckboxListItemModel, String str, DisplayingPredicate displayingPredicate, List list, List list2, List list3, CheckboxState checkboxState, BeduinComponentTheme beduinComponentTheme, Content content, CheckboxTapArea checkboxTapArea, BeduinContainerIndent beduinContainerIndent, UniversalColor universalColor, CheckboxVerticalPosition checkboxVerticalPosition, int i12, Object obj) {
        return beduinCheckboxListItemModel.copy((i12 & 1) != 0 ? beduinCheckboxListItemModel.id : str, (i12 & 2) != 0 ? beduinCheckboxListItemModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinCheckboxListItemModel.onCheckedActions : list, (i12 & 8) != 0 ? beduinCheckboxListItemModel.onUncheckedActions : list2, (i12 & 16) != 0 ? beduinCheckboxListItemModel.onCheckboxTapActions : list3, (i12 & 32) != 0 ? beduinCheckboxListItemModel.state : checkboxState, (i12 & 64) != 0 ? beduinCheckboxListItemModel.theme : beduinComponentTheme, (i12 & 128) != 0 ? beduinCheckboxListItemModel.content : content, (i12 & 256) != 0 ? beduinCheckboxListItemModel.checkboxTapArea : checkboxTapArea, (i12 & 512) != 0 ? beduinCheckboxListItemModel.padding : beduinContainerIndent, (i12 & 1024) != 0 ? beduinCheckboxListItemModel.selectedBackgroundColor : universalColor, (i12 & 2048) != 0 ? beduinCheckboxListItemModel.checkboxVerticalPosition : checkboxVerticalPosition);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public BeduinModel apply(@Y61.k BeduinModelTransform transform) {
        return transform instanceof CheckboxStateTransform ? copy$default(this, null, null, null, null, null, ((CheckboxStateTransform) transform).getState(), null, null, null, null, null, null, 4063, null) : transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, null, null, null, null, 4093, null) : this;
    }

    @Override // com.avito.android.beduin.common.component.BeduinCheckableModel
    @Y61.k
    public BeduinCheckableModel applyChecked(boolean checked) {
        return copy$default(this, null, null, null, null, null, checked ? CheckboxState.CHECKED : CheckboxState.UNCHECKED, null, null, null, null, null, null, 4063, null);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: component10, reason: from getter */
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @Y61.l
    /* renamed from: component11, reason: from getter */
    public final UniversalColor getSelectedBackgroundColor() {
        return this.selectedBackgroundColor;
    }

    @Y61.l
    /* renamed from: component12, reason: from getter */
    public final CheckboxVerticalPosition getCheckboxVerticalPosition() {
        return this.checkboxVerticalPosition;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Y61.l
    public final List<BeduinAction> component3() {
        return this.onCheckedActions;
    }

    @Y61.l
    public final List<BeduinAction> component4() {
        return this.onUncheckedActions;
    }

    @Y61.l
    public final List<BeduinAction> component5() {
        return this.onCheckboxTapActions;
    }

    @Y61.k
    /* renamed from: component6, reason: from getter */
    public final CheckboxState getState() {
        return this.state;
    }

    @Y61.l
    /* renamed from: component7, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @Y61.k
    /* renamed from: component8, reason: from getter */
    public final Content getContent() {
        return this.content;
    }

    @Y61.l
    /* renamed from: component9, reason: from getter */
    public final CheckboxTapArea getCheckboxTapArea() {
        return this.checkboxTapArea;
    }

    @Y61.k
    public final BeduinCheckboxListItemModel copy(@Y61.k String id2, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l List<? extends BeduinAction> onCheckedActions, @Y61.l List<? extends BeduinAction> onUncheckedActions, @Y61.l List<? extends BeduinAction> onCheckboxTapActions, @Y61.k CheckboxState state, @Y61.l BeduinComponentTheme theme, @Y61.k Content content, @Y61.l CheckboxTapArea checkboxTapArea, @Y61.l BeduinContainerIndent padding, @Y61.l UniversalColor selectedBackgroundColor, @Y61.l CheckboxVerticalPosition checkboxVerticalPosition) {
        return new BeduinCheckboxListItemModel(id2, displayingPredicate, onCheckedActions, onUncheckedActions, onCheckboxTapActions, state, theme, content, checkboxTapArea, padding, selectedBackgroundColor, checkboxVerticalPosition);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinCheckboxListItemModel)) {
            return false;
        }
        BeduinCheckboxListItemModel beduinCheckboxListItemModel = (BeduinCheckboxListItemModel) other;
        return L.f(this.id, beduinCheckboxListItemModel.id) && L.f(this.displayingPredicate, beduinCheckboxListItemModel.displayingPredicate) && L.f(this.onCheckedActions, beduinCheckboxListItemModel.onCheckedActions) && L.f(this.onUncheckedActions, beduinCheckboxListItemModel.onUncheckedActions) && L.f(this.onCheckboxTapActions, beduinCheckboxListItemModel.onCheckboxTapActions) && this.state == beduinCheckboxListItemModel.state && this.theme == beduinCheckboxListItemModel.theme && L.f(this.content, beduinCheckboxListItemModel.content) && this.checkboxTapArea == beduinCheckboxListItemModel.checkboxTapArea && L.f(this.padding, beduinCheckboxListItemModel.padding) && L.f(this.selectedBackgroundColor, beduinCheckboxListItemModel.selectedBackgroundColor) && L.f(this.checkboxVerticalPosition, beduinCheckboxListItemModel.checkboxVerticalPosition);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public List<BeduinModel> flatMap(@Y61.k Y41.l<? super BeduinModel, ? extends List<? extends BeduinModel>> mapper) {
        Y41.l<? super BeduinModel, ? extends List<? extends BeduinModel>> lVar;
        ArrayList arrayListC = C28809e.c(mapper, this.content.getChildren());
        BeduinCheckboxListItemModel beduinCheckboxListItemModelCopy$default = arrayListC.equals(this.content.getChildren()) ? this : null;
        if (beduinCheckboxListItemModelCopy$default == null) {
            lVar = mapper;
            beduinCheckboxListItemModelCopy$default = copy$default(this, null, null, null, null, null, null, null, Content.copy$default(this.content, arrayListC, null, 2, null), null, null, null, null, 3967, null);
        } else {
            lVar = mapper;
        }
        return (List) lVar.invoke(beduinCheckboxListItemModelCopy$default);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public void forEach(@Y61.k Y41.l<? super BeduinModel, Boolean> action) {
        if (action.invoke(this).booleanValue()) {
            return;
        }
        C28809e.e(action, this.content.getChildren());
    }

    @Y61.l
    public final CheckboxTapArea getCheckboxTapArea() {
        return this.checkboxTapArea;
    }

    @Y61.l
    public final CheckboxVerticalPosition getCheckboxVerticalPosition() {
        return this.checkboxVerticalPosition;
    }

    @Y61.k
    public final Content getContent() {
        return this.content;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @Y61.l
    public final List<BeduinAction> getOnCheckboxTapActions() {
        return this.onCheckboxTapActions;
    }

    @Y61.l
    public final List<BeduinAction> getOnCheckedActions() {
        return this.onCheckedActions;
    }

    @Y61.l
    public final List<BeduinAction> getOnUncheckedActions() {
        return this.onUncheckedActions;
    }

    @Y61.l
    public final BeduinContainerIndent getPadding() {
        return this.padding;
    }

    @Y61.l
    public final UniversalColor getSelectedBackgroundColor() {
        return this.selectedBackgroundColor;
    }

    @Y61.k
    public final CheckboxState getState() {
        return this.state;
    }

    @Y61.l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        List<BeduinAction> list = this.onCheckedActions;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinAction> list2 = this.onUncheckedActions;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<BeduinAction> list3 = this.onCheckboxTapActions;
        int iHashCode5 = (this.state.hashCode() + ((iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31)) * 31;
        BeduinComponentTheme beduinComponentTheme = this.theme;
        int iHashCode6 = (this.content.hashCode() + ((iHashCode5 + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31)) * 31;
        CheckboxTapArea checkboxTapArea = this.checkboxTapArea;
        int iHashCode7 = (iHashCode6 + (checkboxTapArea == null ? 0 : checkboxTapArea.hashCode())) * 31;
        BeduinContainerIndent beduinContainerIndent = this.padding;
        int iHashCode8 = (iHashCode7 + (beduinContainerIndent == null ? 0 : beduinContainerIndent.hashCode())) * 31;
        UniversalColor universalColor = this.selectedBackgroundColor;
        int iHashCode9 = (iHashCode8 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        CheckboxVerticalPosition checkboxVerticalPosition = this.checkboxVerticalPosition;
        return iHashCode9 + (checkboxVerticalPosition != null ? checkboxVerticalPosition.hashCode() : 0);
    }

    @Override // com.avito.android.beduin.common.component.BeduinCheckableModel
    public boolean isChecked() {
        return this.state == CheckboxState.CHECKED;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    public boolean isValid() {
        return C28809e.f(this.content.getChildren());
    }

    @Y61.k
    public String toString() {
        return "BeduinCheckboxListItemModel(id=" + this.id + ", displayingPredicate=" + this.displayingPredicate + ", onCheckedActions=" + this.onCheckedActions + ", onUncheckedActions=" + this.onUncheckedActions + ", onCheckboxTapActions=" + this.onCheckboxTapActions + ", state=" + this.state + ", theme=" + this.theme + ", content=" + this.content + ", checkboxTapArea=" + this.checkboxTapArea + ", padding=" + this.padding + ", selectedBackgroundColor=" + this.selectedBackgroundColor + ", checkboxVerticalPosition=" + this.checkboxVerticalPosition + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        List<BeduinAction> list = this.onCheckedActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinAction> list2 = this.onUncheckedActions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        List<BeduinAction> list3 = this.onCheckboxTapActions;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), flags);
            }
        }
        parcel.writeString(this.state.name());
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
        this.content.writeToParcel(parcel, flags);
        CheckboxTapArea checkboxTapArea = this.checkboxTapArea;
        if (checkboxTapArea == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(checkboxTapArea.name());
        }
        BeduinContainerIndent beduinContainerIndent = this.padding;
        if (beduinContainerIndent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinContainerIndent.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.selectedBackgroundColor, flags);
        CheckboxVerticalPosition checkboxVerticalPosition = this.checkboxVerticalPosition;
        if (checkboxVerticalPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            checkboxVerticalPosition.writeToParcel(parcel, flags);
        }
    }
}
