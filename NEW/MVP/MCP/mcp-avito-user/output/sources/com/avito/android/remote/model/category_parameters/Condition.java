package com.avito.android.remote.model.category_parameters;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.gson.d;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Condition.kt */
@d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/Condition;", "Landroid/os/Parcelable;", "()V", "SelectParameterValue", "Lcom/avito/android/remote/model/category_parameters/Condition$SelectParameterValue;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class Condition implements Parcelable {

    /* compiled from: Condition.kt */
    @K51.d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/Condition$SelectParameterValue;", "Lcom/avito/android/remote/model/category_parameters/Condition;", "", "paramId", "", "valueIds", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getParamId", "()Ljava/lang/String;", "Ljava/util/List;", "getValueIds", "()Ljava/util/List;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SelectParameterValue extends Condition {

        @k
        public static final Parcelable.Creator<SelectParameterValue> CREATOR = new Creator();

        @c("paramId")
        @k
        private final String paramId;

        @c("valueIds")
        @k
        private final List<String> valueIds;

        /* compiled from: Condition.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelectParameterValue> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SelectParameterValue createFromParcel(@k Parcel parcel) {
                return new SelectParameterValue(parcel.readString(), parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SelectParameterValue[] newArray(int i12) {
                return new SelectParameterValue[i12];
            }
        }

        public SelectParameterValue(@k String str, @k List<String> list) {
            super(null);
            this.paramId = str;
            this.valueIds = list;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getParamId() {
            return this.paramId;
        }

        @k
        public final List<String> getValueIds() {
            return this.valueIds;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.paramId);
            parcel.writeStringList(this.valueIds);
        }
    }

    public /* synthetic */ Condition(C42822w c42822w) {
        this();
    }

    private Condition() {
    }
}
