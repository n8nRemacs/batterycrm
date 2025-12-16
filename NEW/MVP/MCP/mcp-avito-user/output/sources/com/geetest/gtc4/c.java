package com.geetest.gtc4;

import android.content.Context;
import com.vk.id.captcha.web.h;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public String f342848a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f342849a = new c();
    }

    public void a(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        this.f342848a = str;
        new Thread(new h(27, this, context)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        String str = this.f342848a;
        if (str == null || str.isEmpty()) {
            return;
        }
        b.a(context, this.f342848a, null, 5000, null);
    }
}
