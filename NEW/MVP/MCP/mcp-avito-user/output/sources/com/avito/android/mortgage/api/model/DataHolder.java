package com.avito.android.mortgage.api.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DataHolder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/api/model/DataHolder;", "Landroid/os/Parcelable;", "ChildrenDataHolder", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface DataHolder extends Parcelable {

    /* compiled from: DataHolder.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/mortgage/api/model/DataHolder$ChildrenDataHolder;", "Lcom/avito/android/mortgage/api/model/DataHolder;", "", "deletedChildId", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getDeletedChildId", "()Ljava/lang/String;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ChildrenDataHolder implements DataHolder {

        @k
        public static final Parcelable.Creator<ChildrenDataHolder> CREATOR = new a();

        @c("deletedChildId")
        @k
        private final String deletedChildId;

        /* compiled from: DataHolder.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ChildrenDataHolder> {
            @Override // android.os.Parcelable.Creator
            public final ChildrenDataHolder createFromParcel(Parcel parcel) {
                return new ChildrenDataHolder(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ChildrenDataHolder[] newArray(int i12) {
                return new ChildrenDataHolder[i12];
            }
        }

        public ChildrenDataHolder(@k String str) {
            this.deletedChildId = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChildrenDataHolder) && L.f(this.deletedChildId, ((ChildrenDataHolder) obj).deletedChildId);
        }

        public final int hashCode() {
            return this.deletedChildId.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChildrenDataHolder(deletedChildId="), this.deletedChildId, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.deletedChildId);
        }
    }
}
