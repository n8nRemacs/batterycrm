package com.avito.android.model_card.screen.ui;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ModelCardArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/model_card/screen/ui/ModelCardArguments;", "Landroid/os/Parcelable;", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ModelCardArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ModelCardArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f198115b;

    /* compiled from: ModelCardArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ModelCardArguments> {
        @Override // android.os.Parcelable.Creator
        public final ModelCardArguments createFromParcel(Parcel parcel) {
            return new ModelCardArguments(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ModelCardArguments[] newArray(int i12) {
            return new ModelCardArguments[i12];
        }
    }

    public ModelCardArguments(@k String str) {
        this.f198115b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ModelCardArguments) && L.f(this.f198115b, ((ModelCardArguments) obj).f198115b);
    }

    public final int hashCode() {
        return this.f198115b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ModelCardArguments(params="), this.f198115b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f198115b);
    }
}
