package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.collection.C20199a;
import j.B;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzgs {

    /* renamed from: a, reason: collision with root package name */
    @B
    public static final C20199a<String, Uri> f350806a = new C20199a<>();

    public static synchronized Uri zza(String str) {
        Uri uri;
        C20199a<String, Uri> c20199a = f350806a;
        uri = c20199a.get(str);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            c20199a.put(str, uri);
        }
        return uri;
    }

    public static String zza(Context context, String str) {
        if (!str.contains("#")) {
            return r.r(str, "#", context.getPackageName());
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(str));
    }

    public static boolean zza(String str, String str2) {
        if (str.equals("eng") || str.equals("userdebug")) {
            return str2.contains("dev-keys") || str2.contains("test-keys");
        }
        return false;
    }
}
