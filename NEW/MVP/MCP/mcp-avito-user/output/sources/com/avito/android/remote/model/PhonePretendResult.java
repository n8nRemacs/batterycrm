package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhonePretendResult.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/model/PhonePretendResult;", "", "()V", "AllowReverification", "DisallowReverification", "IncorrectData", "NeedConfirmation", "Ok", "Lcom/avito/android/remote/model/PhonePretendResult$AllowReverification;", "Lcom/avito/android/remote/model/PhonePretendResult$DisallowReverification;", "Lcom/avito/android/remote/model/PhonePretendResult$IncorrectData;", "Lcom/avito/android/remote/model/PhonePretendResult$NeedConfirmation;", "Lcom/avito/android/remote/model/PhonePretendResult$Ok;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class PhonePretendResult {

    /* compiled from: PhonePretendResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/PhonePretendResult$AllowReverification;", "Lcom/avito/android/remote/model/PhonePretendResult;", "phone", "", "phoneFormatted", "userEmail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "getPhoneFormatted", "getUserEmail", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AllowReverification extends PhonePretendResult {

        @c("phone")
        @k
        private final String phone;

        @c("phone_formatted")
        @k
        private final String phoneFormatted;

        @c("user_email")
        @l
        private final String userEmail;

        public AllowReverification(@k String str, @k String str2, @l String str3) {
            super(null);
            this.phone = str;
            this.phoneFormatted = str2;
            this.userEmail = str3;
        }

        @k
        public final String getPhone() {
            return this.phone;
        }

        @k
        public final String getPhoneFormatted() {
            return this.phoneFormatted;
        }

        @l
        public final String getUserEmail() {
            return this.userEmail;
        }
    }

    /* compiled from: PhonePretendResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/PhonePretendResult$DisallowReverification;", "Lcom/avito/android/remote/model/PhonePretendResult;", "phone", "", "phoneFormatted", "userEmail", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "getPhoneFormatted", "getUserEmail", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DisallowReverification extends PhonePretendResult {

        @c("phone")
        @k
        private final String phone;

        @c("phone_formatted")
        @k
        private final String phoneFormatted;

        @c("user_email")
        @l
        private final String userEmail;

        public DisallowReverification(@k String str, @k String str2, @l String str3) {
            super(null);
            this.phone = str;
            this.phoneFormatted = str2;
            this.userEmail = str3;
        }

        @k
        public final String getPhone() {
            return this.phone;
        }

        @k
        public final String getPhoneFormatted() {
            return this.phoneFormatted;
        }

        @l
        public final String getUserEmail() {
            return this.userEmail;
        }
    }

    /* compiled from: PhonePretendResult.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/PhonePretendResult$IncorrectData;", "Lcom/avito/android/remote/model/PhonePretendResult;", "messages", "", "", "(Ljava/util/Map;)V", "getMessages", "()Ljava/util/Map;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IncorrectData extends PhonePretendResult {

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

    /* compiled from: PhonePretendResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/PhonePretendResult$NeedConfirmation;", "Lcom/avito/android/remote/model/PhonePretendResult;", "success", "", "(Ljava/lang/Boolean;)V", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NeedConfirmation extends PhonePretendResult {

        @c("success")
        @l
        private final Boolean success;

        public NeedConfirmation(@l Boolean bool) {
            super(null);
            this.success = bool;
        }

        @l
        public final Boolean getSuccess() {
            return this.success;
        }
    }

    /* compiled from: PhonePretendResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/PhonePretendResult$Ok;", "Lcom/avito/android/remote/model/PhonePretendResult;", "success", "", "(Ljava/lang/Boolean;)V", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok extends PhonePretendResult {

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

    public /* synthetic */ PhonePretendResult(C42822w c42822w) {
        this();
    }

    private PhonePretendResult() {
    }
}
