package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelfEmployedPhoneValidationResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/SelfEmployedPhoneValidationResult;", "", "()V", "Failure", "Ok", "Lcom/avito/android/remote/model/SelfEmployedPhoneValidationResult$Failure;", "Lcom/avito/android/remote/model/SelfEmployedPhoneValidationResult$Ok;", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class SelfEmployedPhoneValidationResult {

    /* compiled from: SelfEmployedPhoneValidationResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/SelfEmployedPhoneValidationResult$Failure;", "Lcom/avito/android/remote/model/SelfEmployedPhoneValidationResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Failure extends SelfEmployedPhoneValidationResult {

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

    /* compiled from: SelfEmployedPhoneValidationResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/SelfEmployedPhoneValidationResult$Ok;", "Lcom/avito/android/remote/model/SelfEmployedPhoneValidationResult;", "success", "", "(Ljava/lang/Boolean;)V", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok extends SelfEmployedPhoneValidationResult {

        @c("success")
        @l
        private final Boolean success;

        public Ok(@l Boolean bool) {
            super(null);
            this.success = bool;
        }

        @l
        public final Boolean getSuccess() {
            return this.success;
        }
    }

    public /* synthetic */ SelfEmployedPhoneValidationResult(C42822w c42822w) {
        this();
    }

    private SelfEmployedPhoneValidationResult() {
    }
}
