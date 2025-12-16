package ru.mts.biometry.api.entity.config;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IdentificationsConfigResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/mts/biometry/api/entity/config/IdentificationsConfigResponse;", "", "Lru/mts/biometry/api/entity/config/ApiIdentificationsConfig;", "bio", "Lru/mts/biometry/api/entity/config/ApiConfigSettings;", "settings", "Lru/mts/biometry/api/entity/config/ApiIdentificationOptions;", "identificationOptions", "<init>", "(Lru/mts/biometry/api/entity/config/ApiIdentificationsConfig;Lru/mts/biometry/api/entity/config/ApiConfigSettings;Lru/mts/biometry/api/entity/config/ApiIdentificationOptions;)V", "Lru/mts/biometry/api/entity/config/ApiIdentificationsConfig;", "a", "()Lru/mts/biometry/api/entity/config/ApiIdentificationsConfig;", "Lru/mts/biometry/api/entity/config/ApiConfigSettings;", "getSettings", "()Lru/mts/biometry/api/entity/config/ApiConfigSettings;", "Lru/mts/biometry/api/entity/config/ApiIdentificationOptions;", "b", "()Lru/mts/biometry/api/entity/config/ApiIdentificationOptions;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class IdentificationsConfigResponse {

    @c("bio")
    @l
    private final ApiIdentificationsConfig bio;

    @l
    private final ApiIdentificationOptions identificationOptions;

    @l
    private final ApiConfigSettings settings;

    public IdentificationsConfigResponse(@l ApiIdentificationsConfig apiIdentificationsConfig, @l ApiConfigSettings apiConfigSettings, @l ApiIdentificationOptions apiIdentificationOptions) {
        this.bio = apiIdentificationsConfig;
        this.settings = apiConfigSettings;
        this.identificationOptions = apiIdentificationOptions;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final ApiIdentificationsConfig getBio() {
        return this.bio;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final ApiIdentificationOptions getIdentificationOptions() {
        return this.identificationOptions;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentificationsConfigResponse)) {
            return false;
        }
        IdentificationsConfigResponse identificationsConfigResponse = (IdentificationsConfigResponse) obj;
        return L.f(this.bio, identificationsConfigResponse.bio) && L.f(this.settings, identificationsConfigResponse.settings) && L.f(this.identificationOptions, identificationsConfigResponse.identificationOptions);
    }

    public final int hashCode() {
        ApiIdentificationsConfig apiIdentificationsConfig = this.bio;
        int iHashCode = (apiIdentificationsConfig == null ? 0 : apiIdentificationsConfig.hashCode()) * 31;
        ApiConfigSettings apiConfigSettings = this.settings;
        int iHashCode2 = (iHashCode + (apiConfigSettings == null ? 0 : apiConfigSettings.hashCode())) * 31;
        ApiIdentificationOptions apiIdentificationOptions = this.identificationOptions;
        return iHashCode2 + (apiIdentificationOptions != null ? apiIdentificationOptions.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "IdentificationsConfigResponse(bio=" + this.bio + ", settings=" + this.settings + ", identificationOptions=" + this.identificationOptions + ')';
    }
}
