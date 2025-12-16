package com.avito.android.push.public_module.token.sending.sender;

import Y61.k;
import androidx.annotation.Keep;
import io.reactivex.rxjava3.internal.operators.single.A;
import kotlin.Metadata;

/* compiled from: PushTokenSender.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/push/public_module/token/sending/sender/PushTokenSender;", "", "PushTokenSendErrorException", "_avito_push_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface PushTokenSender {

    /* compiled from: PushTokenSender.kt */
    @Keep
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/push/public_module/token/sending/sender/PushTokenSender$PushTokenSendErrorException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "()V", "_avito_push_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PushTokenSendErrorException extends Exception {
    }

    @k
    A a(@k String str, @k String str2, boolean z12);
}
