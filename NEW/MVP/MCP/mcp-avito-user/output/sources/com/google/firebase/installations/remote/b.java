package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.TokenResult;
import j.N;
import j.P;

/* compiled from: AutoValue_TokenResult.java */
/* loaded from: classes6.dex */
final class b extends TokenResult {

    /* renamed from: a, reason: collision with root package name */
    public final String f361704a;

    /* renamed from: b, reason: collision with root package name */
    public final long f361705b;

    /* renamed from: c, reason: collision with root package name */
    public final TokenResult.ResponseCode f361706c;

    /* compiled from: AutoValue_TokenResult.java */
    /* renamed from: com.google.firebase.installations.remote.b$b, reason: collision with other inner class name */
    public static final class C10726b extends TokenResult.a {

        /* renamed from: a, reason: collision with root package name */
        public String f361707a;

        /* renamed from: b, reason: collision with root package name */
        public Long f361708b;

        /* renamed from: c, reason: collision with root package name */
        public TokenResult.ResponseCode f361709c;

        public C10726b() {
        }

        @Override // com.google.firebase.installations.remote.TokenResult.a
        public final TokenResult a() {
            String str = this.f361708b == null ? " tokenExpirationTimestamp" : "";
            if (str.isEmpty()) {
                return new b(this.f361707a, this.f361708b.longValue(), this.f361709c, null);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }

        public C10726b(TokenResult tokenResult, a aVar) {
            this.f361707a = tokenResult.c();
            this.f361708b = Long.valueOf(tokenResult.d());
            this.f361709c = tokenResult.b();
        }
    }

    public b(String str, long j12, TokenResult.ResponseCode responseCode, a aVar) {
        this.f361704a = str;
        this.f361705b = j12;
        this.f361706c = responseCode;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @P
    public final TokenResult.ResponseCode b() {
        return this.f361706c;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @P
    public final String c() {
        return this.f361704a;
    }

    @Override // com.google.firebase.installations.remote.TokenResult
    @N
    public final long d() {
        return this.f361705b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TokenResult)) {
            return false;
        }
        TokenResult tokenResult = (TokenResult) obj;
        String str = this.f361704a;
        if (str != null ? str.equals(tokenResult.c()) : tokenResult.c() == null) {
            if (this.f361705b == tokenResult.d()) {
                TokenResult.ResponseCode responseCode = this.f361706c;
                if (responseCode == null) {
                    if (tokenResult.b() == null) {
                        return true;
                    }
                } else if (responseCode.equals(tokenResult.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f361704a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j12 = this.f361705b;
        int i12 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        TokenResult.ResponseCode responseCode = this.f361706c;
        return (responseCode != null ? responseCode.hashCode() : 0) ^ i12;
    }

    public final String toString() {
        return "TokenResult{token=" + this.f361704a + ", tokenExpirationTimestamp=" + this.f361705b + ", responseCode=" + this.f361706c + "}";
    }
}
