package com.avito.android.remote.error;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Error;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.UserDialog;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ApiError.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002:\u0010\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0010\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$¨\u0006%"}, d2 = {"Lcom/avito/android/remote/error/ApiError;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/error/q;", "<init>", "()V", "BadRequest", "CertificatePinningError", "Custom", "ErrorAction", "ErrorDialog", "Failure", "Forbidden", "HttpError", "IncorrectData", "InternalError", "NetworkIOError", "NotFound", "PretendError", "TooManyRequests", "Unauthorized", "UnknownError", "Lcom/avito/android/remote/error/ApiError$BadRequest;", "Lcom/avito/android/remote/error/ApiError$CertificatePinningError;", "Lcom/avito/android/remote/error/ApiError$Custom;", "Lcom/avito/android/remote/error/ApiError$ErrorAction;", "Lcom/avito/android/remote/error/ApiError$ErrorDialog;", "Lcom/avito/android/remote/error/ApiError$Failure;", "Lcom/avito/android/remote/error/ApiError$Forbidden;", "Lcom/avito/android/remote/error/ApiError$HttpError;", "Lcom/avito/android/remote/error/ApiError$IncorrectData;", "Lcom/avito/android/remote/error/ApiError$InternalError;", "Lcom/avito/android/remote/error/ApiError$NetworkIOError;", "Lcom/avito/android/remote/error/ApiError$NotFound;", "Lcom/avito/android/remote/error/ApiError$PretendError;", "Lcom/avito/android/remote/error/ApiError$TooManyRequests;", "Lcom/avito/android/remote/error/ApiError$Unauthorized;", "Lcom/avito/android/remote/error/ApiError$UnknownError;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ApiError implements Parcelable, q {

    /* compiled from: ApiError.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/error/ApiError$CertificatePinningError;", "Lcom/avito/android/remote/error/ApiError;", "", "message", "", "isCertDateValid", "<init>", "(Ljava/lang/String;Z)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CertificatePinningError extends ApiError {

        @Y61.k
        public static final Parcelable.Creator<CertificatePinningError> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f253390b;

        @com.google.gson.annotations.c("message")
        @Y61.k
        private final String message;

        /* compiled from: ApiError.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CertificatePinningError> {
            @Override // android.os.Parcelable.Creator
            public final CertificatePinningError createFromParcel(Parcel parcel) {
                return new CertificatePinningError(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final CertificatePinningError[] newArray(int i12) {
                return new CertificatePinningError[i12];
            }
        }

        public /* synthetic */ CertificatePinningError(String str, boolean z12, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? true : z12);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CertificatePinningError)) {
                return false;
            }
            CertificatePinningError certificatePinningError = (CertificatePinningError) obj;
            return L.f(this.message, certificatePinningError.message) && this.f253390b == certificatePinningError.f253390b;
        }

        @Override // com.avito.android.remote.error.q
        @Y61.k
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f253390b) + (this.message.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CertificatePinningError(message=");
            sb2.append(this.message);
            sb2.append(", isCertDateValid=");
            return androidx.appcompat.app.r.x(sb2, this.f253390b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.message);
            parcel.writeInt(this.f253390b ? 1 : 0);
        }

        public CertificatePinningError(@Y61.k String str, boolean z12) {
            super(null);
            this.message = str;
            this.f253390b = z12;
        }
    }

    /* compiled from: ApiError.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/error/ApiError$Custom;", "Lcom/avito/android/remote/error/ApiError;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    @K51.d
    public static class Custom extends ApiError {

        @Y61.k
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f253391b;

        /* compiled from: ApiError.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Custom> {
            @Override // android.os.Parcelable.Creator
            public final Custom createFromParcel(Parcel parcel) {
                return new Custom(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Custom[] newArray(int i12) {
                return new Custom[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Custom() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Y61.k
        public String getMessage() {
            return this.f253391b;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f253391b);
        }

        public Custom(@Y61.k String str) {
            super(null);
            this.f253391b = str;
        }

        public /* synthetic */ Custom(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "" : str);
        }
    }

    /* compiled from: ApiError.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/error/ApiError$ErrorDialog;", "Lcom/avito/android/remote/error/ApiError;", "Lcom/avito/android/remote/error/s;", "Lcom/avito/android/remote/model/UserDialog;", "userDialog", "<init>", "(Lcom/avito/android/remote/model/UserDialog;)V", "Lcom/avito/android/remote/model/UserDialog;", "d", "()Lcom/avito/android/remote/model/UserDialog;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class ErrorDialog extends ApiError implements s {

        @Y61.k
        public static final Parcelable.Creator<ErrorDialog> CREATOR = new a();

        @com.google.gson.annotations.c("userDialog")
        @Y61.k
        private final UserDialog userDialog;

        /* compiled from: ApiError.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ErrorDialog> {
            @Override // android.os.Parcelable.Creator
            public final ErrorDialog createFromParcel(Parcel parcel) {
                return new ErrorDialog((UserDialog) parcel.readParcelable(ErrorDialog.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ErrorDialog[] newArray(int i12) {
                return new ErrorDialog[i12];
            }
        }

        public ErrorDialog(@Y61.k UserDialog userDialog) {
            super(null);
            this.userDialog = userDialog;
        }

        @Override // com.avito.android.remote.error.s
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final UserDialog getUserDialog() {
            return this.userDialog;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorDialog) && L.f(this.userDialog, ((ErrorDialog) obj).userDialog);
        }

        @Override // com.avito.android.remote.error.q
        @Y61.k
        public final String getMessage() {
            String string = this.userDialog.getMessage().toString();
            if (string.length() <= 0) {
                string = null;
            }
            return string == null ? this.userDialog.getTitle() : string;
        }

        public final int hashCode() {
            return this.userDialog.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ErrorDialog(userDialog=" + this.userDialog + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.userDialog, i12);
        }
    }

    /* compiled from: ApiError.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/error/ApiError$Failure;", "Lcom/avito/android/remote/error/ApiError;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Failure extends ApiError {

        @Y61.k
        public static final Parcelable.Creator<Failure> CREATOR = new a();

        @com.google.gson.annotations.c("message")
        @Y61.k
        private final String message;

        /* compiled from: ApiError.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Failure> {
            @Override // android.os.Parcelable.Creator
            public final Failure createFromParcel(Parcel parcel) {
                return new Failure(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Failure[] newArray(int i12) {
                return new Failure[i12];
            }
        }

        public Failure(@Y61.k String str) {
            super(null);
            this.message = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && L.f(this.message, ((Failure) obj).message);
        }

        @Override // com.avito.android.remote.error.q
        @Y61.k
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Failure(message="), this.message, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.message);
        }
    }

    /* compiled from: ApiError.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/error/ApiError$Forbidden;", "Lcom/avito/android/remote/error/ApiError;", "Lcom/avito/android/remote/error/p;", "", "message", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Forbidden extends ApiError implements p {

        @Y61.k
        public static final Parcelable.Creator<Forbidden> CREATOR = new a();

        @com.google.gson.annotations.c("link")
        @Y61.l
        private final DeepLink link;

        @com.google.gson.annotations.c("message")
        @Y61.k
        private final String message;

        /* compiled from: ApiError.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Forbidden> {
            @Override // android.os.Parcelable.Creator
            public final Forbidden createFromParcel(Parcel parcel) {
                return new Forbidden(parcel.readString(), (DeepLink) parcel.readParcelable(Forbidden.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Forbidden[] newArray(int i12) {
                return new Forbidden[i12];
            }
        }

        public /* synthetic */ Forbidden(String str, DeepLink deepLink, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : deepLink);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Forbidden)) {
                return false;
            }
            Forbidden forbidden = (Forbidden) obj;
            return L.f(this.message, forbidden.message) && L.f(this.link, forbidden.link);
        }

        @Override // com.avito.android.remote.error.p
        @Y61.l
        /* renamed from: getDeeplink, reason: from getter */
        public final DeepLink getLink() {
            return this.link;
        }

        @Override // com.avito.android.remote.error.q
        @Y61.k
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            DeepLink deepLink = this.link;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Forbidden(message=");
            sb2.append(this.message);
            sb2.append(", link=");
            return com.avito.android.actions_sheet.a.v(sb2, this.link, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.message);
            parcel.writeParcelable(this.link, i12);
        }

        public Forbidden(@Y61.k String str, @Y61.l DeepLink deepLink) {
            super(null);
            this.message = str;
            this.link = deepLink;
        }
    }

    /* compiled from: ApiError.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/error/ApiError$HttpError;", "Lcom/avito/android/remote/error/ApiError;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class HttpError extends ApiError {

        @Y61.k
        public static final Parcelable.Creator<HttpError> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Error f253392b;

        /* compiled from: ApiError.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<HttpError> {
            @Override // android.os.Parcelable.Creator
            public final HttpError createFromParcel(Parcel parcel) {
                return new HttpError((Error) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final HttpError[] newArray(int i12) {
                return new HttpError[i12];
            }
        }

        public HttpError(@Y61.k Error error) {
            super(null);
            this.f253392b = error;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HttpError) && L.f(this.f253392b, ((HttpError) obj).f253392b);
        }

        @Override // com.avito.android.remote.error.q
        @Y61.k
        public final String getMessage() {
            String oneMessage = this.f253392b.getOneMessage();
            return oneMessage == null ? "" : oneMessage;
        }

        public final int hashCode() {
            return this.f253392b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "HttpError(error=" + this.f253392b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeSerializable(this.f253392b);
        }
    }

    /* compiled from: ApiError.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/error/ApiError$IncorrectData;", "Lcom/avito/android/remote/error/ApiError;", "Lcom/avito/android/remote/error/r;", "", "", "messages", "<init>", "(Ljava/util/Map;)V", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IncorrectData extends ApiError implements r {

        @Y61.k
        public static final Parcelable.Creator<IncorrectData> CREATOR = new a();

        @com.google.gson.annotations.c("messages")
        @Y61.k
        private final Map<String, String> messages;

        /* compiled from: ApiError.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<IncorrectData> {
            @Override // android.os.Parcelable.Creator
            public final IncorrectData createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
                return new IncorrectData(linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final IncorrectData[] newArray(int i12) {
                return new IncorrectData[i12];
            }
        }

        public IncorrectData(@Y61.k Map<String, String> map) {
            super(null);
            this.messages = map;
        }

        @Override // com.avito.android.remote.error.r
        @Y61.k
        public final Map<String, String> c() {
            return this.messages;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IncorrectData) && L.f(this.messages, ((IncorrectData) obj).messages);
        }

        @Override // com.avito.android.remote.error.q
        @Y61.k
        public final String getMessage() {
            String str = (String) C42745f0.F(this.messages.values());
            return str == null ? "" : str;
        }

        public final int hashCode() {
            return this.messages.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.w(new StringBuilder("IncorrectData(messages="), this.messages, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Iterator itI = C0.i(parcel, this.messages);
            while (itI.hasNext()) {
                Map.Entry entry = (Map.Entry) itI.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
    }

    /* compiled from: ApiError.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/error/ApiError$InternalError;", "Lcom/avito/android/remote/error/ApiError;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class InternalError extends ApiError {

        @Y61.k
        public static final Parcelable.Creator<InternalError> CREATOR = new a();

        @com.google.gson.annotations.c("message")
        @Y61.k
        private final String message;

        /* compiled from: ApiError.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<InternalError> {
            @Override // android.os.Parcelable.Creator
            public final InternalError createFromParcel(Parcel parcel) {
                return new InternalError(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final InternalError[] newArray(int i12) {
                return new InternalError[i12];
            }
        }

        public InternalError(@Y61.k String str) {
            super(null);
            this.message = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InternalError) && L.f(this.message, ((InternalError) obj).message);
        }

        @Override // com.avito.android.remote.error.q
        @Y61.k
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("InternalError(message="), this.message, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.message);
        }
    }

    /* compiled from: ApiError.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/error/ApiError$NetworkIOError;", "Lcom/avito/android/remote/error/ApiError;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NetworkIOError extends ApiError {

        @Y61.k
        public static final Parcelable.Creator<NetworkIOError> CREATOR = new a();

        @com.google.gson.annotations.c("message")
        @Y61.k
        private final String message;

        /* compiled from: ApiError.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NetworkIOError> {
            @Override // android.os.Parcelable.Creator
            public final NetworkIOError createFromParcel(Parcel parcel) {
                return new NetworkIOError(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NetworkIOError[] newArray(int i12) {
                return new NetworkIOError[i12];
            }
        }

        public NetworkIOError(@Y61.k String str) {
            super(null);
            this.message = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NetworkIOError) && L.f(this.message, ((NetworkIOError) obj).message);
        }

        @Override // com.avito.android.remote.error.q
        @Y61.k
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("NetworkIOError(message="), this.message, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.message);
        }
    }

    /* compiled from: ApiError.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/error/ApiError$NotFound;", "Lcom/avito/android/remote/error/ApiError;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NotFound extends ApiError {

        @Y61.k
        public static final Parcelable.Creator<NotFound> CREATOR = new a();

        @com.google.gson.annotations.c("message")
        @Y61.k
        private final String message;

        /* compiled from: ApiError.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NotFound> {
            @Override // android.os.Parcelable.Creator
            public final NotFound createFromParcel(Parcel parcel) {
                return new NotFound(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final NotFound[] newArray(int i12) {
                return new NotFound[i12];
            }
        }

        public NotFound(@Y61.k String str) {
            super(null);
            this.message = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotFound) && L.f(this.message, ((NotFound) obj).message);
        }

        @Override // com.avito.android.remote.error.q
        @Y61.k
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("NotFound(message="), this.message, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.message);
        }
    }

    /* compiled from: ApiError.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/error/ApiError$PretendError;", "Lcom/avito/android/remote/error/ApiError;", "Lcom/avito/android/remote/error/q;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PretendError extends ApiError implements q {

        @Y61.k
        public static final Parcelable.Creator<PretendError> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final PretendResult f253393b;

        /* compiled from: ApiError.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PretendError> {
            @Override // android.os.Parcelable.Creator
            public final PretendError createFromParcel(Parcel parcel) {
                return new PretendError(PretendResult.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final PretendError[] newArray(int i12) {
                return new PretendError[i12];
            }
        }

        public PretendError(@Y61.k PretendResult pretendResult) {
            super(null);
            this.f253393b = pretendResult;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PretendError) && L.f(this.f253393b, ((PretendError) obj).f253393b);
        }

        @Override // com.avito.android.remote.error.q
        @Y61.k
        public final String getMessage() {
            return this.f253393b.getMessage();
        }

        public final int hashCode() {
            return this.f253393b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "PretendError(result=" + this.f253393b + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            this.f253393b.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: ApiError.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/error/ApiError$TooManyRequests;", "Lcom/avito/android/remote/error/ApiError;", "", "message", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class TooManyRequests extends ApiError {

        @Y61.k
        public static final Parcelable.Creator<TooManyRequests> CREATOR = new a();

        @com.google.gson.annotations.c("link")
        @Y61.l
        private final DeepLink deeplink;

        @com.google.gson.annotations.c("message")
        @Y61.k
        private final String message;

        /* compiled from: ApiError.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TooManyRequests> {
            @Override // android.os.Parcelable.Creator
            public final TooManyRequests createFromParcel(Parcel parcel) {
                return new TooManyRequests(parcel.readString(), (DeepLink) parcel.readParcelable(TooManyRequests.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final TooManyRequests[] newArray(int i12) {
                return new TooManyRequests[i12];
            }
        }

        public /* synthetic */ TooManyRequests(String str, DeepLink deepLink, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : deepLink);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TooManyRequests)) {
                return false;
            }
            TooManyRequests tooManyRequests = (TooManyRequests) obj;
            return L.f(this.message, tooManyRequests.message) && L.f(this.deeplink, tooManyRequests.deeplink);
        }

        @Override // com.avito.android.remote.error.q
        @Y61.k
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            DeepLink deepLink = this.deeplink;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TooManyRequests(message=");
            sb2.append(this.message);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.deeplink, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.message);
            parcel.writeParcelable(this.deeplink, i12);
        }

        public TooManyRequests(@Y61.k String str, @Y61.l DeepLink deepLink) {
            super(null);
            this.message = str;
            this.deeplink = deepLink;
        }
    }

    /* compiled from: ApiError.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/error/ApiError$Unauthorized;", "Lcom/avito/android/remote/error/ApiError;", "", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Unauthorized extends ApiError {

        @Y61.k
        public static final Parcelable.Creator<Unauthorized> CREATOR = new a();

        @com.google.gson.annotations.c("message")
        @Y61.k
        private final String message;

        /* compiled from: ApiError.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Unauthorized> {
            @Override // android.os.Parcelable.Creator
            public final Unauthorized createFromParcel(Parcel parcel) {
                return new Unauthorized(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Unauthorized[] newArray(int i12) {
                return new Unauthorized[i12];
            }
        }

        public Unauthorized(@Y61.k String str) {
            super(null);
            this.message = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unauthorized) && L.f(this.message, ((Unauthorized) obj).message);
        }

        @Override // com.avito.android.remote.error.q
        @Y61.k
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Unauthorized(message="), this.message, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.message);
        }
    }

    /* compiled from: ApiError.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/error/ApiError$UnknownError;", "Lcom/avito/android/remote/error/ApiError;", "", "message", "debugInfo", "", "debugThrowable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnknownError extends ApiError {

        @Y61.k
        public static final Parcelable.Creator<UnknownError> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f253394b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Throwable f253395c;

        @com.google.gson.annotations.c("message")
        @Y61.k
        private final String message;

        /* compiled from: ApiError.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UnknownError> {
            @Override // android.os.Parcelable.Creator
            public final UnknownError createFromParcel(Parcel parcel) {
                return new UnknownError(parcel.readString(), parcel.readString(), (Throwable) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final UnknownError[] newArray(int i12) {
                return new UnknownError[i12];
            }
        }

        public /* synthetic */ UnknownError(String str, String str2, Throwable th2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : th2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnknownError)) {
                return false;
            }
            UnknownError unknownError = (UnknownError) obj;
            return L.f(this.message, unknownError.message) && L.f(this.f253394b, unknownError.f253394b) && L.f(this.f253395c, unknownError.f253395c);
        }

        @Override // com.avito.android.remote.error.q
        @Y61.k
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            int iHashCode = this.message.hashCode() * 31;
            String str = this.f253394b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Throwable th2 = this.f253395c;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UnknownError(message=");
            sb2.append(this.message);
            sb2.append(", debugInfo=");
            sb2.append(this.f253394b);
            sb2.append(", debugThrowable=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f253395c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.message);
            parcel.writeString(this.f253394b);
            parcel.writeSerializable(this.f253395c);
        }

        public UnknownError(@Y61.k String str, @Y61.l String str2, @Y61.l Throwable th2) {
            super(null);
            this.message = str;
            this.f253394b = str2;
            this.f253395c = th2;
        }
    }

    public /* synthetic */ ApiError(C42822w c42822w) {
        this();
    }

    /* compiled from: ApiError.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\tR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/error/ApiError$BadRequest;", "Lcom/avito/android/remote/error/ApiError;", "Lcom/avito/android/remote/error/r;", "", "", "messages", "<init>", "(Ljava/util/Map;)V", "message", "(Ljava/lang/String;)V", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BadRequest extends ApiError implements r {

        @Y61.k
        public static final Parcelable.Creator<BadRequest> CREATOR = new a();

        @com.google.gson.annotations.c("messages")
        @Y61.k
        private final Map<String, String> messages;

        /* compiled from: ApiError.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BadRequest> {
            @Override // android.os.Parcelable.Creator
            public final BadRequest createFromParcel(Parcel parcel) {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
                return new BadRequest(linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final BadRequest[] newArray(int i12) {
                return new BadRequest[i12];
            }
        }

        public BadRequest(@Y61.k String str) {
            this((Map<String, String>) Collections.singletonMap("message", str));
        }

        @Override // com.avito.android.remote.error.r
        @Y61.k
        public final Map<String, String> c() {
            return this.messages;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BadRequest) && L.f(this.messages, ((BadRequest) obj).messages);
        }

        @Override // com.avito.android.remote.error.q
        @Y61.k
        public final String getMessage() {
            String str = (String) C42745f0.F(this.messages.values());
            return str == null ? "" : str;
        }

        public final int hashCode() {
            return this.messages.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.w(new StringBuilder("BadRequest(messages="), this.messages, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Iterator itI = C0.i(parcel, this.messages);
            while (itI.hasNext()) {
                Map.Entry entry = (Map.Entry) itI.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }

        public BadRequest(@Y61.k Map<String, String> map) {
            super(null);
            this.messages = map;
        }
    }

    /* compiled from: ApiError.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/error/ApiError$ErrorAction;", "Lcom/avito/android/remote/error/ApiError;", "Lcom/avito/android/remote/error/p;", "Lcom/avito/android/deep_linking/links/DeepLink;", "action", "", "message", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getAction", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "_common_network-typed-result_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ErrorAction extends ApiError implements p {

        @Y61.k
        public static final Parcelable.Creator<ErrorAction> CREATOR = new a();

        @com.google.gson.annotations.c("action")
        @Y61.k
        private final DeepLink action;

        @com.google.gson.annotations.c("message")
        @Y61.k
        private final String message;

        /* compiled from: ApiError.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ErrorAction> {
            @Override // android.os.Parcelable.Creator
            public final ErrorAction createFromParcel(Parcel parcel) {
                return new ErrorAction((DeepLink) parcel.readParcelable(ErrorAction.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ErrorAction[] newArray(int i12) {
                return new ErrorAction[i12];
            }
        }

        public /* synthetic */ ErrorAction(DeepLink deepLink, String str, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? "" : str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorAction)) {
                return false;
            }
            ErrorAction errorAction = (ErrorAction) obj;
            return L.f(this.action, errorAction.action) && L.f(this.message, errorAction.message);
        }

        @Y61.k
        public final DeepLink getAction() {
            return this.action;
        }

        @Override // com.avito.android.remote.error.p
        @Y61.k
        /* renamed from: getDeeplink */
        public final DeepLink getLink() {
            return this.action;
        }

        @Override // com.avito.android.remote.error.q
        @Y61.k
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.message.hashCode() + (this.action.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ErrorAction(action=");
            sb2.append(this.action);
            sb2.append(", message=");
            return C22026a.c(sb2, this.message, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.action, i12);
            parcel.writeString(this.message);
        }

        public ErrorAction(@Y61.k DeepLink deepLink, @Y61.k String str) {
            super(null);
            this.action = deepLink;
            this.message = str;
        }
    }

    private ApiError() {
    }
}
