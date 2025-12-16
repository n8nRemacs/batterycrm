package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.PretendErrorValue;
import com.avito.android.remote.model.category_parameters.base.CategoryParameter;
import com.avito.android.remote.model.category_parameters.base.HasError;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditCategoryParameter.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\nR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b!\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\"\u0010\nR \u0010#\u001a\u00020\u00158\u0016X\u0096D¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R \u0010)\u001a\u00020\u00158\u0016X\u0096D¢\u0006\u0012\n\u0004\b)\u0010$\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010&R\"\u0010-\u001a\u0004\u0018\u00010,8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u0010(\u001a\u0004\b/\u00100R*\u00103\u001a\u0004\u0018\u0001028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b3\u00104\u0012\u0004\b9\u0010(\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010\n¨\u0006="}, d2 = {"Lcom/avito/android/remote/model/category_parameters/EditCategoryParameter;", "Lcom/avito/android/remote/model/category_parameters/base/CategoryParameter;", "Lcom/avito/android/remote/model/category_parameters/base/HasError;", "", "id", "title", "parentTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/EditCategoryParameter;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "getParentTitle", "required", "Z", "getRequired", "()Z", "getRequired$annotations", "()V", "immutable", "getImmutable", "getImmutable$annotations", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "()Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation$annotations", "Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;", "error", "Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;", "getError", "()Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;", "setError", "(Lcom/avito/android/remote/model/category_parameters/base/HasError$Error;)V", "getError$annotations", "getType", "type", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EditCategoryParameter extends CategoryParameter implements HasError {

    @k
    public static final String TYPE = "editCategory";

    @l
    private HasError.Error error;

    @c("id")
    @k
    private final String id;
    private final boolean immutable;

    @l
    private final AttributedText motivation;

    @c("parentTitle")
    @k
    private final String parentTitle;
    private final boolean required;

    @c("title")
    @k
    private final String title;

    @k
    public static final Parcelable.Creator<EditCategoryParameter> CREATOR = new Creator();

    /* compiled from: EditCategoryParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<EditCategoryParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EditCategoryParameter createFromParcel(@k Parcel parcel) {
            return new EditCategoryParameter(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final EditCategoryParameter[] newArray(int i12) {
            return new EditCategoryParameter[i12];
        }
    }

    public EditCategoryParameter(@k String str, @k String str2, @k String str3) {
        this.id = str;
        this.title = str2;
        this.parentTitle = str3;
    }

    public static /* synthetic */ EditCategoryParameter copy$default(EditCategoryParameter editCategoryParameter, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = editCategoryParameter.id;
        }
        if ((i12 & 2) != 0) {
            str2 = editCategoryParameter.title;
        }
        if ((i12 & 4) != 0) {
            str3 = editCategoryParameter.parentTitle;
        }
        return editCategoryParameter.copy(str, str2, str3);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public void applyPretendResult(@l PretendErrorValue pretendErrorValue) {
        HasError.DefaultImpls.applyPretendResult(this, pretendErrorValue);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public void clearError() {
        HasError.DefaultImpls.clearError(this);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getParentTitle() {
        return this.parentTitle;
    }

    @k
    public final EditCategoryParameter copy(@k String id2, @k String title, @k String parentTitle) {
        return new EditCategoryParameter(id2, title, parentTitle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditCategoryParameter)) {
            return false;
        }
        EditCategoryParameter editCategoryParameter = (EditCategoryParameter) other;
        return L.f(this.id, editCategoryParameter.id) && L.f(this.title, editCategoryParameter.title) && L.f(this.parentTitle, editCategoryParameter.parentTitle);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    @l
    public HasError.Error getError() {
        return this.error;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    @l
    public AttributedText getErrorMessage() {
        return HasError.DefaultImpls.getErrorMessage((HasError) this);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.ParameterSlot
    @k
    public String getId() {
        return this.id;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getImmutable() {
        return this.immutable;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @l
    public AttributedText getMotivation() {
        return this.motivation;
    }

    @k
    public final String getParentTitle() {
        return this.parentTitle;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    public boolean getRequired() {
        return this.required;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseParameter
    @k
    public String getType() {
        return TYPE;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public boolean hasError() {
        return HasError.DefaultImpls.hasError(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public boolean hasErrorMessage() {
        return HasError.DefaultImpls.hasErrorMessage(this);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.CategoryParameter
    public int hashCode() {
        return this.parentTitle.hashCode() + H.d(this.id.hashCode() * 31, 31, this.title);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public void setError(@l HasError.Error error) {
        this.error = error;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    public void setErrorMessage(@l String str) {
        HasError.DefaultImpls.setErrorMessage(this, str);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("EditCategoryParameter(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", parentTitle=");
        return C22026a.c(sb2, this.parentTitle, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.parentTitle);
    }

    @Override // com.avito.android.remote.model.category_parameters.base.HasError
    @l
    /* renamed from: getErrorMessage */
    public String mo56getErrorMessage() {
        return HasError.DefaultImpls.m57getErrorMessage((HasError) this);
    }

    public static /* synthetic */ void getError$annotations() {
    }

    public static /* synthetic */ void getImmutable$annotations() {
    }

    public static /* synthetic */ void getMotivation$annotations() {
    }

    public static /* synthetic */ void getRequired$annotations() {
    }
}
