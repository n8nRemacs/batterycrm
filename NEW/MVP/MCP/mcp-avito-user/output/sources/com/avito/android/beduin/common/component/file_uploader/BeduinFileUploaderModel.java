package com.avito.android.beduin.common.component.file_uploader;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.component.file_uploader.file.FileItem;
import com.avito.android.beduin.common.component.file_uploader.validation.c;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.ActionsTransform;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.ErrorMessageTransform;
import com.avito.android.beduin.common.form.transforms.FilesTransform;
import com.avito.android.beduin.common.form.transforms.IsEnabledTransform;
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
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinFileUploaderModel.kt */
@s0
@Keep
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0011HÂ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b-\u0010,J\u0082\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b0\u0010\u0018J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u00020\u00112\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u000201HÖ\u0001¢\u0006\u0004\b8\u00103J \u0010=\u001a\u00020<2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u000201HÖ\u0001¢\u0006\u0004\b=\u0010>R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\b@\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010A\u001a\u0004\bB\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bD\u0010&R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010E\u001a\u0004\bF\u0010(R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010G\u001a\u0004\bH\u0010*R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010I\u001a\u0004\bJ\u0010,R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010?R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010KR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\bL\u0010,R\u0013\u0010N\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bM\u0010\u0018R\u0011\u0010Q\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010P¨\u0006S"}, d2 = {"Lcom/avito/android/beduin/common/component/file_uploader/BeduinFileUploaderModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "Lcom/avito/android/beduin/common/component/q;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/file_uploader/TextStyles;", "textStyles", "Lcom/avito/android/beduin/common/component/file_uploader/ButtonConfiguration;", "buttonConfiguration", "Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration;", "apiConfiguration", "", "Lcom/avito/android/beduin/common/component/file_uploader/ValidationRule;", "validationRules", "_errorMessage", "", "_showErrorMessage", "Lcom/avito/android/beduin/common/component/file_uploader/file/FileItem;", "files", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/file_uploader/TextStyles;Lcom/avito/android/beduin/common/component/file_uploader/ButtonConfiguration;Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)V", "component7", "()Ljava/lang/String;", "component8", "()Ljava/lang/Boolean;", "Lcom/avito/android/beduin_models/BeduinModel;", "validateModelByConstraints", "()Lcom/avito/android/beduin_models/BeduinModel;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Lcom/avito/android/beduin/common/component/file_uploader/TextStyles;", "component4", "()Lcom/avito/android/beduin/common/component/file_uploader/ButtonConfiguration;", "component5", "()Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration;", "component6", "()Ljava/util/List;", "component9", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/file_uploader/TextStyles;Lcom/avito/android/beduin/common/component/file_uploader/ButtonConfiguration;Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;)Lcom/avito/android/beduin/common/component/file_uploader/BeduinFileUploaderModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/beduin/common/component/file_uploader/TextStyles;", "getTextStyles", "Lcom/avito/android/beduin/common/component/file_uploader/ButtonConfiguration;", "getButtonConfiguration", "Lcom/avito/android/beduin/common/component/file_uploader/ApiConfiguration;", "getApiConfiguration", "Ljava/util/List;", "getValidationRules", "Ljava/lang/Boolean;", "getFiles", "getErrorMessage", "errorMessage", "getShowErrorMessage", "()Z", "showErrorMessage", "isValid", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes11.dex */
public final /* data */ class BeduinFileUploaderModel extends LeafBeduinModel implements com.avito.android.beduin.common.component.q {

    @Y61.k
    public static final Parcelable.Creator<BeduinFileUploaderModel> CREATOR = new a();

    @com.google.gson.annotations.c("errorMessage")
    @Y61.l
    private final String _errorMessage;

    @com.google.gson.annotations.c("showErrorMessage")
    @Y61.l
    private final Boolean _showErrorMessage;

    @com.google.gson.annotations.c("apiConfiguration")
    @Y61.k
    private final ApiConfiguration apiConfiguration;

    @com.google.gson.annotations.c("buttonConfiguration")
    @Y61.k
    private final ButtonConfiguration buttonConfiguration;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE)
    @Y61.l
    private final DisplayingPredicate displayingPredicate;

    @com.google.gson.annotations.c("files")
    @Y61.l
    private final List<FileItem> files;

    @com.google.gson.annotations.c("id")
    @Y61.k
    private final String id;

    @com.google.gson.annotations.c("textStyles")
    @Y61.l
    private final TextStyles textStyles;

    @com.google.gson.annotations.c("validationRules")
    @Y61.l
    private final List<ValidationRule> validationRules;

    /* compiled from: BeduinFileUploaderModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinFileUploaderModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinFileUploaderModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinFileUploaderModel.class.getClassLoader());
            ArrayList arrayList2 = null;
            TextStyles textStylesCreateFromParcel = parcel.readInt() == 0 ? null : TextStyles.CREATOR.createFromParcel(parcel);
            ButtonConfiguration buttonConfigurationCreateFromParcel = ButtonConfiguration.CREATOR.createFromParcel(parcel);
            ApiConfiguration apiConfigurationCreateFromParcel = ApiConfiguration.CREATOR.createFromParcel(parcel);
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinFileUploaderModel.class, parcel, arrayList, iL2, 1);
                }
            }
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iC2 != i13) {
                    iC2 = com.avito.android.actions_sheet.a.c(FileItem.CREATOR, parcel, arrayList2, iC2, 1);
                }
            }
            return new BeduinFileUploaderModel(string, displayingPredicate, textStylesCreateFromParcel, buttonConfigurationCreateFromParcel, apiConfigurationCreateFromParcel, arrayList, string2, boolValueOf, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinFileUploaderModel[] newArray(int i12) {
            return new BeduinFileUploaderModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinFileUploaderModel(@Y61.k String str, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l TextStyles textStyles, @Y61.k ButtonConfiguration buttonConfiguration, @Y61.k ApiConfiguration apiConfiguration, @Y61.l List<? extends ValidationRule> list, @Y61.l String str2, @Y61.l Boolean bool, @Y61.l List<FileItem> list2) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.textStyles = textStyles;
        this.buttonConfiguration = buttonConfiguration;
        this.apiConfiguration = apiConfiguration;
        this.validationRules = list;
        this._errorMessage = str2;
        this._showErrorMessage = bool;
        this.files = list2;
    }

    /* renamed from: component7, reason: from getter */
    private final String get_errorMessage() {
        return this._errorMessage;
    }

    /* renamed from: component8, reason: from getter */
    private final Boolean get_showErrorMessage() {
        return this._showErrorMessage;
    }

    public static /* synthetic */ BeduinFileUploaderModel copy$default(BeduinFileUploaderModel beduinFileUploaderModel, String str, DisplayingPredicate displayingPredicate, TextStyles textStyles, ButtonConfiguration buttonConfiguration, ApiConfiguration apiConfiguration, List list, String str2, Boolean bool, List list2, int i12, Object obj) {
        return beduinFileUploaderModel.copy((i12 & 1) != 0 ? beduinFileUploaderModel.id : str, (i12 & 2) != 0 ? beduinFileUploaderModel.displayingPredicate : displayingPredicate, (i12 & 4) != 0 ? beduinFileUploaderModel.textStyles : textStyles, (i12 & 8) != 0 ? beduinFileUploaderModel.buttonConfiguration : buttonConfiguration, (i12 & 16) != 0 ? beduinFileUploaderModel.apiConfiguration : apiConfiguration, (i12 & 32) != 0 ? beduinFileUploaderModel.validationRules : list, (i12 & 64) != 0 ? beduinFileUploaderModel._errorMessage : str2, (i12 & 128) != 0 ? beduinFileUploaderModel._showErrorMessage : bool, (i12 & 256) != 0 ? beduinFileUploaderModel.files : list2);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @Y61.k
    public BeduinModel apply(@Y61.k BeduinModelTransform transform) {
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, null, null, null, null, null, null, 509, null) : transform instanceof IsEnabledTransform ? copy$default(this, null, null, null, ButtonConfiguration.copy$default(this.buttonConfiguration, null, null, null, null, null, Boolean.valueOf(((IsEnabledTransform) transform).isEnabled()), null, 95, null), null, null, null, null, null, 503, null) : transform instanceof ActionsTransform ? copy$default(this, null, null, null, ButtonConfiguration.copy$default(this.buttonConfiguration, null, null, null, null, null, null, ((ActionsTransform) transform).getActions(), 63, null), null, null, null, null, null, 503, null) : transform instanceof ErrorMessageTransform ? copy$default(this, null, null, null, null, null, null, ((ErrorMessageTransform) transform).getErrorMessage(), null, null, 447, null) : transform instanceof ShowErrorMessageTransform ? copy$default(this, null, null, null, null, null, null, null, Boolean.valueOf(((ShowErrorMessageTransform) transform).getShowErrorMessage()), null, 383, null) : transform instanceof FilesTransform ? copy$default(this, null, null, null, null, null, null, null, null, ((FilesTransform) transform).f103384b, 255, null) : this;
    }

    @Y61.k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @Y61.l
    /* renamed from: component3, reason: from getter */
    public final TextStyles getTextStyles() {
        return this.textStyles;
    }

    @Y61.k
    /* renamed from: component4, reason: from getter */
    public final ButtonConfiguration getButtonConfiguration() {
        return this.buttonConfiguration;
    }

    @Y61.k
    /* renamed from: component5, reason: from getter */
    public final ApiConfiguration getApiConfiguration() {
        return this.apiConfiguration;
    }

    @Y61.l
    public final List<ValidationRule> component6() {
        return this.validationRules;
    }

    @Y61.l
    public final List<FileItem> component9() {
        return this.files;
    }

    @Y61.k
    public final BeduinFileUploaderModel copy(@Y61.k String id2, @Y61.l DisplayingPredicate displayingPredicate, @Y61.l TextStyles textStyles, @Y61.k ButtonConfiguration buttonConfiguration, @Y61.k ApiConfiguration apiConfiguration, @Y61.l List<? extends ValidationRule> validationRules, @Y61.l String _errorMessage, @Y61.l Boolean _showErrorMessage, @Y61.l List<FileItem> files) {
        return new BeduinFileUploaderModel(id2, displayingPredicate, textStyles, buttonConfiguration, apiConfiguration, validationRules, _errorMessage, _showErrorMessage, files);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinFileUploaderModel)) {
            return false;
        }
        BeduinFileUploaderModel beduinFileUploaderModel = (BeduinFileUploaderModel) other;
        return L.f(this.id, beduinFileUploaderModel.id) && L.f(this.displayingPredicate, beduinFileUploaderModel.displayingPredicate) && L.f(this.textStyles, beduinFileUploaderModel.textStyles) && L.f(this.buttonConfiguration, beduinFileUploaderModel.buttonConfiguration) && L.f(this.apiConfiguration, beduinFileUploaderModel.apiConfiguration) && L.f(this.validationRules, beduinFileUploaderModel.validationRules) && L.f(this._errorMessage, beduinFileUploaderModel._errorMessage) && L.f(this._showErrorMessage, beduinFileUploaderModel._showErrorMessage) && L.f(this.files, beduinFileUploaderModel.files);
    }

    @Y61.k
    public final ApiConfiguration getApiConfiguration() {
        return this.apiConfiguration;
    }

    @Y61.k
    public final ButtonConfiguration getButtonConfiguration() {
        return this.buttonConfiguration;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @Y61.l
    public final String getErrorMessage() {
        String str = this._errorMessage;
        if (getShowErrorMessage()) {
            return str;
        }
        return null;
    }

    @Y61.l
    public final List<FileItem> getFiles() {
        return this.files;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @Y61.k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    public final boolean getShowErrorMessage() {
        Boolean bool = this._showErrorMessage;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Y61.l
    public final TextStyles getTextStyles() {
        return this.textStyles;
    }

    @Y61.l
    public final List<ValidationRule> getValidationRules() {
        return this.validationRules;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int iHashCode2 = (iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31;
        TextStyles textStyles = this.textStyles;
        int iHashCode3 = (this.apiConfiguration.hashCode() + ((this.buttonConfiguration.hashCode() + ((iHashCode2 + (textStyles == null ? 0 : textStyles.hashCode())) * 31)) * 31)) * 31;
        List<ValidationRule> list = this.validationRules;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this._errorMessage;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this._showErrorMessage;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<FileItem> list2 = this.files;
        return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    public boolean isValid() {
        return com.avito.android.beduin.common.component.file_uploader.validation.b.c(this.validationRules, this.files) instanceof c.C3037c;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinFileUploaderModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", textStyles=");
        sb2.append(this.textStyles);
        sb2.append(", buttonConfiguration=");
        sb2.append(this.buttonConfiguration);
        sb2.append(", apiConfiguration=");
        sb2.append(this.apiConfiguration);
        sb2.append(", validationRules=");
        sb2.append(this.validationRules);
        sb2.append(", _errorMessage=");
        sb2.append(this._errorMessage);
        sb2.append(", _showErrorMessage=");
        sb2.append(this._showErrorMessage);
        sb2.append(", files=");
        return H.p(sb2, this.files, ')');
    }

    @Override // com.avito.android.beduin.common.component.q
    @Y61.k
    public BeduinModel validateModelByConstraints() {
        com.avito.android.beduin.common.component.file_uploader.validation.c cVarC = com.avito.android.beduin.common.component.file_uploader.validation.b.c(this.validationRules, this.files);
        if (cVarC instanceof c.b) {
            return copy$default(this, null, null, null, null, null, null, ((c.b) cVarC).f101349b, Boolean.TRUE, null, 319, null);
        }
        if (L.f(cVarC, c.C3037c.f101350b)) {
            return copy$default(this, null, null, null, null, null, null, null, null, null, 319, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        TextStyles textStyles = this.textStyles;
        if (textStyles == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textStyles.writeToParcel(parcel, flags);
        }
        this.buttonConfiguration.writeToParcel(parcel, flags);
        this.apiConfiguration.writeToParcel(parcel, flags);
        List<ValidationRule> list = this.validationRules;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this._errorMessage);
        Boolean bool = this._showErrorMessage;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        List<FileItem> list2 = this.files;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
        while (itA2.hasNext()) {
            ((FileItem) itA2.next()).writeToParcel(parcel, flags);
        }
    }
}
