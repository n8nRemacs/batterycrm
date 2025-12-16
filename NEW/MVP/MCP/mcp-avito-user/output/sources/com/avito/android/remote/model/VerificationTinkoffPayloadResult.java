package com.avito.android.remote.model;

import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: VerificationTinkoffPayloadResult.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/VerificationTinkoffPayloadResult;", "", "accessToken", "", "expiresIn", "", "id_token", "refreshToken", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getExpiresIn", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId_token", "getRefreshToken", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VerificationTinkoffPayloadResult {

    @c("access_token")
    @l
    private final String accessToken;

    @c("expires_in")
    @l
    private final Integer expiresIn;

    @c("id_token")
    @l
    private final String id_token;

    @c("refresh_token")
    @l
    private final String refreshToken;

    public VerificationTinkoffPayloadResult(@l String str, @l Integer num, @l String str2, @l String str3) {
        this.accessToken = str;
        this.expiresIn = num;
        this.id_token = str2;
        this.refreshToken = str3;
    }

    @l
    public final String getAccessToken() {
        return this.accessToken;
    }

    @l
    public final Integer getExpiresIn() {
        return this.expiresIn;
    }

    @l
    public final String getId_token() {
        return this.id_token;
    }

    @l
    public final String getRefreshToken() {
        return this.refreshToken;
    }
}
