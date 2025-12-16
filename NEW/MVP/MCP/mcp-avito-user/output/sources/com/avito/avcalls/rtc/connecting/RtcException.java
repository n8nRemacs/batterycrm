package com.avito.avcalls.rtc.connecting;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RtcException.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\u0006\u0007\b\t\n\u000bB\u0013\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005\u0082\u0001\u0006\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/RtcException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "CantCreateAnswerException", "CantCreateOfferException", "CantCreatePeerConnectionException", "CantReceiveStatsReport", "CantSetLocalDescriptionException", "CantSetRemoteDescriptionException", "Lcom/avito/avcalls/rtc/connecting/RtcException$CantCreateAnswerException;", "Lcom/avito/avcalls/rtc/connecting/RtcException$CantCreateOfferException;", "Lcom/avito/avcalls/rtc/connecting/RtcException$CantCreatePeerConnectionException;", "Lcom/avito/avcalls/rtc/connecting/RtcException$CantReceiveStatsReport;", "Lcom/avito/avcalls/rtc/connecting/RtcException$CantSetLocalDescriptionException;", "Lcom/avito/avcalls/rtc/connecting/RtcException$CantSetRemoteDescriptionException;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class RtcException extends Exception {

    /* compiled from: RtcException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/RtcException$CantCreateAnswerException;", "Lcom/avito/avcalls/rtc/connecting/RtcException;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CantCreateAnswerException extends RtcException {
    }

    /* compiled from: RtcException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/RtcException$CantCreateOfferException;", "Lcom/avito/avcalls/rtc/connecting/RtcException;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CantCreateOfferException extends RtcException {
    }

    /* compiled from: RtcException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/RtcException$CantCreatePeerConnectionException;", "Lcom/avito/avcalls/rtc/connecting/RtcException;", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CantCreatePeerConnectionException extends RtcException {
        /* JADX WARN: Multi-variable type inference failed */
        public CantCreatePeerConnectionException() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RtcException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/RtcException$CantReceiveStatsReport;", "Lcom/avito/avcalls/rtc/connecting/RtcException;", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CantReceiveStatsReport extends RtcException {
        /* JADX WARN: Multi-variable type inference failed */
        public CantReceiveStatsReport() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RtcException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/RtcException$CantSetLocalDescriptionException;", "Lcom/avito/avcalls/rtc/connecting/RtcException;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CantSetLocalDescriptionException extends RtcException {
    }

    /* compiled from: RtcException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/connecting/RtcException$CantSetRemoteDescriptionException;", "Lcom/avito/avcalls/rtc/connecting/RtcException;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CantSetRemoteDescriptionException extends RtcException {
    }

    public /* synthetic */ RtcException(String str, C42822w c42822w) {
        this(str);
    }

    private RtcException(String str) {
        super(str);
    }

    public /* synthetic */ RtcException(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, null);
    }
}
