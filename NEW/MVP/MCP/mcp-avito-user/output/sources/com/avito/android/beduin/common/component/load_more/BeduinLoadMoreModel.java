package com.avito.android.beduin.common.component.load_more;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.IsEnabledTransform;
import com.avito.android.beduin.common.form.transforms.IsLoadingTransform;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BeduinLoadMoreModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\fHÂ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010#JZ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u0019J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020'HÖ\u0001¢\u0006\u0004\b.\u0010)J \u00103\u001a\u0002022\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020'HÖ\u0001¢\u0006\u0004\b3\u00104R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b\r\u0010#R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010@R\u0017\u0010A\u001a\u00020\f8F¢\u0006\f\u0012\u0004\bB\u0010C\u001a\u0004\bA\u0010#¨\u0006D"}, d2 = {"Lcom/avito/android/beduin/common/component/load_more/BeduinLoadMoreModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "", "id", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/beduin/common/component/load_more/Spinner;", "spinner", "Lcom/avito/android/beduin/common/component/load_more/ErrorToast;", "errorToast", "Lcom/avito/android/beduin/common/component/load_more/NextPageRequest;", "nextPageRequest", "", "isLoading", "_isEnabled", "<init>", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/load_more/Spinner;Lcom/avito/android/beduin/common/component/load_more/ErrorToast;Lcom/avito/android/beduin/common/component/load_more/NextPageRequest;ZLjava/lang/Boolean;)V", "component7", "()Ljava/lang/Boolean;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component3", "()Lcom/avito/android/beduin/common/component/load_more/Spinner;", "component4", "()Lcom/avito/android/beduin/common/component/load_more/ErrorToast;", "component5", "()Lcom/avito/android/beduin/common/component/load_more/NextPageRequest;", "component6", "()Z", "copy", "(Ljava/lang/String;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/beduin/common/component/load_more/Spinner;Lcom/avito/android/beduin/common/component/load_more/ErrorToast;Lcom/avito/android/beduin/common/component/load_more/NextPageRequest;ZLjava/lang/Boolean;)Lcom/avito/android/beduin/common/component/load_more/BeduinLoadMoreModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/beduin/common/component/load_more/Spinner;", "getSpinner", "Lcom/avito/android/beduin/common/component/load_more/ErrorToast;", "getErrorToast", "Lcom/avito/android/beduin/common/component/load_more/NextPageRequest;", "getNextPageRequest", "Z", "Ljava/lang/Boolean;", "isEnabled", "isEnabled$annotations", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinLoadMoreModel extends LeafBeduinModel {

    @k
    public static final Parcelable.Creator<BeduinLoadMoreModel> CREATOR = new a();

    @com.google.gson.annotations.c("isEnabled")
    @l
    private final Boolean _isEnabled;

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final ErrorToast errorToast;

    @k
    private final String id;
    private final transient boolean isLoading;

    @k
    private final NextPageRequest nextPageRequest;

    @k
    private final Spinner spinner;

    /* compiled from: BeduinLoadMoreModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinLoadMoreModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinLoadMoreModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            DisplayingPredicate displayingPredicate = (DisplayingPredicate) parcel.readParcelable(BeduinLoadMoreModel.class.getClassLoader());
            Spinner spinnerCreateFromParcel = Spinner.CREATOR.createFromParcel(parcel);
            ErrorToast errorToastCreateFromParcel = ErrorToast.CREATOR.createFromParcel(parcel);
            NextPageRequest nextPageRequestCreateFromParcel = NextPageRequest.CREATOR.createFromParcel(parcel);
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BeduinLoadMoreModel(string, displayingPredicate, spinnerCreateFromParcel, errorToastCreateFromParcel, nextPageRequestCreateFromParcel, z12, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinLoadMoreModel[] newArray(int i12) {
            return new BeduinLoadMoreModel[i12];
        }
    }

    public /* synthetic */ BeduinLoadMoreModel(String str, DisplayingPredicate displayingPredicate, Spinner spinner, ErrorToast errorToast, NextPageRequest nextPageRequest, boolean z12, Boolean bool, int i12, C42822w c42822w) {
        this(str, displayingPredicate, spinner, errorToast, nextPageRequest, (i12 & 32) != 0 ? true : z12, bool);
    }

    /* renamed from: component7, reason: from getter */
    private final Boolean get_isEnabled() {
        return this._isEnabled;
    }

    public static /* synthetic */ BeduinLoadMoreModel copy$default(BeduinLoadMoreModel beduinLoadMoreModel, String str, DisplayingPredicate displayingPredicate, Spinner spinner, ErrorToast errorToast, NextPageRequest nextPageRequest, boolean z12, Boolean bool, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinLoadMoreModel.id;
        }
        if ((i12 & 2) != 0) {
            displayingPredicate = beduinLoadMoreModel.displayingPredicate;
        }
        DisplayingPredicate displayingPredicate2 = displayingPredicate;
        if ((i12 & 4) != 0) {
            spinner = beduinLoadMoreModel.spinner;
        }
        Spinner spinner2 = spinner;
        if ((i12 & 8) != 0) {
            errorToast = beduinLoadMoreModel.errorToast;
        }
        ErrorToast errorToast2 = errorToast;
        if ((i12 & 16) != 0) {
            nextPageRequest = beduinLoadMoreModel.nextPageRequest;
        }
        NextPageRequest nextPageRequest2 = nextPageRequest;
        if ((i12 & 32) != 0) {
            z12 = beduinLoadMoreModel.isLoading;
        }
        boolean z13 = z12;
        if ((i12 & 64) != 0) {
            bool = beduinLoadMoreModel._isEnabled;
        }
        return beduinLoadMoreModel.copy(str, displayingPredicate2, spinner2, errorToast2, nextPageRequest2, z13, bool);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        if (transform instanceof IsLoadingTransform) {
            return copy$default(this, null, null, null, null, null, ((IsLoadingTransform) transform).isLoading() && isEnabled(), null, 95, null);
        }
        if (!(transform instanceof IsEnabledTransform)) {
            return super.apply(transform);
        }
        IsEnabledTransform isEnabledTransform = (IsEnabledTransform) transform;
        return copy$default(this, null, null, null, null, null, this.isLoading && isEnabledTransform.isEnabled(), Boolean.valueOf(isEnabledTransform.isEnabled()), 31, null);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final Spinner getSpinner() {
        return this.spinner;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final ErrorToast getErrorToast() {
        return this.errorToast;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final NextPageRequest getNextPageRequest() {
        return this.nextPageRequest;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    @k
    public final BeduinLoadMoreModel copy(@k String id2, @l DisplayingPredicate displayingPredicate, @k Spinner spinner, @k ErrorToast errorToast, @k NextPageRequest nextPageRequest, boolean isLoading, @l Boolean _isEnabled) {
        return new BeduinLoadMoreModel(id2, displayingPredicate, spinner, errorToast, nextPageRequest, isLoading, _isEnabled);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinLoadMoreModel)) {
            return false;
        }
        BeduinLoadMoreModel beduinLoadMoreModel = (BeduinLoadMoreModel) other;
        return L.f(this.id, beduinLoadMoreModel.id) && L.f(this.displayingPredicate, beduinLoadMoreModel.displayingPredicate) && L.f(this.spinner, beduinLoadMoreModel.spinner) && L.f(this.errorToast, beduinLoadMoreModel.errorToast) && L.f(this.nextPageRequest, beduinLoadMoreModel.nextPageRequest) && this.isLoading == beduinLoadMoreModel.isLoading && L.f(this._isEnabled, beduinLoadMoreModel._isEnabled);
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @k
    public final ErrorToast getErrorToast() {
        return this.errorToast;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @k
    public final NextPageRequest getNextPageRequest() {
        return this.nextPageRequest;
    }

    @k
    public final Spinner getSpinner() {
        return this.spinner;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        int i12 = r.i((this.nextPageRequest.hashCode() + ((this.errorToast.hashCode() + ((this.spinner.hashCode() + ((iHashCode + (displayingPredicate == null ? 0 : displayingPredicate.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.isLoading);
        Boolean bool = this._isEnabled;
        return i12 + (bool != null ? bool.hashCode() : 0);
    }

    public final boolean isEnabled() {
        return !L.f(this._isEnabled, Boolean.FALSE);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinLoadMoreModel(id=");
        sb2.append(this.id);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", spinner=");
        sb2.append(this.spinner);
        sb2.append(", errorToast=");
        sb2.append(this.errorToast);
        sb2.append(", nextPageRequest=");
        sb2.append(this.nextPageRequest);
        sb2.append(", isLoading=");
        sb2.append(this.isLoading);
        sb2.append(", _isEnabled=");
        return C0.g(sb2, this._isEnabled, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeParcelable(this.displayingPredicate, flags);
        this.spinner.writeToParcel(parcel, flags);
        this.errorToast.writeToParcel(parcel, flags);
        this.nextPageRequest.writeToParcel(parcel, flags);
        parcel.writeInt(this.isLoading ? 1 : 0);
        Boolean bool = this._isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public BeduinLoadMoreModel(@k String str, @l DisplayingPredicate displayingPredicate, @k Spinner spinner, @k ErrorToast errorToast, @k NextPageRequest nextPageRequest, boolean z12, @l Boolean bool) {
        this.id = str;
        this.displayingPredicate = displayingPredicate;
        this.spinner = spinner;
        this.errorToast = errorToast;
        this.nextPageRequest = nextPageRequest;
        this.isLoading = z12;
        this._isEnabled = bool;
    }

    public static /* synthetic */ void isEnabled$annotations() {
    }
}
