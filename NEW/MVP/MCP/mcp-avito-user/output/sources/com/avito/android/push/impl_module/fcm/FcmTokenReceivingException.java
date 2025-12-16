package com.avito.android.push.impl_module.fcm;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FcmPushTokenReceivingException.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0007\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "AuthenticationFailed", "FisAuth", "NullRootMessage", "PhoneRegistration", "ServiceNotAvailable", "TooManyRegistration", "UnidentifiedRootMessage", "Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException$AuthenticationFailed;", "Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException$FisAuth;", "Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException$NullRootMessage;", "Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException$PhoneRegistration;", "Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException$ServiceNotAvailable;", "Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException$TooManyRegistration;", "Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException$UnidentifiedRootMessage;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class FcmTokenReceivingException extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f245944b;

    /* compiled from: FcmPushTokenReceivingException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException$AuthenticationFailed;", "Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException;", "<init>", "()V", "a", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AuthenticationFailed extends FcmTokenReceivingException {

        /* compiled from: FcmPushTokenReceivingException.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException$AuthenticationFailed$a;", "", "<init>", "()V", "", "rootMessage", "Ljava/lang/String;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            new a(null);
        }

        public AuthenticationFailed() {
            super("AUTHENTICATION_FAILED", null);
        }
    }

    /* compiled from: FcmPushTokenReceivingException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException$FisAuth;", "Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException;", "<init>", "()V", "a", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FisAuth extends FcmTokenReceivingException {

        /* compiled from: FcmPushTokenReceivingException.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException$FisAuth$a;", "", "<init>", "()V", "", "rootMessage", "Ljava/lang/String;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            new a(null);
        }

        public FisAuth() {
            super("FIS_AUTH_ERROR", null);
        }
    }

    /* compiled from: FcmPushTokenReceivingException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException$NullRootMessage;", "Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException;", "()V", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NullRootMessage extends FcmTokenReceivingException {
        public NullRootMessage() {
            super("null_root_message", null);
        }
    }

    /* compiled from: FcmPushTokenReceivingException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException$PhoneRegistration;", "Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException;", "<init>", "()V", "a", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PhoneRegistration extends FcmTokenReceivingException {

        /* compiled from: FcmPushTokenReceivingException.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException$PhoneRegistration$a;", "", "<init>", "()V", "", "rootMessage", "Ljava/lang/String;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            new a(null);
        }

        public PhoneRegistration() {
            super("PHONE_REGISTRATION_ERROR", null);
        }
    }

    /* compiled from: FcmPushTokenReceivingException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException$ServiceNotAvailable;", "Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException;", "<init>", "()V", "a", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ServiceNotAvailable extends FcmTokenReceivingException {

        /* compiled from: FcmPushTokenReceivingException.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException$ServiceNotAvailable$a;", "", "<init>", "()V", "", "rootMessage", "Ljava/lang/String;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            new a(null);
        }

        public ServiceNotAvailable() {
            super("SERVICE_NOT_AVAILABLE", null);
        }
    }

    /* compiled from: FcmPushTokenReceivingException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException$TooManyRegistration;", "Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException;", "<init>", "()V", "a", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TooManyRegistration extends FcmTokenReceivingException {

        /* compiled from: FcmPushTokenReceivingException.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException$TooManyRegistration$a;", "", "<init>", "()V", "", "rootMessage", "Ljava/lang/String;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        static {
            new a(null);
        }

        public TooManyRegistration() {
            super("TOO_MANY_REGISTRATIONS", null);
        }
    }

    /* compiled from: FcmPushTokenReceivingException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException$UnidentifiedRootMessage;", "Lcom/avito/android/push/impl_module/fcm/FcmTokenReceivingException;", "()V", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnidentifiedRootMessage extends FcmTokenReceivingException {
        public UnidentifiedRootMessage() {
            super("undefined_root_message", null);
        }
    }

    public FcmTokenReceivingException(String str, C42822w c42822w) {
        this.f245944b = "fcm_".concat(str.toLowerCase(Locale.ROOT));
    }
}
