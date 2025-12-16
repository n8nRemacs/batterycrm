package com.avito.android.beduin.common.component.selector_card_group;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin_models.BeduinModelTransform;
import kotlin.Metadata;

/* compiled from: SelectorCardGroupTransform.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/SelectorCardGroupTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "ErrorState", "Lcom/avito/android/beduin/common/component/selector_card_group/SelectorCardGroupTransform$ErrorState;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface SelectorCardGroupTransform extends BeduinModelTransform {

    /* compiled from: SelectorCardGroupTransform.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/selector_card_group/SelectorCardGroupTransform$ErrorState;", "Lcom/avito/android/beduin/common/component/selector_card_group/SelectorCardGroupTransform;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorState implements SelectorCardGroupTransform {

        @Y61.k
        public static final Parcelable.Creator<ErrorState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f102529b;

        /* compiled from: SelectorCardGroupTransform.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ErrorState> {
            @Override // android.os.Parcelable.Creator
            public final ErrorState createFromParcel(Parcel parcel) {
                return new ErrorState(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ErrorState[] newArray(int i12) {
                return new ErrorState[i12];
            }
        }

        public ErrorState(boolean z12) {
            this.f102529b = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorState) && this.f102529b == ((ErrorState) obj).f102529b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f102529b);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("ErrorState(isError="), this.f102529b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f102529b ? 1 : 0);
        }
    }
}
