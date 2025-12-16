package com.geetest.gtc4;

import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class GeeGuardConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final String f342804a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f342805b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f342806c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap<String, Object> f342807d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<String, JSONObject> f342808e;

    /* renamed from: f, reason: collision with root package name */
    public final int f342809f;

    /* renamed from: g, reason: collision with root package name */
    public final String f342810g;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public String f342811a = null;

        /* renamed from: b, reason: collision with root package name */
        public boolean f342812b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f342813c = true;

        /* renamed from: d, reason: collision with root package name */
        public HashMap<String, Object> f342814d = null;

        /* renamed from: e, reason: collision with root package name */
        public HashMap<String, JSONObject> f342815e = null;

        /* renamed from: f, reason: collision with root package name */
        public int f342816f = 1;

        /* renamed from: g, reason: collision with root package name */
        public String f342817g = null;

        public Builder addSignature(String str) {
            this.f342817g = str;
            return this;
        }

        public GeeGuardConfiguration build() {
            return new GeeGuardConfiguration(this);
        }

        public Builder setAlInfo(boolean z12) {
            this.f342812b = z12;
            return this;
        }

        public Builder setAppId(String str) {
            this.f342811a = str;
            return this;
        }

        public Builder setDevInfo(boolean z12) {
            this.f342813c = z12;
            return this;
        }

        public Builder setExtraInfo(HashMap<String, JSONObject> map) {
            this.f342815e = map;
            return this;
        }

        public Builder setLevel(int i12) {
            this.f342816f = i12;
            return this;
        }

        public Builder setOuterInfo(HashMap<String, Object> map) {
            this.f342814d = map;
            return this;
        }
    }

    public String getAppId() {
        return this.f342804a;
    }

    public String getContent() {
        return this.f342810g;
    }

    public HashMap<String, JSONObject> getExtraInfo() {
        return this.f342808e;
    }

    public int getLevel() {
        return this.f342809f;
    }

    public HashMap<String, Object> getOuterInfo() {
        return this.f342807d;
    }

    public boolean isAlInfo() {
        return this.f342805b;
    }

    public boolean isDevInfo() {
        return this.f342806c;
    }

    private GeeGuardConfiguration(Builder builder) {
        this.f342804a = builder.f342811a;
        this.f342805b = builder.f342812b;
        this.f342806c = builder.f342813c;
        this.f342807d = builder.f342814d;
        this.f342808e = builder.f342815e;
        this.f342809f = builder.f342816f;
        this.f342810g = builder.f342817g;
    }
}
