package com.yandex.metrica.networktasks.api;

import androidx.appcompat.app.r;

/* loaded from: classes7.dex */
public class RetryPolicyConfig {

    /* renamed from: a, reason: collision with root package name */
    public final int f382439a;

    /* renamed from: b, reason: collision with root package name */
    public final int f382440b;

    public RetryPolicyConfig(int i12, int i13) {
        this.f382439a = i12;
        this.f382440b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetryPolicyConfig retryPolicyConfig = (RetryPolicyConfig) obj;
        return this.f382439a == retryPolicyConfig.f382439a && this.f382440b == retryPolicyConfig.f382440b;
    }

    public final int hashCode() {
        return (this.f382439a * 31) + this.f382440b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RetryPolicyConfig{maxIntervalSeconds=");
        sb2.append(this.f382439a);
        sb2.append(", exponentialMultiplier=");
        return r.t(sb2, this.f382440b, '}');
    }
}
