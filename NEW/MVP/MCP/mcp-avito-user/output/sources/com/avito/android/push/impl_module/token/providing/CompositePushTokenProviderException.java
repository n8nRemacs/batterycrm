package com.avito.android.push.impl_module.token.providing;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CompositePushTokenProviderImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/push/impl_module/token/providing/CompositePushTokenProviderException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "()V", "NoPushServiceError", "PushProviderError", "Lcom/avito/android/push/impl_module/token/providing/CompositePushTokenProviderException$NoPushServiceError;", "Lcom/avito/android/push/impl_module/token/providing/CompositePushTokenProviderException$PushProviderError;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class CompositePushTokenProviderException extends RuntimeException {

    /* compiled from: CompositePushTokenProviderImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/push/impl_module/token/providing/CompositePushTokenProviderException$NoPushServiceError;", "Lcom/avito/android/push/impl_module/token/providing/CompositePushTokenProviderException;", "<init>", "()V", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NoPushServiceError extends CompositePushTokenProviderException {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f245977b;

        public NoPushServiceError() {
            super(null);
            this.f245977b = "Google Play service or Huawei push services is not available";
        }

        @Override // java.lang.Throwable
        @k
        public final String getMessage() {
            return this.f245977b;
        }
    }

    /* compiled from: CompositePushTokenProviderImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/push/impl_module/token/providing/CompositePushTokenProviderException$PushProviderError;", "Lcom/avito/android/push/impl_module/token/providing/CompositePushTokenProviderException;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PushProviderError extends CompositePushTokenProviderException {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f245978b;

        public PushProviderError(@k String str) {
            super(null);
            this.f245978b = str;
        }
    }

    public /* synthetic */ CompositePushTokenProviderException(C42822w c42822w) {
        this();
    }

    private CompositePushTokenProviderException() {
    }
}
