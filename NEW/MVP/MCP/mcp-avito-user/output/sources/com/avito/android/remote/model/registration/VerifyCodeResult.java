package com.avito.android.remote.model.registration;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ConfirmCodeResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/registration/VerifyCodeResult;", "", "Failure", "IncorrectData", "Ok", "Lcom/avito/android/remote/model/registration/VerifyCodeResult$Failure;", "Lcom/avito/android/remote/model/registration/VerifyCodeResult$IncorrectData;", "Lcom/avito/android/remote/model/registration/VerifyCodeResult$Ok;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface VerifyCodeResult {

    /* compiled from: ConfirmCodeResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/registration/VerifyCodeResult$Failure;", "Lcom/avito/android/remote/model/registration/VerifyCodeResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Failure implements VerifyCodeResult {

        @c("message")
        @k
        private final String message;

        public Failure(@k String str) {
            this.message = str;
        }

        @k
        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: ConfirmCodeResult.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/registration/VerifyCodeResult$IncorrectData;", "Lcom/avito/android/remote/model/registration/VerifyCodeResult;", "messages", "", "", "(Ljava/util/Map;)V", "getMessages", "()Ljava/util/Map;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IncorrectData implements VerifyCodeResult {

        @c("messages")
        @k
        private final Map<String, String> messages;

        public IncorrectData(@k Map<String, String> map) {
            this.messages = map;
        }

        @k
        public final Map<String, String> getMessages() {
            return this.messages;
        }
    }

    /* compiled from: ConfirmCodeResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/registration/VerifyCodeResult$Ok;", "Lcom/avito/android/remote/model/registration/VerifyCodeResult;", "reverified", "", "(Ljava/lang/Boolean;)V", "getReverified", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok implements VerifyCodeResult {

        @c("reverified")
        @l
        private final Boolean reverified;

        public Ok(@l Boolean bool) {
            this.reverified = bool;
        }

        @l
        public final Boolean getReverified() {
            return this.reverified;
        }
    }
}
