package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
/* loaded from: classes6.dex */
public final class F0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f349315d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final String f349316a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public final String f349317b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f349318c;

    public F0(String str, boolean z12) {
        C36729v.f(str);
        this.f349316a = str;
        C36729v.f("com.google.android.gms");
        this.f349317b = "com.google.android.gms";
        this.f349318c = z12;
    }

    public final Intent a(Context context) {
        Bundle bundleCall;
        String str = this.f349316a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f349318c) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                bundleCall = context.getContentResolver().call(f349315d, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e12) {
                "Dynamic intent resolution failed: ".concat(e12.toString());
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str));
            }
        }
        return intent == null ? new Intent(str).setPackage(this.f349317b) : intent;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return C36727t.a(this.f349316a, f02.f349316a) && C36727t.a(this.f349317b, f02.f349317b) && C36727t.a(null, null) && this.f349318c == f02.f349318c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f349316a, this.f349317b, null, 4225, Boolean.valueOf(this.f349318c)});
    }

    public final String toString() {
        String str = this.f349316a;
        if (str != null) {
            return str;
        }
        C36729v.j(null);
        throw null;
    }
}
