package com.avito.android.remote.model.credit_broker;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.EntryPointParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.parse.adapter.CompositeBrokerCalculatorV2;
import com.avito.android.remote.parse.adapter.CompositeBrokerEntryPoint;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreditBrokerProduct.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/AdvertCreditCompositeBrokerV2;", "Lcom/avito/android/remote/model/credit_broker/CreditBrokerProduct;", "Lcom/avito/android/remote/parse/adapter/CompositeBrokerEntryPoint;", EntryPointParameter.TYPE, "Lcom/avito/android/remote/parse/adapter/CompositeBrokerCalculatorV2;", "calculator", "<init>", "(Lcom/avito/android/remote/parse/adapter/CompositeBrokerEntryPoint;Lcom/avito/android/remote/parse/adapter/CompositeBrokerCalculatorV2;)V", "component1", "()Lcom/avito/android/remote/parse/adapter/CompositeBrokerEntryPoint;", "component2", "()Lcom/avito/android/remote/parse/adapter/CompositeBrokerCalculatorV2;", "copy", "(Lcom/avito/android/remote/parse/adapter/CompositeBrokerEntryPoint;Lcom/avito/android/remote/parse/adapter/CompositeBrokerCalculatorV2;)Lcom/avito/android/remote/model/credit_broker/AdvertCreditCompositeBrokerV2;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/parse/adapter/CompositeBrokerEntryPoint;", "getEntryPoint", "Lcom/avito/android/remote/parse/adapter/CompositeBrokerCalculatorV2;", "getCalculator", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertCreditCompositeBrokerV2 implements CreditBrokerProduct {

    @k
    public static final Parcelable.Creator<AdvertCreditCompositeBrokerV2> CREATOR = new Creator();

    @c("calculator")
    @l
    private final CompositeBrokerCalculatorV2 calculator;

    @c(EntryPointParameter.TYPE)
    @l
    private final CompositeBrokerEntryPoint entryPoint;

    /* compiled from: CreditBrokerProduct.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertCreditCompositeBrokerV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertCreditCompositeBrokerV2 createFromParcel(@k Parcel parcel) {
            return new AdvertCreditCompositeBrokerV2(parcel.readInt() == 0 ? null : CompositeBrokerEntryPoint.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CompositeBrokerCalculatorV2.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertCreditCompositeBrokerV2[] newArray(int i12) {
            return new AdvertCreditCompositeBrokerV2[i12];
        }
    }

    public AdvertCreditCompositeBrokerV2(@l CompositeBrokerEntryPoint compositeBrokerEntryPoint, @l CompositeBrokerCalculatorV2 compositeBrokerCalculatorV2) {
        this.entryPoint = compositeBrokerEntryPoint;
        this.calculator = compositeBrokerCalculatorV2;
    }

    public static /* synthetic */ AdvertCreditCompositeBrokerV2 copy$default(AdvertCreditCompositeBrokerV2 advertCreditCompositeBrokerV2, CompositeBrokerEntryPoint compositeBrokerEntryPoint, CompositeBrokerCalculatorV2 compositeBrokerCalculatorV2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            compositeBrokerEntryPoint = advertCreditCompositeBrokerV2.entryPoint;
        }
        if ((i12 & 2) != 0) {
            compositeBrokerCalculatorV2 = advertCreditCompositeBrokerV2.calculator;
        }
        return advertCreditCompositeBrokerV2.copy(compositeBrokerEntryPoint, compositeBrokerCalculatorV2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final CompositeBrokerEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final CompositeBrokerCalculatorV2 getCalculator() {
        return this.calculator;
    }

    @k
    public final AdvertCreditCompositeBrokerV2 copy(@l CompositeBrokerEntryPoint entryPoint, @l CompositeBrokerCalculatorV2 calculator) {
        return new AdvertCreditCompositeBrokerV2(entryPoint, calculator);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertCreditCompositeBrokerV2)) {
            return false;
        }
        AdvertCreditCompositeBrokerV2 advertCreditCompositeBrokerV2 = (AdvertCreditCompositeBrokerV2) other;
        return L.f(this.entryPoint, advertCreditCompositeBrokerV2.entryPoint) && L.f(this.calculator, advertCreditCompositeBrokerV2.calculator);
    }

    @l
    public final CompositeBrokerCalculatorV2 getCalculator() {
        return this.calculator;
    }

    @l
    public final CompositeBrokerEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public int hashCode() {
        CompositeBrokerEntryPoint compositeBrokerEntryPoint = this.entryPoint;
        int iHashCode = (compositeBrokerEntryPoint == null ? 0 : compositeBrokerEntryPoint.hashCode()) * 31;
        CompositeBrokerCalculatorV2 compositeBrokerCalculatorV2 = this.calculator;
        return iHashCode + (compositeBrokerCalculatorV2 != null ? compositeBrokerCalculatorV2.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AdvertCreditCompositeBrokerV2(entryPoint=" + this.entryPoint + ", calculator=" + this.calculator + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        CompositeBrokerEntryPoint compositeBrokerEntryPoint = this.entryPoint;
        if (compositeBrokerEntryPoint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            compositeBrokerEntryPoint.writeToParcel(parcel, flags);
        }
        CompositeBrokerCalculatorV2 compositeBrokerCalculatorV2 = this.calculator;
        if (compositeBrokerCalculatorV2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            compositeBrokerCalculatorV2.writeToParcel(parcel, flags);
        }
    }
}
