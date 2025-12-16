package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LoginResult.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/LoginResult;", "", "FailedWithDialog", "FailedWithMessage", "FailedWithMessages", "FollowDeeplink", "Ok", "ParsingPermission", "PassportBlocked", "TfaCheckWithPush", "Lcom/avito/android/remote/model/LoginResult$FailedWithDialog;", "Lcom/avito/android/remote/model/LoginResult$FailedWithMessage;", "Lcom/avito/android/remote/model/LoginResult$FailedWithMessages;", "Lcom/avito/android/remote/model/LoginResult$FollowDeeplink;", "Lcom/avito/android/remote/model/LoginResult$Ok;", "Lcom/avito/android/remote/model/LoginResult$ParsingPermission;", "Lcom/avito/android/remote/model/LoginResult$PassportBlocked;", "Lcom/avito/android/remote/model/LoginResult$TfaCheckWithPush;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface LoginResult {

    /* compiled from: LoginResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/LoginResult$FailedWithDialog;", "Lcom/avito/android/remote/model/LoginResult;", "userDialog", "Lcom/avito/android/remote/model/UserDialog;", "(Lcom/avito/android/remote/model/UserDialog;)V", "getUserDialog", "()Lcom/avito/android/remote/model/UserDialog;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FailedWithDialog implements LoginResult {

        @c("userDialog")
        @k
        private final UserDialog userDialog;

        public FailedWithDialog(@k UserDialog userDialog) {
            this.userDialog = userDialog;
        }

        @k
        public final UserDialog getUserDialog() {
            return this.userDialog;
        }
    }

    /* compiled from: LoginResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/LoginResult$FailedWithMessage;", "Lcom/avito/android/remote/model/LoginResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FailedWithMessage implements LoginResult {

        @c("message")
        @k
        private final String message;

        public FailedWithMessage(@k String str) {
            this.message = str;
        }

        @k
        public final String getMessage() {
            return this.message;
        }
    }

    /* compiled from: LoginResult.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/LoginResult$FailedWithMessages;", "Lcom/avito/android/remote/model/LoginResult;", "messages", "", "", "(Ljava/util/Map;)V", "getMessages", "()Ljava/util/Map;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FailedWithMessages implements LoginResult {

        @c("messages")
        @k
        private final Map<String, String> messages;

        public FailedWithMessages(@k Map<String, String> map) {
            this.messages = map;
        }

        @k
        public final Map<String, String> getMessages() {
            return this.messages;
        }
    }

    /* compiled from: LoginResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/LoginResult$FollowDeeplink;", "Lcom/avito/android/remote/model/LoginResult;", Constants.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FollowDeeplink implements LoginResult {

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deeplink;

        public FollowDeeplink(@k DeepLink deepLink) {
            this.deeplink = deepLink;
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }
    }

    /* compiled from: LoginResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/LoginResult$Ok;", "Lcom/avito/android/remote/model/LoginResult;", "authResult", "Lcom/avito/android/remote/model/AuthResult;", "(Lcom/avito/android/remote/model/AuthResult;)V", "getAuthResult", "()Lcom/avito/android/remote/model/AuthResult;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok implements LoginResult {

        @k
        private final AuthResult authResult;

        public Ok(@k AuthResult authResult) {
            this.authResult = authResult;
        }

        @k
        public final AuthResult getAuthResult() {
            return this.authResult;
        }
    }

    /* compiled from: LoginResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/LoginResult$ParsingPermission;", "Lcom/avito/android/remote/model/LoginResult;", "name", "", "phones", "", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getPhones", "()Ljava/util/List;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ParsingPermission implements LoginResult {

        @c("name")
        @l
        private final String name;

        @c("phones")
        @l
        private final List<String> phones;

        public ParsingPermission(@l String str, @l List<String> list) {
            this.name = str;
            this.phones = list;
        }

        @l
        public final String getName() {
            return this.name;
        }

        @l
        public final List<String> getPhones() {
            return this.phones;
        }
    }

    /* compiled from: LoginResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/LoginResult$PassportBlocked;", "Lcom/avito/android/remote/model/LoginResult;", Constants.DEEPLINK, "Lcom/avito/android/deep_linking/links/DeepLink;", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PassportBlocked implements LoginResult {

        @c(Constants.DEEPLINK)
        @k
        private final DeepLink deeplink;

        public PassportBlocked(@k DeepLink deepLink) {
            this.deeplink = deepLink;
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }
    }

    /* compiled from: LoginResult.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\nR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/remote/model/LoginResult$TfaCheckWithPush;", "Lcom/avito/android/remote/model/LoginResult;", "phoneList", "", "", "src", "Lcom/avito/android/remote/model/TfaSource;", MessageBody.SystemMessageBody.Platform.FLOW, "Lcom/avito/android/remote/model/TfaFlow;", "phone", "(Ljava/util/List;Lcom/avito/android/remote/model/TfaSource;Lcom/avito/android/remote/model/TfaFlow;Ljava/lang/String;)V", "getFlow", "()Lcom/avito/android/remote/model/TfaFlow;", "getPhone", "()Ljava/lang/String;", "getPhoneList", "()Ljava/util/List;", "getSrc", "()Lcom/avito/android/remote/model/TfaSource;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TfaCheckWithPush implements LoginResult {

        @c(MessageBody.SystemMessageBody.Platform.FLOW)
        @k
        private final TfaFlow flow;

        @c("phone")
        @l
        private final String phone;

        @c("phoneList")
        @k
        private final List<String> phoneList;

        @c("src")
        @k
        private final TfaSource src;

        public TfaCheckWithPush(@k List<String> list, @k TfaSource tfaSource, @k TfaFlow tfaFlow, @l String str) {
            this.phoneList = list;
            this.src = tfaSource;
            this.flow = tfaFlow;
            this.phone = str;
        }

        @k
        public final TfaFlow getFlow() {
            return this.flow;
        }

        @l
        public final String getPhone() {
            return this.phone;
        }

        @k
        public final List<String> getPhoneList() {
            return this.phoneList;
        }

        @k
        public final TfaSource getSrc() {
            return this.src;
        }

        public /* synthetic */ TfaCheckWithPush(List list, TfaSource tfaSource, TfaFlow tfaFlow, String str, int i12, C42822w c42822w) {
            this(list, tfaSource, tfaFlow, (i12 & 8) != 0 ? null : str);
        }
    }
}
