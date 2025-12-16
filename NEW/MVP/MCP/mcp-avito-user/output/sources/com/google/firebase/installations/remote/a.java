package com.google.firebase.installations.remote;

import com.google.firebase.installations.remote.InstallationResponse;
import j.P;

/* compiled from: AutoValue_InstallationResponse.java */
/* loaded from: classes6.dex */
final class a extends InstallationResponse {

    /* renamed from: a, reason: collision with root package name */
    public final String f361695a;

    /* renamed from: b, reason: collision with root package name */
    public final String f361696b;

    /* renamed from: c, reason: collision with root package name */
    public final String f361697c;

    /* renamed from: d, reason: collision with root package name */
    public final TokenResult f361698d;

    /* renamed from: e, reason: collision with root package name */
    public final InstallationResponse.ResponseCode f361699e;

    /* compiled from: AutoValue_InstallationResponse.java */
    public static final class b extends InstallationResponse.a {

        /* renamed from: a, reason: collision with root package name */
        public String f361700a;

        /* renamed from: b, reason: collision with root package name */
        public String f361701b;

        /* renamed from: c, reason: collision with root package name */
        public String f361702c;

        /* renamed from: d, reason: collision with root package name */
        public TokenResult f361703d;

        public b() {
        }

        public b(InstallationResponse installationResponse, C10725a c10725a) {
            this.f361700a = installationResponse.e();
            this.f361701b = installationResponse.b();
            this.f361702c = installationResponse.c();
            this.f361703d = installationResponse.a();
            installationResponse.d();
        }
    }

    public a(String str, String str2, String str3, TokenResult tokenResult, InstallationResponse.ResponseCode responseCode, C10725a c10725a) {
        this.f361695a = str;
        this.f361696b = str2;
        this.f361697c = str3;
        this.f361698d = tokenResult;
        this.f361699e = responseCode;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @P
    public final TokenResult a() {
        return this.f361698d;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @P
    public final String b() {
        return this.f361696b;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @P
    public final String c() {
        return this.f361697c;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @P
    public final InstallationResponse.ResponseCode d() {
        return this.f361699e;
    }

    @Override // com.google.firebase.installations.remote.InstallationResponse
    @P
    public final String e() {
        return this.f361695a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationResponse)) {
            return false;
        }
        InstallationResponse installationResponse = (InstallationResponse) obj;
        String str = this.f361695a;
        if (str != null ? str.equals(installationResponse.e()) : installationResponse.e() == null) {
            String str2 = this.f361696b;
            if (str2 != null ? str2.equals(installationResponse.b()) : installationResponse.b() == null) {
                String str3 = this.f361697c;
                if (str3 != null ? str3.equals(installationResponse.c()) : installationResponse.c() == null) {
                    TokenResult tokenResult = this.f361698d;
                    if (tokenResult != null ? tokenResult.equals(installationResponse.a()) : installationResponse.a() == null) {
                        InstallationResponse.ResponseCode responseCode = this.f361699e;
                        if (responseCode == null) {
                            if (installationResponse.d() == null) {
                                return true;
                            }
                        } else if (responseCode.equals(installationResponse.d())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f361695a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f361696b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f361697c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        TokenResult tokenResult = this.f361698d;
        int iHashCode4 = (iHashCode3 ^ (tokenResult == null ? 0 : tokenResult.hashCode())) * 1000003;
        InstallationResponse.ResponseCode responseCode = this.f361699e;
        return (responseCode != null ? responseCode.hashCode() : 0) ^ iHashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f361695a + ", fid=" + this.f361696b + ", refreshToken=" + this.f361697c + ", authToken=" + this.f361698d + ", responseCode=" + this.f361699e + "}";
    }
}
