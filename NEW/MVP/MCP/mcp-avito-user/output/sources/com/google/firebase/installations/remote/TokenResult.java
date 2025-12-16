package com.google.firebase.installations.remote;

import VY0.c;
import com.google.firebase.installations.remote.b;
import j.N;
import j.P;

@VY0.c
/* loaded from: classes6.dex */
public abstract class TokenResult {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ResponseCode {

        /* renamed from: b, reason: collision with root package name */
        public static final ResponseCode f361691b;

        /* renamed from: c, reason: collision with root package name */
        public static final ResponseCode f361692c;

        /* renamed from: d, reason: collision with root package name */
        public static final ResponseCode f361693d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ ResponseCode[] f361694e;

        static {
            ResponseCode responseCode = new ResponseCode("OK", 0);
            f361691b = responseCode;
            ResponseCode responseCode2 = new ResponseCode("BAD_CONFIG", 1);
            f361692c = responseCode2;
            ResponseCode responseCode3 = new ResponseCode("AUTH_ERROR", 2);
            f361693d = responseCode3;
            f361694e = new ResponseCode[]{responseCode, responseCode2, responseCode3};
        }

        public ResponseCode() {
            throw null;
        }

        public static ResponseCode valueOf(String str) {
            return (ResponseCode) Enum.valueOf(ResponseCode.class, str);
        }

        public static ResponseCode[] values() {
            return (ResponseCode[]) f361694e.clone();
        }
    }

    @c.a
    public static abstract class a {
        @N
        public abstract TokenResult a();
    }

    @N
    public static a a() {
        b.C10726b c10726b = new b.C10726b();
        c10726b.f361708b = 0L;
        return c10726b;
    }

    @P
    public abstract ResponseCode b();

    @P
    public abstract String c();

    @N
    public abstract long d();
}
