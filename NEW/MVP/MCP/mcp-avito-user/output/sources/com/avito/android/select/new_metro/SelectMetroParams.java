package com.avito.android.select.new_metro;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectMetroParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/new_metro/SelectMetroParams;", "Landroid/os/Parcelable;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectMetroParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SelectMetroParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final MetroResponseBody f265940b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f265941c;

    /* renamed from: d, reason: collision with root package name */
    public final int f265942d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Integer f265943e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f265944f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f265945g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final List<ParcelableEntity<String>> f265946h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f265947i;

    /* compiled from: SelectMetroParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectMetroParams> {
        @Override // android.os.Parcelable.Creator
        public final SelectMetroParams createFromParcel(Parcel parcel) {
            MetroResponseBody metroResponseBody = (MetroResponseBody) parcel.readParcelable(SelectMetroParams.class.getClassLoader());
            String string = parcel.readString();
            int i12 = parcel.readInt();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iL2 = 0;
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(SelectMetroParams.class, parcel, arrayList, iL2, 1);
            }
            return new SelectMetroParams(metroResponseBody, string, i12, numValueOf, string2, z12, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SelectMetroParams[] newArray(int i12) {
            return new SelectMetroParams[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectMetroParams(@Y61.l MetroResponseBody metroResponseBody, @Y61.k String str, int i12, @Y61.l Integer num, @Y61.l String str2, boolean z12, @Y61.k List<? extends ParcelableEntity<String>> list, boolean z13) {
        this.f265940b = metroResponseBody;
        this.f265941c = str;
        this.f265942d = i12;
        this.f265943e = num;
        this.f265944f = str2;
        this.f265945g = z12;
        this.f265946h = list;
        this.f265947i = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f265940b, i12);
        parcel.writeString(this.f265941c);
        parcel.writeInt(this.f265942d);
        Integer num = this.f265943e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f265944f);
        parcel.writeInt(this.f265945g ? 1 : 0);
        Iterator itJ = C0.j(this.f265946h, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f265947i ? 1 : 0);
    }

    public /* synthetic */ SelectMetroParams(MetroResponseBody metroResponseBody, String str, int i12, Integer num, String str2, boolean z12, List list, boolean z13, int i13, C42822w c42822w) {
        this(metroResponseBody, str, i12, num, str2, z12, list, (i13 & 128) != 0 ? false : z13);
    }
}
