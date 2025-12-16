package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.avito.android.R;
import com.google.android.gms.common.internal.C36729v;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes6.dex */
public final class B2 {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f354535a;

    /* renamed from: b, reason: collision with root package name */
    public final String f354536b;

    public B2(Context context, @j.P String str) {
        C36729v.j(context);
        this.f354535a = context.getResources();
        if (TextUtils.isEmpty(str)) {
            this.f354536b = a(context);
        } else {
            this.f354536b = str;
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    @j.P
    public final String b(String str) {
        Resources resources = this.f354535a;
        int identifier = resources.getIdentifier(str, "string", this.f354536b);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
