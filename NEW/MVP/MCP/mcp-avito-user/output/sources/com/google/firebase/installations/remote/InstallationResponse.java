package com.google.firebase.installations.remote;

import VY0.c;
import j.P;

@VY0.c
/* loaded from: classes6.dex */
public abstract class InstallationResponse {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResponseCode {

        /* renamed from: b, reason: collision with root package name */
        public static final ResponseCode f361688b;

        /* renamed from: c, reason: collision with root package name */
        public static final ResponseCode f361689c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ResponseCode[] f361690d;

        static {
            ResponseCode responseCode = new ResponseCode("OK", 0);
            f361688b = responseCode;
            ResponseCode responseCode2 = new ResponseCode("BAD_CONFIG", 1);
            f361689c = responseCode2;
            f361690d = new ResponseCode[]{responseCode, responseCode2};
        }

        public ResponseCode() {
            throw null;
        }

        public static ResponseCode valueOf(String str) {
            return (ResponseCode) Enum.valueOf(ResponseCode.class, str);
        }

        public static ResponseCode[] values() {
            return (ResponseCode[]) f361690d.clone();
        }
    }

    @c.a
    public static abstract class a {
    }

    @P
    public abstract TokenResult a();

    @P
    public abstract String b();

    @P
    public abstract String c();

    @P
    public abstract ResponseCode d();

    @P
    public abstract String e();
}
