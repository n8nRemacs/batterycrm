package com.avito.android.remote.model.field;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.remote.model.CategoryParam;
import com.avito.android.remote.model.SplitSearchParamKt;
import j.N;
import j.P;

/* loaded from: classes17.dex */
public abstract class CategoryParamField<T> implements Field<T>, ErrorHolder, TitleHolder, Parcelable {
    private String mError;
    private OnFieldValueChangedListener mListener;
    private final CategoryParam mParam;

    @P
    protected final String mParentId;
    protected T mValue;

    public CategoryParamField(CategoryParam categoryParam, @P String str, @P T t12, OnFieldValueChangedListener onFieldValueChangedListener) {
        this.mParam = categoryParam;
        this.mParentId = str;
        this.mValue = t12;
        this.mListener = onFieldValueChangedListener;
    }

    @P
    public static String getFromId(String str) {
        if (str.endsWith(SplitSearchParamKt.SPLIT_FROM)) {
            return e.h(5, 0, str);
        }
        return null;
    }

    @P
    public static String getToId(String str) {
        if (str.endsWith(SplitSearchParamKt.SPLIT_TO)) {
            return e.h(3, 0, str);
        }
        return null;
    }

    @Override // com.avito.android.remote.model.field.ErrorHolder
    public void clearError() {
        this.mError = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CategoryParamField) && this.mParam.equals(((CategoryParamField) obj).mParam);
    }

    @Override // com.avito.android.remote.model.field.ErrorHolder
    public String getError() {
        return this.mError;
    }

    @Override // com.avito.android.remote.model.field.Field
    public String getId() {
        return this.mParam.getId();
    }

    public CategoryParam getParam() {
        return this.mParam;
    }

    public String getParentId() {
        return this.mParentId;
    }

    @Override // com.avito.android.remote.model.field.TitleHolder
    public String getTitle() {
        return this.mParam.getTitle();
    }

    @Override // com.avito.android.remote.model.field.Field
    public T getValue() {
        return this.mValue;
    }

    @Override // com.avito.android.remote.model.field.ErrorHolder
    public boolean hasError() {
        return !TextUtils.isEmpty(this.mError);
    }

    public int hashCode() {
        return this.mParam.hashCode();
    }

    public boolean isImmutable() {
        return this.mParam.getIsImmutable();
    }

    @Override // com.avito.android.remote.model.field.ErrorHolder
    public void setError(String str) {
        this.mError = str;
    }

    public void setListener(@N OnFieldValueChangedListener onFieldValueChangedListener) {
        this.mListener = onFieldValueChangedListener;
    }

    @Override // com.avito.android.remote.model.field.Field
    public void setValue(T t12) {
        this.mValue = t12;
        OnFieldValueChangedListener onFieldValueChangedListener = this.mListener;
        if (onFieldValueChangedListener != null) {
            onFieldValueChangedListener.onFieldValueChanged(this);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i12) {
        parcel.writeString(this.mParentId);
        parcel.writeParcelable(this.mParam, i12);
        parcel.writeString(this.mError);
    }

    public CategoryParamField(Parcel parcel) {
        this.mParentId = parcel.readString();
        this.mParam = (CategoryParam) parcel.readParcelable(CategoryParam.class.getClassLoader());
        this.mError = parcel.readString();
    }
}
