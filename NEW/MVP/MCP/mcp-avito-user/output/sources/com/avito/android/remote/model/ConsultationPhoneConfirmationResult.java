package com.avito.android.remote.model;

import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ConsultationPhoneConfirmationResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/ConsultationPhoneConfirmationResult;", "", "()V", "Failure", "Ok", "Lcom/avito/android/remote/model/ConsultationPhoneConfirmationResult$Failure;", "Lcom/avito/android/remote/model/ConsultationPhoneConfirmationResult$Ok;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ConsultationPhoneConfirmationResult {

    /* compiled from: ConsultationPhoneConfirmationResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/ConsultationPhoneConfirmationResult$Failure;", "Lcom/avito/android/remote/model/ConsultationPhoneConfirmationResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Failure extends ConsultationPhoneConfirmationResult {

        @c("message")
        @k
        private final String message;

        public Failure(@k String str) {
            super(null);
            this.message = str;
        }

        @k
        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: ConsultationPhoneConfirmationResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/model/ConsultationPhoneConfirmationResult$Ok;", "Lcom/avito/android/remote/model/ConsultationPhoneConfirmationResult;", "()V", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok extends ConsultationPhoneConfirmationResult {

        @k
        public static final Ok INSTANCE = new Ok();

        private Ok() {
            super(null);
        }
    }

    public /* synthetic */ ConsultationPhoneConfirmationResult(C42822w c42822w) {
        this();
    }

    private ConsultationPhoneConfirmationResult() {
    }
}
