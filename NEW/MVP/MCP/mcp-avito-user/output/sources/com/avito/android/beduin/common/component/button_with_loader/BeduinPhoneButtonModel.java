package com.avito.android.beduin.common.component.button_with_loader;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
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
import com.avito.android.beduin_shared.model.component.serp.PhoneButtonModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinPhoneButtonModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0095\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b$\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0018\u00100\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b2\u00103J¢\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b6\u0010 J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020\b2\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u000207HÖ\u0001¢\u0006\u0004\b>\u00109J \u0010C\u001a\u00020B2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u000207HÖ\u0001¢\u0006\u0004\bC\u0010DR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010E\u001a\u0004\bF\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bG\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010E\u001a\u0004\bH\u0010 R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bI\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010J\u001a\u0004\b\t\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010J\u001a\u0004\b\n\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010K\u001a\u0004\bL\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u0010+R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bP\u0010-R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010Q\u001a\u0004\bR\u0010/R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010S\u001a\u0004\bT\u00101R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010U\u001a\u0004\bV\u00103R0\u0010X\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010W8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\bX\u0010Y\u0012\u0004\b^\u0010_\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]¨\u0006`"}, d2 = {"Lcom/avito/android/beduin/common/component/button_with_loader/BeduinPhoneButtonModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "Lcom/avito/android/beduin_shared/model/component/serp/PhoneButtonModel;", "", "id", "title", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "", "isEnabled", "isLoading", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "base64Icon", "Lcom/avito/android/beduin/common/component/model/icon/IconPosition;", "iconPosition", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "localIcon", "Lcom/avito/android/beduin/common/component/button/LayoutMode;", "layoutMode", "", "Lcom/avito/android/beduin_models/BeduinAction;", "actions", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/model/icon/IconPosition;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/button/LayoutMode;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "findCallDeeplinkAsString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "component6", "component7", "()Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "component8", "()Lcom/avito/android/beduin/common/component/model/icon/IconPosition;", "component9", "()Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "component10", "()Lcom/avito/android/beduin/common/component/button/LayoutMode;", "component11", "()Ljava/util/List;", "component12", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/beduin/common/component/model/icon/IconBase64;Lcom/avito/android/beduin/common/component/model/icon/IconPosition;Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;Lcom/avito/android/beduin/common/component/button/LayoutMode;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;)Lcom/avito/android/beduin/common/component/button_with_loader/BeduinPhoneButtonModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getTheme", "getStyle", "Ljava/lang/Boolean;", "Lcom/avito/android/beduin/common/component/model/icon/IconBase64;", "getBase64Icon", "Lcom/avito/android/beduin/common/component/model/icon/IconPosition;", "getIconPosition", "Lcom/avito/android/beduin/common/component/model/icon/LocalIcon;", "getLocalIcon", "Lcom/avito/android/beduin/common/component/button/LayoutMode;", "getLayoutMode", "Ljava/util/List;", "getActions", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lkotlin/Function0;", "listener", "LY41/a;", "getListener", "()LY41/a;", "setListener", "(LY41/a;)V", "getListener$annotations", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class BeduinPhoneButtonModel extends LeafBeduinModel implements PhoneButtonModel {

    @k
    public static final Parcelable.Creator<BeduinPhoneButtonModel> CREATOR = new a();

    @l
    private final List<BeduinAction> actions;

    @l
    private final IconBase64 base64Icon;

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
    private Y41.a<G0> listener;

    @l
    private final LocalIcon localIcon;

    @k
    private final String style;

    @l
    private final String theme;

    @l
    private final String title;

    /* compiled from: BeduinPhoneButtonModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinPhoneButtonModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinPhoneButtonModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int iL2 = 0;
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
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinPhoneButtonModel.class, parcel, arrayList, iL2, 1);
                }
            }
            return new BeduinPhoneButtonModel(string, string2, string3, string4, boolValueOf, boolValueOf2, iconBase64CreateFromParcel, iconPositionValueOf, localIconCreateFromParcel, layoutModeValueOf, arrayList, (DisplayingPredicate) parcel.readParcelable(BeduinPhoneButtonModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinPhoneButtonModel[] newArray(int i12) {
            return new BeduinPhoneButtonModel[i12];
        }
    }

    public /* synthetic */ BeduinPhoneButtonModel(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, IconBase64 iconBase64, IconPosition iconPosition, LocalIcon localIcon, LayoutMode layoutMode, List list, DisplayingPredicate displayingPredicate, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, str4, (i12 & 16) != 0 ? null : bool, (i12 & 32) != 0 ? null : bool2, (i12 & 64) != 0 ? null : iconBase64, (i12 & 128) != 0 ? null : iconPosition, (i12 & 256) != 0 ? null : localIcon, (i12 & 512) != 0 ? null : layoutMode, (i12 & 1024) != 0 ? null : list, (i12 & 2048) != 0 ? null : displayingPredicate);
    }

    public static /* synthetic */ BeduinPhoneButtonModel copy$default(BeduinPhoneButtonModel beduinPhoneButtonModel, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, IconBase64 iconBase64, IconPosition iconPosition, LocalIcon localIcon, LayoutMode layoutMode, List list, DisplayingPredicate displayingPredicate, int i12, Object obj) {
        return beduinPhoneButtonModel.copy((i12 & 1) != 0 ? beduinPhoneButtonModel.id : str, (i12 & 2) != 0 ? beduinPhoneButtonModel.title : str2, (i12 & 4) != 0 ? beduinPhoneButtonModel.theme : str3, (i12 & 8) != 0 ? beduinPhoneButtonModel.style : str4, (i12 & 16) != 0 ? beduinPhoneButtonModel.isEnabled : bool, (i12 & 32) != 0 ? beduinPhoneButtonModel.isLoading : bool2, (i12 & 64) != 0 ? beduinPhoneButtonModel.base64Icon : iconBase64, (i12 & 128) != 0 ? beduinPhoneButtonModel.iconPosition : iconPosition, (i12 & 256) != 0 ? beduinPhoneButtonModel.localIcon : localIcon, (i12 & 512) != 0 ? beduinPhoneButtonModel.layoutMode : layoutMode, (i12 & 1024) != 0 ? beduinPhoneButtonModel.actions : list, (i12 & 2048) != 0 ? beduinPhoneButtonModel.displayingPredicate : displayingPredicate);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, null, null, null, null, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), 2047, null) : transform instanceof TextTransform ? copy$default(this, null, ((TextTransform) transform).getText(), null, null, null, null, null, null, null, null, null, null, 4093, null) : transform instanceof IsEnabledTransform ? copy$default(this, null, null, null, null, Boolean.valueOf(((IsEnabledTransform) transform).isEnabled()), null, null, null, null, null, null, null, 4079, null) : transform instanceof IsLoadingTransform ? copy$default(this, null, null, null, null, null, Boolean.valueOf(((IsLoadingTransform) transform).isLoading()), null, null, null, null, null, null, 4063, null) : this;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final LayoutMode getLayoutMode() {
        return this.layoutMode;
    }

    @l
    public final List<BeduinAction> component11() {
        return this.actions;
    }

    @l
    /* renamed from: component12, reason: from getter */
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
    public final Boolean getIsLoading() {
        return this.isLoading;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final IconBase64 getBase64Icon() {
        return this.base64Icon;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final IconPosition getIconPosition() {
        return this.iconPosition;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final LocalIcon getLocalIcon() {
        return this.localIcon;
    }

    @k
    public final BeduinPhoneButtonModel copy(@k String id2, @l String title, @l String theme, @k String style, @l Boolean isEnabled, @l Boolean isLoading, @l IconBase64 base64Icon, @l IconPosition iconPosition, @l LocalIcon localIcon, @l LayoutMode layoutMode, @l List<? extends BeduinAction> actions, @l DisplayingPredicate displayingPredicate) {
        return new BeduinPhoneButtonModel(id2, title, theme, style, isEnabled, isLoading, base64Icon, iconPosition, localIcon, layoutMode, actions, displayingPredicate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinPhoneButtonModel)) {
            return false;
        }
        BeduinPhoneButtonModel beduinPhoneButtonModel = (BeduinPhoneButtonModel) other;
        return L.f(this.id, beduinPhoneButtonModel.id) && L.f(this.title, beduinPhoneButtonModel.title) && L.f(this.theme, beduinPhoneButtonModel.theme) && L.f(this.style, beduinPhoneButtonModel.style) && L.f(this.isEnabled, beduinPhoneButtonModel.isEnabled) && L.f(this.isLoading, beduinPhoneButtonModel.isLoading) && L.f(this.base64Icon, beduinPhoneButtonModel.base64Icon) && this.iconPosition == beduinPhoneButtonModel.iconPosition && L.f(this.localIcon, beduinPhoneButtonModel.localIcon) && this.layoutMode == beduinPhoneButtonModel.layoutMode && L.f(this.actions, beduinPhoneButtonModel.actions) && L.f(this.displayingPredicate, beduinPhoneButtonModel.displayingPredicate);
    }

    @Override // com.avito.android.beduin_shared.model.component.serp.PhoneButtonModel
    @l
    public String findCallDeeplinkAsString() {
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
        String str2 = this.theme;
        int iD2 = H.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.style);
        Boolean bool = this.isEnabled;
        int iHashCode3 = (iD2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isLoading;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        IconBase64 iconBase64 = this.base64Icon;
        int iHashCode5 = (iHashCode4 + (iconBase64 == null ? 0 : iconBase64.hashCode())) * 31;
        IconPosition iconPosition = this.iconPosition;
        int iHashCode6 = (iHashCode5 + (iconPosition == null ? 0 : iconPosition.hashCode())) * 31;
        LocalIcon localIcon = this.localIcon;
        int iHashCode7 = (iHashCode6 + (localIcon == null ? 0 : localIcon.hashCode())) * 31;
        LayoutMode layoutMode = this.layoutMode;
        int iHashCode8 = (iHashCode7 + (layoutMode == null ? 0 : layoutMode.hashCode())) * 31;
        List<BeduinAction> list = this.actions;
        int iHashCode9 = (iHashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return iHashCode9 + (displayingPredicate != null ? displayingPredicate.hashCode() : 0);
    }

    @l
    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    @l
    public final Boolean isLoading() {
        return this.isLoading;
    }

    @Override // com.avito.android.beduin_shared.model.component.serp.PhoneButtonModel
    public void setListener(@l Y41.a<G0> aVar) {
        this.listener = aVar;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinPhoneButtonModel(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", style=");
        sb2.append(this.style);
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
        parcel.writeParcelable(this.displayingPredicate, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinPhoneButtonModel(@k String str, @l String str2, @l String str3, @k String str4, @l Boolean bool, @l Boolean bool2, @l IconBase64 iconBase64, @l IconPosition iconPosition, @l LocalIcon localIcon, @l LayoutMode layoutMode, @l List<? extends BeduinAction> list, @l DisplayingPredicate displayingPredicate) {
        this.id = str;
        this.title = str2;
        this.theme = str3;
        this.style = str4;
        this.isEnabled = bool;
        this.isLoading = bool2;
        this.base64Icon = iconBase64;
        this.iconPosition = iconPosition;
        this.localIcon = localIcon;
        this.layoutMode = layoutMode;
        this.actions = list;
        this.displayingPredicate = displayingPredicate;
    }

    public static /* synthetic */ void getListener$annotations() {
    }
}
