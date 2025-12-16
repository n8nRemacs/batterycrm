package com.geetest.captcha;

/* loaded from: classes4.dex */
public enum d0 {
    WEB_VIEW_NEW("0"),
    PARAM("1"),
    WEB_VIEW_HTTP("2"),
    WEB_VIEW_SSL("3"),
    USER_ERROR("4"),
    WEB_CALLBACK_ERROR("5"),
    NET("6");


    @Y61.k
    public String type;

    d0(String str) {
        this.type = str;
    }

    @Y61.k
    public final String getType() {
        return this.type;
    }

    public final void setType(@Y61.k String str) {
        this.type = str;
    }
}
