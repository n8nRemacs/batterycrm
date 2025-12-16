package com.avito.android.quic.cronet;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43059p;

/* compiled from: CronetException.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000e\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/quic/cronet/CronetException;", "Ljava/io/IOException;", "AddressUnreachable", "a", "ConnectionClosed", "ConnectionRefused", "ConnectionReset", "ConnectionTimedOut", "CronetHandledRetryReporting", "FailedCronetErrorParsing", "HostnameNotResolved", "InternetDisconnected", "NetworkChanged", "Other", "QuicProtocolFailed", "TcpReset", "TimedOut", "Lcom/avito/android/quic/cronet/CronetException$AddressUnreachable;", "Lcom/avito/android/quic/cronet/CronetException$ConnectionClosed;", "Lcom/avito/android/quic/cronet/CronetException$ConnectionRefused;", "Lcom/avito/android/quic/cronet/CronetException$ConnectionReset;", "Lcom/avito/android/quic/cronet/CronetException$ConnectionTimedOut;", "Lcom/avito/android/quic/cronet/CronetException$CronetHandledRetryReporting;", "Lcom/avito/android/quic/cronet/CronetException$FailedCronetErrorParsing;", "Lcom/avito/android/quic/cronet/CronetException$HostnameNotResolved;", "Lcom/avito/android/quic/cronet/CronetException$InternetDisconnected;", "Lcom/avito/android/quic/cronet/CronetException$NetworkChanged;", "Lcom/avito/android/quic/cronet/CronetException$Other;", "Lcom/avito/android/quic/cronet/CronetException$QuicProtocolFailed;", "Lcom/avito/android/quic/cronet/CronetException$TcpReset;", "Lcom/avito/android/quic/cronet/CronetException$TimedOut;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class CronetException extends IOException {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f246178b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final C43059p f246179c = new C43059p(".*net::(ERR_.*), ErrorCode=\\d+, InternalErrorCode=-\\d+, Retryable=.*");

    /* compiled from: CronetException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/CronetException$AddressUnreachable;", "Lcom/avito/android/quic/cronet/CronetException;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AddressUnreachable extends CronetException {
    }

    /* compiled from: CronetException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/CronetException$ConnectionClosed;", "Lcom/avito/android/quic/cronet/CronetException;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConnectionClosed extends CronetException {
    }

    /* compiled from: CronetException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/CronetException$ConnectionRefused;", "Lcom/avito/android/quic/cronet/CronetException;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConnectionRefused extends CronetException {
    }

    /* compiled from: CronetException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/CronetException$ConnectionReset;", "Lcom/avito/android/quic/cronet/CronetException;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConnectionReset extends CronetException {
    }

    /* compiled from: CronetException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/CronetException$ConnectionTimedOut;", "Lcom/avito/android/quic/cronet/CronetException;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ConnectionTimedOut extends CronetException {
    }

    /* compiled from: CronetException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/CronetException$CronetHandledRetryReporting;", "Lcom/avito/android/quic/cronet/CronetException;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CronetHandledRetryReporting extends CronetException {
    }

    /* compiled from: CronetException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/CronetException$FailedCronetErrorParsing;", "Lcom/avito/android/quic/cronet/CronetException;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FailedCronetErrorParsing extends CronetException {
    }

    /* compiled from: CronetException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/CronetException$HostnameNotResolved;", "Lcom/avito/android/quic/cronet/CronetException;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class HostnameNotResolved extends CronetException {
    }

    /* compiled from: CronetException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/CronetException$InternetDisconnected;", "Lcom/avito/android/quic/cronet/CronetException;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InternetDisconnected extends CronetException {
    }

    /* compiled from: CronetException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/CronetException$NetworkChanged;", "Lcom/avito/android/quic/cronet/CronetException;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NetworkChanged extends CronetException {
    }

    /* compiled from: CronetException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/CronetException$Other;", "Lcom/avito/android/quic/cronet/CronetException;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Other extends CronetException {
    }

    /* compiled from: CronetException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/CronetException$QuicProtocolFailed;", "Lcom/avito/android/quic/cronet/CronetException;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class QuicProtocolFailed extends CronetException {
    }

    /* compiled from: CronetException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/CronetException$TcpReset;", "Lcom/avito/android/quic/cronet/CronetException;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TcpReset extends CronetException {
    }

    /* compiled from: CronetException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/quic/cronet/CronetException$TimedOut;", "Lcom/avito/android/quic/cronet/CronetException;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TimedOut extends CronetException {
    }

    /* compiled from: CronetException.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/quic/cronet/CronetException$a;", "", "<init>", "()V", "Lkotlin/text/p;", "cronetExceptionMsgRegex", "Lkotlin/text/p;", "_common_quic_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public CronetException(Throwable th2, C42822w c42822w) {
        super(th2);
    }
}
