package com.avito.android.work_profile.domain.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AppliesToVacancy.kt */
@d
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/work_profile/domain/entity/ApplyAction;", "Landroid/os/Parcelable;", "", "type", "Lcom/avito/android/work_profile/domain/entity/AppliesToVacancyAction;", "value", "<init>", "(Ljava/lang/String;Lcom/avito/android/work_profile/domain/entity/AppliesToVacancyAction;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/work_profile/domain/entity/AppliesToVacancyAction;", "copy", "(Ljava/lang/String;Lcom/avito/android/work_profile/domain/entity/AppliesToVacancyAction;)Lcom/avito/android/work_profile/domain/entity/ApplyAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "Lcom/avito/android/work_profile/domain/entity/AppliesToVacancyAction;", "getValue", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ApplyAction implements Parcelable {

    @k
    public static final Parcelable.Creator<ApplyAction> CREATOR = new a();

    @k
    private final String type;

    @k
    private final AppliesToVacancyAction value;

    /* compiled from: AppliesToVacancy.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ApplyAction> {
        @Override // android.os.Parcelable.Creator
        public final ApplyAction createFromParcel(Parcel parcel) {
            return new ApplyAction(parcel.readString(), AppliesToVacancyAction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ApplyAction[] newArray(int i12) {
            return new ApplyAction[i12];
        }
    }

    public ApplyAction(@k String str, @k AppliesToVacancyAction appliesToVacancyAction) {
        this.type = str;
        this.value = appliesToVacancyAction;
    }

    public static /* synthetic */ ApplyAction copy$default(ApplyAction applyAction, String str, AppliesToVacancyAction appliesToVacancyAction, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = applyAction.type;
        }
        if ((i12 & 2) != 0) {
            appliesToVacancyAction = applyAction.value;
        }
        return applyAction.copy(str, appliesToVacancyAction);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AppliesToVacancyAction getValue() {
        return this.value;
    }

    @k
    public final ApplyAction copy(@k String type, @k AppliesToVacancyAction value) {
        return new ApplyAction(type, value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplyAction)) {
            return false;
        }
        ApplyAction applyAction = (ApplyAction) other;
        return L.f(this.type, applyAction.type) && L.f(this.value, applyAction.value);
    }

    @k
    public final String getType() {
        return this.type;
    }

    @k
    public final AppliesToVacancyAction getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.type.hashCode() * 31);
    }

    @k
    public String toString() {
        return "ApplyAction(type=" + this.type + ", value=" + this.value + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.type);
        this.value.writeToParcel(parcel, flags);
    }
}
