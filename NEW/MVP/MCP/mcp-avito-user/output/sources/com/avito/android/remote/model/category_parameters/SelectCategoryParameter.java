package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Category;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.base.EditableParameter;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectCategoryParameter.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 =2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R \u0010)\u001a\u00020\u00038\u0016X\u0096D¢\u0006\u0012\n\u0004\b)\u0010\u0018\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR \u0010-\u001a\u00020\u00058\u0016X\u0096D¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u0010,\u001a\u0004\b/\u00100R \u00102\u001a\u00020\u00058\u0016X\u0096D¢\u0006\u0012\n\u0004\b2\u0010.\u0012\u0004\b4\u0010,\u001a\u0004\b3\u00100R\"\u00106\u001a\u0004\u0018\u0001058\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010,\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u001a¨\u0006>"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/SelectCategoryParameter;", "Lcom/avito/android/remote/model/category_parameters/base/EditableParameter;", "Lcom/avito/android/remote/model/Category;", "", "id", "", "updatesForm", "_value", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying;", Navigation.DISPLAYING, "", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Value;", "values", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/Category;Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "getUpdatesForm", "()Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/Category;", "get_value", "()Lcom/avito/android/remote/model/Category;", "set_value", "(Lcom/avito/android/remote/model/Category;)V", "Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying;", "getDisplaying", "()Lcom/avito/android/remote/model/category_parameters/SelectParameter$Displaying;", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "title", "getTitle", "getTitle$annotations", "()V", "required", "Z", "getRequired", "()Z", "getRequired$annotations", "immutable", "getImmutable", "getImmutable$annotations", "Lcom/avito/android/remote/model/text/AttributedText;", "motivation", "Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation", "()Lcom/avito/android/remote/model/text/AttributedText;", "getMotivation$annotations", "getType", "type", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SelectCategoryParameter extends EditableParameter<Category> {

    @k
    public static final String TYPE = "category";

    @c("value")
    @l
    private Category _value;

    @c(Navigation.DISPLAYING)
    @l
    private final SelectParameter.Displaying displaying;

    @c("id")
    @k
    private final String id;
    private final boolean immutable;

    @l
    private final AttributedText motivation;
    private final boolean required;

    @k
    private final String title;

    @c("updatesForm")
    @l
    private final Boolean updatesForm;

    @c("values")
    @l
    private final List<SelectParameter.Value> values;

    @k
    public static final Parcelable.Creator<SelectCategoryParameter> CREATOR = new Creator();

    /* compiled from: SelectCategoryParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SelectCategoryParameter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SelectCategoryParameter createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            int iC2 = 0;
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Category categoryCreateFromParcel = parcel.readInt() == 0 ? null : Category.CREATOR.createFromParcel(parcel);
            SelectParameter.Displaying displayingCreateFromParcel = parcel.readInt() == 0 ? null : SelectParameter.Displaying.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = a.c(SelectParameter.Value.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new SelectCategoryParameter(string, boolValueOf, categoryCreateFromParcel, displayingCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SelectCategoryParameter[] newArray(int i12) {
            return new SelectCategoryParameter[i12];
        }
    }

    public /* synthetic */ SelectCategoryParameter(String str, Boolean bool, Category category, SelectParameter.Displaying displaying, List list, int i12, C42822w c42822w) {
        this(str, bool, category, (i12 & 8) != 0 ? null : displaying, (i12 & 16) != 0 ? null : list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final SelectParameter.Displaying getDisplaying() {
        return this.displaying;
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
        return "category";
    }

    @Override // com.avito.android.remote.model.category_parameters.base.BaseEditableParameter
    @l
    public Boolean getUpdatesForm() {
        return this.updatesForm;
    }

    @l
    public final List<SelectParameter.Value> getValues() {
        return this.values;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        Boolean bool = this.updatesForm;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Category category = this._value;
        if (category == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            category.writeToParcel(parcel, flags);
        }
        SelectParameter.Displaying displaying = this.displaying;
        if (displaying == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            displaying.writeToParcel(parcel, flags);
        }
        List<SelectParameter.Value> list = this.values;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((SelectParameter.Value) itA.next()).writeToParcel(parcel, flags);
        }
    }

    public SelectCategoryParameter(@k String str, @l Boolean bool, @l Category category, @l SelectParameter.Displaying displaying, @l List<SelectParameter.Value> list) {
        this.id = str;
        this.updatesForm = bool;
        this._value = category;
        this.displaying = displaying;
        this.values = list;
        this.title = "";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    @l
    public Category get_value() {
        return this._value;
    }

    @Override // com.avito.android.remote.model.category_parameters.base.EditableParameter
    public void set_value(@l Category category) {
        this._value = category;
    }

    public static /* synthetic */ void getImmutable$annotations() {
    }

    public static /* synthetic */ void getMotivation$annotations() {
    }

    public static /* synthetic */ void getRequired$annotations() {
    }

    public static /* synthetic */ void getTitle$annotations() {
    }
}
