package com.avito.android.remote.model.credit_broker.installments_block;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.credit_broker.LoanTerms;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsBlock.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsTermDto;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/credit_broker/LoanTerms$ChipBadge;", "badge", "", "title", "Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsBlockStateDto;", "blockState", "<init>", "(Lcom/avito/android/remote/model/credit_broker/LoanTerms$ChipBadge;Ljava/lang/String;Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsBlockStateDto;)V", "component1", "()Lcom/avito/android/remote/model/credit_broker/LoanTerms$ChipBadge;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsBlockStateDto;", "copy", "(Lcom/avito/android/remote/model/credit_broker/LoanTerms$ChipBadge;Ljava/lang/String;Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsBlockStateDto;)Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsTermDto;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/credit_broker/LoanTerms$ChipBadge;", "getBadge", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsBlockStateDto;", "getBlockState", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class InstallmentsTermDto implements Parcelable {

    @k
    public static final Parcelable.Creator<InstallmentsTermDto> CREATOR = new Creator();

    @c("badge")
    @l
    private final LoanTerms.ChipBadge badge;

    @c("blockState")
    @k
    private final InstallmentsBlockStateDto blockState;

    @c("title")
    @k
    private final String title;

    /* compiled from: InstallmentsBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InstallmentsTermDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstallmentsTermDto createFromParcel(@k Parcel parcel) {
            return new InstallmentsTermDto(parcel.readInt() == 0 ? null : LoanTerms.ChipBadge.CREATOR.createFromParcel(parcel), parcel.readString(), InstallmentsBlockStateDto.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstallmentsTermDto[] newArray(int i12) {
            return new InstallmentsTermDto[i12];
        }
    }

    public InstallmentsTermDto(@l LoanTerms.ChipBadge chipBadge, @k String str, @k InstallmentsBlockStateDto installmentsBlockStateDto) {
        this.badge = chipBadge;
        this.title = str;
        this.blockState = installmentsBlockStateDto;
    }

    public static /* synthetic */ InstallmentsTermDto copy$default(InstallmentsTermDto installmentsTermDto, LoanTerms.ChipBadge chipBadge, String str, InstallmentsBlockStateDto installmentsBlockStateDto, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            chipBadge = installmentsTermDto.badge;
        }
        if ((i12 & 2) != 0) {
            str = installmentsTermDto.title;
        }
        if ((i12 & 4) != 0) {
            installmentsBlockStateDto = installmentsTermDto.blockState;
        }
        return installmentsTermDto.copy(chipBadge, str, installmentsBlockStateDto);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final LoanTerms.ChipBadge getBadge() {
        return this.badge;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final InstallmentsBlockStateDto getBlockState() {
        return this.blockState;
    }

    @k
    public final InstallmentsTermDto copy(@l LoanTerms.ChipBadge badge, @k String title, @k InstallmentsBlockStateDto blockState) {
        return new InstallmentsTermDto(badge, title, blockState);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentsTermDto)) {
            return false;
        }
        InstallmentsTermDto installmentsTermDto = (InstallmentsTermDto) other;
        return L.f(this.badge, installmentsTermDto.badge) && L.f(this.title, installmentsTermDto.title) && L.f(this.blockState, installmentsTermDto.blockState);
    }

    @l
    public final LoanTerms.ChipBadge getBadge() {
        return this.badge;
    }

    @k
    public final InstallmentsBlockStateDto getBlockState() {
        return this.blockState;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        LoanTerms.ChipBadge chipBadge = this.badge;
        return this.blockState.hashCode() + H.d((chipBadge == null ? 0 : chipBadge.hashCode()) * 31, 31, this.title);
    }

    @k
    public String toString() {
        return "InstallmentsTermDto(badge=" + this.badge + ", title=" + this.title + ", blockState=" + this.blockState + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        LoanTerms.ChipBadge chipBadge = this.badge;
        if (chipBadge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            chipBadge.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.title);
        this.blockState.writeToParcel(parcel, flags);
    }
}
