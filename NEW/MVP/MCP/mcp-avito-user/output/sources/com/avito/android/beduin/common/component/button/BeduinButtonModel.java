package com.avito.android.beduin.common.component.button;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.icon_button.BeduinIconButtonModel;
import com.avito.android.beduin.common.component.model.icon.IconBase64;
import com.avito.android.beduin.common.component.model.icon.IconPosition;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.ActionsTransform;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.IsEnabledTransform;
import com.avito.android.beduin.common.form.transforms.IsLoadingTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.beduin_shared.common.form.transforms.TextTransform;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: BeduinButtonModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010%J\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010%J\u0012\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b7\u00108J\u0012\u00109\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b;\u0010-J\u0012\u0010<\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b<\u0010=JÒ\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b@\u0010%J\u0010\u0010B\u001a\u00020AHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010F\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010DHÖ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020AHÖ\u0001¢\u0006\u0004\bH\u0010CJ \u0010M\u001a\u00020L2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020AHÖ\u0001¢\u0006\u0004\bM\u0010NR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010O\u001a\u0004\bP\u0010%R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010O\u001a\u0004\bQ\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010O\u001a\u0004\bR\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010O\u001a\u0004\bS\u0010%R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010O\u001a\u0004\bT\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010U\u001a\u0004\bV\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010W\u001a\u0004\b\u000b\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010W\u001a\u0004\b\f\u0010-R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010X\u001a\u0004\bY\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010Z\u001a\u0004\b[\u00102R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\\\u001a\u0004\b]\u00104R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010^\u001a\u0004\b_\u00106R\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010`\u001a\u0004\ba\u00108R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010b\u001a\u0004\bc\u0010:R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010W\u001a\u0004\bd\u0010-R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010e\u001a\u0004\bf\u0010=¨\u0006g"}, d2 = {"Lcom/avito/android/beduin/common/component/button/BeduinButtonModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "title", "subtitle", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style;", "customStyle", "", "isEnabled", "isLoading", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "base64Icon", "Lcom/avito/android/beduin/common/component/model/icon/IconPosition;", "iconPosition", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "localIcon", "Lcom/avito/android/beduin/common/component/button/LayoutMode;", "layoutMode", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedTitle", "onlyLightThemeColors", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/model/icon/IconPosition;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/button/LayoutMode;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/beduin_models/DisplayingPredicate;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style;", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "()Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "component10", "()Lcom/avito/android/beduin/common/component/model/icon/IconPosition;", "component11", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "component12", "()Lcom/avito/android/beduin/common/component/button/LayoutMode;", "component13", "()Ljava/util/List;", "component14", "()Lcom/avito/android/remote/model/text/AttributedText;", "component15", "component16", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/model/icon/IconPosition;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/button/LayoutMode;Ljava/util/List;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin/common/component/button/BeduinButtonModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getSubtitle", "getTheme", "getStyle", "Lcom/avito/android/beduin/common/component/icon_button/BeduinIconButtonModel$Style;", "getCustomStyle", "Ljava/lang/Boolean;", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "getBase64Icon", "Lcom/avito/android/beduin/common/component/model/icon/IconPosition;", "getIconPosition", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "getLocalIcon", "Lcom/avito/android/beduin/common/component/button/LayoutMode;", "getLayoutMode", "Ljava/util/List;", "getActions", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedTitle", "getOnlyLightThemeColors", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinButtonModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinButtonModel> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final AttributedText attributedTitle;

    @l
    private final IconBase64 base64Icon;

    @l
    private final BeduinIconButtonModel.Style customStyle;

    @l
    private final DisplayingPredicate displayingPredicate;

    @l
    private final IconPosition iconPosition;

    @k
    private final String id;

    @l
    private final Boolean isEnabled;

    @l
    private final Boolean isLoading;

    @l
    private final LayoutMode layoutMode;

    @l
    private final LocalIcon localIcon;

    @l
    private final Boolean onlyLightThemeColors;

    @k
    private final String style;

    @l
    private final String subtitle;

    @l
    private final String theme;

    @l
    private final String title;

    /* compiled from: BeduinButtonModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinButtonModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinButtonModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            LayoutMode layoutMode;
            ArrayList arrayList;
            Boolean boolValueOf3;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            BeduinIconButtonModel.Style styleCreateFromParcel = parcel.readInt() == 0 ? null : BeduinIconButtonModel.Style.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            IconBase64 iconBase64CreateFromParcel = parcel.readInt() == 0 ? null : IconBase64.CREATOR.createFromParcel(parcel);
            IconPosition iconPositionValueOf = parcel.readInt() == 0 ? null : IconPosition.valueOf(parcel.readString());
            LocalIcon localIconCreateFromParcel = parcel.readInt() == 0 ? null : LocalIcon.CREATOR.createFromParcel(parcel);
            LayoutMode layoutModeValueOf = parcel.readInt() == 0 ? null : LayoutMode.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                layoutMode = layoutModeValueOf;
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                layoutMode = layoutModeValueOf;
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinButtonModel.class, parcel, arrayList2, iL2, 1);
                    i12 = i12;
                }
                arrayList = arrayList2;
            }
            AttributedText attributedText = (AttributedText) parcel.readParcelable(BeduinButtonModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinButtonModel(string, string2, string3, string4, string5, styleCreateFromParcel, boolValueOf, boolValueOf2, iconBase64CreateFromParcel, iconPositionValueOf, localIconCreateFromParcel, layoutMode, arrayList, attributedText, boolValueOf3, (DisplayingPredicate) parcel.readParcelable(BeduinButtonModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinButtonModel[] newArray(int i12) {
            return new BeduinButtonModel[i12];
        }
    }

    public /* synthetic */ BeduinButtonModel(String str, String str2, String str3, String str4, String str5, BeduinIconButtonModel.Style style, Boolean bool, Boolean bool2, IconBase64 iconBase64, IconPosition iconPosition, LocalIcon localIcon, LayoutMode layoutMode, List list, AttributedText attributedText, Boolean bool3, DisplayingPredicate displayingPredicate, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, str5, style, (i12 & 64) != 0 ? null : bool, (i12 & 128) != 0 ? null : bool2, (i12 & 256) != 0 ? null : iconBase64, (i12 & 512) != 0 ? null : iconPosition, (i12 & 1024) != 0 ? null : localIcon, (i12 & 2048) != 0 ? null : layoutMode, (i12 & 4096) != 0 ? null : list, (i12 & 8192) != 0 ? null : attributedText, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : bool3, (i12 & 32768) != 0 ? null : displayingPredicate);
    }

    public static /* synthetic */ BeduinButtonModel copy$default(BeduinButtonModel beduinButtonModel, String str, String str2, String str3, String str4, String str5, BeduinIconButtonModel.Style style, Boolean bool, Boolean bool2, IconBase64 iconBase64, IconPosition iconPosition, LocalIcon localIcon, LayoutMode layoutMode, List list, AttributedText attributedText, Boolean bool3, DisplayingPredicate displayingPredicate, int i12, Object obj) {
        return beduinButtonModel.copy((i12 & 1) != 0 ? beduinButtonModel.id : str, (i12 & 2) != 0 ? beduinButtonModel.title : str2, (i12 & 4) != 0 ? beduinButtonModel.subtitle : str3, (i12 & 8) != 0 ? beduinButtonModel.theme : str4, (i12 & 16) != 0 ? beduinButtonModel.style : str5, (i12 & 32) != 0 ? beduinButtonModel.customStyle : style, (i12 & 64) != 0 ? beduinButtonModel.isEnabled : bool, (i12 & 128) != 0 ? beduinButtonModel.isLoading : bool2, (i12 & 256) != 0 ? beduinButtonModel.base64Icon : iconBase64, (i12 & 512) != 0 ? beduinButtonModel.iconPosition : iconPosition, (i12 & 1024) != 0 ? beduinButtonModel.localIcon : localIcon, (i12 & 2048) != 0 ? beduinButtonModel.layoutMode : layoutMode, (i12 & 4096) != 0 ? beduinButtonModel.actions : list, (i12 & 8192) != 0 ? beduinButtonModel.attributedTitle : attributedText, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? beduinButtonModel.onlyLightThemeColors : bool3, (i12 & 32768) != 0 ? beduinButtonModel.displayingPredicate : displayingPredicate);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), 32767, null) : transform instanceof TextTransform ? copy$default(this, null, ((TextTransform) transform).getText(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65533, null) : transform instanceof IsEnabledTransform ? copy$default(this, null, null, null, null, null, null, Boolean.valueOf(((IsEnabledTransform) transform).isEnabled()), null, null, null, null, null, null, null, null, null, 65471, null) : transform instanceof IsLoadingTransform ? copy$default(this, null, null, null, null, null, null, null, Boolean.valueOf(((IsLoadingTransform) transform).isLoading()), null, null, null, null, null, null, null, null, 65407, null) : transform instanceof ActionsTransform ? copy$default(this, null, null, null, null, null, null, null, null, null, null, null, null, ((ActionsTransform) transform).getActions(), null, null, null, 61439, null) : this;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final IconPosition getIconPosition() {
        return this.iconPosition;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final LocalIcon getLocalIcon() {
        return this.localIcon;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final LayoutMode getLayoutMode() {
        return this.layoutMode;
    }

    @l
    public final List<BeduinAction> component13() {
        return this.actions;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final AttributedText getAttributedTitle() {
        return this.attributedTitle;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final Boolean getOnlyLightThemeColors() {
        return this.onlyLightThemeColors;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @l
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
    public final String getTheme() {
        return this.theme;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final BeduinIconButtonModel.Style getCustomStyle() {
        return this.customStyle;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Boolean getIsLoading() {
        return this.isLoading;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final IconBase64 getBase64Icon() {
        return this.base64Icon;
    }

    @k
    public final BeduinButtonModel copy(@k String id2, @l String title, @l String subtitle, @l String theme, @k String style, @l BeduinIconButtonModel.Style customStyle, @l Boolean isEnabled, @l Boolean isLoading, @l IconBase64 base64Icon, @l IconPosition iconPosition, @l LocalIcon localIcon, @l LayoutMode layoutMode, @l List<? extends BeduinAction> actions, @l AttributedText attributedTitle, @l Boolean onlyLightThemeColors, @l DisplayingPredicate displayingPredicate) {
        return new BeduinButtonModel(id2, title, subtitle, theme, style, customStyle, isEnabled, isLoading, base64Icon, iconPosition, localIcon, layoutMode, actions, attributedTitle, onlyLightThemeColors, displayingPredicate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinButtonModel)) {
            return false;
        }
        BeduinButtonModel beduinButtonModel = (BeduinButtonModel) other;
        return L.f(this.id, beduinButtonModel.id) && L.f(this.title, beduinButtonModel.title) && L.f(this.subtitle, beduinButtonModel.subtitle) && L.f(this.theme, beduinButtonModel.theme) && L.f(this.style, beduinButtonModel.style) && L.f(this.customStyle, beduinButtonModel.customStyle) && L.f(this.isEnabled, beduinButtonModel.isEnabled) && L.f(this.isLoading, beduinButtonModel.isLoading) && L.f(this.base64Icon, beduinButtonModel.base64Icon) && this.iconPosition == beduinButtonModel.iconPosition && L.f(this.localIcon, beduinButtonModel.localIcon) && this.layoutMode == beduinButtonModel.layoutMode && L.f(this.actions, beduinButtonModel.actions) && L.f(this.attributedTitle, beduinButtonModel.attributedTitle) && L.f(this.onlyLightThemeColors, beduinButtonModel.onlyLightThemeColors) && L.f(this.displayingPredicate, beduinButtonModel.displayingPredicate);
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @l
    public final AttributedText getAttributedTitle() {
        return this.attributedTitle;
    }

    @l
    public final IconBase64 getBase64Icon() {
        return this.base64Icon;
    }

    @l
    public final BeduinIconButtonModel.Style getCustomStyle() {
        return this.customStyle;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @l
    public final IconPosition getIconPosition() {
        return this.iconPosition;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @l
    public final LayoutMode getLayoutMode() {
        return this.layoutMode;
    }

    @l
    public final LocalIcon getLocalIcon() {
        return this.localIcon;
    }

    @l
    public final Boolean getOnlyLightThemeColors() {
        return this.onlyLightThemeColors;
    }

    @k
    public final String getStyle() {
        return this.style;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTheme() {
        return this.theme;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.theme;
        int iD2 = H.d((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.style);
        BeduinIconButtonModel.Style style = this.customStyle;
        int iHashCode4 = (iD2 + (style == null ? 0 : style.hashCode())) * 31;
        Boolean bool = this.isEnabled;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isLoading;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        IconBase64 iconBase64 = this.base64Icon;
        int iHashCode7 = (iHashCode6 + (iconBase64 == null ? 0 : iconBase64.hashCode())) * 31;
        IconPosition iconPosition = this.iconPosition;
        int iHashCode8 = (iHashCode7 + (iconPosition == null ? 0 : iconPosition.hashCode())) * 31;
        LocalIcon localIcon = this.localIcon;
        int iHashCode9 = (iHashCode8 + (localIcon == null ? 0 : localIcon.hashCode())) * 31;
        LayoutMode layoutMode = this.layoutMode;
        int iHashCode10 = (iHashCode9 + (layoutMode == null ? 0 : layoutMode.hashCode())) * 31;
        List<BeduinAction> list = this.actions;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        AttributedText attributedText = this.attributedTitle;
        int iHashCode12 = (iHashCode11 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        Boolean bool3 = this.onlyLightThemeColors;
        int iHashCode13 = (iHashCode12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return iHashCode13 + (displayingPredicate != null ? displayingPredicate.hashCode() : 0);
    }

    @l
    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    @l
    public final Boolean isLoading() {
        return this.isLoading;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinButtonModel(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", customStyle=");
        sb2.append(this.customStyle);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", isLoading=");
        sb2.append(this.isLoading);
        sb2.append(", base64Icon=");
        sb2.append(this.base64Icon);
        sb2.append(", iconPosition=");
        sb2.append(this.iconPosition);
        sb2.append(", localIcon=");
        sb2.append(this.localIcon);
        sb2.append(", layoutMode=");
        sb2.append(this.layoutMode);
        sb2.append(", actions=");
        sb2.append(this.actions);
        sb2.append(", attributedTitle=");
        sb2.append(this.attributedTitle);
        sb2.append(", onlyLightThemeColors=");
        sb2.append(this.onlyLightThemeColors);
        sb2.append(", displayingPredicate=");
        return AK.c.l(sb2, this.displayingPredicate, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.theme);
        parcel.writeString(this.style);
        BeduinIconButtonModel.Style style = this.customStyle;
        if (style == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            style.writeToParcel(parcel, flags);
        }
        Boolean bool = this.isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.isLoading;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        IconBase64 iconBase64 = this.base64Icon;
        if (iconBase64 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iconBase64.writeToParcel(parcel, flags);
        }
        IconPosition iconPosition = this.iconPosition;
        if (iconPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iconPosition.name());
        }
        LocalIcon localIcon = this.localIcon;
        if (localIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localIcon.writeToParcel(parcel, flags);
        }
        LayoutMode layoutMode = this.layoutMode;
        if (layoutMode == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(layoutMode.name());
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
        parcel.writeParcelable(this.attributedTitle, flags);
        Boolean bool3 = this.onlyLightThemeColors;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        parcel.writeParcelable(this.displayingPredicate, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinButtonModel(@k String str, @l String str2, @l String str3, @l String str4, @k String str5, @l BeduinIconButtonModel.Style style, @l Boolean bool, @l Boolean bool2, @l IconBase64 iconBase64, @l IconPosition iconPosition, @l LocalIcon localIcon, @l LayoutMode layoutMode, @l List<? extends BeduinAction> list, @l AttributedText attributedText, @l Boolean bool3, @l DisplayingPredicate displayingPredicate) {
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.theme = str4;
        this.style = str5;
        this.customStyle = style;
        this.isEnabled = bool;
        this.isLoading = bool2;
        this.base64Icon = iconBase64;
        this.iconPosition = iconPosition;
        this.localIcon = localIcon;
        this.layoutMode = layoutMode;
        this.actions = list;
        this.attributedTitle = attributedText;
        this.onlyLightThemeColors = bool3;
        this.displayingPredicate = displayingPredicate;
    }
}
