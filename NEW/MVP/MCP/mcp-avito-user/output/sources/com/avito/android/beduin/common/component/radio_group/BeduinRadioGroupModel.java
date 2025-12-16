package com.avito.android.beduin.common.component.radio_group;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.BeduinComponentTheme;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.ErrorMessageTransform;
import com.avito.android.beduin.common.form.transforms.IsEnabledTransform;
import com.avito.android.beduin.common.form.transforms.OptionTitleTransform;
import com.avito.android.beduin.common.form.transforms.SelectedIdTransform;
import com.avito.android.beduin.common.form.transforms.ShowErrorMessageTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinRadioGroupModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bc\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b*\u0010\u001fJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b+\u0010!J~\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b.\u0010\u001fJ\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\u00052\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020/HÖ\u0001¢\u0006\u0004\b6\u00101J \u0010;\u001a\u00020:2\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u00020/HÖ\u0001¢\u0006\u0004\b;\u0010<R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b>\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\b\u0006\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b\u0007\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b@\u0010\u001fR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bF\u0010)R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\bG\u0010\u001fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\bH\u0010!R\u0014\u0010I\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0013\u0010L\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bK\u0010\u001f¨\u0006M"}, d2 = {"Lcom/avito/android/beduin/common/component/radio_group/BeduinRadioGroupModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "Lcom/avito/android/beduin/common/component/q;", "", "id", "", "isRequired", "isEnabled", "selectedId", "", "Lcom/avito/android/beduin/common/component/radio_group/Option;", "options", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "errorMessage", "showErrorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Ljava/lang/Boolean;)V", "Lcom/avito/android/beduin_models/BeduinModel;", "validateModelByConstraints", "()Lcom/avito/android/beduin_models/BeduinModel;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "optionId", "findOptionById", "(Ljava/lang/String;)Lcom/avito/android/beduin/common/component/radio_group/Option;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "()Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "component7", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/beduin/common/component/BeduinComponentTheme;Lcom/avito/android/beduin_models/DisplayingPredicate;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/avito/android/beduin/common/component/radio_group/BeduinRadioGroupModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/lang/Boolean;", "getSelectedId", "Ljava/util/List;", "getOptions", "Lcom/avito/android/beduin/common/component/BeduinComponentTheme;", "getTheme", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "getErrorMessage", "getShowErrorMessage", "isValid", "()Z", "getErrorMessageToDisplay", "errorMessageToDisplay", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class BeduinRadioGroupModel extends LeafBeduinModel implements com.avito.android.beduin.common.component.q {

    @Y61.k
    public static final Parcelable.Creator<BeduinRadioGroupModel> CREATOR = new a();

    @Y61.l
    private final DisplayingPredicate displayingPredicate;

    @Y61.l
    private final String errorMessage;

    @Y61.k
    private final String id;

    @Y61.l
    private final Boolean isEnabled;

    @Y61.l
    private final Boolean isRequired;

    @Y61.k
    private final List<Option> options;

    @Y61.l
    private final String selectedId;

    @Y61.l
    private final transient Boolean showErrorMessage;

    @Y61.l
    private final BeduinComponentTheme theme;

    /* compiled from: BeduinRadioGroupModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinRadioGroupModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinRadioGroupModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            String string = parcel.readString();
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
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Option.CREATOR, parcel, arrayList, iC2, 1);
            }
            BeduinComponentTheme beduinComponentThemeCreateFromParcel = parcel.readInt() == 0 ? null : BeduinComponentTheme.CREATOR.createFromParcel(parcel);
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinRadioGroupModel.class.getClassLoader());
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinRadioGroupModel(string, boolValueOf, boolValueOf2, string2, arrayList, beduinComponentThemeCreateFromParcel, displayingPredicate, string3, boolValueOf3);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinRadioGroupModel[] newArray(int i12) {
            return new BeduinRadioGroupModel[i12];
        }
    }

    public BeduinRadioGroupModel(@Y61.k String str, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l String str2, @Y61.k List<Option> list, @Y61.l BeduinComponentTheme beduinComponentTheme, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l String str3, @Y61.l Boolean bool3) {
        this.id = str;
        this.isRequired = bool;
        this.isEnabled = bool2;
        this.selectedId = str2;
        this.options = list;
        this.theme = beduinComponentTheme;
        this.displayingPredicate = displayingPredicate;
        this.errorMessage = str3;
        this.showErrorMessage = bool3;
    }

    public static /* synthetic */ BeduinRadioGroupModel copy$default(BeduinRadioGroupModel beduinRadioGroupModel, String str, Boolean bool, Boolean bool2, String str2, List list, BeduinComponentTheme beduinComponentTheme, DisplayingPredicate displayingPredicate, String str3, Boolean bool3, int i12, Object obj) {
        return beduinRadioGroupModel.copy((i12 & 1) != 0 ? beduinRadioGroupModel.id : str, (i12 & 2) != 0 ? beduinRadioGroupModel.isRequired : bool, (i12 & 4) != 0 ? beduinRadioGroupModel.isEnabled : bool2, (i12 & 8) != 0 ? beduinRadioGroupModel.selectedId : str2, (i12 & 16) != 0 ? beduinRadioGroupModel.options : list, (i12 & 32) != 0 ? beduinRadioGroupModel.theme : beduinComponentTheme, (i12 & 64) != 0 ? beduinRadioGroupModel.displayingPredicate : displayingPredicate, (i12 & 128) != 0 ? beduinRadioGroupModel.errorMessage : str3, (i12 & 256) != 0 ? beduinRadioGroupModel.showErrorMessage : bool3);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public BeduinModel apply(@Y61.k BeduinModelTransform transform) {
        if (transform instanceof DisplayPredicateTransform) {
            return copy$default(this, null, null, null, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, 447, null);
        }
        if (transform instanceof SelectedIdTransform) {
            return copy$default(this, null, null, null, ((SelectedIdTransform) transform).getSelectedId(), null, null, null, null, null, 503, null);
        }
        if (transform instanceof IsEnabledTransform) {
            return copy$default(this, null, null, Boolean.valueOf(((IsEnabledTransform) transform).isEnabled()), null, null, null, null, null, null, 507, null);
        }
        if (!(transform instanceof OptionTitleTransform)) {
            return transform instanceof ErrorMessageTransform ? copy$default(this, null, null, null, null, null, null, null, ((ErrorMessageTransform) transform).getErrorMessage(), null, 383, null) : transform instanceof ShowErrorMessageTransform ? copy$default(this, null, null, null, null, null, null, null, null, Boolean.valueOf(((ShowErrorMessageTransform) transform).getShowErrorMessage()), 255, null) : this;
        }
        List<Option> list = this.options;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (Option optionCopy : list) {
            OptionTitleTransform optionTitleTransform = (OptionTitleTransform) transform;
            if (L.f(optionCopy.getId(), optionTitleTransform.getId())) {
                optionCopy = optionCopy.copy((2045 & 1) != 0 ? optionCopy.id : null, (2045 & 2) != 0 ? optionCopy.title : optionTitleTransform.getTitle(), (2045 & 4) != 0 ? optionCopy.subtitle : null, (2045 & 8) != 0 ? optionCopy.attributedTitle : null, (2045 & 16) != 0 ? optionCopy.secondSubtitle : null, (2045 & 32) != 0 ? optionCopy.isEnabled : null, (2045 & 64) != 0 ? optionCopy.titleIconButton : null, (2045 & 128) != 0 ? optionCopy.attributedSubtitle : null, (2045 & 256) != 0 ? optionCopy.titleBadge : null, (2045 & 512) != 0 ? optionCopy.onSelectActions : null, (2045 & 1024) != 0 ? optionCopy.content : null);
            }
            arrayList.add(optionCopy);
        }
        return copy$default(this, null, null, null, null, arrayList, null, null, null, null, 495, null);
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final Boolean getIsRequired() {
        return this.isRequired;
    }

    @Y61.l
    /* renamed from: component3, reason: from getter */
    public final Boolean getIsEnabled() {
        return this.isEnabled;
    }

    @Y61.l
    /* renamed from: component4, reason: from getter */
    public final String getSelectedId() {
        return this.selectedId;
    }

    @Y61.k
    public final List<Option> component5() {
        return this.options;
    }

    @Y61.l
    /* renamed from: component6, reason: from getter */
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    @Y61.l
    /* renamed from: component7, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Y61.l
    /* renamed from: component8, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Y61.l
    /* renamed from: component9, reason: from getter */
    public final Boolean getShowErrorMessage() {
        return this.showErrorMessage;
    }

    @Y61.k
    public final BeduinRadioGroupModel copy(@Y61.k String id2, @Y61.l Boolean isRequired, @Y61.l Boolean isEnabled, @Y61.l String selectedId, @Y61.k List<Option> options, @Y61.l BeduinComponentTheme theme, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l String errorMessage, @Y61.l Boolean showErrorMessage) {
        return new BeduinRadioGroupModel(id2, isRequired, isEnabled, selectedId, options, theme, displayingPredicate, errorMessage, showErrorMessage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinRadioGroupModel)) {
            return false;
        }
        BeduinRadioGroupModel beduinRadioGroupModel = (BeduinRadioGroupModel) other;
        return L.f(this.id, beduinRadioGroupModel.id) && L.f(this.isRequired, beduinRadioGroupModel.isRequired) && L.f(this.isEnabled, beduinRadioGroupModel.isEnabled) && L.f(this.selectedId, beduinRadioGroupModel.selectedId) && L.f(this.options, beduinRadioGroupModel.options) && this.theme == beduinRadioGroupModel.theme && L.f(this.displayingPredicate, beduinRadioGroupModel.displayingPredicate) && L.f(this.errorMessage, beduinRadioGroupModel.errorMessage) && L.f(this.showErrorMessage, beduinRadioGroupModel.showErrorMessage);
    }

    @Y61.l
    public final Option findOptionById(@Y61.l String optionId) {
        Object next;
        Iterator<T> it = this.options.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((Option) next).getId(), optionId)) {
                break;
            }
        }
        return (Option) next;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF102945c() {
        return this.displayingPredicate;
    }

    @Y61.l
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @Y61.l
    public final String getErrorMessageToDisplay() {
        String str = this.errorMessage;
        if (L.f(this.showErrorMessage, Boolean.TRUE)) {
            return str;
        }
        return null;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    /* renamed from: getId */
    public String getF102944b() {
        return this.id;
    }

    @Y61.k
    public final List<Option> getOptions() {
        return this.options;
    }

    @Y61.l
    public final String getSelectedId() {
        return this.selectedId;
    }

    @Y61.l
    public final Boolean getShowErrorMessage() {
        return this.showErrorMessage;
    }

    @Y61.l
    public final BeduinComponentTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Boolean bool = this.isRequired;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isEnabled;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.selectedId;
        int iE2 = H.e((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.options);
        BeduinComponentTheme beduinComponentTheme = this.theme;
        int iHashCode4 = (iE2 + (beduinComponentTheme == null ? 0 : beduinComponentTheme.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode5 = (iHashCode4 + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        String str2 = this.errorMessage;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool3 = this.showErrorMessage;
        return iHashCode6 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @Y61.l
    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    @Y61.l
    public final Boolean isRequired() {
        return this.isRequired;
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    public boolean isValid() {
        Boolean bool = this.isRequired;
        if (L.f(bool, Boolean.TRUE) || bool == null) {
            return this.selectedId != null;
        }
        if (L.f(bool, Boolean.FALSE)) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinRadioGroupModel(id=");
        sb2.append(this.id);
        sb2.append(", isRequired=");
        sb2.append(this.isRequired);
        sb2.append(", isEnabled=");
        sb2.append(this.isEnabled);
        sb2.append(", selectedId=");
        sb2.append(this.selectedId);
        sb2.append(", options=");
        sb2.append(this.options);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", errorMessage=");
        sb2.append(this.errorMessage);
        sb2.append(", showErrorMessage=");
        return C0.g(sb2, this.showErrorMessage, ')');
    }

    @Override // com.avito.android.beduin.common.component.q
    @Y61.k
    public BeduinModel validateModelByConstraints() {
        return copy$default(this, null, null, null, null, null, null, null, null, Boolean.valueOf(!isValid()), 255, null);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        Boolean bool = this.isRequired;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.isEnabled;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeString(this.selectedId);
        Iterator itJ = C0.j(this.options, parcel);
        while (itJ.hasNext()) {
            ((Option) itJ.next()).writeToParcel(parcel, flags);
        }
        BeduinComponentTheme beduinComponentTheme = this.theme;
        if (beduinComponentTheme == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            beduinComponentTheme.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.displayingPredicate, flags);
        parcel.writeString(this.errorMessage);
        Boolean bool3 = this.showErrorMessage;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
    }
}
