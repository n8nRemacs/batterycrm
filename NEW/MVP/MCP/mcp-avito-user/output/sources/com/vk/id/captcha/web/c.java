package com.vk.id.captcha.web;

import Y61.k;
import android.content.res.Configuration;
import android.net.Uri;
import com.avito.android.remote.model.text.FontStyleKt;

/* compiled from: UrlDecorator.kt */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    private final Configuration f366855a;

    public c(@k Configuration configuration) {
        this.f366855a = configuration;
    }

    @k
    public final String a(@k String str) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        int i12 = this.f366855a.uiMode & 48;
        String str2 = FontStyleKt.LIGHT;
        if (i12 != 16 && i12 == 32) {
            str2 = "dark";
        }
        return builderBuildUpon.appendQueryParameter("scheme", str2).build().toString();
    }
}
