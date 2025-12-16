package com.vk.id.captcha.web;

import Y61.k;
import Y61.l;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import kotlin.text.C43066x;

/* compiled from: UrlValidator.kt */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f366856a;

    /* renamed from: b, reason: collision with root package name */
    @k
    private final String f366857b;

    public d(boolean z12, @k String str) {
        this.f366856a = z12;
        this.f366857b = str;
    }

    public final boolean a(@l View view, @l Uri uri) {
        if (uri != null && this.f366856a && C43066x.h0(uri.toString(), this.f366857b, false)) {
            return false;
        }
        if (uri == null || view == null || !new a().a(uri.toString())) {
            return true;
        }
        try {
            view.getContext().startActivity(new Intent("android.intent.action.VIEW").setData(uri));
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
