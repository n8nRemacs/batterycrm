package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.collection.C20199a;
import j.B;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes6.dex */
public final class zzcr {

    /* renamed from: a, reason: collision with root package name */
    @B
    public static final C20199a f350055a = new C20199a();

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized Uri zza(String str) {
        C20199a c20199a = f350055a;
        Uri uri = (Uri) c20199a.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        c20199a.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
