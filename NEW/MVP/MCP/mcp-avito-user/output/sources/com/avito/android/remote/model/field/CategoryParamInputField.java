package com.avito.android.remote.model.field;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.CategoryParam;
import j.P;

/* loaded from: classes17.dex */
public class CategoryParamInputField extends CategoryParamField<String> {
    public static final Parcelable.Creator<CategoryParamInputField> CREATOR = new Parcelable.Creator<CategoryParamInputField>() { // from class: com.avito.android.remote.model.field.CategoryParamInputField.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CategoryParamInputField createFromParcel(Parcel parcel) {
            return new CategoryParamInputField(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CategoryParamInputField[] newArray(int i12) {
            return new CategoryParamInputField[i12];
        }
    };

    public CategoryParamInputField(CategoryParam categoryParam, @P String str, @P String str2, OnFieldValueChangedListener onFieldValueChangedListener) {
        super(categoryParam, str, str2, onFieldValueChangedListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.remote.model.field.CategoryParamField, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        super.writeToParcel(parcel, i12);
        parcel.writeString((String) this.mValue);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.String] */
    public CategoryParamInputField(Parcel parcel) {
        super(parcel);
        this.mValue = parcel.readString();
    }
}
