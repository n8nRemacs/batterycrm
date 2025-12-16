package com.avito.android.select.sectioned_multiselect.container;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: SectionedMultiselectContainerParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/container/SectionedMultiselectContainerParams;", "Lcom/avito/android/util/OpenParams;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SectionedMultiselectContainerParams implements OpenParams {

    @k
    public static final Parcelable.Creator<SectionedMultiselectContainerParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f266424b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final SearchParams f266425c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f266426d;

    /* compiled from: SectionedMultiselectContainerParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SectionedMultiselectContainerParams> {
        @Override // android.os.Parcelable.Creator
        public final SectionedMultiselectContainerParams createFromParcel(Parcel parcel) {
            return new SectionedMultiselectContainerParams(parcel.readString(), (SearchParams) parcel.readParcelable(SectionedMultiselectContainerParams.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SectionedMultiselectContainerParams[] newArray(int i12) {
            return new SectionedMultiselectContainerParams[i12];
        }
    }

    public SectionedMultiselectContainerParams(@k String str, @l SearchParams searchParams, boolean z12) {
        this.f266424b = str;
        this.f266425c = searchParams;
        this.f266426d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f266424b);
        parcel.writeParcelable(this.f266425c, i12);
        parcel.writeInt(this.f266426d ? 1 : 0);
    }
}
