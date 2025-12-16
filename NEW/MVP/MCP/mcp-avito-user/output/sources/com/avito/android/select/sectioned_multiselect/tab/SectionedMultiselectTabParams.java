package com.avito.android.select.sectioned_multiselect.tab;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: SectionedMultiselectTabParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/tab/SectionedMultiselectTabParams;", "Lcom/avito/android/util/OpenParams;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SectionedMultiselectTabParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<SectionedMultiselectTabParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f266700b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f266701c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final SearchParams f266702d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f266703e;

    /* compiled from: SectionedMultiselectTabParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SectionedMultiselectTabParams> {
        @Override // android.os.Parcelable.Creator
        public final SectionedMultiselectTabParams createFromParcel(Parcel parcel) {
            return new SectionedMultiselectTabParams(parcel.readString(), parcel.readString(), (SearchParams) parcel.readParcelable(SectionedMultiselectTabParams.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SectionedMultiselectTabParams[] newArray(int i12) {
            return new SectionedMultiselectTabParams[i12];
        }
    }

    public SectionedMultiselectTabParams(@Y61.k String str, @Y61.l String str2, @Y61.l SearchParams searchParams, boolean z12) {
        this.f266700b = str;
        this.f266701c = str2;
        this.f266702d = searchParams;
        this.f266703e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f266700b);
        parcel.writeString(this.f266701c);
        parcel.writeParcelable(this.f266702d, i12);
        parcel.writeInt(this.f266703e ? 1 : 0);
    }
}
