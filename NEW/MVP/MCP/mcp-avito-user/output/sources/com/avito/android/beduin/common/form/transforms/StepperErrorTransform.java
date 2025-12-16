package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Ti.InterfaceC15365a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.component.stepper.BeduinStepperModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StepperErrorTransform.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/StepperErrorTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "Lcom/avito/android/beduin/common/component/stepper/BeduinStepperModel$Error;", "error", "<init>", "(Lcom/avito/android/beduin/common/component/stepper/BeduinStepperModel$Error;)V", "Lcom/avito/android/beduin/common/component/stepper/BeduinStepperModel$Error;", "c", "()Lcom/avito/android/beduin/common/component/stepper/BeduinStepperModel$Error;", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class StepperErrorTransform implements BeduinModelTransform {

    @c("error")
    @l
    private final BeduinStepperModel.Error error;

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f103409b = new a(null);

    @k
    public static final Parcelable.Creator<StepperErrorTransform> CREATOR = new b();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final String f103410c = "error";

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final Class<StepperErrorTransform> f103411d = StepperErrorTransform.class;

    /* compiled from: StepperErrorTransform.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/StepperErrorTransform$a;", "LTi/a;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC15365a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final Class<StepperErrorTransform> a() {
            return StepperErrorTransform.f103411d;
        }

        @Override // Ti.InterfaceC15365a
        @k
        public final String getType() {
            return StepperErrorTransform.f103410c;
        }

        public a() {
        }
    }

    /* compiled from: StepperErrorTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<StepperErrorTransform> {
        @Override // android.os.Parcelable.Creator
        public final StepperErrorTransform createFromParcel(Parcel parcel) {
            return new StepperErrorTransform(parcel.readInt() == 0 ? null : BeduinStepperModel.Error.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final StepperErrorTransform[] newArray(int i12) {
            return new StepperErrorTransform[i12];
        }
    }

    public StepperErrorTransform(@l BeduinStepperModel.Error error) {
        this.error = error;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final BeduinStepperModel.Error getError() {
        return this.error;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StepperErrorTransform) && L.f(this.error, ((StepperErrorTransform) obj).error);
    }

    public final int hashCode() {
        BeduinStepperModel.Error error = this.error;
        if (error == null) {
            return 0;
        }
        return error.hashCode();
    }

    @k
    public final String toString() {
        return "StepperErrorTransform(error=" + this.error + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        BeduinStepperModel.Error error = this.error;
        if (error == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            error.writeToParcel(parcel, i12);
        }
    }
}
