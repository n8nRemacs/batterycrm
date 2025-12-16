package com.avito.android.select;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.ParcelableEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectResult.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/SelectResult;", "Landroid/os/Parcelable;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SelectResult implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<SelectResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f264977b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<ParcelableEntity<String>> f264978c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f264979d;

    /* compiled from: SelectResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectResult> {
        @Override // android.os.Parcelable.Creator
        public final SelectResult createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(SelectResult.class, parcel, arrayList, iL2, 1);
            }
            return new SelectResult(string, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectResult[] newArray(int i12) {
            return new SelectResult[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SelectResult(@Y61.k String str, @Y61.k List<? extends ParcelableEntity<String>> list, @Y61.l String str2) {
        this.f264977b = str;
        this.f264978c = list;
        this.f264979d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f264977b);
        Iterator itJ = C0.j(this.f264978c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f264979d);
    }

    public /* synthetic */ SelectResult(String str, List list, String str2, int i12, C42822w c42822w) {
        this(str, list, (i12 & 4) != 0 ? null : str2);
    }
}
