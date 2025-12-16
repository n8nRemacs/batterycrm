package com.yandex.metrica.plugins;

import j.N;
import j.P;

/* loaded from: classes7.dex */
public class StackTraceItem {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final String f382477a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final String f382478b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final Integer f382479c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final Integer f382480d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final String f382481e;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        @P
        public String f382482a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public String f382483b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public Integer f382484c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public Integer f382485d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public String f382486e;

        @N
        public StackTraceItem build() {
            return new StackTraceItem(this.f382482a, this.f382483b, this.f382484c, this.f382485d, this.f382486e, null);
        }

        @N
        public Builder withClassName(@P String str) {
            this.f382482a = str;
            return this;
        }

        @N
        public Builder withColumn(@P Integer num) {
            this.f382485d = num;
            return this;
        }

        @N
        public Builder withFileName(@P String str) {
            this.f382483b = str;
            return this;
        }

        @N
        public Builder withLine(@P Integer num) {
            this.f382484c = num;
            return this;
        }

        @N
        public Builder withMethodName(@P String str) {
            this.f382486e = str;
            return this;
        }
    }

    public StackTraceItem(String str, String str2, Integer num, Integer num2, String str3, a aVar) {
        this.f382477a = str;
        this.f382478b = str2;
        this.f382479c = num;
        this.f382480d = num2;
        this.f382481e = str3;
    }

    @P
    public String getClassName() {
        return this.f382477a;
    }

    @P
    public Integer getColumn() {
        return this.f382480d;
    }

    @P
    public String getFileName() {
        return this.f382478b;
    }

    @P
    public Integer getLine() {
        return this.f382479c;
    }

    @P
    public String getMethodName() {
        return this.f382481e;
    }
}
