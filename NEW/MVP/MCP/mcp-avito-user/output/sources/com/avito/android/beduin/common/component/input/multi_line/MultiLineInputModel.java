package com.avito.android.beduin.common.component.input.multi_line;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.common.component.input.InputIcon;
import com.avito.android.beduin.common.component.input.j;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.ErrorMessageTransform;
import com.avito.android.beduin.common.form.transforms.IsEnabledTransform;
import com.avito.android.beduin.common.form.transforms.LocalErrorMessageTransform;
import com.avito.android.beduin.common.form.transforms.LocalTextTransform;
import com.avito.android.beduin.common.form.transforms.ShowErrorMessageTransform;
import com.avito.android.beduin.common.form.transforms.ShowRightIconTransform;
import com.avito.android.beduin.network.model.Constraint;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.beduin_shared.common.form.transforms.TextTransform;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: MultiLineInputModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000f\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010(J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010(J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010(J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b0\u0010/J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010(J\u0012\u00102\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b4\u00105J\u0012\u00106\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b6\u00107J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b8\u0010/J\u0012\u00109\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b9\u00103J\u0018\u0010:\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b:\u0010/J\u0012\u0010;\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b;\u00107J\u0012\u0010<\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b>\u00103J\u0094\u0002\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bA\u0010(J\u0010\u0010B\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010F\u001a\u00020\u000f2\b\u0010E\u001a\u0004\u0018\u00010DHÖ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\bH\u0010CJ \u0010M\u001a\u00020L2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010\u0013HÂ\u0003¢\u0006\u0004\bO\u00107J\u0012\u0010P\u001a\u0004\u0018\u00010\u0013HÂ\u0003¢\u0006\u0004\bP\u00107R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010Q\u001a\u0004\bR\u0010(R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010Q\u001a\u0004\bS\u0010(R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010Q\u001a\u0004\bT\u0010(R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010Q\u001a\u0004\bU\u0010(R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010Q\u001a\u0004\bV\u0010(R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010Q\u001a\u0004\bW\u0010(R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010X\u001a\u0004\bY\u0010/R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010X\u001a\u0004\bZ\u0010/R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010Q\u001a\u0004\b[\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\\\u001a\u0004\b]\u00103R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010^\u001a\u0004\b_\u00105R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010`\u001a\u0004\ba\u00107R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010`R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010`R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010X\u001a\u0004\bb\u0010/R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\\\u001a\u0004\b\u0018\u00103R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010X\u001a\u0004\bc\u0010/R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010`\u001a\u0004\bd\u00107R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010e\u001a\u0004\bf\u0010=R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\\\u001a\u0004\bg\u00103R\u0011\u0010i\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bh\u0010CR\u0011\u0010k\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\bj\u0010C¨\u0006l"}, d2 = {"Lcom/avito/android/beduin/common/component/input/multi_line/MultiLineInputModel;", "Lcom/avito/android/beduin/common/component/input/BeduinInputModel;", "", "id", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "text", "details", ChannelContext.Item.PLACEHOLDER, "", "Lcom/avito/android/beduin/network/model/Constraint;", "constraints", "Lcom/avito/android/beduin_models/BeduinAction;", "onEndEditingActions", "errorMessage", "", "showErrorMessage", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "", "textVersion", "maximumLinesNumber", "minimumLinesNumber", "onFocusedActions", "isEnabled", "onTextChangeActions", "maxLength", "Lcom/avito/android/beduin/common/component/input/InputIcon;", "rightIcon", "showRightIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/input/InputIcon;Ljava/lang/Boolean;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "validateModelByConstraints", "()Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "component10", "()Ljava/lang/Boolean;", "component11", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component12", "()Ljava/lang/Integer;", "component15", "component16", "component17", "component18", "component19", "()Lcom/avito/android/beduin/common/component/input/InputIcon;", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Lcom/avito/android/beduin/common/component/input/InputIcon;Ljava/lang/Boolean;)Lcom/avito/android/beduin/common/component/input/multi_line/MultiLineInputModel;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component13", "component14", "Ljava/lang/String;", "getId", "getTheme", "getStyle", "getText", "getDetails", "getPlaceholder", "Ljava/util/List;", "getConstraints", "getOnEndEditingActions", "getErrorMessage", "Ljava/lang/Boolean;", "getShowErrorMessage", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Ljava/lang/Integer;", "getTextVersion", "getOnFocusedActions", "getOnTextChangeActions", "getMaxLength", "Lcom/avito/android/beduin/common/component/input/InputIcon;", "getRightIcon", "getShowRightIcon", "getMinLinesNumber", "minLinesNumber", "getMaxLinesNumber", "maxLinesNumber", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class MultiLineInputModel extends BeduinInputModel {

    @k
    public static final Parcelable.Creator<MultiLineInputModel> CREATOR = new a();

    @l
    private final List<Constraint> constraints;

    @l
    private final String details;

    @l
    private final DisplayingPredicate displayingPredicate;

    @l
    private final String errorMessage;

    @k
    private final String id;

    @l
    private final Boolean isEnabled;

    @l
    private final Integer maxLength;

    @l
    private final Integer maximumLinesNumber;

    @l
    private final Integer minimumLinesNumber;

    @l
    private final List<BeduinAction> onEndEditingActions;

    @l
    private final List<BeduinAction> onFocusedActions;

    @l
    private final List<BeduinAction> onTextChangeActions;

    @l
    private final String placeholder;

    @l
    private final InputIcon rightIcon;

    @l
    private final Boolean showErrorMessage;

    @l
    private final Boolean showRightIcon;

    @l
    private final String style;

    @k
    private final String text;

    @l
    private final Integer textVersion;

    @l
    private final String theme;

    /* compiled from: MultiLineInputModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MultiLineInputModel> {
        @Override // android.os.Parcelable.Creator
        public final MultiLineInputModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Boolean boolValueOf;
            ArrayList arrayList3;
            Boolean boolValueOf2;
            ArrayList arrayList4;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(MultiLineInputModel.class, parcel, arrayList5, iL2, 1);
                }
                arrayList = arrayList5;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(MultiLineInputModel.class, parcel, arrayList2, iL3, 1);
                }
            }
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(MultiLineInputModel.class.getClassLoader());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i14);
                int iL4 = 0;
                while (iL4 != i14) {
                    iL4 = com.avito.android.actions_sheet.a.l(MultiLineInputModel.class, parcel, arrayList6, iL4, 1);
                    i14 = i14;
                }
                arrayList3 = arrayList6;
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i15);
                int iL5 = 0;
                while (iL5 != i15) {
                    iL5 = com.avito.android.actions_sheet.a.l(MultiLineInputModel.class, parcel, arrayList7, iL5, 1);
                    i15 = i15;
                }
                arrayList4 = arrayList7;
            }
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            InputIcon inputIconCreateFromParcel = parcel.readInt() == 0 ? null : InputIcon.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MultiLineInputModel(string, string2, string3, string4, string5, string6, arrayList, arrayList2, string7, boolValueOf, displayingPredicate, numValueOf, numValueOf2, numValueOf3, arrayList3, boolValueOf2, arrayList4, numValueOf4, inputIconCreateFromParcel, boolValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final MultiLineInputModel[] newArray(int i12) {
            return new MultiLineInputModel[i12];
        }
    }

    public /* synthetic */ MultiLineInputModel(String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, String str7, Boolean bool, DisplayingPredicate displayingPredicate, Integer num, Integer num2, Integer num3, List list3, Boolean bool2, List list4, Integer num4, InputIcon inputIcon, Boolean bool3, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, str5, str6, list, list2, str7, bool, displayingPredicate, num, num2, num3, list3, bool2, list4, num4, inputIcon, (i12 & 524288) != 0 ? null : bool3);
    }

    /* renamed from: component13, reason: from getter */
    private final Integer getMaximumLinesNumber() {
        return this.maximumLinesNumber;
    }

    /* renamed from: component14, reason: from getter */
    private final Integer getMinimumLinesNumber() {
        return this.minimumLinesNumber;
    }

    public static /* synthetic */ MultiLineInputModel copy$default(MultiLineInputModel multiLineInputModel, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, String str7, Boolean bool, DisplayingPredicate displayingPredicate, Integer num, Integer num2, Integer num3, List list3, Boolean bool2, List list4, Integer num4, InputIcon inputIcon, Boolean bool3, int i12, Object obj) {
        return multiLineInputModel.copy((i12 & 1) != 0 ? multiLineInputModel.id : str, (i12 & 2) != 0 ? multiLineInputModel.theme : str2, (i12 & 4) != 0 ? multiLineInputModel.style : str3, (i12 & 8) != 0 ? multiLineInputModel.text : str4, (i12 & 16) != 0 ? multiLineInputModel.details : str5, (i12 & 32) != 0 ? multiLineInputModel.placeholder : str6, (i12 & 64) != 0 ? multiLineInputModel.constraints : list, (i12 & 128) != 0 ? multiLineInputModel.onEndEditingActions : list2, (i12 & 256) != 0 ? multiLineInputModel.errorMessage : str7, (i12 & 512) != 0 ? multiLineInputModel.showErrorMessage : bool, (i12 & 1024) != 0 ? multiLineInputModel.displayingPredicate : displayingPredicate, (i12 & 2048) != 0 ? multiLineInputModel.textVersion : num, (i12 & 4096) != 0 ? multiLineInputModel.maximumLinesNumber : num2, (i12 & 8192) != 0 ? multiLineInputModel.minimumLinesNumber : num3, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? multiLineInputModel.onFocusedActions : list3, (i12 & 32768) != 0 ? multiLineInputModel.isEnabled : bool2, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? multiLineInputModel.onTextChangeActions : list4, (i12 & 131072) != 0 ? multiLineInputModel.maxLength : num4, (i12 & 262144) != 0 ? multiLineInputModel.rightIcon : inputIcon, (i12 & 524288) != 0 ? multiLineInputModel.showRightIcon : bool3);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        if (transform instanceof DisplayPredicateTransform) {
            return copy$default(this, null, null, null, null, null, null, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, null, null, null, 1047551, null);
        }
        if (transform instanceof TextTransform) {
            return copy$default(this, null, null, null, ((TextTransform) transform).getText(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048567, null);
        }
        if (!(transform instanceof LocalTextTransform)) {
            return transform instanceof LocalErrorMessageTransform ? copy$default(this, null, null, null, null, null, null, null, null, ((LocalErrorMessageTransform) transform).f103386b, null, null, null, null, null, null, null, null, null, null, null, 1048319, null) : transform instanceof ErrorMessageTransform ? copy$default(this, null, null, null, null, null, null, null, null, ((ErrorMessageTransform) transform).getErrorMessage(), null, null, null, null, null, null, null, null, null, null, null, 1048319, null) : transform instanceof ShowErrorMessageTransform ? copy$default(this, null, null, null, null, null, null, null, null, null, Boolean.valueOf(((ShowErrorMessageTransform) transform).getShowErrorMessage()), null, null, null, null, null, null, null, null, null, null, 1048063, null) : transform instanceof IsEnabledTransform ? copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(((IsEnabledTransform) transform).isEnabled()), null, null, null, null, 1015807, null) : transform instanceof ShowRightIconTransform ? copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(((ShowRightIconTransform) transform).f103408b), 524287, null) : this;
        }
        LocalTextTransform localTextTransform = (LocalTextTransform) transform;
        return copy$default(this, null, null, null, localTextTransform.f103387b, null, null, null, null, null, null, null, Integer.valueOf(localTextTransform.f103388c), null, null, null, null, null, null, null, null, 1046519, null);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Boolean getShowErrorMessage() {
        return this.showErrorMessage;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final Integer getTextVersion() {
        return this.textVersion;
    }

    @l
    public final List<BeduinAction> component15() {
        return this.onFocusedActions;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @l
    public final List<BeduinAction> component17() {
        return this.onTextChangeActions;
    }

    @l
    /* renamed from: component18, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    @l
    /* renamed from: component19, reason: from getter */
    public final InputIcon getRightIcon() {
        return this.rightIcon;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    @l
    /* renamed from: component20, reason: from getter */
    public final Boolean getShowRightIcon() {
        return this.showRightIcon;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getDetails() {
        return this.details;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    public final List<Constraint> component7() {
        return this.constraints;
    }

    @l
    public final List<BeduinAction> component8() {
        return this.onEndEditingActions;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @k
    public final MultiLineInputModel copy(@k String id2, @l String theme, @l String style, @k String text, @l String details, @l String placeholder, @l List<? extends Constraint> constraints, @l List<? extends BeduinAction> onEndEditingActions, @l String errorMessage, @l Boolean showErrorMessage, @l DisplayingPredicate displayingPredicate, @l Integer textVersion, @l Integer maximumLinesNumber, @l Integer minimumLinesNumber, @l List<? extends BeduinAction> onFocusedActions, @l Boolean isEnabled, @l List<? extends BeduinAction> onTextChangeActions, @l Integer maxLength, @l InputIcon rightIcon, @l Boolean showRightIcon) {
        return new MultiLineInputModel(id2, theme, style, text, details, placeholder, constraints, onEndEditingActions, errorMessage, showErrorMessage, displayingPredicate, textVersion, maximumLinesNumber, minimumLinesNumber, onFocusedActions, isEnabled, onTextChangeActions, maxLength, rightIcon, showRightIcon);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiLineInputModel)) {
            return false;
        }
        MultiLineInputModel multiLineInputModel = (MultiLineInputModel) other;
        return L.f(this.id, multiLineInputModel.id) && L.f(this.theme, multiLineInputModel.theme) && L.f(this.style, multiLineInputModel.style) && L.f(this.text, multiLineInputModel.text) && L.f(this.details, multiLineInputModel.details) && L.f(this.placeholder, multiLineInputModel.placeholder) && L.f(this.constraints, multiLineInputModel.constraints) && L.f(this.onEndEditingActions, multiLineInputModel.onEndEditingActions) && L.f(this.errorMessage, multiLineInputModel.errorMessage) && L.f(this.showErrorMessage, multiLineInputModel.showErrorMessage) && L.f(this.displayingPredicate, multiLineInputModel.displayingPredicate) && L.f(this.textVersion, multiLineInputModel.textVersion) && L.f(this.maximumLinesNumber, multiLineInputModel.maximumLinesNumber) && L.f(this.minimumLinesNumber, multiLineInputModel.minimumLinesNumber) && L.f(this.onFocusedActions, multiLineInputModel.onFocusedActions) && L.f(this.isEnabled, multiLineInputModel.isEnabled) && L.f(this.onTextChangeActions, multiLineInputModel.onTextChangeActions) && L.f(this.maxLength, multiLineInputModel.maxLength) && L.f(this.rightIcon, multiLineInputModel.rightIcon) && L.f(this.showRightIcon, multiLineInputModel.showRightIcon);
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public List<Constraint> getConstraints() {
        return this.constraints;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public String getDetails() {
        return this.details;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    public DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public String getErrorMessage() {
        return this.errorMessage;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    public String getId() {
        return this.id;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public Integer getMaxLength() {
        return this.maxLength;
    }

    public final int getMaxLinesNumber() {
        Integer num = this.maximumLinesNumber;
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    public final int getMinLinesNumber() {
        Integer num = this.minimumLinesNumber;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public List<BeduinAction> getOnEndEditingActions() {
        return this.onEndEditingActions;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public List<BeduinAction> getOnFocusedActions() {
        return this.onFocusedActions;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public List<BeduinAction> getOnTextChangeActions() {
        return this.onTextChangeActions;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public String getPlaceholder() {
        return this.placeholder;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public InputIcon getRightIcon() {
        return this.rightIcon;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public Boolean getShowErrorMessage() {
        return this.showErrorMessage;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public Boolean getShowRightIcon() {
        return this.showRightIcon;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @k
    public String getText() {
        return this.text;
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public Integer getTextVersion() {
        return this.textVersion;
    }

    @l
    public final String getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.theme;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.style;
        int iD2 = H.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.text);
        String str3 = this.details;
        int iHashCode3 = (iD2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.placeholder;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<Constraint> list = this.constraints;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinAction> list2 = this.onEndEditingActions;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.errorMessage;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.showErrorMessage;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode9 = (iHashCode8 + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        Integer num = this.textVersion;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.maximumLinesNumber;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.minimumLinesNumber;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        List<BeduinAction> list3 = this.onFocusedActions;
        int iHashCode13 = (iHashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool2 = this.isEnabled;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<BeduinAction> list4 = this.onTextChangeActions;
        int iHashCode15 = (iHashCode14 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Integer num4 = this.maxLength;
        int iHashCode16 = (iHashCode15 + (num4 == null ? 0 : num4.hashCode())) * 31;
        InputIcon inputIcon = this.rightIcon;
        int iHashCode17 = (iHashCode16 + (inputIcon == null ? 0 : inputIcon.hashCode())) * 31;
        Boolean bool3 = this.showRightIcon;
        return iHashCode17 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @Override // com.avito.android.beduin.common.component.input.BeduinInputModel
    @l
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MultiLineInputModel(id=");
        sb2.append(this.id);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", details=");
        sb2.append(this.details);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", constraints=");
        sb2.append(this.constraints);
        sb2.append(", onEndEditingActions=");
        sb2.append(this.onEndEditingActions);
        sb2.append(", errorMessage=");
        sb2.append(this.errorMessage);
        sb2.append(", showErrorMessage=");
        sb2.append(this.showErrorMessage);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", textVersion=");
        sb2.append(this.textVersion);
        sb2.append(", maximumLinesNumber=");
        sb2.append(this.maximumLinesNumber);
        sb2.append(", minimumLinesNumber=");
        sb2.append(this.minimumLinesNumber);
        sb2.append(", onFocusedActions=");
        sb2.append(this.onFocusedActions);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", onTextChangeActions=");
        sb2.append(this.onTextChangeActions);
        sb2.append(", maxLength=");
        sb2.append(this.maxLength);
        sb2.append(", rightIcon=");
        sb2.append(this.rightIcon);
        sb2.append(", showRightIcon=");
        return C0.g(sb2, this.showRightIcon, ')');
    }

    @Override // com.avito.android.beduin.common.component.q
    @k
    public BeduinModel validateModelByConstraints() {
        com.avito.android.beduin.common.component.input.k kVarB = j.b(getText(), null, getConstraints());
        String errorMessage = getErrorMessage();
        if (errorMessage == null) {
            errorMessage = j.a(kVarB);
        }
        return copy$default(this, null, null, null, null, null, null, null, null, errorMessage, Boolean.valueOf(j.a(kVarB) != null), null, null, null, null, null, null, null, null, null, null, 1047807, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.theme);
        parcel.writeString(this.style);
        parcel.writeString(this.text);
        parcel.writeString(this.details);
        parcel.writeString(this.placeholder);
        List<Constraint> list = this.constraints;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinAction> list2 = this.onEndEditingActions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        parcel.writeString(this.errorMessage);
        Boolean bool = this.showErrorMessage;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.displayingPredicate, flags);
        Integer num = this.textVersion;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.maximumLinesNumber;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.minimumLinesNumber;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        List<BeduinAction> list3 = this.onFocusedActions;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), flags);
            }
        }
        Boolean bool2 = this.isEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        List<BeduinAction> list4 = this.onTextChangeActions;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA4 = com.avito.android.actions_sheet.a.A(list4, parcel, 1);
            while (itA4.hasNext()) {
                parcel.writeParcelable((Parcelable) itA4.next(), flags);
            }
        }
        Integer num4 = this.maxLength;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num4);
        }
        InputIcon inputIcon = this.rightIcon;
        if (inputIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputIcon.writeToParcel(parcel, flags);
        }
        Boolean bool3 = this.showRightIcon;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MultiLineInputModel(@k String str, @l String str2, @l String str3, @k String str4, @l String str5, @l String str6, @l List<? extends Constraint> list, @l List<? extends BeduinAction> list2, @l String str7, @l Boolean bool, @l DisplayingPredicate displayingPredicate, @l Integer num, @l Integer num2, @l Integer num3, @l List<? extends BeduinAction> list3, @l Boolean bool2, @l List<? extends BeduinAction> list4, @l Integer num4, @l InputIcon inputIcon, @l Boolean bool3) {
        this.id = str;
        this.theme = str2;
        this.style = str3;
        this.text = str4;
        this.details = str5;
        this.placeholder = str6;
        this.constraints = list;
        this.onEndEditingActions = list2;
        this.errorMessage = str7;
        this.showErrorMessage = bool;
        this.displayingPredicate = displayingPredicate;
        this.textVersion = num;
        this.maximumLinesNumber = num2;
        this.minimumLinesNumber = num3;
        this.onFocusedActions = list3;
        this.isEnabled = bool2;
        this.onTextChangeActions = list4;
        this.maxLength = num4;
        this.rightIcon = inputIcon;
        this.showRightIcon = bool3;
    }
}
