package com.avito.android.items;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ItemWithState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/items/ItemWithState;", "Lcom/avito/conveyor_item/a;", "State", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ItemWithState extends com.avito.conveyor_item.a {

    /* compiled from: ItemWithState.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/items/ItemWithState$State;", "Landroid/os/Parcelable;", "()V", "Error", "Normal", "Warning", "Lcom/avito/android/items/ItemWithState$State$Error;", "Lcom/avito/android/items/ItemWithState$State$Normal;", "Lcom/avito/android/items/ItemWithState$State$Warning;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class State implements Parcelable {

        /* compiled from: ItemWithState.kt */
        @P
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/items/ItemWithState$State$Error;", "Lcom/avito/android/items/ItemWithState$State;", "()V", "ErrorWithMessage", "ErrorWithoutMessage", "Lcom/avito/android/items/ItemWithState$State$Error$ErrorWithMessage;", "Lcom/avito/android/items/ItemWithState$State$Error$ErrorWithoutMessage;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static abstract class Error extends State {

            /* compiled from: ItemWithState.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/items/ItemWithState$State$Error$ErrorWithMessage;", "Lcom/avito/android/items/ItemWithState$State$Error;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @K51.d
            public static final /* data */ class ErrorWithMessage extends Error {

                @k
                public static final Parcelable.Creator<ErrorWithMessage> CREATOR = new a();

                /* renamed from: b, reason: collision with root package name */
                @k
                public final CharSequence f173897b;

                /* compiled from: ItemWithState.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<ErrorWithMessage> {
                    @Override // android.os.Parcelable.Creator
                    public final ErrorWithMessage createFromParcel(Parcel parcel) {
                        return new ErrorWithMessage((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ErrorWithMessage[] newArray(int i12) {
                        return new ErrorWithMessage[i12];
                    }
                }

                public ErrorWithMessage(@k CharSequence charSequence) {
                    super(null);
                    this.f173897b = charSequence;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ErrorWithMessage) && L.f(this.f173897b, ((ErrorWithMessage) obj).f173897b);
                }

                public final int hashCode() {
                    return this.f173897b.hashCode();
                }

                @k
                public final String toString() {
                    return AK.c.r(new StringBuilder("ErrorWithMessage(message="), this.f173897b, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    TextUtils.writeToParcel(this.f173897b, parcel, i12);
                }
            }

            /* compiled from: ItemWithState.kt */
            @P
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/items/ItemWithState$State$Error$ErrorWithoutMessage;", "Lcom/avito/android/items/ItemWithState$State$Error;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class ErrorWithoutMessage extends Error {

                /* renamed from: b, reason: collision with root package name */
                @k
                public static final ErrorWithoutMessage f173898b = new ErrorWithoutMessage();

                @k
                public static final Parcelable.Creator<ErrorWithoutMessage> CREATOR = new a();

                /* compiled from: ItemWithState.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class a implements Parcelable.Creator<ErrorWithoutMessage> {
                    @Override // android.os.Parcelable.Creator
                    public final ErrorWithoutMessage createFromParcel(Parcel parcel) {
                        parcel.readInt();
                        return ErrorWithoutMessage.f173898b;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ErrorWithoutMessage[] newArray(int i12) {
                        return new ErrorWithoutMessage[i12];
                    }
                }

                public ErrorWithoutMessage() {
                    super(null);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(@k Parcel parcel, int i12) {
                    parcel.writeInt(1);
                }
            }

            public /* synthetic */ Error(C42822w c42822w) {
                this();
            }

            public Error() {
                super(null);
            }
        }

        /* compiled from: ItemWithState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/items/ItemWithState$State$Normal;", "Lcom/avito/android/items/ItemWithState$State;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Normal extends State {

            @k
            public static final Parcelable.Creator<Normal> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @l
            public final CharSequence f173899b;

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
                return (obj instanceof Normal) && L.f(this.f173899b, ((Normal) obj).f173899b);
            }

            public final int hashCode() {
                CharSequence charSequence = this.f173899b;
                if (charSequence == null) {
                    return 0;
                }
                return charSequence.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.r(new StringBuilder("Normal(message="), this.f173899b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                TextUtils.writeToParcel(this.f173899b, parcel, i12);
            }

            public Normal(@l CharSequence charSequence) {
                super(null);
                this.f173899b = charSequence;
            }

            public /* synthetic */ Normal(CharSequence charSequence, int i12, C42822w c42822w) {
                this((i12 & 1) != 0 ? null : charSequence);
            }
        }

        /* compiled from: ItemWithState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/items/ItemWithState$State$Warning;", "Lcom/avito/android/items/ItemWithState$State;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final /* data */ class Warning extends State {

            @k
            public static final Parcelable.Creator<Warning> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final CharSequence f173900b;

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
                this.f173900b = charSequence;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Warning) && L.f(this.f173900b, ((Warning) obj).f173900b);
            }

            public final int hashCode() {
                return this.f173900b.hashCode();
            }

            @k
            public final String toString() {
                return AK.c.r(new StringBuilder("Warning(message="), this.f173900b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                TextUtils.writeToParcel(this.f173900b, parcel, i12);
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

    void O0(@k State state);

    @k
    /* renamed from: getState */
    State getF244801h();
}
