package com.avito.avcalls.android.rtc;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RtcException.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/avcalls/android/rtc/RtcException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "CantCreateAnswerException", "CantCreateOfferException", "CantCreatePeerConnectionException", "CantReceiveStatsReport", "CantSetLocalDescriptionException", "CantSetRemoteDescriptionException", "Lcom/avito/avcalls/android/rtc/RtcException$CantCreateAnswerException;", "Lcom/avito/avcalls/android/rtc/RtcException$CantCreateOfferException;", "Lcom/avito/avcalls/android/rtc/RtcException$CantCreatePeerConnectionException;", "Lcom/avito/avcalls/android/rtc/RtcException$CantReceiveStatsReport;", "Lcom/avito/avcalls/android/rtc/RtcException$CantSetLocalDescriptionException;", "Lcom/avito/avcalls/android/rtc/RtcException$CantSetRemoteDescriptionException;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class RtcException extends Exception {

    /* compiled from: RtcException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/rtc/RtcException$CantCreateAnswerException;", "Lcom/avito/avcalls/android/rtc/RtcException;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CantCreateAnswerException extends RtcException {
    }

    /* compiled from: RtcException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/rtc/RtcException$CantCreateOfferException;", "Lcom/avito/avcalls/android/rtc/RtcException;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CantCreateOfferException extends RtcException {
    }

    /* compiled from: RtcException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/android/rtc/RtcException$CantCreatePeerConnectionException;", "Lcom/avito/avcalls/android/rtc/RtcException;", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CantCreatePeerConnectionException extends RtcException {
        /* JADX WARN: Multi-variable type inference failed */
        public CantCreatePeerConnectionException() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RtcException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/avcalls/android/rtc/RtcException$CantReceiveStatsReport;", "Lcom/avito/avcalls/android/rtc/RtcException;", "()V", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CantReceiveStatsReport extends RtcException {
        /* JADX WARN: Multi-variable type inference failed */
        public CantReceiveStatsReport() {
            super(null, 1, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: RtcException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/rtc/RtcException$CantSetLocalDescriptionException;", "Lcom/avito/avcalls/android/rtc/RtcException;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CantSetLocalDescriptionException extends RtcException {
    }

    /* compiled from: RtcException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/rtc/RtcException$CantSetRemoteDescriptionException;", "Lcom/avito/avcalls/android/rtc/RtcException;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CantSetRemoteDescriptionException extends RtcException {
    }

    public /* synthetic */ RtcException(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, null);
    }

    public RtcException(String str, C42822w c42822w) {
        super(str);
    }
}
