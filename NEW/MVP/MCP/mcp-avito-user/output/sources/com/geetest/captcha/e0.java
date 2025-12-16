package com.geetest.captcha;

import android.content.Context;

/* loaded from: classes4.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static String f342709a = "加载遇到一点麻烦";

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static String f342710b = "证书错误";

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static String f342711c = "参数不合法";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static String f342712d = "验证会话已取消";

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static String f342713e = "不支持的 WebView 组件";

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final e0 f342714f = new e0();

    public final void a(@Y61.k Context context) {
        Context applicationContext = context.getApplicationContext();
        g0 g0Var = g0.f342726a;
        f342709a = applicationContext.getString(g0Var.a(context, "gt4_web_callback_error"));
        context.getApplicationContext().getString(g0Var.a(context, "gt4_web_view_load_error"));
        f342710b = context.getApplicationContext().getString(g0Var.a(context, "gt4_web_view_ssl_error"));
        f342711c = context.getApplicationContext().getString(g0Var.a(context, "gt4_parameter_config_error"));
        f342712d = context.getApplicationContext().getString(g0Var.a(context, "gt4_user_cancel"));
        f342713e = context.getApplicationContext().getString(g0Var.a(context, "gt4_device_not_supported"));
    }
}
