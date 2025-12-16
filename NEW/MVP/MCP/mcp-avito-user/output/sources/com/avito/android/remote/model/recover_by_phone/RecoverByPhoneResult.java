package com.avito.android.remote.model.recover_by_phone;

import Y61.k;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UserDialog;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RecoverByPhoneResult.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult;", "", "()V", "Confirmed", "ErrorDialog", "Failure", "FollowDeeplink", "IncorrectData", "Ok", "Unsafe", "Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult$Confirmed;", "Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult$ErrorDialog;", "Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult$Failure;", "Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult$FollowDeeplink;", "Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult$IncorrectData;", "Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult$Ok;", "Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult$Unsafe;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class RecoverByPhoneResult {

    /* compiled from: RecoverByPhoneResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult$Confirmed;", "Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult;", "hash", "", "isPhoneUsed", "", "(Ljava/lang/String;Z)V", "getHash", "()Ljava/lang/String;", "()Z", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Confirmed extends RecoverByPhoneResult {

        @c("hash")
        @k
        private final String hash;

        @c("is_phone_used")
        private final boolean isPhoneUsed;

        public Confirmed(@k String str, boolean z12) {
            super(null);
            this.hash = str;
            this.isPhoneUsed = z12;
        }

        @k
        public final String getHash() {
            return this.hash;
        }

        /* renamed from: isPhoneUsed, reason: from getter */
        public final boolean getIsPhoneUsed() {
            return this.isPhoneUsed;
        }
    }

    /* compiled from: RecoverByPhoneResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult$ErrorDialog;", "Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult;", "userDialog", "Lcom/avito/android/remote/model/UserDialog;", "(Lcom/avito/android/remote/model/UserDialog;)V", "getUserDialog", "()Lcom/avito/android/remote/model/UserDialog;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ErrorDialog extends RecoverByPhoneResult {

        @c("userDialog")
        @k
        private final UserDialog userDialog;

        public ErrorDialog(@k UserDialog userDialog) {
            super(null);
            this.userDialog = userDialog;
        }

        @k
        public final UserDialog getUserDialog() {
            return this.userDialog;
        }
    }

    /* compiled from: RecoverByPhoneResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult$Failure;", "Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Failure extends RecoverByPhoneResult {

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

    /* compiled from: RecoverByPhoneResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult$FollowDeeplink;", "Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult;", Constants.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FollowDeeplink extends RecoverByPhoneResult {

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deeplink;

        public FollowDeeplink(@k DeepLink deepLink) {
            super(null);
            this.deeplink = deepLink;
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }
    }

    /* compiled from: RecoverByPhoneResult.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult$IncorrectData;", "Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult;", "messages", "", "", "(Ljava/util/Map;)V", "getMessages", "()Ljava/util/Map;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IncorrectData extends RecoverByPhoneResult {

        @c("messages")
        @k
        private final Map<String, String> messages;

        public IncorrectData(@k Map<String, String> map) {
            super(null);
            this.messages = map;
        }

        @k
        public final Map<String, String> getMessages() {
            return this.messages;
        }
    }

    /* compiled from: RecoverByPhoneResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult$Ok;", "Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult;", "lastTryTime", "", "nextTryTime", "(JJ)V", "getLastTryTime", "()J", "getNextTryTime", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok extends RecoverByPhoneResult {

        @c("lastTryTime")
        private final long lastTryTime;

        @c("nextTryTime")
        private final long nextTryTime;

        public Ok(long j12, long j13) {
            super(null);
            this.lastTryTime = j12;
            this.nextTryTime = j13;
        }

        public final long getLastTryTime() {
            return this.lastTryTime;
        }

        public final long getNextTryTime() {
            return this.nextTryTime;
        }
    }

    /* compiled from: RecoverByPhoneResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult$Unsafe;", "Lcom/avito/android/remote/model/recover_by_phone/RecoverByPhoneResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Unsafe extends RecoverByPhoneResult {

        @c("message")
        @k
        private final String message;

        public Unsafe(@k String str) {
            super(null);
            this.message = str;
        }

        @k
        public final String getMessage() {
            return this.message;
        }
    }

    public /* synthetic */ RecoverByPhoneResult(C42822w c42822w) {
        this();
    }

    private RecoverByPhoneResult() {
    }
}
