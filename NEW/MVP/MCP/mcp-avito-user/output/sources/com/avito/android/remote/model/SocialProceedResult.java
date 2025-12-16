package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SocialProceedResult.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/remote/model/SocialProceedResult;", "", "()V", "ErrorDialog", "Ok", "ParsingPermission", "Lcom/avito/android/remote/model/SocialProceedResult$ErrorDialog;", "Lcom/avito/android/remote/model/SocialProceedResult$Ok;", "Lcom/avito/android/remote/model/SocialProceedResult$ParsingPermission;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class SocialProceedResult {

    /* compiled from: SocialProceedResult.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/SocialProceedResult$ErrorDialog;", "Lcom/avito/android/remote/model/SocialProceedResult;", "userDialog", "Lcom/avito/android/remote/model/UserDialog;", "(Lcom/avito/android/remote/model/UserDialog;)V", "getUserDialog", "()Lcom/avito/android/remote/model/UserDialog;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ErrorDialog extends SocialProceedResult {

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

    /* compiled from: SocialProceedResult.kt */
    @InterfaceC19823a
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/model/SocialProceedResult$Ok;", "Lcom/avito/android/remote/model/SocialProceedResult;", "authResult", "Lcom/avito/android/remote/model/AuthResult;", "(Lcom/avito/android/remote/model/AuthResult;)V", "getAuthResult", "()Lcom/avito/android/remote/model/AuthResult;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Ok extends SocialProceedResult {

        @k
        private final AuthResult authResult;

        public Ok(@k AuthResult authResult) {
            super(null);
            this.authResult = authResult;
        }

        @k
        public final AuthResult getAuthResult() {
            return this.authResult;
        }
    }

    /* compiled from: SocialProceedResult.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/SocialProceedResult$ParsingPermission;", "Lcom/avito/android/remote/model/SocialProceedResult;", "name", "", "phones", "", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getPhones", "()Ljava/util/List;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ParsingPermission extends SocialProceedResult {

        @c("name")
        @l
        private final String name;

        @c("phone")
        @l
        private final List<String> phones;

        public ParsingPermission(@l String str, @l List<String> list) {
            super(null);
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

    public /* synthetic */ SocialProceedResult(C42822w c42822w) {
        this();
    }

    private SocialProceedResult() {
    }
}
