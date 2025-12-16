package com.google.android.gms.common.internal;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
@RX0.a
/* renamed from: com.google.android.gms.common.internal.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36713l {

    /* renamed from: a, reason: collision with root package name */
    public final String f349447a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final String f349448b;

    @RX0.a
    public C36713l(@j.N String str, @j.P String str2) {
        C36729v.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f349447a = str;
        this.f349448b = (str2 == null || str2.length() <= 0) ? null : str2;
    }

    @RX0.a
    public final void a(@j.N String str) {
        if (Log.isLoggable(this.f349447a, 3)) {
            d(str);
        }
    }

    @RX0.a
    public final void b(@j.N String str) {
        if (Log.isLoggable(this.f349447a, 6)) {
            d(str);
        }
    }

    @RX0.a
    public final void c(@j.N String str) {
        if (Log.isLoggable(this.f349447a, 5)) {
            d(str);
        }
    }

    public final void d(String str) {
        String str2 = this.f349448b;
        if (str2 == null) {
            return;
        }
        str2.concat(str);
    }
}
