package com.avito.android.remote.model.credit_broker.installments_block;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsBlock.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\nJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nJ \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsLoanTermsDto;", "Landroid/os/Parcelable;", "", "default", "", "Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsTermDto;", "terms", "<init>", "(ILjava/util/List;)V", "component1", "()I", "component2", "()Ljava/util/List;", "copy", "(ILjava/util/List;)Lcom/avito/android/remote/model/credit_broker/installments_block/InstallmentsLoanTermsDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getDefault", "Ljava/util/List;", "getTerms", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class InstallmentsLoanTermsDto implements Parcelable {

    @k
    public static final Parcelable.Creator<InstallmentsLoanTermsDto> CREATOR = new Creator();

    @c("default")
    private final int default;

    @c("terms")
    @k
    private final List<InstallmentsTermDto> terms;

    /* compiled from: InstallmentsBlock.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InstallmentsLoanTermsDto> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstallmentsLoanTermsDto createFromParcel(@k Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = a.c(InstallmentsTermDto.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new InstallmentsLoanTermsDto(i12, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InstallmentsLoanTermsDto[] newArray(int i12) {
            return new InstallmentsLoanTermsDto[i12];
        }
    }

    public InstallmentsLoanTermsDto(int i12, @k List<InstallmentsTermDto> list) {
        this.default = i12;
        this.terms = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstallmentsLoanTermsDto copy$default(InstallmentsLoanTermsDto installmentsLoanTermsDto, int i12, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = installmentsLoanTermsDto.default;
        }
        if ((i13 & 2) != 0) {
            list = installmentsLoanTermsDto.terms;
        }
        return installmentsLoanTermsDto.copy(i12, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDefault() {
        return this.default;
    }

    @k
    public final List<InstallmentsTermDto> component2() {
        return this.terms;
    }

    @k
    public final InstallmentsLoanTermsDto copy(int i12, @k List<InstallmentsTermDto> terms) {
        return new InstallmentsLoanTermsDto(i12, terms);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallmentsLoanTermsDto)) {
            return false;
        }
        InstallmentsLoanTermsDto installmentsLoanTermsDto = (InstallmentsLoanTermsDto) other;
        return this.default == installmentsLoanTermsDto.default && L.f(this.terms, installmentsLoanTermsDto.terms);
    }

    public final int getDefault() {
        return this.default;
    }

    @k
    public final List<InstallmentsTermDto> getTerms() {
        return this.terms;
    }

    public int hashCode() {
        return this.terms.hashCode() + (Integer.hashCode(this.default) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsLoanTermsDto(default=");
        sb2.append(this.default);
        sb2.append(", terms=");
        return H.p(sb2, this.terms, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.default);
        Iterator itJ = C0.j(this.terms, parcel);
        while (itJ.hasNext()) {
            ((InstallmentsTermDto) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
