package com.avito.android.rating.details.answer.text;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RatingAddAnswerTextValidationInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor;", "", "ValidationTextMessage", "ValidationTextResult", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface RatingAddAnswerTextValidationInteractor {

    /* compiled from: RatingAddAnswerTextValidationInteractor.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextMessage;", "Landroid/os/Parcelable;", "DefaultMessage", "EmptyMessage", "ErrorMessage", "Message", "Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextMessage$DefaultMessage;", "Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextMessage$EmptyMessage;", "Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextMessage$ErrorMessage;", "Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextMessage$Message;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ValidationTextMessage extends Parcelable {

        /* compiled from: RatingAddAnswerTextValidationInteractor.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextMessage$DefaultMessage;", "Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextMessage;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class DefaultMessage implements ValidationTextMessage {

            @k
            public static final Parcelable.Creator<DefaultMessage> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f246825b;

            /* compiled from: RatingAddAnswerTextValidationInteractor.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<DefaultMessage> {
                @Override // android.os.Parcelable.Creator
                public final DefaultMessage createFromParcel(Parcel parcel) {
                    return new DefaultMessage(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final DefaultMessage[] newArray(int i12) {
                    return new DefaultMessage[i12];
                }
            }

            public DefaultMessage(@k String str) {
                this.f246825b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DefaultMessage) && L.f(this.f246825b, ((DefaultMessage) obj).f246825b);
            }

            public final int hashCode() {
                return this.f246825b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("DefaultMessage(maxLengthValidation="), this.f246825b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f246825b);
            }
        }

        /* compiled from: RatingAddAnswerTextValidationInteractor.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextMessage$EmptyMessage;", "Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextMessage;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class EmptyMessage implements ValidationTextMessage {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final EmptyMessage f246826b = new EmptyMessage();

            @k
            public static final Parcelable.Creator<EmptyMessage> CREATOR = new a();

            /* compiled from: RatingAddAnswerTextValidationInteractor.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<EmptyMessage> {
                @Override // android.os.Parcelable.Creator
                public final EmptyMessage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return EmptyMessage.f246826b;
                }

                @Override // android.os.Parcelable.Creator
                public final EmptyMessage[] newArray(int i12) {
                    return new EmptyMessage[i12];
                }
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

        /* compiled from: RatingAddAnswerTextValidationInteractor.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextMessage$ErrorMessage;", "Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextMessage;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ErrorMessage implements ValidationTextMessage {

            @k
            public static final Parcelable.Creator<ErrorMessage> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f246827b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f246828c;

            /* compiled from: RatingAddAnswerTextValidationInteractor.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ErrorMessage> {
                @Override // android.os.Parcelable.Creator
                public final ErrorMessage createFromParcel(Parcel parcel) {
                    return new ErrorMessage(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ErrorMessage[] newArray(int i12) {
                    return new ErrorMessage[i12];
                }
            }

            public ErrorMessage(@k String str, @k String str2) {
                this.f246827b = str;
                this.f246828c = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ErrorMessage)) {
                    return false;
                }
                ErrorMessage errorMessage = (ErrorMessage) obj;
                return L.f(this.f246827b, errorMessage.f246827b) && L.f(this.f246828c, errorMessage.f246828c);
            }

            public final int hashCode() {
                return this.f246828c.hashCode() + (this.f246827b.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("ErrorMessage(minLengthValidation=");
                sb2.append(this.f246827b);
                sb2.append(", maxLengthValidation=");
                return C22026a.c(sb2, this.f246828c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f246827b);
                parcel.writeString(this.f246828c);
            }
        }

        /* compiled from: RatingAddAnswerTextValidationInteractor.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextMessage$Message;", "Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextMessage;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Message implements ValidationTextMessage {

            @k
            public static final Parcelable.Creator<Message> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f246829b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f246830c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f246831d;

            /* compiled from: RatingAddAnswerTextValidationInteractor.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Message> {
                @Override // android.os.Parcelable.Creator
                public final Message createFromParcel(Parcel parcel) {
                    return new Message(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Message[] newArray(int i12) {
                    return new Message[i12];
                }
            }

            public Message(@k String str, @k String str2, boolean z12) {
                this.f246829b = str;
                this.f246830c = str2;
                this.f246831d = z12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Message)) {
                    return false;
                }
                Message message = (Message) obj;
                return L.f(this.f246829b, message.f246829b) && L.f(this.f246830c, message.f246830c) && this.f246831d == message.f246831d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f246831d) + H.d(this.f246829b.hashCode() * 31, 31, this.f246830c);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Message(textLength=");
                sb2.append(this.f246829b);
                sb2.append(", maxLengthValidation=");
                sb2.append(this.f246830c);
                sb2.append(", shouldHighlightTextLength=");
                return r.x(sb2, this.f246831d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f246829b);
                parcel.writeString(this.f246830c);
                parcel.writeInt(this.f246831d ? 1 : 0);
            }
        }
    }

    /* compiled from: RatingAddAnswerTextValidationInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextResult;", "Landroid/os/Parcelable;", "Failure", "Ok", "Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextResult$Failure;", "Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextResult$Ok;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static abstract class ValidationTextResult implements Parcelable {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ValidationTextMessage f246832b;

        /* compiled from: RatingAddAnswerTextValidationInteractor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextResult$Failure;", "Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextResult;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Failure extends ValidationTextResult {

            @k
            public static final Parcelable.Creator<Failure> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            @k
            public final ValidationTextMessage f246833c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f246834d;

            /* compiled from: RatingAddAnswerTextValidationInteractor.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Failure> {
                @Override // android.os.Parcelable.Creator
                public final Failure createFromParcel(Parcel parcel) {
                    return new Failure((ValidationTextMessage) parcel.readParcelable(Failure.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Failure[] newArray(int i12) {
                    return new Failure[i12];
                }
            }

            public Failure(@k ValidationTextMessage validationTextMessage, boolean z12) {
                super(validationTextMessage, null);
                this.f246833c = validationTextMessage;
                this.f246834d = z12;
            }

            @Override // com.avito.android.rating.details.answer.text.RatingAddAnswerTextValidationInteractor.ValidationTextResult
            @k
            /* renamed from: c, reason: from getter */
            public final ValidationTextMessage getF246832b() {
                return this.f246833c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Failure)) {
                    return false;
                }
                Failure failure = (Failure) obj;
                return L.f(this.f246833c, failure.f246833c) && this.f246834d == failure.f246834d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f246834d) + (this.f246833c.hashCode() * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Failure(message=");
                sb2.append(this.f246833c);
                sb2.append(", hasContainerError=");
                return r.x(sb2, this.f246834d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f246833c, i12);
                parcel.writeInt(this.f246834d ? 1 : 0);
            }
        }

        /* compiled from: RatingAddAnswerTextValidationInteractor.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextResult$Ok;", "Lcom/avito/android/rating/details/answer/text/RatingAddAnswerTextValidationInteractor$ValidationTextResult;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Ok extends ValidationTextResult {

            @k
            public static final Parcelable.Creator<Ok> CREATOR = new a();

            /* renamed from: c, reason: collision with root package name */
            @k
            public final ValidationTextMessage f246835c;

            /* compiled from: RatingAddAnswerTextValidationInteractor.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Ok> {
                @Override // android.os.Parcelable.Creator
                public final Ok createFromParcel(Parcel parcel) {
                    return new Ok((ValidationTextMessage) parcel.readParcelable(Ok.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Ok[] newArray(int i12) {
                    return new Ok[i12];
                }
            }

            public Ok(@k ValidationTextMessage validationTextMessage) {
                super(validationTextMessage, null);
                this.f246835c = validationTextMessage;
            }

            @Override // com.avito.android.rating.details.answer.text.RatingAddAnswerTextValidationInteractor.ValidationTextResult
            @k
            /* renamed from: c, reason: from getter */
            public final ValidationTextMessage getF246832b() {
                return this.f246835c;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Ok) && L.f(this.f246835c, ((Ok) obj).f246835c);
            }

            public final int hashCode() {
                return this.f246835c.hashCode();
            }

            @k
            public final String toString() {
                return "Ok(message=" + this.f246835c + ')';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f246835c, i12);
            }
        }

        public ValidationTextResult(ValidationTextMessage validationTextMessage, C42822w c42822w) {
            this.f246832b = validationTextMessage;
        }

        @k
        /* renamed from: c, reason: from getter */
        public ValidationTextMessage getF246832b() {
            return this.f246832b;
        }
    }

    @k
    ValidationTextResult a(@k String str, boolean z12);
}
