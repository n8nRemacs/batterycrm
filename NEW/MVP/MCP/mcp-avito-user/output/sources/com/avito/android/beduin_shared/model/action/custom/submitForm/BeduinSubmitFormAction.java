package com.avito.android.beduin_shared.model.action.custom.submitForm;

import Ui.InterfaceC15524c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinSubmitFormAction.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/custom/submitForm/BeduinSubmitFormAction;", "Lcom/avito/android/beduin_models/BeduinAction;", "", "", "parameterIds", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/avito/android/beduin_shared/model/action/custom/submitForm/BeduinSubmitFormAction;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getParameterIds", "b", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinSubmitFormAction implements BeduinAction {

    @k
    public static final Parcelable.Creator<BeduinSubmitFormAction> CREATOR = new a();

    @l
    private final List<String> parameterIds;

    /* compiled from: BeduinSubmitFormAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinSubmitFormAction> {
        @Override // android.os.Parcelable.Creator
        public final BeduinSubmitFormAction createFromParcel(Parcel parcel) {
            return new BeduinSubmitFormAction(parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinSubmitFormAction[] newArray(int i12) {
            return new BeduinSubmitFormAction[i12];
        }
    }

    /* compiled from: BeduinSubmitFormAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin_shared/model/action/custom/submitForm/BeduinSubmitFormAction$b;", "LUi/c;", "<init>", "()V", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC15524c {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Class<? extends BeduinAction> f105300b = BeduinSubmitFormAction.class;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f105301c = "submitForm";

        @Override // Ui.InterfaceC15524c
        @k
        public final Class<? extends BeduinAction> getAction() {
            return this.f105300b;
        }

        @Override // Ui.InterfaceC15524c
        @k
        /* renamed from: getType, reason: from getter */
        public final String getF99982c() {
            return this.f105301c;
        }
    }

    public BeduinSubmitFormAction(@l List<String> list) {
        this.parameterIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinSubmitFormAction copy$default(BeduinSubmitFormAction beduinSubmitFormAction, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = beduinSubmitFormAction.parameterIds;
        }
        return beduinSubmitFormAction.copy(list);
    }

    @l
    public final List<String> component1() {
        return this.parameterIds;
    }

    @k
    public final BeduinSubmitFormAction copy(@l List<String> parameterIds) {
        return new BeduinSubmitFormAction(parameterIds);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BeduinSubmitFormAction) && L.f(this.parameterIds, ((BeduinSubmitFormAction) other).parameterIds);
    }

    @l
    public final List<String> getParameterIds() {
        return this.parameterIds;
    }

    public int hashCode() {
        List<String> list = this.parameterIds;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @k
    public String toString() {
        return H.p(new StringBuilder("BeduinSubmitFormAction(parameterIds="), this.parameterIds, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeStringList(this.parameterIds);
    }
}
