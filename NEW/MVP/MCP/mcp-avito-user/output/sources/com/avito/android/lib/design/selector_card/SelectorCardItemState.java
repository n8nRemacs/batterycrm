package com.avito.android.lib.design.selector_card;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectorCardItemState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/lib/design/selector_card/SelectorCardItemState;", "Landroid/os/Parcelable;", "Error", "Normal", "Lcom/avito/android/lib/design/selector_card/SelectorCardItemState$Error;", "Lcom/avito/android/lib/design/selector_card/SelectorCardItemState$Normal;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface SelectorCardItemState extends Parcelable {

    /* compiled from: SelectorCardItemState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/selector_card/SelectorCardItemState$Error;", "Lcom/avito/android/lib/design/selector_card/SelectorCardItemState;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error implements SelectorCardItemState {

        @Y61.k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f180357b;

        /* compiled from: SelectorCardItemState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && L.f(this.f180357b, ((Error) obj).f180357b);
        }

        public final int hashCode() {
            String str = this.f180357b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Error(errorText="), this.f180357b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f180357b);
        }

        public Error(@Y61.l String str) {
            this.f180357b = str;
        }

        public /* synthetic */ Error(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: SelectorCardItemState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/selector_card/SelectorCardItemState$Normal;", "Lcom/avito/android/lib/design/selector_card/SelectorCardItemState;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Normal implements SelectorCardItemState {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Normal f180358b = new Normal();

        @Y61.k
        public static final Parcelable.Creator<Normal> CREATOR = new a();

        /* compiled from: SelectorCardItemState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Normal> {
            @Override // android.os.Parcelable.Creator
            public final Normal createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Normal.f180358b;
            }

            @Override // android.os.Parcelable.Creator
            public final Normal[] newArray(int i12) {
                return new Normal[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof Normal);
        }

        public final int hashCode() {
            return -1519850304;
        }

        @Y61.k
        public final String toString() {
            return "Normal";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }
}
