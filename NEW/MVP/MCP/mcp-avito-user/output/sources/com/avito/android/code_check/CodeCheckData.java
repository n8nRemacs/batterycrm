package com.avito.android.code_check;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CodeCheckDataViewModel.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check/CodeCheckData;", "Landroid/os/Parcelable;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CodeCheckData implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CodeCheckData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Long f118612b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f118613c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f118614d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<String> f118615e;

    /* compiled from: CodeCheckDataViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CodeCheckData> {
        @Override // android.os.Parcelable.Creator
        public final CodeCheckData createFromParcel(Parcel parcel) {
            return new CodeCheckData(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final CodeCheckData[] newArray(int i12) {
            return new CodeCheckData[i12];
        }
    }

    public CodeCheckData(Long l12, String str, Integer num, List list, int i12, C42822w c42822w) {
        this(num, l12, str, (i12 & 8) != 0 ? C42784z0.f406748b : list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CodeCheckData)) {
            return false;
        }
        CodeCheckData codeCheckData = (CodeCheckData) obj;
        return L.f(this.f118612b, codeCheckData.f118612b) && L.f(this.f118613c, codeCheckData.f118613c) && L.f(this.f118614d, codeCheckData.f118614d) && L.f(this.f118615e, codeCheckData.f118615e);
    }

    public final int hashCode() {
        Long l12 = this.f118612b;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        String str = this.f118613c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f118614d;
        return this.f118615e.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CodeCheckData(timeout=");
        sb2.append(this.f118612b);
        sb2.append(", phone=");
        sb2.append(this.f118613c);
        sb2.append(", codeLength=");
        sb2.append(this.f118614d);
        sb2.append(", allPhones=");
        return H.p(sb2, this.f118615e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Long l12 = this.f118612b;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.f118613c);
        Integer num = this.f118614d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeStringList(this.f118615e);
    }

    public CodeCheckData(@Y61.l Integer num, @Y61.l Long l12, @Y61.l String str, @Y61.k List list) {
        this.f118612b = l12;
        this.f118613c = str;
        this.f118614d = num;
        this.f118615e = list;
    }
}
