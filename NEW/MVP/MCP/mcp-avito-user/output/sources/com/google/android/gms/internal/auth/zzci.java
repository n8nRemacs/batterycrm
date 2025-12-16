package com.google.android.gms.internal.auth;

import I41.h;
import android.net.Uri;
import androidx.collection.o1;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzci {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f350048a;

    public zzci(o1 o1Var) {
        this.f350048a = o1Var;
    }

    @h
    public final String zza(@h Uri uri, @h String str, @h String str2, String str3) {
        o1 o1Var;
        if (uri != null) {
            o1Var = (o1) this.f350048a.get(uri.toString());
        } else {
            o1Var = null;
        }
        if (o1Var == null) {
            return null;
        }
        return (String) o1Var.get("".concat(str3));
    }
}
