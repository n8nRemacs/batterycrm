package com.avito.avcalls.android.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvCallsException.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/avcalls/android/utils/AvCallsException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "CallAlreadyExistsException", "CallNotFoundException", "InvalidCallStateException", "Lcom/avito/avcalls/android/utils/AvCallsException$CallAlreadyExistsException;", "Lcom/avito/avcalls/android/utils/AvCallsException$CallNotFoundException;", "Lcom/avito/avcalls/android/utils/AvCallsException$InvalidCallStateException;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AvCallsException extends Exception {

    /* compiled from: AvCallsException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/utils/AvCallsException$CallAlreadyExistsException;", "Lcom/avito/avcalls/android/utils/AvCallsException;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CallAlreadyExistsException extends AvCallsException {
    }

    /* compiled from: AvCallsException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/utils/AvCallsException$CallNotFoundException;", "Lcom/avito/avcalls/android/utils/AvCallsException;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CallNotFoundException extends AvCallsException {
        /* JADX WARN: Multi-variable type inference failed */
        public CallNotFoundException(@Y61.k String str) {
            super(AK.c.k("Call with id=[", str, "] wasn't found"), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: AvCallsException.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/utils/AvCallsException$InvalidCallStateException;", "Lcom/avito/avcalls/android/utils/AvCallsException;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InvalidCallStateException extends AvCallsException {
        /* JADX WARN: Multi-variable type inference failed */
        public InvalidCallStateException(@Y61.k String str) {
            super(str, null, 2, 0 == true ? 1 : 0);
        }
    }

    public /* synthetic */ AvCallsException(String str, Throwable th2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : th2, null);
    }

    public AvCallsException(String str, Throwable th2, C42822w c42822w) {
        super(str, th2);
    }
}
