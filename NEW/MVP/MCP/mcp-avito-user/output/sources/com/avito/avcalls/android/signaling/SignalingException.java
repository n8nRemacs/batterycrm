package com.avito.avcalls.android.signaling;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SignalingException.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/avcalls/android/signaling/SignalingException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "CantSendMessageException", "ExternalTransportException", "Lcom/avito/avcalls/android/signaling/SignalingException$CantSendMessageException;", "Lcom/avito/avcalls/android/signaling/SignalingException$ExternalTransportException;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class SignalingException extends Exception {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f331990b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Throwable f331991c;

    /* compiled from: SignalingException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/signaling/SignalingException$CantSendMessageException;", "Lcom/avito/avcalls/android/signaling/SignalingException;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CantSendMessageException extends SignalingException {
        public CantSendMessageException() {
            this(null, null, 3, null);
        }

        public CantSendMessageException(String str, Throwable th2, int i12, C42822w c42822w) {
            super((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : th2, null);
        }
    }

    /* compiled from: SignalingException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/signaling/SignalingException$ExternalTransportException;", "Lcom/avito/avcalls/android/signaling/SignalingException;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ExternalTransportException extends SignalingException {
        /* JADX WARN: Multi-variable type inference failed */
        public ExternalTransportException() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ExternalTransportException(@Y61.l Throwable th2) {
            super(null, th2, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ ExternalTransportException(Throwable th2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : th2);
        }
    }

    public /* synthetic */ SignalingException(String str, Throwable th2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : th2, null);
    }

    @Override // java.lang.Throwable
    @Y61.l
    public final Throwable getCause() {
        return this.f331991c;
    }

    @Override // java.lang.Throwable
    @Y61.l
    public final String getMessage() {
        return this.f331990b;
    }

    public SignalingException(String str, Throwable th2, C42822w c42822w) {
        super(str);
        this.f331990b = str;
        this.f331991c = th2;
    }
}
