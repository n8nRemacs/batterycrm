package com.avito.android.beduin.common.component.image;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinImageModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/beduin/common/component/image/BeduinLinearGradient;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/beduin/common/component/image/BeduinLinearGradientColor;", "colors", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/avito/android/beduin/common/component/image/BeduinLinearGradient;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getColors", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinLinearGradient implements Parcelable {

    @k
    public static final Parcelable.Creator<BeduinLinearGradient> CREATOR = new a();

    @k
    private final List<BeduinLinearGradientColor> colors;

    /* compiled from: BeduinImageModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinLinearGradient> {
        @Override // android.os.Parcelable.Creator
        public final BeduinLinearGradient createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(BeduinLinearGradientColor.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new BeduinLinearGradient(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinLinearGradient[] newArray(int i12) {
            return new BeduinLinearGradient[i12];
        }
    }

    public BeduinLinearGradient(@k List<BeduinLinearGradientColor> list) {
        this.colors = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BeduinLinearGradient copy$default(BeduinLinearGradient beduinLinearGradient, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = beduinLinearGradient.colors;
        }
        return beduinLinearGradient.copy(list);
    }

    @k
    public final List<BeduinLinearGradientColor> component1() {
        return this.colors;
    }

    @k
    public final BeduinLinearGradient copy(@k List<BeduinLinearGradientColor> colors) {
        return new BeduinLinearGradient(colors);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BeduinLinearGradient) && L.f(this.colors, ((BeduinLinearGradient) other).colors);
    }

    @k
    public final List<BeduinLinearGradientColor> getColors() {
        return this.colors;
    }

    public int hashCode() {
        return this.colors.hashCode();
    }

    @k
    public String toString() {
        return H.p(new StringBuilder("BeduinLinearGradient(colors="), this.colors, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.colors, parcel);
        while (itJ.hasNext()) {
            ((BeduinLinearGradientColor) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
