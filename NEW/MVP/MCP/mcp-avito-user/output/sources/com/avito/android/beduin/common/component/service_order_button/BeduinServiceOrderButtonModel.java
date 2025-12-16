package com.avito.android.beduin.common.component.service_order_button;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.action.BeduinOpenLinkAction;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.button.LayoutMode;
import com.avito.android.beduin.common.component.model.icon.IconBase64;
import com.avito.android.beduin.common.component.model.icon.IconPosition;
import com.avito.android.beduin.common.component.model.icon.LocalIcon;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.IsEnabledTransform;
import com.avito.android.beduin.common.form.transforms.IsLoadingTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.beduin_shared.common.form.transforms.TextTransform;
import com.avito.android.beduin_shared.model.component.serp.ServiceOrderButtonModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: BeduinServiceOrderButtonModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B»\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J5\u0010%\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u0011\u0010'\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b+\u0010(J\u0010\u0010,\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b,\u0010(J\u0012\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b9\u0010:J\u0012\u0010;\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b;\u0010<J\u0012\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b=\u0010(J\u0018\u0010>\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b@\u0010AJÊ\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\bD\u0010(J\u0010\u0010F\u001a\u00020EHÖ\u0001¢\u0006\u0004\bF\u0010GJ\u001a\u0010J\u001a\u00020\b2\b\u0010I\u001a\u0004\u0018\u00010HHÖ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020EHÖ\u0001¢\u0006\u0004\bL\u0010GJ \u0010P\u001a\u00020\u001a2\u0006\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020EHÖ\u0001¢\u0006\u0004\bP\u0010QR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010R\u001a\u0004\bS\u0010(R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010R\u001a\u0004\bT\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010R\u001a\u0004\bU\u0010(R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010R\u001a\u0004\bV\u0010(R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010W\u001a\u0004\b\t\u0010.R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010X\u001a\u0004\bY\u00100R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010Z\u001a\u0004\b[\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\\\u001a\u0004\b]\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010^\u001a\u0004\b_\u00106R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010`\u001a\u0004\ba\u00108R\"\u0010\u0015\u001a\u00020\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010b\u001a\u0004\b\u0015\u0010:\"\u0004\bc\u0010dR*\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010e\u0012\u0004\bi\u0010j\u001a\u0004\bf\u0010<\"\u0004\bg\u0010hR*\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010R\u0012\u0004\bn\u0010j\u001a\u0004\bk\u0010(\"\u0004\bl\u0010mR0\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010o\u0012\u0004\bs\u0010j\u001a\u0004\bp\u0010?\"\u0004\bq\u0010rR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010t\u001a\u0004\bu\u0010A¨\u0006v"}, d2 = {"Lcom/avito/android/beduin/common/component/service_order_button/BeduinServiceOrderButtonModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "Lcom/avito/android/beduin_shared/model/component/serp/ServiceOrderButtonModel;", "", "id", "title", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "isEnabled", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "base64Icon", "Lcom/avito/android/beduin/common/component/model/icon/IconPosition;", "iconPosition", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "localIcon", "Lcom/avito/android/beduin/common/component/button/LayoutMode;", "layoutMode", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "isLoading", "Lcom/avito/android/deep_linking/links/DeepLink;", "deeplinkToOverride", "titleToOverride", "Lkotlin/Function0;", "Lkotlin/G0;", "listener", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/model/icon/IconPosition;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/button/LayoutMode;Ljava/util/List;ZLcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;LY41/a;Lcom/avito/android/beduin_models/DisplayingPredicate;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "copyModel", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Z)Lcom/avito/android/beduin_shared/model/component/serp/ServiceOrderButtonModel;", "findServiceOrderDeeplinkAsString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "()Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "component7", "()Lcom/avito/android/beduin/common/component/model/icon/IconPosition;", "component8", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "component9", "()Lcom/avito/android/beduin/common/component/button/LayoutMode;", "component10", "()Ljava/util/List;", "component11", "()Z", "component12", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component13", "component14", "()LY41/a;", "component15", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/model/icon/IconPosition;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/button/LayoutMode;Ljava/util/List;ZLcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;LY41/a;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin/common/component/service_order_button/BeduinServiceOrderButtonModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getTheme", "getStyle", "Ljava/lang/Boolean;", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "getBase64Icon", "Lcom/avito/android/beduin/common/component/model/icon/IconPosition;", "getIconPosition", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "getLocalIcon", "Lcom/avito/android/beduin/common/component/button/LayoutMode;", "getLayoutMode", "Ljava/util/List;", "getActions", "Z", "setLoading", "(Z)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplinkToOverride", "setDeeplinkToOverride", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "getDeeplinkToOverride$annotations", "()V", "getTitleToOverride", "setTitleToOverride", "(Ljava/lang/String;)V", "getTitleToOverride$annotations", "LY41/a;", "getListener", "setListener", "(LY41/a;)V", "getListener$annotations", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class BeduinServiceOrderButtonModel extends LeafBeduinModel implements ServiceOrderButtonModel {

    @k
    public static final Parcelable.Creator<BeduinServiceOrderButtonModel> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final IconBase64 base64Icon;

    @l
    private DeepLink deeplinkToOverride;

    @l
    private final DisplayingPredicate displayingPredicate;

    @l
    private final IconPosition iconPosition;

    @k
    private final String id;

    @l
    private final Boolean isEnabled;
    private boolean isLoading;

    @l
    private final LayoutMode layoutMode;

    @l
    private Y41.a<G0> listener;

    @l
    private final LocalIcon localIcon;

    @k
    private final String style;

    @l
    private final String theme;

    @l
    private final String title;

    @l
    private String titleToOverride;

    /* compiled from: BeduinServiceOrderButtonModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinServiceOrderButtonModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinServiceOrderButtonModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            IconBase64 iconBase64CreateFromParcel = parcel.readInt() == 0 ? null : IconBase64.CREATOR.createFromParcel(parcel);
            IconPosition iconPositionValueOf = parcel.readInt() == 0 ? null : IconPosition.valueOf(parcel.readString());
            LocalIcon localIconCreateFromParcel = parcel.readInt() == 0 ? null : LocalIcon.CREATOR.createFromParcel(parcel);
            LayoutMode layoutModeValueOf = parcel.readInt() == 0 ? null : LayoutMode.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinServiceOrderButtonModel.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new BeduinServiceOrderButtonModel(string, string2, string3, string4, boolValueOf, iconBase64CreateFromParcel, iconPositionValueOf, localIconCreateFromParcel, layoutModeValueOf, arrayList, parcel.readInt() != 0, null, null, null, (DisplayingPredicate) parcel.readParcelable(BeduinServiceOrderButtonModel.class.getClassLoader()), 14336, null);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinServiceOrderButtonModel[] newArray(int i12) {
            return new BeduinServiceOrderButtonModel[i12];
        }
    }

    public /* synthetic */ BeduinServiceOrderButtonModel(String str, String str2, String str3, String str4, Boolean bool, IconBase64 iconBase64, IconPosition iconPosition, LocalIcon localIcon, LayoutMode layoutMode, List list, boolean z12, DeepLink deepLink, String str5, Y41.a aVar, DisplayingPredicate displayingPredicate, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, str4, (i12 & 16) != 0 ? null : bool, (i12 & 32) != 0 ? null : iconBase64, (i12 & 64) != 0 ? null : iconPosition, (i12 & 128) != 0 ? null : localIcon, (i12 & 256) != 0 ? null : layoutMode, (i12 & 512) != 0 ? null : list, (i12 & 1024) != 0 ? false : z12, (i12 & 2048) != 0 ? null : deepLink, (i12 & 4096) != 0 ? null : str5, (i12 & 8192) != 0 ? null : aVar, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : displayingPredicate);
    }

    public static /* synthetic */ BeduinServiceOrderButtonModel copy$default(BeduinServiceOrderButtonModel beduinServiceOrderButtonModel, String str, String str2, String str3, String str4, Boolean bool, IconBase64 iconBase64, IconPosition iconPosition, LocalIcon localIcon, LayoutMode layoutMode, List list, boolean z12, DeepLink deepLink, String str5, Y41.a aVar, DisplayingPredicate displayingPredicate, int i12, Object obj) {
        return beduinServiceOrderButtonModel.copy((i12 & 1) != 0 ? beduinServiceOrderButtonModel.id : str, (i12 & 2) != 0 ? beduinServiceOrderButtonModel.title : str2, (i12 & 4) != 0 ? beduinServiceOrderButtonModel.theme : str3, (i12 & 8) != 0 ? beduinServiceOrderButtonModel.style : str4, (i12 & 16) != 0 ? beduinServiceOrderButtonModel.isEnabled : bool, (i12 & 32) != 0 ? beduinServiceOrderButtonModel.base64Icon : iconBase64, (i12 & 64) != 0 ? beduinServiceOrderButtonModel.iconPosition : iconPosition, (i12 & 128) != 0 ? beduinServiceOrderButtonModel.localIcon : localIcon, (i12 & 256) != 0 ? beduinServiceOrderButtonModel.layoutMode : layoutMode, (i12 & 512) != 0 ? beduinServiceOrderButtonModel.actions : list, (i12 & 1024) != 0 ? beduinServiceOrderButtonModel.isLoading : z12, (i12 & 2048) != 0 ? beduinServiceOrderButtonModel.deeplinkToOverride : deepLink, (i12 & 4096) != 0 ? beduinServiceOrderButtonModel.titleToOverride : str5, (i12 & 8192) != 0 ? beduinServiceOrderButtonModel.listener : aVar, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? beduinServiceOrderButtonModel.displayingPredicate : displayingPredicate);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, null, null, null, null, null, null, null, false, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), 16383, null) : transform instanceof TextTransform ? copy$default(this, null, ((TextTransform) transform).getText(), null, null, null, null, null, null, null, null, false, null, null, null, null, 32765, null) : transform instanceof IsEnabledTransform ? copy$default(this, null, null, null, null, Boolean.valueOf(((IsEnabledTransform) transform).isEnabled()), null, null, null, null, null, false, null, null, null, null, 32751, null) : transform instanceof IsLoadingTransform ? copy$default(this, null, null, null, null, null, null, null, null, null, null, ((IsLoadingTransform) transform).isLoading(), null, null, null, null, 31743, null) : this;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    public final List<BeduinAction> component10() {
        return this.actions;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final DeepLink getDeeplinkToOverride() {
        return this.deeplinkToOverride;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final String getTitleToOverride() {
        return this.titleToOverride;
    }

    @l
    public final Y41.a<G0> component14() {
        return this.listener;
    }

    @l
    /* renamed from: component15, reason: from getter */
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
    public final String getTheme() {
        return this.theme;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final IconBase64 getBase64Icon() {
        return this.base64Icon;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final IconPosition getIconPosition() {
        return this.iconPosition;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final LocalIcon getLocalIcon() {
        return this.localIcon;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final LayoutMode getLayoutMode() {
        return this.layoutMode;
    }

    @k
    public final BeduinServiceOrderButtonModel copy(@k String id2, @l String title, @l String theme, @k String style, @l Boolean isEnabled, @l IconBase64 base64Icon, @l IconPosition iconPosition, @l LocalIcon localIcon, @l LayoutMode layoutMode, @l List<? extends BeduinAction> actions, boolean isLoading, @l DeepLink deeplinkToOverride, @l String titleToOverride, @l Y41.a<G0> listener, @l DisplayingPredicate displayingPredicate) {
        return new BeduinServiceOrderButtonModel(id2, title, theme, style, isEnabled, base64Icon, iconPosition, localIcon, layoutMode, actions, isLoading, deeplinkToOverride, titleToOverride, listener, displayingPredicate);
    }

    @Override // com.avito.android.beduin_shared.model.component.serp.ServiceOrderButtonModel
    @k
    public ServiceOrderButtonModel copyModel(@l DeepLink deeplinkToOverride, @l String titleToOverride, @l String style, boolean isLoading) {
        return copy$default(this, null, null, null, style == null ? this.style : style, null, null, null, null, null, null, isLoading, deeplinkToOverride, titleToOverride, null, null, 25591, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinServiceOrderButtonModel)) {
            return false;
        }
        BeduinServiceOrderButtonModel beduinServiceOrderButtonModel = (BeduinServiceOrderButtonModel) other;
        return L.f(this.id, beduinServiceOrderButtonModel.id) && L.f(this.title, beduinServiceOrderButtonModel.title) && L.f(this.theme, beduinServiceOrderButtonModel.theme) && L.f(this.style, beduinServiceOrderButtonModel.style) && L.f(this.isEnabled, beduinServiceOrderButtonModel.isEnabled) && L.f(this.base64Icon, beduinServiceOrderButtonModel.base64Icon) && this.iconPosition == beduinServiceOrderButtonModel.iconPosition && L.f(this.localIcon, beduinServiceOrderButtonModel.localIcon) && this.layoutMode == beduinServiceOrderButtonModel.layoutMode && L.f(this.actions, beduinServiceOrderButtonModel.actions) && this.isLoading == beduinServiceOrderButtonModel.isLoading && L.f(this.deeplinkToOverride, beduinServiceOrderButtonModel.deeplinkToOverride) && L.f(this.titleToOverride, beduinServiceOrderButtonModel.titleToOverride) && L.f(this.listener, beduinServiceOrderButtonModel.listener) && L.f(this.displayingPredicate, beduinServiceOrderButtonModel.displayingPredicate);
    }

    @Override // com.avito.android.beduin_shared.model.component.serp.ServiceOrderButtonModel
    @l
    public String findServiceOrderDeeplinkAsString() {
        BeduinAction beduinAction;
        Object next;
        List<BeduinAction> list = this.actions;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((BeduinAction) next) instanceof BeduinOpenLinkAction) {
                    break;
                }
            }
            beduinAction = (BeduinAction) next;
        } else {
            beduinAction = null;
        }
        BeduinOpenLinkAction beduinOpenLinkAction = beduinAction instanceof BeduinOpenLinkAction ? (BeduinOpenLinkAction) beduinAction : null;
        if (beduinOpenLinkAction != null) {
            return beduinOpenLinkAction.getLink();
        }
        return null;
    }

    @l
    public final List<BeduinAction> getActions() {
        return this.actions;
    }

    @l
    public final IconBase64 getBase64Icon() {
        return this.base64Icon;
    }

    @Override // com.avito.android.beduin_shared.model.component.serp.ServiceOrderButtonModel
    @l
    public DeepLink getDeeplinkToOverride() {
        return this.deeplinkToOverride;
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
    public Y41.a<G0> getListener() {
        return this.listener;
    }

    @l
    public final LocalIcon getLocalIcon() {
        return this.localIcon;
    }

    @k
    public final String getStyle() {
        return this.style;
    }

    @Override // com.avito.android.beduin_shared.model.component.serp.ServiceOrderButtonModel
    @l
    public String getTheme() {
        return this.theme;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public String getTitleToOverride() {
        return this.titleToOverride;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.theme;
        int iD2 = H.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.style);
        Boolean bool = this.isEnabled;
        int iHashCode3 = (iD2 + (bool == null ? 0 : bool.hashCode())) * 31;
        IconBase64 iconBase64 = this.base64Icon;
        int iHashCode4 = (iHashCode3 + (iconBase64 == null ? 0 : iconBase64.hashCode())) * 31;
        IconPosition iconPosition = this.iconPosition;
        int iHashCode5 = (iHashCode4 + (iconPosition == null ? 0 : iconPosition.hashCode())) * 31;
        LocalIcon localIcon = this.localIcon;
        int iHashCode6 = (iHashCode5 + (localIcon == null ? 0 : localIcon.hashCode())) * 31;
        LayoutMode layoutMode = this.layoutMode;
        int iHashCode7 = (iHashCode6 + (layoutMode == null ? 0 : layoutMode.hashCode())) * 31;
        List<BeduinAction> list = this.actions;
        int i12 = r.i((iHashCode7 + (list == null ? 0 : list.hashCode())) * 31, 31, this.isLoading);
        DeepLink deepLink = this.deeplinkToOverride;
        int iHashCode8 = (i12 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str3 = this.titleToOverride;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Y41.a<G0> aVar = this.listener;
        int iHashCode10 = (iHashCode9 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return iHashCode10 + (displayingPredicate != null ? displayingPredicate.hashCode() : 0);
    }

    @l
    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    public boolean isLoading() {
        return this.isLoading;
    }

    public void setDeeplinkToOverride(@l DeepLink deepLink) {
        this.deeplinkToOverride = deepLink;
    }

    @Override // com.avito.android.beduin_shared.model.component.serp.ServiceOrderButtonModel
    public void setListener(@l Y41.a<G0> aVar) {
        this.listener = aVar;
    }

    @Override // com.avito.android.beduin_shared.model.component.serp.ServiceOrderButtonModel
    public void setLoading(boolean z12) {
        this.isLoading = z12;
    }

    public void setTitleToOverride(@l String str) {
        this.titleToOverride = str;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinServiceOrderButtonModel(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
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
        sb2.append(", isLoading=");
        sb2.append(this.isLoading);
        sb2.append(", deeplinkToOverride=");
        sb2.append(this.deeplinkToOverride);
        sb2.append(", titleToOverride=");
        sb2.append(this.titleToOverride);
        sb2.append(", listener=");
        sb2.append(this.listener);
        sb2.append(", displayingPredicate=");
        return AK.c.l(sb2, this.displayingPredicate, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.theme);
        parcel.writeString(this.style);
        Boolean bool = this.isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
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
        parcel.writeInt(this.isLoading ? 1 : 0);
        parcel.writeParcelable(this.displayingPredicate, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinServiceOrderButtonModel(@k String str, @l String str2, @l String str3, @k String str4, @l Boolean bool, @l IconBase64 iconBase64, @l IconPosition iconPosition, @l LocalIcon localIcon, @l LayoutMode layoutMode, @l List<? extends BeduinAction> list, boolean z12, @l DeepLink deepLink, @l String str5, @l Y41.a<G0> aVar, @l DisplayingPredicate displayingPredicate) {
        this.id = str;
        this.title = str2;
        this.theme = str3;
        this.style = str4;
        this.isEnabled = bool;
        this.base64Icon = iconBase64;
        this.iconPosition = iconPosition;
        this.localIcon = localIcon;
        this.layoutMode = layoutMode;
        this.actions = list;
        this.isLoading = z12;
        this.deeplinkToOverride = deepLink;
        this.titleToOverride = str5;
        this.listener = aVar;
        this.displayingPredicate = displayingPredicate;
    }

    public static /* synthetic */ void getDeeplinkToOverride$annotations() {
    }

    public static /* synthetic */ void getListener$annotations() {
    }

    public static /* synthetic */ void getTitleToOverride$annotations() {
    }
}
