package com.avito.android.section;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.section.SectionTypeElement;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SectionElementData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/section/SectionElementData;", "Lcom/avito/android/remote/model/section/SectionTypeElement;", "T", "Landroid/os/Parcelable;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SectionElementData<T extends SectionTypeElement> implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SectionElementData<?>> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final T f264598b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<PersistableSpannedItem> f264599c;

    /* compiled from: SectionElementData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SectionElementData<?>> {
        @Override // android.os.Parcelable.Creator
        public final SectionElementData<?> createFromParcel(Parcel parcel) {
            return new SectionElementData<>((SectionTypeElement) parcel.readParcelable(SectionElementData.class.getClassLoader()), null, 2, null);
        }

        @Override // android.os.Parcelable.Creator
        public final SectionElementData<?>[] newArray(int i12) {
            return new SectionElementData[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SectionElementData(@Y61.k T t12, @Y61.k List<? extends PersistableSpannedItem> list) {
        this.f264598b = t12;
        this.f264599c = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionElementData)) {
            return false;
        }
        SectionElementData sectionElementData = (SectionElementData) obj;
        return L.f(this.f264598b, sectionElementData.f264598b) && L.f(this.f264599c, sectionElementData.f264599c);
    }

    public final int hashCode() {
        return this.f264599c.hashCode() + (this.f264598b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SectionElementData(section=");
        sb2.append(this.f264598b);
        sb2.append(", items=");
        return H.p(sb2, this.f264599c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f264598b, i12);
    }

    public SectionElementData(SectionTypeElement sectionTypeElement, List list, int i12, C42822w c42822w) {
        this(sectionTypeElement, (i12 & 2) != 0 ? C42784z0.f406748b : list);
    }
}
