package com.avito.android.publish.objects;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: ObjectFillFormScreenParams.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/objects/ObjectFillFormScreenParams;", "Landroid/os/Parcelable;", "SelectedValue", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ObjectFillFormScreenParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ObjectFillFormScreenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f237557b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f237558c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final SelectedValue f237559d;

    /* compiled from: ObjectFillFormScreenParams.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/objects/ObjectFillFormScreenParams$SelectedValue;", "Landroid/os/Parcelable;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class SelectedValue implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<SelectedValue> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f237560b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f237561c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f237562d;

        /* compiled from: ObjectFillFormScreenParams.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelectedValue> {
            @Override // android.os.Parcelable.Creator
            public final SelectedValue createFromParcel(Parcel parcel) {
                return new SelectedValue(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SelectedValue[] newArray(int i12) {
                return new SelectedValue[i12];
            }
        }

        public SelectedValue(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
            this.f237560b = str;
            this.f237561c = str2;
            this.f237562d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectedValue)) {
                return false;
            }
            SelectedValue selectedValue = (SelectedValue) obj;
            return kotlin.jvm.internal.L.f(this.f237560b, selectedValue.f237560b) && kotlin.jvm.internal.L.f(this.f237561c, selectedValue.f237561c) && kotlin.jvm.internal.L.f(this.f237562d, selectedValue.f237562d);
        }

        public final int hashCode() {
            return this.f237562d.hashCode() + androidx.compose.foundation.H.d(this.f237560b.hashCode() * 31, 31, this.f237561c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SelectedValue(paramId=");
            sb2.append(this.f237560b);
            sb2.append(", valueId=");
            sb2.append(this.f237561c);
            sb2.append(", name=");
            return C22026a.c(sb2, this.f237562d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f237560b);
            parcel.writeString(this.f237561c);
            parcel.writeString(this.f237562d);
        }
    }

    /* compiled from: ObjectFillFormScreenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ObjectFillFormScreenParams> {
        @Override // android.os.Parcelable.Creator
        public final ObjectFillFormScreenParams createFromParcel(Parcel parcel) {
            return new ObjectFillFormScreenParams(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? SelectedValue.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ObjectFillFormScreenParams[] newArray(int i12) {
            return new ObjectFillFormScreenParams[i12];
        }
    }

    public ObjectFillFormScreenParams(@Y61.k String str, @Y61.l Integer num, @Y61.l SelectedValue selectedValue) {
        this.f237557b = str;
        this.f237558c = num;
        this.f237559d = selectedValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ObjectFillFormScreenParams)) {
            return false;
        }
        ObjectFillFormScreenParams objectFillFormScreenParams = (ObjectFillFormScreenParams) obj;
        return kotlin.jvm.internal.L.f(this.f237557b, objectFillFormScreenParams.f237557b) && kotlin.jvm.internal.L.f(this.f237558c, objectFillFormScreenParams.f237558c) && kotlin.jvm.internal.L.f(this.f237559d, objectFillFormScreenParams.f237559d);
    }

    public final int hashCode() {
        int iHashCode = this.f237557b.hashCode() * 31;
        Integer num = this.f237558c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        SelectedValue selectedValue = this.f237559d;
        return iHashCode2 + (selectedValue != null ? selectedValue.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ObjectFillFormScreenParams(objectsParameterId=" + this.f237557b + ", objectIndex=" + this.f237558c + ", selectedValue=" + this.f237559d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f237557b);
        Integer num = this.f237558c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        SelectedValue selectedValue = this.f237559d;
        if (selectedValue == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            selectedValue.writeToParcel(parcel, i12);
        }
    }
}
