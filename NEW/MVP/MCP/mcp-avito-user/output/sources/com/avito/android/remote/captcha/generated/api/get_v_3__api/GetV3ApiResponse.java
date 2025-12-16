package com.avito.android.remote.captcha.generated.api.get_v_3__api;

import Nj0.C14581a;
import Y61.k;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetV3ApiResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/avito/android/remote/captcha/generated/api/get_v_3__api/GetV3ApiResponse;", "", "LNj0/a;", "result", "Lcom/avito/android/remote/captcha/generated/api/get_v_3__api/GetV3ApiResponse$Status;", "status", "<init>", "(LNj0/a;Lcom/avito/android/remote/captcha/generated/api/get_v_3__api/GetV3ApiResponse$Status;)V", "LNj0/a;", "a", "()LNj0/a;", "Lcom/avito/android/remote/captcha/generated/api/get_v_3__api/GetV3ApiResponse$Status;", "getStatus", "()Lcom/avito/android/remote/captcha/generated/api/get_v_3__api/GetV3ApiResponse$Status;", "Status", "_avito-discouraged_avito-network_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GetV3ApiResponse {

    @c("result")
    @k
    private final C14581a result;

    @c("status")
    @k
    private final Status status;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetV3ApiResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/captcha/generated/api/get_v_3__api/GetV3ApiResponse$Status;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ok", "_avito-discouraged_avito-network_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status {

        /* renamed from: Ok, reason: collision with root package name */
        @c("ok")
        public static final Status f253312Ok;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Status[] f253313b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f253314c;

        static {
            Status status = new Status("Ok", 0, "ok");
            f253312Ok = status;
            Status[] statusArr = {status};
            f253313b = statusArr;
            f253314c = kotlin.enums.c.a(statusArr);
        }

        private Status(String str, int i12, String str2) {
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f253313b.clone();
        }
    }

    public GetV3ApiResponse(@k C14581a c14581a, @k Status status) {
        this.result = c14581a;
        this.status = status;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final C14581a getResult() {
        return this.result;
    }
}
