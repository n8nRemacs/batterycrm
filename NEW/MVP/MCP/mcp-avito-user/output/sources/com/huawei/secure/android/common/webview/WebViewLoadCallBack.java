package com.huawei.secure.android.common.webview;

/* loaded from: classes7.dex */
public interface WebViewLoadCallBack {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ErrorCode {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ErrorCode[] f363741b = {new ErrorCode("HTTP_URL", 0), new ErrorCode("URL_NOT_IN_WHITE_LIST", 1), new ErrorCode("OTHER", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        ErrorCode EF5;

        public ErrorCode() {
            throw null;
        }

        public static ErrorCode valueOf(String str) {
            return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
        }

        public static ErrorCode[] values() {
            return (ErrorCode[]) f363741b.clone();
        }
    }

    void a();
}
