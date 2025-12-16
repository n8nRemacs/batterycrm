package com.avito.android.travel_bnpl_calculator.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentTypeDetails.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/travel_bnpl_calculator/model/ScheduleVariantProgress;", "Landroid/os/Parcelable;", "", "blockSpacing", "dashHeight", "", "Lcom/avito/android/travel_bnpl_calculator/model/DashBlock;", "blocks", "<init>", "(IILjava/util/List;)V", "I", "c", "()I", "e", "Ljava/util/List;", "d", "()Ljava/util/List;", "_avito_travel-bnpl-calculator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ScheduleVariantProgress implements Parcelable {

    @k
    public static final Parcelable.Creator<ScheduleVariantProgress> CREATOR = new a();

    @c("blockSpacing")
    private final int blockSpacing;

    @c("blocks")
    @k
    private final List<DashBlock> blocks;

    @c("dashHeight")
    private final int dashHeight;

    /* compiled from: PaymentTypeDetails.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ScheduleVariantProgress> {
        @Override // android.os.Parcelable.Creator
        public final ScheduleVariantProgress createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iC2 = 0;
            while (iC2 != i14) {
                iC2 = com.avito.android.actions_sheet.a.c(DashBlock.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ScheduleVariantProgress(i12, i13, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ScheduleVariantProgress[] newArray(int i12) {
            return new ScheduleVariantProgress[i12];
        }
    }

    public ScheduleVariantProgress(int i12, int i13, @k List<DashBlock> list) {
        this.blockSpacing = i12;
        this.dashHeight = i13;
        this.blocks = list;
    }

    /* renamed from: c, reason: from getter */
    public final int getBlockSpacing() {
        return this.blockSpacing;
    }

    @k
    public final List<DashBlock> d() {
        return this.blocks;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final int getDashHeight() {
        return this.dashHeight;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScheduleVariantProgress)) {
            return false;
        }
        ScheduleVariantProgress scheduleVariantProgress = (ScheduleVariantProgress) obj;
        return this.blockSpacing == scheduleVariantProgress.blockSpacing && this.dashHeight == scheduleVariantProgress.dashHeight && L.f(this.blocks, scheduleVariantProgress.blocks);
    }

    public final int hashCode() {
        return this.blocks.hashCode() + r.e(this.dashHeight, Integer.hashCode(this.blockSpacing) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScheduleVariantProgress(blockSpacing=");
        sb2.append(this.blockSpacing);
        sb2.append(", dashHeight=");
        sb2.append(this.dashHeight);
        sb2.append(", blocks=");
        return H.p(sb2, this.blocks, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.blockSpacing);
        parcel.writeInt(this.dashHeight);
        Iterator itJ = C0.j(this.blocks, parcel);
        while (itJ.hasNext()) {
            ((DashBlock) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
