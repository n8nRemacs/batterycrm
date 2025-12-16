package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: SearchFormWidget.kt */
@d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/SearchFormWidgetAnalyticParams;", "Landroid/os/Parcelable;", "", "categoryId", SearchParamsConverterKt.LOCATION_ID, "formRawParams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCategoryId", "()Ljava/lang/String;", "getLocationId", "getFormRawParams", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SearchFormWidgetAnalyticParams implements Parcelable {

    @k
    public static final Parcelable.Creator<SearchFormWidgetAnalyticParams> CREATOR = new Creator();

    @c("categoryId")
    @l
    private final String categoryId;

    @c("formRawParams")
    @l
    private final String formRawParams;

    @c(SearchParamsConverterKt.LOCATION_ID)
    @l
    private final String locationId;

    /* compiled from: SearchFormWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SearchFormWidgetAnalyticParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SearchFormWidgetAnalyticParams createFromParcel(@k Parcel parcel) {
            return new SearchFormWidgetAnalyticParams(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SearchFormWidgetAnalyticParams[] newArray(int i12) {
            return new SearchFormWidgetAnalyticParams[i12];
        }
    }

    public SearchFormWidgetAnalyticParams(@l String str, @l String str2, @l String str3) {
        this.categoryId = str;
        this.locationId = str2;
        this.formRawParams = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getCategoryId() {
        return this.categoryId;
    }

    @l
    public final String getFormRawParams() {
        return this.formRawParams;
    }

    @l
    public final String getLocationId() {
        return this.locationId;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.categoryId);
        parcel.writeString(this.locationId);
        parcel.writeString(this.formRawParams);
    }
}
