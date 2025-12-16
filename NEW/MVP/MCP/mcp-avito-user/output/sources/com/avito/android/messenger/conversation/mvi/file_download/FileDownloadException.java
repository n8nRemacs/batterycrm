package com.avito.android.messenger.conversation.mvi.file_download;

import androidx.compose.runtime.C22026a;
import com.avito.android.persistence.messenger.Q1;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.Response;

/* compiled from: FileDownloadException.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "CacheAndCopyFailed", "DownloadFailed", "FeatureIsDisabled", "IllegalMessageState", "IllegalUserTypeState", "MalformedDownloadUrl", "MessageNotFoundInDb", "Unauthorized", "Unknown", "Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException$CacheAndCopyFailed;", "Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException$DownloadFailed;", "Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException$FeatureIsDisabled;", "Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException$IllegalMessageState;", "Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException$IllegalUserTypeState;", "Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException$MalformedDownloadUrl;", "Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException$MessageNotFoundInDb;", "Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException$Unauthorized;", "Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException$Unknown;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class FileDownloadException extends Exception {

    /* compiled from: FileDownloadException.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException$CacheAndCopyFailed;", "Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException;", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CacheAndCopyFailed extends FileDownloadException {
        public CacheAndCopyFailed() {
            super(null);
        }
    }

    /* compiled from: FileDownloadException.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException$DownloadFailed;", "Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DownloadFailed extends FileDownloadException {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f190794b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f190795c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Response f190796d;

        public DownloadFailed(@Y61.k String str, @Y61.k String str2, @Y61.k Response response) {
            super(null);
            this.f190794b = str;
            this.f190795c = str2;
            this.f190796d = response;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DownloadFailed)) {
                return false;
            }
            DownloadFailed downloadFailed = (DownloadFailed) obj;
            return kotlin.jvm.internal.L.f(this.f190794b, downloadFailed.f190794b) && kotlin.jvm.internal.L.f(this.f190795c, downloadFailed.f190795c) && kotlin.jvm.internal.L.f(this.f190796d, downloadFailed.f190796d);
        }

        public final int hashCode() {
            return this.f190796d.hashCode() + androidx.compose.foundation.H.d(this.f190794b.hashCode() * 31, 31, this.f190795c);
        }

        @Override // java.lang.Throwable
        @Y61.k
        public final String toString() {
            return "DownloadFailed(url=" + this.f190794b + ", headers=" + this.f190795c + ", response=" + this.f190796d + ')';
        }
    }

    /* compiled from: FileDownloadException.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException$FeatureIsDisabled;", "Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException;", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FeatureIsDisabled extends FileDownloadException {
        public FeatureIsDisabled() {
            super(null);
        }
    }

    /* compiled from: FileDownloadException.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException$IllegalMessageState;", "Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IllegalMessageState extends FileDownloadException {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LocalMessage f190797b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Q1 f190798c;

        public IllegalMessageState(@Y61.k LocalMessage localMessage, @Y61.l Q1 q12) {
            super(null);
            this.f190797b = localMessage;
            this.f190798c = q12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IllegalMessageState)) {
                return false;
            }
            IllegalMessageState illegalMessageState = (IllegalMessageState) obj;
            return kotlin.jvm.internal.L.f(this.f190797b, illegalMessageState.f190797b) && kotlin.jvm.internal.L.f(this.f190798c, illegalMessageState.f190798c);
        }

        public final int hashCode() {
            int iHashCode = this.f190797b.hashCode() * 31;
            Q1 q12 = this.f190798c;
            return iHashCode + (q12 == null ? 0 : q12.hashCode());
        }

        @Override // java.lang.Throwable
        @Y61.k
        public final String toString() {
            return "IllegalMessageState(msg=" + this.f190797b + ", metaInfo=" + this.f190798c + ')';
        }
    }

    /* compiled from: FileDownloadException.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException$IllegalUserTypeState;", "Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class IllegalUserTypeState extends FileDownloadException {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f190799b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f190800c;

        public IllegalUserTypeState(@Y61.k String str, @Y61.k String str2) {
            super(null);
            this.f190799b = str;
            this.f190800c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IllegalUserTypeState)) {
                return false;
            }
            IllegalUserTypeState illegalUserTypeState = (IllegalUserTypeState) obj;
            return kotlin.jvm.internal.L.f(this.f190799b, illegalUserTypeState.f190799b) && kotlin.jvm.internal.L.f(this.f190800c, illegalUserTypeState.f190800c);
        }

        public final int hashCode() {
            return this.f190800c.hashCode() + (this.f190799b.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("IllegalUserTypeState(currentUserType=");
            sb2.append(this.f190799b);
            sb2.append(", messageOwnerUserType=");
            return C22026a.c(sb2, this.f190800c, ')');
        }
    }

    /* compiled from: FileDownloadException.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException$MalformedDownloadUrl;", "Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class MalformedDownloadUrl extends FileDownloadException {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f190801b;

        public MalformedDownloadUrl(@Y61.k String str) {
            super(null);
            this.f190801b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MalformedDownloadUrl) && kotlin.jvm.internal.L.f(this.f190801b, ((MalformedDownloadUrl) obj).f190801b);
        }

        public final int hashCode() {
            return this.f190801b.hashCode();
        }

        @Override // java.lang.Throwable
        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("MalformedDownloadUrl(url="), this.f190801b, ')');
        }
    }

    /* compiled from: FileDownloadException.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException$MessageNotFoundInDb;", "Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException;", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MessageNotFoundInDb extends FileDownloadException {
        public MessageNotFoundInDb() {
            super(null);
        }
    }

    /* compiled from: FileDownloadException.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException$Unauthorized;", "Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Unauthorized extends FileDownloadException {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f190802b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f190803c;

        public Unauthorized(@Y61.k String str, @Y61.k String str2) {
            super(null);
            this.f190802b = str;
            this.f190803c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Unauthorized)) {
                return false;
            }
            Unauthorized unauthorized = (Unauthorized) obj;
            return kotlin.jvm.internal.L.f(this.f190802b, unauthorized.f190802b) && kotlin.jvm.internal.L.f(this.f190803c, unauthorized.f190803c);
        }

        public final int hashCode() {
            return this.f190803c.hashCode() + (this.f190802b.hashCode() * 31);
        }

        @Override // java.lang.Throwable
        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Unauthorized(currentUserId=");
            sb2.append(this.f190802b);
            sb2.append(", messageOwnerId=");
            return C22026a.c(sb2, this.f190803c, ')');
        }
    }

    /* compiled from: FileDownloadException.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException$Unknown;", "Lcom/avito/android/messenger/conversation/mvi/file_download/FileDownloadException;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Unknown extends FileDownloadException {

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Throwable f190804b;

        public Unknown(@Y61.l Throwable th2) {
            super(null);
            this.f190804b = th2;
        }

        @Override // java.lang.Throwable
        @Y61.l
        public final Throwable getCause() {
            return this.f190804b;
        }
    }

    public /* synthetic */ FileDownloadException(C42822w c42822w) {
        this();
    }

    private FileDownloadException() {
    }
}
