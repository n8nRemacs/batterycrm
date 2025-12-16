package com.google.crypto.tink.jwt;

import AK.c;
import aZ0.InterfaceC19845a;
import aZ0.j;
import com.google.gson.JsonParseException;
import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.k;
import com.google.gson.m;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@j
/* loaded from: classes6.dex */
public final class RawJwt {
    private static final long MAX_TIMESTAMP_VALUE = 253402300799L;
    private final k payload;
    private final Optional<String> typeHeader;

    public static final class Builder {
        private final k payload;
        private Optional<String> typeHeader;
        private boolean withoutExpiration;

        private void setTimestampClaim(String str, Instant instant) {
            long epochSecond = instant.getEpochSecond();
            if (epochSecond > RawJwt.MAX_TIMESTAMP_VALUE || epochSecond < 0) {
                throw new IllegalArgumentException(c.k("timestamp of claim ", str, " is out of range"));
            }
            this.payload.t(str, new m(Long.valueOf(epochSecond)));
        }

        @InterfaceC19845a
        public Builder addAudience(String str) {
            f fVar;
            if (!JsonUtil.isValidString(str)) {
                throw new IllegalArgumentException("invalid string");
            }
            if (this.payload.f362194b.containsKey("aud")) {
                i iVarD = this.payload.D("aud");
                iVarD.getClass();
                if (!(iVarD instanceof f)) {
                    throw new IllegalArgumentException("addAudience can't be used together with setAudience");
                }
                fVar = iVarD.h();
            } else {
                fVar = new f();
            }
            fVar.v(str);
            this.payload.t("aud", fVar);
            return this;
        }

        @InterfaceC19845a
        public Builder addBooleanClaim(String str, boolean z12) {
            JwtNames.validate(str);
            this.payload.t(str, new m(Boolean.valueOf(z12)));
            return this;
        }

        @InterfaceC19845a
        public Builder addJsonArrayClaim(String str, String str2) {
            JwtNames.validate(str);
            this.payload.t(str, JsonUtil.parseJsonArray(str2));
            return this;
        }

        @InterfaceC19845a
        public Builder addJsonObjectClaim(String str, String str2) {
            JwtNames.validate(str);
            this.payload.t(str, JsonUtil.parseJson(str2));
            return this;
        }

        @InterfaceC19845a
        public Builder addNullClaim(String str) {
            JwtNames.validate(str);
            this.payload.t(str, com.google.gson.j.f362193b);
            return this;
        }

        @InterfaceC19845a
        public Builder addNumberClaim(String str, double d12) {
            JwtNames.validate(str);
            this.payload.t(str, new m(Double.valueOf(d12)));
            return this;
        }

        @InterfaceC19845a
        public Builder addStringClaim(String str, String str2) {
            if (!JsonUtil.isValidString(str2)) {
                throw new IllegalArgumentException();
            }
            JwtNames.validate(str);
            this.payload.t(str, new m(str2));
            return this;
        }

        public RawJwt build() {
            return new RawJwt(this);
        }

        @InterfaceC19845a
        public Builder setAudience(String str) {
            if (this.payload.f362194b.containsKey("aud")) {
                i iVarD = this.payload.D("aud");
                iVarD.getClass();
                if (iVarD instanceof f) {
                    throw new IllegalArgumentException("setAudience can't be used together with setAudiences or addAudience");
                }
            }
            if (!JsonUtil.isValidString(str)) {
                throw new IllegalArgumentException("invalid string");
            }
            this.payload.t("aud", new m(str));
            return this;
        }

        @InterfaceC19845a
        public Builder setAudiences(List<String> list) {
            if (this.payload.f362194b.containsKey("aud")) {
                i iVarD = this.payload.D("aud");
                iVarD.getClass();
                if (!(iVarD instanceof f)) {
                    throw new IllegalArgumentException("setAudiences can't be used together with setAudience");
                }
            }
            if (list.isEmpty()) {
                throw new IllegalArgumentException("audiences must not be empty");
            }
            f fVar = new f();
            for (String str : list) {
                if (!JsonUtil.isValidString(str)) {
                    throw new IllegalArgumentException("invalid string");
                }
                fVar.v(str);
            }
            this.payload.t("aud", fVar);
            return this;
        }

        @InterfaceC19845a
        public Builder setExpiration(Instant instant) {
            setTimestampClaim("exp", instant);
            return this;
        }

        @InterfaceC19845a
        public Builder setIssuedAt(Instant instant) {
            setTimestampClaim("iat", instant);
            return this;
        }

        @InterfaceC19845a
        public Builder setIssuer(String str) {
            if (!JsonUtil.isValidString(str)) {
                throw new IllegalArgumentException();
            }
            this.payload.t("iss", new m(str));
            return this;
        }

        @InterfaceC19845a
        public Builder setJwtId(String str) {
            if (!JsonUtil.isValidString(str)) {
                throw new IllegalArgumentException();
            }
            this.payload.t("jti", new m(str));
            return this;
        }

        @InterfaceC19845a
        public Builder setNotBefore(Instant instant) {
            setTimestampClaim("nbf", instant);
            return this;
        }

        @InterfaceC19845a
        public Builder setSubject(String str) {
            if (!JsonUtil.isValidString(str)) {
                throw new IllegalArgumentException();
            }
            this.payload.t("sub", new m(str));
            return this;
        }

        @InterfaceC19845a
        public Builder setTypeHeader(String str) {
            this.typeHeader = Optional.of(str);
            return this;
        }

        @InterfaceC19845a
        public Builder withoutExpiration() {
            this.withoutExpiration = true;
            return this;
        }

        private Builder() {
            this.typeHeader = Optional.empty();
            this.withoutExpiration = false;
            this.payload = new k();
        }
    }

    public static RawJwt fromJsonPayload(Optional<String> optional, String str) {
        return new RawJwt(optional, str);
    }

    private Instant getInstant(String str) throws JwtInvalidException {
        if (!this.payload.f362194b.containsKey(str)) {
            throw new JwtInvalidException(c.k("claim ", str, " does not exist"));
        }
        i iVarD = this.payload.D(str);
        iVarD.getClass();
        if (!(iVarD instanceof m) || !(this.payload.D(str).j().f362195b instanceof Number)) {
            throw new JwtInvalidException(c.k("claim ", str, " is not a timestamp"));
        }
        try {
            return Instant.ofEpochMilli((long) (this.payload.D(str).j().e() * 1000.0d));
        } catch (NumberFormatException e12) {
            throw new JwtInvalidException("claim " + str + " is not a timestamp: " + e12);
        }
    }

    private String getStringClaimInternal(String str) throws JwtInvalidException {
        if (!this.payload.f362194b.containsKey(str)) {
            throw new JwtInvalidException(c.k("claim ", str, " does not exist"));
        }
        i iVarD = this.payload.D(str);
        iVarD.getClass();
        if ((iVarD instanceof m) && (this.payload.D(str).j().f362195b instanceof String)) {
            return this.payload.D(str).s();
        }
        throw new JwtInvalidException(c.k("claim ", str, " is not a string"));
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    private void validateAudienceClaim() throws JwtInvalidException {
        if (this.payload.f362194b.containsKey("aud")) {
            i iVarD = this.payload.D("aud");
            iVarD.getClass();
            if (!((iVarD instanceof m) && (this.payload.D("aud").j().f362195b instanceof String)) && getAudiences().size() < 1) {
                throw new JwtInvalidException("invalid JWT payload: claim aud is present but empty.");
            }
        }
    }

    private void validateStringClaim(String str) throws JwtInvalidException {
        if (this.payload.f362194b.containsKey(str)) {
            i iVarD = this.payload.D(str);
            iVarD.getClass();
            if (!(iVarD instanceof m) || !(this.payload.D(str).j().f362195b instanceof String)) {
                throw new JwtInvalidException(c.k("invalid JWT payload: claim ", str, " is not a string."));
            }
        }
    }

    private void validateTimestampClaim(String str) throws JwtInvalidException {
        if (this.payload.f362194b.containsKey(str)) {
            i iVarD = this.payload.D(str);
            iVarD.getClass();
            if (!(iVarD instanceof m) || !(this.payload.D(str).j().f362195b instanceof Number)) {
                throw new JwtInvalidException(c.k("invalid JWT payload: claim ", str, " is not a number."));
            }
            double dE2 = this.payload.D(str).j().e();
            if (dE2 > 2.53402300799E11d || dE2 < 0.0d) {
                throw new JwtInvalidException(c.k("invalid JWT payload: claim ", str, " has an invalid timestamp"));
            }
        }
    }

    public Set<String> customClaimNames() {
        HashSet hashSet = new HashSet();
        for (String str : this.payload.f362194b.keySet()) {
            if (!JwtNames.isRegisteredName(str)) {
                hashSet.add(str);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public List<String> getAudiences() throws JwtInvalidException {
        if (!hasAudiences()) {
            throw new JwtInvalidException("claim aud does not exist");
        }
        i iVarD = this.payload.D("aud");
        iVarD.getClass();
        if (iVarD instanceof m) {
            if (iVarD.j().f362195b instanceof String) {
                return Collections.unmodifiableList(Arrays.asList(iVarD.s()));
            }
            throw new JwtInvalidException(String.format("invalid audience: got %s; want a string", iVarD));
        }
        if (!(iVarD instanceof f)) {
            throw new JwtInvalidException("claim aud is not a string or a JSON array");
        }
        f fVarH = iVarD.h();
        ArrayList arrayList = fVarH.f362000b;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            i iVarW = fVarH.w(i12);
            iVarW.getClass();
            if (!(iVarW instanceof m) || !(fVarH.w(i12).j().f362195b instanceof String)) {
                throw new JwtInvalidException(String.format("invalid audience: got %s; want a string", fVarH.w(i12)));
            }
            arrayList2.add(fVarH.w(i12).s());
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public Boolean getBooleanClaim(String str) throws JwtInvalidException {
        JwtNames.validate(str);
        if (!this.payload.f362194b.containsKey(str)) {
            throw new JwtInvalidException(c.k("claim ", str, " does not exist"));
        }
        i iVarD = this.payload.D(str);
        iVarD.getClass();
        if ((iVarD instanceof m) && (this.payload.D(str).j().f362195b instanceof Boolean)) {
            return Boolean.valueOf(this.payload.D(str).d());
        }
        throw new JwtInvalidException(c.k("claim ", str, " is not a boolean"));
    }

    public Instant getExpiration() {
        return getInstant("exp");
    }

    public Instant getIssuedAt() {
        return getInstant("iat");
    }

    public String getIssuer() {
        return getStringClaimInternal("iss");
    }

    public String getJsonArrayClaim(String str) throws JwtInvalidException {
        JwtNames.validate(str);
        if (!this.payload.f362194b.containsKey(str)) {
            throw new JwtInvalidException(c.k("claim ", str, " does not exist"));
        }
        i iVarD = this.payload.D(str);
        iVarD.getClass();
        if (iVarD instanceof f) {
            return this.payload.D(str).h().toString();
        }
        throw new JwtInvalidException(c.k("claim ", str, " is not a JSON array"));
    }

    public String getJsonObjectClaim(String str) throws JwtInvalidException {
        JwtNames.validate(str);
        if (!this.payload.f362194b.containsKey(str)) {
            throw new JwtInvalidException(c.k("claim ", str, " does not exist"));
        }
        i iVarD = this.payload.D(str);
        iVarD.getClass();
        if (iVarD instanceof k) {
            return this.payload.D(str).i().toString();
        }
        throw new JwtInvalidException(c.k("claim ", str, " is not a JSON object"));
    }

    public String getJsonPayload() {
        return this.payload.toString();
    }

    public String getJwtId() {
        return getStringClaimInternal("jti");
    }

    public Instant getNotBefore() {
        return getInstant("nbf");
    }

    public Double getNumberClaim(String str) throws JwtInvalidException {
        JwtNames.validate(str);
        if (!this.payload.f362194b.containsKey(str)) {
            throw new JwtInvalidException(c.k("claim ", str, " does not exist"));
        }
        i iVarD = this.payload.D(str);
        iVarD.getClass();
        if ((iVarD instanceof m) && (this.payload.D(str).j().f362195b instanceof Number)) {
            return Double.valueOf(this.payload.D(str).e());
        }
        throw new JwtInvalidException(c.k("claim ", str, " is not a number"));
    }

    public String getStringClaim(String str) {
        JwtNames.validate(str);
        return getStringClaimInternal(str);
    }

    public String getSubject() {
        return getStringClaimInternal("sub");
    }

    public String getTypeHeader() throws JwtInvalidException {
        if (this.typeHeader.isPresent()) {
            return this.typeHeader.get();
        }
        throw new JwtInvalidException("type header is not set");
    }

    public boolean hasAudiences() {
        return this.payload.f362194b.containsKey("aud");
    }

    public boolean hasBooleanClaim(String str) {
        JwtNames.validate(str);
        if (this.payload.f362194b.containsKey(str)) {
            i iVarD = this.payload.D(str);
            iVarD.getClass();
            if ((iVarD instanceof m) && (this.payload.D(str).j().f362195b instanceof Boolean)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasExpiration() {
        return this.payload.f362194b.containsKey("exp");
    }

    public boolean hasIssuedAt() {
        return this.payload.f362194b.containsKey("iat");
    }

    public boolean hasIssuer() {
        return this.payload.f362194b.containsKey("iss");
    }

    public boolean hasJsonArrayClaim(String str) {
        JwtNames.validate(str);
        if (this.payload.f362194b.containsKey(str)) {
            i iVarD = this.payload.D(str);
            iVarD.getClass();
            if (iVarD instanceof f) {
                return true;
            }
        }
        return false;
    }

    public boolean hasJsonObjectClaim(String str) {
        JwtNames.validate(str);
        if (this.payload.f362194b.containsKey(str)) {
            i iVarD = this.payload.D(str);
            iVarD.getClass();
            if (iVarD instanceof k) {
                return true;
            }
        }
        return false;
    }

    public boolean hasJwtId() {
        return this.payload.f362194b.containsKey("jti");
    }

    public boolean hasNotBefore() {
        return this.payload.f362194b.containsKey("nbf");
    }

    public boolean hasNumberClaim(String str) {
        JwtNames.validate(str);
        if (this.payload.f362194b.containsKey(str)) {
            i iVarD = this.payload.D(str);
            iVarD.getClass();
            if ((iVarD instanceof m) && (this.payload.D(str).j().f362195b instanceof Number)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasStringClaim(String str) {
        JwtNames.validate(str);
        if (this.payload.f362194b.containsKey(str)) {
            i iVarD = this.payload.D(str);
            iVarD.getClass();
            if ((iVarD instanceof m) && (this.payload.D(str).j().f362195b instanceof String)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasSubject() {
        return this.payload.f362194b.containsKey("sub");
    }

    public boolean hasTypeHeader() {
        return this.typeHeader.isPresent();
    }

    public boolean isNullClaim(String str) {
        JwtNames.validate(str);
        try {
            return com.google.gson.j.f362193b.equals(this.payload.D(str));
        } catch (JsonParseException unused) {
            return false;
        }
    }

    public String toString() {
        k kVar = new k();
        if (this.typeHeader.isPresent()) {
            kVar.t("typ", new m(this.typeHeader.get()));
        }
        return kVar + "." + this.payload;
    }

    private RawJwt(Builder builder) {
        if (!builder.payload.f362194b.containsKey("exp") && !builder.withoutExpiration) {
            throw new IllegalArgumentException("neither setExpiration() nor withoutExpiration() was called");
        }
        if (builder.payload.f362194b.containsKey("exp") && builder.withoutExpiration) {
            throw new IllegalArgumentException("setExpiration() and withoutExpiration() must not be called together");
        }
        this.typeHeader = builder.typeHeader;
        this.payload = builder.payload.b();
    }

    private RawJwt(Optional<String> optional, String str) throws JwtInvalidException {
        this.typeHeader = optional;
        this.payload = JsonUtil.parseJson(str);
        validateStringClaim("iss");
        validateStringClaim("sub");
        validateStringClaim("jti");
        validateTimestampClaim("exp");
        validateTimestampClaim("nbf");
        validateTimestampClaim("iat");
        validateAudienceClaim();
    }
}
