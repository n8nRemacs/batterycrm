package com.geetest.captcha;

import com.geetest.captcha.GTCaptcha4Client;
import java.util.Map;

/* loaded from: classes4.dex */
public class GTCaptcha4Config implements NoProguard {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f342664a;

    /* renamed from: b, reason: collision with root package name */
    public final String f342665b;

    /* renamed from: c, reason: collision with root package name */
    public final String f342666c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f342667d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f342668e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, Object> f342669f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f342670g;

    /* renamed from: h, reason: collision with root package name */
    public final int f342671h;

    /* renamed from: i, reason: collision with root package name */
    public final int f342672i;

    /* renamed from: j, reason: collision with root package name */
    public final String f342673j;

    /* renamed from: k, reason: collision with root package name */
    public final GTCaptcha4Client.OnDialogShowListener f342674k;

    public static class Builder implements NoProguard {

        /* renamed from: d, reason: collision with root package name */
        public String[] f342678d;

        /* renamed from: e, reason: collision with root package name */
        public String[] f342679e;

        /* renamed from: a, reason: collision with root package name */
        public boolean f342675a = false;

        /* renamed from: b, reason: collision with root package name */
        public String f342676b = null;

        /* renamed from: c, reason: collision with root package name */
        public String f342677c = "file:///android_asset/gt4-index.html";

        /* renamed from: f, reason: collision with root package name */
        public Map<String, Object> f342680f = null;

        /* renamed from: g, reason: collision with root package name */
        public boolean f342681g = true;

        /* renamed from: h, reason: collision with root package name */
        public int f342682h = 10000;

        /* renamed from: i, reason: collision with root package name */
        public int f342683i = 0;

        /* renamed from: j, reason: collision with root package name */
        public String f342684j = null;

        /* renamed from: k, reason: collision with root package name */
        public GTCaptcha4Client.OnDialogShowListener f342685k = null;

        public GTCaptcha4Config build() {
            return new GTCaptcha4Config(this);
        }

        public void setApiServers(String[] strArr) {
            this.f342678d = strArr;
        }

        public Builder setBackgroundColor(int i12) {
            this.f342683i = i12;
            return this;
        }

        public Builder setCanceledOnTouchOutside(boolean z12) {
            this.f342681g = z12;
            return this;
        }

        public Builder setDebug(boolean z12) {
            this.f342675a = z12;
            return this;
        }

        public void setDialogShowListener(GTCaptcha4Client.OnDialogShowListener onDialogShowListener) {
            this.f342685k = onDialogShowListener;
        }

        public Builder setDialogStyle(String str) {
            this.f342684j = str;
            return this;
        }

        public Builder setLanguage(String str) {
            this.f342676b = str;
            return this;
        }

        public Builder setParams(Map<String, Object> map) {
            this.f342680f = map;
            return this;
        }

        public Builder setResourcePath(String str) {
            this.f342677c = str;
            return this;
        }

        public void setStaticServers(String[] strArr) {
            this.f342679e = strArr;
        }

        public Builder setTimeOut(int i12) {
            this.f342682h = i12;
            return this;
        }
    }

    public String[] getApiServers() {
        return this.f342667d;
    }

    public int getBackgroundColor() {
        return this.f342672i;
    }

    public GTCaptcha4Client.OnDialogShowListener getDialogShowListener() {
        return this.f342674k;
    }

    public String getDialogStyle() {
        return this.f342673j;
    }

    public String getHtml() {
        return this.f342666c;
    }

    public String getLanguage() {
        return this.f342665b;
    }

    public Map<String, Object> getParams() {
        return this.f342669f;
    }

    public String[] getStaticServers() {
        return this.f342668e;
    }

    public int getTimeOut() {
        return this.f342671h;
    }

    public boolean isCanceledOnTouchOutside() {
        return this.f342670g;
    }

    public boolean isDebug() {
        return this.f342664a;
    }

    public GTCaptcha4Config(Builder builder) {
        this.f342664a = builder.f342675a;
        this.f342665b = builder.f342676b;
        this.f342666c = builder.f342677c;
        this.f342669f = builder.f342680f;
        this.f342670g = builder.f342681g;
        this.f342671h = builder.f342682h;
        this.f342672i = builder.f342683i;
        this.f342673j = builder.f342684j;
        this.f342674k = builder.f342685k;
        this.f342667d = builder.f342678d;
        this.f342668e = builder.f342679e;
    }
}
