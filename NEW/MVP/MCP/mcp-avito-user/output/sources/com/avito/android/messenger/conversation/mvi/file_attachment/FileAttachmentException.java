package com.avito.android.messenger.conversation.mvi.file_attachment;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FileAttachmentInteractor.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_attachment/FileAttachmentException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "FileMaxSizeExceeded", "NoSuchFileFoundException", "ReadFileInfoException", "VideoMaxDurationExceeded", "Lcom/avito/android/messenger/conversation/mvi/file_attachment/FileAttachmentException$FileMaxSizeExceeded;", "Lcom/avito/android/messenger/conversation/mvi/file_attachment/FileAttachmentException$NoSuchFileFoundException;", "Lcom/avito/android/messenger/conversation/mvi/file_attachment/FileAttachmentException$ReadFileInfoException;", "Lcom/avito/android/messenger/conversation/mvi/file_attachment/FileAttachmentException$VideoMaxDurationExceeded;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class FileAttachmentException extends Exception {

    /* compiled from: FileAttachmentInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_attachment/FileAttachmentException$FileMaxSizeExceeded;", "Lcom/avito/android/messenger/conversation/mvi/file_attachment/FileAttachmentException;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FileMaxSizeExceeded extends FileAttachmentException {

        /* renamed from: b, reason: collision with root package name */
        public final long f190695b;

        /* renamed from: c, reason: collision with root package name */
        public final long f190696c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f190697d;

        /* JADX WARN: Multi-variable type inference failed */
        public FileMaxSizeExceeded(long j12, long j13, @Y61.l String str) {
            super(null, 1, 0 == true ? 1 : 0);
            this.f190695b = j12;
            this.f190696c = j13;
            this.f190697d = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FileMaxSizeExceeded)) {
                return false;
            }
            FileMaxSizeExceeded fileMaxSizeExceeded = (FileMaxSizeExceeded) obj;
            return this.f190695b == fileMaxSizeExceeded.f190695b && this.f190696c == fileMaxSizeExceeded.f190696c && L.f(this.f190697d, fileMaxSizeExceeded.f190697d);
        }

        public final int hashCode() {
            int iG2 = androidx.appcompat.app.r.g(Long.hashCode(this.f190695b) * 31, 31, this.f190696c);
            String str = this.f190697d;
            return iG2 + (str == null ? 0 : str.hashCode());
        }

        @Override // java.lang.Throwable
        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FileMaxSizeExceeded(fileSizeInBytes=");
            sb2.append(this.f190695b);
            sb2.append(", maxAllowedSizeInBytes=");
            sb2.append(this.f190696c);
            sb2.append(", fileExtension=");
            return C22026a.c(sb2, this.f190697d, ')');
        }
    }

    /* compiled from: FileAttachmentInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_attachment/FileAttachmentException$NoSuchFileFoundException;", "Lcom/avito/android/messenger/conversation/mvi/file_attachment/FileAttachmentException;", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoSuchFileFoundException extends FileAttachmentException {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final NoSuchFileFoundException f190698b = new NoSuchFileFoundException();

        /* JADX WARN: Multi-variable type inference failed */
        private NoSuchFileFoundException() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: FileAttachmentInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_attachment/FileAttachmentException$ReadFileInfoException;", "Lcom/avito/android/messenger/conversation/mvi/file_attachment/FileAttachmentException;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReadFileInfoException extends FileAttachmentException {
    }

    /* compiled from: FileAttachmentInteractor.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_attachment/FileAttachmentException$VideoMaxDurationExceeded;", "Lcom/avito/android/messenger/conversation/mvi/file_attachment/FileAttachmentException;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VideoMaxDurationExceeded extends FileAttachmentException {

        /* renamed from: b, reason: collision with root package name */
        public final long f190699b;

        /* renamed from: c, reason: collision with root package name */
        public final long f190700c;

        /* JADX WARN: Multi-variable type inference failed */
        public VideoMaxDurationExceeded(long j12, long j13) {
            super(null, 1, 0 == true ? 1 : 0);
            this.f190699b = j12;
            this.f190700c = j13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoMaxDurationExceeded)) {
                return false;
            }
            VideoMaxDurationExceeded videoMaxDurationExceeded = (VideoMaxDurationExceeded) obj;
            return this.f190699b == videoMaxDurationExceeded.f190699b && this.f190700c == videoMaxDurationExceeded.f190700c;
        }

        public final int hashCode() {
            return Long.hashCode(this.f190700c) + (Long.hashCode(this.f190699b) * 31);
        }

        @Override // java.lang.Throwable
        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VideoMaxDurationExceeded(videoDurationSec=");
            sb2.append(this.f190699b);
            sb2.append(", maxAllowedDurationSec=");
            return androidx.appcompat.app.r.u(sb2, this.f190700c, ')');
        }
    }

    public /* synthetic */ FileAttachmentException(Throwable th2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : th2, null);
    }

    public FileAttachmentException(Throwable th2, C42822w c42822w) {
        super(th2);
    }
}
