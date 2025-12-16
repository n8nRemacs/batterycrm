package com.avito.android.search.filter.converter.common;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ItemWithState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/converter/common/ItemWithState;", "Lcom/avito/conveyor_item/a;", "State", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ItemWithState extends com.avito.conveyor_item.a {

    /* compiled from: ItemWithState.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/search/filter/converter/common/ItemWithState$State;", "Landroid/os/Parcelable;", "()V", "Error", "Normal", "Warning", "Lcom/avito/android/search/filter/converter/common/ItemWithState$State$Error;", "Lcom/avito/android/search/filter/converter/common/ItemWithState$State$Normal;", "Lcom/avito/android/search/filter/converter/common/ItemWithState$State$Warning;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class State implements Parcelable {

        /* compiled from: ItemWithState.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/common/ItemWithState$State$Error;", "Lcom/avito/android/search/filter/converter/common/ItemWithState$State;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Error extends State {

            @k
            public static final Parcelable.Creator<Error> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final CharSequence f262912b;

            /* compiled from: ItemWithState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Error> {
                @Override // android.os.Parcelable.Creator
                public final Error createFromParcel(Parcel parcel) {
                    return new Error((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Error[] newArray(int i12) {
                    return new Error[i12];
                }
            }

            public Error(@k CharSequence charSequence) {
                super(null);
                this.f262912b = charSequence;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && L.f(this.f262912b, ((Error) obj).f262912b);
            }

            public final int hashCode() {
                return this.f262912b.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.r(new StringBuilder("Error(message="), this.f262912b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                TextUtils.writeToParcel(this.f262912b, parcel, i12);
            }
        }

        /* compiled from: ItemWithState.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/common/ItemWithState$State$Normal;", "Lcom/avito/android/search/filter/converter/common/ItemWithState$State;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Normal extends State {

            @k
            public static final Parcelable.Creator<Normal> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @l
            public final CharSequence f262913b;

            /* compiled from: ItemWithState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Normal> {
                @Override // android.os.Parcelable.Creator
                public final Normal createFromParcel(Parcel parcel) {
                    return new Normal((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Normal[] newArray(int i12) {
                    return new Normal[i12];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Normal() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Normal) && L.f(this.f262913b, ((Normal) obj).f262913b);
            }

            public final int hashCode() {
                CharSequence charSequence = this.f262913b;
                if (charSequence == null) {
                    return 0;
                }
                return charSequence.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.r(new StringBuilder("Normal(message="), this.f262913b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                TextUtils.writeToParcel(this.f262913b, parcel, i12);
            }

            public Normal(@l CharSequence charSequence) {
                super(null);
                this.f262913b = charSequence;
            }

            public /* synthetic */ Normal(CharSequence charSequence, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : charSequence);
            }
        }

        /* compiled from: ItemWithState.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/converter/common/ItemWithState$State$Warning;", "Lcom/avito/android/search/filter/converter/common/ItemWithState$State;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Warning extends State {

            @k
            public static final Parcelable.Creator<Warning> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final CharSequence f262914b;

            /* compiled from: ItemWithState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Warning> {
                @Override // android.os.Parcelable.Creator
                public final Warning createFromParcel(Parcel parcel) {
                    return new Warning((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Warning[] newArray(int i12) {
                    return new Warning[i12];
                }
            }

            public Warning(@k CharSequence charSequence) {
                super(null);
                this.f262914b = charSequence;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Warning) && L.f(this.f262914b, ((Warning) obj).f262914b);
            }

            public final int hashCode() {
                return this.f262914b.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.r(new StringBuilder("Warning(message="), this.f262914b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                TextUtils.writeToParcel(this.f262914b, parcel, i12);
            }
        }

        public /* synthetic */ State(C42822w c42822w) {
            this();
        }

        public State() {
        }
    }

    /* compiled from: ItemWithState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @k
    /* renamed from: getState */
    State getF262797p();
}
