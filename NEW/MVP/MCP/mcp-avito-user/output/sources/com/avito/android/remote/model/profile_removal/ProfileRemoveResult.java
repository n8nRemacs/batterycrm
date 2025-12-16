package com.avito.android.remote.model.profile_removal;

import Y61.k;
import com.google.gson.annotations.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ProfileRemoveResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/ProfileRemoveResult;", "", "()V", "IncorrectData", "Ok", "OutOfDate", "Lcom/avito/android/remote/model/profile_removal/ProfileRemoveResult$IncorrectData;", "Lcom/avito/android/remote/model/profile_removal/ProfileRemoveResult$Ok;", "Lcom/avito/android/remote/model/profile_removal/ProfileRemoveResult$OutOfDate;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class ProfileRemoveResult {

    /* compiled from: ProfileRemoveResult.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/ProfileRemoveResult$IncorrectData;", "Lcom/avito/android/remote/model/profile_removal/ProfileRemoveResult;", "messages", "", "", "(Ljava/util/Map;)V", "message", "getMessage", "()Ljava/lang/String;", "getMessages", "()Ljava/util/Map;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IncorrectData extends ProfileRemoveResult {

        @c("messages")
        @k
        private final Map<String, String> messages;

        public IncorrectData(@k Map<String, String> map) {
            super(null);
            this.messages = map;
        }

        @k
        public final String getMessage() {
            String str = (String) C42745f0.F(this.messages.values());
            return str == null ? "" : str;
        }

        @k
        public final Map<String, String> getMessages() {
            return this.messages;
        }
    }

    /* compiled from: ProfileRemoveResult.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/ProfileRemoveResult$Ok;", "Lcom/avito/android/remote/model/profile_removal/ProfileRemoveResult;", "()V", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok extends ProfileRemoveResult {
        public Ok() {
            super(null);
        }
    }

    /* compiled from: ProfileRemoveResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/profile_removal/ProfileRemoveResult$OutOfDate;", "Lcom/avito/android/remote/model/profile_removal/ProfileRemoveResult;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OutOfDate extends ProfileRemoveResult {

        @c("message")
        @k
        private final String message;

        public OutOfDate(@k String str) {
            super(null);
            this.message = str;
        }

        @k
        public final String getMessage() {
            return this.message;
        }
    }

    public /* synthetic */ ProfileRemoveResult(C42822w c42822w) {
        this();
    }

    private ProfileRemoveResult() {
    }
}
