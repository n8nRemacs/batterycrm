package com.huawei.hms.support.api.client;

/* loaded from: classes7.dex */
public class SubAppInfo {

    /* renamed from: a, reason: collision with root package name */
    private String f363630a;

    public SubAppInfo(SubAppInfo subAppInfo) {
        if (subAppInfo != null) {
            this.f363630a = subAppInfo.getSubAppID();
        }
    }

    public String getSubAppID() {
        return this.f363630a;
    }

    public void setSubAppInfoID(String str) {
        this.f363630a = str;
    }

    public SubAppInfo(String str) {
        this.f363630a = str;
    }
}
