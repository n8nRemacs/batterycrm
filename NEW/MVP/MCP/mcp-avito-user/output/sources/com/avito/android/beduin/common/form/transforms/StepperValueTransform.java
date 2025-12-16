package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Ti.InterfaceC15365a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StepperValueTransform.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/StepperValueTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "", "value", "<init>", "(I)V", "I", "c", "()I", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class StepperValueTransform implements BeduinModelTransform {

    @c("value")
    private final int value;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f103412b = new a(null);

    @k
    public static final Parcelable.Creator<StepperValueTransform> CREATOR = new b();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f103413c = "stepperValue";

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final Class<StepperValueTransform> f103414d = StepperValueTransform.class;

    /* compiled from: StepperValueTransform.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/StepperValueTransform$a;", "LTi/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC15365a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final Class<StepperValueTransform> a() {
            return StepperValueTransform.f103414d;
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final String getType() {
            return StepperValueTransform.f103413c;
        }

        public a() {
        }
    }

    /* compiled from: StepperValueTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<StepperValueTransform> {
        @Override // android.os.Parcelable.Creator
        public final StepperValueTransform createFromParcel(Parcel parcel) {
            return new StepperValueTransform(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final StepperValueTransform[] newArray(int i12) {
            return new StepperValueTransform[i12];
        }
    }

    public StepperValueTransform(int i12) {
        this.value = i12;
    }

    /* renamed from: c, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StepperValueTransform) && this.value == ((StepperValueTransform) obj).value;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value);
    }

    @k
    public final String toString() {
        return r.t(new StringBuilder("StepperValueTransform(value="), this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.value);
    }
}
